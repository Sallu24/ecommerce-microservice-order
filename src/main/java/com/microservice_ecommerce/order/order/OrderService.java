package com.microservice_ecommerce.order.order;

import com.microservice_ecommerce.order.order.clients.ProductClient;
import com.microservice_ecommerce.order.order.clients.UserClient;
import com.microservice_ecommerce.order.order.external.Product;
import com.microservice_ecommerce.order.order.external.User;
import com.microservice_ecommerce.order.order.mapper.OrderMapper;
import com.microservice_ecommerce.order.order.mapper.OrderProductMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderService {

    private final UserClient userClient;
    protected OrderRepository orderRepository;

    protected ProductClient productClient;

    public OrderService(OrderRepository orderRepository, ProductClient productClient, UserClient userClient) {
        this.orderRepository = orderRepository;
        this.productClient = productClient;
        this.userClient = userClient;
    }

    protected ResponseEntity<List<OrderResponse>> findAll() {
        List<Order> orders = orderRepository.findAll();
        List<OrderResponse> orderResponses = orders.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());

        return ResponseEntity.ok(orderResponses);
    }

    private OrderResponse convertToDTO(Order order) {
        List<OrderProductResponse> orderProductResponses = new ArrayList<>();
        List<OrderProduct> orderProducts = order.getOrderProducts();

        if (orderProducts != null && !orderProducts.isEmpty()) {
            orderProductResponses = orderProducts.stream()
                    .map(orderProduct -> {
                        Product product = productClient.getProduct(orderProduct.getProductId());

                        if (product != null) {
                            return OrderProductMapper.orderProductResponse(orderProduct, product);
                        }

                        return null;
                    })
                    .toList();
        }

        if (order.getCustomerId() != null) {
            User user = userClient.getUser(order.getCustomerId());

            return OrderMapper.orderResponse(order, user, orderProductResponses);
        }

        return OrderMapper.orderResponse(order, null, orderProductResponses);
    }

}

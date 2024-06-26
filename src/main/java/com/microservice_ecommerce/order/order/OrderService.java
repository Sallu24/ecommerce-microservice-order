package com.microservice_ecommerce.order.order;

import com.microservice_ecommerce.order.order.mapper.OrderMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderService {

    protected OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    protected ResponseEntity<List<OrderResponse>> findAll() {
        List<Order> orders = orderRepository.findAll();
        List<OrderResponse> orderResponses = orders.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());

        return ResponseEntity.ok(orderResponses);
    }

    private OrderResponse convertToDTO(Order order) {
//        List<Category> categories = new ArrayList<>();

//        List<CategoryProduct> categoryProducts = product.getCategoryProducts();

//        if (categoryProducts != null && !categoryProducts.isEmpty()) {
//            categories = categoryProducts.stream()
//                    .map(categoryProduct -> {
//                        Category category = categoryClient.getCategory(categoryProduct.getCategoryId());
//
//                        if (category != null) {
//                            return new Category(category.getId(), category.getName());
//                        }
//
//                        return null;
//                    })
//                    .toList();
//        }

//        if (product.getBrandId() != null) {
//            Brand brand = brandClient.getBrand(product.getBrandId());
//
//            return ProductMapper.productResponse(product, brand, categories);
//        }

        return OrderMapper.orderResponse(order);
    }

}

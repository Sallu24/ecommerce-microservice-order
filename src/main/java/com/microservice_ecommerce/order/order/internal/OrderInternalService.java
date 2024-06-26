package com.microservice_ecommerce.order.order.internal;

import com.microservice_ecommerce.order.order.*;
import com.microservice_ecommerce.order.order.external.CartItem;
import com.microservice_ecommerce.order.order.internal.dto.BillingDTO;
import com.microservice_ecommerce.order.order.internal.dto.OrderDTO;
import com.microservice_ecommerce.order.order.internal.dto.ShippingDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderInternalService {

    protected OrderRepository orderRepository;

    protected OrderProductRepository orderProductRepository;

    protected OrderShippingRepository orderShippingRepository;

    protected OrderBillingRepository orderBillingRepository;

    public OrderInternalService(
            OrderRepository orderRepository,
            OrderProductRepository orderProductRepository,
            OrderShippingRepository orderShippingRepository,
            OrderBillingRepository orderBillingRepository
    ) {
        this.orderRepository = orderRepository;
        this.orderProductRepository = orderProductRepository;
        this.orderShippingRepository = orderShippingRepository;
        this.orderBillingRepository = orderBillingRepository;
    }

    protected void createOrder(OrderDTO orderDTO) {
        Order order = saveOrder(orderDTO);
        createOrderItems(order, orderDTO.getCart().getCartItems());
        createOrderShipping(order, orderDTO.getCheckout().getShipping());
        createOrderBilling(order, orderDTO.getCheckout().getBilling());
    }

    private Order saveOrder(OrderDTO orderDTO) {
        Order order = new Order();
        order.setCustomerId(1L);
        order.setCustomerEmail(orderDTO.getCheckout().getCustomer_email());
        order.setCustomerPhone(orderDTO.getCheckout().getCustomer_phone());

        order.setSubTotal(orderDTO.getCart().getTotal());

        order.setShippingMethod(null);
        order.setShippingCost(null);
        order.setCouponId(null);
        order.setDiscountId(null);

        order.setInvoiceNumber(getMaxInvoiceNumber());

        order.setTotal(orderDTO.getCart().getTotal());
        order.setPaymentMethod(orderDTO.getCheckout().getPayment_method());

        order.setCurrency(null);
        order.setCurrencyRate(null);

        order.setStatus(OrderStatus.CREATED);

        order.setNote(null);

        orderRepository.save(order);

        return order;
    }

    private void createOrderItems(Order order, List<CartItem> cartItems) {
        for (CartItem cartItem : cartItems) {
            OrderProduct orderProduct = new OrderProduct();
            orderProduct.setOrder(order);
            orderProduct.setProductId(cartItem.getProduct().getId());
            orderProduct.setUnitPrice(cartItem.getPrice());
            orderProduct.setQty(cartItem.getQty());
            orderProduct.setLineTotal(cartItem.getPrice() * cartItem.getQty());
            orderProductRepository.save(orderProduct);
        }
    }

    private void createOrderShipping(Order order, ShippingDTO shippingDTO) {
        OrderShipping orderShipping = new OrderShipping();
        orderShipping.setOrder(order);
        orderShipping.setCustomerShippingFirstName(shippingDTO.getFirst_name());
        orderShipping.setCustomerShippingLastName(shippingDTO.getLast_name());
        orderShipping.setCustomerShippingAddress(shippingDTO.getAddress());
        orderShipping.setCustomerShippingCity(shippingDTO.getCity());
        orderShipping.setCustomerShippingZip(shippingDTO.getZip());
        orderShipping.setCustomerShippingState(shippingDTO.getState());
        orderShipping.setCustomerShippingCountry(shippingDTO.getCountry());
        orderShippingRepository.save(orderShipping);
    }

    private void createOrderBilling(Order order, BillingDTO billingDTO) {
        OrderBilling orderBilling = new OrderBilling();
        orderBilling.setOrder(order);
        orderBilling.setCustomerBillingFirstName(billingDTO.getFirst_name());
        orderBilling.setCustomerBillingLastName(billingDTO.getLast_name());
        orderBilling.setCustomerBillingAddress(billingDTO.getAddress());
        orderBilling.setCustomerBillingCity(billingDTO.getCity());
        orderBilling.setCustomerBillingZip(billingDTO.getZip());
        orderBilling.setCustomerBillingState(billingDTO.getState());
        orderBilling.setCustomerBillingCountry(billingDTO.getCountry());
        orderBillingRepository.save(orderBilling);
    }

    private Long getMaxInvoiceNumber() {
        Long maxInvoiceNumber = orderRepository.findMaxInvoiceNumber();

        return (maxInvoiceNumber != null) ? (maxInvoiceNumber + 1) : 1;
    }

}

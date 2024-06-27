package com.microservice_ecommerce.order.order.mapper;

import com.microservice_ecommerce.order.order.Order;
import com.microservice_ecommerce.order.order.OrderProductResponse;
import com.microservice_ecommerce.order.order.OrderResponse;
import com.microservice_ecommerce.order.order.external.User;

import java.util.List;

public class OrderMapper {

    public static OrderResponse orderResponse(Order order, User user, List<OrderProductResponse> orderProductResponses) {
        OrderResponse orderResponse = new OrderResponse();
        orderResponse.setId(order.getId());
        orderResponse.setCustomerEmail(order.getCustomerEmail());
        orderResponse.setCustomerPhone(order.getCustomerPhone());
        orderResponse.setSubTotal(order.getSubTotal());
        orderResponse.setShippingMethod(order.getShippingMethod());
        orderResponse.setShippingCost(order.getShippingCost());
        orderResponse.setCouponId(order.getCouponId());
        orderResponse.setDiscountId(order.getDiscountId());
        orderResponse.setInvoiceNumber(order.getInvoiceNumber());
        orderResponse.setTotal(order.getTotal());
        orderResponse.setPaymentMethod(order.getPaymentMethod());
        orderResponse.setCurrency(order.getCurrency());
        orderResponse.setCurrencyRate(order.getCurrencyRate());
        orderResponse.setStatus(order.getStatus());
        orderResponse.setNote(order.getNote());
        orderResponse.setCreatedAt(order.getCreatedAt());
        orderResponse.setUpdatedAt(order.getUpdatedAt());

        orderResponse.setOrderProducts(orderProductResponses);
        orderResponse.setCustomer(user);

        return orderResponse;
    }
}

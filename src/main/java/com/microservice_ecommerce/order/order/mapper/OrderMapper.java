package com.microservice_ecommerce.order.order.mapper;

import com.microservice_ecommerce.order.order.Order;
import com.microservice_ecommerce.order.order.OrderResponse;

public class OrderMapper {

    public static OrderResponse orderResponse(Order order) {
        OrderResponse orderResponse = new OrderResponse();
        orderResponse.setId(order.getId());
//        productResponse.setName(product.getName());
//        productResponse.setPrice(product.getPrice());
//        productResponse.setSku(product.getSku());
//        productResponse.setQty(product.getQty());
//        productResponse.setInStock(product.getInStock());
//        productResponse.setBrand(brand);
//        productResponse.setCategories(category);

        return orderResponse;
    }
}

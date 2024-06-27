package com.microservice_ecommerce.order.order.mapper;

import com.microservice_ecommerce.order.order.OrderProduct;
import com.microservice_ecommerce.order.order.OrderProductResponse;
import com.microservice_ecommerce.order.order.external.Product;

public class OrderProductMapper {

    public static OrderProductResponse orderProductResponse(OrderProduct orderProduct, Product product) {
        OrderProductResponse orderProductResponse = new OrderProductResponse();
        orderProductResponse.setId(orderProduct.getId());
        orderProductResponse.setProduct(product);
        orderProductResponse.setUnitPrice(orderProduct.getUnitPrice());
        orderProductResponse.setQty(orderProduct.getQty());
        orderProductResponse.setLineTotal(orderProduct.getLineTotal());

        return orderProductResponse;
    }

}

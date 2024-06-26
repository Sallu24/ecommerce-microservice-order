package com.microservice_ecommerce.order.order.external;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
public class CartItem {

    protected Long id;

    private Product product;

    private Integer qty;

    private Double price;

    private Date createdAt;

    private Date updatedAt;

}

package com.microservice_ecommerce.order.order.external;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
public class Cart {

    protected Long id;

    Long userId;

    private Double total;

    private List<CartItem> cartItems;

    private Date createdAt;

    private Date updatedAt;

}

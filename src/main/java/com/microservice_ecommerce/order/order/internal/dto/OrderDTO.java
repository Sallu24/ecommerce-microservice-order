package com.microservice_ecommerce.order.order.internal.dto;

import com.microservice_ecommerce.order.order.external.Cart;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class OrderDTO {

    private Cart cart;

    private CheckoutDTO checkout;

}

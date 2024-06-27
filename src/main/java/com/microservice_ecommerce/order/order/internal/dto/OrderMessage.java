package com.microservice_ecommerce.order.order.internal.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class OrderMessage {

    private Long id;

    private Long userId;

    private Long cartId;

}

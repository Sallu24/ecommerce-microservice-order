package com.microservice_ecommerce.order.order.internal.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class CheckoutDTO {

    private String customer_email;

    private String customer_phone;

    private BillingDTO billing;

    private Boolean ship_to_different_address;

    private ShippingDTO shipping;

    private String payment_method;

}

package com.microservice_ecommerce.order.order.external;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Product {

    private Long id;

    private String name;

    private Double price;

    private String sku;

    private Integer qty;

    private Boolean inStock;

}

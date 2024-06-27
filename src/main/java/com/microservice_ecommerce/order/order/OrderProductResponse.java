package com.microservice_ecommerce.order.order;

import com.microservice_ecommerce.order.order.external.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class OrderProductResponse {

    protected Long id;

    private Product product;

    private Double unitPrice;

    private Integer qty;

    private Double lineTotal;

}

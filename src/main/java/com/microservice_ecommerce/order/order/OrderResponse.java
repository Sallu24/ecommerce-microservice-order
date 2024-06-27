package com.microservice_ecommerce.order.order;

import com.microservice_ecommerce.order.order.external.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class OrderResponse {

    private Long id;

    private User customer;

    private String customerEmail;

    private String customerPhone;

    private Double subTotal;

    private String shippingMethod;

    private Float shippingCost;

    private Long couponId;

    private Long discountId;

    private Long invoiceNumber;

    private Double total;

    private String paymentMethod;

    private String currency;

    private Float currencyRate;

    private OrderStatus status;

    private String note;

    private Date createdAt;

    private Date updatedAt;

    private List<OrderProductResponse> orderProducts;

}

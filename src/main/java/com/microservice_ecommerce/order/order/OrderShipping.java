package com.microservice_ecommerce.order.order;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "order_shipping")
public class OrderShipping {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id", referencedColumnName = "id")
    private Order order;

    @Column(name = "customer_shipping_first_name")
    private String customerShippingFirstName;

    @Column(name = "customer_shipping_last_name")
    private String customerShippingLastName;

    @Column(name = "customer_shipping_address")
    private String customerShippingAddress;

    @Column(name = "customer_shipping_city")
    private String customerShippingCity;

    @Column(name = "customer_shipping_state")
    private String customerShippingState;

    @Column(name = "customer_shipping_zip")
    private String customerShippingZip;

    @Column(name = "customer_shipping_country")
    private String customerShippingCountry;

}

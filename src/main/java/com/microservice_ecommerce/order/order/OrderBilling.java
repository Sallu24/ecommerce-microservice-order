package com.microservice_ecommerce.order.order;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "order_billing")
public class OrderBilling {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id", referencedColumnName = "id")
    private Order order;

    @Column(name = "customer_billing_first_name")
    private String customerBillingFirstName;

    @Column(name = "customer_billing_last_name")
    private String customerBillingLastName;

    @Column(name = "customer_billing_address")
    private String customerBillingAddress;

    @Column(name = "customer_billing_city")
    private String customerBillingCity;

    @Column(name = "customer_billing_state")
    private String customerBillingState;

    @Column(name = "customer_billing_zip")
    private String customerBillingZip;

    @Column(name = "customer_billing_country")
    private String customerBillingCountry;

}

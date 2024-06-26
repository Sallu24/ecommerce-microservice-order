package com.microservice_ecommerce.order.order;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "customer_id")
    private Long customerId;

    @Column(name = "customer_email")
    private String customerEmail;

    @Column(name = "customer_phone")
    private String customerPhone;

    @Column(name = "sub_total")
    private Double subTotal;

    @Column(name = "shipping_method")
    private String shippingMethod;

    @Column(name = "shipping_cost")
    private Float shippingCost;

    @Column(name = "coupon_id")
    private Long couponId;

    @Column(name = "discount_id")
    private Long discountId;

    @Column(name = "invoice_number", unique = true)
    private Long invoiceNumber;

    @Column(name = "total")
    private Double total;

    @Column(name = "payment_method")
    private String paymentMethod;

    private String currency;

    @Column(name = "currency_rate")
    private Float currencyRate;

    @Enumerated(EnumType.STRING)
    private OrderStatus status;

    private String note;

    @Column(name = "created_at", updatable = false)
    @CreationTimestamp
    private Date createdAt;

    @Column(name = "updated_at")
    @UpdateTimestamp
    private Date updatedAt;

    @OneToOne(mappedBy = "order", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private OrderBilling orderBilling;

    @OneToOne(mappedBy = "order", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private OrderShipping orderShipping;

    @OneToMany(mappedBy = "order", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<OrderProduct> orderProducts;

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", customerId=" + customerId +
                ", customerEmail='" + customerEmail + '\'' +
                ", customerPhone='" + customerPhone + '\'' +
                ", subTotal=" + subTotal +
                ", shippingMethod='" + shippingMethod + '\'' +
                ", shippingCost=" + shippingCost +
                ", couponId=" + couponId +
                ", discountId=" + discountId +
                ", invoiceNumber=" + invoiceNumber +
                ", total=" + total +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", currency='" + currency + '\'' +
                ", currencyRate=" + currencyRate +
                ", status=" + status +
                ", note='" + note + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", orderBilling=" + orderBilling +
                ", orderShipping=" + orderShipping +
                ", orderProducts=" + orderProducts +
                '}';
    }

}

package com.microservice_ecommerce.order.order;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;
import java.util.List;

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
    private Float subTotal;

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
    private Float total;

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

    public Order(
            Long id,
            Long customerId,
            String customerEmail,
            String customerPhone,
            Float subTotal,
            String shippingMethod,
            Float shippingCost,
            Long couponId,
            Long discountId,
            Long invoiceNumber,
            Float total,
            String paymentMethod,
            String currency,
            Float currencyRate,
            OrderStatus status,
            String note,
            Date createdAt,
            Date updatedAt,
            OrderBilling orderBilling,
            OrderShipping orderShipping,
            List<OrderProduct> orderProducts
    ) {
        this.id = id;
        this.customerId = customerId;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
        this.subTotal = subTotal;
        this.shippingMethod = shippingMethod;
        this.shippingCost = shippingCost;
        this.couponId = couponId;
        this.discountId = discountId;
        this.invoiceNumber = invoiceNumber;
        this.total = total;
        this.paymentMethod = paymentMethod;
        this.currency = currency;
        this.currencyRate = currencyRate;
        this.status = status;
        this.note = note;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.orderBilling = orderBilling;
        this.orderShipping = orderShipping;
        this.orderProducts = orderProducts;
    }

    public Order() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public Float getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(Float subTotal) {
        this.subTotal = subTotal;
    }

    public String getShippingMethod() {
        return shippingMethod;
    }

    public void setShippingMethod(String shippingMethod) {
        this.shippingMethod = shippingMethod;
    }

    public Float getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(Float shippingCost) {
        this.shippingCost = shippingCost;
    }

    public Long getCouponId() {
        return couponId;
    }

    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }

    public Long getDiscountId() {
        return discountId;
    }

    public void setDiscountId(Long discountId) {
        this.discountId = discountId;
    }

    public Long getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(Long invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Float getCurrencyRate() {
        return currencyRate;
    }

    public void setCurrencyRate(Float currencyRate) {
        this.currencyRate = currencyRate;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public OrderBilling getOrderBilling() {
        return orderBilling;
    }

    public void setOrderBilling(OrderBilling orderBilling) {
        this.orderBilling = orderBilling;
    }

    public OrderShipping getOrderShipping() {
        return orderShipping;
    }

    public void setOrderShipping(OrderShipping orderShipping) {
        this.orderShipping = orderShipping;
    }

    public List<OrderProduct> getOrderProducts() {
        return orderProducts;
    }

    public void setOrderProducts(List<OrderProduct> orderProducts) {
        this.orderProducts = orderProducts;
    }

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

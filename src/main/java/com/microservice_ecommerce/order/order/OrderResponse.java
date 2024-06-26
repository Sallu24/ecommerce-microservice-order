package com.microservice_ecommerce.order.order;

import java.util.Date;

public class OrderResponse {

    private Long id;

    private Long customerId;

    private String customerEmail;

    private String customerPhone;

    private Float subTotal;

    private String shippingMethod;

    private Float shippingCost;

    private Long couponId;

    private Long discountId;

    private Long invoiceNumber;

    private Float total;

    private String paymentMethod;

    private String currency;

    private Float currencyRate;

    private String status;

    private String note;

    private Date createdAt;

    private Date updatedAt;

    public OrderResponse(Long id, Long customerId, String customerEmail, String customerPhone, Float subTotal, String shippingMethod, Float shippingCost, Long couponId, Long discountId, Long invoiceNumber, Float total, String paymentMethod, String currency, Float currencyRate, String status, String note, Date createdAt, Date updatedAt) {
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
    }

    public OrderResponse() {
    }

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
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

    @Override
    public String toString() {
        return "OrderResponse{" +
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
                ", status='" + status + '\'' +
                ", note='" + note + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }

}

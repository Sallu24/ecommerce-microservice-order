package com.microservice_ecommerce.order.order;

import jakarta.persistence.*;

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

    @Column(name = "customer_shipping_email")
    private String customerShippingEmail;

    @Column(name = "customer_shipping_phone")
    private String customerShippingPhone;

    @Column(name = "customer_shipping_address_1")
    private String customerShippingAddress1;

    @Column(name = "customer_shipping_address_2")
    private String getCustomerShippingAddress2;

    @Column(name = "customer_shipping_city")
    private String customerShippingCity;

    @Column(name = "customer_shipping_state")
    private String customerShippingState;

    @Column(name = "customer_shipping_zip")
    private String customerShippingZip;

    @Column(name = "customer_shipping_country")
    private String customerShippingCountry;

    public OrderShipping(
            Long id,
            Order order,
            String customerShippingFirstName,
            String customerShippingLastName,
            String customerShippingEmail,
            String customerShippingPhone,
            String customerShippingAddress1,
            String getCustomerShippingAddress2,
            String customerShippingCity,
            String customerShippingState,
            String customerShippingZip,
            String customerShippingCountry
    ) {
        this.id = id;
        this.order = order;
        this.customerShippingFirstName = customerShippingFirstName;
        this.customerShippingLastName = customerShippingLastName;
        this.customerShippingEmail = customerShippingEmail;
        this.customerShippingPhone = customerShippingPhone;
        this.customerShippingAddress1 = customerShippingAddress1;
        this.getCustomerShippingAddress2 = getCustomerShippingAddress2;
        this.customerShippingCity = customerShippingCity;
        this.customerShippingState = customerShippingState;
        this.customerShippingZip = customerShippingZip;
        this.customerShippingCountry = customerShippingCountry;
    }

    public OrderShipping() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public String getCustomerShippingFirstName() {
        return customerShippingFirstName;
    }

    public void setCustomerShippingFirstName(String customerShippingFirstName) {
        this.customerShippingFirstName = customerShippingFirstName;
    }

    public String getCustomerShippingLastName() {
        return customerShippingLastName;
    }

    public void setCustomerShippingLastName(String customerShippingLastName) {
        this.customerShippingLastName = customerShippingLastName;
    }

    public String getCustomerShippingEmail() {
        return customerShippingEmail;
    }

    public void setCustomerShippingEmail(String customerShippingEmail) {
        this.customerShippingEmail = customerShippingEmail;
    }

    public String getCustomerShippingPhone() {
        return customerShippingPhone;
    }

    public void setCustomerShippingPhone(String customerShippingPhone) {
        this.customerShippingPhone = customerShippingPhone;
    }

    public String getCustomerShippingAddress1() {
        return customerShippingAddress1;
    }

    public void setCustomerShippingAddress1(String customerShippingAddress1) {
        this.customerShippingAddress1 = customerShippingAddress1;
    }

    public String getGetCustomerShippingAddress2() {
        return getCustomerShippingAddress2;
    }

    public void setGetCustomerShippingAddress2(String getCustomerShippingAddress2) {
        this.getCustomerShippingAddress2 = getCustomerShippingAddress2;
    }

    public String getCustomerShippingCity() {
        return customerShippingCity;
    }

    public void setCustomerShippingCity(String customerShippingCity) {
        this.customerShippingCity = customerShippingCity;
    }

    public String getCustomerShippingState() {
        return customerShippingState;
    }

    public void setCustomerShippingState(String customerShippingState) {
        this.customerShippingState = customerShippingState;
    }

    public String getCustomerShippingZip() {
        return customerShippingZip;
    }

    public void setCustomerShippingZip(String customerShippingZip) {
        this.customerShippingZip = customerShippingZip;
    }

    public String getCustomerShippingCountry() {
        return customerShippingCountry;
    }

    public void setCustomerShippingCountry(String customerShippingCountry) {
        this.customerShippingCountry = customerShippingCountry;
    }

    @Override
    public String toString() {
        return "OrderShipping{" +
                "id=" + id +
                ", customerShippingFirstName='" + customerShippingFirstName + '\'' +
                ", customerShippingLastName='" + customerShippingLastName + '\'' +
                ", customerShippingEmail='" + customerShippingEmail + '\'' +
                ", customerShippingPhone='" + customerShippingPhone + '\'' +
                ", customerShippingAddress1='" + customerShippingAddress1 + '\'' +
                ", getCustomerShippingAddress2='" + getCustomerShippingAddress2 + '\'' +
                ", customerShippingCity='" + customerShippingCity + '\'' +
                ", customerShippingState='" + customerShippingState + '\'' +
                ", customerShippingZip='" + customerShippingZip + '\'' +
                ", customerShippingCountry='" + customerShippingCountry + '\'' +
                '}';
    }

}

package com.microservice_ecommerce.order.order;

import jakarta.persistence.*;

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

    @Column(name = "customer_billing_email")
    private String customerBillingEmail;

    @Column(name = "customer_billing_phone")
    private String customerBillingPhone;

    @Column(name = "customer_billing_address_1")
    private String customerBillingAddress1;

    @Column(name = "customer_billing_address_2")
    private String getCustomerBillingAddress2;

    @Column(name = "customer_billing_city")
    private String customerBillingCity;

    @Column(name = "customer_billing_state")
    private String customerBillingState;

    @Column(name = "customer_billing_zip")
    private String customerBillingZip;

    @Column(name = "customer_billing_country")
    private String customerBillingCountry;

    public OrderBilling(
            Long id,
            Order order,
            String customerBillingFirstName,
            String customerBillingLastName,
            String customerBillingEmail,
            String customerBillingPhone,
            String customerBillingAddress1,
            String getCustomerBillingAddress2,
            String customerBillingCity,
            String customerBillingState,
            String customerBillingZip,
            String customerBillingCountry
    ) {
        this.id = id;
        this.order = order;
        this.customerBillingFirstName = customerBillingFirstName;
        this.customerBillingLastName = customerBillingLastName;
        this.customerBillingEmail = customerBillingEmail;
        this.customerBillingPhone = customerBillingPhone;
        this.customerBillingAddress1 = customerBillingAddress1;
        this.getCustomerBillingAddress2 = getCustomerBillingAddress2;
        this.customerBillingCity = customerBillingCity;
        this.customerBillingState = customerBillingState;
        this.customerBillingZip = customerBillingZip;
        this.customerBillingCountry = customerBillingCountry;
    }

    public OrderBilling() {
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

    public String getCustomerBillingFirstName() {
        return customerBillingFirstName;
    }

    public void setCustomerBillingFirstName(String customerBillingFirstName) {
        this.customerBillingFirstName = customerBillingFirstName;
    }

    public String getCustomerBillingLastName() {
        return customerBillingLastName;
    }

    public void setCustomerBillingLastName(String customerBillingLastName) {
        this.customerBillingLastName = customerBillingLastName;
    }

    public String getCustomerBillingEmail() {
        return customerBillingEmail;
    }

    public void setCustomerBillingEmail(String customerBillingEmail) {
        this.customerBillingEmail = customerBillingEmail;
    }

    public String getCustomerBillingPhone() {
        return customerBillingPhone;
    }

    public void setCustomerBillingPhone(String customerBillingPhone) {
        this.customerBillingPhone = customerBillingPhone;
    }

    public String getCustomerBillingAddress1() {
        return customerBillingAddress1;
    }

    public void setCustomerBillingAddress1(String customerBillingAddress1) {
        this.customerBillingAddress1 = customerBillingAddress1;
    }

    public String getGetCustomerBillingAddress2() {
        return getCustomerBillingAddress2;
    }

    public void setGetCustomerBillingAddress2(String getCustomerBillingAddress2) {
        this.getCustomerBillingAddress2 = getCustomerBillingAddress2;
    }

    public String getCustomerBillingCity() {
        return customerBillingCity;
    }

    public void setCustomerBillingCity(String customerBillingCity) {
        this.customerBillingCity = customerBillingCity;
    }

    public String getCustomerBillingState() {
        return customerBillingState;
    }

    public void setCustomerBillingState(String customerBillingState) {
        this.customerBillingState = customerBillingState;
    }

    public String getCustomerBillingZip() {
        return customerBillingZip;
    }

    public void setCustomerBillingZip(String customerBillingZip) {
        this.customerBillingZip = customerBillingZip;
    }

    public String getCustomerBillingCountry() {
        return customerBillingCountry;
    }

    public void setCustomerBillingCountry(String customerBillingCountry) {
        this.customerBillingCountry = customerBillingCountry;
    }

    @Override
    public String toString() {
        return "OrderBilling{" +
                "id=" + id +
                ", customerBillingFirstName='" + customerBillingFirstName + '\'' +
                ", customerBillingLastName='" + customerBillingLastName + '\'' +
                ", customerBillingEmail='" + customerBillingEmail + '\'' +
                ", customerBillingPhone='" + customerBillingPhone + '\'' +
                ", customerBillingAddress1='" + customerBillingAddress1 + '\'' +
                ", getCustomerBillingAddress2='" + getCustomerBillingAddress2 + '\'' +
                ", customerBillingCity='" + customerBillingCity + '\'' +
                ", customerBillingState='" + customerBillingState + '\'' +
                ", customerBillingZip='" + customerBillingZip + '\'' +
                ", customerBillingCountry='" + customerBillingCountry + '\'' +
                '}';
    }

}

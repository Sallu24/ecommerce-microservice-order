package com.microservice_ecommerce.order.order;

import jakarta.persistence.*;

@Entity
@Table(name = "order_products")
public class OrderProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id", referencedColumnName = "id")
    private Order order;

    @Column(name = "product_id")
    private Long productId;

    @Column(name = "unit_price")
    private Float unitPrice;

    private Integer qty;

    @Column(name = "line_total")
    private Float lineTotal;

    public OrderProduct(Long id, Order order, Long productId, Float unitPrice, Integer qty, Float lineTotal) {
        this.id = id;
        this.order = order;
        this.productId = productId;
        this.unitPrice = unitPrice;
        this.qty = qty;
        this.lineTotal = lineTotal;
    }

    public OrderProduct() {
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

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Float unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public Float getLineTotal() {
        return lineTotal;
    }

    public void setLineTotal(Float lineTotal) {
        this.lineTotal = lineTotal;
    }

    @Override
    public String toString() {
        return "OrderProduct{" +
                "id=" + id +
                ", order=" + order +
                ", productId=" + productId +
                ", unitPrice=" + unitPrice +
                ", qty=" + qty +
                ", lineTotal=" + lineTotal +
                '}';
    }

}

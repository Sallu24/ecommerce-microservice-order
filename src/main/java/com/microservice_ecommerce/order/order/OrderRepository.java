package com.microservice_ecommerce.order.order;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OrderRepository extends JpaRepository<Order, Long> {

    Optional<Order> findByInvoiceNumber(Long invoiceNumber);

}

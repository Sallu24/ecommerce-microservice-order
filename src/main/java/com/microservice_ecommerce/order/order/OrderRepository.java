package com.microservice_ecommerce.order.order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface OrderRepository extends JpaRepository<Order, Long> {

    Optional<Order> findByInvoiceNumber(Long invoiceNumber);

    @Query("SELECT MAX(o.invoiceNumber) FROM Order o")
    Long findMaxInvoiceNumber();

}

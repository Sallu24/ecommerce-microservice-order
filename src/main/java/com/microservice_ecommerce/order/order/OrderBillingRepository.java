package com.microservice_ecommerce.order.order;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderBillingRepository extends JpaRepository<OrderBilling, Long> {
}

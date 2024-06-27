package com.microservice_ecommerce.order.order;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/orders")
public class OrderController {

    protected OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public ResponseEntity<List<OrderResponse>> index() {
        return orderService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrderResponse> view(@PathVariable Long id) {
        OrderResponse orderResponse = orderService.view(id);

        return ResponseEntity.ok(orderResponse);
    }

}

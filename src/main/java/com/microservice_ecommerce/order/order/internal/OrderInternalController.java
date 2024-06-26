package com.microservice_ecommerce.order.order.internal;

import com.microservice_ecommerce.order.order.internal.dto.OrderDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/orders/internal")
public class OrderInternalController {

    protected OrderInternalService orderService;

    public OrderInternalController(OrderInternalService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    public void createOrder(@RequestBody OrderDTO orderDTO) {
        orderService.createOrder(orderDTO);
    }

}

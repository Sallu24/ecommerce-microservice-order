package com.microservice_ecommerce.order.order.messaging;

import com.microservice_ecommerce.order.order.Order;
import com.microservice_ecommerce.order.order.external.Cart;
import com.microservice_ecommerce.order.order.internal.dto.OrderMessage;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
public class OrderMessageProducer {

    private final RabbitTemplate rabbitTemplate;

    public OrderMessageProducer(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void sendMessage(Order order, Cart cart) {
        OrderMessage orderMessage = new OrderMessage(
                order.getId(),
                order.getCustomerId(),
                cart.getId()
        );

        rabbitTemplate.convertAndSend("cartEmptyQueue", orderMessage);
    }

}

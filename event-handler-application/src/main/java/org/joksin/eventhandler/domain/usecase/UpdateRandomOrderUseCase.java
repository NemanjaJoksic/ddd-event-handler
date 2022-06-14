/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.joksin.eventhandler.domain.usecase;

import java.time.LocalDateTime;
import java.util.Random;
import lombok.AllArgsConstructor;
import org.joksin.eventhandler.domain.Order;
import org.joksin.eventhandler.domain.event.OrderUpdatedEvent;
import org.joksin.eventhandler.domain.event.OrderUpdatedEventProducer;
import org.springframework.stereotype.Component;

/**
 *
 * @author Nemanja
 */
@Component
@AllArgsConstructor
public class UpdateRandomOrderUseCase {
    
    private final OrderUpdatedEventProducer orderUpdatedEventProducer;
    
    public void updateOrder() {
        Random random = new Random();
        Order order = Order.builder()
                .id(random.nextInt(1000))
                .userId("test_user")
                .cost(random.nextInt(1000) * 1.123)
                .created(LocalDateTime.now())
                .build();
        
        orderUpdatedEventProducer.publish(new OrderUpdatedEvent(order));
    }
    
}

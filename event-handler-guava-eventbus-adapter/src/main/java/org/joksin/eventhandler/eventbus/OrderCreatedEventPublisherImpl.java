/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.joksin.eventhandler.eventbus;

import com.google.common.eventbus.EventBus;
import lombok.AllArgsConstructor;
import org.joksin.eventhandler.domain.event.OrderCreatedEvent;
import org.joksin.eventhandler.domain.event.OrderCreatedEventProducer;
import org.springframework.stereotype.Component;

/**
 *
 * @author Nemanja
 */
@Component
@AllArgsConstructor
public class OrderCreatedEventPublisherImpl implements OrderCreatedEventProducer {

    private final EventBus eventBus;
    
    @Override
    public void publish(OrderCreatedEvent orderCreatedEvent) {
        System.out.println("Posting OrderCreatedEvent. " + orderCreatedEvent.getOrder());
        eventBus.post(orderCreatedEvent);
    }
    
}

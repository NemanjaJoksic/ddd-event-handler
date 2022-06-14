/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.joksin.eventhandler.eventbus;

import com.google.common.eventbus.EventBus;
import lombok.AllArgsConstructor;
import org.joksin.eventhandler.domain.event.OrderUpdatedEvent;
import org.joksin.eventhandler.domain.event.OrderUpdatedEventProducer;
import org.springframework.stereotype.Component;

/**
 *
 * @author Nemanja
 */
@Component
@AllArgsConstructor
public class OrderUpdatedEventPublisherImpl implements OrderUpdatedEventProducer {

    private final EventBus eventBus;
    
    @Override
    public void publish(OrderUpdatedEvent orderUpdatedEvent) {
        System.out.println("Posting OrderUpdatedEvent. " + orderUpdatedEvent.getOrder());
        eventBus.post(orderUpdatedEvent);
    }
    
}

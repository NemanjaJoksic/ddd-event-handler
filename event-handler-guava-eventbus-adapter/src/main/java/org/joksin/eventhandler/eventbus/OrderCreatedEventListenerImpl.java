/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.joksin.eventhandler.eventbus;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import lombok.RequiredArgsConstructor;
import org.joksin.eventhandler.domain.event.EventHandler;
import org.joksin.eventhandler.domain.event.OrderCreatedEvent;
import org.springframework.stereotype.Component;
import org.joksin.eventhandler.domain.event.OrderCreatedEventHandler.OrderCreatedEventListener;

/**
 *
 * @author Nemanja
 */
@Component
@RequiredArgsConstructor
public class OrderCreatedEventListenerImpl implements OrderCreatedEventListener {
    
    private final EventBus eventBus;
    private EventHandler<OrderCreatedEvent> eventHandler;

    @Override
    public void initialize(EventHandler<OrderCreatedEvent> eventHandler) {
        this.eventBus.register(this);
        this.eventHandler = eventHandler;
    }
    
    @Subscribe
    public void processEvent(OrderCreatedEvent orderCreatedEvent) {
        this.eventHandler.processEvent(orderCreatedEvent);
    }
    
}

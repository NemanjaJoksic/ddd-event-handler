/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.joksin.eventhandler.domain.event;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.stereotype.Component;

/**
 *
 * @author Nemanja
 */
@Component
public class OrderCreatedEventHandler extends EventHandler<OrderCreatedEvent> {

    public OrderCreatedEventHandler(BeanFactory beanFactory) {
        super(beanFactory);
    }

    @Override
    public void processEvent(OrderCreatedEvent orderCreatedEvent) {
        System.out.println("Processing OrderCreatedEvent. " + orderCreatedEvent.getOrder());
    }

    @Override
    Class<? extends EventListener> eventListenerClass() {
        return OrderCreatedEventListener.class;
    }
    
    public static interface OrderCreatedEventListener extends EventListener<OrderCreatedEvent> {}
    
}

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
public class OrderUpdatedEventHandler extends EventHandler<OrderUpdatedEvent> {

    public OrderUpdatedEventHandler(BeanFactory beanFactory) {
        super(beanFactory);
    }

    @Override
    public void processEvent(OrderUpdatedEvent orderUpdatedEvent) {
        System.out.println("Processing OrderUpdatedEvent. " + orderUpdatedEvent.getOrder());
    }

    @Override
    Class<? extends EventListener> eventListenerClass() {
        return OrderUpdatedEventListener.class;
    }
    
    public static interface OrderUpdatedEventListener extends EventListener<OrderUpdatedEvent> {}
    
}

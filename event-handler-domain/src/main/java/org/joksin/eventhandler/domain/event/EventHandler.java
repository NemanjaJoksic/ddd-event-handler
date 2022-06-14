/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.joksin.eventhandler.domain.event;

import org.springframework.beans.factory.BeanFactory;

/**
 *
 * @author Nemanja
 */
public abstract class EventHandler<T> {

    public EventHandler(BeanFactory beanFactory) {
        EventListener eventConsumerStarter = beanFactory.getBean(eventListenerClass());
        eventConsumerStarter.initialize(this);
    }
    
    abstract Class<? extends EventListener> eventListenerClass();

    public abstract void processEvent(T event);

    public static interface EventListener<T> {

        void initialize(EventHandler<T> eventConsumer);

    }

}

package org.joksin.eventhandler.eventbus;


import com.google.common.eventbus.EventBus;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Nemanja
 */
@Configuration
public class EventBusConfiguration {
    
    @Bean
    public EventBus eventBus() {
        return new EventBus();
    } 
    
}

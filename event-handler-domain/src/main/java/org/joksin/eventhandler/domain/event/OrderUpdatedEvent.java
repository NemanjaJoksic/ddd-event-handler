/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.joksin.eventhandler.domain.event;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.joksin.eventhandler.domain.Order;

/**
 *
 * @author Nemanja
 */
@Getter
@AllArgsConstructor
public class OrderUpdatedEvent {
    
    private Order order;
    
}

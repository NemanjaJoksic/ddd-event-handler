/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.joksin.eventhandler.domain;

import java.time.LocalDateTime;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

/**
 *
 * @author Nemanja
 */
@Getter
@Builder
@ToString
public class Order {
    
    private Integer id;
    private String userId;
    private Double cost;
    private LocalDateTime created;
    
}

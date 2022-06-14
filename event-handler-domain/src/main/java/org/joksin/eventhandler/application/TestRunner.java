/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.joksin.eventhandler.application;

import lombok.AllArgsConstructor;
import org.joksin.eventhandler.domain.usecase.CreateRandomOrderUseCase;
import org.joksin.eventhandler.domain.usecase.UpdateRandomOrderUseCase;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 *
 * @author Nemanja
 */
@Component
@AllArgsConstructor
public class TestRunner implements CommandLineRunner {

    private final CreateRandomOrderUseCase createRandomOrderUseCase;
    private final UpdateRandomOrderUseCase updateRandomOrderUseCase;
    
    @Override
    public void run(String... args) throws Exception {
        createRandomOrderUseCase.createOrder();
        createRandomOrderUseCase.createOrder();
        createRandomOrderUseCase.createOrder();
        
        updateRandomOrderUseCase.updateOrder();
        updateRandomOrderUseCase.updateOrder();
        updateRandomOrderUseCase.updateOrder();
    }
    
}

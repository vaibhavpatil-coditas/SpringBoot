package com.week6.assignment.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PrototypeBeanDemo {

    public PrototypeBeanDemo() {
        System.out.println("Prototype bean object created...");
    }

}
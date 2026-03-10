package com.week6.assignment.demo;

import org.springframework.stereotype.Component;

@Component
public class SingletonBeanDemo {

    public SingletonBeanDemo() {
        System.out.println("Singleton bean created...");
    }

}
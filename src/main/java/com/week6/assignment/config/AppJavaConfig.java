package com.week6.assignment.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppJavaConfig {

    @Bean
    public String randomBeanForDemo() {

        return "Some random bean created using Java Config";
    }

}
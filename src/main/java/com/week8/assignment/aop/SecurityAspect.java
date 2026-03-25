package com.week8.assignment.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SecurityAspect {

    @Before("@annotation(ManagerOnly)")
    public void checkRole() {
        String role = "EMPLOYEE"; // simulate

        if (!role.equals("MANAGER")) {
            throw new RuntimeException("Access Denied");
        }
    }
}
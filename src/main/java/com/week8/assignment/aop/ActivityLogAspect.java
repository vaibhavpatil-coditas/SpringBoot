package com.week8.assignment.aop;

import lombok.RequiredArgsConstructor;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
@RequiredArgsConstructor
public class ActivityLogAspect {

    private final ActivityLogStore store;

    @AfterReturning("execution(* com.company.taskmanagement.service.*.*(..))")
    public void logActivity(JoinPoint joinPoint) {
        store.addLog(joinPoint.getSignature().getName() + " executed");
    }
}
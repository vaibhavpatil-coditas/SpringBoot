package com.week8.assignment.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class LoggingAspect {

    @Before("execution(* com.company.taskmanagement.controller.*.*(..))")
    public void logBefore(JoinPoint joinPoint) {
        log.info(joinPoint.getSignature().getName() + " API called");
    }
}

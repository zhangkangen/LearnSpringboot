package com.zhang.config;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LubanAspect {

    @Pointcut("execution(public * *(..))")
    public void pointCut() {
    }

    @Before("pointCut()")
    public void before() {
        System.out.println("before");
    }

    @After("pointCut()")
    public void after() {
        System.out.println("after");
    }

}

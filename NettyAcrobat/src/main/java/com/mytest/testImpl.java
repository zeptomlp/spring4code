package com.mytest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author: Albers
 * @date: 2021/5/12
 * @description:
 */
@Aspect
@Component
public class testImpl {
    @Pointcut("@annotation(com.mytest.mlptest)")
    public void cutpoint() {
    }

    // 前置通知
    @Before("cutpoint()")
    public void before() {
        System.out.println("前置");
    }
    // 后置通知 始终会执行
    @After("cutpoint()")
    public void after() {
        System.out.println("后置");
    }
    // 环绕通知
    @Around("cutpoint()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕前");
        Object result = pjp.proceed();
        System.out.println("环绕后");
        return result;
    }
    // 后置 发生异常时不会执行
    @AfterReturning("cutpoint()")
    public void returning() {
        System.out.println("After returning 后置");
    }
    // 发生异常
    @AfterThrowing("cutpoint()")
    public void throwing() {
        System.out.println("发生异常了");
    }
}

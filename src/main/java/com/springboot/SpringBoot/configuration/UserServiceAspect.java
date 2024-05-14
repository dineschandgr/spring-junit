package com.springboot.SpringBoot.configuration;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class UserServiceAspect {

    @Before("execution(* com.springboot.SpringBoot.web..*(..))")
    public void beforeAdvice(JoinPoint joinPoint){
        System.out.println("Intercepted method: " + joinPoint);
        System.out.println("Arguments: " + joinPoint.getArgs()[0]);
        System.out.println(joinPoint.getTarget());
    }


 @Around("execution(* com.springboot.SpringBoot.dao..*(..))")
    public void allDaoAnyMethod(ProceedingJoinPoint joinPoint) {
        System.out.println("before calling dao " + joinPoint);

        System.out.println(joinPoint.getTarget());
        try {
            joinPoint.proceed();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }

     System.out.println("after calling dao: " + joinPoint.getArgs());
    }

   /* @Before("execution(* com.springboot.SpringBoot..*(..))")
    public void afterAdvice(JoinPoint joinPoint){
        System.out.println("after advice "+joinPoint.getArgs());
    }*/
}

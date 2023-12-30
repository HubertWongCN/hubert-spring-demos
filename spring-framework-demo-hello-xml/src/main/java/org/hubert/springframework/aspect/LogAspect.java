package org.hubert.springframework.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;

import java.lang.reflect.Method;

/**
 * @author hubertwong
 */
@Aspect
public class LogAspect {
    /**
     * aspect for every method under service package
     *
     * @param pjp proceed join point
     * @return {@link Object}
     * @throws Throwable exception
     */
    @Around("execution(* org.hubert.springframework.service.*.*(..))")
    public Object businessService(ProceedingJoinPoint pjp) throws Throwable {
        // get attribute through annotation
        Method method = ((MethodSignature) pjp.getSignature()).getMethod();
        System.out.println("execute method: " + method.getName());
        return pjp.proceed();
    }
}

package org.hubert.springframework.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;

import java.lang.reflect.Method;

/**
 * @author hubertwong
 * @date 2023/12/31 00:20
 */
@Aspect
public class LogAspect {
    /**
     * aspect for every method under service package
     *
     * @param pjp proceed join point
     * @return
     * @throws Throwable
     */
    @Around("execution(* org.hubert.springframework.service.*.*(..))")
    public Object businessService(ProceedingJoinPoint pjp) throws Throwable {
        // get attribute through annotation
        Method method = ((MethodSignature) pjp.getSignature()).getMethod();
        System.out.println("execute method: " + method.getName());
        return pjp.proceed();
    }
}

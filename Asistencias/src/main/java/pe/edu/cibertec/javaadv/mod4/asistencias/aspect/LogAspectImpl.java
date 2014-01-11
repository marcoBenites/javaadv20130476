/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.javaadv.mod4.asistencias.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.aop.aspectj.MethodInvocationProceedingJoinPoint;

/**
 *
 * @author JAVA-ADV
 */
@Aspect
public class LogAspectImpl {

    @Around("pe.edu.cibertec.javaadv.mod4.asistencias.aspect.LogAspect.trace()")
    public Object log(ProceedingJoinPoint pjp) throws Throwable {
        final Object result = pjp.proceed();

        MethodInvocationProceedingJoinPoint m = (MethodInvocationProceedingJoinPoint) pjp;
        System.out.println(m.getTarget());
        System.out.println(m.getArgs());
        System.out.println(pjp.getSignature() + " returns " + result);

        return result;
    }

}

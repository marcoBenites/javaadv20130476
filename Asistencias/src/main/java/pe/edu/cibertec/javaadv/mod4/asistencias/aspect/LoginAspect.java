/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.javaadv.mod4.asistencias.aspect;

import java.util.Calendar;
import java.util.GregorianCalendar;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

/**
 *
 * @author JAVA-ADV
 */
@Aspect
public class LoginAspect {

    @Around("bean(loginService).validate")
    public Object login(ProceedingJoinPoint pjp) throws Throwable {
        Calendar cal = GregorianCalendar.getInstance();
        if (cal.get(Calendar.HOUR_OF_DAY) > 20) {
            System.out.println("Acceso en horario invalido");
            return Boolean.FALSE;
        }
        return pjp.proceed();
    }
}

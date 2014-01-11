/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.javaadv.mod4.asistencias.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 *
 * @author JAVA-ADV
 */
@Aspect
public class LogAspect {

    @Pointcut("execution(* *(..))")
    public void trace() {
    }

}

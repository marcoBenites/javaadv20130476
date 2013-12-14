/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.javaadv.mod4.aopcdi;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

/**
 *
 * @author JAVA-ADV
 */
@Interceptor
@Log
public class PerformanceInterceptor {

    private Logger logger = Logger.getAnonymousLogger();

    @AroundInvoke
    public Object log(InvocationContext ic) throws Exception {
        long inicio = System.nanoTime();
        try {
            return ic.proceed();
        } finally {
            logger.log(Level.INFO, "lasts {0}.{1} {2}", new Object[]{ic.getTarget().getClass().getSimpleName(), ic.getMethod().getName(), System.nanoTime() - inicio});
        }
    }
}

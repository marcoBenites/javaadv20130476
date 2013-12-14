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
public class LogInterceptor {

    private Logger logger = Logger.getAnonymousLogger();

    @AroundInvoke
    public Object log(InvocationContext ic) throws Exception {
        Object result = null;
        try {
            //antes del metodo
            logger.log(Level.INFO, "calling {0}.{1}", new Object[]{ic.getTarget().getClass().getSimpleName(), ic.getMethod().getName()});

            //return ic.proceed(); es la forma de llamar al metodo
            result = ic.proceed();
            return result;
        } finally {
            logger.log(Level.INFO, "exits {0}.{1} returns {2}", new Object[]{ic.getTarget().getClass().getSimpleName(), ic.getMethod().getName(), result});
            //despues del metodo
        }
    }
}

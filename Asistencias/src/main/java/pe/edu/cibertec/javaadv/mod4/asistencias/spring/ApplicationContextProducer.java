/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.javaadv.mod4.asistencias.spring;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import org.springframework.context.ApplicationContext;

/**
 *
 * @author JAVA-ADV
 */
@ApplicationScoped
public class ApplicationContextProducer {

    private ApplicationContext context;

    @Produces
    public ApplicationContext getContext() {
        return context;
    }

    public void setContext(ApplicationContext context) {
        this.context = context;
    }
}

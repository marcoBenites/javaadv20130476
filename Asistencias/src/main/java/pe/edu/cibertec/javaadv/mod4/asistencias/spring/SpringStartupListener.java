/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.javaadv.mod4.asistencias.spring;

import javax.inject.Inject;
import javax.servlet.ServletContextEvent;
import javax.servlet.annotation.WebListener;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;

/**
 *
 * @author JAVA-ADV
 */
@WebListener
public class SpringStartupListener extends ContextLoaderListener {

    @Inject
    ApplicationContextProducer producer;

    @Override
    public void contextInitialized(ServletContextEvent event) {
        super.contextInitialized(event);
        producer.setContext((ApplicationContext) event.getServletContext().getAttribute(WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE));
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.javaadv.mod4.asistencias.spring;

import javax.servlet.annotation.WebListener;
import org.springframework.web.context.ContextCleanupListener;

/**
 *
 * @author JAVA-ADV
 */
@WebListener
public class SpringShutdownListener extends ContextCleanupListener {
}

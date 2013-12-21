/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.javaadv.mod4.asistencias.service;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.springframework.context.ApplicationContext;
import pe.edu.cibertec.javaadv.mod4.asistencias.Login;
import pe.edu.cibertec.javaadv.mod4.asistencias.SimpleCredential;

/**
 *
 * @author JAVA-ADV
 */
@Named
@RequestScoped
public class LoginController {

    @Inject
    ApplicationContext spring;
    private String user;
    private String password;

    public String login() {
        boolean result = spring.getBean(Login.class).validate(new SimpleCredential(user, password));
        return result ? "loggedIn" : "failed";
    }
}

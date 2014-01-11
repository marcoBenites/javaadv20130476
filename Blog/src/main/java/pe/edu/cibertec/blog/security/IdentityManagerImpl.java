/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.blog.security;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author JAVA-ADV
 */
@SessionScoped
public class IdentityManagerImpl implements IdentityManager, Serializable {

    @Inject
    HttpServletRequest request;

    @Inject
    LoginService authenticator;

    private String user;

    private boolean loggedIn;
    private boolean destroySession;

    @PostConstruct
    public void init() {
        loggedIn = false;
        destroySession = false;
    }

    @Override
    public boolean isLoggedIn() {
        return loggedIn;
    }

    @Override
    public void login() {
        final String user = request.getParameter("usuario");
        final String password = request.getParameter("clave");
        if (user != null && password != null) {
            loggedIn = authenticator.authenticate(user, password);
            this.user = loggedIn ? user : null;
        }
    }

    @Override
    public void logout() {
        destroySession = true;
    }

    @Override
    public boolean isLoggedOut() {
        return destroySession;
    }

    @Override
    public String getUser() {
        return user;
    }

}

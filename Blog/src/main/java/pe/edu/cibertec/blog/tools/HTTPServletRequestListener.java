/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.blog.tools;

import javax.inject.Inject;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServletRequest;

/**
 * Web application lifecycle listener.
 *
 * @author JAVA-ADV
 */
@WebListener()
public class HTTPServletRequestListener implements ServletRequestListener {

    @Inject
    HTTPServletRequestFactory factory;

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        factory.setRequest(null);
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        factory.setRequest((HttpServletRequest) sre.getServletRequest());
    }
}

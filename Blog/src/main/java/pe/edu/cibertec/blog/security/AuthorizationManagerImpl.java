/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.blog.security;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author JAVA-ADV
 */
public class AuthorizationManagerImpl implements AutorizationManager {

    @Inject
    HttpServletRequest request;

    @Override
    public boolean isAuthorized(String[] access) {
        if (access == null) {
            return true;
        }
        for (String a : access) {
            if (!isAuthorized(a)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isAuthorized(String access) {
        return request.getSession().getAttribute(access) != null;
    }

}

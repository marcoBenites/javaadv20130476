/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.blog.security;

import java.io.Serializable;
import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

/**
 *
 * @author JAVA-ADV
 */
@Interceptor
@Restrict
public class RestrictInterceptor implements Serializable {

    @Inject
    AutorizationManager manager;

    @Inject
    IdentityManager identity;

    @AroundInvoke
    public Object validate(InvocationContext ic) throws Exception {
        checkLoggedIn(ic);
        checkRequires(ic);
        return ic.proceed();

    }

    private void checkRequires(InvocationContext ic) throws RuntimeException {
        Requires r = ic.getMethod().getAnnotation(Requires.class);
        if (r != null && manager.isAuthorized(r.value())) {
            throw new RuntimeException(
                    "Permiso no satisfecho " + r.value());
        }
    }

    private void checkLoggedIn(InvocationContext ic) throws RuntimeException {
        LoggedIn l = ic.getMethod().getAnnotation(LoggedIn.class);
        if (l != null && !identity.isLoggedIn()) {
            throw new RuntimeException("Sesion no iniciada");
        }
    }

    private boolean checkAccess(String[] value) {
        for (String access : value) {

        }
        return true;
    }
}

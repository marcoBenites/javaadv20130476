/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.blog;

import java.io.Serializable;
import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author JAVA-ADV
 */
@Interceptor
@Restrict
public class RestrictInterceptor implements Serializable {

    @Inject
    HttpServletRequest request;

    @AroundInvoke
    public Object validate(InvocationContext ic) throws Exception {
        Requires r = ic.getMethod().getAnnotation(Requires.class);

        if (r == null
                || request.getSession().getAttribute(r.value()) != null) {
            return ic.proceed();
        }

        throw new RuntimeException(
                "Permiso no satisfecho " + r.value());

    }
}

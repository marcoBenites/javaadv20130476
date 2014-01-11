/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.javaadv.mod4.asistencias;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JAVA-ADV
 */
public class LoginImpl implements Login {

    //FIXME contar las fallas de inicio de sesion
    @Override
    public boolean validate(Credential credential) {

        Logger logger = Logger.getLogger(LoginImpl.class.getName());
        logger.log(Level.INFO, "validate({0})", credential);

        SimpleCredential sc = (SimpleCredential) credential;
        final boolean response = "pepe".equals(sc.getUser()) && "123".equals(sc.getPassword());

        logger.log(Level.INFO, "validate({0}) returns {1}", new Object[]{credential, response});
        return response;
    }
}

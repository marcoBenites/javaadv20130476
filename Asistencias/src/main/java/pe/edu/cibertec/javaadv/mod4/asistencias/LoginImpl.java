/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.javaadv.mod4.asistencias;

/**
 *
 * @author JAVA-ADV
 */
public class LoginImpl implements Login {

    //FIXME contar las fallas de inicio de sesion
    @Override
    public boolean validate(Credential credential) {
        SimpleCredential sc = (SimpleCredential) credential;
        return "pepe".equals(sc.getUser()) && "123".equals(sc.getPassword());
    }
}

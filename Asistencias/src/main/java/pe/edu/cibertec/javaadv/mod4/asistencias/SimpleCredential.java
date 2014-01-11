/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.javaadv.mod4.asistencias;

/**
 *
 * @author JAVA-ADV
 */
public class SimpleCredential implements Credential {

    private String user;
    private String password;

    public SimpleCredential() {
    }

    public SimpleCredential(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "SimpleCredential{" + "user=" + user + ", password=" + password + '}';
    }

}

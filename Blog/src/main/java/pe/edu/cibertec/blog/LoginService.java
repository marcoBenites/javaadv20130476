/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.blog;

/**
 *
 * @author JAVA-ADV
 */
public interface LoginService {

    boolean authenticate(String user, String password);

}
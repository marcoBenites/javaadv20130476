/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.blog.security;

/**
 *
 * @author JAVA-ADV
 */
public interface AutorizationManager {

    boolean isAuthorized(String[] access);

    boolean isAuthorized(String access);

}

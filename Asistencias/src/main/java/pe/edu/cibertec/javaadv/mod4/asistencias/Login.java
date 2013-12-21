/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.javaadv.mod4.asistencias;

/**
 *
 *
 * @author JAVA-ADV
 */
public interface Login {

    /**
     * <p> Valida las credenciales proporcionadas, retorna
     * <code>true</code> cuando son correctas y
     * <code>false<code> en caso contrario.<br />
     * </p>
     * <p>Cuando se hayan acumulado tres fallas de validacion
     * se debe bloquear la cuenta y no se permitirá acceso.
     * Cuando esto ocurra se emitirá una excepción.</p>
     *
     * @param credential las credenciales a validar
     * @return true si esta autenticado, false en caso contrario
     */
    boolean validate(Credential credential);
}

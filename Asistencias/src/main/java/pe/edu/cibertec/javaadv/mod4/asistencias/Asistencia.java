/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.javaadv.mod4.asistencias;

import java.util.Date;

/**
 *
 * @author JAVA-ADV
 */
public interface Asistencia {

    /**
     * <p>Recibe una fecha tenativa de una clase y el codigo de
     * un profesor y retorna un ClassEvent con los datos de la
     * clase correspondiente a la hora y el detalle de
     * asistencia por alumno.<p>
     * 
     * @param date una fecha y hora cualquiera
     * @param profesor el codigo del profesor a consultar
     * @return retorna el detalle de la clase
     */
    ClassEvent findClassEvent(Date date, String profesor);
}

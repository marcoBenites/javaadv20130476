/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.javaadv.mod3.solexamen;

import java.util.List;

/**
 *
 * @author JAVA-ADV
 */
public interface Controller<T, I> {

    void insertar(T t);

    List<T> buscar();

    T buscar(I i);

    void modificar(T t);

    void eliminar(I i);
}

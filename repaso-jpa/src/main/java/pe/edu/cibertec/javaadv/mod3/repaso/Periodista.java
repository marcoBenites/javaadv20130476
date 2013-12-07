/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.javaadv.mod3.repaso;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author JAVA-ADV
 */
@Entity
public class Periodista implements Serializable {

    @Id
    private Long id;
    private String nombre;
    private String pseudonimo;

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the pseudonimo
     */
    public String getPseudonimo() {
        return pseudonimo;
    }

    /**
     * @param pseudonimo the pseudonimo to set
     */
    public void setPseudonimo(String pseudonimo) {
        this.pseudonimo = pseudonimo;
    }

    @Override
    public String toString() {
        return this.pseudonimo;
    }
}

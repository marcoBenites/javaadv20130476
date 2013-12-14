/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.javaadv.mod3.solexamen;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author JAVA-ADV
 */
@Entity
public class Direccion implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    private Contacto contacto;
    private String etiqueta;
    private String direccion;
    private String pais;

    public Direccion() {
    }

    public Direccion(Contacto contacto, String etiqueta, String direccion, String pais) {
        this.contacto = contacto;
        this.etiqueta = etiqueta;
        this.direccion = direccion;
        this.pais = pais;
    }

    public Direccion(String etiqueta, String direccion, String pais) {
        this.etiqueta = etiqueta;
        this.direccion = direccion;
        this.pais = pais;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Contacto getContacto() {
        return contacto;
    }

    public void setContacto(Contacto contacto) {
        this.contacto = contacto;
    }

    /**
     * @return the etiqueta
     */
    public String getEtiqueta() {
        return etiqueta;
    }

    /**
     * @param etiqueta the etiqueta to set
     */
    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the pais
     */
    public String getPais() {
        return pais;
    }

    /**
     * @param pais the pais to set
     */
    public void setPais(String pais) {
        this.pais = pais;
    }
}

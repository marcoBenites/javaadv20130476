/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.javaadv.mod3.repaso;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author JAVA-ADV
 */
@Entity
public class Noticia implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    private String titulo;
    private String encabezado;
    private String cuerpo;
    @ManyToOne
    private Periodista autor;
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    private String palabrasClave;

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
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the encabezado
     */
    public String getEncabezado() {
        return encabezado;
    }

    /**
     * @param encabezado the encabezado to set
     */
    public void setEncabezado(String encabezado) {
        this.encabezado = encabezado;
    }

    /**
     * @return the cuerpo
     */
    public String getCuerpo() {
        return cuerpo;
    }

    /**
     * @param cuerpo the cuerpo to set
     */
    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    /**
     * @return the autor
     */
    public Periodista getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(Periodista autor) {
        this.autor = autor;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the palabrasClave
     */
    public String getPalabrasClave() {
        return palabrasClave;
    }

    /**
     * @param palabrasClave the palabrasClave to set
     */
    public void setPalabrasClave(String palabrasClave) {
        this.palabrasClave = palabrasClave;
    }
}

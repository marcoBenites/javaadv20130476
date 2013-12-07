/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.model;

import java.io.Serializable;


public class TarjetaMembresia implements Serializable{

    private Integer codigo;
    private String numero;
    private Character categoria;

    public TarjetaMembresia() {
    }

    public TarjetaMembresia(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Character getCategoria() {
        return categoria;
    }

    public void setCategoria(Character categoria) {
        this.categoria = categoria;
    }

   

    @Override
    public String toString() {
        return "TarjetaMembresia{" + "codigo=" + codigo + ", numero=" + numero + ", categor\u00eda=" + categoria + '}';
    }
   
    
    
}


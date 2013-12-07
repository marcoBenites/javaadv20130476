/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.model;

import java.io.Serializable;

public class Sugerencia implements Serializable{
    
    private Integer codigo;
    private String descripcion;
    private Cliente cliente;

    public Sugerencia() {
    }

    public Sugerencia(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Sugerencia{" + "codigo=" + codigo + ", descripcion=" + descripcion + ", cliente=" + cliente + '}';
    }

    
    
}


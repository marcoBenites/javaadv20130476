/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

public class Cliente implements Serializable {

    private Integer codigo;
    private String nombre;
    private String apellido;
    private Date fechaRegistro;
    private Date fechaVerificacion;
    private String direccion;
    private String codigoPostal;
    //RELACIONES
    private Ciudad ciudad;
    private TarjetaMembresia tarjetaMembresia;
    private Collection<Sugerencia> sugerencias;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Date getFechaVerificacion() {
        return fechaVerificacion;
    }

    public void setFechaVerificacion(Date fechaVerificacion) {
        this.fechaVerificacion = fechaVerificacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public TarjetaMembresia getTarjetaMembresia() {
        return tarjetaMembresia;
    }

    public void setTarjetaMembresia(TarjetaMembresia tarjetaMembresia) {
        this.tarjetaMembresia = tarjetaMembresia;
    }

    public Collection<Sugerencia> getSugerencias() {
        return sugerencias;
    }

    public void setSugerencias(Collection<Sugerencia> sugerencias) {
        this.sugerencias = sugerencias;
    }

    @Override
    public String toString() {
        return "Cliente{" + "codigo=" + codigo + ", nombre=" + nombre + ", apellido=" + apellido + ", fechaRegistro=" + fechaRegistro + ", fechaVerificacion=" + fechaVerificacion + ", direccion=" + direccion + ", codigoPostal=" + codigoPostal + ", ciudad=" + ciudad + ", tarjetaMembresia=" + tarjetaMembresia + ", sugerencias=" + sugerencias + '}';
    }
}
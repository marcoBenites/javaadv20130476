/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.apache.ibatis.session.SqlSession;
import pe.edu.cibertec.data.mapper.EmpleadoMapper;
import pe.edu.cibertec.model.Empleado;

/**
 *
 * @author Jorge
 */
@Named
@SessionScoped
public class EmpleadoBean implements Serializable{

    private boolean flag=false;
    
    private List<Empleado> listaEmpleado = new ArrayList<>();
    @Inject
    Empleado empleado;
    @Inject
    EmpleadoMapper mapper;
    @Inject
    SqlSession session;

    public EmpleadoBean() {
    
    }
    

    public void buscarByEmpleado(Empleado emple){
    
    empleado=mapper.buscarByEmpleado(emple);
     System.out.println("empleado" + empleado.toString());
     flag=true;
    
    }
    
    
    public void listarTodos() {
        listaEmpleado = mapper.listarTodos();
        System.out.println("tamaño lista empleados: " + listaEmpleado.size());
        System.out.println("tamaño lista empleados: " + listaEmpleado.toString());
flag=false;
    }
    
    public void modificar(Empleado empleado){
        mapper.modificar(empleado);
        session.commit();
        flag=false;
                            }

    public void insertar(Empleado empleado) {
        mapper.insertar(empleado);
        session.commit();

    }
    public void eliminar(Empleado empleado) {
        mapper.eliminar(empleado);
        session.commit();

    }

    public List<Empleado> getListaEmpleado() {
        return listaEmpleado;
    }

    public void setListaEmpleado(List<Empleado> listaEmpleado) {
        this.listaEmpleado = listaEmpleado;
    }

    public EmpleadoMapper getMapper() {
        return mapper;
    }

    public void setMapper(EmpleadoMapper mapper) {
        this.mapper = mapper;
    }

    public SqlSession getSession() {
        return session;
    }

    public void setSession(SqlSession session) {
        this.session = session;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
    
    
    
    
}

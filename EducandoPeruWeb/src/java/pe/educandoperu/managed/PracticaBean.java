/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.educandoperu.managed;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Jose
 */
@ManagedBean(name = "practicaBean")
@SessionScoped
public class PracticaBean {

    private PracticaBean practica = new PracticaBean();
    
    public PracticaBean() {
    }

    public PracticaBean getPractica() {
        return practica;
    }

    public void setPractica(PracticaBean practica) {
        this.practica = practica;
    }
    
    
}

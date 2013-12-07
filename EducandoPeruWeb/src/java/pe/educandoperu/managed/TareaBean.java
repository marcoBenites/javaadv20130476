/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.educandoperu.managed;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Jose
 */
@ManagedBean(name = "tareaBean")
@RequestScoped
public class TareaBean {

    private TareaBean tarea = new TareaBean();
    
    public TareaBean() {
    }

    public TareaBean getTarea() {
        return tarea;
    }

    public void setTarea(TareaBean tarea) {
        this.tarea = tarea;
    }
    
    
}

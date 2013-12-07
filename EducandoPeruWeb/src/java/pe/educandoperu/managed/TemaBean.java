/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.educandoperu.managed;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import pe.educandoperu.bean.Tema;

/**
 *
 * @author Jose
 */
@ManagedBean(name = "temaBean")
@SessionScoped
public class TemaBean {

    private Tema tema = new Tema();
    
    public TemaBean() {
    }

    public Tema getTema() {
        return tema;
    }

    public void setTema(Tema tema) {
        this.tema = tema;
    }
    
    
}

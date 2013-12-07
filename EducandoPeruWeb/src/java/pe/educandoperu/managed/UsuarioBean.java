/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.educandoperu.managed;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import pe.educandoperu.bean.Usuario;


@ManagedBean(name = "usuarioBean")
@SessionScoped
public class UsuarioBean {
    
    private Usuario usuario = new Usuario();
    
    public UsuarioBean() {
        
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public String iniciarSesion()
    {
        boolean resultado = true;
        
        if (!resultado){
            //cuando el return del servicio es incorrecto
            FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_ERROR,"Credenciales incorrectas","Verifique sus credenciales");
            FacesContext.getCurrentInstance().addMessage(null, fm);
            
            return null;
        }else{
            //cuando el return del servicio es correcto
            usuario.setPassUser(null);
            return "";
        }
        
        
    }
}

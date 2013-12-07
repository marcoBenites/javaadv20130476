/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.javaadv.mod3.repaso;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author JAVA-ADV
 */
@Stateless
public class NoticiaFacade extends AbstractFacade<Noticia> {
    @PersistenceContext(unitName = "repasoMod3PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public NoticiaFacade() {
        super(Noticia.class);
    }
    
}

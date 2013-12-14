/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.javaadv.mod3.solexamen.jpa;

import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import pe.edu.cibertec.javaadv.mod3.solexamen.Contacto;
import pe.edu.cibertec.javaadv.mod3.solexamen.ContactoController;

/**
 *
 * @author JAVA-ADV
 */
@Stateless
public class ContactoControllerImpl implements ContactoController {

    @PersistenceContext(unitName = "examenmod3PU")
    private EntityManager em;

    @Override
    public void insertar(Contacto t) {
        em.persist(t);
    }

    @Override
    public List<Contacto> buscar() {
        return em.createQuery("SELECT o from Contacto o", Contacto.class).getResultList();
    }

    @Override
    public Contacto buscar(Long i) {
        return em.find(Contacto.class, i);
    }

    @Override
    public void modificar(Contacto t) {
        em.merge(t);
    }

    @Override
    public void eliminar(Long i) {
        em.createQuery("DELETE FROM Contacto o WHERE o.id=:id").setParameter("id", i).executeUpdate();
    }
}

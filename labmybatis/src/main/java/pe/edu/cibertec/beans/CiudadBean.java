/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.beans;

import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import org.apache.ibatis.session.SqlSession;
import pe.edu.cibertec.data.mapper.CiudadMapper;
import pe.edu.cibertec.model.Ciudad;

/**
 *
 * @author JAVA-ADV
 */
@Named
public class CiudadBean {

    @Inject
    CiudadMapper mapper;
    @Inject
    SqlSession session;

    public void grabar(Ciudad ciudad) {
        mapper.insertar(ciudad);
        session.commit();
    }

    public List<Ciudad> getList() {
        return mapper.obtenerCiudadesRTModel();
    }

    public void eliminar(Ciudad ciudad) {
        mapper.eliminar(ciudad);
        session.commit();
    }
}

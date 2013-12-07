/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.util;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import org.apache.ibatis.session.SqlSession;
import pe.edu.cibertec.data.mapper.CiudadMapper;
import pe.edu.cibertec.data.mapper.ClienteMapper;
import pe.edu.cibertec.data.mapper.EmpleadoMapper;
/**
 *
 * @author JAVA-ADV
 */
public class MapperProducer {

    @Inject
    SqlSession session;

    @RequestScoped
    @Produces
    CiudadMapper getCiudadMapper() {
        return session.getMapper(CiudadMapper.class);
    }

    @RequestScoped
    @Produces
    ClienteMapper getClienteMapper() {
        return session.getMapper(ClienteMapper.class);
    }
    
    @RequestScoped
    @Produces
    EmpleadoMapper getEmpleadoMapper() {
        return session.getMapper(EmpleadoMapper.class);
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.data.mapper;

import java.util.List;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import pe.edu.cibertec.model.Cliente;

/**
 *
 * @author JAVA-ADV
 */
public interface ClienteMapper {

    @Select("Select t1.*, t2.DESCRIPTION as CITY_DESCRIPTION from tab_client t1 inner join tab_city t2 on t1.CITY = t2.IDENTIFIER")
    @ResultMap("clienteRM")
    List<Cliente> obtenerClientes();
}

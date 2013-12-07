/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.data.mapper;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import pe.edu.cibertec.model.Ciudad;

/**
 *
 * @author JAVA-ADV
 */
public interface CiudadMapper {

    String INSERT = "insert into tab_city (DESCRIPTION) values(#{descripcion})";
    String DELETE = "delete from tab_city where IDENTIFIER = #{codigo}";
    String UPDATE = "update tab_city set DESCRIPTION=#{descripcion} where IDENTIFIER = #{codigo}";

    @Insert(INSERT)
    void insertar(Ciudad ciudad);

    @Delete(DELETE)
    void eliminar(Ciudad ciudad);

    @Update(UPDATE)
    void modificar(Ciudad ciudad);

    @Select("select * from tab_city where IDENTIFIER = #{codigo}")
    @ResultMap("ciudadRMModel")
    Ciudad obtenerCuidad(Integer ciudad);

    @Select("select * from tab_city")
    @ResultMap("ciudadRMModel")
    List<Ciudad> obtenerCiudadesRTModel();

    @Select("select * from tab_city")
    @ResultMap("ciudadRMModel")
    List<Map> obtenerCiudadesRTMap();
}

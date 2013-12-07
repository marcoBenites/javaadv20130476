/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.data.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import pe.edu.cibertec.model.Empleado;

/**
 *
 * @author Jorge
 */
public interface EmpleadoMapper {

    @Select("select *from empleado")
    @ResultMap("EmpleadoRM")
    List<Empleado> listarTodos();

    @Insert("insert into empleado(nombre,apellido) values(#{nombre},#{apellido})")
    void insertar(Empleado empleado);

    @Update("update  empleado set nombre=#{nombre},apellido=#{apellido} where codigo=#{codigo}")
    void modificar(Empleado empleado);

    @Delete("delete from empleado where codigo=#{codigo}")
    void eliminar(Empleado empleado);

    @Select("select *from empleado where codigo=#{codigo}")
    @ResultMap("EmpleadoRM")
    Empleado buscarByEmpleado(Empleado empleado);
}

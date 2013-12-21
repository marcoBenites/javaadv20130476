/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.javaadv.mod4.asistencias.service;

import java.util.Date;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.QueryParam;
import org.springframework.context.ApplicationContext;
import pe.edu.cibertec.javaadv.mod4.asistencias.Asistencia;
import pe.edu.cibertec.javaadv.mod4.asistencias.ClassEvent;

/**
 * REST Web Service
 *
 * @author JAVA-ADV
 */
@Path("asistencia")
@RequestScoped
public class AsistenciaResource {

    @Context
    private UriInfo context;
    @Inject
    private ApplicationContext spring;

    /**
     * Creates a new instance of AsistenciaResource
     */
    public AsistenciaResource() {
    }

    /**
     * Retrieves representation of an instance of
     * pe.edu.cibertec.javaadv.mod4.asistencias.service.AsistenciaResource
     *
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("application/json")
    public ClassEvent getJson(@QueryParam("date") Date date, @QueryParam("teacherCode") String teacherCode) {
        //if (date......)
        //if (teacherCode....)
        return spring.getBean(Asistencia.class).findClassEvent(date, teacherCode);
    }

    /**
     * PUT method for updating or creating an instance of AsistenciaResource
     *
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("application/json")
    public ClassEvent putJson(ClassEvent content) {
        return spring.getBean(Asistencia.class).save(content);
    }
}

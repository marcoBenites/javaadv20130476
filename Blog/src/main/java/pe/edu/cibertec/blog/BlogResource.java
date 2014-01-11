/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.blog;

import java.util.List;
import javax.ejb.Stateless;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.PathParam;

/**
 * REST Web Service
 *
 * @author JAVA-ADV
 */
@Path("blog/entry")
@Stateless
@Restrict
@Log
public class BlogResource {

    @Inject
    BlogDomain domain;

    @Inject
    HttpServletRequest request;

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of BlogResource
     */
    public BlogResource() {
    }

    /**
     * Retrieves representation of an instance of
     * pe.edu.cibertec.blog.BlogResource
     *
     * @return an instance of pe.edu.cibertec.blog.BlogEntry
     */
    @GET
    @Produces("application/json")
    public List<BlogEntry> find() {
        String user = (String) request.getAttribute("user");
        return domain.getEntries(user);
    }

    @GET
    @Path("{user}")
    @Produces("application/json")
    public List<BlogEntry> findForUser(@PathParam("user") String user) {
        return domain.getEntries(user);
    }

    /**
     * PUT method for updating or creating an instance of BlogResource
     *
     * @param user
     * @param content representation for the resource
     */
    @PUT
    @Path("{user}")
    @Consumes("application/json")
    @Requires("operation(addEntry)")
    public void addEntry(@PathParam("user") String user, BlogEntry content) {
        String auth_user = (String) request.getSession().getAttribute("user");
        if (user.equals(auth_user)) {
            domain.addEntry(user, content);
        }
    }
}

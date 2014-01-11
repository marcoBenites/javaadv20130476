/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.blog.service;

import pe.edu.cibertec.blog.domain.BlogEntry;
import pe.edu.cibertec.blog.domain.BlogDomain;
import pe.edu.cibertec.blog.tools.Log;
import pe.edu.cibertec.blog.security.Restrict;
import pe.edu.cibertec.blog.security.Requires;
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
import javax.ws.rs.PathParam;
import pe.edu.cibertec.blog.security.IdentityManager;
import pe.edu.cibertec.blog.security.LoggedIn;

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
    IdentityManager identity;

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
    @LoggedIn
    public List<BlogEntry> find() {
        return domain.getEntries(identity.getUser());
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
        if (user.equals(identity.getUser())) {
            domain.addEntry(user, content);
        }
    }
}

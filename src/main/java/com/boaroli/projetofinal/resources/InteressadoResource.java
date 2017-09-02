package com.boaroli.projetofinal.resources;

import com.boaroli.projetofinal.model.Interessado;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/interessados")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.TEXT_PLAIN)
@Stateless
public class InteressadoResource {
    
    @PersistenceContext
    private EntityManager em;
    
    @POST
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public Response create(Interessado interessado) {
        em.persist(interessado);
        return Response.ok(interessado).build();
    }
}

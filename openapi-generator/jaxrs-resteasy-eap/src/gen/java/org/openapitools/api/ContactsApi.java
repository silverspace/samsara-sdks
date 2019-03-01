package org.openapitools.api;

import org.openapitools.model.*;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.Contact;

import java.util.List;
import java.util.Map;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/contacts")


@io.swagger.annotations.Api(description = "the contacts API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-03-01T05:35:34.911Z[GMT]")
public interface ContactsApi  {
   
    @GET
    @Path("/{contact_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/contacts/{contact_id}", notes = "Fetch a contact by its id.", response = Contact.class, tags={ "Fleet", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The contact.", response = Contact.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getOrganizationContact( @NotNull @QueryParam("access_token") String accessToken, @PathParam("contact_id") Long contactId,@Context SecurityContext securityContext);
    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/contacts", notes = "Fetch all contacts for the organization.", response = Contact.class, responseContainer = "List", tags={ "Fleet", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "List of contacts.", response = Contact.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response listContacts( @NotNull @QueryParam("access_token") String accessToken,@Context SecurityContext securityContext);
}

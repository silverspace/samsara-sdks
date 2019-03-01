package org.openapitools.api;

import org.openapitools.model.Contact;
import org.openapitools.api.ContactsApiService;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import io.swagger.annotations.*;
import java.io.InputStream;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
@Path("/contacts")
@RequestScoped

@Api(description = "the contacts API")


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2019-03-01T05:35:11.852Z[GMT]")

public class ContactsApi  {

  @Context SecurityContext securityContext;

  @Inject ContactsApiService delegate;


    @GET
    @Path("/{contact_id}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "/contacts/{contact_id}", notes = "Fetch a contact by its id.", response = Contact.class, tags={ "Fleet",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The contact.", response = Contact.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getOrganizationContact( @NotNull @ApiParam(value = "Samsara API access token.",required=true)  @QueryParam("access_token") String accessToken, @ApiParam(value = "ID of the contact",required=true) @PathParam("contact_id") Long contactId) {
        return delegate.getOrganizationContact(accessToken, contactId, securityContext);
    }

    @GET
    
    
    @Produces({ "application/json" })
    @ApiOperation(value = "/contacts", notes = "Fetch all contacts for the organization.", response = Contact.class, responseContainer = "List", tags={ "Fleet" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of contacts.", response = Contact.class, responseContainer = "List"),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response listContacts( @NotNull @ApiParam(value = "Samsara API access token.",required=true)  @QueryParam("access_token") String accessToken) {
        return delegate.listContacts(accessToken, securityContext);
    }
}

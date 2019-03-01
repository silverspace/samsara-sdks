package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.ContactsApiService;
import org.openapitools.api.factories.ContactsApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.Contact;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/contacts")


@io.swagger.annotations.Api(description = "the contacts API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-03-01T05:34:26.765Z[GMT]")
public class ContactsApi  {
   private final ContactsApiService delegate = ContactsApiServiceFactory.getContactsApi();

    @GET
    @Path("/{contact_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/contacts/{contact_id}", notes = "Fetch a contact by its id.", response = Contact.class, tags={ "Fleet", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The contact.", response = Contact.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = Contact.class) })
    public Response getOrganizationContact(@ApiParam(value = "Samsara API access token.",required=true) @QueryParam("access_token") String accessToken
,@ApiParam(value = "ID of the contact",required=true) @PathParam("contact_id") Long contactId
)
    throws NotFoundException {
        return delegate.getOrganizationContact(accessToken,contactId);
    }
    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/contacts", notes = "Fetch all contacts for the organization.", response = Contact.class, responseContainer = "List", tags={ "Fleet", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "List of contacts.", response = Contact.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = Contact.class, responseContainer = "List") })
    public Response listContacts(@ApiParam(value = "Samsara API access token.",required=true) @QueryParam("access_token") String accessToken
)
    throws NotFoundException {
        return delegate.listContacts(accessToken);
    }
}

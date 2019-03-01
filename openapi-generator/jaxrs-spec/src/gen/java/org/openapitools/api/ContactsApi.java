package org.openapitools.api;

import org.openapitools.model.Contact;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/contacts")
@Api(description = "the contacts API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2019-03-01T05:35:42.406Z[GMT]")
public class ContactsApi {

    @GET
    @Path("/{contact_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "/contacts/{contact_id}", notes = "Fetch a contact by its id.", response = Contact.class, tags={ "Fleet",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The contact.", response = Contact.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class)
    })
    public Response getOrganizationContact(@QueryParam("access_token") @NotNull   @ApiParam("Samsara API access token.")  String accessToken,@PathParam("contact_id") @ApiParam("ID of the contact") Long contactId) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Produces({ "application/json" })
    @ApiOperation(value = "/contacts", notes = "Fetch all contacts for the organization.", response = Contact.class, responseContainer = "List", tags={ "Fleet" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of contacts.", response = Contact.class, responseContainer = "List"),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class)
    })
    public Response listContacts(@QueryParam("access_token") @NotNull   @ApiParam("Samsara API access token.")  String accessToken) {
        return Response.ok().entity("magic!").build();
    }
}

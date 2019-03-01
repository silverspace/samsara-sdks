package org.openapitools.api;

import org.openapitools.model.Address;
import org.openapitools.model.InlineObject;
import org.openapitools.model.InlineObject1;
import org.openapitools.api.AddressesApiService;

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
@Path("/addresses")
@RequestScoped

@Api(description = "the addresses API")


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2019-03-01T05:35:11.852Z[GMT]")

public class AddressesApi  {

  @Context SecurityContext securityContext;

  @Inject AddressesApiService delegate;


    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/addresses", notes = "Add one or more addresses to the organization", response = Address.class, responseContainer = "List", tags={ "Fleet",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of added addresses/geofences. For each address entry, the geofence field will only be populated with either 'circle' or 'polygon', depending on the geofence type. Circle geofences added without a specific lat/lng are geocoded asynchronously, and will be 0,0 in the immediate response.", response = Address.class, responseContainer = "List"),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response addOrganizationAddresses( @NotNull @ApiParam(value = "Samsara API access token.",required=true)  @QueryParam("access_token") String accessToken, @ApiParam(value = "" ,required=true) InlineObject addresses) {
        return delegate.addOrganizationAddresses(accessToken, addresses, securityContext);
    }

    @DELETE
    @Path("/{addressId}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "/addresses/{addressId}", notes = "Delete an address.", response = Void.class, tags={ "Fleet",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Address was successfully deleted. No response body is returned.", response = Void.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response deleteOrganizationAddress( @NotNull @ApiParam(value = "Samsara API access token.",required=true)  @QueryParam("access_token") String accessToken, @ApiParam(value = "ID of the address/geofence",required=true) @PathParam("addressId") Long addressId) {
        return delegate.deleteOrganizationAddress(accessToken, addressId, securityContext);
    }

    @GET
    @Path("/{addressId}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "/addresses/{addressId}", notes = "Fetch an address by its id.", response = Address.class, tags={ "Fleet",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The address/geofence. The geofence field will only be populated with either 'circle' or 'polygon', depending on the geofence type.", response = Address.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getOrganizationAddress( @NotNull @ApiParam(value = "Samsara API access token.",required=true)  @QueryParam("access_token") String accessToken, @ApiParam(value = "ID of the address/geofence",required=true) @PathParam("addressId") Long addressId) {
        return delegate.getOrganizationAddress(accessToken, addressId, securityContext);
    }

    @GET
    
    
    @Produces({ "application/json" })
    @ApiOperation(value = "/addresses", notes = "Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.", response = Address.class, responseContainer = "List", tags={ "Fleet",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of addresses/geofences. For each address entry, the geofence field will only be populated with either 'circle' or 'polygon', depending on the geofence type.", response = Address.class, responseContainer = "List"),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getOrganizationAddresses( @NotNull @ApiParam(value = "Samsara API access token.",required=true)  @QueryParam("access_token") String accessToken) {
        return delegate.getOrganizationAddresses(accessToken, securityContext);
    }

    @PATCH
    @Path("/{addressId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/addresses/{addressId}", notes = "Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.", response = Void.class, tags={ "Fleet" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Address was successfully updated. No response body is returned.", response = Void.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response updateOrganizationAddress( @NotNull @ApiParam(value = "Samsara API access token.",required=true)  @QueryParam("access_token") String accessToken, @ApiParam(value = "ID of the address/geofence",required=true) @PathParam("addressId") Long addressId, @ApiParam(value = "" ,required=true) InlineObject1 address) {
        return delegate.updateOrganizationAddress(accessToken, addressId, address, securityContext);
    }
}

package org.openapitools.api;

import org.openapitools.model.*;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.Address;
import org.openapitools.model.InlineObject;
import org.openapitools.model.InlineObject1;

import java.util.List;
import java.util.Map;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/addresses")


@io.swagger.annotations.Api(description = "the addresses API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-03-01T05:35:34.911Z[GMT]")
public interface AddressesApi  {
   
    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/addresses", notes = "Add one or more addresses to the organization", response = Address.class, responseContainer = "List", tags={ "Fleet", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "List of added addresses/geofences. For each address entry, the geofence field will only be populated with either 'circle' or 'polygon', depending on the geofence type. Circle geofences added without a specific lat/lng are geocoded asynchronously, and will be 0,0 in the immediate response.", response = Address.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response addOrganizationAddresses( @NotNull @QueryParam("access_token") String accessToken,@ApiParam(value = "" ,required=true) @NotNull @Valid InlineObject addresses,@Context SecurityContext securityContext);
    @DELETE
    @Path("/{addressId}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/addresses/{addressId}", notes = "Delete an address.", response = Void.class, tags={ "Fleet", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Address was successfully deleted. No response body is returned.", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response deleteOrganizationAddress( @NotNull @QueryParam("access_token") String accessToken, @PathParam("addressId") Long addressId,@Context SecurityContext securityContext);
    @GET
    @Path("/{addressId}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/addresses/{addressId}", notes = "Fetch an address by its id.", response = Address.class, tags={ "Fleet", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The address/geofence. The geofence field will only be populated with either 'circle' or 'polygon', depending on the geofence type.", response = Address.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getOrganizationAddress( @NotNull @QueryParam("access_token") String accessToken, @PathParam("addressId") Long addressId,@Context SecurityContext securityContext);
    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/addresses", notes = "Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.", response = Address.class, responseContainer = "List", tags={ "Fleet", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "List of addresses/geofences. For each address entry, the geofence field will only be populated with either 'circle' or 'polygon', depending on the geofence type.", response = Address.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getOrganizationAddresses( @NotNull @QueryParam("access_token") String accessToken,@Context SecurityContext securityContext);
    @PATCH
    @Path("/{addressId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/addresses/{addressId}", notes = "Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.", response = Void.class, tags={ "Fleet", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Address was successfully updated. No response body is returned.", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response updateOrganizationAddress( @NotNull @QueryParam("access_token") String accessToken, @PathParam("addressId") Long addressId,@ApiParam(value = "" ,required=true) @NotNull @Valid InlineObject1 address,@Context SecurityContext securityContext);
}

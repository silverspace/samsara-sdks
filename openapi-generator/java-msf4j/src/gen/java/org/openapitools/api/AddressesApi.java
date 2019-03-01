package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.AddressesApiService;
import org.openapitools.api.factories.AddressesApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.Address;
import org.openapitools.model.InlineObject;
import org.openapitools.model.InlineObject1;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/addresses")


@io.swagger.annotations.Api(description = "the addresses API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-03-01T05:34:26.765Z[GMT]")
public class AddressesApi  {
   private final AddressesApiService delegate = AddressesApiServiceFactory.getAddressesApi();

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/addresses", notes = "Add one or more addresses to the organization", response = Address.class, responseContainer = "List", tags={ "Fleet", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "List of added addresses/geofences. For each address entry, the geofence field will only be populated with either 'circle' or 'polygon', depending on the geofence type. Circle geofences added without a specific lat/lng are geocoded asynchronously, and will be 0,0 in the immediate response.", response = Address.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = Address.class, responseContainer = "List") })
    public Response addOrganizationAddresses(@ApiParam(value = "Samsara API access token.",required=true) @QueryParam("access_token") String accessToken
,@ApiParam(value = "" ,required=true) InlineObject addresses
)
    throws NotFoundException {
        return delegate.addOrganizationAddresses(accessToken,addresses);
    }
    @DELETE
    @Path("/{addressId}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/addresses/{addressId}", notes = "Delete an address.", response = Void.class, tags={ "Fleet", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Address was successfully deleted. No response body is returned.", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = Void.class) })
    public Response deleteOrganizationAddress(@ApiParam(value = "Samsara API access token.",required=true) @QueryParam("access_token") String accessToken
,@ApiParam(value = "ID of the address/geofence",required=true) @PathParam("addressId") Long addressId
)
    throws NotFoundException {
        return delegate.deleteOrganizationAddress(accessToken,addressId);
    }
    @GET
    @Path("/{addressId}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/addresses/{addressId}", notes = "Fetch an address by its id.", response = Address.class, tags={ "Fleet", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The address/geofence. The geofence field will only be populated with either 'circle' or 'polygon', depending on the geofence type.", response = Address.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = Address.class) })
    public Response getOrganizationAddress(@ApiParam(value = "Samsara API access token.",required=true) @QueryParam("access_token") String accessToken
,@ApiParam(value = "ID of the address/geofence",required=true) @PathParam("addressId") Long addressId
)
    throws NotFoundException {
        return delegate.getOrganizationAddress(accessToken,addressId);
    }
    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/addresses", notes = "Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.", response = Address.class, responseContainer = "List", tags={ "Fleet", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "List of addresses/geofences. For each address entry, the geofence field will only be populated with either 'circle' or 'polygon', depending on the geofence type.", response = Address.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = Address.class, responseContainer = "List") })
    public Response getOrganizationAddresses(@ApiParam(value = "Samsara API access token.",required=true) @QueryParam("access_token") String accessToken
)
    throws NotFoundException {
        return delegate.getOrganizationAddresses(accessToken);
    }
    @PATCH
    @Path("/{addressId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/addresses/{addressId}", notes = "Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.", response = Void.class, tags={ "Fleet", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Address was successfully updated. No response body is returned.", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = Void.class) })
    public Response updateOrganizationAddress(@ApiParam(value = "Samsara API access token.",required=true) @QueryParam("access_token") String accessToken
,@ApiParam(value = "ID of the address/geofence",required=true) @PathParam("addressId") Long addressId
,@ApiParam(value = "" ,required=true) InlineObject1 address
)
    throws NotFoundException {
        return delegate.updateOrganizationAddress(accessToken,addressId,address);
    }
}

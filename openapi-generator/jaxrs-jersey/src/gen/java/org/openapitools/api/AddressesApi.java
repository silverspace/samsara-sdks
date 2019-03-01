package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.AddressesApiService;
import org.openapitools.api.factories.AddressesApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.Address;
import org.openapitools.model.InlineObject;
import org.openapitools.model.InlineObject1;

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/addresses")


@io.swagger.annotations.Api(description = "the addresses API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2019-03-01T05:35:19.593Z[GMT]")
public class AddressesApi  {
   private final AddressesApiService delegate;

   public AddressesApi(@Context ServletConfig servletContext) {
      AddressesApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("AddressesApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (AddressesApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = AddressesApiServiceFactory.getAddressesApi();
      }

      this.delegate = delegate;
   }

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/addresses", notes = "Add one or more addresses to the organization", response = Address.class, responseContainer = "List", tags={ "Fleet", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "List of added addresses/geofences. For each address entry, the geofence field will only be populated with either 'circle' or 'polygon', depending on the geofence type. Circle geofences added without a specific lat/lng are geocoded asynchronously, and will be 0,0 in the immediate response.", response = Address.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response addOrganizationAddresses(@ApiParam(value = "Samsara API access token.",required=true) @QueryParam("access_token") String accessToken
,@ApiParam(value = "" ,required=true) @NotNull @Valid InlineObject addresses
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.addOrganizationAddresses(accessToken,addresses,securityContext);
    }
    @DELETE
    @Path("/{addressId}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/addresses/{addressId}", notes = "Delete an address.", response = Void.class, tags={ "Fleet", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Address was successfully deleted. No response body is returned.", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response deleteOrganizationAddress(@ApiParam(value = "Samsara API access token.",required=true) @QueryParam("access_token") String accessToken
,@ApiParam(value = "ID of the address/geofence",required=true) @PathParam("addressId") Long addressId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteOrganizationAddress(accessToken,addressId,securityContext);
    }
    @GET
    @Path("/{addressId}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/addresses/{addressId}", notes = "Fetch an address by its id.", response = Address.class, tags={ "Fleet", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The address/geofence. The geofence field will only be populated with either 'circle' or 'polygon', depending on the geofence type.", response = Address.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getOrganizationAddress(@ApiParam(value = "Samsara API access token.",required=true) @QueryParam("access_token") String accessToken
,@ApiParam(value = "ID of the address/geofence",required=true) @PathParam("addressId") Long addressId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getOrganizationAddress(accessToken,addressId,securityContext);
    }
    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/addresses", notes = "Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.", response = Address.class, responseContainer = "List", tags={ "Fleet", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "List of addresses/geofences. For each address entry, the geofence field will only be populated with either 'circle' or 'polygon', depending on the geofence type.", response = Address.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getOrganizationAddresses(@ApiParam(value = "Samsara API access token.",required=true) @QueryParam("access_token") String accessToken
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getOrganizationAddresses(accessToken,securityContext);
    }
    @PATCH
    @Path("/{addressId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/addresses/{addressId}", notes = "Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.", response = Void.class, tags={ "Fleet", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Address was successfully updated. No response body is returned.", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response updateOrganizationAddress(@ApiParam(value = "Samsara API access token.",required=true) @QueryParam("access_token") String accessToken
,@ApiParam(value = "ID of the address/geofence",required=true) @PathParam("addressId") Long addressId
,@ApiParam(value = "" ,required=true) @NotNull @Valid InlineObject1 address
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateOrganizationAddress(accessToken,addressId,address,securityContext);
    }
}

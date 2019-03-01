package io.swagger.api;

import io.swagger.model.Address;
import io.swagger.model.Addresses;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/addresses")
@Api(description = "the addresses API")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2019-03-01T04:20:18.722Z")
public class AddressesApi {

    @POST
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/addresses", notes = "Add one or more addresses to the organization", response = Address.class, responseContainer = "List", tags={ "Fleet",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of added addresses/geofences. For each address entry, the geofence field will only be populated with either 'circle' or 'polygon', depending on the geofence type. Circle geofences added without a specific lat/lng are geocoded asynchronously, and will be 0,0 in the immediate response.", response = Address.class, responseContainer = "List"),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class)
    })
    public Response addOrganizationAddresses(@QueryParam("access_token") @NotNull   @ApiParam("Samsara API access token.")  String accessToken,@Valid Addresses addresses) {
        return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/{addressId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/addresses/{addressId}", notes = "Delete an address.", response = Void.class, tags={ "Fleet",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Address was successfully deleted. No response body is returned.", response = Void.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class)
    })
    public Response deleteOrganizationAddress(@QueryParam("access_token") @NotNull   @ApiParam("Samsara API access token.")  String accessToken,@PathParam("addressId") @ApiParam("ID of the address/geofence") Long addressId) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{addressId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/addresses/{addressId}", notes = "Fetch an address by its id.", response = Address.class, tags={ "Fleet",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The address/geofence. The geofence field will only be populated with either 'circle' or 'polygon', depending on the geofence type.", response = Address.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class)
    })
    public Response getOrganizationAddress(@QueryParam("access_token") @NotNull   @ApiParam("Samsara API access token.")  String accessToken,@PathParam("addressId") @ApiParam("ID of the address/geofence") Long addressId) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/addresses", notes = "Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.", response = Address.class, responseContainer = "List", tags={ "Fleet",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of addresses/geofences. For each address entry, the geofence field will only be populated with either 'circle' or 'polygon', depending on the geofence type.", response = Address.class, responseContainer = "List"),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class)
    })
    public Response getOrganizationAddresses(@QueryParam("access_token") @NotNull   @ApiParam("Samsara API access token.")  String accessToken) {
        return Response.ok().entity("magic!").build();
    }

    @PATCH
    @Path("/{addressId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/addresses/{addressId}", notes = "Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.", response = Void.class, tags={ "Fleet" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Address was successfully updated. No response body is returned.", response = Void.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class)
    })
    public Response updateOrganizationAddress(@QueryParam("access_token") @NotNull   @ApiParam("Samsara API access token.")  String accessToken,@Valid Address address,@PathParam("addressId") @ApiParam("ID of the address/geofence") Long addressId) {
        return Response.ok().entity("magic!").build();
    }
}

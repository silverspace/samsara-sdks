package org.openapitools.api;

import org.openapitools.model.UserRole;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/user_roles")
@Api(description = "the user_roles API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2019-03-01T05:35:42.406Z[GMT]")
public class UserRolesApi {

    @GET
    @Produces({ "application/json" })
    @ApiOperation(value = "/user_roles", notes = "Get all roles in the organization.", response = UserRole.class, responseContainer = "List", tags={ "Users" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of user roles.", response = UserRole.class, responseContainer = "List"),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class)
    })
    public Response listUserRoles(@QueryParam("access_token") @NotNull   @ApiParam("Samsara API access token.")  String accessToken) {
        return Response.ok().entity("magic!").build();
    }
}

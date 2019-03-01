package io.swagger.api;

import io.swagger.model.UserRole;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/user_roles")
@Api(description = "the user_roles API")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2019-03-01T04:20:18.722Z")
public class UserRolesApi {

    @GET
    @Consumes({ "application/json" })
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

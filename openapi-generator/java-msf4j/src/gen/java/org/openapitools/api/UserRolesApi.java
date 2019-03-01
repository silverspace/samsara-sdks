package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.UserRolesApiService;
import org.openapitools.api.factories.UserRolesApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.UserRole;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/user_roles")


@io.swagger.annotations.Api(description = "the user_roles API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-03-01T05:34:26.765Z[GMT]")
public class UserRolesApi  {
   private final UserRolesApiService delegate = UserRolesApiServiceFactory.getUserRolesApi();

    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/user_roles", notes = "Get all roles in the organization.", response = UserRole.class, responseContainer = "List", tags={ "Users", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "List of user roles.", response = UserRole.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = UserRole.class, responseContainer = "List") })
    public Response listUserRoles(@ApiParam(value = "Samsara API access token.",required=true) @QueryParam("access_token") String accessToken
)
    throws NotFoundException {
        return delegate.listUserRoles(accessToken);
    }
}

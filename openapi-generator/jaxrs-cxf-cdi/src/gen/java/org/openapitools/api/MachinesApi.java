package org.openapitools.api;

import org.openapitools.model.InlineObject17;
import org.openapitools.model.InlineObject18;
import org.openapitools.model.InlineResponse2007;
import org.openapitools.model.MachineHistoryResponse;
import org.openapitools.api.MachinesApiService;

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
@Path("/machines")
@RequestScoped

@Api(description = "the machines API")


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2019-03-01T05:35:11.852Z[GMT]")

public class MachinesApi  {

  @Context SecurityContext securityContext;

  @Inject MachinesApiService delegate;


    @POST
    @Path("/list")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/machines/list", notes = "Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and information about them.", response = InlineResponse2007.class, tags={ "Industrial",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of machine objects.", response = InlineResponse2007.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getMachines( @NotNull @ApiParam(value = "Samsara API access token.",required=true)  @QueryParam("access_token") String accessToken, @ApiParam(value = "" ,required=true) InlineObject18 groupParam) {
        return delegate.getMachines(accessToken, groupParam, securityContext);
    }

    @POST
    @Path("/history")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/machines/history", notes = "Get historical data for machine objects. This method returns a set of historical data for all machines in a group", response = MachineHistoryResponse.class, tags={ "Industrial" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of machine results objects, each containing a time and a datapoint.", response = MachineHistoryResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getMachinesHistory( @NotNull @ApiParam(value = "Samsara API access token.",required=true)  @QueryParam("access_token") String accessToken, @ApiParam(value = "" ,required=true) InlineObject17 historyParam) {
        return delegate.getMachinesHistory(accessToken, historyParam, securityContext);
    }
}

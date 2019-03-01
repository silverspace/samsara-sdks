package io.swagger.api;

import io.swagger.model.GroupParam;
import io.swagger.model.HistoryParam;
import io.swagger.model.InlineResponse2007;
import io.swagger.model.MachineHistoryResponse;
import io.swagger.api.MachinesApiService;

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
@Consumes({ "application/json" })
@Produces({ "application/json" })
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2019-03-01T04:20:11.959Z")

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
    public Response getMachines( @NotNull @ApiParam(value = "Samsara API access token.",required=true)  @QueryParam("access_token") String accessToken, @ApiParam(value = "Group ID to query." ,required=true) GroupParam groupParam) {
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
    public Response getMachinesHistory( @NotNull @ApiParam(value = "Samsara API access token.",required=true)  @QueryParam("access_token") String accessToken, @ApiParam(value = "Group ID and time range to query for events" ,required=true) HistoryParam historyParam) {
        return delegate.getMachinesHistory(accessToken, historyParam, securityContext);
    }
}

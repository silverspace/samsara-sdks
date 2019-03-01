package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.MachinesApiService;
import org.openapitools.api.factories.MachinesApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.InlineObject17;
import org.openapitools.model.InlineObject18;
import org.openapitools.model.InlineResponse2007;
import org.openapitools.model.MachineHistoryResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/machines")


@io.swagger.annotations.Api(description = "the machines API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-03-01T05:34:26.765Z[GMT]")
public class MachinesApi  {
   private final MachinesApiService delegate = MachinesApiServiceFactory.getMachinesApi();

    @POST
    @Path("/list")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/machines/list", notes = "Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and information about them.", response = InlineResponse2007.class, tags={ "Industrial", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "List of machine objects.", response = InlineResponse2007.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = InlineResponse2007.class) })
    public Response getMachines(@ApiParam(value = "Samsara API access token.",required=true) @QueryParam("access_token") String accessToken
,@ApiParam(value = "" ,required=true) InlineObject18 groupParam
)
    throws NotFoundException {
        return delegate.getMachines(accessToken,groupParam);
    }
    @POST
    @Path("/history")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/machines/history", notes = "Get historical data for machine objects. This method returns a set of historical data for all machines in a group", response = MachineHistoryResponse.class, tags={ "Industrial", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "List of machine results objects, each containing a time and a datapoint.", response = MachineHistoryResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = MachineHistoryResponse.class) })
    public Response getMachinesHistory(@ApiParam(value = "Samsara API access token.",required=true) @QueryParam("access_token") String accessToken
,@ApiParam(value = "" ,required=true) InlineObject17 historyParam
)
    throws NotFoundException {
        return delegate.getMachinesHistory(accessToken,historyParam);
    }
}

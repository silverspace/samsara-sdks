package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.IndustrialApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import io.swagger.model.DataInputHistoryResponse;
import io.swagger.model.InlineResponse2006;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.inject.Inject;

import javax.validation.constraints.*;

@Path("/industrial")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the industrial API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2019-03-01T04:20:27.798Z")
public class IndustrialApi  {

    @Inject IndustrialApiService service;

    @GET
    @Path("/data")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/industrial/data", notes = "Fetch all of the data inputs for a group.", response = InlineResponse2006.class, tags={ "Industrial", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "List of data inputs.", response = InlineResponse2006.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getAllDataInputs( @NotNull  @QueryParam("access_token") String accessToken,  @QueryParam("group_id") Long groupId,  @QueryParam("startMs") Long startMs,  @QueryParam("endMs") Long endMs,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getAllDataInputs(accessToken,groupId,startMs,endMs,securityContext);
    }
    @GET
    @Path("/data/{data_input_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/industrial/data/{data_input_id:[0-9]+}", notes = "Fetch datapoints from a given data input.", response = DataInputHistoryResponse.class, tags={ "Industrial", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Returns datapoints for the given data input", response = DataInputHistoryResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getDataInput( @NotNull  @QueryParam("access_token") String accessToken, @PathParam("data_input_id") Long dataInputId,  @QueryParam("startMs") Long startMs,  @QueryParam("endMs") Long endMs,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getDataInput(accessToken,dataInputId,startMs,endMs,securityContext);
    }
}

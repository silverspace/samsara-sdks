package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.IndustrialApiService;
import org.openapitools.api.factories.IndustrialApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.DataInputHistoryResponse;
import org.openapitools.model.InlineResponse2006;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/industrial")


@io.swagger.annotations.Api(description = "the industrial API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-03-01T05:34:26.765Z[GMT]")
public class IndustrialApi  {
   private final IndustrialApiService delegate = IndustrialApiServiceFactory.getIndustrialApi();

    @GET
    @Path("/data")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/industrial/data", notes = "Fetch all of the data inputs for a group.", response = InlineResponse2006.class, tags={ "Industrial", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "List of data inputs.", response = InlineResponse2006.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = InlineResponse2006.class) })
    public Response getAllDataInputs(@ApiParam(value = "Samsara API access token.",required=true) @QueryParam("access_token") String accessToken
,@ApiParam(value = "Optional group ID if the organization has multiple groups (uncommon).") @QueryParam("group_id") Long groupId
,@ApiParam(value = "Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs.") @QueryParam("startMs") Long startMs
,@ApiParam(value = "Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs.") @QueryParam("endMs") Long endMs
)
    throws NotFoundException {
        return delegate.getAllDataInputs(accessToken,groupId,startMs,endMs);
    }
    @GET
    @Path("/data/{data_input_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/industrial/data/{data_input_id:[0-9]+}", notes = "Fetch datapoints from a given data input.", response = DataInputHistoryResponse.class, tags={ "Industrial", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Returns datapoints for the given data input", response = DataInputHistoryResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = DataInputHistoryResponse.class) })
    public Response getDataInput(@ApiParam(value = "Samsara API access token.",required=true) @QueryParam("access_token") String accessToken
,@ApiParam(value = "ID of the data input",required=true) @PathParam("data_input_id") Long dataInputId
,@ApiParam(value = "Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs.") @QueryParam("startMs") Long startMs
,@ApiParam(value = "Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs.") @QueryParam("endMs") Long endMs
)
    throws NotFoundException {
        return delegate.getDataInput(accessToken,dataInputId,startMs,endMs);
    }
}

/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.DataInputHistoryResponse;
import com.prokarma.pkmst.model.InlineObject17;
import com.prokarma.pkmst.model.InlineObject18;
import com.prokarma.pkmst.model.InlineResponse2006;
import com.prokarma.pkmst.model.InlineResponse2007;
import com.prokarma.pkmst.model.MachineHistoryResponse;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;

import java.util.List;
/**
 * Provides the info about api methods
 * @author pkmst
 *
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-03-01T05:34:34.656Z[GMT]")

@Api(value = "Industrial", description = "the Industrial API")
public interface IndustrialApi {

    @ApiOperation(value = "/industrial/data", notes = "Fetch all of the data inputs for a group.", response = InlineResponse2006.class, tags={ "Industrial", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of data inputs.", response = InlineResponse2006.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    @RequestMapping(value = "/industrial/data",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<InlineResponse2006> getAllDataInputs(@ApiParam(value = "Samsara API access token.", required = true)  @RequestParam(value = "access_token", required = true) String accessToken,@ApiParam(value = "Optional group ID if the organization has multiple groups (uncommon).")  @RequestParam(value = "group_id", required = false) Long groupId,@ApiParam(value = "Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs.")  @RequestParam(value = "startMs", required = false) Long startMs,@ApiParam(value = "Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs.")  @RequestParam(value = "endMs", required = false) Long endMs, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;


    @ApiOperation(value = "/industrial/data/{data_input_id:[0-9]+}", notes = "Fetch datapoints from a given data input.", response = DataInputHistoryResponse.class, tags={ "Industrial", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns datapoints for the given data input", response = DataInputHistoryResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    @RequestMapping(value = "/industrial/data/{data_input_id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<DataInputHistoryResponse> getDataInput(@ApiParam(value = "Samsara API access token.", required = true)  @RequestParam(value = "access_token", required = true) String accessToken,@ApiParam(value = "ID of the data input",required=true ) @PathVariable("data_input_id") Long dataInputId,@ApiParam(value = "Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs.")  @RequestParam(value = "startMs", required = false) Long startMs,@ApiParam(value = "Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs.")  @RequestParam(value = "endMs", required = false) Long endMs, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;


    @ApiOperation(value = "/machines/list", notes = "Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and information about them.", response = InlineResponse2007.class, tags={ "Industrial", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of machine objects.", response = InlineResponse2007.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    @RequestMapping(value = "/machines/list",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<InlineResponse2007> getMachines(@ApiParam(value = "Samsara API access token.", required = true)  @RequestParam(value = "access_token", required = true) String accessToken,@ApiParam(value = "" ,required=true )   @RequestBody InlineObject18 groupParam, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;


    @ApiOperation(value = "/machines/history", notes = "Get historical data for machine objects. This method returns a set of historical data for all machines in a group", response = MachineHistoryResponse.class, tags={ "Industrial", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of machine results objects, each containing a time and a datapoint.", response = MachineHistoryResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    @RequestMapping(value = "/machines/history",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<MachineHistoryResponse> getMachinesHistory(@ApiParam(value = "Samsara API access token.", required = true)  @RequestParam(value = "access_token", required = true) String accessToken,@ApiParam(value = "" ,required=true )   @RequestBody InlineObject17 historyParam, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;

}

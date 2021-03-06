/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.3-SNAPSHOT).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.GroupParam;
import io.swagger.model.HistoryParam;
import io.swagger.model.InlineResponse2007;
import io.swagger.model.MachineHistoryResponse;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-01T04:20:34.312Z")

@Api(value = "machines", description = "the machines API")
public interface MachinesApi {

    @ApiOperation(value = "/machines/list", nickname = "getMachines", notes = "Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and information about them.", response = InlineResponse2007.class, tags={ "Industrial", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of machine objects.", response = InlineResponse2007.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    @RequestMapping(value = "/machines/list",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<InlineResponse2007> getMachines(@NotNull @ApiParam(value = "Samsara API access token.", required = true) @Valid @RequestParam(value = "access_token", required = true) String accessToken,@ApiParam(value = "Group ID to query." ,required=true )  @Valid @RequestBody GroupParam groupParam);


    @ApiOperation(value = "/machines/history", nickname = "getMachinesHistory", notes = "Get historical data for machine objects. This method returns a set of historical data for all machines in a group", response = MachineHistoryResponse.class, tags={ "Industrial", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of machine results objects, each containing a time and a datapoint.", response = MachineHistoryResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    @RequestMapping(value = "/machines/history",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<MachineHistoryResponse> getMachinesHistory(@NotNull @ApiParam(value = "Samsara API access token.", required = true) @Valid @RequestParam(value = "access_token", required = true) String accessToken,@ApiParam(value = "Group ID and time range to query for events" ,required=true )  @Valid @RequestBody HistoryParam historyParam);

}

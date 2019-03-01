/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.InlineObject17;
import org.openapitools.model.InlineObject18;
import org.openapitools.model.InlineResponse2007;
import org.openapitools.model.MachineHistoryResponse;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-03-01T05:40:23.859Z[GMT]")

@Validated
@Api(value = "machines", description = "the machines API")
public interface MachinesApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    @ApiOperation(value = "/machines/list", nickname = "getMachines", notes = "Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and information about them.", response = InlineResponse2007.class, tags={ "Industrial", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of machine objects.", response = InlineResponse2007.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    @RequestMapping(value = "/machines/list",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<InlineResponse2007> getMachines(@NotNull @ApiParam(value = "Samsara API access token.", required = true) @Valid @RequestParam(value = "access_token", required = true) String accessToken,@ApiParam(value = "" ,required=true )  @Valid @RequestBody InlineObject18 groupParam) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"machines\" : [ {    \"notes\" : \"This is in the left hallway behind the conveyor belt\",    \"name\" : \"Freezer ABC\",    \"id\" : 123  }, {    \"notes\" : \"This is in the left hallway behind the conveyor belt\",    \"name\" : \"Freezer ABC\",    \"id\" : 123  } ]}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "/machines/history", nickname = "getMachinesHistory", notes = "Get historical data for machine objects. This method returns a set of historical data for all machines in a group", response = MachineHistoryResponse.class, tags={ "Industrial", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of machine results objects, each containing a time and a datapoint.", response = MachineHistoryResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    @RequestMapping(value = "/machines/history",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<MachineHistoryResponse> getMachinesHistory(@NotNull @ApiParam(value = "Samsara API access token.", required = true) @Valid @RequestParam(value = "access_token", required = true) String accessToken,@ApiParam(value = "" ,required=true )  @Valid @RequestBody InlineObject17 historyParam) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"machines\" : [ {    \"name\" : \"1/3 HP Motor\",    \"id\" : 1,    \"vibrations\" : [ {      \"X\" : 0.01,      \"Y\" : 1.23,      \"Z\" : 2.55,      \"time\" : 1453449599999    }, {      \"X\" : 0.01,      \"Y\" : 1.23,      \"Z\" : 2.55,      \"time\" : 1453449599999    } ]  }, {    \"name\" : \"1/3 HP Motor\",    \"id\" : 1,    \"vibrations\" : [ {      \"X\" : 0.01,      \"Y\" : 1.23,      \"Z\" : 2.55,      \"time\" : 1453449599999    }, {      \"X\" : 0.01,      \"Y\" : 1.23,      \"Z\" : 2.55,      \"time\" : 1453449599999    } ]  } ]}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
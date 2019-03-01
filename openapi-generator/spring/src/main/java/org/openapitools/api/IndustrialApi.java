/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.DataInputHistoryResponse;
import org.openapitools.model.InlineResponse2006;
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
@Api(value = "industrial", description = "the industrial API")
public interface IndustrialApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    @ApiOperation(value = "/industrial/data", nickname = "getAllDataInputs", notes = "Fetch all of the data inputs for a group.", response = InlineResponse2006.class, tags={ "Industrial", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of data inputs.", response = InlineResponse2006.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    @RequestMapping(value = "/industrial/data",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<InlineResponse2006> getAllDataInputs(@NotNull @ApiParam(value = "Samsara API access token.", required = true) @Valid @RequestParam(value = "access_token", required = true) String accessToken,@ApiParam(value = "Optional group ID if the organization has multiple groups (uncommon).") @Valid @RequestParam(value = "group_id", required = false) Long groupId,@ApiParam(value = "Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs.") @Valid @RequestParam(value = "startMs", required = false) Long startMs,@ApiParam(value = "Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs.") @Valid @RequestParam(value = "endMs", required = false) Long endMs) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"dataInputs\" : [ {    \"name\" : \"Pump Flow\",    \"id\" : 12345,    \"points\" : [ {      \"value\" : 12.332,      \"timeMs\" : 1453449599999    }, {      \"value\" : 12.332,      \"timeMs\" : 1453449599999    } ]  }, {    \"name\" : \"Pump Flow\",    \"id\" : 12345,    \"points\" : [ {      \"value\" : 12.332,      \"timeMs\" : 1453449599999    }, {      \"value\" : 12.332,      \"timeMs\" : 1453449599999    } ]  } ]}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "/industrial/data/{data_input_id:[0-9]+}", nickname = "getDataInput", notes = "Fetch datapoints from a given data input.", response = DataInputHistoryResponse.class, tags={ "Industrial", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns datapoints for the given data input", response = DataInputHistoryResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    @RequestMapping(value = "/industrial/data/{data_input_id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<DataInputHistoryResponse> getDataInput(@NotNull @ApiParam(value = "Samsara API access token.", required = true) @Valid @RequestParam(value = "access_token", required = true) String accessToken,@ApiParam(value = "ID of the data input",required=true) @PathVariable("data_input_id") Long dataInputId,@ApiParam(value = "Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs.") @Valid @RequestParam(value = "startMs", required = false) Long startMs,@ApiParam(value = "Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs.") @Valid @RequestParam(value = "endMs", required = false) Long endMs) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"name\" : \"Pump Flow\",  \"id\" : 12345,  \"points\" : [ {    \"value\" : 12.332,    \"timeMs\" : 1453449599999  }, {    \"value\" : 12.332,    \"timeMs\" : 1453449599999  } ]}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
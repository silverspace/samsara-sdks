package io.swagger.api;

import io.swagger.model.DataInputHistoryResponse;
import io.swagger.model.InlineResponse2006;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-01T04:20:34.312Z")

@Controller
public class IndustrialApiController implements IndustrialApi {

    private static final Logger log = LoggerFactory.getLogger(IndustrialApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public IndustrialApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<InlineResponse2006> getAllDataInputs(@NotNull @ApiParam(value = "Samsara API access token.", required = true) @Valid @RequestParam(value = "access_token", required = true) String accessToken,@ApiParam(value = "Optional group ID if the organization has multiple groups (uncommon).") @Valid @RequestParam(value = "group_id", required = false) Long groupId,@ApiParam(value = "Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs.") @Valid @RequestParam(value = "startMs", required = false) Long startMs,@ApiParam(value = "Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs.") @Valid @RequestParam(value = "endMs", required = false) Long endMs) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse2006>(objectMapper.readValue("{  \"dataInputs\" : [ {    \"id\" : 12345,    \"name\" : \"Pump Flow\",    \"points\" : [ {      \"value\" : 12.332,      \"timeMs\" : 1453449599999    }, {      \"value\" : 12.332,      \"timeMs\" : 1453449599999    } ]  }, {    \"id\" : 12345,    \"name\" : \"Pump Flow\",    \"points\" : [ {      \"value\" : 12.332,      \"timeMs\" : 1453449599999    }, {      \"value\" : 12.332,      \"timeMs\" : 1453449599999    } ]  } ]}", InlineResponse2006.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse2006>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse2006>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<DataInputHistoryResponse> getDataInput(@NotNull @ApiParam(value = "Samsara API access token.", required = true) @Valid @RequestParam(value = "access_token", required = true) String accessToken,@ApiParam(value = "ID of the data input",required=true) @PathVariable("data_input_id") Long dataInputId,@ApiParam(value = "Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs.") @Valid @RequestParam(value = "startMs", required = false) Long startMs,@ApiParam(value = "Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs.") @Valid @RequestParam(value = "endMs", required = false) Long endMs) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<DataInputHistoryResponse>(objectMapper.readValue("{  \"id\" : 12345,  \"name\" : \"Pump Flow\",  \"points\" : [ {    \"value\" : 12.332,    \"timeMs\" : 1453449599999  }, {    \"value\" : 12.332,    \"timeMs\" : 1453449599999  } ]}", DataInputHistoryResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<DataInputHistoryResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<DataInputHistoryResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

}

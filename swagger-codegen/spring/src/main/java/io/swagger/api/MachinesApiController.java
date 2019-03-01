package io.swagger.api;

import io.swagger.model.GroupParam;
import io.swagger.model.HistoryParam;
import io.swagger.model.InlineResponse2007;
import io.swagger.model.MachineHistoryResponse;
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
public class MachinesApiController implements MachinesApi {

    private static final Logger log = LoggerFactory.getLogger(MachinesApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public MachinesApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<InlineResponse2007> getMachines(@NotNull @ApiParam(value = "Samsara API access token.", required = true) @Valid @RequestParam(value = "access_token", required = true) String accessToken,@ApiParam(value = "Group ID to query." ,required=true )  @Valid @RequestBody GroupParam groupParam) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse2007>(objectMapper.readValue("{  \"machines\" : [ {    \"id\" : 123,    \"name\" : \"Freezer ABC\",    \"notes\" : \"This is in the left hallway behind the conveyor belt\"  }, {    \"id\" : 123,    \"name\" : \"Freezer ABC\",    \"notes\" : \"This is in the left hallway behind the conveyor belt\"  } ]}", InlineResponse2007.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse2007>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse2007>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<MachineHistoryResponse> getMachinesHistory(@NotNull @ApiParam(value = "Samsara API access token.", required = true) @Valid @RequestParam(value = "access_token", required = true) String accessToken,@ApiParam(value = "Group ID and time range to query for events" ,required=true )  @Valid @RequestBody HistoryParam historyParam) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<MachineHistoryResponse>(objectMapper.readValue("{  \"machines\" : [ {    \"id\" : 1,    \"vibrations\" : [ {      \"time\" : 1453449599999,      \"Y\" : 1.23,      \"X\" : 0.01,      \"Z\" : 2.55    }, {      \"time\" : 1453449599999,      \"Y\" : 1.23,      \"X\" : 0.01,      \"Z\" : 2.55    } ],    \"name\" : \"1/3 HP Motor\"  }, {    \"id\" : 1,    \"vibrations\" : [ {      \"time\" : 1453449599999,      \"Y\" : 1.23,      \"X\" : 0.01,      \"Z\" : 2.55    }, {      \"time\" : 1453449599999,      \"Y\" : 1.23,      \"X\" : 0.01,      \"Z\" : 2.55    } ],    \"name\" : \"1/3 HP Motor\"  } ]}", MachineHistoryResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<MachineHistoryResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<MachineHistoryResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

}

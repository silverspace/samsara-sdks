package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.DataInputHistoryResponse;
import com.prokarma.pkmst.model.InlineObject17;
import com.prokarma.pkmst.model.InlineObject18;
import com.prokarma.pkmst.model.InlineResponse2006;
import com.prokarma.pkmst.model.InlineResponse2007;
import com.prokarma.pkmst.model.MachineHistoryResponse;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
/**
 * Api implemention
 * @author pkmst
 *
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-03-01T05:34:34.656Z[GMT]")

@Controller
public class IndustrialApiController implements IndustrialApi {
    private final ObjectMapper objectMapper;
@Autowired
    public IndustrialApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<InlineResponse2006> getAllDataInputs(@ApiParam(value = "Samsara API access token.", required = true)  @RequestParam(value = "access_token", required = true) String accessToken,
        @ApiParam(value = "Optional group ID if the organization has multiple groups (uncommon).")  @RequestParam(value = "group_id", required = false) Long groupId,
        @ApiParam(value = "Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs.")  @RequestParam(value = "startMs", required = false) Long startMs,
        @ApiParam(value = "Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs.")  @RequestParam(value = "endMs", required = false) Long endMs,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<InlineResponse2006>(objectMapper.readValue("", InlineResponse2006.class), HttpStatus.OK);
        }

        return new ResponseEntity<InlineResponse2006>(HttpStatus.OK);
    }

    public ResponseEntity<DataInputHistoryResponse> getDataInput(@ApiParam(value = "Samsara API access token.", required = true)  @RequestParam(value = "access_token", required = true) String accessToken,
        @ApiParam(value = "ID of the data input",required=true ) @PathVariable("data_input_id") Long dataInputId,
        @ApiParam(value = "Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs.")  @RequestParam(value = "startMs", required = false) Long startMs,
        @ApiParam(value = "Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs.")  @RequestParam(value = "endMs", required = false) Long endMs,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DataInputHistoryResponse>(objectMapper.readValue("", DataInputHistoryResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<DataInputHistoryResponse>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse2007> getMachines(@ApiParam(value = "Samsara API access token.", required = true)  @RequestParam(value = "access_token", required = true) String accessToken,
        @ApiParam(value = "" ,required=true )   @RequestBody InlineObject18 groupParam,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<InlineResponse2007>(objectMapper.readValue("", InlineResponse2007.class), HttpStatus.OK);
        }

        return new ResponseEntity<InlineResponse2007>(HttpStatus.OK);
    }

    public ResponseEntity<MachineHistoryResponse> getMachinesHistory(@ApiParam(value = "Samsara API access token.", required = true)  @RequestParam(value = "access_token", required = true) String accessToken,
        @ApiParam(value = "" ,required=true )   @RequestBody InlineObject17 historyParam,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<MachineHistoryResponse>(objectMapper.readValue("", MachineHistoryResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<MachineHistoryResponse>(HttpStatus.OK);
    }

}

package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.CargoResponse;
import com.prokarma.pkmst.model.DoorResponse;
import com.prokarma.pkmst.model.HumidityResponse;
import com.prokarma.pkmst.model.InlineObject19;
import com.prokarma.pkmst.model.InlineObject20;
import com.prokarma.pkmst.model.InlineObject21;
import com.prokarma.pkmst.model.InlineObject22;
import com.prokarma.pkmst.model.InlineObject23;
import com.prokarma.pkmst.model.InlineObject24;
import com.prokarma.pkmst.model.InlineResponse2008;
import com.prokarma.pkmst.model.SensorHistoryResponse;
import com.prokarma.pkmst.model.TemperatureResponse;

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
public class SensorsApiController implements SensorsApi {
    private final ObjectMapper objectMapper;
@Autowired
    public SensorsApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<InlineResponse2008> getSensors(@ApiParam(value = "Samsara API access token.", required = true)  @RequestParam(value = "access_token", required = true) String accessToken,
        @ApiParam(value = "" ,required=true )   @RequestBody InlineObject23 groupParam,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<InlineResponse2008>(objectMapper.readValue("", InlineResponse2008.class), HttpStatus.OK);
        }

        return new ResponseEntity<InlineResponse2008>(HttpStatus.OK);
    }

    public ResponseEntity<CargoResponse> getSensorsCargo(@ApiParam(value = "Samsara API access token.", required = true)  @RequestParam(value = "access_token", required = true) String accessToken,
        @ApiParam(value = "" ,required=true )   @RequestBody InlineObject19 sensorParam,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CargoResponse>(objectMapper.readValue("", CargoResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<CargoResponse>(HttpStatus.OK);
    }

    public ResponseEntity<DoorResponse> getSensorsDoor(@ApiParam(value = "Samsara API access token.", required = true)  @RequestParam(value = "access_token", required = true) String accessToken,
        @ApiParam(value = "" ,required=true )   @RequestBody InlineObject20 sensorParam,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DoorResponse>(objectMapper.readValue("", DoorResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<DoorResponse>(HttpStatus.OK);
    }

    public ResponseEntity<SensorHistoryResponse> getSensorsHistory(@ApiParam(value = "Samsara API access token.", required = true)  @RequestParam(value = "access_token", required = true) String accessToken,
        @ApiParam(value = "" ,required=true )   @RequestBody InlineObject21 historyParam,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SensorHistoryResponse>(objectMapper.readValue("", SensorHistoryResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<SensorHistoryResponse>(HttpStatus.OK);
    }

    public ResponseEntity<HumidityResponse> getSensorsHumidity(@ApiParam(value = "Samsara API access token.", required = true)  @RequestParam(value = "access_token", required = true) String accessToken,
        @ApiParam(value = "" ,required=true )   @RequestBody InlineObject22 sensorParam,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<HumidityResponse>(objectMapper.readValue("", HumidityResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<HumidityResponse>(HttpStatus.OK);
    }

    public ResponseEntity<TemperatureResponse> getSensorsTemperature(@ApiParam(value = "Samsara API access token.", required = true)  @RequestParam(value = "access_token", required = true) String accessToken,
        @ApiParam(value = "" ,required=true )   @RequestBody InlineObject24 sensorParam,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<TemperatureResponse>(objectMapper.readValue("", TemperatureResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<TemperatureResponse>(HttpStatus.OK);
    }

}

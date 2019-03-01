package io.swagger.api;

import io.swagger.model.CargoResponse;
import io.swagger.model.DoorResponse;
import io.swagger.model.GroupParam;
import io.swagger.model.HistoryParam1;
import io.swagger.model.HumidityResponse;
import io.swagger.model.InlineResponse2008;
import io.swagger.model.SensorHistoryResponse;
import io.swagger.model.SensorParam;
import io.swagger.model.TemperatureResponse;
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
public class SensorsApiController implements SensorsApi {

    private static final Logger log = LoggerFactory.getLogger(SensorsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public SensorsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<InlineResponse2008> getSensors(@NotNull @ApiParam(value = "Samsara API access token.", required = true) @Valid @RequestParam(value = "access_token", required = true) String accessToken,@ApiParam(value = "Group ID to query." ,required=true )  @Valid @RequestBody GroupParam groupParam) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse2008>(objectMapper.readValue("{  \"sensors\" : [ {    \"id\" : 123,    \"name\" : \"Freezer ABC\",    \"macAddress\" : \"11:11:11:11:11:11\"  }, {    \"id\" : 123,    \"name\" : \"Freezer ABC\",    \"macAddress\" : \"11:11:11:11:11:11\"  } ]}", InlineResponse2008.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse2008>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse2008>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<CargoResponse> getSensorsCargo(@NotNull @ApiParam(value = "Samsara API access token.", required = true) @Valid @RequestParam(value = "access_token", required = true) String accessToken,@ApiParam(value = "Group ID and list of sensor IDs to query." ,required=true )  @Valid @RequestBody SensorParam sensorParam) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<CargoResponse>(objectMapper.readValue("{  \"sensors\" : [ {    \"id\" : 122,    \"name\" : \"Trailer Cargo Sensor\",    \"cargoEmpty\" : true  }, {    \"id\" : 122,    \"name\" : \"Trailer Cargo Sensor\",    \"cargoEmpty\" : true  } ],  \"groupId\" : 101}", CargoResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<CargoResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<CargoResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<DoorResponse> getSensorsDoor(@NotNull @ApiParam(value = "Samsara API access token.", required = true) @Valid @RequestParam(value = "access_token", required = true) String accessToken,@ApiParam(value = "Group ID and list of sensor IDs to query." ,required=true )  @Valid @RequestBody SensorParam sensorParam) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<DoorResponse>(objectMapper.readValue("{  \"sensors\" : [ {    \"id\" : 122,    \"doorClosed\" : true,    \"name\" : \"Trailer Door Sensor\"  }, {    \"id\" : 122,    \"doorClosed\" : true,    \"name\" : \"Trailer Door Sensor\"  } ],  \"groupId\" : 101}", DoorResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<DoorResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<DoorResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<SensorHistoryResponse> getSensorsHistory(@NotNull @ApiParam(value = "Samsara API access token.", required = true) @Valid @RequestParam(value = "access_token", required = true) String accessToken,@ApiParam(value = "Group ID, time range and resolution, and list of sensor ID, field pairs to query." ,required=true )  @Valid @RequestBody HistoryParam1 historyParam) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<SensorHistoryResponse>(objectMapper.readValue("{  \"results\" : [ {    \"series\" : [ 1, 1 ],    \"timeMs\" : 1453449599999  }, {    \"series\" : [ 1, 1 ],    \"timeMs\" : 1453449599999  } ]}", SensorHistoryResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<SensorHistoryResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<SensorHistoryResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<HumidityResponse> getSensorsHumidity(@NotNull @ApiParam(value = "Samsara API access token.", required = true) @Valid @RequestParam(value = "access_token", required = true) String accessToken,@ApiParam(value = "Group ID and list of sensor IDs to query." ,required=true )  @Valid @RequestBody SensorParam sensorParam) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<HumidityResponse>(objectMapper.readValue("{  \"sensors\" : [ {    \"id\" : 122,    \"humidity\" : 53,    \"name\" : \"Freezer Humidity Sensor\"  }, {    \"id\" : 122,    \"humidity\" : 53,    \"name\" : \"Freezer Humidity Sensor\"  } ],  \"groupId\" : 101}", HumidityResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<HumidityResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<HumidityResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TemperatureResponse> getSensorsTemperature(@NotNull @ApiParam(value = "Samsara API access token.", required = true) @Valid @RequestParam(value = "access_token", required = true) String accessToken,@ApiParam(value = "Group ID and list of sensor IDs to query." ,required=true )  @Valid @RequestBody SensorParam sensorParam) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TemperatureResponse>(objectMapper.readValue("{  \"sensors\" : [ {    \"id\" : 122,    \"name\" : \"Freezer Temp Sensor\",    \"probeTemperature\" : -20145,    \"ambientTemperature\" : 11057  }, {    \"id\" : 122,    \"name\" : \"Freezer Temp Sensor\",    \"probeTemperature\" : -20145,    \"ambientTemperature\" : 11057  } ],  \"groupId\" : 101}", TemperatureResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TemperatureResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TemperatureResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

}

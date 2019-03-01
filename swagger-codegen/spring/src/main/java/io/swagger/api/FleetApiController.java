package io.swagger.api;

import io.swagger.model.AddressParam;
import io.swagger.model.AllRouteJobUpdates;
import io.swagger.model.AssetLocationResponse;
import io.swagger.model.AssetReeferResponse;
import io.swagger.model.CreateDvirParam;
import io.swagger.model.CurrentDriver;
import io.swagger.model.Data;
import io.swagger.model.DispatchRoute;
import io.swagger.model.DispatchRouteCreate;
import io.swagger.model.DispatchRouteHistory;
import io.swagger.model.DispatchRoutes;
import io.swagger.model.Document;
import io.swagger.model.DocumentCreate;
import io.swagger.model.DocumentTypes;
import io.swagger.model.Documents;
import io.swagger.model.Driver;
import io.swagger.model.DriverDailyLogResponse;
import io.swagger.model.DriverForCreate;
import io.swagger.model.DriverSafetyScoreResponse;
import io.swagger.model.DriversResponse;
import io.swagger.model.DriversSummaryParam;
import io.swagger.model.DriversSummaryResponse;
import io.swagger.model.DvirBase;
import io.swagger.model.DvirListResponse;
import io.swagger.model.FleetVehicleLocations;
import io.swagger.model.FleetVehicleResponse;
import io.swagger.model.FleetVehiclesLocations;
import io.swagger.model.GroupDriversParam;
import io.swagger.model.GroupParam;
import io.swagger.model.HosAuthenticationLogsParam;
import io.swagger.model.HosAuthenticationLogsResponse;
import io.swagger.model.HosLogsParam;
import io.swagger.model.HosLogsParam1;
import io.swagger.model.HosLogsParam2;
import io.swagger.model.HosLogsResponse;
import io.swagger.model.HosLogsSummaryResponse;
import io.swagger.model.InlineResponse200;
import io.swagger.model.InlineResponse2001;
import io.swagger.model.InlineResponse2002;
import io.swagger.model.InlineResponse2003;
import io.swagger.model.InlineResponse2004;
import io.swagger.model.InlineResponse2005;
import io.swagger.model.ReactivateDriverParam;
import io.swagger.model.TripResponse;
import io.swagger.model.TripsParam;
import io.swagger.model.VehicleHarshEventResponse;
import io.swagger.model.VehicleSafetyScoreResponse;
import io.swagger.model.VehicleUpdateParam;
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
public class FleetApiController implements FleetApi {

    private static final Logger log = LoggerFactory.getLogger(FleetApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public FleetApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> addFleetAddress(@NotNull @ApiParam(value = "Samsara API access token.", required = true) @Valid @RequestParam(value = "access_token", required = true) String accessToken,@ApiParam(value = "" ,required=true )  @Valid @RequestBody AddressParam addressParam) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<DispatchRoute> createDispatchRoute(@NotNull @ApiParam(value = "Samsara API access token.", required = true) @Valid @RequestParam(value = "access_token", required = true) String accessToken,@ApiParam(value = "" ,required=true )  @Valid @RequestBody DispatchRouteCreate createDispatchRouteParams) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<DispatchRoute>(objectMapper.readValue("\"\"", DispatchRoute.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<DispatchRoute>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<DispatchRoute>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Driver> createDriver(@NotNull @ApiParam(value = "Samsara API access token.", required = true) @Valid @RequestParam(value = "access_token", required = true) String accessToken,@ApiParam(value = "Driver creation body" ,required=true )  @Valid @RequestBody DriverForCreate createDriverParam) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Driver>(objectMapper.readValue("\"\"", Driver.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Driver>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Driver>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<DispatchRoute> createDriverDispatchRoute(@NotNull @ApiParam(value = "Samsara API access token.", required = true) @Valid @RequestParam(value = "access_token", required = true) String accessToken,@ApiParam(value = "ID of the driver with the associated routes.",required=true) @PathVariable("driver_id") Long driverId,@ApiParam(value = "" ,required=true )  @Valid @RequestBody DispatchRouteCreate createDispatchRouteParams) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<DispatchRoute>(objectMapper.readValue("\"\"", DispatchRoute.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<DispatchRoute>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<DispatchRoute>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Document> createDriverDocument(@NotNull @ApiParam(value = "Samsara API access token.", required = true) @Valid @RequestParam(value = "access_token", required = true) String accessToken,@ApiParam(value = "ID of the driver for whom the document is created.",required=true) @PathVariable("driver_id") Long driverId,@ApiParam(value = "To create a document for a given document type, the document type's uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field's valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_." ,required=true )  @Valid @RequestBody DocumentCreate createDocumentParams) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Document>(objectMapper.readValue("\"\"", Document.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Document>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Document>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<DvirBase> createDvir(@NotNull @ApiParam(value = "Samsara API access token.", required = true) @Valid @RequestParam(value = "access_token", required = true) String accessToken,@ApiParam(value = "DVIR creation body" ,required=true )  @Valid @RequestBody CreateDvirParam createDvirParam) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<DvirBase>(objectMapper.readValue("{  \"vehicleDefects\" : [ {    \"defectType\" : \"Air Compressor\",    \"comment\" : \"Air Compressor not working\"  }, {    \"defectType\" : \"Air Compressor\",    \"comment\" : \"Air Compressor not working\"  } ],  \"defectsNeedNotBeCorrected\" : false,  \"authorSignature\" : {    \"username\" : \"jsmith\",    \"mechanicUserId\" : 14849,    \"email\" : \"j.smith@yahoo.com\",    \"signedAt\" : 12535500000,    \"name\" : \"John Smith\",    \"driverId\" : 2581,    \"type\" : \"driver\"  },  \"inspectionType\" : \"pre trip\",  \"odometerMiles\" : 49912,  \"vehicle\" : {    \"id\" : 19,    \"name\" : \"Storer's vehicle 19\"  },  \"timeMs\" : 1453449599999,  \"defectsCorrected\" : true,  \"mechanicNotes\" : \"The vehicle is now safe.\",  \"id\" : 19,  \"nextDriverSignature\" : {    \"username\" : \"jsmith\",    \"email\" : \"j.smith@yahoo.com\",    \"signedAt\" : 12535500000,    \"name\" : \"John Smith\",    \"driverId\" : 2581,    \"type\" : \"driver\"  },  \"trailerName\" : \"Storer's Trailer 19\",  \"vehicleCondition\" : \"SATISFACTORY\",  \"mechanicOrAgentSignature\" : {    \"username\" : \"jsmith\",    \"mechanicUserId\" : 14849,    \"email\" : \"j.smith@yahoo.com\",    \"signedAt\" : 12535500000,    \"name\" : \"John Smith\",    \"driverId\" : 2581,    \"type\" : \"driver\"  },  \"trailerDefects\" : [ {    \"defectType\" : \"Air Compressor\",    \"comment\" : \"Air Compressor not working\"  }, {    \"defectType\" : \"Air Compressor\",    \"comment\" : \"Air Compressor not working\"  } ],  \"trailerId\" : 19}", DvirBase.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<DvirBase>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<DvirBase>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<DispatchRoute> createVehicleDispatchRoute(@NotNull @ApiParam(value = "Samsara API access token.", required = true) @Valid @RequestParam(value = "access_token", required = true) String accessToken,@ApiParam(value = "ID of the vehicle with the associated routes.",required=true) @PathVariable("vehicle_id") Long vehicleId,@ApiParam(value = "" ,required=true )  @Valid @RequestBody DispatchRouteCreate createDispatchRouteParams) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<DispatchRoute>(objectMapper.readValue("\"\"", DispatchRoute.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<DispatchRoute>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<DispatchRoute>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deactivateDriver(@NotNull @ApiParam(value = "Samsara API access token.", required = true) @Valid @RequestParam(value = "access_token", required = true) String accessToken,@ApiParam(value = "ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.",required=true) @PathVariable("driver_id_or_external_id") String driverIdOrExternalId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteDispatchRouteById(@NotNull @ApiParam(value = "Samsara API access token.", required = true) @Valid @RequestParam(value = "access_token", required = true) String accessToken,@ApiParam(value = "ID of the dispatch route.",required=true) @PathVariable("route_id") Long routeId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<DispatchRoutes> fetchAllDispatchRoutes(@NotNull @ApiParam(value = "Samsara API access token.", required = true) @Valid @RequestParam(value = "access_token", required = true) String accessToken,@ApiParam(value = "Optional group ID if the organization has multiple groups (uncommon).") @Valid @RequestParam(value = "group_id", required = false) Long groupId,@ApiParam(value = "Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.") @Valid @RequestParam(value = "end_time", required = false) Long endTime,@ApiParam(value = "Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.") @Valid @RequestParam(value = "duration", required = false) Long duration) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<DispatchRoutes>(objectMapper.readValue("\"\"", DispatchRoutes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<DispatchRoutes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<DispatchRoutes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<AllRouteJobUpdates> fetchAllRouteJobUpdates(@NotNull @ApiParam(value = "Samsara API access token.", required = true) @Valid @RequestParam(value = "access_token", required = true) String accessToken,@ApiParam(value = "Optional group ID if the organization has multiple groups (uncommon).") @Valid @RequestParam(value = "group_id", required = false) Long groupId,@ApiParam(value = "Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours.") @Valid @RequestParam(value = "sequence_id", required = false) String sequenceId,@ApiParam(value = "Optionally set include=route to include route object in response payload.") @Valid @RequestParam(value = "include", required = false) String include) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<AllRouteJobUpdates>(objectMapper.readValue("{  \"job_updates\" : [ {    \"prev_job_state\" : \"JobState_EnRoute\",    \"route_id\" : 556,    \"route\" : \"\",    \"changed_at_ms\" : 1462881998034,    \"job_state\" : \"JobState_Arrived\",    \"job_id\" : 773  }, {    \"prev_job_state\" : \"JobState_EnRoute\",    \"route_id\" : 556,    \"route\" : \"\",    \"changed_at_ms\" : 1462881998034,    \"job_state\" : \"JobState_Arrived\",    \"job_id\" : 773  } ],  \"sequence_id\" : \"eyJpZCI6MywiY3JlYXRlZF9hdCI6MTQ5OTQyOTIyMDAwMn0=\"}", AllRouteJobUpdates.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AllRouteJobUpdates>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AllRouteJobUpdates>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse2001> getAllAssetCurrentLocations(@NotNull @ApiParam(value = "Samsara API access token.", required = true) @Valid @RequestParam(value = "access_token", required = true) String accessToken,@ApiParam(value = "Optional group ID if the organization has multiple groups (uncommon).") @Valid @RequestParam(value = "group_id", required = false) Long groupId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse2001>(objectMapper.readValue("{  \"assets\" : [ {    \"id\" : 1,    \"engineHours\" : 104,    \"location\" : [ {      \"speedMilesPerHour\" : 35.0,      \"location\" : \"525 York, San Francisco, CA\",      \"longitude\" : -122.7,      \"latitude\" : 37.0,      \"timeMs\" : 12314151    }, {      \"speedMilesPerHour\" : 35.0,      \"location\" : \"525 York, San Francisco, CA\",      \"longitude\" : -122.7,      \"latitude\" : 37.0,      \"timeMs\" : 12314151    } ],    \"name\" : \"Trailer 123\",    \"cable\" : [ {      \"assetType\" : \"Reefer (Thermo King)\"    }, {      \"assetType\" : \"Reefer (Thermo King)\"    } ]  }, {    \"id\" : 1,    \"engineHours\" : 104,    \"location\" : [ {      \"speedMilesPerHour\" : 35.0,      \"location\" : \"525 York, San Francisco, CA\",      \"longitude\" : -122.7,      \"latitude\" : 37.0,      \"timeMs\" : 12314151    }, {      \"speedMilesPerHour\" : 35.0,      \"location\" : \"525 York, San Francisco, CA\",      \"longitude\" : -122.7,      \"latitude\" : 37.0,      \"timeMs\" : 12314151    } ],    \"name\" : \"Trailer 123\",    \"cable\" : [ {      \"assetType\" : \"Reefer (Thermo King)\"    }, {      \"assetType\" : \"Reefer (Thermo King)\"    } ]  } ]}", InlineResponse2001.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse2001>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse2001>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse200> getAllAssets(@NotNull @ApiParam(value = "Samsara API access token.", required = true) @Valid @RequestParam(value = "access_token", required = true) String accessToken,@ApiParam(value = "Optional group ID if the organization has multiple groups (uncommon).") @Valid @RequestParam(value = "group_id", required = false) Long groupId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse200>(objectMapper.readValue("{  \"assets\" : [ {    \"id\" : 1,    \"assetSerialNumber\" : \"SNTEST123\",    \"engineHours\" : 104,    \"name\" : \"Trailer 123\",    \"cable\" : [ {      \"assetType\" : \"Reefer (Thermo King)\"    }, {      \"assetType\" : \"Reefer (Thermo King)\"    } ]  }, {    \"id\" : 1,    \"assetSerialNumber\" : \"SNTEST123\",    \"engineHours\" : 104,    \"name\" : \"Trailer 123\",    \"cable\" : [ {      \"assetType\" : \"Reefer (Thermo King)\"    }, {      \"assetType\" : \"Reefer (Thermo King)\"    } ]  } ]}", InlineResponse200.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse200>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse200>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Driver>> getAllDeactivatedDrivers(@NotNull @ApiParam(value = "Samsara API access token.", required = true) @Valid @RequestParam(value = "access_token", required = true) String accessToken,@ApiParam(value = "Optional group ID if the organization has multiple groups (uncommon).") @Valid @RequestParam(value = "group_id", required = false) Long groupId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Driver>>(objectMapper.readValue("[ \"\", \"\" ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Driver>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Driver>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<AssetLocationResponse> getAssetLocation(@NotNull @ApiParam(value = "Samsara API access token.", required = true) @Valid @RequestParam(value = "access_token", required = true) String accessToken,@ApiParam(value = "ID of the asset",required=true) @PathVariable("asset_id") Long assetId,@NotNull @ApiParam(value = "Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.", required = true) @Valid @RequestParam(value = "startMs", required = true) Long startMs,@NotNull @ApiParam(value = "Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.", required = true) @Valid @RequestParam(value = "endMs", required = true) Long endMs) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<AssetLocationResponse>(objectMapper.readValue("\"\"", AssetLocationResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AssetLocationResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AssetLocationResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<AssetReeferResponse> getAssetReefer(@NotNull @ApiParam(value = "Samsara API access token.", required = true) @Valid @RequestParam(value = "access_token", required = true) String accessToken,@ApiParam(value = "ID of the asset",required=true) @PathVariable("asset_id") Long assetId,@NotNull @ApiParam(value = "Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.", required = true) @Valid @RequestParam(value = "startMs", required = true) Long startMs,@NotNull @ApiParam(value = "Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.", required = true) @Valid @RequestParam(value = "endMs", required = true) Long endMs) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<AssetReeferResponse>(objectMapper.readValue("{  \"id\" : 1,  \"reeferStats\" : {    \"powerStatus\" : [ {      \"status\" : \"Active (Continuous)\",      \"changedAtMs\" : 1453449599999    }, {      \"status\" : \"Active (Continuous)\",      \"changedAtMs\" : 1453449599999    } ],    \"engineHours\" : [ {      \"engineHours\" : 1200,      \"changedAtMs\" : 1453449599999    }, {      \"engineHours\" : 1200,      \"changedAtMs\" : 1453449599999    } ],    \"returnAirTemp\" : [ {      \"changedAtMs\" : 1453449599999,      \"tempInMilliC\" : 31110    }, {      \"changedAtMs\" : 1453449599999,      \"tempInMilliC\" : 31110    } ],    \"fuelPercentage\" : [ {      \"fuelPercentage\" : 99,      \"changedAtMs\" : 1453449599999    }, {      \"fuelPercentage\" : 99,      \"changedAtMs\" : 1453449599999    } ],    \"setPoint\" : [ {      \"changedAtMs\" : 1453449599999,      \"tempInMilliC\" : 31110    }, {      \"changedAtMs\" : 1453449599999,      \"tempInMilliC\" : 31110    } ],    \"alarms\" : [ {      \"changedAtMs\" : 1453449599999,      \"alarms\" : [ {        \"description\" : \"Check Return Air Sensor\",        \"severity\" : 1,        \"operatorAction\" : \"Check and repair at end of trip\",        \"alarmCode\" : 102      }, {        \"description\" : \"Check Return Air Sensor\",        \"severity\" : 1,        \"operatorAction\" : \"Check and repair at end of trip\",        \"alarmCode\" : 102      } ]    }, {      \"changedAtMs\" : 1453449599999,      \"alarms\" : [ {        \"description\" : \"Check Return Air Sensor\",        \"severity\" : 1,        \"operatorAction\" : \"Check and repair at end of trip\",        \"alarmCode\" : 102      }, {        \"description\" : \"Check Return Air Sensor\",        \"severity\" : 1,        \"operatorAction\" : \"Check and repair at end of trip\",        \"alarmCode\" : 102      } ]    } ]  },  \"assetType\" : \"Reefer (Thermo King)\",  \"name\" : \"Reefer 123\"}", AssetReeferResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AssetReeferResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AssetReeferResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Driver> getDeactivatedDriverById(@NotNull @ApiParam(value = "Samsara API access token.", required = true) @Valid @RequestParam(value = "access_token", required = true) String accessToken,@ApiParam(value = "ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.",required=true) @PathVariable("driver_id_or_external_id") String driverIdOrExternalId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Driver>(objectMapper.readValue("\"\"", Driver.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Driver>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Driver>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<DispatchRoute> getDispatchRouteById(@NotNull @ApiParam(value = "Samsara API access token.", required = true) @Valid @RequestParam(value = "access_token", required = true) String accessToken,@ApiParam(value = "ID of the dispatch route.",required=true) @PathVariable("route_id") Long routeId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<DispatchRoute>(objectMapper.readValue("\"\"", DispatchRoute.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<DispatchRoute>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<DispatchRoute>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<DispatchRouteHistory> getDispatchRouteHistory(@NotNull @ApiParam(value = "Samsara API access token.", required = true) @Valid @RequestParam(value = "access_token", required = true) String accessToken,@ApiParam(value = "ID of the route with history.",required=true) @PathVariable("route_id") Long routeId,@ApiParam(value = "Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0.") @Valid @RequestParam(value = "start_time", required = false) Long startTime,@ApiParam(value = "Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs.") @Valid @RequestParam(value = "end_time", required = false) Long endTime) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<DispatchRouteHistory>(objectMapper.readValue("{  \"history\" : [ {    \"route\" : \"\",    \"changed_at_ms\" : 1499411220000  }, {    \"route\" : \"\",    \"changed_at_ms\" : 1499411220000  } ]}", DispatchRouteHistory.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<DispatchRouteHistory>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<DispatchRouteHistory>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<DispatchRoutes> getDispatchRoutesByDriverId(@NotNull @ApiParam(value = "Samsara API access token.", required = true) @Valid @RequestParam(value = "access_token", required = true) String accessToken,@ApiParam(value = "ID of the driver with the associated routes.",required=true) @PathVariable("driver_id") Long driverId,@ApiParam(value = "Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.") @Valid @RequestParam(value = "end_time", required = false) Long endTime,@ApiParam(value = "Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.") @Valid @RequestParam(value = "duration", required = false) Long duration) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<DispatchRoutes>(objectMapper.readValue("\"\"", DispatchRoutes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<DispatchRoutes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<DispatchRoutes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<DispatchRoutes> getDispatchRoutesByVehicleId(@NotNull @ApiParam(value = "Samsara API access token.", required = true) @Valid @RequestParam(value = "access_token", required = true) String accessToken,@ApiParam(value = "ID of the vehicle with the associated routes.",required=true) @PathVariable("vehicle_id") Long vehicleId,@ApiParam(value = "Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.") @Valid @RequestParam(value = "end_time", required = false) Long endTime,@ApiParam(value = "Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.") @Valid @RequestParam(value = "duration", required = false) Long duration) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<DispatchRoutes>(objectMapper.readValue("\"\"", DispatchRoutes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<DispatchRoutes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<DispatchRoutes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<CurrentDriver> getDriverById(@NotNull @ApiParam(value = "Samsara API access token.", required = true) @Valid @RequestParam(value = "access_token", required = true) String accessToken,@ApiParam(value = "ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.",required=true) @PathVariable("driver_id_or_external_id") String driverIdOrExternalId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<CurrentDriver>(objectMapper.readValue("\"\"", CurrentDriver.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<CurrentDriver>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<CurrentDriver>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<DocumentTypes> getDriverDocumentTypesByOrgId() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<DocumentTypes>(objectMapper.readValue("\"\"", DocumentTypes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<DocumentTypes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<DocumentTypes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Documents> getDriverDocumentsByOrgId(@NotNull @ApiParam(value = "Samsara API access token.", required = true) @Valid @RequestParam(value = "access_token", required = true) String accessToken,@ApiParam(value = "Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now.") @Valid @RequestParam(value = "endMs", required = false) Long endMs,@ApiParam(value = "Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours.") @Valid @RequestParam(value = "durationMs", required = false) Long durationMs) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Documents>(objectMapper.readValue("\"\"", Documents.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Documents>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Documents>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<DriverSafetyScoreResponse> getDriverSafetyScore(@ApiParam(value = "ID of the driver",required=true) @PathVariable("driverId") Long driverId,@NotNull @ApiParam(value = "Samsara API access token.", required = true) @Valid @RequestParam(value = "access_token", required = true) String accessToken,@NotNull @ApiParam(value = "Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.", required = true) @Valid @RequestParam(value = "startMs", required = true) Long startMs,@NotNull @ApiParam(value = "Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.", required = true) @Valid @RequestParam(value = "endMs", required = true) Long endMs) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<DriverSafetyScoreResponse>(objectMapper.readValue("{  \"totalTimeDrivenMs\" : 19708293,  \"timeOverSpeedLimitMs\" : 3769,  \"harshBrakingCount\" : 2,  \"harshEvents\" : [ {    \"harshEventType\" : \"Harsh Braking\",    \"vehicleId\" : 212014918086169,    \"timestampMs\" : 1535590776000  }, {    \"harshEventType\" : \"Harsh Braking\",    \"vehicleId\" : 212014918086169,    \"timestampMs\" : 1535590776000  } ],  \"harshTurningCount\" : 0,  \"totalHarshEventCount\" : 3,  \"driverId\" : 1234,  \"safetyScore\" : 97,  \"crashCount\" : 0,  \"harshAccelCount\" : 1,  \"safetyScoreRank\" : \"26\",  \"totalDistanceDrivenMeters\" : 291836}", DriverSafetyScoreResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<DriverSafetyScoreResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<DriverSafetyScoreResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<DvirListResponse> getDvirs(@NotNull @ApiParam(value = "Samsara API access token.", required = true) @Valid @RequestParam(value = "access_token", required = true) String accessToken,@NotNull @ApiParam(value = "time in millis until the last dvir log.", required = true) @Valid @RequestParam(value = "end_ms", required = true) Integer endMs,@NotNull @ApiParam(value = "time in millis which corresponds to the duration before the end_ms.", required = true) @Valid @RequestParam(value = "duration_ms", required = true) Integer durationMs,@ApiParam(value = "Group ID to query.") @Valid @RequestParam(value = "group_id", required = false) Integer groupId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<DvirListResponse>(objectMapper.readValue("{  \"dvirs\" : [ {    \"vehicleDefects\" : [ {      \"defectType\" : \"Air Compressor\",      \"comment\" : \"Air Compressor not working\"    }, {      \"defectType\" : \"Air Compressor\",      \"comment\" : \"Air Compressor not working\"    } ],    \"defectsNeedNotBeCorrected\" : false,    \"authorSignature\" : {      \"username\" : \"jsmith\",      \"mechanicUserId\" : 14849,      \"email\" : \"j.smith@yahoo.com\",      \"signedAt\" : 12535500000,      \"name\" : \"John Smith\",      \"driverId\" : 2581,      \"type\" : \"driver\"    },    \"inspectionType\" : \"pre trip\",    \"odometerMiles\" : 49912,    \"vehicle\" : {      \"id\" : 19,      \"name\" : \"Storer's vehicle 19\"    },    \"timeMs\" : 1453449599999,    \"defectsCorrected\" : true,    \"mechanicNotes\" : \"The vehicle is now safe.\",    \"id\" : 19,    \"nextDriverSignature\" : {      \"username\" : \"jsmith\",      \"email\" : \"j.smith@yahoo.com\",      \"signedAt\" : 12535500000,      \"name\" : \"John Smith\",      \"driverId\" : 2581,      \"type\" : \"driver\"    },    \"trailerName\" : \"Storer's Trailer 19\",    \"vehicleCondition\" : \"SATISFACTORY\",    \"mechanicOrAgentSignature\" : {      \"username\" : \"jsmith\",      \"mechanicUserId\" : 14849,      \"email\" : \"j.smith@yahoo.com\",      \"signedAt\" : 12535500000,      \"name\" : \"John Smith\",      \"driverId\" : 2581,      \"type\" : \"driver\"    },    \"trailerDefects\" : [ {      \"defectType\" : \"Air Compressor\",      \"comment\" : \"Air Compressor not working\"    }, {      \"defectType\" : \"Air Compressor\",      \"comment\" : \"Air Compressor not working\"    } ],    \"trailerId\" : 19  }, {    \"vehicleDefects\" : [ {      \"defectType\" : \"Air Compressor\",      \"comment\" : \"Air Compressor not working\"    }, {      \"defectType\" : \"Air Compressor\",      \"comment\" : \"Air Compressor not working\"    } ],    \"defectsNeedNotBeCorrected\" : false,    \"authorSignature\" : {      \"username\" : \"jsmith\",      \"mechanicUserId\" : 14849,      \"email\" : \"j.smith@yahoo.com\",      \"signedAt\" : 12535500000,      \"name\" : \"John Smith\",      \"driverId\" : 2581,      \"type\" : \"driver\"    },    \"inspectionType\" : \"pre trip\",    \"odometerMiles\" : 49912,    \"vehicle\" : {      \"id\" : 19,      \"name\" : \"Storer's vehicle 19\"    },    \"timeMs\" : 1453449599999,    \"defectsCorrected\" : true,    \"mechanicNotes\" : \"The vehicle is now safe.\",    \"id\" : 19,    \"nextDriverSignature\" : {      \"username\" : \"jsmith\",      \"email\" : \"j.smith@yahoo.com\",      \"signedAt\" : 12535500000,      \"name\" : \"John Smith\",      \"driverId\" : 2581,      \"type\" : \"driver\"    },    \"trailerName\" : \"Storer's Trailer 19\",    \"vehicleCondition\" : \"SATISFACTORY\",    \"mechanicOrAgentSignature\" : {      \"username\" : \"jsmith\",      \"mechanicUserId\" : 14849,      \"email\" : \"j.smith@yahoo.com\",      \"signedAt\" : 12535500000,      \"name\" : \"John Smith\",      \"driverId\" : 2581,      \"type\" : \"driver\"    },    \"trailerDefects\" : [ {      \"defectType\" : \"Air Compressor\",      \"comment\" : \"Air Compressor not working\"    }, {      \"defectType\" : \"Air Compressor\",      \"comment\" : \"Air Compressor not working\"    } ],    \"trailerId\" : 19  } ]}", DvirListResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<DvirListResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<DvirListResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<DriversResponse> getFleetDrivers(@NotNull @ApiParam(value = "Samsara API access token.", required = true) @Valid @RequestParam(value = "access_token", required = true) String accessToken,@ApiParam(value = "" ,required=true )  @Valid @RequestBody GroupDriversParam groupDriversParam) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<DriversResponse>(objectMapper.readValue("{  \"drivers\" : [ \"\", \"\" ]}", DriversResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<DriversResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<DriversResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<DriverDailyLogResponse> getFleetDriversHosDailyLogs(@NotNull @ApiParam(value = "Samsara API access token.", required = true) @Valid @RequestParam(value = "access_token", required = true) String accessToken,@ApiParam(value = "ID of the driver with HOS logs.",required=true) @PathVariable("driver_id") Long driverId,@ApiParam(value = "" ,required=true )  @Valid @RequestBody HosLogsParam hosLogsParam) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<DriverDailyLogResponse>(objectMapper.readValue("{  \"days\" : [ {    \"distanceMiles\" : 123.24,    \"vehicleIds\" : [ 192319, 12958 ],    \"activeMs\" : 691200,    \"certified\" : true,    \"trailerIds\" : [ 10293, 192933 ],    \"certifiedAtMs\" : 0,    \"startMs\" : 1473750000000,    \"activeHours\" : 5.4,    \"endMs\" : 1473836400000  }, {    \"distanceMiles\" : 123.24,    \"vehicleIds\" : [ 192319, 12958 ],    \"activeMs\" : 691200,    \"certified\" : true,    \"trailerIds\" : [ 10293, 192933 ],    \"certifiedAtMs\" : 0,    \"startMs\" : 1473750000000,    \"activeHours\" : 5.4,    \"endMs\" : 1473836400000  } ]}", DriverDailyLogResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<DriverDailyLogResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<DriverDailyLogResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<DriversSummaryResponse> getFleetDriversSummary(@NotNull @ApiParam(value = "Samsara API access token.", required = true) @Valid @RequestParam(value = "access_token", required = true) String accessToken,@ApiParam(value = "Org ID and time range to query." ,required=true )  @Valid @RequestBody DriversSummaryParam driversSummaryParam,@ApiParam(value = "Snap query result to HOS day boundaries.") @Valid @RequestParam(value = "snap_to_day_bounds", required = false) Boolean snapToDayBounds) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<DriversSummaryResponse>(objectMapper.readValue("{  \"Summaries\" : [ {    \"distanceMiles\" : 123.24,    \"groupId\" : 111,    \"onDutyMs\" : 21600000,    \"activeMs\" : 43200000,    \"driverId\" : 444,    \"driveMs\" : 21600000,    \"driverUsername\" : \"fjacobs\",    \"driverName\" : \"Fred Jacobs\"  }, {    \"distanceMiles\" : 123.24,    \"groupId\" : 111,    \"onDutyMs\" : 21600000,    \"activeMs\" : 43200000,    \"driverId\" : 444,    \"driveMs\" : 21600000,    \"driverUsername\" : \"fjacobs\",    \"driverName\" : \"Fred Jacobs\"  } ]}", DriversSummaryResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<DriversSummaryResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<DriversSummaryResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<HosAuthenticationLogsResponse> getFleetHosAuthenticationLogs(@NotNull @ApiParam(value = "Samsara API access token.", required = true) @Valid @RequestParam(value = "access_token", required = true) String accessToken,@ApiParam(value = "" ,required=true )  @Valid @RequestBody HosAuthenticationLogsParam hosAuthenticationLogsParam) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<HosAuthenticationLogsResponse>(objectMapper.readValue("{  \"authenticationLogs\" : [ {    \"happenedAtMs\" : 1462881998034,    \"address\" : \"123 Main St., Ahwatukee, Arizona 85044\",    \"state\" : \"Arizona\",    \"actionType\" : \"signin\",    \"city\" : \"Ahwatukee\",    \"addressName\" : \"Garage Number 3\"  }, {    \"happenedAtMs\" : 1462881998034,    \"address\" : \"123 Main St., Ahwatukee, Arizona 85044\",    \"state\" : \"Arizona\",    \"actionType\" : \"signin\",    \"city\" : \"Ahwatukee\",    \"addressName\" : \"Garage Number 3\"  } ]}", HosAuthenticationLogsResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<HosAuthenticationLogsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<HosAuthenticationLogsResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<HosLogsResponse> getFleetHosLogs(@NotNull @ApiParam(value = "Samsara API access token.", required = true) @Valid @RequestParam(value = "access_token", required = true) String accessToken,@ApiParam(value = "" ,required=true )  @Valid @RequestBody HosLogsParam1 hosLogsParam) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<HosLogsResponse>(objectMapper.readValue("{  \"logs\" : [ {    \"groupId\" : 101,    \"logStartMs\" : 1462881998034,    \"codriverIds\" : [ 445, 445 ],    \"vehicleId\" : 112,    \"remark\" : \"Lunch Break\",    \"statusType\" : \"OFF_DUTY\",    \"driverId\" : 444,    \"locLng\" : -98.502888123,    \"locName\" : \"McLean Site A\",    \"locLat\" : 23.413702345,    \"locCity\" : \"Ahwatukee\",    \"locState\" : \"Arizona\"  }, {    \"groupId\" : 101,    \"logStartMs\" : 1462881998034,    \"codriverIds\" : [ 445, 445 ],    \"vehicleId\" : 112,    \"remark\" : \"Lunch Break\",    \"statusType\" : \"OFF_DUTY\",    \"driverId\" : 444,    \"locLng\" : -98.502888123,    \"locName\" : \"McLean Site A\",    \"locLat\" : 23.413702345,    \"locCity\" : \"Ahwatukee\",    \"locState\" : \"Arizona\"  } ]}", HosLogsResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<HosLogsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<HosLogsResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<HosLogsSummaryResponse> getFleetHosLogsSummary(@NotNull @ApiParam(value = "Samsara API access token.", required = true) @Valid @RequestParam(value = "access_token", required = true) String accessToken,@ApiParam(value = "" ,required=true )  @Valid @RequestBody HosLogsParam2 hosLogsParam) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<HosLogsSummaryResponse>(objectMapper.readValue("{  \"drivers\" : [ {    \"timeUntilBreak\" : 28800000,    \"dutyStatus\" : \"OFF_DUTY\",    \"vehicleName\" : \"Vehicle 1\",    \"shiftDriveRemaining\" : 39600000,    \"driverId\" : 444,    \"cycleTomorrow\" : 252000000,    \"shiftRemaining\" : 50400000,    \"drivingInViolationToday\" : 39600000,    \"timeInCurrentStatus\" : 5000,    \"cycleRemaining\" : 252000000,    \"drivingInViolationCycle\" : 50400000,    \"driverName\" : \"Fred Jacobs\"  }, {    \"timeUntilBreak\" : 28800000,    \"dutyStatus\" : \"OFF_DUTY\",    \"vehicleName\" : \"Vehicle 1\",    \"shiftDriveRemaining\" : 39600000,    \"driverId\" : 444,    \"cycleTomorrow\" : 252000000,    \"shiftRemaining\" : 50400000,    \"drivingInViolationToday\" : 39600000,    \"timeInCurrentStatus\" : 5000,    \"cycleRemaining\" : 252000000,    \"drivingInViolationCycle\" : 50400000,    \"driverName\" : \"Fred Jacobs\"  } ]}", HosLogsSummaryResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<HosLogsSummaryResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<HosLogsSummaryResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse2003> getFleetLocations(@NotNull @ApiParam(value = "Samsara API access token.", required = true) @Valid @RequestParam(value = "access_token", required = true) String accessToken,@ApiParam(value = "Group ID to query." ,required=true )  @Valid @RequestBody GroupParam groupParam) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse2003>(objectMapper.readValue("{  \"groupId\" : 101,  \"vehicles\" : [ {    \"id\" : 112,    \"time\" : 1462881998034,    \"onTrip\" : true,    \"speed\" : 64.37,    \"location\" : \"1 Main St, Dallas, TX\",    \"vin\" : \"JTNBB46KX73011966\",    \"name\" : \"Truck A7\",    \"odometerMeters\" : 71774705,    \"longitude\" : 32.897,    \"latitude\" : 123.456,    \"heading\" : 246.42  }, {    \"id\" : 112,    \"time\" : 1462881998034,    \"onTrip\" : true,    \"speed\" : 64.37,    \"location\" : \"1 Main St, Dallas, TX\",    \"vin\" : \"JTNBB46KX73011966\",    \"name\" : \"Truck A7\",    \"odometerMeters\" : 71774705,    \"longitude\" : 32.897,    \"latitude\" : 123.456,    \"heading\" : 246.42  } ]}", InlineResponse2003.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse2003>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse2003>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse2004> getFleetMaintenanceList(@NotNull @ApiParam(value = "Samsara API access token.", required = true) @Valid @RequestParam(value = "access_token", required = true) String accessToken,@ApiParam(value = "Group ID to query." ,required=true )  @Valid @RequestBody GroupParam groupParam) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse2004>(objectMapper.readValue("{  \"vehicles\" : [ {    \"passenger\" : {      \"diagnosticTroubleCodes\" : [ {        \"dtcShortCode\" : \"dtcShortCode\",        \"dtcDescription\" : \"dtcDescription\",        \"dtcId\" : 5      }, {        \"dtcShortCode\" : \"dtcShortCode\",        \"dtcDescription\" : \"dtcDescription\",        \"dtcId\" : 5      } ],      \"checkEngineLight\" : {        \"isOn\" : true      }    },    \"id\" : 112,    \"j1939\" : {      \"diagnosticTroubleCodes\" : [ {        \"spnDescription\" : \"spnDescription\",        \"occurrenceCount\" : 6,        \"fmiId\" : 0,        \"txId\" : 5,        \"fmiText\" : \"fmiText\",        \"spnId\" : 1      }, {        \"spnDescription\" : \"spnDescription\",        \"occurrenceCount\" : 6,        \"fmiId\" : 0,        \"txId\" : 5,        \"fmiText\" : \"fmiText\",        \"spnId\" : 1      } ],      \"checkEngineLight\" : {        \"emissionsIsOn\" : true,        \"stopIsOn\" : true,        \"warningIsOn\" : true,        \"protectIsOn\" : true      }    }  }, {    \"passenger\" : {      \"diagnosticTroubleCodes\" : [ {        \"dtcShortCode\" : \"dtcShortCode\",        \"dtcDescription\" : \"dtcDescription\",        \"dtcId\" : 5      }, {        \"dtcShortCode\" : \"dtcShortCode\",        \"dtcDescription\" : \"dtcDescription\",        \"dtcId\" : 5      } ],      \"checkEngineLight\" : {        \"isOn\" : true      }    },    \"id\" : 112,    \"j1939\" : {      \"diagnosticTroubleCodes\" : [ {        \"spnDescription\" : \"spnDescription\",        \"occurrenceCount\" : 6,        \"fmiId\" : 0,        \"txId\" : 5,        \"fmiText\" : \"fmiText\",        \"spnId\" : 1      }, {        \"spnDescription\" : \"spnDescription\",        \"occurrenceCount\" : 6,        \"fmiId\" : 0,        \"txId\" : 5,        \"fmiText\" : \"fmiText\",        \"spnId\" : 1      } ],      \"checkEngineLight\" : {        \"emissionsIsOn\" : true,        \"stopIsOn\" : true,        \"warningIsOn\" : true,        \"protectIsOn\" : true      }    }  } ]}", InlineResponse2004.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse2004>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse2004>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TripResponse> getFleetTrips(@NotNull @ApiParam(value = "Samsara API access token.", required = true) @Valid @RequestParam(value = "access_token", required = true) String accessToken,@ApiParam(value = "Group ID, vehicle ID and time range to query." ,required=true )  @Valid @RequestBody TripsParam tripsParam) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TripResponse>(objectMapper.readValue("{  \"trips\" : [ {    \"startAddress\" : \"Ramen Tatsunoya\",    \"endOdometer\" : 210430500,    \"distanceMeters\" : 2500,    \"startCoordinates\" : {      \"longitude\" : -98.502888123,      \"latitude\" : 29.443702345    },    \"startLocation\" : \"16 N Fair Oaks Ave, Pasadena, CA 91103\",    \"fuelConsumedMl\" : 75700,    \"endCoordinates\" : {      \"longitude\" : -91.502888123,      \"latitude\" : 23.413702345    },    \"tollMeters\" : 32000,    \"endLocation\" : \"571 S Lake Ave, Pasadena, CA 91101\",    \"driverId\" : 719,    \"endAddress\" : \"Winchell's Donuts House\",    \"startOdometer\" : 210430450,    \"startMs\" : 1462878398034,    \"endMs\" : 1462881998034  }, {    \"startAddress\" : \"Ramen Tatsunoya\",    \"endOdometer\" : 210430500,    \"distanceMeters\" : 2500,    \"startCoordinates\" : {      \"longitude\" : -98.502888123,      \"latitude\" : 29.443702345    },    \"startLocation\" : \"16 N Fair Oaks Ave, Pasadena, CA 91103\",    \"fuelConsumedMl\" : 75700,    \"endCoordinates\" : {      \"longitude\" : -91.502888123,      \"latitude\" : 23.413702345    },    \"tollMeters\" : 32000,    \"endLocation\" : \"571 S Lake Ave, Pasadena, CA 91101\",    \"driverId\" : 719,    \"endAddress\" : \"Winchell's Donuts House\",    \"startOdometer\" : 210430450,    \"startMs\" : 1462878398034,    \"endMs\" : 1462881998034  } ]}", TripResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TripResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TripResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<FleetVehicleResponse> getFleetVehicle(@NotNull @ApiParam(value = "Samsara API access token.", required = true) @Valid @RequestParam(value = "access_token", required = true) String accessToken,@ApiParam(value = "ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.",required=true) @PathVariable("vehicle_id_or_external_id") String vehicleIdOrExternalId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<FleetVehicleResponse>(objectMapper.readValue("{  \"id\" : 112,  \"externalIds\" : {    \"maintenanceId\" : \"ABFS18600\"  },  \"harshAccelSetting\" : \"Heavy\",  \"name\" : \"Truck A7\",  \"vehicleInfo\" : {    \"model\" : \"Odyssey\",    \"vin\" : \"1FUJA6BD31LJ09646\",    \"year\" : 1997,    \"make\" : \"Honda\"  }}", FleetVehicleResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<FleetVehicleResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<FleetVehicleResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<VehicleHarshEventResponse> getVehicleHarshEvent(@ApiParam(value = "ID of the vehicle",required=true) @PathVariable("vehicleId") Long vehicleId,@NotNull @ApiParam(value = "Samsara API access token.", required = true) @Valid @RequestParam(value = "access_token", required = true) String accessToken,@NotNull @ApiParam(value = "Timestamp in milliseconds representing the timestamp of a harsh event.", required = true) @Valid @RequestParam(value = "timestamp", required = true) Long timestamp) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<VehicleHarshEventResponse>(objectMapper.readValue("{  \"harshEventType\" : \"Harsh Braking\",  \"location\" : {    \"address\" : \"350 Rhode Island St, San Francisco, CA\",    \"longitude\" : \"-96.14907287\",    \"latitude\" : \"33.07614328\"  },  \"incidentReportUrl\" : \"https://cloud.samsara.com/groups/1234/fleet/reports/safety/vehicle/212123456789012/incident/1539201882984\",  \"downloadTrackedInwardVideoUrl\" : \"https://samsara-dashcam-videos.s3.us-west-2.amazonaws.com/123/212123456789012/1539201872984/abC123De4-camera-video-segment-driver-123456789.tracked.mp4?...\",  \"isDistracted\" : true,  \"downloadInwardVideoUrl\" : \"https://samsara-dashcam-videos.s3.us-west-2.amazonaws.com/123/212123456789012/1539201872984/abC123De4-camera-video-segment-driver-123456789.mp4?...\",  \"downloadForwardVideoUrl\" : \"https://samsara-dashcam-videos.s3.us-west-2.amazonaws.com/123/212123456789012/1539201872984/abC123De4-camera-video-segment-123456789.mp4?...\"}", VehicleHarshEventResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<VehicleHarshEventResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<VehicleHarshEventResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<FleetVehicleLocations> getVehicleLocations(@NotNull @ApiParam(value = "Samsara API access token.", required = true) @Valid @RequestParam(value = "access_token", required = true) String accessToken,@ApiParam(value = "ID of the vehicle with the associated routes.",required=true) @PathVariable("vehicle_id") Long vehicleId,@NotNull @ApiParam(value = "Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour)", required = true) @Valid @RequestParam(value = "startMs", required = true) Long startMs,@NotNull @ApiParam(value = "Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour)", required = true) @Valid @RequestParam(value = "endMs", required = true) Long endMs) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<FleetVehicleLocations>(objectMapper.readValue("\"\"", FleetVehicleLocations.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<FleetVehicleLocations>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<FleetVehicleLocations>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<VehicleSafetyScoreResponse> getVehicleSafetyScore(@ApiParam(value = "ID of the vehicle",required=true) @PathVariable("vehicleId") Long vehicleId,@NotNull @ApiParam(value = "Samsara API access token.", required = true) @Valid @RequestParam(value = "access_token", required = true) String accessToken,@NotNull @ApiParam(value = "Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.", required = true) @Valid @RequestParam(value = "startMs", required = true) Long startMs,@NotNull @ApiParam(value = "Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.", required = true) @Valid @RequestParam(value = "endMs", required = true) Long endMs) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<VehicleSafetyScoreResponse>(objectMapper.readValue("{  \"totalTimeDrivenMs\" : 19708293,  \"timeOverSpeedLimitMs\" : 3769,  \"harshBrakingCount\" : 2,  \"harshEvents\" : [ {    \"harshEventType\" : \"Harsh Braking\",    \"vehicleId\" : 212014918086169,    \"timestampMs\" : 1535590776000  }, {    \"harshEventType\" : \"Harsh Braking\",    \"vehicleId\" : 212014918086169,    \"timestampMs\" : 1535590776000  } ],  \"vehicleId\" : 4321,  \"harshTurningCount\" : 0,  \"totalHarshEventCount\" : 3,  \"safetyScore\" : 97,  \"crashCount\" : 0,  \"harshAccelCount\" : 1,  \"safetyScoreRank\" : \"26\",  \"totalDistanceDrivenMeters\" : 291836}", VehicleSafetyScoreResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<VehicleSafetyScoreResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<VehicleSafetyScoreResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse2005> getVehicleStats(@NotNull @ApiParam(value = "Samsara API access token.", required = true) @Valid @RequestParam(value = "access_token", required = true) String accessToken,@NotNull @ApiParam(value = "Time in Unix epoch milliseconds for the start of the query.", required = true) @Valid @RequestParam(value = "startMs", required = true) Integer startMs,@NotNull @ApiParam(value = "Time in Unix epoch milliseconds for the end of the query.", required = true) @Valid @RequestParam(value = "endMs", required = true) Integer endMs,@ApiParam(value = "Comma-separated list of stat types. Options are engineState, auxInput1, and auxInput2. If this parameter is excluded, all 3 stat types will be returned. Example: series=engineState,auxInput2", allowableValues = "engineState, auxInput1, auxInput2") @Valid @RequestParam(value = "series", required = false) String series,@ApiParam(value = "Comma-separated list of tag ids. Example: tagIds=1,2,3") @Valid @RequestParam(value = "tagIds", required = false) String tagIds,@ApiParam(value = "Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'endingBefore' parameter.") @Valid @RequestParam(value = "startingAfter", required = false) String startingAfter,@ApiParam(value = "Pagination parameter indicating the cursor position to return results before. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'startingAfter' parameter.") @Valid @RequestParam(value = "endingBefore", required = false) String endingBefore,@ApiParam(value = "Pagination parameter indicating the number of results to return in this request. Used in conjunction with either 'startingAfter' or 'endingBefore'.") @Valid @RequestParam(value = "limit", required = false) Long limit) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse2005>(objectMapper.readValue("{  \"vehicleStats\" : [ {    \"auxInput1\" : {      \"values\" : [ {        \"value\" : true,        \"timeMs\" : 1.546542978484E12      }, {        \"value\" : true,        \"timeMs\" : 1.546542978484E12      } ],      \"name\" : \"Boom\"    },    \"vehicleId\" : 112,    \"auxInput2\" : {      \"values\" : [ {        \"value\" : true,        \"timeMs\" : 1.546542978484E12      }, {        \"value\" : true,        \"timeMs\" : 1.546542978484E12      } ],      \"name\" : \"Boom\"    },    \"engineState\" : [ {      \"value\" : \"Running\",      \"timeMs\" : 1.546542978484E12    }, {      \"value\" : \"Running\",      \"timeMs\" : 1.546542978484E12    } ]  }, {    \"auxInput1\" : {      \"values\" : [ {        \"value\" : true,        \"timeMs\" : 1.546542978484E12      }, {        \"value\" : true,        \"timeMs\" : 1.546542978484E12      } ],      \"name\" : \"Boom\"    },    \"vehicleId\" : 112,    \"auxInput2\" : {      \"values\" : [ {        \"value\" : true,        \"timeMs\" : 1.546542978484E12      }, {        \"value\" : true,        \"timeMs\" : 1.546542978484E12      } ],      \"name\" : \"Boom\"    },    \"engineState\" : [ {      \"value\" : \"Running\",      \"timeMs\" : 1.546542978484E12    }, {      \"value\" : \"Running\",      \"timeMs\" : 1.546542978484E12    } ]  } ],  \"pagination\" : {    \"hasNextPage\" : true,    \"startCursor\" : \"MTU5MTEzNjA2OTU0MzQ3\",    \"endCursor\" : \"MTU5MTEzNjA2OTU0MzQ3\",    \"hasPrevPage\" : true  }}", InlineResponse2005.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse2005>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse2005>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<FleetVehiclesLocations> getVehiclesLocations(@NotNull @ApiParam(value = "Samsara API access token.", required = true) @Valid @RequestParam(value = "access_token", required = true) String accessToken,@NotNull @ApiParam(value = "Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes)", required = true) @Valid @RequestParam(value = "startMs", required = true) Integer startMs,@NotNull @ApiParam(value = "Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes)", required = true) @Valid @RequestParam(value = "endMs", required = true) Integer endMs) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<FleetVehiclesLocations>(objectMapper.readValue("\"\"", FleetVehiclesLocations.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<FleetVehiclesLocations>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<FleetVehiclesLocations>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse2002> listFleet(@NotNull @ApiParam(value = "Samsara API access token.", required = true) @Valid @RequestParam(value = "access_token", required = true) String accessToken,@ApiParam(value = "Group ID to query." ,required=true )  @Valid @RequestBody GroupParam groupParam,@ApiParam(value = "Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'endingBefore' parameter.") @Valid @RequestParam(value = "startingAfter", required = false) String startingAfter,@ApiParam(value = "Pagination parameter indicating the cursor position to return results before. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'startingAfter' parameter.") @Valid @RequestParam(value = "endingBefore", required = false) String endingBefore,@ApiParam(value = "Pagination parameter indicating the number of results to return in this request. Used in conjunction with either 'startingAfter' or 'endingBefore'.") @Valid @RequestParam(value = "limit", required = false) Long limit) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse2002>(objectMapper.readValue("{  \"groupId\" : 101,  \"vehicles\" : [ {    \"id\" : 112,    \"fuelLevelPercent\" : 0.3,    \"engineHours\" : 1500,    \"vin\" : \"1FUJA6BD31LJ09646\",    \"name\" : \"Truck A7\",    \"odometerMeters\" : 60130000,    \"note\" : \"Red truck 2015 M16\"  }, {    \"id\" : 112,    \"fuelLevelPercent\" : 0.3,    \"engineHours\" : 1500,    \"vin\" : \"1FUJA6BD31LJ09646\",    \"name\" : \"Truck A7\",    \"odometerMeters\" : 60130000,    \"note\" : \"Red truck 2015 M16\"  } ],  \"pagination\" : {    \"hasNextPage\" : true,    \"startCursor\" : \"MTU5MTEzNjA2OTU0MzQ3\",    \"endCursor\" : \"MTU5MTEzNjA2OTU0MzQ3\",    \"hasPrevPage\" : true  }}", InlineResponse2002.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse2002>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse2002>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<FleetVehicleResponse> patchFleetVehicle(@NotNull @ApiParam(value = "Samsara API access token.", required = true) @Valid @RequestParam(value = "access_token", required = true) String accessToken,@ApiParam(value = "ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.",required=true) @PathVariable("vehicle_id_or_external_id") String vehicleIdOrExternalId,@ApiParam(value = "" ,required=true )  @Valid @RequestBody Data data) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<FleetVehicleResponse>(objectMapper.readValue("{  \"id\" : 112,  \"externalIds\" : {    \"maintenanceId\" : \"ABFS18600\"  },  \"harshAccelSetting\" : \"Heavy\",  \"name\" : \"Truck A7\",  \"vehicleInfo\" : {    \"model\" : \"Odyssey\",    \"vin\" : \"1FUJA6BD31LJ09646\",    \"year\" : 1997,    \"make\" : \"Honda\"  }}", FleetVehicleResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<FleetVehicleResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<FleetVehicleResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<CurrentDriver> reactivateDriverById(@NotNull @ApiParam(value = "Samsara API access token.", required = true) @Valid @RequestParam(value = "access_token", required = true) String accessToken,@ApiParam(value = "ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.",required=true) @PathVariable("driver_id_or_external_id") String driverIdOrExternalId,@ApiParam(value = "Driver reactivation body" ,required=true )  @Valid @RequestBody ReactivateDriverParam reactivateDriverParam) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<CurrentDriver>(objectMapper.readValue("\"\"", CurrentDriver.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<CurrentDriver>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<CurrentDriver>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<DispatchRoute> updateDispatchRouteById(@NotNull @ApiParam(value = "Samsara API access token.", required = true) @Valid @RequestParam(value = "access_token", required = true) String accessToken,@ApiParam(value = "ID of the dispatch route.",required=true) @PathVariable("route_id") Long routeId,@ApiParam(value = "" ,required=true )  @Valid @RequestBody DispatchRoute updateDispatchRouteParams) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<DispatchRoute>(objectMapper.readValue("\"\"", DispatchRoute.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<DispatchRoute>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<DispatchRoute>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateVehicles(@NotNull @ApiParam(value = "Samsara API access token.", required = true) @Valid @RequestParam(value = "access_token", required = true) String accessToken,@ApiParam(value = "" ,required=true )  @Valid @RequestBody VehicleUpdateParam vehicleUpdateParam) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}

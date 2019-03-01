package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.Address;
import com.prokarma.pkmst.model.AllRouteJobUpdates;
import com.prokarma.pkmst.model.AssetReeferResponse;
import com.prokarma.pkmst.model.Contact;
import com.prokarma.pkmst.model.DispatchRoute;
import com.prokarma.pkmst.model.DispatchRouteCreate;
import com.prokarma.pkmst.model.DispatchRouteHistory;
import com.prokarma.pkmst.model.Document;
import com.prokarma.pkmst.model.DocumentCreate;
import com.prokarma.pkmst.model.DocumentType;
import com.prokarma.pkmst.model.Driver;
import com.prokarma.pkmst.model.DriverDailyLogResponse;
import com.prokarma.pkmst.model.DriverForCreate;
import com.prokarma.pkmst.model.DriverSafetyScoreResponse;
import com.prokarma.pkmst.model.DriversResponse;
import com.prokarma.pkmst.model.DriversSummaryResponse;
import com.prokarma.pkmst.model.DvirBase;
import com.prokarma.pkmst.model.DvirListResponse;
import com.prokarma.pkmst.model.FleetVehicleLocation;
import com.prokarma.pkmst.model.FleetVehicleResponse;
import com.prokarma.pkmst.model.HosAuthenticationLogsResponse;
import com.prokarma.pkmst.model.HosLogsResponse;
import com.prokarma.pkmst.model.HosLogsSummaryResponse;
import com.prokarma.pkmst.model.InlineObject;
import com.prokarma.pkmst.model.InlineObject1;
import com.prokarma.pkmst.model.InlineObject10;
import com.prokarma.pkmst.model.InlineObject11;
import com.prokarma.pkmst.model.InlineObject12;
import com.prokarma.pkmst.model.InlineObject13;
import com.prokarma.pkmst.model.InlineObject14;
import com.prokarma.pkmst.model.InlineObject15;
import com.prokarma.pkmst.model.InlineObject16;
import com.prokarma.pkmst.model.InlineObject2;
import com.prokarma.pkmst.model.InlineObject3;
import com.prokarma.pkmst.model.InlineObject4;
import com.prokarma.pkmst.model.InlineObject5;
import com.prokarma.pkmst.model.InlineObject6;
import com.prokarma.pkmst.model.InlineObject7;
import com.prokarma.pkmst.model.InlineObject8;
import com.prokarma.pkmst.model.InlineObject9;
import com.prokarma.pkmst.model.InlineResponse200;
import com.prokarma.pkmst.model.InlineResponse2001;
import com.prokarma.pkmst.model.InlineResponse2002;
import com.prokarma.pkmst.model.InlineResponse2003;
import com.prokarma.pkmst.model.InlineResponse2004;
import com.prokarma.pkmst.model.InlineResponse2005;
import com.prokarma.pkmst.model.TripResponse;
import com.prokarma.pkmst.model.VehicleHarshEventResponse;
import com.prokarma.pkmst.model.VehicleSafetyScoreResponse;

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
public class FleetApiController implements FleetApi {
    private final ObjectMapper objectMapper;
@Autowired
    public FleetApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<Void> addFleetAddress(@ApiParam(value = "Samsara API access token.", required = true)  @RequestParam(value = "access_token", required = true) String accessToken,
        @ApiParam(value = "" ,required=true )   @RequestBody InlineObject2 addressParam,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<List<Address>> addOrganizationAddresses(@ApiParam(value = "Samsara API access token.", required = true)  @RequestParam(value = "access_token", required = true) String accessToken,
        @ApiParam(value = "" ,required=true )   @RequestBody InlineObject addresses,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<Address>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }

        return new ResponseEntity<List<Address>>(HttpStatus.OK);
    }

    public ResponseEntity<DispatchRoute> createDispatchRoute(@ApiParam(value = "Samsara API access token.", required = true)  @RequestParam(value = "access_token", required = true) String accessToken,
        @ApiParam(value = "" ,required=true )   @RequestBody DispatchRouteCreate createDispatchRouteParams,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DispatchRoute>(objectMapper.readValue("", DispatchRoute.class), HttpStatus.OK);
        }

        return new ResponseEntity<DispatchRoute>(HttpStatus.OK);
    }

    public ResponseEntity<Driver> createDriver(@ApiParam(value = "Samsara API access token.", required = true)  @RequestParam(value = "access_token", required = true) String accessToken,
        @ApiParam(value = "Driver creation body" ,required=true )   @RequestBody DriverForCreate createDriverParam,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Driver>(objectMapper.readValue("", Driver.class), HttpStatus.OK);
        }

        return new ResponseEntity<Driver>(HttpStatus.OK);
    }

    public ResponseEntity<DispatchRoute> createDriverDispatchRoute(@ApiParam(value = "Samsara API access token.", required = true)  @RequestParam(value = "access_token", required = true) String accessToken,
        @ApiParam(value = "ID of the driver with the associated routes.",required=true ) @PathVariable("driver_id") Long driverId,
        @ApiParam(value = "" ,required=true )   @RequestBody DispatchRouteCreate createDispatchRouteParams,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DispatchRoute>(objectMapper.readValue("", DispatchRoute.class), HttpStatus.OK);
        }

        return new ResponseEntity<DispatchRoute>(HttpStatus.OK);
    }

    public ResponseEntity<Document> createDriverDocument(@ApiParam(value = "Samsara API access token.", required = true)  @RequestParam(value = "access_token", required = true) String accessToken,
        @ApiParam(value = "ID of the driver for whom the document is created.",required=true ) @PathVariable("driver_id") Long driverId,
        @ApiParam(value = "To create a document for a given document type, the document type's uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field's valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_." ,required=true )   @RequestBody DocumentCreate createDocumentParams,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Document>(objectMapper.readValue("", Document.class), HttpStatus.OK);
        }

        return new ResponseEntity<Document>(HttpStatus.OK);
    }

    public ResponseEntity<DvirBase> createDvir(@ApiParam(value = "Samsara API access token.", required = true)  @RequestParam(value = "access_token", required = true) String accessToken,
        @ApiParam(value = "" ,required=true )   @RequestBody InlineObject12 createDvirParam,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DvirBase>(objectMapper.readValue("", DvirBase.class), HttpStatus.OK);
        }

        return new ResponseEntity<DvirBase>(HttpStatus.OK);
    }

    public ResponseEntity<DispatchRoute> createVehicleDispatchRoute(@ApiParam(value = "Samsara API access token.", required = true)  @RequestParam(value = "access_token", required = true) String accessToken,
        @ApiParam(value = "ID of the vehicle with the associated routes.",required=true ) @PathVariable("vehicle_id") Long vehicleId,
        @ApiParam(value = "" ,required=true )   @RequestBody DispatchRouteCreate createDispatchRouteParams,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DispatchRoute>(objectMapper.readValue("", DispatchRoute.class), HttpStatus.OK);
        }

        return new ResponseEntity<DispatchRoute>(HttpStatus.OK);
    }

    public ResponseEntity<Void> deactivateDriver(@ApiParam(value = "Samsara API access token.", required = true)  @RequestParam(value = "access_token", required = true) String accessToken,
        @ApiParam(value = "ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.",required=true ) @PathVariable("driver_id_or_external_id") String driverIdOrExternalId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> deleteDispatchRouteById(@ApiParam(value = "Samsara API access token.", required = true)  @RequestParam(value = "access_token", required = true) String accessToken,
        @ApiParam(value = "ID of the dispatch route.",required=true ) @PathVariable("route_id") Long routeId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> deleteOrganizationAddress(@ApiParam(value = "Samsara API access token.", required = true)  @RequestParam(value = "access_token", required = true) String accessToken,
        @ApiParam(value = "ID of the address/geofence",required=true ) @PathVariable("addressId") Long addressId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<List<DispatchRoute>> fetchAllDispatchRoutes(@ApiParam(value = "Samsara API access token.", required = true)  @RequestParam(value = "access_token", required = true) String accessToken,
        @ApiParam(value = "Optional group ID if the organization has multiple groups (uncommon).")  @RequestParam(value = "group_id", required = false) Long groupId,
        @ApiParam(value = "Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.")  @RequestParam(value = "end_time", required = false) Long endTime,
        @ApiParam(value = "Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.")  @RequestParam(value = "duration", required = false) Long duration,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<DispatchRoute>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }

        return new ResponseEntity<List<DispatchRoute>>(HttpStatus.OK);
    }

    public ResponseEntity<AllRouteJobUpdates> fetchAllRouteJobUpdates(@ApiParam(value = "Samsara API access token.", required = true)  @RequestParam(value = "access_token", required = true) String accessToken,
        @ApiParam(value = "Optional group ID if the organization has multiple groups (uncommon).")  @RequestParam(value = "group_id", required = false) Long groupId,
        @ApiParam(value = "Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours.")  @RequestParam(value = "sequence_id", required = false) String sequenceId,
        @ApiParam(value = "Optionally set include=route to include route object in response payload.")  @RequestParam(value = "include", required = false) String include,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AllRouteJobUpdates>(objectMapper.readValue("", AllRouteJobUpdates.class), HttpStatus.OK);
        }

        return new ResponseEntity<AllRouteJobUpdates>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse2001> getAllAssetCurrentLocations(@ApiParam(value = "Samsara API access token.", required = true)  @RequestParam(value = "access_token", required = true) String accessToken,
        @ApiParam(value = "Optional group ID if the organization has multiple groups (uncommon).")  @RequestParam(value = "group_id", required = false) Long groupId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<InlineResponse2001>(objectMapper.readValue("", InlineResponse2001.class), HttpStatus.OK);
        }

        return new ResponseEntity<InlineResponse2001>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse200> getAllAssets(@ApiParam(value = "Samsara API access token.", required = true)  @RequestParam(value = "access_token", required = true) String accessToken,
        @ApiParam(value = "Optional group ID if the organization has multiple groups (uncommon).")  @RequestParam(value = "group_id", required = false) Long groupId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<InlineResponse200>(objectMapper.readValue("", InlineResponse200.class), HttpStatus.OK);
        }

        return new ResponseEntity<InlineResponse200>(HttpStatus.OK);
    }

    public ResponseEntity<List<Driver>> getAllDeactivatedDrivers(@ApiParam(value = "Samsara API access token.", required = true)  @RequestParam(value = "access_token", required = true) String accessToken,
        @ApiParam(value = "Optional group ID if the organization has multiple groups (uncommon).")  @RequestParam(value = "group_id", required = false) Long groupId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<Driver>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }

        return new ResponseEntity<List<Driver>>(HttpStatus.OK);
    }

    public ResponseEntity<List<Object>> getAssetLocation(@ApiParam(value = "Samsara API access token.", required = true)  @RequestParam(value = "access_token", required = true) String accessToken,
        @ApiParam(value = "ID of the asset",required=true ) @PathVariable("asset_id") Long assetId,
        @ApiParam(value = "Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.", required = true)  @RequestParam(value = "startMs", required = true) Long startMs,
        @ApiParam(value = "Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.", required = true)  @RequestParam(value = "endMs", required = true) Long endMs,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<Object>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }

        return new ResponseEntity<List<Object>>(HttpStatus.OK);
    }

    public ResponseEntity<AssetReeferResponse> getAssetReefer(@ApiParam(value = "Samsara API access token.", required = true)  @RequestParam(value = "access_token", required = true) String accessToken,
        @ApiParam(value = "ID of the asset",required=true ) @PathVariable("asset_id") Long assetId,
        @ApiParam(value = "Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.", required = true)  @RequestParam(value = "startMs", required = true) Long startMs,
        @ApiParam(value = "Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.", required = true)  @RequestParam(value = "endMs", required = true) Long endMs,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AssetReeferResponse>(objectMapper.readValue("", AssetReeferResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<AssetReeferResponse>(HttpStatus.OK);
    }

    public ResponseEntity<Driver> getDeactivatedDriverById(@ApiParam(value = "Samsara API access token.", required = true)  @RequestParam(value = "access_token", required = true) String accessToken,
        @ApiParam(value = "ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.",required=true ) @PathVariable("driver_id_or_external_id") String driverIdOrExternalId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Driver>(objectMapper.readValue("", Driver.class), HttpStatus.OK);
        }

        return new ResponseEntity<Driver>(HttpStatus.OK);
    }

    public ResponseEntity<DispatchRoute> getDispatchRouteById(@ApiParam(value = "Samsara API access token.", required = true)  @RequestParam(value = "access_token", required = true) String accessToken,
        @ApiParam(value = "ID of the dispatch route.",required=true ) @PathVariable("route_id") Long routeId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DispatchRoute>(objectMapper.readValue("", DispatchRoute.class), HttpStatus.OK);
        }

        return new ResponseEntity<DispatchRoute>(HttpStatus.OK);
    }

    public ResponseEntity<DispatchRouteHistory> getDispatchRouteHistory(@ApiParam(value = "Samsara API access token.", required = true)  @RequestParam(value = "access_token", required = true) String accessToken,
        @ApiParam(value = "ID of the route with history.",required=true ) @PathVariable("route_id") Long routeId,
        @ApiParam(value = "Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0.")  @RequestParam(value = "start_time", required = false) Long startTime,
        @ApiParam(value = "Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs.")  @RequestParam(value = "end_time", required = false) Long endTime,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DispatchRouteHistory>(objectMapper.readValue("", DispatchRouteHistory.class), HttpStatus.OK);
        }

        return new ResponseEntity<DispatchRouteHistory>(HttpStatus.OK);
    }

    public ResponseEntity<List<DispatchRoute>> getDispatchRoutesByDriverId(@ApiParam(value = "Samsara API access token.", required = true)  @RequestParam(value = "access_token", required = true) String accessToken,
        @ApiParam(value = "ID of the driver with the associated routes.",required=true ) @PathVariable("driver_id") Long driverId,
        @ApiParam(value = "Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.")  @RequestParam(value = "end_time", required = false) Long endTime,
        @ApiParam(value = "Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.")  @RequestParam(value = "duration", required = false) Long duration,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<DispatchRoute>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }

        return new ResponseEntity<List<DispatchRoute>>(HttpStatus.OK);
    }

    public ResponseEntity<List<DispatchRoute>> getDispatchRoutesByVehicleId(@ApiParam(value = "Samsara API access token.", required = true)  @RequestParam(value = "access_token", required = true) String accessToken,
        @ApiParam(value = "ID of the vehicle with the associated routes.",required=true ) @PathVariable("vehicle_id") Long vehicleId,
        @ApiParam(value = "Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.")  @RequestParam(value = "end_time", required = false) Long endTime,
        @ApiParam(value = "Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.")  @RequestParam(value = "duration", required = false) Long duration,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<DispatchRoute>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }

        return new ResponseEntity<List<DispatchRoute>>(HttpStatus.OK);
    }

    public ResponseEntity<Driver> getDriverById(@ApiParam(value = "Samsara API access token.", required = true)  @RequestParam(value = "access_token", required = true) String accessToken,
        @ApiParam(value = "ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.",required=true ) @PathVariable("driver_id_or_external_id") String driverIdOrExternalId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Driver>(objectMapper.readValue("", Driver.class), HttpStatus.OK);
        }

        return new ResponseEntity<Driver>(HttpStatus.OK);
    }

    public ResponseEntity<List<DocumentType>> getDriverDocumentTypesByOrgId(@RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<DocumentType>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }

        return new ResponseEntity<List<DocumentType>>(HttpStatus.OK);
    }

    public ResponseEntity<List<Document>> getDriverDocumentsByOrgId(@ApiParam(value = "Samsara API access token.", required = true)  @RequestParam(value = "access_token", required = true) String accessToken,
        @ApiParam(value = "Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now.")  @RequestParam(value = "endMs", required = false) Long endMs,
        @ApiParam(value = "Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours.")  @RequestParam(value = "durationMs", required = false) Long durationMs,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<Document>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }

        return new ResponseEntity<List<Document>>(HttpStatus.OK);
    }

    public ResponseEntity<DriverSafetyScoreResponse> getDriverSafetyScore(@ApiParam(value = "ID of the driver",required=true ) @PathVariable("driverId") Long driverId,
        @ApiParam(value = "Samsara API access token.", required = true)  @RequestParam(value = "access_token", required = true) String accessToken,
        @ApiParam(value = "Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.", required = true)  @RequestParam(value = "startMs", required = true) Long startMs,
        @ApiParam(value = "Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.", required = true)  @RequestParam(value = "endMs", required = true) Long endMs,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DriverSafetyScoreResponse>(objectMapper.readValue("", DriverSafetyScoreResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<DriverSafetyScoreResponse>(HttpStatus.OK);
    }

    public ResponseEntity<DvirListResponse> getDvirs(@ApiParam(value = "Samsara API access token.", required = true)  @RequestParam(value = "access_token", required = true) String accessToken,
        @ApiParam(value = "time in millis until the last dvir log.", required = true)  @RequestParam(value = "end_ms", required = true) Integer endMs,
        @ApiParam(value = "time in millis which corresponds to the duration before the end_ms.", required = true)  @RequestParam(value = "duration_ms", required = true) Integer durationMs,
        @ApiParam(value = "Group ID to query.")  @RequestParam(value = "group_id", required = false) Integer groupId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DvirListResponse>(objectMapper.readValue("", DvirListResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<DvirListResponse>(HttpStatus.OK);
    }

    public ResponseEntity<DriversResponse> getFleetDrivers(@ApiParam(value = "Samsara API access token.", required = true)  @RequestParam(value = "access_token", required = true) String accessToken,
        @ApiParam(value = "" ,required=true )   @RequestBody InlineObject3 groupDriversParam,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DriversResponse>(objectMapper.readValue("", DriversResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<DriversResponse>(HttpStatus.OK);
    }

    public ResponseEntity<DriverDailyLogResponse> getFleetDriversHosDailyLogs(@ApiParam(value = "Samsara API access token.", required = true)  @RequestParam(value = "access_token", required = true) String accessToken,
        @ApiParam(value = "ID of the driver with HOS logs.",required=true ) @PathVariable("driver_id") Long driverId,
        @ApiParam(value = "" ,required=true )   @RequestBody InlineObject6 hosLogsParam,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DriverDailyLogResponse>(objectMapper.readValue("", DriverDailyLogResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<DriverDailyLogResponse>(HttpStatus.OK);
    }

    public ResponseEntity<DriversSummaryResponse> getFleetDriversSummary(@ApiParam(value = "Samsara API access token.", required = true)  @RequestParam(value = "access_token", required = true) String accessToken,
        @ApiParam(value = "" ,required=true )   @RequestBody InlineObject5 driversSummaryParam,
        @ApiParam(value = "Snap query result to HOS day boundaries.")  @RequestParam(value = "snap_to_day_bounds", required = false) Boolean snapToDayBounds,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DriversSummaryResponse>(objectMapper.readValue("", DriversSummaryResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<DriversSummaryResponse>(HttpStatus.OK);
    }

    public ResponseEntity<HosAuthenticationLogsResponse> getFleetHosAuthenticationLogs(@ApiParam(value = "Samsara API access token.", required = true)  @RequestParam(value = "access_token", required = true) String accessToken,
        @ApiParam(value = "" ,required=true )   @RequestBody InlineObject7 hosAuthenticationLogsParam,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<HosAuthenticationLogsResponse>(objectMapper.readValue("", HosAuthenticationLogsResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<HosAuthenticationLogsResponse>(HttpStatus.OK);
    }

    public ResponseEntity<HosLogsResponse> getFleetHosLogs(@ApiParam(value = "Samsara API access token.", required = true)  @RequestParam(value = "access_token", required = true) String accessToken,
        @ApiParam(value = "" ,required=true )   @RequestBody InlineObject8 hosLogsParam,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<HosLogsResponse>(objectMapper.readValue("", HosLogsResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<HosLogsResponse>(HttpStatus.OK);
    }

    public ResponseEntity<HosLogsSummaryResponse> getFleetHosLogsSummary(@ApiParam(value = "Samsara API access token.", required = true)  @RequestParam(value = "access_token", required = true) String accessToken,
        @ApiParam(value = "" ,required=true )   @RequestBody InlineObject9 hosLogsParam,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<HosLogsSummaryResponse>(objectMapper.readValue("", HosLogsSummaryResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<HosLogsSummaryResponse>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse2003> getFleetLocations(@ApiParam(value = "Samsara API access token.", required = true)  @RequestParam(value = "access_token", required = true) String accessToken,
        @ApiParam(value = "" ,required=true )   @RequestBody InlineObject11 groupParam,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<InlineResponse2003>(objectMapper.readValue("", InlineResponse2003.class), HttpStatus.OK);
        }

        return new ResponseEntity<InlineResponse2003>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse2004> getFleetMaintenanceList(@ApiParam(value = "Samsara API access token.", required = true)  @RequestParam(value = "access_token", required = true) String accessToken,
        @ApiParam(value = "" ,required=true )   @RequestBody InlineObject13 groupParam,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<InlineResponse2004>(objectMapper.readValue("", InlineResponse2004.class), HttpStatus.OK);
        }

        return new ResponseEntity<InlineResponse2004>(HttpStatus.OK);
    }

    public ResponseEntity<TripResponse> getFleetTrips(@ApiParam(value = "Samsara API access token.", required = true)  @RequestParam(value = "access_token", required = true) String accessToken,
        @ApiParam(value = "" ,required=true )   @RequestBody InlineObject15 tripsParam,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<TripResponse>(objectMapper.readValue("", TripResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<TripResponse>(HttpStatus.OK);
    }

    public ResponseEntity<FleetVehicleResponse> getFleetVehicle(@ApiParam(value = "Samsara API access token.", required = true)  @RequestParam(value = "access_token", required = true) String accessToken,
        @ApiParam(value = "ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.",required=true ) @PathVariable("vehicle_id_or_external_id") String vehicleIdOrExternalId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<FleetVehicleResponse>(objectMapper.readValue("", FleetVehicleResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<FleetVehicleResponse>(HttpStatus.OK);
    }

    public ResponseEntity<Address> getOrganizationAddress(@ApiParam(value = "Samsara API access token.", required = true)  @RequestParam(value = "access_token", required = true) String accessToken,
        @ApiParam(value = "ID of the address/geofence",required=true ) @PathVariable("addressId") Long addressId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Address>(objectMapper.readValue("", Address.class), HttpStatus.OK);
        }

        return new ResponseEntity<Address>(HttpStatus.OK);
    }

    public ResponseEntity<List<Address>> getOrganizationAddresses(@ApiParam(value = "Samsara API access token.", required = true)  @RequestParam(value = "access_token", required = true) String accessToken,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<Address>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }

        return new ResponseEntity<List<Address>>(HttpStatus.OK);
    }

    public ResponseEntity<Contact> getOrganizationContact(@ApiParam(value = "Samsara API access token.", required = true)  @RequestParam(value = "access_token", required = true) String accessToken,
        @ApiParam(value = "ID of the contact",required=true ) @PathVariable("contact_id") Long contactId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Contact>(objectMapper.readValue("", Contact.class), HttpStatus.OK);
        }

        return new ResponseEntity<Contact>(HttpStatus.OK);
    }

    public ResponseEntity<VehicleHarshEventResponse> getVehicleHarshEvent(@ApiParam(value = "ID of the vehicle",required=true ) @PathVariable("vehicleId") Long vehicleId,
        @ApiParam(value = "Samsara API access token.", required = true)  @RequestParam(value = "access_token", required = true) String accessToken,
        @ApiParam(value = "Timestamp in milliseconds representing the timestamp of a harsh event.", required = true)  @RequestParam(value = "timestamp", required = true) Long timestamp,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<VehicleHarshEventResponse>(objectMapper.readValue("", VehicleHarshEventResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<VehicleHarshEventResponse>(HttpStatus.OK);
    }

    public ResponseEntity<List<FleetVehicleLocation>> getVehicleLocations(@ApiParam(value = "Samsara API access token.", required = true)  @RequestParam(value = "access_token", required = true) String accessToken,
        @ApiParam(value = "ID of the vehicle with the associated routes.",required=true ) @PathVariable("vehicle_id") Long vehicleId,
        @ApiParam(value = "Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour)", required = true)  @RequestParam(value = "startMs", required = true) Long startMs,
        @ApiParam(value = "Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour)", required = true)  @RequestParam(value = "endMs", required = true) Long endMs,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<FleetVehicleLocation>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }

        return new ResponseEntity<List<FleetVehicleLocation>>(HttpStatus.OK);
    }

    public ResponseEntity<VehicleSafetyScoreResponse> getVehicleSafetyScore(@ApiParam(value = "ID of the vehicle",required=true ) @PathVariable("vehicleId") Long vehicleId,
        @ApiParam(value = "Samsara API access token.", required = true)  @RequestParam(value = "access_token", required = true) String accessToken,
        @ApiParam(value = "Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.", required = true)  @RequestParam(value = "startMs", required = true) Long startMs,
        @ApiParam(value = "Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.", required = true)  @RequestParam(value = "endMs", required = true) Long endMs,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<VehicleSafetyScoreResponse>(objectMapper.readValue("", VehicleSafetyScoreResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<VehicleSafetyScoreResponse>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse2005> getVehicleStats(@ApiParam(value = "Samsara API access token.", required = true)  @RequestParam(value = "access_token", required = true) String accessToken,
        @ApiParam(value = "Time in Unix epoch milliseconds for the start of the query.", required = true)  @RequestParam(value = "startMs", required = true) Integer startMs,
        @ApiParam(value = "Time in Unix epoch milliseconds for the end of the query.", required = true)  @RequestParam(value = "endMs", required = true) Integer endMs,
        @ApiParam(value = "Comma-separated list of stat types. Options are engineState, auxInput1, and auxInput2. If this parameter is excluded, all 3 stat types will be returned. Example: series=engineState,auxInput2", allowableValues = "engineState, auxInput1, auxInput2")  @RequestParam(value = "series", required = false) String series,
        @ApiParam(value = "Comma-separated list of tag ids. Example: tagIds=1,2,3")  @RequestParam(value = "tagIds", required = false) String tagIds,
        @ApiParam(value = "Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'endingBefore' parameter.")  @RequestParam(value = "startingAfter", required = false) String startingAfter,
        @ApiParam(value = "Pagination parameter indicating the cursor position to return results before. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'startingAfter' parameter.")  @RequestParam(value = "endingBefore", required = false) String endingBefore,
        @ApiParam(value = "Pagination parameter indicating the number of results to return in this request. Used in conjunction with either 'startingAfter' or 'endingBefore'.")  @RequestParam(value = "limit", required = false) Long limit,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<InlineResponse2005>(objectMapper.readValue("", InlineResponse2005.class), HttpStatus.OK);
        }

        return new ResponseEntity<InlineResponse2005>(HttpStatus.OK);
    }

    public ResponseEntity<List<Object>> getVehiclesLocations(@ApiParam(value = "Samsara API access token.", required = true)  @RequestParam(value = "access_token", required = true) String accessToken,
        @ApiParam(value = "Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes)", required = true)  @RequestParam(value = "startMs", required = true) Integer startMs,
        @ApiParam(value = "Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes)", required = true)  @RequestParam(value = "endMs", required = true) Integer endMs,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<Object>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }

        return new ResponseEntity<List<Object>>(HttpStatus.OK);
    }

    public ResponseEntity<List<Contact>> listContacts(@ApiParam(value = "Samsara API access token.", required = true)  @RequestParam(value = "access_token", required = true) String accessToken,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<Contact>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }

        return new ResponseEntity<List<Contact>>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse2002> listFleet(@ApiParam(value = "Samsara API access token.", required = true)  @RequestParam(value = "access_token", required = true) String accessToken,
        @ApiParam(value = "" ,required=true )   @RequestBody InlineObject10 groupParam,
        @ApiParam(value = "Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'endingBefore' parameter.")  @RequestParam(value = "startingAfter", required = false) String startingAfter,
        @ApiParam(value = "Pagination parameter indicating the cursor position to return results before. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'startingAfter' parameter.")  @RequestParam(value = "endingBefore", required = false) String endingBefore,
        @ApiParam(value = "Pagination parameter indicating the number of results to return in this request. Used in conjunction with either 'startingAfter' or 'endingBefore'.")  @RequestParam(value = "limit", required = false) Long limit,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<InlineResponse2002>(objectMapper.readValue("", InlineResponse2002.class), HttpStatus.OK);
        }

        return new ResponseEntity<InlineResponse2002>(HttpStatus.OK);
    }

    public ResponseEntity<FleetVehicleResponse> patchFleetVehicle(@ApiParam(value = "Samsara API access token.", required = true)  @RequestParam(value = "access_token", required = true) String accessToken,
        @ApiParam(value = "ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.",required=true ) @PathVariable("vehicle_id_or_external_id") String vehicleIdOrExternalId,
        @ApiParam(value = "" ,required=true )   @RequestBody InlineObject16 data,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<FleetVehicleResponse>(objectMapper.readValue("", FleetVehicleResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<FleetVehicleResponse>(HttpStatus.OK);
    }

    public ResponseEntity<Driver> reactivateDriverById(@ApiParam(value = "Samsara API access token.", required = true)  @RequestParam(value = "access_token", required = true) String accessToken,
        @ApiParam(value = "ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.",required=true ) @PathVariable("driver_id_or_external_id") String driverIdOrExternalId,
        @ApiParam(value = "" ,required=true )   @RequestBody InlineObject4 reactivateDriverParam,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Driver>(objectMapper.readValue("", Driver.class), HttpStatus.OK);
        }

        return new ResponseEntity<Driver>(HttpStatus.OK);
    }

    public ResponseEntity<DispatchRoute> updateDispatchRouteById(@ApiParam(value = "Samsara API access token.", required = true)  @RequestParam(value = "access_token", required = true) String accessToken,
        @ApiParam(value = "ID of the dispatch route.",required=true ) @PathVariable("route_id") Long routeId,
        @ApiParam(value = "" ,required=true )   @RequestBody DispatchRoute updateDispatchRouteParams,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DispatchRoute>(objectMapper.readValue("", DispatchRoute.class), HttpStatus.OK);
        }

        return new ResponseEntity<DispatchRoute>(HttpStatus.OK);
    }

    public ResponseEntity<Void> updateOrganizationAddress(@ApiParam(value = "Samsara API access token.", required = true)  @RequestParam(value = "access_token", required = true) String accessToken,
        @ApiParam(value = "ID of the address/geofence",required=true ) @PathVariable("addressId") Long addressId,
        @ApiParam(value = "" ,required=true )   @RequestBody InlineObject1 address,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> updateVehicles(@ApiParam(value = "Samsara API access token.", required = true)  @RequestParam(value = "access_token", required = true) String accessToken,
        @ApiParam(value = "" ,required=true )   @RequestBody InlineObject14 vehicleUpdateParam,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}

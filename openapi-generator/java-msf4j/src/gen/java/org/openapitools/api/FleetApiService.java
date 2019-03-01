package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import org.openapitools.model.AllRouteJobUpdates;
import org.openapitools.model.AssetReeferResponse;
import org.openapitools.model.DispatchRoute;
import org.openapitools.model.DispatchRouteCreate;
import org.openapitools.model.DispatchRouteHistory;
import org.openapitools.model.Document;
import org.openapitools.model.DocumentCreate;
import org.openapitools.model.DocumentType;
import org.openapitools.model.Driver;
import org.openapitools.model.DriverDailyLogResponse;
import org.openapitools.model.DriverForCreate;
import org.openapitools.model.DriverSafetyScoreResponse;
import org.openapitools.model.DriversResponse;
import org.openapitools.model.DriversSummaryResponse;
import org.openapitools.model.DvirBase;
import org.openapitools.model.DvirListResponse;
import org.openapitools.model.FleetVehicleLocation;
import org.openapitools.model.FleetVehicleResponse;
import org.openapitools.model.HosAuthenticationLogsResponse;
import org.openapitools.model.HosLogsResponse;
import org.openapitools.model.HosLogsSummaryResponse;
import org.openapitools.model.InlineObject10;
import org.openapitools.model.InlineObject11;
import org.openapitools.model.InlineObject12;
import org.openapitools.model.InlineObject13;
import org.openapitools.model.InlineObject14;
import org.openapitools.model.InlineObject15;
import org.openapitools.model.InlineObject16;
import org.openapitools.model.InlineObject2;
import org.openapitools.model.InlineObject3;
import org.openapitools.model.InlineObject4;
import org.openapitools.model.InlineObject5;
import org.openapitools.model.InlineObject6;
import org.openapitools.model.InlineObject7;
import org.openapitools.model.InlineObject8;
import org.openapitools.model.InlineObject9;
import org.openapitools.model.InlineResponse200;
import org.openapitools.model.InlineResponse2001;
import org.openapitools.model.InlineResponse2002;
import org.openapitools.model.InlineResponse2003;
import org.openapitools.model.InlineResponse2004;
import org.openapitools.model.InlineResponse2005;
import org.openapitools.model.TripResponse;
import org.openapitools.model.VehicleHarshEventResponse;
import org.openapitools.model.VehicleSafetyScoreResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-03-01T05:34:26.765Z[GMT]")
public abstract class FleetApiService {
    public abstract Response addFleetAddress(String accessToken
 ,InlineObject2 addressParam
 ) throws NotFoundException;
    public abstract Response createDispatchRoute(String accessToken
 ,DispatchRouteCreate createDispatchRouteParams
 ) throws NotFoundException;
    public abstract Response createDriver(String accessToken
 ,DriverForCreate createDriverParam
 ) throws NotFoundException;
    public abstract Response createDriverDispatchRoute(String accessToken
 ,Long driverId
 ,DispatchRouteCreate createDispatchRouteParams
 ) throws NotFoundException;
    public abstract Response createDriverDocument(String accessToken
 ,Long driverId
 ,DocumentCreate createDocumentParams
 ) throws NotFoundException;
    public abstract Response createDvir(String accessToken
 ,InlineObject12 createDvirParam
 ) throws NotFoundException;
    public abstract Response createVehicleDispatchRoute(String accessToken
 ,Long vehicleId
 ,DispatchRouteCreate createDispatchRouteParams
 ) throws NotFoundException;
    public abstract Response deactivateDriver(String accessToken
 ,String driverIdOrExternalId
 ) throws NotFoundException;
    public abstract Response deleteDispatchRouteById(String accessToken
 ,Long routeId
 ) throws NotFoundException;
    public abstract Response fetchAllDispatchRoutes(String accessToken
 ,Long groupId
 ,Long endTime
 ,Long duration
 ) throws NotFoundException;
    public abstract Response fetchAllRouteJobUpdates(String accessToken
 ,Long groupId
 ,String sequenceId
 ,String include
 ) throws NotFoundException;
    public abstract Response getAllAssetCurrentLocations(String accessToken
 ,Long groupId
 ) throws NotFoundException;
    public abstract Response getAllAssets(String accessToken
 ,Long groupId
 ) throws NotFoundException;
    public abstract Response getAllDeactivatedDrivers(String accessToken
 ,Long groupId
 ) throws NotFoundException;
    public abstract Response getAssetLocation(String accessToken
 ,Long assetId
 ,Long startMs
 ,Long endMs
 ) throws NotFoundException;
    public abstract Response getAssetReefer(String accessToken
 ,Long assetId
 ,Long startMs
 ,Long endMs
 ) throws NotFoundException;
    public abstract Response getDeactivatedDriverById(String accessToken
 ,String driverIdOrExternalId
 ) throws NotFoundException;
    public abstract Response getDispatchRouteById(String accessToken
 ,Long routeId
 ) throws NotFoundException;
    public abstract Response getDispatchRouteHistory(String accessToken
 ,Long routeId
 ,Long startTime
 ,Long endTime
 ) throws NotFoundException;
    public abstract Response getDispatchRoutesByDriverId(String accessToken
 ,Long driverId
 ,Long endTime
 ,Long duration
 ) throws NotFoundException;
    public abstract Response getDispatchRoutesByVehicleId(String accessToken
 ,Long vehicleId
 ,Long endTime
 ,Long duration
 ) throws NotFoundException;
    public abstract Response getDriverById(String accessToken
 ,String driverIdOrExternalId
 ) throws NotFoundException;
    public abstract Response getDriverDocumentTypesByOrgId() throws NotFoundException;
    public abstract Response getDriverDocumentsByOrgId(String accessToken
 ,Long endMs
 ,Long durationMs
 ) throws NotFoundException;
    public abstract Response getDriverSafetyScore(Long driverId
 ,String accessToken
 ,Long startMs
 ,Long endMs
 ) throws NotFoundException;
    public abstract Response getDvirs(String accessToken
 ,Integer endMs
 ,Integer durationMs
 ,Integer groupId
 ) throws NotFoundException;
    public abstract Response getFleetDrivers(String accessToken
 ,InlineObject3 groupDriversParam
 ) throws NotFoundException;
    public abstract Response getFleetDriversHosDailyLogs(String accessToken
 ,Long driverId
 ,InlineObject6 hosLogsParam
 ) throws NotFoundException;
    public abstract Response getFleetDriversSummary(String accessToken
 ,InlineObject5 driversSummaryParam
 ,Boolean snapToDayBounds
 ) throws NotFoundException;
    public abstract Response getFleetHosAuthenticationLogs(String accessToken
 ,InlineObject7 hosAuthenticationLogsParam
 ) throws NotFoundException;
    public abstract Response getFleetHosLogs(String accessToken
 ,InlineObject8 hosLogsParam
 ) throws NotFoundException;
    public abstract Response getFleetHosLogsSummary(String accessToken
 ,InlineObject9 hosLogsParam
 ) throws NotFoundException;
    public abstract Response getFleetLocations(String accessToken
 ,InlineObject11 groupParam
 ) throws NotFoundException;
    public abstract Response getFleetMaintenanceList(String accessToken
 ,InlineObject13 groupParam
 ) throws NotFoundException;
    public abstract Response getFleetTrips(String accessToken
 ,InlineObject15 tripsParam
 ) throws NotFoundException;
    public abstract Response getFleetVehicle(String accessToken
 ,String vehicleIdOrExternalId
 ) throws NotFoundException;
    public abstract Response getVehicleHarshEvent(Long vehicleId
 ,String accessToken
 ,Long timestamp
 ) throws NotFoundException;
    public abstract Response getVehicleLocations(String accessToken
 ,Long vehicleId
 ,Long startMs
 ,Long endMs
 ) throws NotFoundException;
    public abstract Response getVehicleSafetyScore(Long vehicleId
 ,String accessToken
 ,Long startMs
 ,Long endMs
 ) throws NotFoundException;
    public abstract Response getVehicleStats(String accessToken
 ,Integer startMs
 ,Integer endMs
 ,String series
 ,String tagIds
 ,String startingAfter
 ,String endingBefore
 ,Long limit
 ) throws NotFoundException;
    public abstract Response getVehiclesLocations(String accessToken
 ,Integer startMs
 ,Integer endMs
 ) throws NotFoundException;
    public abstract Response listFleet(String accessToken
 ,InlineObject10 groupParam
 ,String startingAfter
 ,String endingBefore
 ,Long limit
 ) throws NotFoundException;
    public abstract Response patchFleetVehicle(String accessToken
 ,String vehicleIdOrExternalId
 ,InlineObject16 data
 ) throws NotFoundException;
    public abstract Response reactivateDriverById(String accessToken
 ,String driverIdOrExternalId
 ,InlineObject4 reactivateDriverParam
 ) throws NotFoundException;
    public abstract Response updateDispatchRouteById(String accessToken
 ,Long routeId
 ,DispatchRoute updateDispatchRouteParams
 ) throws NotFoundException;
    public abstract Response updateVehicles(String accessToken
 ,InlineObject14 vehicleUpdateParam
 ) throws NotFoundException;
}

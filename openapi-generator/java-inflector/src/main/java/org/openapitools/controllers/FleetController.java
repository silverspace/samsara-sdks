package org.openapitools.controllers;

import io.swagger.inflector.models.RequestContext;
import io.swagger.inflector.models.ResponseContext;
import javax.ws.rs.core.Response.Status;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import java.io.File;
import java.util.List;

import org.openapitools.model.*;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2019-03-01T05:34:19.229Z[GMT]")
public class FleetController  {
  /** 
   * Uncomment and implement as you see fit.  These operations will map
   * Directly to operation calls from the routing logic.  Because the inflector
   * Code allows you to implement logic incrementally, they are disabled.
   **/

  /*
    public ResponseContext addFleetAddress(RequestContext request , String accessToken, InlineObject2 addressParam) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext createDispatchRoute(RequestContext request , String accessToken, DispatchRouteCreate createDispatchRouteParams) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext createDispatchRoute(RequestContext request , String accessToken, DispatchRouteCreate createDispatchRouteParams) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext createDriver(RequestContext request , String accessToken, DriverForCreate createDriverParam) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext createDriver(RequestContext request , String accessToken, DriverForCreate createDriverParam) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext createDriverDispatchRoute(RequestContext request , String accessToken, Long driverId, DispatchRouteCreate createDispatchRouteParams) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext createDriverDispatchRoute(RequestContext request , String accessToken, Long driverId, DispatchRouteCreate createDispatchRouteParams) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext createDriverDocument(RequestContext request , String accessToken, Long driverId, DocumentCreate createDocumentParams) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext createDvir(RequestContext request , String accessToken, InlineObject12 createDvirParam) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext createVehicleDispatchRoute(RequestContext request , String accessToken, Long vehicleId, DispatchRouteCreate createDispatchRouteParams) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext createVehicleDispatchRoute(RequestContext request , String accessToken, Long vehicleId, DispatchRouteCreate createDispatchRouteParams) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext deactivateDriver(RequestContext request , String accessToken, String driverIdOrExternalId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext deactivateDriver(RequestContext request , String accessToken, String driverIdOrExternalId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext deleteDispatchRouteById(RequestContext request , String accessToken, Long routeId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext deleteDispatchRouteById(RequestContext request , String accessToken, Long routeId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext fetchAllDispatchRoutes(RequestContext request , String accessToken, Long groupId, Long endTime, Long duration) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext fetchAllDispatchRoutes(RequestContext request , String accessToken, Long groupId, Long endTime, Long duration) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext fetchAllRouteJobUpdates(RequestContext request , String accessToken, Long groupId, String sequenceId, String include) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext fetchAllRouteJobUpdates(RequestContext request , String accessToken, Long groupId, String sequenceId, String include) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getAllAssetCurrentLocations(RequestContext request , String accessToken, Long groupId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getAllAssetCurrentLocations(RequestContext request , String accessToken, Long groupId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getAllAssets(RequestContext request , String accessToken, Long groupId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getAllAssets(RequestContext request , String accessToken, Long groupId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getAllDeactivatedDrivers(RequestContext request , String accessToken, Long groupId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getAllDeactivatedDrivers(RequestContext request , String accessToken, Long groupId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getAssetLocation(RequestContext request , String accessToken, Long assetId, Long startMs, Long endMs) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getAssetLocation(RequestContext request , String accessToken, Long assetId, Long startMs, Long endMs) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getAssetReefer(RequestContext request , String accessToken, Long assetId, Long startMs, Long endMs) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getAssetReefer(RequestContext request , String accessToken, Long assetId, Long startMs, Long endMs) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getDeactivatedDriverById(RequestContext request , String accessToken, String driverIdOrExternalId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getDeactivatedDriverById(RequestContext request , String accessToken, String driverIdOrExternalId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getDispatchRouteById(RequestContext request , String accessToken, Long routeId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getDispatchRouteById(RequestContext request , String accessToken, Long routeId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getDispatchRouteHistory(RequestContext request , String accessToken, Long routeId, Long startTime, Long endTime) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getDispatchRouteHistory(RequestContext request , String accessToken, Long routeId, Long startTime, Long endTime) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getDispatchRoutesByDriverId(RequestContext request , String accessToken, Long driverId, Long endTime, Long duration) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getDispatchRoutesByDriverId(RequestContext request , String accessToken, Long driverId, Long endTime, Long duration) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getDispatchRoutesByVehicleId(RequestContext request , String accessToken, Long vehicleId, Long endTime, Long duration) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getDispatchRoutesByVehicleId(RequestContext request , String accessToken, Long vehicleId, Long endTime, Long duration) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getDriverById(RequestContext request , String accessToken, String driverIdOrExternalId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getDriverById(RequestContext request , String accessToken, String driverIdOrExternalId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getDriverDocumentTypesByOrgId(RequestContext request ) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getDriverDocumentsByOrgId(RequestContext request , String accessToken, Long endMs, Long durationMs) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getDriverSafetyScore(RequestContext request , Long driverId, String accessToken, Long startMs, Long endMs) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getDriverSafetyScore(RequestContext request , Long driverId, String accessToken, Long startMs, Long endMs) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getDvirs(RequestContext request , String accessToken, Integer endMs, Integer durationMs, Integer groupId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getFleetDrivers(RequestContext request , String accessToken, InlineObject3 groupDriversParam) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getFleetDriversHosDailyLogs(RequestContext request , String accessToken, Long driverId, InlineObject6 hosLogsParam) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getFleetDriversSummary(RequestContext request , String accessToken, InlineObject5 driversSummaryParam, Boolean snapToDayBounds) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getFleetHosAuthenticationLogs(RequestContext request , String accessToken, InlineObject7 hosAuthenticationLogsParam) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getFleetHosLogs(RequestContext request , String accessToken, InlineObject8 hosLogsParam) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getFleetHosLogsSummary(RequestContext request , String accessToken, InlineObject9 hosLogsParam) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getFleetLocations(RequestContext request , String accessToken, InlineObject11 groupParam) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getFleetMaintenanceList(RequestContext request , String accessToken, InlineObject13 groupParam) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getFleetTrips(RequestContext request , String accessToken, InlineObject15 tripsParam) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getFleetVehicle(RequestContext request , String accessToken, String vehicleIdOrExternalId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getVehicleHarshEvent(RequestContext request , Long vehicleId, String accessToken, Long timestamp) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getVehicleHarshEvent(RequestContext request , Long vehicleId, String accessToken, Long timestamp) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getVehicleLocations(RequestContext request , String accessToken, Long vehicleId, Long startMs, Long endMs) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getVehicleSafetyScore(RequestContext request , Long vehicleId, String accessToken, Long startMs, Long endMs) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getVehicleSafetyScore(RequestContext request , Long vehicleId, String accessToken, Long startMs, Long endMs) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getVehicleStats(RequestContext request , String accessToken, Integer startMs, Integer endMs, String series, String tagIds, String startingAfter, String endingBefore, Long limit) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getVehiclesLocations(RequestContext request , String accessToken, Integer startMs, Integer endMs) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext listFleet(RequestContext request , String accessToken, InlineObject10 groupParam, String startingAfter, String endingBefore, Long limit) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext patchFleetVehicle(RequestContext request , String accessToken, String vehicleIdOrExternalId, InlineObject16 data) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext reactivateDriverById(RequestContext request , String accessToken, String driverIdOrExternalId, InlineObject4 reactivateDriverParam) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext reactivateDriverById(RequestContext request , String accessToken, String driverIdOrExternalId, InlineObject4 reactivateDriverParam) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext updateDispatchRouteById(RequestContext request , String accessToken, Long routeId, DispatchRoute updateDispatchRouteParams) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext updateDispatchRouteById(RequestContext request , String accessToken, Long routeId, DispatchRoute updateDispatchRouteParams) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext updateVehicles(RequestContext request , String accessToken, InlineObject14 vehicleUpdateParam) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

}


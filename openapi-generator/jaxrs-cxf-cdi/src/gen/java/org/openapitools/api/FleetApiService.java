package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

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

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2019-03-01T05:35:11.852Z[GMT]")
public interface FleetApiService {
      public Response addFleetAddress(String accessToken, InlineObject2 addressParam, SecurityContext securityContext);
      public Response createDispatchRoute(String accessToken, DispatchRouteCreate createDispatchRouteParams, SecurityContext securityContext);
      public Response createDriver(String accessToken, DriverForCreate createDriverParam, SecurityContext securityContext);
      public Response createDriverDispatchRoute(String accessToken, Long driverId, DispatchRouteCreate createDispatchRouteParams, SecurityContext securityContext);
      public Response createDriverDocument(String accessToken, Long driverId, DocumentCreate createDocumentParams, SecurityContext securityContext);
      public Response createDvir(String accessToken, InlineObject12 createDvirParam, SecurityContext securityContext);
      public Response createVehicleDispatchRoute(String accessToken, Long vehicleId, DispatchRouteCreate createDispatchRouteParams, SecurityContext securityContext);
      public Response deactivateDriver(String accessToken, String driverIdOrExternalId, SecurityContext securityContext);
      public Response deleteDispatchRouteById(String accessToken, Long routeId, SecurityContext securityContext);
      public Response fetchAllDispatchRoutes(String accessToken, Long groupId, Long endTime, Long duration, SecurityContext securityContext);
      public Response fetchAllRouteJobUpdates(String accessToken, Long groupId, String sequenceId, String include, SecurityContext securityContext);
      public Response getAllAssetCurrentLocations(String accessToken, Long groupId, SecurityContext securityContext);
      public Response getAllAssets(String accessToken, Long groupId, SecurityContext securityContext);
      public Response getAllDeactivatedDrivers(String accessToken, Long groupId, SecurityContext securityContext);
      public Response getAssetLocation(String accessToken, Long assetId, Long startMs, Long endMs, SecurityContext securityContext);
      public Response getAssetReefer(String accessToken, Long assetId, Long startMs, Long endMs, SecurityContext securityContext);
      public Response getDeactivatedDriverById(String accessToken, String driverIdOrExternalId, SecurityContext securityContext);
      public Response getDispatchRouteById(String accessToken, Long routeId, SecurityContext securityContext);
      public Response getDispatchRouteHistory(String accessToken, Long routeId, Long startTime, Long endTime, SecurityContext securityContext);
      public Response getDispatchRoutesByDriverId(String accessToken, Long driverId, Long endTime, Long duration, SecurityContext securityContext);
      public Response getDispatchRoutesByVehicleId(String accessToken, Long vehicleId, Long endTime, Long duration, SecurityContext securityContext);
      public Response getDriverById(String accessToken, String driverIdOrExternalId, SecurityContext securityContext);
      public Response getDriverDocumentTypesByOrgId(SecurityContext securityContext);
      public Response getDriverDocumentsByOrgId(String accessToken, Long endMs, Long durationMs, SecurityContext securityContext);
      public Response getDriverSafetyScore(Long driverId, String accessToken, Long startMs, Long endMs, SecurityContext securityContext);
      public Response getDvirs(String accessToken, Integer endMs, Integer durationMs, Integer groupId, SecurityContext securityContext);
      public Response getFleetDrivers(String accessToken, InlineObject3 groupDriversParam, SecurityContext securityContext);
      public Response getFleetDriversHosDailyLogs(String accessToken, Long driverId, InlineObject6 hosLogsParam, SecurityContext securityContext);
      public Response getFleetDriversSummary(String accessToken, InlineObject5 driversSummaryParam, Boolean snapToDayBounds, SecurityContext securityContext);
      public Response getFleetHosAuthenticationLogs(String accessToken, InlineObject7 hosAuthenticationLogsParam, SecurityContext securityContext);
      public Response getFleetHosLogs(String accessToken, InlineObject8 hosLogsParam, SecurityContext securityContext);
      public Response getFleetHosLogsSummary(String accessToken, InlineObject9 hosLogsParam, SecurityContext securityContext);
      public Response getFleetLocations(String accessToken, InlineObject11 groupParam, SecurityContext securityContext);
      public Response getFleetMaintenanceList(String accessToken, InlineObject13 groupParam, SecurityContext securityContext);
      public Response getFleetTrips(String accessToken, InlineObject15 tripsParam, SecurityContext securityContext);
      public Response getFleetVehicle(String accessToken, String vehicleIdOrExternalId, SecurityContext securityContext);
      public Response getVehicleHarshEvent(Long vehicleId, String accessToken, Long timestamp, SecurityContext securityContext);
      public Response getVehicleLocations(String accessToken, Long vehicleId, Long startMs, Long endMs, SecurityContext securityContext);
      public Response getVehicleSafetyScore(Long vehicleId, String accessToken, Long startMs, Long endMs, SecurityContext securityContext);
      public Response getVehicleStats(String accessToken, Integer startMs, Integer endMs, String series, String tagIds, String startingAfter, String endingBefore, Long limit, SecurityContext securityContext);
      public Response getVehiclesLocations(String accessToken, Integer startMs, Integer endMs, SecurityContext securityContext);
      public Response listFleet(String accessToken, InlineObject10 groupParam, String startingAfter, String endingBefore, Long limit, SecurityContext securityContext);
      public Response patchFleetVehicle(String accessToken, String vehicleIdOrExternalId, InlineObject16 data, SecurityContext securityContext);
      public Response reactivateDriverById(String accessToken, String driverIdOrExternalId, InlineObject4 reactivateDriverParam, SecurityContext securityContext);
      public Response updateDispatchRouteById(String accessToken, Long routeId, DispatchRoute updateDispatchRouteParams, SecurityContext securityContext);
      public Response updateVehicles(String accessToken, InlineObject14 vehicleUpdateParam, SecurityContext securityContext);
}

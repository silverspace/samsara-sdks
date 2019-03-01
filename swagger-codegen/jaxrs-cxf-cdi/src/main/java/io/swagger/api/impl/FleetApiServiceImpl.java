package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;

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

import java.util.List;

import java.io.InputStream;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@RequestScoped
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2019-03-01T04:20:11.959Z")
public class FleetApiServiceImpl implements FleetApiService {
      @Override
      public Response addFleetAddress(String accessToken, AddressParam addressParam, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response createDispatchRoute(String accessToken, DispatchRouteCreate createDispatchRouteParams, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response createDriver(String accessToken, DriverForCreate createDriverParam, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response createDriverDispatchRoute(String accessToken, Long driverId, DispatchRouteCreate createDispatchRouteParams, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response createDriverDocument(String accessToken, Long driverId, DocumentCreate createDocumentParams, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response createDvir(String accessToken, CreateDvirParam createDvirParam, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response createVehicleDispatchRoute(String accessToken, Long vehicleId, DispatchRouteCreate createDispatchRouteParams, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response deactivateDriver(String accessToken, String driverIdOrExternalId, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response deleteDispatchRouteById(String accessToken, Long routeId, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response fetchAllDispatchRoutes(String accessToken, Long groupId, Long endTime, Long duration, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response fetchAllRouteJobUpdates(String accessToken, Long groupId, String sequenceId, String include, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response getAllAssetCurrentLocations(String accessToken, Long groupId, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response getAllAssets(String accessToken, Long groupId, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response getAllDeactivatedDrivers(String accessToken, Long groupId, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response getAssetLocation(String accessToken, Long assetId, Long startMs, Long endMs, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response getAssetReefer(String accessToken, Long assetId, Long startMs, Long endMs, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response getDeactivatedDriverById(String accessToken, String driverIdOrExternalId, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response getDispatchRouteById(String accessToken, Long routeId, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response getDispatchRouteHistory(String accessToken, Long routeId, Long startTime, Long endTime, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response getDispatchRoutesByDriverId(String accessToken, Long driverId, Long endTime, Long duration, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response getDispatchRoutesByVehicleId(String accessToken, Long vehicleId, Long endTime, Long duration, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response getDriverById(String accessToken, String driverIdOrExternalId, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response getDriverDocumentTypesByOrgId(SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response getDriverDocumentsByOrgId(String accessToken, Long endMs, Long durationMs, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response getDriverSafetyScore(Long driverId, String accessToken, Long startMs, Long endMs, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response getDvirs(String accessToken, Integer endMs, Integer durationMs, Integer groupId, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response getFleetDrivers(String accessToken, GroupDriversParam groupDriversParam, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response getFleetDriversHosDailyLogs(String accessToken, Long driverId, HosLogsParam hosLogsParam, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response getFleetDriversSummary(String accessToken, DriversSummaryParam driversSummaryParam, Boolean snapToDayBounds, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response getFleetHosAuthenticationLogs(String accessToken, HosAuthenticationLogsParam hosAuthenticationLogsParam, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response getFleetHosLogs(String accessToken, HosLogsParam1 hosLogsParam, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response getFleetHosLogsSummary(String accessToken, HosLogsParam2 hosLogsParam, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response getFleetLocations(String accessToken, GroupParam groupParam, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response getFleetMaintenanceList(String accessToken, GroupParam groupParam, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response getFleetTrips(String accessToken, TripsParam tripsParam, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response getFleetVehicle(String accessToken, String vehicleIdOrExternalId, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response getVehicleHarshEvent(Long vehicleId, String accessToken, Long timestamp, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response getVehicleLocations(String accessToken, Long vehicleId, Long startMs, Long endMs, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response getVehicleSafetyScore(Long vehicleId, String accessToken, Long startMs, Long endMs, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response getVehicleStats(String accessToken, Integer startMs, Integer endMs, String series, String tagIds, String startingAfter, String endingBefore, Long limit, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response getVehiclesLocations(String accessToken, Integer startMs, Integer endMs, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response listFleet(String accessToken, GroupParam groupParam, String startingAfter, String endingBefore, Long limit, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response patchFleetVehicle(String accessToken, String vehicleIdOrExternalId, Data data, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response reactivateDriverById(String accessToken, String driverIdOrExternalId, ReactivateDriverParam reactivateDriverParam, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response updateDispatchRouteById(String accessToken, Long routeId, DispatchRoute updateDispatchRouteParams, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response updateVehicles(String accessToken, VehicleUpdateParam vehicleUpdateParam, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
}

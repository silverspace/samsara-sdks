package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;


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
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2019-03-01T04:20:27.798Z")
public interface FleetApiService {
      Response addFleetAddress(String accessToken,AddressParam addressParam,SecurityContext securityContext)
      throws NotFoundException;
      Response createDispatchRoute(String accessToken,DispatchRouteCreate createDispatchRouteParams,SecurityContext securityContext)
      throws NotFoundException;
      Response createDriver(String accessToken,DriverForCreate createDriverParam,SecurityContext securityContext)
      throws NotFoundException;
      Response createDriverDispatchRoute(String accessToken,Long driverId,DispatchRouteCreate createDispatchRouteParams,SecurityContext securityContext)
      throws NotFoundException;
      Response createDriverDocument(String accessToken,Long driverId,DocumentCreate createDocumentParams,SecurityContext securityContext)
      throws NotFoundException;
      Response createDvir(String accessToken,CreateDvirParam createDvirParam,SecurityContext securityContext)
      throws NotFoundException;
      Response createVehicleDispatchRoute(String accessToken,Long vehicleId,DispatchRouteCreate createDispatchRouteParams,SecurityContext securityContext)
      throws NotFoundException;
      Response deactivateDriver(String accessToken,String driverIdOrExternalId,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteDispatchRouteById(String accessToken,Long routeId,SecurityContext securityContext)
      throws NotFoundException;
      Response fetchAllDispatchRoutes(String accessToken,Long groupId,Long endTime,Long duration,SecurityContext securityContext)
      throws NotFoundException;
      Response fetchAllRouteJobUpdates(String accessToken,Long groupId,String sequenceId,String include,SecurityContext securityContext)
      throws NotFoundException;
      Response getAllAssetCurrentLocations(String accessToken,Long groupId,SecurityContext securityContext)
      throws NotFoundException;
      Response getAllAssets(String accessToken,Long groupId,SecurityContext securityContext)
      throws NotFoundException;
      Response getAllDeactivatedDrivers(String accessToken,Long groupId,SecurityContext securityContext)
      throws NotFoundException;
      Response getAssetLocation(String accessToken,Long assetId,Long startMs,Long endMs,SecurityContext securityContext)
      throws NotFoundException;
      Response getAssetReefer(String accessToken,Long assetId,Long startMs,Long endMs,SecurityContext securityContext)
      throws NotFoundException;
      Response getDeactivatedDriverById(String accessToken,String driverIdOrExternalId,SecurityContext securityContext)
      throws NotFoundException;
      Response getDispatchRouteById(String accessToken,Long routeId,SecurityContext securityContext)
      throws NotFoundException;
      Response getDispatchRouteHistory(String accessToken,Long routeId,Long startTime,Long endTime,SecurityContext securityContext)
      throws NotFoundException;
      Response getDispatchRoutesByDriverId(String accessToken,Long driverId,Long endTime,Long duration,SecurityContext securityContext)
      throws NotFoundException;
      Response getDispatchRoutesByVehicleId(String accessToken,Long vehicleId,Long endTime,Long duration,SecurityContext securityContext)
      throws NotFoundException;
      Response getDriverById(String accessToken,String driverIdOrExternalId,SecurityContext securityContext)
      throws NotFoundException;
      Response getDriverDocumentTypesByOrgId(SecurityContext securityContext)
      throws NotFoundException;
      Response getDriverDocumentsByOrgId(String accessToken,Long endMs,Long durationMs,SecurityContext securityContext)
      throws NotFoundException;
      Response getDriverSafetyScore(Long driverId,String accessToken,Long startMs,Long endMs,SecurityContext securityContext)
      throws NotFoundException;
      Response getDvirs(String accessToken,Integer endMs,Integer durationMs,Integer groupId,SecurityContext securityContext)
      throws NotFoundException;
      Response getFleetDrivers(String accessToken,GroupDriversParam groupDriversParam,SecurityContext securityContext)
      throws NotFoundException;
      Response getFleetDriversHosDailyLogs(String accessToken,Long driverId,HosLogsParam hosLogsParam,SecurityContext securityContext)
      throws NotFoundException;
      Response getFleetDriversSummary(String accessToken,DriversSummaryParam driversSummaryParam,Boolean snapToDayBounds,SecurityContext securityContext)
      throws NotFoundException;
      Response getFleetHosAuthenticationLogs(String accessToken,HosAuthenticationLogsParam hosAuthenticationLogsParam,SecurityContext securityContext)
      throws NotFoundException;
      Response getFleetHosLogs(String accessToken,HosLogsParam1 hosLogsParam,SecurityContext securityContext)
      throws NotFoundException;
      Response getFleetHosLogsSummary(String accessToken,HosLogsParam2 hosLogsParam,SecurityContext securityContext)
      throws NotFoundException;
      Response getFleetLocations(String accessToken,GroupParam groupParam,SecurityContext securityContext)
      throws NotFoundException;
      Response getFleetMaintenanceList(String accessToken,GroupParam groupParam,SecurityContext securityContext)
      throws NotFoundException;
      Response getFleetTrips(String accessToken,TripsParam tripsParam,SecurityContext securityContext)
      throws NotFoundException;
      Response getFleetVehicle(String accessToken,String vehicleIdOrExternalId,SecurityContext securityContext)
      throws NotFoundException;
      Response getVehicleHarshEvent(Long vehicleId,String accessToken,Long timestamp,SecurityContext securityContext)
      throws NotFoundException;
      Response getVehicleLocations(String accessToken,Long vehicleId,Long startMs,Long endMs,SecurityContext securityContext)
      throws NotFoundException;
      Response getVehicleSafetyScore(Long vehicleId,String accessToken,Long startMs,Long endMs,SecurityContext securityContext)
      throws NotFoundException;
      Response getVehicleStats(String accessToken,Integer startMs,Integer endMs,String series,String tagIds,String startingAfter,String endingBefore,Long limit,SecurityContext securityContext)
      throws NotFoundException;
      Response getVehiclesLocations(String accessToken,Integer startMs,Integer endMs,SecurityContext securityContext)
      throws NotFoundException;
      Response listFleet(String accessToken,GroupParam groupParam,String startingAfter,String endingBefore,Long limit,SecurityContext securityContext)
      throws NotFoundException;
      Response patchFleetVehicle(String accessToken,String vehicleIdOrExternalId,Data data,SecurityContext securityContext)
      throws NotFoundException;
      Response reactivateDriverById(String accessToken,String driverIdOrExternalId,ReactivateDriverParam reactivateDriverParam,SecurityContext securityContext)
      throws NotFoundException;
      Response updateDispatchRouteById(String accessToken,Long routeId,DispatchRoute updateDispatchRouteParams,SecurityContext securityContext)
      throws NotFoundException;
      Response updateVehicles(String accessToken,VehicleUpdateParam vehicleUpdateParam,SecurityContext securityContext)
      throws NotFoundException;
}

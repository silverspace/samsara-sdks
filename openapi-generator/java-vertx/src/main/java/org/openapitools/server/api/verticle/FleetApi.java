package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.Address;
import org.openapitools.server.api.model.AllRouteJobUpdates;
import org.openapitools.server.api.model.AssetReeferResponse;
import org.openapitools.server.api.model.Contact;
import org.openapitools.server.api.model.DispatchRoute;
import org.openapitools.server.api.model.DispatchRouteCreate;
import org.openapitools.server.api.model.DispatchRouteHistory;
import org.openapitools.server.api.model.Document;
import org.openapitools.server.api.model.DocumentCreate;
import org.openapitools.server.api.model.DocumentType;
import org.openapitools.server.api.model.Driver;
import org.openapitools.server.api.model.DriverDailyLogResponse;
import org.openapitools.server.api.model.DriverForCreate;
import org.openapitools.server.api.model.DriverSafetyScoreResponse;
import org.openapitools.server.api.model.DriversResponse;
import org.openapitools.server.api.model.DriversSummaryResponse;
import org.openapitools.server.api.model.DvirBase;
import org.openapitools.server.api.model.DvirListResponse;
import org.openapitools.server.api.model.FleetVehicleLocation;
import org.openapitools.server.api.model.FleetVehicleResponse;
import org.openapitools.server.api.model.HosAuthenticationLogsResponse;
import org.openapitools.server.api.model.HosLogsResponse;
import org.openapitools.server.api.model.HosLogsSummaryResponse;
import org.openapitools.server.api.model.InlineObject;
import org.openapitools.server.api.model.InlineObject1;
import org.openapitools.server.api.model.InlineObject10;
import org.openapitools.server.api.model.InlineObject11;
import org.openapitools.server.api.model.InlineObject12;
import org.openapitools.server.api.model.InlineObject13;
import org.openapitools.server.api.model.InlineObject14;
import org.openapitools.server.api.model.InlineObject15;
import org.openapitools.server.api.model.InlineObject16;
import org.openapitools.server.api.model.InlineObject2;
import org.openapitools.server.api.model.InlineObject3;
import org.openapitools.server.api.model.InlineObject4;
import org.openapitools.server.api.model.InlineObject5;
import org.openapitools.server.api.model.InlineObject6;
import org.openapitools.server.api.model.InlineObject7;
import org.openapitools.server.api.model.InlineObject8;
import org.openapitools.server.api.model.InlineObject9;
import org.openapitools.server.api.model.InlineResponse200;
import org.openapitools.server.api.model.InlineResponse2001;
import org.openapitools.server.api.model.InlineResponse2002;
import org.openapitools.server.api.model.InlineResponse2003;
import org.openapitools.server.api.model.InlineResponse2004;
import org.openapitools.server.api.model.InlineResponse2005;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.TripResponse;
import org.openapitools.server.api.model.VehicleHarshEventResponse;
import org.openapitools.server.api.model.VehicleSafetyScoreResponse;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface FleetApi  {
    //add_fleet_address
    void addFleetAddress(String accessToken, InlineObject2 addressParam, Handler<AsyncResult<Void>> handler);
    
    //AddOrganizationAddresses
    void addOrganizationAddresses(String accessToken, InlineObject addresses, Handler<AsyncResult<List<Address>>> handler);
    
    //createDispatchRoute
    void createDispatchRoute(String accessToken, DispatchRouteCreate createDispatchRouteParams, Handler<AsyncResult<DispatchRoute>> handler);
    
    //createDriver
    void createDriver(String accessToken, DriverForCreate createDriverParam, Handler<AsyncResult<Driver>> handler);
    
    //createDriverDispatchRoute
    void createDriverDispatchRoute(String accessToken, Long driverId, DispatchRouteCreate createDispatchRouteParams, Handler<AsyncResult<DispatchRoute>> handler);
    
    //createDriverDocument
    void createDriverDocument(String accessToken, Long driverId, DocumentCreate createDocumentParams, Handler<AsyncResult<Document>> handler);
    
    //create_dvir
    void createDvir(String accessToken, InlineObject12 createDvirParam, Handler<AsyncResult<DvirBase>> handler);
    
    //createVehicleDispatchRoute
    void createVehicleDispatchRoute(String accessToken, Long vehicleId, DispatchRouteCreate createDispatchRouteParams, Handler<AsyncResult<DispatchRoute>> handler);
    
    //deactivateDriver
    void deactivateDriver(String accessToken, String driverIdOrExternalId, Handler<AsyncResult<Void>> handler);
    
    //deleteDispatchRouteById
    void deleteDispatchRouteById(String accessToken, Long routeId, Handler<AsyncResult<Void>> handler);
    
    //DeleteOrganizationAddress
    void deleteOrganizationAddress(String accessToken, Long addressId, Handler<AsyncResult<Void>> handler);
    
    //fetchAllDispatchRoutes
    void fetchAllDispatchRoutes(String accessToken, Long groupId, Long endTime, Long duration, Handler<AsyncResult<List<DispatchRoute>>> handler);
    
    //fetchAllRouteJobUpdates
    void fetchAllRouteJobUpdates(String accessToken, Long groupId, String sequenceId, String include, Handler<AsyncResult<AllRouteJobUpdates>> handler);
    
    //GetAllAssetCurrentLocations
    void getAllAssetCurrentLocations(String accessToken, Long groupId, Handler<AsyncResult<InlineResponse2001>> handler);
    
    //GetAllAssets
    void getAllAssets(String accessToken, Long groupId, Handler<AsyncResult<InlineResponse200>> handler);
    
    //getAllDeactivatedDrivers
    void getAllDeactivatedDrivers(String accessToken, Long groupId, Handler<AsyncResult<List<Driver>>> handler);
    
    //GetAssetLocation
    void getAssetLocation(String accessToken, Long assetId, Long startMs, Long endMs, Handler<AsyncResult<List<Object>>> handler);
    
    //GetAssetReefer
    void getAssetReefer(String accessToken, Long assetId, Long startMs, Long endMs, Handler<AsyncResult<AssetReeferResponse>> handler);
    
    //getDeactivatedDriverById
    void getDeactivatedDriverById(String accessToken, String driverIdOrExternalId, Handler<AsyncResult<Driver>> handler);
    
    //getDispatchRouteById
    void getDispatchRouteById(String accessToken, Long routeId, Handler<AsyncResult<DispatchRoute>> handler);
    
    //getDispatchRouteHistory
    void getDispatchRouteHistory(String accessToken, Long routeId, Long startTime, Long endTime, Handler<AsyncResult<DispatchRouteHistory>> handler);
    
    //getDispatchRoutesByDriverId
    void getDispatchRoutesByDriverId(String accessToken, Long driverId, Long endTime, Long duration, Handler<AsyncResult<List<DispatchRoute>>> handler);
    
    //getDispatchRoutesByVehicleId
    void getDispatchRoutesByVehicleId(String accessToken, Long vehicleId, Long endTime, Long duration, Handler<AsyncResult<List<DispatchRoute>>> handler);
    
    //getDriverById
    void getDriverById(String accessToken, String driverIdOrExternalId, Handler<AsyncResult<Driver>> handler);
    
    //getDriverDocumentTypesByOrgId
    void getDriverDocumentTypesByOrgId(Handler<AsyncResult<List<DocumentType>>> handler);
    
    //getDriverDocumentsByOrgId
    void getDriverDocumentsByOrgId(String accessToken, Long endMs, Long durationMs, Handler<AsyncResult<List<Document>>> handler);
    
    //GetDriverSafetyScore
    void getDriverSafetyScore(Long driverId, String accessToken, Long startMs, Long endMs, Handler<AsyncResult<DriverSafetyScoreResponse>> handler);
    
    //get_dvirs
    void getDvirs(String accessToken, Integer endMs, Integer durationMs, Integer groupId, Handler<AsyncResult<DvirListResponse>> handler);
    
    //get_fleet_drivers
    void getFleetDrivers(String accessToken, InlineObject3 groupDriversParam, Handler<AsyncResult<DriversResponse>> handler);
    
    //get_fleet_drivers_hos_daily_logs
    void getFleetDriversHosDailyLogs(String accessToken, Long driverId, InlineObject6 hosLogsParam, Handler<AsyncResult<DriverDailyLogResponse>> handler);
    
    //get_fleet_drivers_summary
    void getFleetDriversSummary(String accessToken, InlineObject5 driversSummaryParam, Boolean snapToDayBounds, Handler<AsyncResult<DriversSummaryResponse>> handler);
    
    //get_fleet_hos_authentication_logs
    void getFleetHosAuthenticationLogs(String accessToken, InlineObject7 hosAuthenticationLogsParam, Handler<AsyncResult<HosAuthenticationLogsResponse>> handler);
    
    //get_fleet_hos_logs
    void getFleetHosLogs(String accessToken, InlineObject8 hosLogsParam, Handler<AsyncResult<HosLogsResponse>> handler);
    
    //get_fleet_hos_logs_summary
    void getFleetHosLogsSummary(String accessToken, InlineObject9 hosLogsParam, Handler<AsyncResult<HosLogsSummaryResponse>> handler);
    
    //get_fleet_locations
    void getFleetLocations(String accessToken, InlineObject11 groupParam, Handler<AsyncResult<InlineResponse2003>> handler);
    
    //get_fleet_maintenance_list
    void getFleetMaintenanceList(String accessToken, InlineObject13 groupParam, Handler<AsyncResult<InlineResponse2004>> handler);
    
    //get_fleet_trips
    void getFleetTrips(String accessToken, InlineObject15 tripsParam, Handler<AsyncResult<TripResponse>> handler);
    
    //getFleetVehicle
    void getFleetVehicle(String accessToken, String vehicleIdOrExternalId, Handler<AsyncResult<FleetVehicleResponse>> handler);
    
    //GetOrganizationAddress
    void getOrganizationAddress(String accessToken, Long addressId, Handler<AsyncResult<Address>> handler);
    
    //GetOrganizationAddresses
    void getOrganizationAddresses(String accessToken, Handler<AsyncResult<List<Address>>> handler);
    
    //GetOrganizationContact
    void getOrganizationContact(String accessToken, Long contactId, Handler<AsyncResult<Contact>> handler);
    
    //GetVehicleHarshEvent
    void getVehicleHarshEvent(Long vehicleId, String accessToken, Long timestamp, Handler<AsyncResult<VehicleHarshEventResponse>> handler);
    
    //getVehicleLocations
    void getVehicleLocations(String accessToken, Long vehicleId, Long startMs, Long endMs, Handler<AsyncResult<List<FleetVehicleLocation>>> handler);
    
    //GetVehicleSafetyScore
    void getVehicleSafetyScore(Long vehicleId, String accessToken, Long startMs, Long endMs, Handler<AsyncResult<VehicleSafetyScoreResponse>> handler);
    
    //GetVehicleStats
    void getVehicleStats(String accessToken, Integer startMs, Integer endMs, String series, String tagIds, String startingAfter, String endingBefore, Long limit, Handler<AsyncResult<InlineResponse2005>> handler);
    
    //getVehiclesLocations
    void getVehiclesLocations(String accessToken, Integer startMs, Integer endMs, Handler<AsyncResult<List<Object>>> handler);
    
    //ListContacts
    void listContacts(String accessToken, Handler<AsyncResult<List<Contact>>> handler);
    
    //list_fleet
    void listFleet(String accessToken, InlineObject10 groupParam, String startingAfter, String endingBefore, Long limit, Handler<AsyncResult<InlineResponse2002>> handler);
    
    //patchFleetVehicle
    void patchFleetVehicle(String accessToken, String vehicleIdOrExternalId, InlineObject16 data, Handler<AsyncResult<FleetVehicleResponse>> handler);
    
    //reactivateDriverById
    void reactivateDriverById(String accessToken, String driverIdOrExternalId, InlineObject4 reactivateDriverParam, Handler<AsyncResult<Driver>> handler);
    
    //updateDispatchRouteById
    void updateDispatchRouteById(String accessToken, Long routeId, DispatchRoute updateDispatchRouteParams, Handler<AsyncResult<DispatchRoute>> handler);
    
    //UpdateOrganizationAddress
    void updateOrganizationAddress(String accessToken, Long addressId, InlineObject1 address, Handler<AsyncResult<Void>> handler);
    
    //update_vehicles
    void updateVehicles(String accessToken, InlineObject14 vehicleUpdateParam, Handler<AsyncResult<Void>> handler);
    
}

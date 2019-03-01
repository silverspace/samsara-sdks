package controllers;

import apimodels.Address;
import apimodels.AllRouteJobUpdates;
import apimodels.AssetReeferResponse;
import apimodels.Contact;
import apimodels.DispatchRoute;
import apimodels.DispatchRouteCreate;
import apimodels.DispatchRouteHistory;
import apimodels.Document;
import apimodels.DocumentCreate;
import apimodels.DocumentType;
import apimodels.Driver;
import apimodels.DriverDailyLogResponse;
import apimodels.DriverForCreate;
import apimodels.DriverSafetyScoreResponse;
import apimodels.DriversResponse;
import apimodels.DriversSummaryResponse;
import apimodels.DvirBase;
import apimodels.DvirListResponse;
import apimodels.FleetVehicleLocation;
import apimodels.FleetVehicleResponse;
import apimodels.HosAuthenticationLogsResponse;
import apimodels.HosLogsResponse;
import apimodels.HosLogsSummaryResponse;
import apimodels.InlineObject;
import apimodels.InlineObject1;
import apimodels.InlineObject10;
import apimodels.InlineObject11;
import apimodels.InlineObject12;
import apimodels.InlineObject13;
import apimodels.InlineObject14;
import apimodels.InlineObject15;
import apimodels.InlineObject16;
import apimodels.InlineObject2;
import apimodels.InlineObject3;
import apimodels.InlineObject4;
import apimodels.InlineObject5;
import apimodels.InlineObject6;
import apimodels.InlineObject7;
import apimodels.InlineObject8;
import apimodels.InlineObject9;
import apimodels.InlineResponse200;
import apimodels.InlineResponse2001;
import apimodels.InlineResponse2002;
import apimodels.InlineResponse2003;
import apimodels.InlineResponse2004;
import apimodels.InlineResponse2005;
import apimodels.TripResponse;
import apimodels.VehicleHarshEventResponse;
import apimodels.VehicleSafetyScoreResponse;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import javax.validation.constraints.*;

@SuppressWarnings("RedundantThrows")
public interface FleetApiControllerImpInterface {
    void addFleetAddress( @NotNull String accessToken, InlineObject2 addressParam) throws Exception;

    List<Address> addOrganizationAddresses( @NotNull String accessToken, InlineObject addresses) throws Exception;

    DispatchRoute createDispatchRoute( @NotNull String accessToken, DispatchRouteCreate createDispatchRouteParams) throws Exception;

    Driver createDriver( @NotNull String accessToken, DriverForCreate createDriverParam) throws Exception;

    DispatchRoute createDriverDispatchRoute( @NotNull String accessToken, Long driverId, DispatchRouteCreate createDispatchRouteParams) throws Exception;

    Document createDriverDocument( @NotNull String accessToken, Long driverId, DocumentCreate createDocumentParams) throws Exception;

    DvirBase createDvir( @NotNull String accessToken, InlineObject12 createDvirParam) throws Exception;

    DispatchRoute createVehicleDispatchRoute( @NotNull String accessToken, Long vehicleId, DispatchRouteCreate createDispatchRouteParams) throws Exception;

    void deactivateDriver( @NotNull String accessToken, String driverIdOrExternalId) throws Exception;

    void deleteDispatchRouteById( @NotNull String accessToken, Long routeId) throws Exception;

    void deleteOrganizationAddress( @NotNull String accessToken, Long addressId) throws Exception;

    List<DispatchRoute> fetchAllDispatchRoutes( @NotNull String accessToken, Long groupId, Long endTime, Long duration) throws Exception;

    AllRouteJobUpdates fetchAllRouteJobUpdates( @NotNull String accessToken, Long groupId, String sequenceId, String include) throws Exception;

    InlineResponse2001 getAllAssetCurrentLocations( @NotNull String accessToken, Long groupId) throws Exception;

    InlineResponse200 getAllAssets( @NotNull String accessToken, Long groupId) throws Exception;

    List<Driver> getAllDeactivatedDrivers( @NotNull String accessToken, Long groupId) throws Exception;

    List<Object> getAssetLocation( @NotNull String accessToken, Long assetId,  @NotNull Long startMs,  @NotNull Long endMs) throws Exception;

    AssetReeferResponse getAssetReefer( @NotNull String accessToken, Long assetId,  @NotNull Long startMs,  @NotNull Long endMs) throws Exception;

    Driver getDeactivatedDriverById( @NotNull String accessToken, String driverIdOrExternalId) throws Exception;

    DispatchRoute getDispatchRouteById( @NotNull String accessToken, Long routeId) throws Exception;

    DispatchRouteHistory getDispatchRouteHistory( @NotNull String accessToken, Long routeId, Long startTime, Long endTime) throws Exception;

    List<DispatchRoute> getDispatchRoutesByDriverId( @NotNull String accessToken, Long driverId, Long endTime, Long duration) throws Exception;

    List<DispatchRoute> getDispatchRoutesByVehicleId( @NotNull String accessToken, Long vehicleId, Long endTime, Long duration) throws Exception;

    Driver getDriverById( @NotNull String accessToken, String driverIdOrExternalId) throws Exception;

    List<DocumentType> getDriverDocumentTypesByOrgId() throws Exception;

    List<Document> getDriverDocumentsByOrgId( @NotNull String accessToken, Long endMs, Long durationMs) throws Exception;

    DriverSafetyScoreResponse getDriverSafetyScore(Long driverId,  @NotNull String accessToken,  @NotNull Long startMs,  @NotNull Long endMs) throws Exception;

    DvirListResponse getDvirs( @NotNull String accessToken,  @NotNull Integer endMs,  @NotNull Integer durationMs, Integer groupId) throws Exception;

    DriversResponse getFleetDrivers( @NotNull String accessToken, InlineObject3 groupDriversParam) throws Exception;

    DriverDailyLogResponse getFleetDriversHosDailyLogs( @NotNull String accessToken, Long driverId, InlineObject6 hosLogsParam) throws Exception;

    DriversSummaryResponse getFleetDriversSummary( @NotNull String accessToken, InlineObject5 driversSummaryParam, Boolean snapToDayBounds) throws Exception;

    HosAuthenticationLogsResponse getFleetHosAuthenticationLogs( @NotNull String accessToken, InlineObject7 hosAuthenticationLogsParam) throws Exception;

    HosLogsResponse getFleetHosLogs( @NotNull String accessToken, InlineObject8 hosLogsParam) throws Exception;

    HosLogsSummaryResponse getFleetHosLogsSummary( @NotNull String accessToken, InlineObject9 hosLogsParam) throws Exception;

    InlineResponse2003 getFleetLocations( @NotNull String accessToken, InlineObject11 groupParam) throws Exception;

    InlineResponse2004 getFleetMaintenanceList( @NotNull String accessToken, InlineObject13 groupParam) throws Exception;

    TripResponse getFleetTrips( @NotNull String accessToken, InlineObject15 tripsParam) throws Exception;

    FleetVehicleResponse getFleetVehicle( @NotNull String accessToken, String vehicleIdOrExternalId) throws Exception;

    Address getOrganizationAddress( @NotNull String accessToken, Long addressId) throws Exception;

    List<Address> getOrganizationAddresses( @NotNull String accessToken) throws Exception;

    Contact getOrganizationContact( @NotNull String accessToken, Long contactId) throws Exception;

    VehicleHarshEventResponse getVehicleHarshEvent(Long vehicleId,  @NotNull String accessToken,  @NotNull Long timestamp) throws Exception;

    List<FleetVehicleLocation> getVehicleLocations( @NotNull String accessToken, Long vehicleId,  @NotNull Long startMs,  @NotNull Long endMs) throws Exception;

    VehicleSafetyScoreResponse getVehicleSafetyScore(Long vehicleId,  @NotNull String accessToken,  @NotNull Long startMs,  @NotNull Long endMs) throws Exception;

    InlineResponse2005 getVehicleStats( @NotNull String accessToken,  @NotNull Integer startMs,  @NotNull Integer endMs, String series, String tagIds, String startingAfter, String endingBefore, Long limit) throws Exception;

    List<Object> getVehiclesLocations( @NotNull String accessToken,  @NotNull Integer startMs,  @NotNull Integer endMs) throws Exception;

    List<Contact> listContacts( @NotNull String accessToken) throws Exception;

    InlineResponse2002 listFleet( @NotNull String accessToken, InlineObject10 groupParam, String startingAfter, String endingBefore, Long limit) throws Exception;

    FleetVehicleResponse patchFleetVehicle( @NotNull String accessToken, String vehicleIdOrExternalId, InlineObject16 data) throws Exception;

    Driver reactivateDriverById( @NotNull String accessToken, String driverIdOrExternalId, InlineObject4 reactivateDriverParam) throws Exception;

    DispatchRoute updateDispatchRouteById( @NotNull String accessToken, Long routeId, DispatchRoute updateDispatchRouteParams) throws Exception;

    void updateOrganizationAddress( @NotNull String accessToken, Long addressId, InlineObject1 address) throws Exception;

    void updateVehicles( @NotNull String accessToken, InlineObject14 vehicleUpdateParam) throws Exception;

}

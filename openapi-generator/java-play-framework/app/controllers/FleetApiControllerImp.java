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
import java.io.FileInputStream;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-03-01T05:34:42.270Z[GMT]")

public class FleetApiControllerImp implements FleetApiControllerImpInterface {
    @Override
    public void addFleetAddress( @NotNull String accessToken, InlineObject2 addressParam) throws Exception {
        //Do your magic!!!
    }

    @Override
    public List<Address> addOrganizationAddresses( @NotNull String accessToken, InlineObject addresses) throws Exception {
        //Do your magic!!!
        return new ArrayList<Address>();
    }

    @Override
    public DispatchRoute createDispatchRoute( @NotNull String accessToken, DispatchRouteCreate createDispatchRouteParams) throws Exception {
        //Do your magic!!!
        return new DispatchRoute();
    }

    @Override
    public Driver createDriver( @NotNull String accessToken, DriverForCreate createDriverParam) throws Exception {
        //Do your magic!!!
        return new Driver();
    }

    @Override
    public DispatchRoute createDriverDispatchRoute( @NotNull String accessToken, Long driverId, DispatchRouteCreate createDispatchRouteParams) throws Exception {
        //Do your magic!!!
        return new DispatchRoute();
    }

    @Override
    public Document createDriverDocument( @NotNull String accessToken, Long driverId, DocumentCreate createDocumentParams) throws Exception {
        //Do your magic!!!
        return new Document();
    }

    @Override
    public DvirBase createDvir( @NotNull String accessToken, InlineObject12 createDvirParam) throws Exception {
        //Do your magic!!!
        return new DvirBase();
    }

    @Override
    public DispatchRoute createVehicleDispatchRoute( @NotNull String accessToken, Long vehicleId, DispatchRouteCreate createDispatchRouteParams) throws Exception {
        //Do your magic!!!
        return new DispatchRoute();
    }

    @Override
    public void deactivateDriver( @NotNull String accessToken, String driverIdOrExternalId) throws Exception {
        //Do your magic!!!
    }

    @Override
    public void deleteDispatchRouteById( @NotNull String accessToken, Long routeId) throws Exception {
        //Do your magic!!!
    }

    @Override
    public void deleteOrganizationAddress( @NotNull String accessToken, Long addressId) throws Exception {
        //Do your magic!!!
    }

    @Override
    public List<DispatchRoute> fetchAllDispatchRoutes( @NotNull String accessToken, Long groupId, Long endTime, Long duration) throws Exception {
        //Do your magic!!!
        return new ArrayList<DispatchRoute>();
    }

    @Override
    public AllRouteJobUpdates fetchAllRouteJobUpdates( @NotNull String accessToken, Long groupId, String sequenceId, String include) throws Exception {
        //Do your magic!!!
        return new AllRouteJobUpdates();
    }

    @Override
    public InlineResponse2001 getAllAssetCurrentLocations( @NotNull String accessToken, Long groupId) throws Exception {
        //Do your magic!!!
        return new InlineResponse2001();
    }

    @Override
    public InlineResponse200 getAllAssets( @NotNull String accessToken, Long groupId) throws Exception {
        //Do your magic!!!
        return new InlineResponse200();
    }

    @Override
    public List<Driver> getAllDeactivatedDrivers( @NotNull String accessToken, Long groupId) throws Exception {
        //Do your magic!!!
        return new ArrayList<Driver>();
    }

    @Override
    public List<Object> getAssetLocation( @NotNull String accessToken, Long assetId,  @NotNull Long startMs,  @NotNull Long endMs) throws Exception {
        //Do your magic!!!
        return new ArrayList<Object>();
    }

    @Override
    public AssetReeferResponse getAssetReefer( @NotNull String accessToken, Long assetId,  @NotNull Long startMs,  @NotNull Long endMs) throws Exception {
        //Do your magic!!!
        return new AssetReeferResponse();
    }

    @Override
    public Driver getDeactivatedDriverById( @NotNull String accessToken, String driverIdOrExternalId) throws Exception {
        //Do your magic!!!
        return new Driver();
    }

    @Override
    public DispatchRoute getDispatchRouteById( @NotNull String accessToken, Long routeId) throws Exception {
        //Do your magic!!!
        return new DispatchRoute();
    }

    @Override
    public DispatchRouteHistory getDispatchRouteHistory( @NotNull String accessToken, Long routeId, Long startTime, Long endTime) throws Exception {
        //Do your magic!!!
        return new DispatchRouteHistory();
    }

    @Override
    public List<DispatchRoute> getDispatchRoutesByDriverId( @NotNull String accessToken, Long driverId, Long endTime, Long duration) throws Exception {
        //Do your magic!!!
        return new ArrayList<DispatchRoute>();
    }

    @Override
    public List<DispatchRoute> getDispatchRoutesByVehicleId( @NotNull String accessToken, Long vehicleId, Long endTime, Long duration) throws Exception {
        //Do your magic!!!
        return new ArrayList<DispatchRoute>();
    }

    @Override
    public Driver getDriverById( @NotNull String accessToken, String driverIdOrExternalId) throws Exception {
        //Do your magic!!!
        return new Driver();
    }

    @Override
    public List<DocumentType> getDriverDocumentTypesByOrgId() throws Exception {
        //Do your magic!!!
        return new ArrayList<DocumentType>();
    }

    @Override
    public List<Document> getDriverDocumentsByOrgId( @NotNull String accessToken, Long endMs, Long durationMs) throws Exception {
        //Do your magic!!!
        return new ArrayList<Document>();
    }

    @Override
    public DriverSafetyScoreResponse getDriverSafetyScore(Long driverId,  @NotNull String accessToken,  @NotNull Long startMs,  @NotNull Long endMs) throws Exception {
        //Do your magic!!!
        return new DriverSafetyScoreResponse();
    }

    @Override
    public DvirListResponse getDvirs( @NotNull String accessToken,  @NotNull Integer endMs,  @NotNull Integer durationMs, Integer groupId) throws Exception {
        //Do your magic!!!
        return new DvirListResponse();
    }

    @Override
    public DriversResponse getFleetDrivers( @NotNull String accessToken, InlineObject3 groupDriversParam) throws Exception {
        //Do your magic!!!
        return new DriversResponse();
    }

    @Override
    public DriverDailyLogResponse getFleetDriversHosDailyLogs( @NotNull String accessToken, Long driverId, InlineObject6 hosLogsParam) throws Exception {
        //Do your magic!!!
        return new DriverDailyLogResponse();
    }

    @Override
    public DriversSummaryResponse getFleetDriversSummary( @NotNull String accessToken, InlineObject5 driversSummaryParam, Boolean snapToDayBounds) throws Exception {
        //Do your magic!!!
        return new DriversSummaryResponse();
    }

    @Override
    public HosAuthenticationLogsResponse getFleetHosAuthenticationLogs( @NotNull String accessToken, InlineObject7 hosAuthenticationLogsParam) throws Exception {
        //Do your magic!!!
        return new HosAuthenticationLogsResponse();
    }

    @Override
    public HosLogsResponse getFleetHosLogs( @NotNull String accessToken, InlineObject8 hosLogsParam) throws Exception {
        //Do your magic!!!
        return new HosLogsResponse();
    }

    @Override
    public HosLogsSummaryResponse getFleetHosLogsSummary( @NotNull String accessToken, InlineObject9 hosLogsParam) throws Exception {
        //Do your magic!!!
        return new HosLogsSummaryResponse();
    }

    @Override
    public InlineResponse2003 getFleetLocations( @NotNull String accessToken, InlineObject11 groupParam) throws Exception {
        //Do your magic!!!
        return new InlineResponse2003();
    }

    @Override
    public InlineResponse2004 getFleetMaintenanceList( @NotNull String accessToken, InlineObject13 groupParam) throws Exception {
        //Do your magic!!!
        return new InlineResponse2004();
    }

    @Override
    public TripResponse getFleetTrips( @NotNull String accessToken, InlineObject15 tripsParam) throws Exception {
        //Do your magic!!!
        return new TripResponse();
    }

    @Override
    public FleetVehicleResponse getFleetVehicle( @NotNull String accessToken, String vehicleIdOrExternalId) throws Exception {
        //Do your magic!!!
        return new FleetVehicleResponse();
    }

    @Override
    public Address getOrganizationAddress( @NotNull String accessToken, Long addressId) throws Exception {
        //Do your magic!!!
        return new Address();
    }

    @Override
    public List<Address> getOrganizationAddresses( @NotNull String accessToken) throws Exception {
        //Do your magic!!!
        return new ArrayList<Address>();
    }

    @Override
    public Contact getOrganizationContact( @NotNull String accessToken, Long contactId) throws Exception {
        //Do your magic!!!
        return new Contact();
    }

    @Override
    public VehicleHarshEventResponse getVehicleHarshEvent(Long vehicleId,  @NotNull String accessToken,  @NotNull Long timestamp) throws Exception {
        //Do your magic!!!
        return new VehicleHarshEventResponse();
    }

    @Override
    public List<FleetVehicleLocation> getVehicleLocations( @NotNull String accessToken, Long vehicleId,  @NotNull Long startMs,  @NotNull Long endMs) throws Exception {
        //Do your magic!!!
        return new ArrayList<FleetVehicleLocation>();
    }

    @Override
    public VehicleSafetyScoreResponse getVehicleSafetyScore(Long vehicleId,  @NotNull String accessToken,  @NotNull Long startMs,  @NotNull Long endMs) throws Exception {
        //Do your magic!!!
        return new VehicleSafetyScoreResponse();
    }

    @Override
    public InlineResponse2005 getVehicleStats( @NotNull String accessToken,  @NotNull Integer startMs,  @NotNull Integer endMs, String series, String tagIds, String startingAfter, String endingBefore, Long limit) throws Exception {
        //Do your magic!!!
        return new InlineResponse2005();
    }

    @Override
    public List<Object> getVehiclesLocations( @NotNull String accessToken,  @NotNull Integer startMs,  @NotNull Integer endMs) throws Exception {
        //Do your magic!!!
        return new ArrayList<Object>();
    }

    @Override
    public List<Contact> listContacts( @NotNull String accessToken) throws Exception {
        //Do your magic!!!
        return new ArrayList<Contact>();
    }

    @Override
    public InlineResponse2002 listFleet( @NotNull String accessToken, InlineObject10 groupParam, String startingAfter, String endingBefore, Long limit) throws Exception {
        //Do your magic!!!
        return new InlineResponse2002();
    }

    @Override
    public FleetVehicleResponse patchFleetVehicle( @NotNull String accessToken, String vehicleIdOrExternalId, InlineObject16 data) throws Exception {
        //Do your magic!!!
        return new FleetVehicleResponse();
    }

    @Override
    public Driver reactivateDriverById( @NotNull String accessToken, String driverIdOrExternalId, InlineObject4 reactivateDriverParam) throws Exception {
        //Do your magic!!!
        return new Driver();
    }

    @Override
    public DispatchRoute updateDispatchRouteById( @NotNull String accessToken, Long routeId, DispatchRoute updateDispatchRouteParams) throws Exception {
        //Do your magic!!!
        return new DispatchRoute();
    }

    @Override
    public void updateOrganizationAddress( @NotNull String accessToken, Long addressId, InlineObject1 address) throws Exception {
        //Do your magic!!!
    }

    @Override
    public void updateVehicles( @NotNull String accessToken, InlineObject14 vehicleUpdateParam) throws Exception {
        //Do your magic!!!
    }

}

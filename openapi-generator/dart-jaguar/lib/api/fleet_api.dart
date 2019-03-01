import 'package:jaguar_retrofit/annotations/annotations.dart';
import 'package:jaguar_retrofit/jaguar_retrofit.dart';
import 'package:jaguar_serializer/jaguar_serializer.dart';
import 'package:jaguar_serializer/src/repo/repo.dart';
import 'dart:async';

import 'package:openapi/model/dispatch_route.dart';
import 'package:openapi/model/inline_object9.dart';
import 'package:openapi/model/inline_object6.dart';
import 'package:openapi/model/inline_object5.dart';
import 'package:openapi/model/inline_object8.dart';
import 'package:openapi/model/inline_object7.dart';
import 'package:openapi/model/driver_safety_score_response.dart';
import 'package:openapi/model/hos_logs_summary_response.dart';
import 'package:openapi/model/hos_logs_response.dart';
import 'package:openapi/model/driver_for_create.dart';
import 'package:openapi/model/contact.dart';
import 'package:openapi/model/inline_object2.dart';
import 'package:openapi/model/inline_object1.dart';
import 'package:openapi/model/inline_object4.dart';
import 'package:openapi/model/inline_object3.dart';
import 'package:openapi/model/trip_response.dart';
import 'package:openapi/model/driver_daily_log_response.dart';
import 'package:openapi/model/drivers_response.dart';
import 'package:openapi/model/asset_reefer_response.dart';
import 'package:openapi/model/fleet_vehicle_response.dart';
import 'package:openapi/model/dvir_base.dart';
import 'package:openapi/model/driver.dart';
import 'package:openapi/model/fleet_vehicle_location.dart';
import 'package:openapi/model/object.dart';
import 'package:openapi/model/inline_response2005.dart';
import 'package:openapi/model/inline_response2004.dart';
import 'package:openapi/model/document.dart';
import 'package:openapi/model/inline_response2003.dart';
import 'package:openapi/model/inline_response2002.dart';
import 'package:openapi/model/inline_response2001.dart';
import 'package:openapi/model/vehicle_harsh_event_response.dart';
import 'package:openapi/model/inline_response200.dart';
import 'package:openapi/model/dispatch_route_history.dart';
import 'package:openapi/model/hos_authentication_logs_response.dart';
import 'package:openapi/model/dispatch_route_create.dart';
import 'package:openapi/model/dvir_list_response.dart';
import 'package:openapi/model/document_type.dart';
import 'package:openapi/model/address.dart';
import 'package:openapi/model/all_route_job_updates.dart';
import 'package:openapi/model/inline_object13.dart';
import 'package:openapi/model/inline_object12.dart';
import 'package:openapi/model/inline_object11.dart';
import 'package:openapi/model/inline_object10.dart';
import 'package:openapi/model/drivers_summary_response.dart';
import 'package:openapi/model/inline_object.dart';
import 'package:openapi/model/document_create.dart';
import 'package:openapi/model/inline_object16.dart';
import 'package:openapi/model/inline_object15.dart';
import 'package:openapi/model/vehicle_safety_score_response.dart';
import 'package:openapi/model/inline_object14.dart';


part 'fleet_api.jretro.dart';

@GenApiClient()
class FleetApi extends _$FleetApiClient implements ApiClient {
    final Route base;
    final SerializerRepo serializers;
    final Duration timeout;

    FleetApi({this.base, this.serializers, this.timeout = const Duration(minutes: 2)});

    /// /fleet/add_address
    ///
    /// This method adds an address book entry to the specified group.
    @PostReq(path: "/fleet/add_address")
    Future<void> addFleetAddress(
        
            @QueryParam("access_token") String accessToken
            ,
              @AsJson() InlineObject2 addressParam
        ) {
        return super.addFleetAddress(
        
        accessToken

        ,
        addressParam
        ).timeout(timeout);
    }

    /// /addresses
    ///
    /// Add one or more addresses to the organization
    @PostReq(path: "/addresses")
    Future<List<Address>> addOrganizationAddresses(
        
            @QueryParam("access_token") String accessToken
            ,
              @AsJson() InlineObject addresses
        ) {
        return super.addOrganizationAddresses(
        
        accessToken

        ,
        addresses
        ).timeout(timeout);
    }

    /// /fleet/dispatch/routes
    ///
    /// Create a new dispatch route.
    @PostReq(path: "/fleet/dispatch/routes")
    Future<DispatchRoute> createDispatchRoute(
        
            @QueryParam("access_token") String accessToken
            ,
              @AsJson() DispatchRouteCreate createDispatchRouteParams
        ) {
        return super.createDispatchRoute(
        
        accessToken

        ,
        createDispatchRouteParams
        ).timeout(timeout);
    }

    /// /fleet/drivers/create
    ///
    /// Create a new driver.
    @PostReq(path: "/fleet/drivers/create")
    Future<Driver> createDriver(
        
            @QueryParam("access_token") String accessToken
            ,
              @AsJson() DriverForCreate createDriverParam
        ) {
        return super.createDriver(
        
        accessToken

        ,
        createDriverParam
        ).timeout(timeout);
    }

    /// /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
    ///
    /// Create a new dispatch route for the driver with driver_id.
    @PostReq(path: "/fleet/drivers/:driver_id/dispatch/routes")
    Future<DispatchRoute> createDriverDispatchRoute(
            @PathParam("driver_id") int driverId
        ,
            @QueryParam("access_token") String accessToken
            ,
              @AsJson() DispatchRouteCreate createDispatchRouteParams
        ) {
        return super.createDriverDispatchRoute(
        driverId
        ,
        accessToken

        ,
        createDispatchRouteParams
        ).timeout(timeout);
    }

    /// /fleet/drivers/{driver_id:[0-9]+}/documents
    ///
    /// Create a driver document for the given driver.
    @PostReq(path: "/fleet/drivers/:driver_id/documents")
    Future<Document> createDriverDocument(
            @PathParam("driver_id") int driverId
        ,
            @QueryParam("access_token") String accessToken
            ,
              @AsJson() DocumentCreate createDocumentParams
        ) {
        return super.createDriverDocument(
        driverId
        ,
        accessToken

        ,
        createDocumentParams
        ).timeout(timeout);
    }

    /// /fleet/maintenance/dvirs
    ///
    /// Create a new dvir, marking a vehicle or trailer safe or unsafe.
    @PostReq(path: "/fleet/maintenance/dvirs")
    Future<DvirBase> createDvir(
        
            @QueryParam("access_token") String accessToken
            ,
              @AsJson() InlineObject12 createDvirParam
        ) {
        return super.createDvir(
        
        accessToken

        ,
        createDvirParam
        ).timeout(timeout);
    }

    /// /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
    ///
    /// Create a new dispatch route for the vehicle with vehicle_id.
    @PostReq(path: "/fleet/vehicles/:vehicle_id/dispatch/routes")
    Future<DispatchRoute> createVehicleDispatchRoute(
            @PathParam("vehicle_id") int vehicleId
        ,
            @QueryParam("access_token") String accessToken
            ,
              @AsJson() DispatchRouteCreate createDispatchRouteParams
        ) {
        return super.createVehicleDispatchRoute(
        vehicleId
        ,
        accessToken

        ,
        createDispatchRouteParams
        ).timeout(timeout);
    }

    /// /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
    ///
    /// Deactivate a driver with the given id.
    @DeleteReq(path: "/fleet/drivers/:driver_id_or_external_id")
    Future<void> deactivateDriver(
            @PathParam("driver_id_or_external_id") String driverIdOrExternalId
        ,
            @QueryParam("access_token") String accessToken
        ) {
        return super.deactivateDriver(
        driverIdOrExternalId
        ,
        accessToken

        ).timeout(timeout);
    }

    /// /fleet/dispatch/routes/{route_id:[0-9]+}/
    ///
    /// Delete a dispatch route and its associated jobs.
    @DeleteReq(path: "/fleet/dispatch/routes/:route_id")
    Future<void> deleteDispatchRouteById(
            @PathParam("route_id") int routeId
        ,
            @QueryParam("access_token") String accessToken
        ) {
        return super.deleteDispatchRouteById(
        routeId
        ,
        accessToken

        ).timeout(timeout);
    }

    /// /addresses/{addressId}
    ///
    /// Delete an address.
    @DeleteReq(path: "/addresses/:addressId")
    Future<void> deleteOrganizationAddress(
            @PathParam("addressId") int addressId
        ,
            @QueryParam("access_token") String accessToken
        ) {
        return super.deleteOrganizationAddress(
        addressId
        ,
        accessToken

        ).timeout(timeout);
    }

    /// /fleet/dispatch/routes
    ///
    /// Fetch all of the dispatch routes for the group.
    @GetReq(path: "/fleet/dispatch/routes")
    Future<List<DispatchRoute>> fetchAllDispatchRoutes(
        
            @QueryParam("access_token") String accessToken, 
        
            @QueryParam("group_id") int groupId, 
        
            @QueryParam("end_time") int endTime, 
        
            @QueryParam("duration") int duration
        ) {
        return super.fetchAllDispatchRoutes(
        
        accessToken, 
        
        groupId, 
        
        endTime, 
        
        duration

        ).timeout(timeout);
    }

    /// /fleet/dispatch/routes/job_updates
    ///
    /// Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
    @GetReq(path: "/fleet/dispatch/routes/job_updates")
    Future<AllRouteJobUpdates> fetchAllRouteJobUpdates(
        
            @QueryParam("access_token") String accessToken, 
        
            @QueryParam("group_id") int groupId, 
        
            @QueryParam("sequence_id") String sequenceId, 
        
            @QueryParam("include") String include
        ) {
        return super.fetchAllRouteJobUpdates(
        
        accessToken, 
        
        groupId, 
        
        sequenceId, 
        
        include

        ).timeout(timeout);
    }

    /// /fleet/assets/locations
    ///
    /// Fetch current locations of all assets for the group.
    @GetReq(path: "/fleet/assets/locations")
    Future<InlineResponse2001> getAllAssetCurrentLocations(
        
            @QueryParam("access_token") String accessToken, 
        
            @QueryParam("group_id") int groupId
        ) {
        return super.getAllAssetCurrentLocations(
        
        accessToken, 
        
        groupId

        ).timeout(timeout);
    }

    /// /fleet/assets
    ///
    /// Fetch all of the assets for the group.
    @GetReq(path: "/fleet/assets")
    Future<InlineResponse200> getAllAssets(
        
            @QueryParam("access_token") String accessToken, 
        
            @QueryParam("group_id") int groupId
        ) {
        return super.getAllAssets(
        
        accessToken, 
        
        groupId

        ).timeout(timeout);
    }

    /// /fleet/drivers/inactive
    ///
    /// Fetch all deactivated drivers for the group.
    @GetReq(path: "/fleet/drivers/inactive")
    Future<List<Driver>> getAllDeactivatedDrivers(
        
            @QueryParam("access_token") String accessToken, 
        
            @QueryParam("group_id") int groupId
        ) {
        return super.getAllDeactivatedDrivers(
        
        accessToken, 
        
        groupId

        ).timeout(timeout);
    }

    /// /fleet/assets/{assetId:[0-9]+}/locations
    ///
    /// Fetch the historical locations for the asset.
    @GetReq(path: "/fleet/assets/:asset_id/locations")
    Future<List<Object>> getAssetLocation(
            @PathParam("asset_id") int assetId
        ,
            @QueryParam("access_token") String accessToken, 
        
            @QueryParam("startMs") int startMs, 
        
            @QueryParam("endMs") int endMs
        ) {
        return super.getAssetLocation(
        assetId
        ,
        accessToken, 
        
        startMs, 
        
        endMs

        ).timeout(timeout);
    }

    /// /fleet/assets/{assetId:[0-9]+}/reefer
    ///
    /// Fetch the reefer-specific stats of an asset.
    @GetReq(path: "/fleet/assets/:asset_id/reefer")
    Future<AssetReeferResponse> getAssetReefer(
            @PathParam("asset_id") int assetId
        ,
            @QueryParam("access_token") String accessToken, 
        
            @QueryParam("startMs") int startMs, 
        
            @QueryParam("endMs") int endMs
        ) {
        return super.getAssetReefer(
        assetId
        ,
        accessToken, 
        
        startMs, 
        
        endMs

        ).timeout(timeout);
    }

    /// /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
    ///
    /// Fetch deactivated driver by id.
    @GetReq(path: "/fleet/drivers/inactive/:driver_id_or_external_id")
    Future<Driver> getDeactivatedDriverById(
            @PathParam("driver_id_or_external_id") String driverIdOrExternalId
        ,
            @QueryParam("access_token") String accessToken
        ) {
        return super.getDeactivatedDriverById(
        driverIdOrExternalId
        ,
        accessToken

        ).timeout(timeout);
    }

    /// /fleet/dispatch/routes/{route_id:[0-9]+}
    ///
    /// Fetch a dispatch route by id.
    @GetReq(path: "/fleet/dispatch/routes/:route_id")
    Future<DispatchRoute> getDispatchRouteById(
            @PathParam("route_id") int routeId
        ,
            @QueryParam("access_token") String accessToken
        ) {
        return super.getDispatchRouteById(
        routeId
        ,
        accessToken

        ).timeout(timeout);
    }

    /// /fleet/dispatch/routes/{route_id:[0-9]+}/history
    ///
    /// Fetch the history of a dispatch route.
    @GetReq(path: "/fleet/dispatch/routes/:route_id/history")
    Future<DispatchRouteHistory> getDispatchRouteHistory(
            @PathParam("route_id") int routeId
        ,
            @QueryParam("access_token") String accessToken, 
        
            @QueryParam("start_time") int startTime, 
        
            @QueryParam("end_time") int endTime
        ) {
        return super.getDispatchRouteHistory(
        routeId
        ,
        accessToken, 
        
        startTime, 
        
        endTime

        ).timeout(timeout);
    }

    /// /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
    ///
    /// Fetch all of the dispatch routes for a given driver.
    @GetReq(path: "/fleet/drivers/:driver_id/dispatch/routes")
    Future<List<DispatchRoute>> getDispatchRoutesByDriverId(
            @PathParam("driver_id") int driverId
        ,
            @QueryParam("access_token") String accessToken, 
        
            @QueryParam("end_time") int endTime, 
        
            @QueryParam("duration") int duration
        ) {
        return super.getDispatchRoutesByDriverId(
        driverId
        ,
        accessToken, 
        
        endTime, 
        
        duration

        ).timeout(timeout);
    }

    /// /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
    ///
    /// Fetch all of the dispatch routes for a given vehicle.
    @GetReq(path: "/fleet/vehicles/:vehicle_id/dispatch/routes")
    Future<List<DispatchRoute>> getDispatchRoutesByVehicleId(
            @PathParam("vehicle_id") int vehicleId
        ,
            @QueryParam("access_token") String accessToken, 
        
            @QueryParam("end_time") int endTime, 
        
            @QueryParam("duration") int duration
        ) {
        return super.getDispatchRoutesByVehicleId(
        vehicleId
        ,
        accessToken, 
        
        endTime, 
        
        duration

        ).timeout(timeout);
    }

    /// /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
    ///
    /// Fetch driver by id.
    @GetReq(path: "/fleet/drivers/:driver_id_or_external_id")
    Future<Driver> getDriverById(
            @PathParam("driver_id_or_external_id") String driverIdOrExternalId
        ,
            @QueryParam("access_token") String accessToken
        ) {
        return super.getDriverById(
        driverIdOrExternalId
        ,
        accessToken

        ).timeout(timeout);
    }

    /// /fleet/drivers/document_types
    ///
    /// Fetch all of the document types.
    @GetReq(path: "/fleet/drivers/document_types")
    Future<List<DocumentType>> getDriverDocumentTypesByOrgId(
        ) {
        return super.getDriverDocumentTypesByOrgId(

        ).timeout(timeout);
    }

    /// /fleet/drivers/documents
    ///
    /// Fetch all of the documents.
    @GetReq(path: "/fleet/drivers/documents")
    Future<List<Document>> getDriverDocumentsByOrgId(
        
            @QueryParam("access_token") String accessToken, 
        
            @QueryParam("endMs") int endMs, 
        
            @QueryParam("durationMs") int durationMs
        ) {
        return super.getDriverDocumentsByOrgId(
        
        accessToken, 
        
        endMs, 
        
        durationMs

        ).timeout(timeout);
    }

    /// /fleet/drivers/{driverId:[0-9]+}/safety/score
    ///
    /// Fetch the safety score for the driver.
    @GetReq(path: "/fleet/drivers/:driverId/safety/score")
    Future<DriverSafetyScoreResponse> getDriverSafetyScore(
            @PathParam("driverId") int driverId
        ,
            @QueryParam("access_token") String accessToken, 
        
            @QueryParam("startMs") int startMs, 
        
            @QueryParam("endMs") int endMs
        ) {
        return super.getDriverSafetyScore(
        driverId
        ,
        accessToken, 
        
        startMs, 
        
        endMs

        ).timeout(timeout);
    }

    /// /fleet/maintenance/dvirs
    ///
    /// Get DVIRs for the org within provided time constraints
    @GetReq(path: "/fleet/maintenance/dvirs")
    Future<DvirListResponse> getDvirs(
        
            @QueryParam("access_token") String accessToken, 
        
            @QueryParam("end_ms") int endMs, 
        
            @QueryParam("duration_ms") int durationMs, 
        
            @QueryParam("group_id") int groupId
        ) {
        return super.getDvirs(
        
        accessToken, 
        
        endMs, 
        
        durationMs, 
        
        groupId

        ).timeout(timeout);
    }

    /// /fleet/drivers
    ///
    /// Get all the drivers for the specified group.
    @PostReq(path: "/fleet/drivers")
    Future<DriversResponse> getFleetDrivers(
        
            @QueryParam("access_token") String accessToken
            ,
              @AsJson() InlineObject3 groupDriversParam
        ) {
        return super.getFleetDrivers(
        
        accessToken

        ,
        groupDriversParam
        ).timeout(timeout);
    }

    /// /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
    ///
    /// Get summarized daily HOS charts for a specified driver.
    @PostReq(path: "/fleet/drivers/:driver_id/hos_daily_logs")
    Future<DriverDailyLogResponse> getFleetDriversHosDailyLogs(
            @PathParam("driver_id") int driverId
        ,
            @QueryParam("access_token") String accessToken
            ,
              @AsJson() InlineObject6 hosLogsParam
        ) {
        return super.getFleetDriversHosDailyLogs(
        driverId
        ,
        accessToken

        ,
        hosLogsParam
        ).timeout(timeout);
    }

    /// /fleet/drivers/summary
    ///
    /// Get the distance and time each driver in an organization has driven in a given time period.
    @PostReq(path: "/fleet/drivers/summary")
    Future<DriversSummaryResponse> getFleetDriversSummary(
        
            @QueryParam("access_token") String accessToken, 
        
            @QueryParam("snap_to_day_bounds") bool snapToDayBounds
            ,
              @AsJson() InlineObject5 driversSummaryParam
        ) {
        return super.getFleetDriversSummary(
        
        accessToken, 
        
        snapToDayBounds

        ,
        driversSummaryParam
        ).timeout(timeout);
    }

    /// /fleet/hos_authentication_logs
    ///
    /// Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.
    @PostReq(path: "/fleet/hos_authentication_logs")
    Future<HosAuthenticationLogsResponse> getFleetHosAuthenticationLogs(
        
            @QueryParam("access_token") String accessToken
            ,
              @AsJson() InlineObject7 hosAuthenticationLogsParam
        ) {
        return super.getFleetHosAuthenticationLogs(
        
        accessToken

        ,
        hosAuthenticationLogsParam
        ).timeout(timeout);
    }

    /// /fleet/hos_logs
    ///
    /// Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.
    @PostReq(path: "/fleet/hos_logs")
    Future<HosLogsResponse> getFleetHosLogs(
        
            @QueryParam("access_token") String accessToken
            ,
              @AsJson() InlineObject8 hosLogsParam
        ) {
        return super.getFleetHosLogs(
        
        accessToken

        ,
        hosLogsParam
        ).timeout(timeout);
    }

    /// /fleet/hos_logs_summary
    ///
    /// Get the current HOS status for all drivers in the group.
    @PostReq(path: "/fleet/hos_logs_summary")
    Future<HosLogsSummaryResponse> getFleetHosLogsSummary(
        
            @QueryParam("access_token") String accessToken
            ,
              @AsJson() InlineObject9 hosLogsParam
        ) {
        return super.getFleetHosLogsSummary(
        
        accessToken

        ,
        hosLogsParam
        ).timeout(timeout);
    }

    /// /fleet/locations
    ///
    /// Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.
    @PostReq(path: "/fleet/locations")
    Future<InlineResponse2003> getFleetLocations(
        
            @QueryParam("access_token") String accessToken
            ,
              @AsJson() InlineObject11 groupParam
        ) {
        return super.getFleetLocations(
        
        accessToken

        ,
        groupParam
        ).timeout(timeout);
    }

    /// /fleet/maintenance/list
    ///
    /// Get list of the vehicles with any engine faults or check light data.
    @PostReq(path: "/fleet/maintenance/list")
    Future<InlineResponse2004> getFleetMaintenanceList(
        
            @QueryParam("access_token") String accessToken
            ,
              @AsJson() InlineObject13 groupParam
        ) {
        return super.getFleetMaintenanceList(
        
        accessToken

        ,
        groupParam
        ).timeout(timeout);
    }

    /// /fleet/trips
    ///
    /// Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.
    @PostReq(path: "/fleet/trips")
    Future<TripResponse> getFleetTrips(
        
            @QueryParam("access_token") String accessToken
            ,
              @AsJson() InlineObject15 tripsParam
        ) {
        return super.getFleetTrips(
        
        accessToken

        ,
        tripsParam
        ).timeout(timeout);
    }

    /// /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
    ///
    /// Gets a specific vehicle.
    @GetReq(path: "/fleet/vehicles/:vehicle_id_or_external_id")
    Future<FleetVehicleResponse> getFleetVehicle(
            @PathParam("vehicle_id_or_external_id") String vehicleIdOrExternalId
        ,
            @QueryParam("access_token") String accessToken
        ) {
        return super.getFleetVehicle(
        vehicleIdOrExternalId
        ,
        accessToken

        ).timeout(timeout);
    }

    /// /addresses/{addressId}
    ///
    /// Fetch an address by its id.
    @GetReq(path: "/addresses/:addressId")
    Future<Address> getOrganizationAddress(
            @PathParam("addressId") int addressId
        ,
            @QueryParam("access_token") String accessToken
        ) {
        return super.getOrganizationAddress(
        addressId
        ,
        accessToken

        ).timeout(timeout);
    }

    /// /addresses
    ///
    /// Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.
    @GetReq(path: "/addresses")
    Future<List<Address>> getOrganizationAddresses(
        
            @QueryParam("access_token") String accessToken
        ) {
        return super.getOrganizationAddresses(
        
        accessToken

        ).timeout(timeout);
    }

    /// /contacts/{contact_id}
    ///
    /// Fetch a contact by its id.
    @GetReq(path: "/contacts/:contact_id")
    Future<Contact> getOrganizationContact(
            @PathParam("contact_id") int contactId
        ,
            @QueryParam("access_token") String accessToken
        ) {
        return super.getOrganizationContact(
        contactId
        ,
        accessToken

        ).timeout(timeout);
    }

    /// /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
    ///
    /// Fetch harsh event details for a vehicle.
    @GetReq(path: "/fleet/vehicles/:vehicleId/safety/harsh_event")
    Future<VehicleHarshEventResponse> getVehicleHarshEvent(
            @PathParam("vehicleId") int vehicleId
        ,
            @QueryParam("access_token") String accessToken, 
        
            @QueryParam("timestamp") int timestamp
        ) {
        return super.getVehicleHarshEvent(
        vehicleId
        ,
        accessToken, 
        
        timestamp

        ).timeout(timeout);
    }

    /// /fleet/vehicles/{vehicle_id:[0-9]+}/locations
    ///
    /// Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.
    @GetReq(path: "/fleet/vehicles/:vehicle_id/locations")
    Future<List<FleetVehicleLocation>> getVehicleLocations(
            @PathParam("vehicle_id") int vehicleId
        ,
            @QueryParam("access_token") String accessToken, 
        
            @QueryParam("startMs") int startMs, 
        
            @QueryParam("endMs") int endMs
        ) {
        return super.getVehicleLocations(
        vehicleId
        ,
        accessToken, 
        
        startMs, 
        
        endMs

        ).timeout(timeout);
    }

    /// /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
    ///
    /// Fetch the safety score for the vehicle.
    @GetReq(path: "/fleet/vehicles/:vehicleId/safety/score")
    Future<VehicleSafetyScoreResponse> getVehicleSafetyScore(
            @PathParam("vehicleId") int vehicleId
        ,
            @QueryParam("access_token") String accessToken, 
        
            @QueryParam("startMs") int startMs, 
        
            @QueryParam("endMs") int endMs
        ) {
        return super.getVehicleSafetyScore(
        vehicleId
        ,
        accessToken, 
        
        startMs, 
        
        endMs

        ).timeout(timeout);
    }

    /// /fleet/vehicles/stats
    ///
    /// Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time.
    @GetReq(path: "/fleet/vehicles/stats")
    Future<InlineResponse2005> getVehicleStats(
        
            @QueryParam("access_token") String accessToken, 
        
            @QueryParam("startMs") int startMs, 
        
            @QueryParam("endMs") int endMs, 
        
            @QueryParam("series") String series, 
        
            @QueryParam("tagIds") String tagIds, 
        
            @QueryParam("startingAfter") String startingAfter, 
        
            @QueryParam("endingBefore") String endingBefore, 
        
            @QueryParam("limit") int limit
        ) {
        return super.getVehicleStats(
        
        accessToken, 
        
        startMs, 
        
        endMs, 
        
        series, 
        
        tagIds, 
        
        startingAfter, 
        
        endingBefore, 
        
        limit

        ).timeout(timeout);
    }

    /// /fleet/vehicles/locations
    ///
    /// Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.
    @GetReq(path: "/fleet/vehicles/locations")
    Future<List<Object>> getVehiclesLocations(
        
            @QueryParam("access_token") String accessToken, 
        
            @QueryParam("startMs") int startMs, 
        
            @QueryParam("endMs") int endMs
        ) {
        return super.getVehiclesLocations(
        
        accessToken, 
        
        startMs, 
        
        endMs

        ).timeout(timeout);
    }

    /// /contacts
    ///
    /// Fetch all contacts for the organization.
    @GetReq(path: "/contacts")
    Future<List<Contact>> listContacts(
        
            @QueryParam("access_token") String accessToken
        ) {
        return super.listContacts(
        
        accessToken

        ).timeout(timeout);
    }

    /// /fleet/list
    ///
    /// Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.
    @PostReq(path: "/fleet/list")
    Future<InlineResponse2002> listFleet(
        
            @QueryParam("access_token") String accessToken, 
        
            @QueryParam("startingAfter") String startingAfter, 
        
            @QueryParam("endingBefore") String endingBefore, 
        
            @QueryParam("limit") int limit
            ,
              @AsJson() InlineObject10 groupParam
        ) {
        return super.listFleet(
        
        accessToken, 
        
        startingAfter, 
        
        endingBefore, 
        
        limit

        ,
        groupParam
        ).timeout(timeout);
    }

    /// /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
    ///
    /// Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.
    @PatchReq(path: "/fleet/vehicles/:vehicle_id_or_external_id")
    Future<FleetVehicleResponse> patchFleetVehicle(
            @PathParam("vehicle_id_or_external_id") String vehicleIdOrExternalId
        ,
            @QueryParam("access_token") String accessToken
            ,
              @AsJson() InlineObject16 data
        ) {
        return super.patchFleetVehicle(
        vehicleIdOrExternalId
        ,
        accessToken

        ,
        data
        ).timeout(timeout);
    }

    /// /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
    ///
    /// Reactivate the inactive driver having id.
    @PutReq(path: "/fleet/drivers/inactive/:driver_id_or_external_id")
    Future<Driver> reactivateDriverById(
            @PathParam("driver_id_or_external_id") String driverIdOrExternalId
        ,
            @QueryParam("access_token") String accessToken
            ,
              @AsJson() InlineObject4 reactivateDriverParam
        ) {
        return super.reactivateDriverById(
        driverIdOrExternalId
        ,
        accessToken

        ,
        reactivateDriverParam
        ).timeout(timeout);
    }

    /// /fleet/dispatch/routes/{route_id:[0-9]+}/
    ///
    /// Update a dispatch route and its associated jobs.
    @PutReq(path: "/fleet/dispatch/routes/:route_id")
    Future<DispatchRoute> updateDispatchRouteById(
            @PathParam("route_id") int routeId
        ,
            @QueryParam("access_token") String accessToken
            ,
              @AsJson() DispatchRoute updateDispatchRouteParams
        ) {
        return super.updateDispatchRouteById(
        routeId
        ,
        accessToken

        ,
        updateDispatchRouteParams
        ).timeout(timeout);
    }

    /// /addresses/{addressId}
    ///
    /// Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.
    @PatchReq(path: "/addresses/:addressId")
    Future<void> updateOrganizationAddress(
            @PathParam("addressId") int addressId
        ,
            @QueryParam("access_token") String accessToken
            ,
              @AsJson() InlineObject1 address
        ) {
        return super.updateOrganizationAddress(
        addressId
        ,
        accessToken

        ,
        address
        ).timeout(timeout);
    }

    /// /fleet/set_data
    ///
    /// This method enables the mutation of metadata for vehicles in the Samsara Cloud.
    @PostReq(path: "/fleet/set_data")
    Future<void> updateVehicles(
        
            @QueryParam("access_token") String accessToken
            ,
              @AsJson() InlineObject14 vehicleUpdateParam
        ) {
        return super.updateVehicles(
        
        accessToken

        ,
        vehicleUpdateParam
        ).timeout(timeout);
    }


}

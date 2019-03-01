import 'package:jaguar_retrofit/annotations/annotations.dart';
import 'package:jaguar_retrofit/jaguar_retrofit.dart';
import 'package:jaguar_serializer/jaguar_serializer.dart';
import 'package:jaguar_serializer/src/repo/repo.dart';
import 'dart:async';

import 'package:openapi/model/dispatch_route.dart';
import 'package:openapi/model/dispatch_route_history.dart';
import 'package:openapi/model/dispatch_route_create.dart';
import 'package:openapi/model/all_route_job_updates.dart';


part 'routes_api.jretro.dart';

@GenApiClient()
class RoutesApi extends _$RoutesApiClient implements ApiClient {
    final Route base;
    final SerializerRepo serializers;
    final Duration timeout;

    RoutesApi({this.base, this.serializers, this.timeout = const Duration(minutes: 2)});

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


}

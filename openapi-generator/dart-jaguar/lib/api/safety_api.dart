import 'package:jaguar_retrofit/annotations/annotations.dart';
import 'package:jaguar_retrofit/jaguar_retrofit.dart';
import 'package:jaguar_serializer/jaguar_serializer.dart';
import 'package:jaguar_serializer/src/repo/repo.dart';
import 'dart:async';

import 'package:openapi/model/driver_safety_score_response.dart';
import 'package:openapi/model/vehicle_harsh_event_response.dart';
import 'package:openapi/model/vehicle_safety_score_response.dart';


part 'safety_api.jretro.dart';

@GenApiClient()
class SafetyApi extends _$SafetyApiClient implements ApiClient {
    final Route base;
    final SerializerRepo serializers;
    final Duration timeout;

    SafetyApi({this.base, this.serializers, this.timeout = const Duration(minutes: 2)});

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


}

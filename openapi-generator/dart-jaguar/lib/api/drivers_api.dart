import 'package:jaguar_retrofit/annotations/annotations.dart';
import 'package:jaguar_retrofit/jaguar_retrofit.dart';
import 'package:jaguar_serializer/jaguar_serializer.dart';
import 'package:jaguar_serializer/src/repo/repo.dart';
import 'dart:async';

import 'package:openapi/model/driver.dart';
import 'package:openapi/model/driver_for_create.dart';
import 'package:openapi/model/inline_object4.dart';


part 'drivers_api.jretro.dart';

@GenApiClient()
class DriversApi extends _$DriversApiClient implements ApiClient {
    final Route base;
    final SerializerRepo serializers;
    final Duration timeout;

    DriversApi({this.base, this.serializers, this.timeout = const Duration(minutes: 2)});

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


}

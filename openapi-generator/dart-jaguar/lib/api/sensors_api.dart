import 'package:jaguar_retrofit/annotations/annotations.dart';
import 'package:jaguar_retrofit/jaguar_retrofit.dart';
import 'package:jaguar_serializer/jaguar_serializer.dart';
import 'package:jaguar_serializer/src/repo/repo.dart';
import 'dart:async';

import 'package:openapi/model/inline_object24.dart';
import 'package:openapi/model/inline_object23.dart';
import 'package:openapi/model/inline_response2008.dart';
import 'package:openapi/model/humidity_response.dart';
import 'package:openapi/model/inline_object22.dart';
import 'package:openapi/model/inline_object21.dart';
import 'package:openapi/model/inline_object20.dart';
import 'package:openapi/model/temperature_response.dart';
import 'package:openapi/model/cargo_response.dart';
import 'package:openapi/model/inline_object19.dart';
import 'package:openapi/model/sensor_history_response.dart';
import 'package:openapi/model/door_response.dart';


part 'sensors_api.jretro.dart';

@GenApiClient()
class SensorsApi extends _$SensorsApiClient implements ApiClient {
    final Route base;
    final SerializerRepo serializers;
    final Duration timeout;

    SensorsApi({this.base, this.serializers, this.timeout = const Duration(minutes: 2)});

    /// /sensors/list
    ///
    /// Get sensor objects. This method returns a list of the sensor objects in the Samsara Cloud and information about them.
    @PostReq(path: "/sensors/list")
    Future<InlineResponse2008> getSensors(
        
            @QueryParam("access_token") String accessToken
            ,
              @AsJson() InlineObject23 groupParam
        ) {
        return super.getSensors(
        
        accessToken

        ,
        groupParam
        ).timeout(timeout);
    }

    /// /sensors/cargo
    ///
    /// Get cargo monitor status (empty / full) for requested sensors.
    @PostReq(path: "/sensors/cargo")
    Future<CargoResponse> getSensorsCargo(
        
            @QueryParam("access_token") String accessToken
            ,
              @AsJson() InlineObject19 sensorParam
        ) {
        return super.getSensorsCargo(
        
        accessToken

        ,
        sensorParam
        ).timeout(timeout);
    }

    /// /sensors/door
    ///
    /// Get door monitor status (closed / open) for requested sensors.
    @PostReq(path: "/sensors/door")
    Future<DoorResponse> getSensorsDoor(
        
            @QueryParam("access_token") String accessToken
            ,
              @AsJson() InlineObject20 sensorParam
        ) {
        return super.getSensorsDoor(
        
        accessToken

        ,
        sensorParam
        ).timeout(timeout);
    }

    /// /sensors/history
    ///
    /// Get historical data for specified sensors. This method returns a set of historical data for the specified sensors in the specified time range and at the specified time resolution.
    @PostReq(path: "/sensors/history")
    Future<SensorHistoryResponse> getSensorsHistory(
        
            @QueryParam("access_token") String accessToken
            ,
              @AsJson() InlineObject21 historyParam
        ) {
        return super.getSensorsHistory(
        
        accessToken

        ,
        historyParam
        ).timeout(timeout);
    }

    /// /sensors/humidity
    ///
    /// Get humidity for requested sensors. This method returns the current relative humidity for the requested sensors.
    @PostReq(path: "/sensors/humidity")
    Future<HumidityResponse> getSensorsHumidity(
        
            @QueryParam("access_token") String accessToken
            ,
              @AsJson() InlineObject22 sensorParam
        ) {
        return super.getSensorsHumidity(
        
        accessToken

        ,
        sensorParam
        ).timeout(timeout);
    }

    /// /sensors/temperature
    ///
    /// Get temperature for requested sensors. This method returns the current ambient temperature (and probe temperature if applicable) for the requested sensors.
    @PostReq(path: "/sensors/temperature")
    Future<TemperatureResponse> getSensorsTemperature(
        
            @QueryParam("access_token") String accessToken
            ,
              @AsJson() InlineObject24 sensorParam
        ) {
        return super.getSensorsTemperature(
        
        accessToken

        ,
        sensorParam
        ).timeout(timeout);
    }


}

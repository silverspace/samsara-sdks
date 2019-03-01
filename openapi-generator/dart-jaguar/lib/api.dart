library openapi.api;

import 'package:http/io_client.dart';
import 'package:jaguar_serializer/jaguar_serializer.dart';
import 'package:jaguar_retrofit/jaguar_retrofit.dart';
import 'package:openapi/auth/api_key_auth.dart';
import 'package:openapi/auth/basic_auth.dart';
import 'package:openapi/auth/oauth.dart';

import 'package:openapi/api/assets_api.dart';
import 'package:openapi/api/drivers_api.dart';
import 'package:openapi/api/fleet_api.dart';
import 'package:openapi/api/industrial_api.dart';
import 'package:openapi/api/routes_api.dart';
import 'package:openapi/api/safety_api.dart';
import 'package:openapi/api/sensors_api.dart';
import 'package:openapi/api/tags_api.dart';
import 'package:openapi/api/users_api.dart';

import 'package:openapi/model/address.dart';
import 'package:openapi/model/address_geofence.dart';
import 'package:openapi/model/address_geofence_circle.dart';
import 'package:openapi/model/address_geofence_polygon.dart';
import 'package:openapi/model/address_geofence_polygon_vertices.dart';
import 'package:openapi/model/addresses_addresses.dart';
import 'package:openapi/model/all_route_job_updates.dart';
import 'package:openapi/model/asset.dart';
import 'package:openapi/model/asset_cable.dart';
import 'package:openapi/model/asset_current_location.dart';
import 'package:openapi/model/asset_current_locations_response.dart';
import 'package:openapi/model/asset_reefer_response.dart';
import 'package:openapi/model/asset_reefer_response_reefer_stats.dart';
import 'package:openapi/model/asset_reefer_response_reefer_stats_alarms.dart';
import 'package:openapi/model/asset_reefer_response_reefer_stats_alarms1.dart';
import 'package:openapi/model/asset_reefer_response_reefer_stats_engine_hours.dart';
import 'package:openapi/model/asset_reefer_response_reefer_stats_fuel_percentage.dart';
import 'package:openapi/model/asset_reefer_response_reefer_stats_power_status.dart';
import 'package:openapi/model/asset_reefer_response_reefer_stats_return_air_temp.dart';
import 'package:openapi/model/asset_reefer_response_reefer_stats_set_point.dart';
import 'package:openapi/model/aux_input.dart';
import 'package:openapi/model/aux_input_series.dart';
import 'package:openapi/model/cargo_response.dart';
import 'package:openapi/model/cargo_response_sensors.dart';
import 'package:openapi/model/contact.dart';
import 'package:openapi/model/current_driver.dart';
import 'package:openapi/model/data_input_history_response.dart';
import 'package:openapi/model/data_input_history_response_points.dart';
import 'package:openapi/model/dispatch_job.dart';
import 'package:openapi/model/dispatch_job_create.dart';
import 'package:openapi/model/dispatch_route.dart';
import 'package:openapi/model/dispatch_route_base.dart';
import 'package:openapi/model/dispatch_route_create.dart';
import 'package:openapi/model/dispatch_route_historical_entry.dart';
import 'package:openapi/model/dispatch_route_history.dart';
import 'package:openapi/model/document.dart';
import 'package:openapi/model/document_base.dart';
import 'package:openapi/model/document_create.dart';
import 'package:openapi/model/document_field.dart';
import 'package:openapi/model/document_field_create.dart';
import 'package:openapi/model/document_field_create_photo_value.dart';
import 'package:openapi/model/document_field_type.dart';
import 'package:openapi/model/document_field_type_number_value_type_metadata.dart';
import 'package:openapi/model/document_type.dart';
import 'package:openapi/model/door_response.dart';
import 'package:openapi/model/door_response_sensors.dart';
import 'package:openapi/model/driver.dart';
import 'package:openapi/model/driver_base.dart';
import 'package:openapi/model/driver_daily_log_response.dart';
import 'package:openapi/model/driver_daily_log_response_days.dart';
import 'package:openapi/model/driver_for_create.dart';
import 'package:openapi/model/driver_safety_score_response.dart';
import 'package:openapi/model/drivers_response.dart';
import 'package:openapi/model/drivers_summary_response.dart';
import 'package:openapi/model/drivers_summary_response_summaries.dart';
import 'package:openapi/model/dvir_base.dart';
import 'package:openapi/model/dvir_base_author_signature.dart';
import 'package:openapi/model/dvir_base_mechanic_or_agent_signature.dart';
import 'package:openapi/model/dvir_base_next_driver_signature.dart';
import 'package:openapi/model/dvir_base_trailer_defects.dart';
import 'package:openapi/model/dvir_base_vehicle.dart';
import 'package:openapi/model/dvir_list_response.dart';
import 'package:openapi/model/engine_state.dart';
import 'package:openapi/model/fleet_vehicle_location.dart';
import 'package:openapi/model/fleet_vehicle_response.dart';
import 'package:openapi/model/fleet_vehicle_response_vehicle_info.dart';
import 'package:openapi/model/hos_authentication_logs_response.dart';
import 'package:openapi/model/hos_authentication_logs_response_authentication_logs.dart';
import 'package:openapi/model/hos_logs_response.dart';
import 'package:openapi/model/hos_logs_response_logs.dart';
import 'package:openapi/model/hos_logs_summary_response.dart';
import 'package:openapi/model/hos_logs_summary_response_drivers.dart';
import 'package:openapi/model/humidity_response.dart';
import 'package:openapi/model/humidity_response_sensors.dart';
import 'package:openapi/model/inline_object.dart';
import 'package:openapi/model/inline_object1.dart';
import 'package:openapi/model/inline_object10.dart';
import 'package:openapi/model/inline_object11.dart';
import 'package:openapi/model/inline_object12.dart';
import 'package:openapi/model/inline_object13.dart';
import 'package:openapi/model/inline_object14.dart';
import 'package:openapi/model/inline_object15.dart';
import 'package:openapi/model/inline_object16.dart';
import 'package:openapi/model/inline_object17.dart';
import 'package:openapi/model/inline_object18.dart';
import 'package:openapi/model/inline_object19.dart';
import 'package:openapi/model/inline_object2.dart';
import 'package:openapi/model/inline_object20.dart';
import 'package:openapi/model/inline_object21.dart';
import 'package:openapi/model/inline_object22.dart';
import 'package:openapi/model/inline_object23.dart';
import 'package:openapi/model/inline_object24.dart';
import 'package:openapi/model/inline_object3.dart';
import 'package:openapi/model/inline_object4.dart';
import 'package:openapi/model/inline_object5.dart';
import 'package:openapi/model/inline_object6.dart';
import 'package:openapi/model/inline_object7.dart';
import 'package:openapi/model/inline_object8.dart';
import 'package:openapi/model/inline_object9.dart';
import 'package:openapi/model/inline_response200.dart';
import 'package:openapi/model/inline_response2001.dart';
import 'package:openapi/model/inline_response2002.dart';
import 'package:openapi/model/inline_response2003.dart';
import 'package:openapi/model/inline_response2004.dart';
import 'package:openapi/model/inline_response2005.dart';
import 'package:openapi/model/inline_response2005_vehicle_stats.dart';
import 'package:openapi/model/inline_response2006.dart';
import 'package:openapi/model/inline_response2007.dart';
import 'package:openapi/model/inline_response2008.dart';
import 'package:openapi/model/inline_response2009.dart';
import 'package:openapi/model/job_status.dart';
import 'package:openapi/model/job_update_object.dart';
import 'package:openapi/model/machine.dart';
import 'package:openapi/model/machine_history_response.dart';
import 'package:openapi/model/machine_history_response_machines.dart';
import 'package:openapi/model/machine_history_response_vibrations.dart';
import 'package:openapi/model/pagination.dart';
import 'package:openapi/model/prev_job_status.dart';
import 'package:openapi/model/safety_report_harsh_event.dart';
import 'package:openapi/model/sensor.dart';
import 'package:openapi/model/sensor_history_response.dart';
import 'package:openapi/model/sensor_history_response_results.dart';
import 'package:openapi/model/sensors_history_series.dart';
import 'package:openapi/model/tag.dart';
import 'package:openapi/model/tag_create.dart';
import 'package:openapi/model/tag_metadata.dart';
import 'package:openapi/model/tag_modify.dart';
import 'package:openapi/model/tag_modify_add.dart';
import 'package:openapi/model/tag_modify_delete.dart';
import 'package:openapi/model/tag_update.dart';
import 'package:openapi/model/tagged_address.dart';
import 'package:openapi/model/tagged_address_base.dart';
import 'package:openapi/model/tagged_asset.dart';
import 'package:openapi/model/tagged_asset_base.dart';
import 'package:openapi/model/tagged_driver.dart';
import 'package:openapi/model/tagged_driver_base.dart';
import 'package:openapi/model/tagged_machine.dart';
import 'package:openapi/model/tagged_machine_base.dart';
import 'package:openapi/model/tagged_sensor.dart';
import 'package:openapi/model/tagged_sensor_base.dart';
import 'package:openapi/model/tagged_vehicle.dart';
import 'package:openapi/model/tagged_vehicle_base.dart';
import 'package:openapi/model/temperature_response.dart';
import 'package:openapi/model/temperature_response_sensors.dart';
import 'package:openapi/model/trip_response.dart';
import 'package:openapi/model/trip_response_end_coordinates.dart';
import 'package:openapi/model/trip_response_start_coordinates.dart';
import 'package:openapi/model/trip_response_trips.dart';
import 'package:openapi/model/user.dart';
import 'package:openapi/model/user_base.dart';
import 'package:openapi/model/user_role.dart';
import 'package:openapi/model/user_tag_role.dart';
import 'package:openapi/model/user_tag_role_tag.dart';
import 'package:openapi/model/vehicle.dart';
import 'package:openapi/model/vehicle_harsh_event_response.dart';
import 'package:openapi/model/vehicle_harsh_event_response_location.dart';
import 'package:openapi/model/vehicle_location.dart';
import 'package:openapi/model/vehicle_maintenance.dart';
import 'package:openapi/model/vehicle_maintenance_j1939.dart';
import 'package:openapi/model/vehicle_maintenance_j1939_check_engine_light.dart';
import 'package:openapi/model/vehicle_maintenance_j1939_diagnostic_trouble_codes.dart';
import 'package:openapi/model/vehicle_maintenance_passenger.dart';
import 'package:openapi/model/vehicle_maintenance_passenger_check_engine_light.dart';
import 'package:openapi/model/vehicle_maintenance_passenger_diagnostic_trouble_codes.dart';
import 'package:openapi/model/vehicle_safety_score_response.dart';


final jsonJaguarRepo = JsonRepo()
..add(AddressSerializer())
..add(AddressGeofenceSerializer())
..add(AddressGeofenceCircleSerializer())
..add(AddressGeofencePolygonSerializer())
..add(AddressGeofencePolygonVerticesSerializer())
..add(AddressesAddressesSerializer())
..add(AllRouteJobUpdatesSerializer())
..add(AssetSerializer())
..add(AssetCableSerializer())
..add(AssetCurrentLocationSerializer())
..add(AssetCurrentLocationsResponseSerializer())
..add(AssetReeferResponseSerializer())
..add(AssetReeferResponseReeferStatsSerializer())
..add(AssetReeferResponseReeferStatsAlarmsSerializer())
..add(AssetReeferResponseReeferStatsAlarms1Serializer())
..add(AssetReeferResponseReeferStatsEngineHoursSerializer())
..add(AssetReeferResponseReeferStatsFuelPercentageSerializer())
..add(AssetReeferResponseReeferStatsPowerStatusSerializer())
..add(AssetReeferResponseReeferStatsReturnAirTempSerializer())
..add(AssetReeferResponseReeferStatsSetPointSerializer())
..add(AuxInputSerializer())
..add(AuxInputSeriesSerializer())
..add(CargoResponseSerializer())
..add(CargoResponseSensorsSerializer())
..add(ContactSerializer())
..add(CurrentDriverSerializer())
..add(DataInputHistoryResponseSerializer())
..add(DataInputHistoryResponsePointsSerializer())
..add(DispatchJobSerializer())
..add(DispatchJobCreateSerializer())
..add(DispatchRouteSerializer())
..add(DispatchRouteBaseSerializer())
..add(DispatchRouteCreateSerializer())
..add(DispatchRouteHistoricalEntrySerializer())
..add(DispatchRouteHistorySerializer())
..add(DocumentSerializer())
..add(DocumentBaseSerializer())
..add(DocumentCreateSerializer())
..add(DocumentFieldSerializer())
..add(DocumentFieldCreateSerializer())
..add(DocumentFieldCreatePhotoValueSerializer())
..add(DocumentFieldTypeSerializer())
..add(DocumentFieldTypeNumberValueTypeMetadataSerializer())
..add(DocumentTypeSerializer())
..add(DoorResponseSerializer())
..add(DoorResponseSensorsSerializer())
..add(DriverSerializer())
..add(DriverBaseSerializer())
..add(DriverDailyLogResponseSerializer())
..add(DriverDailyLogResponseDaysSerializer())
..add(DriverForCreateSerializer())
..add(DriverSafetyScoreResponseSerializer())
..add(DriversResponseSerializer())
..add(DriversSummaryResponseSerializer())
..add(DriversSummaryResponseSummariesSerializer())
..add(DvirBaseSerializer())
..add(DvirBaseAuthorSignatureSerializer())
..add(DvirBaseMechanicOrAgentSignatureSerializer())
..add(DvirBaseNextDriverSignatureSerializer())
..add(DvirBaseTrailerDefectsSerializer())
..add(DvirBaseVehicleSerializer())
..add(DvirListResponseSerializer())
..add(EngineStateSerializer())
..add(FleetVehicleLocationSerializer())
..add(FleetVehicleResponseSerializer())
..add(FleetVehicleResponseVehicleInfoSerializer())
..add(HosAuthenticationLogsResponseSerializer())
..add(HosAuthenticationLogsResponseAuthenticationLogsSerializer())
..add(HosLogsResponseSerializer())
..add(HosLogsResponseLogsSerializer())
..add(HosLogsSummaryResponseSerializer())
..add(HosLogsSummaryResponseDriversSerializer())
..add(HumidityResponseSerializer())
..add(HumidityResponseSensorsSerializer())
..add(InlineObjectSerializer())
..add(InlineObject1Serializer())
..add(InlineObject10Serializer())
..add(InlineObject11Serializer())
..add(InlineObject12Serializer())
..add(InlineObject13Serializer())
..add(InlineObject14Serializer())
..add(InlineObject15Serializer())
..add(InlineObject16Serializer())
..add(InlineObject17Serializer())
..add(InlineObject18Serializer())
..add(InlineObject19Serializer())
..add(InlineObject2Serializer())
..add(InlineObject20Serializer())
..add(InlineObject21Serializer())
..add(InlineObject22Serializer())
..add(InlineObject23Serializer())
..add(InlineObject24Serializer())
..add(InlineObject3Serializer())
..add(InlineObject4Serializer())
..add(InlineObject5Serializer())
..add(InlineObject6Serializer())
..add(InlineObject7Serializer())
..add(InlineObject8Serializer())
..add(InlineObject9Serializer())
..add(InlineResponse200Serializer())
..add(InlineResponse2001Serializer())
..add(InlineResponse2002Serializer())
..add(InlineResponse2003Serializer())
..add(InlineResponse2004Serializer())
..add(InlineResponse2005Serializer())
..add(InlineResponse2005VehicleStatsSerializer())
..add(InlineResponse2006Serializer())
..add(InlineResponse2007Serializer())
..add(InlineResponse2008Serializer())
..add(InlineResponse2009Serializer())
..add(JobStatusSerializer())
..add(JobUpdateObjectSerializer())
..add(MachineSerializer())
..add(MachineHistoryResponseSerializer())
..add(MachineHistoryResponseMachinesSerializer())
..add(MachineHistoryResponseVibrationsSerializer())
..add(PaginationSerializer())
..add(PrevJobStatusSerializer())
..add(SafetyReportHarshEventSerializer())
..add(SensorSerializer())
..add(SensorHistoryResponseSerializer())
..add(SensorHistoryResponseResultsSerializer())
..add(SensorsHistorySeriesSerializer())
..add(TagSerializer())
..add(TagCreateSerializer())
..add(TagMetadataSerializer())
..add(TagModifySerializer())
..add(TagModifyAddSerializer())
..add(TagModifyDeleteSerializer())
..add(TagUpdateSerializer())
..add(TaggedAddressSerializer())
..add(TaggedAddressBaseSerializer())
..add(TaggedAssetSerializer())
..add(TaggedAssetBaseSerializer())
..add(TaggedDriverSerializer())
..add(TaggedDriverBaseSerializer())
..add(TaggedMachineSerializer())
..add(TaggedMachineBaseSerializer())
..add(TaggedSensorSerializer())
..add(TaggedSensorBaseSerializer())
..add(TaggedVehicleSerializer())
..add(TaggedVehicleBaseSerializer())
..add(TemperatureResponseSerializer())
..add(TemperatureResponseSensorsSerializer())
..add(TripResponseSerializer())
..add(TripResponseEndCoordinatesSerializer())
..add(TripResponseStartCoordinatesSerializer())
..add(TripResponseTripsSerializer())
..add(UserSerializer())
..add(UserBaseSerializer())
..add(UserRoleSerializer())
..add(UserTagRoleSerializer())
..add(UserTagRoleTagSerializer())
..add(VehicleSerializer())
..add(VehicleHarshEventResponseSerializer())
..add(VehicleHarshEventResponseLocationSerializer())
..add(VehicleLocationSerializer())
..add(VehicleMaintenanceSerializer())
..add(VehicleMaintenanceJ1939Serializer())
..add(VehicleMaintenanceJ1939CheckEngineLightSerializer())
..add(VehicleMaintenanceJ1939DiagnosticTroubleCodesSerializer())
..add(VehicleMaintenancePassengerSerializer())
..add(VehicleMaintenancePassengerCheckEngineLightSerializer())
..add(VehicleMaintenancePassengerDiagnosticTroubleCodesSerializer())
..add(VehicleSafetyScoreResponseSerializer())
;

final _defaultInterceptors = [OAuthInterceptor(), BasicAuthInterceptor(), ApiKeyAuthInterceptor()];

class JaguarApiGen {
    List<Interceptor> interceptors;
    String basePath = "https://api.samsara.com/v1";
    Route _baseRoute;
    final Duration timeout;

    /**
    * Add custom global interceptors, put overrideInterceptors to true to set your interceptors only (auth interceptors will not be added)
    */
    JaguarApiGen({List<Interceptor> interceptors, bool overrideInterceptors = false, String baseUrl, this.timeout = const Duration(minutes: 2)}) {
        _baseRoute = Route(baseUrl ?? basePath).withClient(globalClient ?? IOClient());
        if(interceptors == null) {
            this.interceptors = _defaultInterceptors;
        }
        else if(overrideInterceptors){
            this.interceptors = interceptors;
        }
        else {
            this.interceptors = List.from(_defaultInterceptors)..addAll(interceptors);
        }

        this.interceptors.forEach((interceptor) {
            _baseRoute.before(interceptor.before);
            _baseRoute.after(interceptor.after);
        });
    }

    void setOAuthToken(String name, String token) {
        (_defaultInterceptors[0] as OAuthInterceptor).tokens[name] = token;
    }

    void setBasicAuth(String name, String username, String password) {
        (_defaultInterceptors[1] as BasicAuthInterceptor).authInfo[name] = BasicAuthInfo(username, password);
    }

    void setApiKey(String name, String apiKey) {
        (_defaultInterceptors[2] as ApiKeyAuthInterceptor).apiKeys[name] = apiKey;
    }

    
    /**
    * Get AssetsApi instance, base route and serializer can be overridden by a given but be careful,
    * by doing that all interceptors will not be executed
    */
    AssetsApi getAssetsApi({Route base, SerializerRepo serializers}) {
        if(base == null) {
            base = _baseRoute;
        }
        if(serializers == null) {
            serializers = jsonJaguarRepo;
        }
        return AssetsApi(base: base, serializers: serializers, timeout: timeout);
    }

    
    /**
    * Get DriversApi instance, base route and serializer can be overridden by a given but be careful,
    * by doing that all interceptors will not be executed
    */
    DriversApi getDriversApi({Route base, SerializerRepo serializers}) {
        if(base == null) {
            base = _baseRoute;
        }
        if(serializers == null) {
            serializers = jsonJaguarRepo;
        }
        return DriversApi(base: base, serializers: serializers, timeout: timeout);
    }

    
    /**
    * Get FleetApi instance, base route and serializer can be overridden by a given but be careful,
    * by doing that all interceptors will not be executed
    */
    FleetApi getFleetApi({Route base, SerializerRepo serializers}) {
        if(base == null) {
            base = _baseRoute;
        }
        if(serializers == null) {
            serializers = jsonJaguarRepo;
        }
        return FleetApi(base: base, serializers: serializers, timeout: timeout);
    }

    
    /**
    * Get IndustrialApi instance, base route and serializer can be overridden by a given but be careful,
    * by doing that all interceptors will not be executed
    */
    IndustrialApi getIndustrialApi({Route base, SerializerRepo serializers}) {
        if(base == null) {
            base = _baseRoute;
        }
        if(serializers == null) {
            serializers = jsonJaguarRepo;
        }
        return IndustrialApi(base: base, serializers: serializers, timeout: timeout);
    }

    
    /**
    * Get RoutesApi instance, base route and serializer can be overridden by a given but be careful,
    * by doing that all interceptors will not be executed
    */
    RoutesApi getRoutesApi({Route base, SerializerRepo serializers}) {
        if(base == null) {
            base = _baseRoute;
        }
        if(serializers == null) {
            serializers = jsonJaguarRepo;
        }
        return RoutesApi(base: base, serializers: serializers, timeout: timeout);
    }

    
    /**
    * Get SafetyApi instance, base route and serializer can be overridden by a given but be careful,
    * by doing that all interceptors will not be executed
    */
    SafetyApi getSafetyApi({Route base, SerializerRepo serializers}) {
        if(base == null) {
            base = _baseRoute;
        }
        if(serializers == null) {
            serializers = jsonJaguarRepo;
        }
        return SafetyApi(base: base, serializers: serializers, timeout: timeout);
    }

    
    /**
    * Get SensorsApi instance, base route and serializer can be overridden by a given but be careful,
    * by doing that all interceptors will not be executed
    */
    SensorsApi getSensorsApi({Route base, SerializerRepo serializers}) {
        if(base == null) {
            base = _baseRoute;
        }
        if(serializers == null) {
            serializers = jsonJaguarRepo;
        }
        return SensorsApi(base: base, serializers: serializers, timeout: timeout);
    }

    
    /**
    * Get TagsApi instance, base route and serializer can be overridden by a given but be careful,
    * by doing that all interceptors will not be executed
    */
    TagsApi getTagsApi({Route base, SerializerRepo serializers}) {
        if(base == null) {
            base = _baseRoute;
        }
        if(serializers == null) {
            serializers = jsonJaguarRepo;
        }
        return TagsApi(base: base, serializers: serializers, timeout: timeout);
    }

    
    /**
    * Get UsersApi instance, base route and serializer can be overridden by a given but be careful,
    * by doing that all interceptors will not be executed
    */
    UsersApi getUsersApi({Route base, SerializerRepo serializers}) {
        if(base == null) {
            base = _baseRoute;
        }
        if(serializers == null) {
            serializers = jsonJaguarRepo;
        }
        return UsersApi(base: base, serializers: serializers, timeout: timeout);
    }

    
}
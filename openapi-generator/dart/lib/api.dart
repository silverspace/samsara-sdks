library openapi.api;

import 'dart:async';
import 'dart:convert';
import 'package:http/browser_client.dart';
import 'package:http/http.dart';

part 'api_client.dart';
part 'api_helper.dart';
part 'api_exception.dart';
part 'auth/authentication.dart';
part 'auth/api_key_auth.dart';
part 'auth/oauth.dart';
part 'auth/http_basic_auth.dart';

part 'api/assets_api.dart';
part 'api/drivers_api.dart';
part 'api/fleet_api.dart';
part 'api/industrial_api.dart';
part 'api/routes_api.dart';
part 'api/safety_api.dart';
part 'api/sensors_api.dart';
part 'api/tags_api.dart';
part 'api/users_api.dart';

part 'model/address.dart';
part 'model/address_geofence.dart';
part 'model/address_geofence_circle.dart';
part 'model/address_geofence_polygon.dart';
part 'model/address_geofence_polygon_vertices.dart';
part 'model/addresses_addresses.dart';
part 'model/all_route_job_updates.dart';
part 'model/asset.dart';
part 'model/asset_cable.dart';
part 'model/asset_current_location.dart';
part 'model/asset_current_locations_response.dart';
part 'model/asset_reefer_response.dart';
part 'model/asset_reefer_response_reefer_stats.dart';
part 'model/asset_reefer_response_reefer_stats_alarms.dart';
part 'model/asset_reefer_response_reefer_stats_alarms1.dart';
part 'model/asset_reefer_response_reefer_stats_engine_hours.dart';
part 'model/asset_reefer_response_reefer_stats_fuel_percentage.dart';
part 'model/asset_reefer_response_reefer_stats_power_status.dart';
part 'model/asset_reefer_response_reefer_stats_return_air_temp.dart';
part 'model/asset_reefer_response_reefer_stats_set_point.dart';
part 'model/aux_input.dart';
part 'model/aux_input_series.dart';
part 'model/cargo_response.dart';
part 'model/cargo_response_sensors.dart';
part 'model/contact.dart';
part 'model/current_driver.dart';
part 'model/data_input_history_response.dart';
part 'model/data_input_history_response_points.dart';
part 'model/dispatch_job.dart';
part 'model/dispatch_job_create.dart';
part 'model/dispatch_route.dart';
part 'model/dispatch_route_base.dart';
part 'model/dispatch_route_create.dart';
part 'model/dispatch_route_historical_entry.dart';
part 'model/dispatch_route_history.dart';
part 'model/document.dart';
part 'model/document_base.dart';
part 'model/document_create.dart';
part 'model/document_field.dart';
part 'model/document_field_create.dart';
part 'model/document_field_create_photo_value.dart';
part 'model/document_field_type.dart';
part 'model/document_field_type_number_value_type_metadata.dart';
part 'model/document_type.dart';
part 'model/door_response.dart';
part 'model/door_response_sensors.dart';
part 'model/driver.dart';
part 'model/driver_base.dart';
part 'model/driver_daily_log_response.dart';
part 'model/driver_daily_log_response_days.dart';
part 'model/driver_for_create.dart';
part 'model/driver_safety_score_response.dart';
part 'model/drivers_response.dart';
part 'model/drivers_summary_response.dart';
part 'model/drivers_summary_response_summaries.dart';
part 'model/dvir_base.dart';
part 'model/dvir_base_author_signature.dart';
part 'model/dvir_base_mechanic_or_agent_signature.dart';
part 'model/dvir_base_next_driver_signature.dart';
part 'model/dvir_base_trailer_defects.dart';
part 'model/dvir_base_vehicle.dart';
part 'model/dvir_list_response.dart';
part 'model/engine_state.dart';
part 'model/fleet_vehicle_location.dart';
part 'model/fleet_vehicle_response.dart';
part 'model/fleet_vehicle_response_vehicle_info.dart';
part 'model/hos_authentication_logs_response.dart';
part 'model/hos_authentication_logs_response_authentication_logs.dart';
part 'model/hos_logs_response.dart';
part 'model/hos_logs_response_logs.dart';
part 'model/hos_logs_summary_response.dart';
part 'model/hos_logs_summary_response_drivers.dart';
part 'model/humidity_response.dart';
part 'model/humidity_response_sensors.dart';
part 'model/inline_object.dart';
part 'model/inline_object1.dart';
part 'model/inline_object10.dart';
part 'model/inline_object11.dart';
part 'model/inline_object12.dart';
part 'model/inline_object13.dart';
part 'model/inline_object14.dart';
part 'model/inline_object15.dart';
part 'model/inline_object16.dart';
part 'model/inline_object17.dart';
part 'model/inline_object18.dart';
part 'model/inline_object19.dart';
part 'model/inline_object2.dart';
part 'model/inline_object20.dart';
part 'model/inline_object21.dart';
part 'model/inline_object22.dart';
part 'model/inline_object23.dart';
part 'model/inline_object24.dart';
part 'model/inline_object3.dart';
part 'model/inline_object4.dart';
part 'model/inline_object5.dart';
part 'model/inline_object6.dart';
part 'model/inline_object7.dart';
part 'model/inline_object8.dart';
part 'model/inline_object9.dart';
part 'model/inline_response200.dart';
part 'model/inline_response2001.dart';
part 'model/inline_response2002.dart';
part 'model/inline_response2003.dart';
part 'model/inline_response2004.dart';
part 'model/inline_response2005.dart';
part 'model/inline_response2005_vehicle_stats.dart';
part 'model/inline_response2006.dart';
part 'model/inline_response2007.dart';
part 'model/inline_response2008.dart';
part 'model/inline_response2009.dart';
part 'model/job_status.dart';
part 'model/job_update_object.dart';
part 'model/machine.dart';
part 'model/machine_history_response.dart';
part 'model/machine_history_response_machines.dart';
part 'model/machine_history_response_vibrations.dart';
part 'model/pagination.dart';
part 'model/prev_job_status.dart';
part 'model/safety_report_harsh_event.dart';
part 'model/sensor.dart';
part 'model/sensor_history_response.dart';
part 'model/sensor_history_response_results.dart';
part 'model/sensors_history_series.dart';
part 'model/tag.dart';
part 'model/tag_create.dart';
part 'model/tag_metadata.dart';
part 'model/tag_modify.dart';
part 'model/tag_modify_add.dart';
part 'model/tag_modify_delete.dart';
part 'model/tag_update.dart';
part 'model/tagged_address.dart';
part 'model/tagged_address_base.dart';
part 'model/tagged_asset.dart';
part 'model/tagged_asset_base.dart';
part 'model/tagged_driver.dart';
part 'model/tagged_driver_base.dart';
part 'model/tagged_machine.dart';
part 'model/tagged_machine_base.dart';
part 'model/tagged_sensor.dart';
part 'model/tagged_sensor_base.dart';
part 'model/tagged_vehicle.dart';
part 'model/tagged_vehicle_base.dart';
part 'model/temperature_response.dart';
part 'model/temperature_response_sensors.dart';
part 'model/trip_response.dart';
part 'model/trip_response_end_coordinates.dart';
part 'model/trip_response_start_coordinates.dart';
part 'model/trip_response_trips.dart';
part 'model/user.dart';
part 'model/user_base.dart';
part 'model/user_role.dart';
part 'model/user_tag_role.dart';
part 'model/user_tag_role_tag.dart';
part 'model/vehicle.dart';
part 'model/vehicle_harsh_event_response.dart';
part 'model/vehicle_harsh_event_response_location.dart';
part 'model/vehicle_location.dart';
part 'model/vehicle_maintenance.dart';
part 'model/vehicle_maintenance_j1939.dart';
part 'model/vehicle_maintenance_j1939_check_engine_light.dart';
part 'model/vehicle_maintenance_j1939_diagnostic_trouble_codes.dart';
part 'model/vehicle_maintenance_passenger.dart';
part 'model/vehicle_maintenance_passenger_check_engine_light.dart';
part 'model/vehicle_maintenance_passenger_diagnostic_trouble_codes.dart';
part 'model/vehicle_safety_score_response.dart';


ApiClient defaultApiClient = ApiClient();
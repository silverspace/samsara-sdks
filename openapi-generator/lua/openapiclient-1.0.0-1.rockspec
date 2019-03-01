package = "openapiclient"
version = "1.0.0-1"
source = {
	url = "https://github.com/GIT_USER_ID/GIT_REPO_ID.git"
}

description = {
	summary = "API client genreated by OpenAPI Generator",
	detailed = [[
# Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).]],
	homepage = "https://openapi-generator.tech",
	license = "Unlicense",
	maintainer = "OpenAPI Generator contributors",
}

dependencies = {
	"lua >= 5.2",
	"http",
	"dkjson",
	"basexx"
}

build = {
	type = "builtin",
	modules = {
		["openapiclient.api.assets_api"] = "openapiclient/api/assets_api.lua";
		["openapiclient.api.drivers_api"] = "openapiclient/api/drivers_api.lua";
		["openapiclient.api.fleet_api"] = "openapiclient/api/fleet_api.lua";
		["openapiclient.api.industrial_api"] = "openapiclient/api/industrial_api.lua";
		["openapiclient.api.routes_api"] = "openapiclient/api/routes_api.lua";
		["openapiclient.api.safety_api"] = "openapiclient/api/safety_api.lua";
		["openapiclient.api.sensors_api"] = "openapiclient/api/sensors_api.lua";
		["openapiclient.api.tags_api"] = "openapiclient/api/tags_api.lua";
		["openapiclient.api.users_api"] = "openapiclient/api/users_api.lua";
		["openapiclient.model._addresses_addresses"] = "openapiclient/model/_addresses_addresses.lua";
		["openapiclient.model._sensors_history_series"] = "openapiclient/model/_sensors_history_series.lua";
		["openapiclient.model.address"] = "openapiclient/model/address.lua";
		["openapiclient.model.address_geofence"] = "openapiclient/model/address_geofence.lua";
		["openapiclient.model.address_geofence_circle"] = "openapiclient/model/address_geofence_circle.lua";
		["openapiclient.model.address_geofence_polygon"] = "openapiclient/model/address_geofence_polygon.lua";
		["openapiclient.model.address_geofence_polygon_vertices"] = "openapiclient/model/address_geofence_polygon_vertices.lua";
		["openapiclient.model.all_route_job_updates"] = "openapiclient/model/all_route_job_updates.lua";
		["openapiclient.model.asset"] = "openapiclient/model/asset.lua";
		["openapiclient.model.asset_cable"] = "openapiclient/model/asset_cable.lua";
		["openapiclient.model.asset_current_location"] = "openapiclient/model/asset_current_location.lua";
		["openapiclient.model.asset_current_locations_response"] = "openapiclient/model/asset_current_locations_response.lua";
		["openapiclient.model.asset_reefer_response"] = "openapiclient/model/asset_reefer_response.lua";
		["openapiclient.model.asset_reefer_response_reefer_stats"] = "openapiclient/model/asset_reefer_response_reefer_stats.lua";
		["openapiclient.model.asset_reefer_response_reefer_stats_alarms"] = "openapiclient/model/asset_reefer_response_reefer_stats_alarms.lua";
		["openapiclient.model.asset_reefer_response_reefer_stats_alarms_1"] = "openapiclient/model/asset_reefer_response_reefer_stats_alarms_1.lua";
		["openapiclient.model.asset_reefer_response_reefer_stats_engine_hours"] = "openapiclient/model/asset_reefer_response_reefer_stats_engine_hours.lua";
		["openapiclient.model.asset_reefer_response_reefer_stats_fuel_percentage"] = "openapiclient/model/asset_reefer_response_reefer_stats_fuel_percentage.lua";
		["openapiclient.model.asset_reefer_response_reefer_stats_power_status"] = "openapiclient/model/asset_reefer_response_reefer_stats_power_status.lua";
		["openapiclient.model.asset_reefer_response_reefer_stats_return_air_temp"] = "openapiclient/model/asset_reefer_response_reefer_stats_return_air_temp.lua";
		["openapiclient.model.asset_reefer_response_reefer_stats_set_point"] = "openapiclient/model/asset_reefer_response_reefer_stats_set_point.lua";
		["openapiclient.model.aux_input"] = "openapiclient/model/aux_input.lua";
		["openapiclient.model.aux_input_series"] = "openapiclient/model/aux_input_series.lua";
		["openapiclient.model.cargo_response"] = "openapiclient/model/cargo_response.lua";
		["openapiclient.model.cargo_response_sensors"] = "openapiclient/model/cargo_response_sensors.lua";
		["openapiclient.model.contact"] = "openapiclient/model/contact.lua";
		["openapiclient.model.current_driver"] = "openapiclient/model/current_driver.lua";
		["openapiclient.model.data_input_history_response"] = "openapiclient/model/data_input_history_response.lua";
		["openapiclient.model.data_input_history_response_points"] = "openapiclient/model/data_input_history_response_points.lua";
		["openapiclient.model.dispatch_job"] = "openapiclient/model/dispatch_job.lua";
		["openapiclient.model.dispatch_job_create"] = "openapiclient/model/dispatch_job_create.lua";
		["openapiclient.model.dispatch_route"] = "openapiclient/model/dispatch_route.lua";
		["openapiclient.model.dispatch_route_base"] = "openapiclient/model/dispatch_route_base.lua";
		["openapiclient.model.dispatch_route_create"] = "openapiclient/model/dispatch_route_create.lua";
		["openapiclient.model.dispatch_route_historical_entry"] = "openapiclient/model/dispatch_route_historical_entry.lua";
		["openapiclient.model.dispatch_route_history"] = "openapiclient/model/dispatch_route_history.lua";
		["openapiclient.model.document"] = "openapiclient/model/document.lua";
		["openapiclient.model.document_base"] = "openapiclient/model/document_base.lua";
		["openapiclient.model.document_create"] = "openapiclient/model/document_create.lua";
		["openapiclient.model.document_field"] = "openapiclient/model/document_field.lua";
		["openapiclient.model.document_field_create"] = "openapiclient/model/document_field_create.lua";
		["openapiclient.model.document_field_create_photo_value"] = "openapiclient/model/document_field_create_photo_value.lua";
		["openapiclient.model.document_field_type"] = "openapiclient/model/document_field_type.lua";
		["openapiclient.model.document_field_type_number_value_type_metadata"] = "openapiclient/model/document_field_type_number_value_type_metadata.lua";
		["openapiclient.model.document_type"] = "openapiclient/model/document_type.lua";
		["openapiclient.model.door_response"] = "openapiclient/model/door_response.lua";
		["openapiclient.model.door_response_sensors"] = "openapiclient/model/door_response_sensors.lua";
		["openapiclient.model.driver"] = "openapiclient/model/driver.lua";
		["openapiclient.model.driver_base"] = "openapiclient/model/driver_base.lua";
		["openapiclient.model.driver_daily_log_response"] = "openapiclient/model/driver_daily_log_response.lua";
		["openapiclient.model.driver_daily_log_response_days"] = "openapiclient/model/driver_daily_log_response_days.lua";
		["openapiclient.model.driver_for_create"] = "openapiclient/model/driver_for_create.lua";
		["openapiclient.model.driver_safety_score_response"] = "openapiclient/model/driver_safety_score_response.lua";
		["openapiclient.model.drivers_response"] = "openapiclient/model/drivers_response.lua";
		["openapiclient.model.drivers_summary_response"] = "openapiclient/model/drivers_summary_response.lua";
		["openapiclient.model.drivers_summary_response_summaries"] = "openapiclient/model/drivers_summary_response_summaries.lua";
		["openapiclient.model.dvir_base"] = "openapiclient/model/dvir_base.lua";
		["openapiclient.model.dvir_base_author_signature"] = "openapiclient/model/dvir_base_author_signature.lua";
		["openapiclient.model.dvir_base_mechanic_or_agent_signature"] = "openapiclient/model/dvir_base_mechanic_or_agent_signature.lua";
		["openapiclient.model.dvir_base_next_driver_signature"] = "openapiclient/model/dvir_base_next_driver_signature.lua";
		["openapiclient.model.dvir_base_trailer_defects"] = "openapiclient/model/dvir_base_trailer_defects.lua";
		["openapiclient.model.dvir_base_vehicle"] = "openapiclient/model/dvir_base_vehicle.lua";
		["openapiclient.model.dvir_list_response"] = "openapiclient/model/dvir_list_response.lua";
		["openapiclient.model.engine_state"] = "openapiclient/model/engine_state.lua";
		["openapiclient.model.fleet_vehicle_location"] = "openapiclient/model/fleet_vehicle_location.lua";
		["openapiclient.model.fleet_vehicle_response"] = "openapiclient/model/fleet_vehicle_response.lua";
		["openapiclient.model.fleet_vehicle_response_vehicle_info"] = "openapiclient/model/fleet_vehicle_response_vehicle_info.lua";
		["openapiclient.model.hos_authentication_logs_response"] = "openapiclient/model/hos_authentication_logs_response.lua";
		["openapiclient.model.hos_authentication_logs_response_authentication_logs"] = "openapiclient/model/hos_authentication_logs_response_authentication_logs.lua";
		["openapiclient.model.hos_logs_response"] = "openapiclient/model/hos_logs_response.lua";
		["openapiclient.model.hos_logs_response_logs"] = "openapiclient/model/hos_logs_response_logs.lua";
		["openapiclient.model.hos_logs_summary_response"] = "openapiclient/model/hos_logs_summary_response.lua";
		["openapiclient.model.hos_logs_summary_response_drivers"] = "openapiclient/model/hos_logs_summary_response_drivers.lua";
		["openapiclient.model.humidity_response"] = "openapiclient/model/humidity_response.lua";
		["openapiclient.model.humidity_response_sensors"] = "openapiclient/model/humidity_response_sensors.lua";
		["openapiclient.model.inline_object"] = "openapiclient/model/inline_object.lua";
		["openapiclient.model.inline_object_1"] = "openapiclient/model/inline_object_1.lua";
		["openapiclient.model.inline_object_10"] = "openapiclient/model/inline_object_10.lua";
		["openapiclient.model.inline_object_11"] = "openapiclient/model/inline_object_11.lua";
		["openapiclient.model.inline_object_12"] = "openapiclient/model/inline_object_12.lua";
		["openapiclient.model.inline_object_13"] = "openapiclient/model/inline_object_13.lua";
		["openapiclient.model.inline_object_14"] = "openapiclient/model/inline_object_14.lua";
		["openapiclient.model.inline_object_15"] = "openapiclient/model/inline_object_15.lua";
		["openapiclient.model.inline_object_16"] = "openapiclient/model/inline_object_16.lua";
		["openapiclient.model.inline_object_17"] = "openapiclient/model/inline_object_17.lua";
		["openapiclient.model.inline_object_18"] = "openapiclient/model/inline_object_18.lua";
		["openapiclient.model.inline_object_19"] = "openapiclient/model/inline_object_19.lua";
		["openapiclient.model.inline_object_2"] = "openapiclient/model/inline_object_2.lua";
		["openapiclient.model.inline_object_20"] = "openapiclient/model/inline_object_20.lua";
		["openapiclient.model.inline_object_21"] = "openapiclient/model/inline_object_21.lua";
		["openapiclient.model.inline_object_22"] = "openapiclient/model/inline_object_22.lua";
		["openapiclient.model.inline_object_23"] = "openapiclient/model/inline_object_23.lua";
		["openapiclient.model.inline_object_24"] = "openapiclient/model/inline_object_24.lua";
		["openapiclient.model.inline_object_3"] = "openapiclient/model/inline_object_3.lua";
		["openapiclient.model.inline_object_4"] = "openapiclient/model/inline_object_4.lua";
		["openapiclient.model.inline_object_5"] = "openapiclient/model/inline_object_5.lua";
		["openapiclient.model.inline_object_6"] = "openapiclient/model/inline_object_6.lua";
		["openapiclient.model.inline_object_7"] = "openapiclient/model/inline_object_7.lua";
		["openapiclient.model.inline_object_8"] = "openapiclient/model/inline_object_8.lua";
		["openapiclient.model.inline_object_9"] = "openapiclient/model/inline_object_9.lua";
		["openapiclient.model.inline_response_200"] = "openapiclient/model/inline_response_200.lua";
		["openapiclient.model.inline_response_200_1"] = "openapiclient/model/inline_response_200_1.lua";
		["openapiclient.model.inline_response_200_2"] = "openapiclient/model/inline_response_200_2.lua";
		["openapiclient.model.inline_response_200_3"] = "openapiclient/model/inline_response_200_3.lua";
		["openapiclient.model.inline_response_200_4"] = "openapiclient/model/inline_response_200_4.lua";
		["openapiclient.model.inline_response_200_5"] = "openapiclient/model/inline_response_200_5.lua";
		["openapiclient.model.inline_response_200_5_vehicle_stats"] = "openapiclient/model/inline_response_200_5_vehicle_stats.lua";
		["openapiclient.model.inline_response_200_6"] = "openapiclient/model/inline_response_200_6.lua";
		["openapiclient.model.inline_response_200_7"] = "openapiclient/model/inline_response_200_7.lua";
		["openapiclient.model.inline_response_200_8"] = "openapiclient/model/inline_response_200_8.lua";
		["openapiclient.model.inline_response_200_9"] = "openapiclient/model/inline_response_200_9.lua";
		["openapiclient.model.job_status"] = "openapiclient/model/job_status.lua";
		["openapiclient.model.job_update_object"] = "openapiclient/model/job_update_object.lua";
		["openapiclient.model.machine"] = "openapiclient/model/machine.lua";
		["openapiclient.model.machine_history_response"] = "openapiclient/model/machine_history_response.lua";
		["openapiclient.model.machine_history_response_machines"] = "openapiclient/model/machine_history_response_machines.lua";
		["openapiclient.model.machine_history_response_vibrations"] = "openapiclient/model/machine_history_response_vibrations.lua";
		["openapiclient.model.pagination"] = "openapiclient/model/pagination.lua";
		["openapiclient.model.prev_job_status"] = "openapiclient/model/prev_job_status.lua";
		["openapiclient.model.safety_report_harsh_event"] = "openapiclient/model/safety_report_harsh_event.lua";
		["openapiclient.model.sensor"] = "openapiclient/model/sensor.lua";
		["openapiclient.model.sensor_history_response"] = "openapiclient/model/sensor_history_response.lua";
		["openapiclient.model.sensor_history_response_results"] = "openapiclient/model/sensor_history_response_results.lua";
		["openapiclient.model.tag"] = "openapiclient/model/tag.lua";
		["openapiclient.model.tag_create"] = "openapiclient/model/tag_create.lua";
		["openapiclient.model.tag_metadata"] = "openapiclient/model/tag_metadata.lua";
		["openapiclient.model.tag_modify"] = "openapiclient/model/tag_modify.lua";
		["openapiclient.model.tag_modify_add"] = "openapiclient/model/tag_modify_add.lua";
		["openapiclient.model.tag_modify_delete"] = "openapiclient/model/tag_modify_delete.lua";
		["openapiclient.model.tag_update"] = "openapiclient/model/tag_update.lua";
		["openapiclient.model.tagged_address"] = "openapiclient/model/tagged_address.lua";
		["openapiclient.model.tagged_address_base"] = "openapiclient/model/tagged_address_base.lua";
		["openapiclient.model.tagged_asset"] = "openapiclient/model/tagged_asset.lua";
		["openapiclient.model.tagged_asset_base"] = "openapiclient/model/tagged_asset_base.lua";
		["openapiclient.model.tagged_driver"] = "openapiclient/model/tagged_driver.lua";
		["openapiclient.model.tagged_driver_base"] = "openapiclient/model/tagged_driver_base.lua";
		["openapiclient.model.tagged_machine"] = "openapiclient/model/tagged_machine.lua";
		["openapiclient.model.tagged_machine_base"] = "openapiclient/model/tagged_machine_base.lua";
		["openapiclient.model.tagged_sensor"] = "openapiclient/model/tagged_sensor.lua";
		["openapiclient.model.tagged_sensor_base"] = "openapiclient/model/tagged_sensor_base.lua";
		["openapiclient.model.tagged_vehicle"] = "openapiclient/model/tagged_vehicle.lua";
		["openapiclient.model.tagged_vehicle_base"] = "openapiclient/model/tagged_vehicle_base.lua";
		["openapiclient.model.temperature_response"] = "openapiclient/model/temperature_response.lua";
		["openapiclient.model.temperature_response_sensors"] = "openapiclient/model/temperature_response_sensors.lua";
		["openapiclient.model.trip_response"] = "openapiclient/model/trip_response.lua";
		["openapiclient.model.trip_response_end_coordinates"] = "openapiclient/model/trip_response_end_coordinates.lua";
		["openapiclient.model.trip_response_start_coordinates"] = "openapiclient/model/trip_response_start_coordinates.lua";
		["openapiclient.model.trip_response_trips"] = "openapiclient/model/trip_response_trips.lua";
		["openapiclient.model.user"] = "openapiclient/model/user.lua";
		["openapiclient.model.user_base"] = "openapiclient/model/user_base.lua";
		["openapiclient.model.user_role"] = "openapiclient/model/user_role.lua";
		["openapiclient.model.user_tag_role"] = "openapiclient/model/user_tag_role.lua";
		["openapiclient.model.user_tag_role_tag"] = "openapiclient/model/user_tag_role_tag.lua";
		["openapiclient.model.vehicle"] = "openapiclient/model/vehicle.lua";
		["openapiclient.model.vehicle_harsh_event_response"] = "openapiclient/model/vehicle_harsh_event_response.lua";
		["openapiclient.model.vehicle_harsh_event_response_location"] = "openapiclient/model/vehicle_harsh_event_response_location.lua";
		["openapiclient.model.vehicle_location"] = "openapiclient/model/vehicle_location.lua";
		["openapiclient.model.vehicle_maintenance"] = "openapiclient/model/vehicle_maintenance.lua";
		["openapiclient.model.vehicle_maintenance_j1939"] = "openapiclient/model/vehicle_maintenance_j1939.lua";
		["openapiclient.model.vehicle_maintenance_j1939_check_engine_light"] = "openapiclient/model/vehicle_maintenance_j1939_check_engine_light.lua";
		["openapiclient.model.vehicle_maintenance_j1939_diagnostic_trouble_codes"] = "openapiclient/model/vehicle_maintenance_j1939_diagnostic_trouble_codes.lua";
		["openapiclient.model.vehicle_maintenance_passenger"] = "openapiclient/model/vehicle_maintenance_passenger.lua";
		["openapiclient.model.vehicle_maintenance_passenger_check_engine_light"] = "openapiclient/model/vehicle_maintenance_passenger_check_engine_light.lua";
		["openapiclient.model.vehicle_maintenance_passenger_diagnostic_trouble_codes"] = "openapiclient/model/vehicle_maintenance_passenger_diagnostic_trouble_codes.lua";
		["openapiclient.model.vehicle_safety_score_response"] = "openapiclient/model/vehicle_safety_score_response.lua";
	}
}

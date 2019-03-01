=begin
#Samsara API

## Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).

OpenAPI spec version: 1.0.0

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 4.0.0-SNAPSHOT

=end

# Common files
require 'openapi_client/api_client'
require 'openapi_client/api_error'
require 'openapi_client/version'
require 'openapi_client/configuration'

# Models
require 'openapi_client/models/address'
require 'openapi_client/models/address_geofence'
require 'openapi_client/models/address_geofence_circle'
require 'openapi_client/models/address_geofence_polygon'
require 'openapi_client/models/address_geofence_polygon_vertices'
require 'openapi_client/models/addresses_addresses'
require 'openapi_client/models/all_route_job_updates'
require 'openapi_client/models/asset'
require 'openapi_client/models/asset_cable'
require 'openapi_client/models/asset_current_location'
require 'openapi_client/models/asset_current_locations_response'
require 'openapi_client/models/asset_reefer_response'
require 'openapi_client/models/asset_reefer_response_reefer_stats'
require 'openapi_client/models/asset_reefer_response_reefer_stats_alarms'
require 'openapi_client/models/asset_reefer_response_reefer_stats_alarms1'
require 'openapi_client/models/asset_reefer_response_reefer_stats_engine_hours'
require 'openapi_client/models/asset_reefer_response_reefer_stats_fuel_percentage'
require 'openapi_client/models/asset_reefer_response_reefer_stats_power_status'
require 'openapi_client/models/asset_reefer_response_reefer_stats_return_air_temp'
require 'openapi_client/models/asset_reefer_response_reefer_stats_set_point'
require 'openapi_client/models/aux_input'
require 'openapi_client/models/aux_input_series'
require 'openapi_client/models/cargo_response'
require 'openapi_client/models/cargo_response_sensors'
require 'openapi_client/models/contact'
require 'openapi_client/models/current_driver'
require 'openapi_client/models/data_input_history_response'
require 'openapi_client/models/data_input_history_response_points'
require 'openapi_client/models/dispatch_job'
require 'openapi_client/models/dispatch_job_create'
require 'openapi_client/models/dispatch_route'
require 'openapi_client/models/dispatch_route_base'
require 'openapi_client/models/dispatch_route_create'
require 'openapi_client/models/dispatch_route_historical_entry'
require 'openapi_client/models/dispatch_route_history'
require 'openapi_client/models/document'
require 'openapi_client/models/document_base'
require 'openapi_client/models/document_create'
require 'openapi_client/models/document_field'
require 'openapi_client/models/document_field_create'
require 'openapi_client/models/document_field_create_photo_value'
require 'openapi_client/models/document_field_type'
require 'openapi_client/models/document_field_type_number_value_type_metadata'
require 'openapi_client/models/document_type'
require 'openapi_client/models/door_response'
require 'openapi_client/models/door_response_sensors'
require 'openapi_client/models/driver'
require 'openapi_client/models/driver_base'
require 'openapi_client/models/driver_daily_log_response'
require 'openapi_client/models/driver_daily_log_response_days'
require 'openapi_client/models/driver_for_create'
require 'openapi_client/models/driver_safety_score_response'
require 'openapi_client/models/drivers_response'
require 'openapi_client/models/drivers_summary_response'
require 'openapi_client/models/drivers_summary_response_summaries'
require 'openapi_client/models/dvir_base'
require 'openapi_client/models/dvir_base_author_signature'
require 'openapi_client/models/dvir_base_mechanic_or_agent_signature'
require 'openapi_client/models/dvir_base_next_driver_signature'
require 'openapi_client/models/dvir_base_trailer_defects'
require 'openapi_client/models/dvir_base_vehicle'
require 'openapi_client/models/dvir_list_response'
require 'openapi_client/models/engine_state'
require 'openapi_client/models/fleet_vehicle_location'
require 'openapi_client/models/fleet_vehicle_response'
require 'openapi_client/models/fleet_vehicle_response_vehicle_info'
require 'openapi_client/models/hos_authentication_logs_response'
require 'openapi_client/models/hos_authentication_logs_response_authentication_logs'
require 'openapi_client/models/hos_logs_response'
require 'openapi_client/models/hos_logs_response_logs'
require 'openapi_client/models/hos_logs_summary_response'
require 'openapi_client/models/hos_logs_summary_response_drivers'
require 'openapi_client/models/humidity_response'
require 'openapi_client/models/humidity_response_sensors'
require 'openapi_client/models/inline_object'
require 'openapi_client/models/inline_object1'
require 'openapi_client/models/inline_object10'
require 'openapi_client/models/inline_object11'
require 'openapi_client/models/inline_object12'
require 'openapi_client/models/inline_object13'
require 'openapi_client/models/inline_object14'
require 'openapi_client/models/inline_object15'
require 'openapi_client/models/inline_object16'
require 'openapi_client/models/inline_object17'
require 'openapi_client/models/inline_object18'
require 'openapi_client/models/inline_object19'
require 'openapi_client/models/inline_object2'
require 'openapi_client/models/inline_object20'
require 'openapi_client/models/inline_object21'
require 'openapi_client/models/inline_object22'
require 'openapi_client/models/inline_object23'
require 'openapi_client/models/inline_object24'
require 'openapi_client/models/inline_object3'
require 'openapi_client/models/inline_object4'
require 'openapi_client/models/inline_object5'
require 'openapi_client/models/inline_object6'
require 'openapi_client/models/inline_object7'
require 'openapi_client/models/inline_object8'
require 'openapi_client/models/inline_object9'
require 'openapi_client/models/inline_response200'
require 'openapi_client/models/inline_response2001'
require 'openapi_client/models/inline_response2002'
require 'openapi_client/models/inline_response2003'
require 'openapi_client/models/inline_response2004'
require 'openapi_client/models/inline_response2005'
require 'openapi_client/models/inline_response2005_vehicle_stats'
require 'openapi_client/models/inline_response2006'
require 'openapi_client/models/inline_response2007'
require 'openapi_client/models/inline_response2008'
require 'openapi_client/models/inline_response2009'
require 'openapi_client/models/job_status'
require 'openapi_client/models/job_update_object'
require 'openapi_client/models/machine'
require 'openapi_client/models/machine_history_response'
require 'openapi_client/models/machine_history_response_machines'
require 'openapi_client/models/machine_history_response_vibrations'
require 'openapi_client/models/pagination'
require 'openapi_client/models/prev_job_status'
require 'openapi_client/models/safety_report_harsh_event'
require 'openapi_client/models/sensor'
require 'openapi_client/models/sensor_history_response'
require 'openapi_client/models/sensor_history_response_results'
require 'openapi_client/models/sensors_history_series'
require 'openapi_client/models/tag'
require 'openapi_client/models/tag_create'
require 'openapi_client/models/tag_metadata'
require 'openapi_client/models/tag_modify'
require 'openapi_client/models/tag_modify_add'
require 'openapi_client/models/tag_modify_delete'
require 'openapi_client/models/tag_update'
require 'openapi_client/models/tagged_address'
require 'openapi_client/models/tagged_address_base'
require 'openapi_client/models/tagged_asset'
require 'openapi_client/models/tagged_asset_base'
require 'openapi_client/models/tagged_driver'
require 'openapi_client/models/tagged_driver_base'
require 'openapi_client/models/tagged_machine'
require 'openapi_client/models/tagged_machine_base'
require 'openapi_client/models/tagged_sensor'
require 'openapi_client/models/tagged_sensor_base'
require 'openapi_client/models/tagged_vehicle'
require 'openapi_client/models/tagged_vehicle_base'
require 'openapi_client/models/temperature_response'
require 'openapi_client/models/temperature_response_sensors'
require 'openapi_client/models/trip_response'
require 'openapi_client/models/trip_response_end_coordinates'
require 'openapi_client/models/trip_response_start_coordinates'
require 'openapi_client/models/trip_response_trips'
require 'openapi_client/models/user'
require 'openapi_client/models/user_base'
require 'openapi_client/models/user_role'
require 'openapi_client/models/user_tag_role'
require 'openapi_client/models/user_tag_role_tag'
require 'openapi_client/models/vehicle'
require 'openapi_client/models/vehicle_harsh_event_response'
require 'openapi_client/models/vehicle_harsh_event_response_location'
require 'openapi_client/models/vehicle_location'
require 'openapi_client/models/vehicle_maintenance'
require 'openapi_client/models/vehicle_maintenance_j1939'
require 'openapi_client/models/vehicle_maintenance_j1939_check_engine_light'
require 'openapi_client/models/vehicle_maintenance_j1939_diagnostic_trouble_codes'
require 'openapi_client/models/vehicle_maintenance_passenger'
require 'openapi_client/models/vehicle_maintenance_passenger_check_engine_light'
require 'openapi_client/models/vehicle_maintenance_passenger_diagnostic_trouble_codes'
require 'openapi_client/models/vehicle_safety_score_response'

# APIs
require 'openapi_client/api/assets_api'
require 'openapi_client/api/drivers_api'
require 'openapi_client/api/fleet_api'
require 'openapi_client/api/industrial_api'
require 'openapi_client/api/routes_api'
require 'openapi_client/api/safety_api'
require 'openapi_client/api/sensors_api'
require 'openapi_client/api/tags_api'
require 'openapi_client/api/users_api'

module OpenapiClient
  class << self
    # Customize default settings for the SDK using block.
    #   OpenapiClient.configure do |config|
    #     config.username = "xxx"
    #     config.password = "xxx"
    #   end
    # If no block given, return the default Configuration object.
    def configure
      if block_given?
        yield(Configuration.default)
      else
        Configuration.default
      end
    end
  end
end

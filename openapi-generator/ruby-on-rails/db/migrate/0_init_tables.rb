=begin
Samsara API

# Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).

OpenAPI spec version: 1.0.0
Generated by: https://github.com/openapitools/openapi-generator.git

=end

class InitTables < ActiveRecord::Migration
  def change
    create_table "address".pluralize.to_sym, id: false do |t|
      t.string :contacts
      t.string :formatted_address
      t.string :geofence
      t.integer :id
      t.string :name
      t.string :notes
      t.string :tags

      t.timestamps
    end

    create_table "address_geofence".pluralize.to_sym, id: false do |t|
      t.string :circle
      t.string :polygon

      t.timestamps
    end

    create_table "address_geofence_circle".pluralize.to_sym, id: false do |t|
      t.Float :latitude
      t.integer :radius_meters
      t.Float :longitude

      t.timestamps
    end

    create_table "address_geofence_polygon".pluralize.to_sym, id: false do |t|
      t.string :vertices

      t.timestamps
    end

    create_table "address_geofence_polygon_vertices".pluralize.to_sym, id: false do |t|
      t.Float :latitude
      t.Float :longitude

      t.timestamps
    end

    create_table "_addresses_addresses".pluralize.to_sym, id: false do |t|
      t.string :notes
      t.string :formatted_address
      t.string :geofence
      t.string :tag_ids
      t.string :name
      t.string :contact_ids

      t.timestamps
    end

    create_table "all_route_job_updates".pluralize.to_sym, id: false do |t|
      t.string :job_updates
      t.string :sequence_id

      t.timestamps
    end

    create_table "asset".pluralize.to_sym, id: false do |t|
      t.string :asset_serial_number
      t.string :cable
      t.integer :engine_hours
      t.integer :id
      t.string :name

      t.timestamps
    end

    create_table "asset_cable".pluralize.to_sym, id: false do |t|
      t.string :asset_type

      t.timestamps
    end

    create_table "asset_current_location".pluralize.to_sym, id: false do |t|
      t.Float :latitude
      t.string :location
      t.Float :longitude
      t.Float :speed_miles_per_hour
      t.integer :time_ms

      t.timestamps
    end

    create_table "asset_current_locations_response".pluralize.to_sym, id: false do |t|
      t.string :cable
      t.integer :engine_hours
      t.integer :id
      t.string :location
      t.string :name

      t.timestamps
    end

    create_table "asset_reefer_response".pluralize.to_sym, id: false do |t|
      t.string :asset_type
      t.integer :id
      t.string :name
      t.string :reefer_stats

      t.timestamps
    end

    create_table "asset_reefer_response_reefer_stats".pluralize.to_sym, id: false do |t|
      t.string :fuel_percentage
      t.string :power_status
      t.string :engine_hours
      t.string :set_point
      t.string :return_air_temp
      t.string :alarms

      t.timestamps
    end

    create_table "asset_reefer_response_reefer_stats_alarms".pluralize.to_sym, id: false do |t|
      t.integer :severity
      t.string :operator_action
      t.string :description
      t.integer :alarm_code

      t.timestamps
    end

    create_table "asset_reefer_response_reefer_stats_alarms_1".pluralize.to_sym, id: false do |t|
      t.string :alarms
      t.integer :changed_at_ms

      t.timestamps
    end

    create_table "asset_reefer_response_reefer_stats_engine_hours".pluralize.to_sym, id: false do |t|
      t.integer :engine_hours
      t.integer :changed_at_ms

      t.timestamps
    end

    create_table "asset_reefer_response_reefer_stats_fuel_percentage".pluralize.to_sym, id: false do |t|
      t.integer :fuel_percentage
      t.integer :changed_at_ms

      t.timestamps
    end

    create_table "asset_reefer_response_reefer_stats_power_status".pluralize.to_sym, id: false do |t|
      t.integer :changed_at_ms
      t.string :status

      t.timestamps
    end

    create_table "asset_reefer_response_reefer_stats_return_air_temp".pluralize.to_sym, id: false do |t|
      t.integer :temp_in_milli_c
      t.integer :changed_at_ms

      t.timestamps
    end

    create_table "asset_reefer_response_reefer_stats_set_point".pluralize.to_sym, id: false do |t|
      t.integer :temp_in_milli_c
      t.integer :changed_at_ms

      t.timestamps
    end

    create_table "aux_input".pluralize.to_sym, id: false do |t|
      t.Object :time_ms
      t.boolean :value

      t.timestamps
    end

    create_table "aux_input_series".pluralize.to_sym, id: false do |t|
      t.string :name
      t.string :values

      t.timestamps
    end

    create_table "cargo_response".pluralize.to_sym, id: false do |t|
      t.integer :group_id
      t.string :sensors

      t.timestamps
    end

    create_table "cargo_response_sensors".pluralize.to_sym, id: false do |t|
      t.boolean :cargo_empty
      t.string :name
      t.integer :id

      t.timestamps
    end

    create_table "contact".pluralize.to_sym, id: false do |t|
      t.string :email
      t.string :first_name
      t.integer :id
      t.string :last_name
      t.string :phone

      t.timestamps
    end

    create_table "current_driver".pluralize.to_sym, id: false do |t|

      t.timestamps
    end

    create_table "data_input_history_response".pluralize.to_sym, id: false do |t|
      t.integer :id
      t.string :name
      t.string :points

      t.timestamps
    end

    create_table "data_input_history_response_points".pluralize.to_sym, id: false do |t|
      t.Float :value
      t.integer :time_ms

      t.timestamps
    end

    create_table "dispatch_job".pluralize.to_sym, id: false do |t|
      t.string :destination_address
      t.integer :destination_address_id
      t.Float :destination_lat
      t.Float :destination_lng
      t.string :destination_name
      t.string :notes
      t.integer :scheduled_arrival_time_ms
      t.integer :scheduled_departure_time_ms
      t.integer :arrived_at_ms
      t.integer :completed_at_ms
      t.integer :dispatch_route_id
      t.integer :driver_id
      t.integer :en_route_at_ms
      t.integer :estimated_arrival_ms
      t.string :fleet_viewer_url
      t.integer :group_id
      t.integer :id
      t.string :job_state
      t.integer :skipped_at_ms
      t.integer :vehicle_id

      t.timestamps
    end

    create_table "dispatch_job_create".pluralize.to_sym, id: false do |t|
      t.string :destination_address
      t.integer :destination_address_id
      t.Float :destination_lat
      t.Float :destination_lng
      t.string :destination_name
      t.string :notes
      t.integer :scheduled_arrival_time_ms
      t.integer :scheduled_departure_time_ms

      t.timestamps
    end

    create_table "dispatch_route".pluralize.to_sym, id: false do |t|
      t.integer :actual_end_ms
      t.integer :actual_start_ms
      t.integer :driver_id
      t.integer :group_id
      t.string :name
      t.integer :scheduled_end_ms
      t.integer :scheduled_meters
      t.integer :scheduled_start_ms
      t.string :start_location_address
      t.integer :start_location_address_id
      t.Float :start_location_lat
      t.Float :start_location_lng
      t.string :start_location_name
      t.integer :trailer_id
      t.integer :vehicle_id
      t.string :dispatch_jobs
      t.integer :id

      t.timestamps
    end

    create_table "dispatch_route_base".pluralize.to_sym, id: false do |t|
      t.integer :actual_end_ms
      t.integer :actual_start_ms
      t.integer :driver_id
      t.integer :group_id
      t.string :name
      t.integer :scheduled_end_ms
      t.integer :scheduled_meters
      t.integer :scheduled_start_ms
      t.string :start_location_address
      t.integer :start_location_address_id
      t.Float :start_location_lat
      t.Float :start_location_lng
      t.string :start_location_name
      t.integer :trailer_id
      t.integer :vehicle_id

      t.timestamps
    end

    create_table "dispatch_route_create".pluralize.to_sym, id: false do |t|
      t.integer :actual_end_ms
      t.integer :actual_start_ms
      t.integer :driver_id
      t.integer :group_id
      t.string :name
      t.integer :scheduled_end_ms
      t.integer :scheduled_meters
      t.integer :scheduled_start_ms
      t.string :start_location_address
      t.integer :start_location_address_id
      t.Float :start_location_lat
      t.Float :start_location_lng
      t.string :start_location_name
      t.integer :trailer_id
      t.integer :vehicle_id
      t.string :dispatch_jobs

      t.timestamps
    end

    create_table "dispatch_route_historical_entry".pluralize.to_sym, id: false do |t|
      t.integer :changed_at_ms
      t.string :route

      t.timestamps
    end

    create_table "dispatch_route_history".pluralize.to_sym, id: false do |t|
      t.string :history

      t.timestamps
    end

    create_table "document".pluralize.to_sym, id: false do |t|
      t.integer :dispatch_job_id
      t.string :notes
      t.string :document_type
      t.integer :driver_created_at_ms
      t.integer :driver_id
      t.string :fields
      t.integer :vehicle_id

      t.timestamps
    end

    create_table "document_base".pluralize.to_sym, id: false do |t|
      t.integer :dispatch_job_id
      t.string :notes

      t.timestamps
    end

    create_table "document_create".pluralize.to_sym, id: false do |t|
      t.integer :dispatch_job_id
      t.string :notes
      t.string :document_type_uuid
      t.string :fields

      t.timestamps
    end

    create_table "document_field".pluralize.to_sym, id: false do |t|
      t.Float :number_value
      t.string :photo_value
      t.string :string_value
      t.string :value_type
      t.string :label
      t.Object :value

      t.timestamps
    end

    create_table "document_field_create".pluralize.to_sym, id: false do |t|
      t.Float :number_value
      t.string :photo_value
      t.string :string_value
      t.string :value_type

      t.timestamps
    end

    create_table "document_field_create_photo_value".pluralize.to_sym, id: false do |t|
      t.string :url

      t.timestamps
    end

    create_table "document_field_type".pluralize.to_sym, id: false do |t|
      t.string :label
      t.string :number_value_type_metadata
      t.string :value_type

      t.timestamps
    end

    create_table "document_field_type_number_value_type_metadata".pluralize.to_sym, id: false do |t|
      t.integer :num_decimal_places

      t.timestamps
    end

    create_table "document_type".pluralize.to_sym, id: false do |t|
      t.string :field_types
      t.string :name
      t.integer :org_id
      t.string :uuid

      t.timestamps
    end

    create_table "door_response".pluralize.to_sym, id: false do |t|
      t.integer :group_id
      t.string :sensors

      t.timestamps
    end

    create_table "door_response_sensors".pluralize.to_sym, id: false do |t|
      t.boolean :door_closed
      t.string :name
      t.integer :id

      t.timestamps
    end

    create_table "driver".pluralize.to_sym, id: false do |t|
      t.boolean :eld_adverse_weather_exemption_enabled
      t.boolean :eld_big_day_exemption_enabled
      t.integer :eld_day_start_hour
      t.boolean :eld_exempt
      t.string :eld_exempt_reason
      t.boolean :eld_pc_enabled
      t.boolean :eld_ym_enabled
      t.string :external_ids
      t.integer :group_id
      t.string :license_number
      t.string :license_state
      t.string :name
      t.string :notes
      t.string :phone
      t.string :username
      t.integer :vehicle_id
      t.integer :id
      t.boolean :is_deactivated
      t.string :tags

      t.timestamps
    end

    create_table "driver_base".pluralize.to_sym, id: false do |t|
      t.boolean :eld_adverse_weather_exemption_enabled
      t.boolean :eld_big_day_exemption_enabled
      t.integer :eld_day_start_hour
      t.boolean :eld_exempt
      t.string :eld_exempt_reason
      t.boolean :eld_pc_enabled
      t.boolean :eld_ym_enabled
      t.string :external_ids
      t.integer :group_id
      t.string :license_number
      t.string :license_state
      t.string :name
      t.string :notes
      t.string :phone
      t.string :username
      t.integer :vehicle_id

      t.timestamps
    end

    create_table "driver_daily_log_response".pluralize.to_sym, id: false do |t|
      t.string :days

      t.timestamps
    end

    create_table "driver_daily_log_response_days".pluralize.to_sym, id: false do |t|
      t.integer :certified_at_ms
      t.integer :end_ms
      t.integer :start_ms
      t.Object :trailer_ids
      t.Float :active_hours
      t.Float :distance_miles
      t.integer :active_ms
      t.boolean :certified
      t.Object :vehicle_ids

      t.timestamps
    end

    create_table "driver_for_create".pluralize.to_sym, id: false do |t|
      t.boolean :eld_adverse_weather_exemption_enabled
      t.boolean :eld_big_day_exemption_enabled
      t.integer :eld_day_start_hour
      t.boolean :eld_exempt
      t.string :eld_exempt_reason
      t.boolean :eld_pc_enabled
      t.boolean :eld_ym_enabled
      t.string :external_ids
      t.integer :group_id
      t.string :license_number
      t.string :license_state
      t.string :name
      t.string :notes
      t.string :phone
      t.string :username
      t.integer :vehicle_id
      t.string :password
      t.string :tag_ids

      t.timestamps
    end

    create_table "driver_safety_score_response".pluralize.to_sym, id: false do |t|
      t.integer :crash_count
      t.integer :driver_id
      t.integer :harsh_accel_count
      t.integer :harsh_braking_count
      t.string :harsh_events
      t.integer :harsh_turning_count
      t.integer :safety_score
      t.string :safety_score_rank
      t.integer :time_over_speed_limit_ms
      t.integer :total_distance_driven_meters
      t.integer :total_harsh_event_count
      t.integer :total_time_driven_ms

      t.timestamps
    end

    create_table "drivers_response".pluralize.to_sym, id: false do |t|
      t.string :drivers

      t.timestamps
    end

    create_table "drivers_summary_response".pluralize.to_sym, id: false do |t|
      t.string :summaries

      t.timestamps
    end

    create_table "drivers_summary_response_summaries".pluralize.to_sym, id: false do |t|
      t.integer :driver_id
      t.Float :distance_miles
      t.integer :drive_ms
      t.integer :active_ms
      t.string :driver_username
      t.integer :group_id
      t.string :driver_name
      t.integer :on_duty_ms

      t.timestamps
    end

    create_table "dvir_base".pluralize.to_sym, id: false do |t|
      t.string :author_signature
      t.boolean :defects_corrected
      t.boolean :defects_need_not_be_corrected
      t.integer :id
      t.string :inspection_type
      t.string :mechanic_notes
      t.string :mechanic_or_agent_signature
      t.string :next_driver_signature
      t.integer :odometer_miles
      t.integer :time_ms
      t.string :trailer_defects
      t.integer :trailer_id
      t.string :trailer_name
      t.string :vehicle
      t.string :vehicle_condition
      t.string :vehicle_defects

      t.timestamps
    end

    create_table "dvir_base_author_signature".pluralize.to_sym, id: false do |t|
      t.integer :mechanic_user_id
      t.integer :driver_id
      t.string :name
      t.integer :signed_at
      t.string :type
      t.string :email
      t.string :username

      t.timestamps
    end

    create_table "dvir_base_mechanic_or_agent_signature".pluralize.to_sym, id: false do |t|
      t.integer :mechanic_user_id
      t.integer :driver_id
      t.string :name
      t.integer :signed_at
      t.string :type
      t.string :email
      t.string :username

      t.timestamps
    end

    create_table "dvir_base_next_driver_signature".pluralize.to_sym, id: false do |t|
      t.integer :driver_id
      t.string :name
      t.integer :signed_at
      t.string :type
      t.string :email
      t.string :username

      t.timestamps
    end

    create_table "dvir_base_trailer_defects".pluralize.to_sym, id: false do |t|
      t.string :comment
      t.string :defect_type

      t.timestamps
    end

    create_table "dvir_base_vehicle".pluralize.to_sym, id: false do |t|
      t.string :name
      t.integer :id

      t.timestamps
    end

    create_table "dvir_list_response".pluralize.to_sym, id: false do |t|
      t.string :dvirs

      t.timestamps
    end

    create_table "engine_state".pluralize.to_sym, id: false do |t|
      t.Object :time_ms
      t.string :value

      t.timestamps
    end

    create_table "fleet_vehicle_location".pluralize.to_sym, id: false do |t|
      t.Float :latitude
      t.string :location
      t.Float :longitude
      t.Float :speed_miles_per_hour
      t.integer :time_ms

      t.timestamps
    end

    create_table "fleet_vehicle_response".pluralize.to_sym, id: false do |t|
      t.string :external_ids
      t.string :harsh_accel_setting
      t.integer :id
      t.string :name
      t.string :vehicle_info

      t.timestamps
    end

    create_table "fleet_vehicle_response_vehicle_info".pluralize.to_sym, id: false do |t|
      t.integer :year
      t.string :model
      t.string :vin
      t.string :make

      t.timestamps
    end

    create_table "hos_authentication_logs_response".pluralize.to_sym, id: false do |t|
      t.string :authentication_logs

      t.timestamps
    end

    create_table "hos_authentication_logs_response_authentication_logs".pluralize.to_sym, id: false do |t|
      t.string :action_type
      t.string :address
      t.string :city
      t.integer :happened_at_ms
      t.string :address_name
      t.string :state

      t.timestamps
    end

    create_table "hos_logs_response".pluralize.to_sym, id: false do |t|
      t.string :logs

      t.timestamps
    end

    create_table "hos_logs_response_logs".pluralize.to_sym, id: false do |t|
      t.Float :loc_lng
      t.integer :log_start_ms
      t.integer :driver_id
      t.string :status_type
      t.string :loc_city
      t.integer :group_id
      t.string :loc_name
      t.Float :loc_lat
      t.string :remark
      t.string :loc_state
      t.integer :vehicle_id
      t.string :codriver_ids

      t.timestamps
    end

    create_table "hos_logs_summary_response".pluralize.to_sym, id: false do |t|
      t.string :drivers

      t.timestamps
    end

    create_table "hos_logs_summary_response_drivers".pluralize.to_sym, id: false do |t|
      t.integer :time_until_break
      t.string :vehicle_name
      t.integer :driving_in_violation_today
      t.integer :driver_id
      t.integer :cycle_remaining
      t.string :driver_name
      t.string :duty_status
      t.integer :cycle_tomorrow
      t.integer :shift_drive_remaining
      t.integer :time_in_current_status
      t.integer :driving_in_violation_cycle
      t.integer :shift_remaining

      t.timestamps
    end

    create_table "humidity_response".pluralize.to_sym, id: false do |t|
      t.integer :group_id
      t.string :sensors

      t.timestamps
    end

    create_table "humidity_response_sensors".pluralize.to_sym, id: false do |t|
      t.string :name
      t.integer :humidity
      t.integer :id

      t.timestamps
    end

    create_table "inline_object".pluralize.to_sym, id: false do |t|
      t.string :addresses

      t.timestamps
    end

    create_table "inline_object_1".pluralize.to_sym, id: false do |t|
      t.string :contact_ids
      t.string :formatted_address
      t.string :geofence
      t.string :name
      t.string :notes
      t.string :tag_ids

      t.timestamps
    end

    create_table "inline_object_10".pluralize.to_sym, id: false do |t|
      t.integer :group_id

      t.timestamps
    end

    create_table "inline_object_11".pluralize.to_sym, id: false do |t|
      t.integer :group_id

      t.timestamps
    end

    create_table "inline_object_12".pluralize.to_sym, id: false do |t|
      t.string :inspection_type
      t.string :mechanic_notes
      t.integer :odometer_miles
      t.boolean :previous_defects_corrected
      t.boolean :previous_defects_ignored
      t.string :safe
      t.integer :trailer_id
      t.string :user_email
      t.integer :vehicle_id

      t.timestamps
    end

    create_table "inline_object_13".pluralize.to_sym, id: false do |t|
      t.integer :group_id

      t.timestamps
    end

    create_table "inline_object_14".pluralize.to_sym, id: false do |t|
      t.integer :group_id
      t.string :vehicles

      t.timestamps
    end

    create_table "inline_object_15".pluralize.to_sym, id: false do |t|
      t.integer :end_ms
      t.integer :group_id
      t.integer :start_ms
      t.integer :vehicle_id

      t.timestamps
    end

    create_table "inline_object_16".pluralize.to_sym, id: false do |t|
      t.string :external_ids
      t.integer :harsh_accel_setting
      t.string :name

      t.timestamps
    end

    create_table "inline_object_17".pluralize.to_sym, id: false do |t|
      t.integer :end_ms
      t.integer :group_id
      t.integer :start_ms

      t.timestamps
    end

    create_table "inline_object_18".pluralize.to_sym, id: false do |t|
      t.integer :group_id

      t.timestamps
    end

    create_table "inline_object_19".pluralize.to_sym, id: false do |t|
      t.integer :group_id
      t.string :sensors

      t.timestamps
    end

    create_table "inline_object_2".pluralize.to_sym, id: false do |t|
      t.string :address
      t.integer :group_id
      t.string :name
      t.integer :radius

      t.timestamps
    end

    create_table "inline_object_20".pluralize.to_sym, id: false do |t|
      t.integer :group_id
      t.string :sensors

      t.timestamps
    end

    create_table "inline_object_21".pluralize.to_sym, id: false do |t|
      t.integer :end_ms
      t.string :fill_missing
      t.integer :group_id
      t.string :series
      t.integer :start_ms
      t.integer :step_ms

      t.timestamps
    end

    create_table "inline_object_22".pluralize.to_sym, id: false do |t|
      t.integer :group_id
      t.string :sensors

      t.timestamps
    end

    create_table "inline_object_23".pluralize.to_sym, id: false do |t|
      t.integer :group_id

      t.timestamps
    end

    create_table "inline_object_24".pluralize.to_sym, id: false do |t|
      t.integer :group_id
      t.string :sensors

      t.timestamps
    end

    create_table "inline_object_3".pluralize.to_sym, id: false do |t|
      t.integer :group_id

      t.timestamps
    end

    create_table "inline_object_4".pluralize.to_sym, id: false do |t|
      t.boolean :reactivate

      t.timestamps
    end

    create_table "inline_object_5".pluralize.to_sym, id: false do |t|
      t.integer :end_ms
      t.integer :org_id
      t.integer :start_ms

      t.timestamps
    end

    create_table "inline_object_6".pluralize.to_sym, id: false do |t|
      t.integer :driver_id
      t.integer :end_ms
      t.integer :group_id
      t.integer :start_ms

      t.timestamps
    end

    create_table "inline_object_7".pluralize.to_sym, id: false do |t|
      t.integer :driver_id
      t.integer :end_ms
      t.integer :group_id
      t.integer :start_ms

      t.timestamps
    end

    create_table "inline_object_8".pluralize.to_sym, id: false do |t|
      t.integer :driver_id
      t.integer :end_ms
      t.integer :group_id
      t.integer :start_ms

      t.timestamps
    end

    create_table "inline_object_9".pluralize.to_sym, id: false do |t|
      t.integer :group_id

      t.timestamps
    end

    create_table "inline_response_200".pluralize.to_sym, id: false do |t|
      t.string :assets

      t.timestamps
    end

    create_table "inline_response_200_1".pluralize.to_sym, id: false do |t|
      t.string :assets

      t.timestamps
    end

    create_table "inline_response_200_2".pluralize.to_sym, id: false do |t|
      t.string :pagination
      t.integer :group_id
      t.string :vehicles

      t.timestamps
    end

    create_table "inline_response_200_3".pluralize.to_sym, id: false do |t|
      t.integer :group_id
      t.string :vehicles

      t.timestamps
    end

    create_table "inline_response_200_4".pluralize.to_sym, id: false do |t|
      t.string :vehicles

      t.timestamps
    end

    create_table "inline_response_200_5".pluralize.to_sym, id: false do |t|
      t.string :pagination
      t.string :vehicle_stats

      t.timestamps
    end

    create_table "inline_response_200_5_vehicle_stats".pluralize.to_sym, id: false do |t|
      t.string :engine_state
      t.string :aux_input2
      t.integer :vehicle_id
      t.string :aux_input1

      t.timestamps
    end

    create_table "inline_response_200_6".pluralize.to_sym, id: false do |t|
      t.string :data_inputs

      t.timestamps
    end

    create_table "inline_response_200_7".pluralize.to_sym, id: false do |t|
      t.string :machines

      t.timestamps
    end

    create_table "inline_response_200_8".pluralize.to_sym, id: false do |t|
      t.string :sensors

      t.timestamps
    end

    create_table "inline_response_200_9".pluralize.to_sym, id: false do |t|
      t.string :tags

      t.timestamps
    end

    create_table "job_status".pluralize.to_sym, id: false do |t|

      t.timestamps
    end

    create_table "job_update_object".pluralize.to_sym, id: false do |t|
      t.integer :changed_at_ms
      t.integer :job_id
      t.string :job_state
      t.string :prev_job_state
      t.string :route
      t.integer :route_id

      t.timestamps
    end

    create_table "machine".pluralize.to_sym, id: false do |t|
      t.integer :id
      t.string :name
      t.string :notes

      t.timestamps
    end

    create_table "machine_history_response".pluralize.to_sym, id: false do |t|
      t.string :machines

      t.timestamps
    end

    create_table "machine_history_response_machines".pluralize.to_sym, id: false do |t|
      t.string :name
      t.integer :id
      t.string :vibrations

      t.timestamps
    end

    create_table "machine_history_response_vibrations".pluralize.to_sym, id: false do |t|
      t.Float :x
      t.Float :y
      t.Float :z
      t.integer :time

      t.timestamps
    end

    create_table "pagination".pluralize.to_sym, id: false do |t|
      t.string :end_cursor
      t.boolean :has_next_page
      t.boolean :has_prev_page
      t.string :start_cursor

      t.timestamps
    end

    create_table "prev_job_status".pluralize.to_sym, id: false do |t|

      t.timestamps
    end

    create_table "safety_report_harsh_event".pluralize.to_sym, id: false do |t|
      t.string :harsh_event_type
      t.integer :timestamp_ms
      t.integer :vehicle_id

      t.timestamps
    end

    create_table "sensor".pluralize.to_sym, id: false do |t|
      t.integer :id
      t.string :mac_address
      t.string :name

      t.timestamps
    end

    create_table "sensor_history_response".pluralize.to_sym, id: false do |t|
      t.string :results

      t.timestamps
    end

    create_table "sensor_history_response_results".pluralize.to_sym, id: false do |t|
      t.string :series
      t.integer :time_ms

      t.timestamps
    end

    create_table "_sensors_history_series".pluralize.to_sym, id: false do |t|
      t.string :field
      t.integer :widget_id

      t.timestamps
    end

    create_table "tag".pluralize.to_sym, id: false do |t|
      t.string :addresses
      t.string :assets
      t.string :drivers
      t.integer :group_id
      t.integer :id
      t.string :machines
      t.string :name
      t.integer :parent_tag_id
      t.string :sensors
      t.string :vehicles

      t.timestamps
    end

    create_table "tag_create".pluralize.to_sym, id: false do |t|
      t.string :assets
      t.string :drivers
      t.string :machines
      t.string :name
      t.integer :parent_tag_id
      t.string :sensors
      t.string :vehicles

      t.timestamps
    end

    create_table "tag_metadata".pluralize.to_sym, id: false do |t|
      t.integer :id
      t.string :name

      t.timestamps
    end

    create_table "tag_modify".pluralize.to_sym, id: false do |t|
      t.string :add
      t.string :delete
      t.string :name
      t.integer :parent_tag_id

      t.timestamps
    end

    create_table "tag_modify_add".pluralize.to_sym, id: false do |t|
      t.string :assets
      t.string :sensors
      t.string :vehicles
      t.string :machines
      t.string :drivers

      t.timestamps
    end

    create_table "tag_modify_delete".pluralize.to_sym, id: false do |t|
      t.string :assets
      t.string :sensors
      t.string :vehicles
      t.string :machines
      t.string :drivers

      t.timestamps
    end

    create_table "tag_update".pluralize.to_sym, id: false do |t|
      t.string :assets
      t.string :drivers
      t.string :machines
      t.string :name
      t.integer :parent_tag_id
      t.string :sensors
      t.string :vehicles

      t.timestamps
    end

    create_table "tagged_address".pluralize.to_sym, id: false do |t|
      t.integer :id
      t.string :name

      t.timestamps
    end

    create_table "tagged_address_base".pluralize.to_sym, id: false do |t|
      t.integer :id

      t.timestamps
    end

    create_table "tagged_asset".pluralize.to_sym, id: false do |t|
      t.integer :id
      t.string :name

      t.timestamps
    end

    create_table "tagged_asset_base".pluralize.to_sym, id: false do |t|
      t.integer :id

      t.timestamps
    end

    create_table "tagged_driver".pluralize.to_sym, id: false do |t|
      t.integer :id
      t.string :name

      t.timestamps
    end

    create_table "tagged_driver_base".pluralize.to_sym, id: false do |t|
      t.integer :id

      t.timestamps
    end

    create_table "tagged_machine".pluralize.to_sym, id: false do |t|
      t.integer :id
      t.string :name

      t.timestamps
    end

    create_table "tagged_machine_base".pluralize.to_sym, id: false do |t|
      t.integer :id

      t.timestamps
    end

    create_table "tagged_sensor".pluralize.to_sym, id: false do |t|
      t.integer :id
      t.string :name

      t.timestamps
    end

    create_table "tagged_sensor_base".pluralize.to_sym, id: false do |t|
      t.integer :id

      t.timestamps
    end

    create_table "tagged_vehicle".pluralize.to_sym, id: false do |t|
      t.integer :id
      t.string :name

      t.timestamps
    end

    create_table "tagged_vehicle_base".pluralize.to_sym, id: false do |t|
      t.integer :id

      t.timestamps
    end

    create_table "temperature_response".pluralize.to_sym, id: false do |t|
      t.integer :group_id
      t.string :sensors

      t.timestamps
    end

    create_table "temperature_response_sensors".pluralize.to_sym, id: false do |t|
      t.integer :probe_temperature
      t.string :name
      t.integer :id
      t.integer :ambient_temperature

      t.timestamps
    end

    create_table "trip_response".pluralize.to_sym, id: false do |t|
      t.string :trips

      t.timestamps
    end

    create_table "trip_response_end_coordinates".pluralize.to_sym, id: false do |t|
      t.Float :latitude
      t.Float :longitude

      t.timestamps
    end

    create_table "trip_response_start_coordinates".pluralize.to_sym, id: false do |t|
      t.Float :latitude
      t.Float :longitude

      t.timestamps
    end

    create_table "trip_response_trips".pluralize.to_sym, id: false do |t|
      t.integer :end_odometer
      t.integer :distance_meters
      t.integer :end_ms
      t.integer :start_ms
      t.integer :fuel_consumed_ml
      t.string :start_address
      t.string :start_coordinates
      t.string :end_coordinates
      t.integer :start_odometer
      t.integer :driver_id
      t.string :start_location
      t.integer :toll_meters
      t.string :end_address
      t.string :end_location

      t.timestamps
    end

    create_table "user".pluralize.to_sym, id: false do |t|
      t.string :auth_type
      t.string :email
      t.string :name
      t.string :organization_role_id
      t.integer :id
      t.string :organization_role
      t.string :tag_roles

      t.timestamps
    end

    create_table "user_base".pluralize.to_sym, id: false do |t|
      t.string :auth_type
      t.string :email
      t.string :name
      t.string :organization_role_id

      t.timestamps
    end

    create_table "user_role".pluralize.to_sym, id: false do |t|
      t.string :id
      t.string :name

      t.timestamps
    end

    create_table "user_tag_role".pluralize.to_sym, id: false do |t|
      t.string :role
      t.string :role_id
      t.string :tag

      t.timestamps
    end

    create_table "user_tag_role_tag".pluralize.to_sym, id: false do |t|
      t.integer :parent_tag_id
      t.string :name
      t.integer :id

      t.timestamps
    end

    create_table "vehicle".pluralize.to_sym, id: false do |t|
      t.integer :engine_hours
      t.Float :fuel_level_percent
      t.integer :id
      t.string :name
      t.string :note
      t.integer :odometer_meters
      t.string :vin

      t.timestamps
    end

    create_table "vehicle_harsh_event_response".pluralize.to_sym, id: false do |t|
      t.string :download_forward_video_url
      t.string :download_inward_video_url
      t.string :download_tracked_inward_video_url
      t.string :harsh_event_type
      t.string :incident_report_url
      t.boolean :is_distracted
      t.string :location

      t.timestamps
    end

    create_table "vehicle_harsh_event_response_location".pluralize.to_sym, id: false do |t|
      t.string :address
      t.string :latitude
      t.string :longitude

      t.timestamps
    end

    create_table "vehicle_location".pluralize.to_sym, id: false do |t|
      t.Float :heading
      t.integer :id
      t.Float :latitude
      t.string :location
      t.Float :longitude
      t.string :name
      t.integer :odometer_meters
      t.boolean :on_trip
      t.Float :speed
      t.integer :time
      t.string :vin

      t.timestamps
    end

    create_table "vehicle_maintenance".pluralize.to_sym, id: false do |t|
      t.integer :id
      t.string :j1939
      t.string :passenger

      t.timestamps
    end

    create_table "vehicle_maintenance_j1939".pluralize.to_sym, id: false do |t|
      t.string :check_engine_light
      t.string :diagnostic_trouble_codes

      t.timestamps
    end

    create_table "vehicle_maintenance_j1939_check_engine_light".pluralize.to_sym, id: false do |t|
      t.boolean :protect_is_on
      t.boolean :stop_is_on
      t.boolean :warning_is_on
      t.boolean :emissions_is_on

      t.timestamps
    end

    create_table "vehicle_maintenance_j1939_diagnostic_trouble_codes".pluralize.to_sym, id: false do |t|
      t.string :spn_description
      t.string :fmi_text
      t.integer :spn_id
      t.integer :occurrence_count
      t.integer :tx_id
      t.integer :fmi_id

      t.timestamps
    end

    create_table "vehicle_maintenance_passenger".pluralize.to_sym, id: false do |t|
      t.string :check_engine_light
      t.string :diagnostic_trouble_codes

      t.timestamps
    end

    create_table "vehicle_maintenance_passenger_check_engine_light".pluralize.to_sym, id: false do |t|
      t.boolean :is_on

      t.timestamps
    end

    create_table "vehicle_maintenance_passenger_diagnostic_trouble_codes".pluralize.to_sym, id: false do |t|
      t.string :dtc_short_code
      t.integer :dtc_id
      t.string :dtc_description

      t.timestamps
    end

    create_table "vehicle_safety_score_response".pluralize.to_sym, id: false do |t|
      t.integer :crash_count
      t.integer :harsh_accel_count
      t.integer :harsh_braking_count
      t.string :harsh_events
      t.integer :harsh_turning_count
      t.integer :safety_score
      t.string :safety_score_rank
      t.integer :time_over_speed_limit_ms
      t.integer :total_distance_driven_meters
      t.integer :total_harsh_event_count
      t.integer :total_time_driven_ms
      t.integer :vehicle_id

      t.timestamps
    end

  end
end

=begin
#Samsara API

## Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).

OpenAPI spec version: 1.0.0

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 4.0.0-SNAPSHOT

=end

require 'spec_helper'
require 'json'

# Unit tests for OpenapiClient::FleetApi
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe 'FleetApi' do
  before do
    # run before each test
    @api_instance = OpenapiClient::FleetApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of FleetApi' do
    it 'should create an instance of FleetApi' do
      expect(@api_instance).to be_instance_of(OpenapiClient::FleetApi)
    end
  end

  # unit tests for add_fleet_address
  # /fleet/add_address
  # This method adds an address book entry to the specified group.
  # @param access_token Samsara API access token.
  # @param address_param 
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'add_fleet_address test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for add_organization_addresses
  # /addresses
  # Add one or more addresses to the organization
  # @param access_token Samsara API access token.
  # @param addresses 
  # @param [Hash] opts the optional parameters
  # @return [Array<Address>]
  describe 'add_organization_addresses test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for create_dispatch_route
  # /fleet/dispatch/routes
  # Create a new dispatch route.
  # @param access_token Samsara API access token.
  # @param create_dispatch_route_params 
  # @param [Hash] opts the optional parameters
  # @return [DispatchRoute]
  describe 'create_dispatch_route test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for create_driver
  # /fleet/drivers/create
  # Create a new driver.
  # @param access_token Samsara API access token.
  # @param create_driver_param Driver creation body
  # @param [Hash] opts the optional parameters
  # @return [Driver]
  describe 'create_driver test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for create_driver_dispatch_route
  # /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
  # Create a new dispatch route for the driver with driver_id.
  # @param access_token Samsara API access token.
  # @param driver_id ID of the driver with the associated routes.
  # @param create_dispatch_route_params 
  # @param [Hash] opts the optional parameters
  # @return [DispatchRoute]
  describe 'create_driver_dispatch_route test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for create_driver_document
  # /fleet/drivers/{driver_id:[0-9]+}/documents
  # Create a driver document for the given driver.
  # @param access_token Samsara API access token.
  # @param driver_id ID of the driver for whom the document is created.
  # @param create_document_params To create a document for a given document type, the document type&#39;s uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field&#39;s valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_.
  # @param [Hash] opts the optional parameters
  # @return [Document]
  describe 'create_driver_document test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for create_dvir
  # /fleet/maintenance/dvirs
  # Create a new dvir, marking a vehicle or trailer safe or unsafe.
  # @param access_token Samsara API access token.
  # @param create_dvir_param 
  # @param [Hash] opts the optional parameters
  # @return [DvirBase]
  describe 'create_dvir test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for create_vehicle_dispatch_route
  # /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
  # Create a new dispatch route for the vehicle with vehicle_id.
  # @param access_token Samsara API access token.
  # @param vehicle_id ID of the vehicle with the associated routes.
  # @param create_dispatch_route_params 
  # @param [Hash] opts the optional parameters
  # @return [DispatchRoute]
  describe 'create_vehicle_dispatch_route test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for deactivate_driver
  # /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
  # Deactivate a driver with the given id.
  # @param access_token Samsara API access token.
  # @param driver_id_or_external_id ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'deactivate_driver test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for delete_dispatch_route_by_id
  # /fleet/dispatch/routes/{route_id:[0-9]+}/
  # Delete a dispatch route and its associated jobs.
  # @param access_token Samsara API access token.
  # @param route_id ID of the dispatch route.
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'delete_dispatch_route_by_id test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for delete_organization_address
  # /addresses/{addressId}
  # Delete an address.
  # @param access_token Samsara API access token.
  # @param address_id ID of the address/geofence
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'delete_organization_address test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for fetch_all_dispatch_routes
  # /fleet/dispatch/routes
  # Fetch all of the dispatch routes for the group.
  # @param access_token Samsara API access token.
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :group_id Optional group ID if the organization has multiple groups (uncommon).
  # @option opts [Integer] :end_time Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
  # @option opts [Integer] :duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
  # @return [Array<DispatchRoute>]
  describe 'fetch_all_dispatch_routes test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for fetch_all_route_job_updates
  # /fleet/dispatch/routes/job_updates
  # Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
  # @param access_token Samsara API access token.
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :group_id Optional group ID if the organization has multiple groups (uncommon).
  # @option opts [String] :sequence_id Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours.
  # @option opts [String] :include Optionally set include&#x3D;route to include route object in response payload.
  # @return [AllRouteJobUpdates]
  describe 'fetch_all_route_job_updates test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_all_asset_current_locations
  # /fleet/assets/locations
  # Fetch current locations of all assets for the group.
  # @param access_token Samsara API access token.
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :group_id Optional group ID if the organization has multiple groups (uncommon).
  # @return [InlineResponse2001]
  describe 'get_all_asset_current_locations test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_all_assets
  # /fleet/assets
  # Fetch all of the assets for the group.
  # @param access_token Samsara API access token.
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :group_id Optional group ID if the organization has multiple groups (uncommon).
  # @return [InlineResponse200]
  describe 'get_all_assets test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_all_deactivated_drivers
  # /fleet/drivers/inactive
  # Fetch all deactivated drivers for the group.
  # @param access_token Samsara API access token.
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :group_id Optional group ID if the organization has multiple groups (uncommon).
  # @return [Array<Driver>]
  describe 'get_all_deactivated_drivers test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_asset_location
  # /fleet/assets/{assetId:[0-9]+}/locations
  # Fetch the historical locations for the asset.
  # @param access_token Samsara API access token.
  # @param asset_id ID of the asset
  # @param start_ms Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
  # @param end_ms Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
  # @param [Hash] opts the optional parameters
  # @return [Array<Object>]
  describe 'get_asset_location test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_asset_reefer
  # /fleet/assets/{assetId:[0-9]+}/reefer
  # Fetch the reefer-specific stats of an asset.
  # @param access_token Samsara API access token.
  # @param asset_id ID of the asset
  # @param start_ms Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
  # @param end_ms Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
  # @param [Hash] opts the optional parameters
  # @return [AssetReeferResponse]
  describe 'get_asset_reefer test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_deactivated_driver_by_id
  # /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
  # Fetch deactivated driver by id.
  # @param access_token Samsara API access token.
  # @param driver_id_or_external_id ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
  # @param [Hash] opts the optional parameters
  # @return [Driver]
  describe 'get_deactivated_driver_by_id test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_dispatch_route_by_id
  # /fleet/dispatch/routes/{route_id:[0-9]+}
  # Fetch a dispatch route by id.
  # @param access_token Samsara API access token.
  # @param route_id ID of the dispatch route.
  # @param [Hash] opts the optional parameters
  # @return [DispatchRoute]
  describe 'get_dispatch_route_by_id test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_dispatch_route_history
  # /fleet/dispatch/routes/{route_id:[0-9]+}/history
  # Fetch the history of a dispatch route.
  # @param access_token Samsara API access token.
  # @param route_id ID of the route with history.
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :start_time Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0.
  # @option opts [Integer] :end_time Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs.
  # @return [DispatchRouteHistory]
  describe 'get_dispatch_route_history test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_dispatch_routes_by_driver_id
  # /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
  # Fetch all of the dispatch routes for a given driver.
  # @param access_token Samsara API access token.
  # @param driver_id ID of the driver with the associated routes.
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :end_time Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
  # @option opts [Integer] :duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
  # @return [Array<DispatchRoute>]
  describe 'get_dispatch_routes_by_driver_id test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_dispatch_routes_by_vehicle_id
  # /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
  # Fetch all of the dispatch routes for a given vehicle.
  # @param access_token Samsara API access token.
  # @param vehicle_id ID of the vehicle with the associated routes.
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :end_time Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
  # @option opts [Integer] :duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
  # @return [Array<DispatchRoute>]
  describe 'get_dispatch_routes_by_vehicle_id test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_driver_by_id
  # /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
  # Fetch driver by id.
  # @param access_token Samsara API access token.
  # @param driver_id_or_external_id ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
  # @param [Hash] opts the optional parameters
  # @return [Driver]
  describe 'get_driver_by_id test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_driver_document_types_by_org_id
  # /fleet/drivers/document_types
  # Fetch all of the document types.
  # @param [Hash] opts the optional parameters
  # @return [Array<DocumentType>]
  describe 'get_driver_document_types_by_org_id test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_driver_documents_by_org_id
  # /fleet/drivers/documents
  # Fetch all of the documents.
  # @param access_token Samsara API access token.
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :end_ms Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now.
  # @option opts [Integer] :duration_ms Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours.
  # @return [Array<Document>]
  describe 'get_driver_documents_by_org_id test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_driver_safety_score
  # /fleet/drivers/{driverId:[0-9]+}/safety/score
  # Fetch the safety score for the driver.
  # @param driver_id ID of the driver
  # @param access_token Samsara API access token.
  # @param start_ms Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
  # @param end_ms Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
  # @param [Hash] opts the optional parameters
  # @return [DriverSafetyScoreResponse]
  describe 'get_driver_safety_score test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_dvirs
  # /fleet/maintenance/dvirs
  # Get DVIRs for the org within provided time constraints
  # @param access_token Samsara API access token.
  # @param end_ms time in millis until the last dvir log.
  # @param duration_ms time in millis which corresponds to the duration before the end_ms.
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :group_id Group ID to query.
  # @return [DvirListResponse]
  describe 'get_dvirs test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_fleet_drivers
  # /fleet/drivers
  # Get all the drivers for the specified group.
  # @param access_token Samsara API access token.
  # @param group_drivers_param 
  # @param [Hash] opts the optional parameters
  # @return [DriversResponse]
  describe 'get_fleet_drivers test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_fleet_drivers_hos_daily_logs
  # /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
  # Get summarized daily HOS charts for a specified driver.
  # @param access_token Samsara API access token.
  # @param driver_id ID of the driver with HOS logs.
  # @param hos_logs_param 
  # @param [Hash] opts the optional parameters
  # @return [DriverDailyLogResponse]
  describe 'get_fleet_drivers_hos_daily_logs test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_fleet_drivers_summary
  # /fleet/drivers/summary
  # Get the distance and time each driver in an organization has driven in a given time period.
  # @param access_token Samsara API access token.
  # @param drivers_summary_param 
  # @param [Hash] opts the optional parameters
  # @option opts [BOOLEAN] :snap_to_day_bounds Snap query result to HOS day boundaries.
  # @return [DriversSummaryResponse]
  describe 'get_fleet_drivers_summary test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_fleet_hos_authentication_logs
  # /fleet/hos_authentication_logs
  # Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.
  # @param access_token Samsara API access token.
  # @param hos_authentication_logs_param 
  # @param [Hash] opts the optional parameters
  # @return [HosAuthenticationLogsResponse]
  describe 'get_fleet_hos_authentication_logs test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_fleet_hos_logs
  # /fleet/hos_logs
  # Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.
  # @param access_token Samsara API access token.
  # @param hos_logs_param 
  # @param [Hash] opts the optional parameters
  # @return [HosLogsResponse]
  describe 'get_fleet_hos_logs test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_fleet_hos_logs_summary
  # /fleet/hos_logs_summary
  # Get the current HOS status for all drivers in the group.
  # @param access_token Samsara API access token.
  # @param hos_logs_param 
  # @param [Hash] opts the optional parameters
  # @return [HosLogsSummaryResponse]
  describe 'get_fleet_hos_logs_summary test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_fleet_locations
  # /fleet/locations
  # Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.
  # @param access_token Samsara API access token.
  # @param group_param 
  # @param [Hash] opts the optional parameters
  # @return [InlineResponse2003]
  describe 'get_fleet_locations test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_fleet_maintenance_list
  # /fleet/maintenance/list
  # Get list of the vehicles with any engine faults or check light data.
  # @param access_token Samsara API access token.
  # @param group_param 
  # @param [Hash] opts the optional parameters
  # @return [InlineResponse2004]
  describe 'get_fleet_maintenance_list test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_fleet_trips
  # /fleet/trips
  # Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.
  # @param access_token Samsara API access token.
  # @param trips_param 
  # @param [Hash] opts the optional parameters
  # @return [TripResponse]
  describe 'get_fleet_trips test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_fleet_vehicle
  # /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
  # Gets a specific vehicle.
  # @param access_token Samsara API access token.
  # @param vehicle_id_or_external_id ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.
  # @param [Hash] opts the optional parameters
  # @return [FleetVehicleResponse]
  describe 'get_fleet_vehicle test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_organization_address
  # /addresses/{addressId}
  # Fetch an address by its id.
  # @param access_token Samsara API access token.
  # @param address_id ID of the address/geofence
  # @param [Hash] opts the optional parameters
  # @return [Address]
  describe 'get_organization_address test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_organization_addresses
  # /addresses
  # Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.
  # @param access_token Samsara API access token.
  # @param [Hash] opts the optional parameters
  # @return [Array<Address>]
  describe 'get_organization_addresses test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_organization_contact
  # /contacts/{contact_id}
  # Fetch a contact by its id.
  # @param access_token Samsara API access token.
  # @param contact_id ID of the contact
  # @param [Hash] opts the optional parameters
  # @return [Contact]
  describe 'get_organization_contact test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_vehicle_harsh_event
  # /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
  # Fetch harsh event details for a vehicle.
  # @param vehicle_id ID of the vehicle
  # @param access_token Samsara API access token.
  # @param timestamp Timestamp in milliseconds representing the timestamp of a harsh event.
  # @param [Hash] opts the optional parameters
  # @return [VehicleHarshEventResponse]
  describe 'get_vehicle_harsh_event test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_vehicle_locations
  # /fleet/vehicles/{vehicle_id:[0-9]+}/locations
  # Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.
  # @param access_token Samsara API access token.
  # @param vehicle_id ID of the vehicle with the associated routes.
  # @param start_ms Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour)
  # @param end_ms Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour)
  # @param [Hash] opts the optional parameters
  # @return [Array<FleetVehicleLocation>]
  describe 'get_vehicle_locations test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_vehicle_safety_score
  # /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
  # Fetch the safety score for the vehicle.
  # @param vehicle_id ID of the vehicle
  # @param access_token Samsara API access token.
  # @param start_ms Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
  # @param end_ms Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
  # @param [Hash] opts the optional parameters
  # @return [VehicleSafetyScoreResponse]
  describe 'get_vehicle_safety_score test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_vehicle_stats
  # /fleet/vehicles/stats
  # Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time.
  # @param access_token Samsara API access token.
  # @param start_ms Time in Unix epoch milliseconds for the start of the query.
  # @param end_ms Time in Unix epoch milliseconds for the end of the query.
  # @param [Hash] opts the optional parameters
  # @option opts [String] :series Comma-separated list of stat types. Options are engineState, auxInput1, and auxInput2. If this parameter is excluded, all 3 stat types will be returned. Example: series&#x3D;engineState,auxInput2
  # @option opts [String] :tag_ids Comma-separated list of tag ids. Example: tagIds&#x3D;1,2,3
  # @option opts [String] :starting_after Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter.
  # @option opts [String] :ending_before Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter.
  # @option opts [Integer] :limit Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;.
  # @return [InlineResponse2005]
  describe 'get_vehicle_stats test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_vehicles_locations
  # /fleet/vehicles/locations
  # Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.
  # @param access_token Samsara API access token.
  # @param start_ms Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes)
  # @param end_ms Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes)
  # @param [Hash] opts the optional parameters
  # @return [Array<Object>]
  describe 'get_vehicles_locations test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for list_contacts
  # /contacts
  # Fetch all contacts for the organization.
  # @param access_token Samsara API access token.
  # @param [Hash] opts the optional parameters
  # @return [Array<Contact>]
  describe 'list_contacts test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for list_fleet
  # /fleet/list
  # Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.
  # @param access_token Samsara API access token.
  # @param group_param 
  # @param [Hash] opts the optional parameters
  # @option opts [String] :starting_after Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter.
  # @option opts [String] :ending_before Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter.
  # @option opts [Integer] :limit Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;.
  # @return [InlineResponse2002]
  describe 'list_fleet test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for patch_fleet_vehicle
  # /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
  # Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.
  # @param access_token Samsara API access token.
  # @param vehicle_id_or_external_id ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.
  # @param data 
  # @param [Hash] opts the optional parameters
  # @return [FleetVehicleResponse]
  describe 'patch_fleet_vehicle test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for reactivate_driver_by_id
  # /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
  # Reactivate the inactive driver having id.
  # @param access_token Samsara API access token.
  # @param driver_id_or_external_id ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
  # @param reactivate_driver_param 
  # @param [Hash] opts the optional parameters
  # @return [Driver]
  describe 'reactivate_driver_by_id test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for update_dispatch_route_by_id
  # /fleet/dispatch/routes/{route_id:[0-9]+}/
  # Update a dispatch route and its associated jobs.
  # @param access_token Samsara API access token.
  # @param route_id ID of the dispatch route.
  # @param update_dispatch_route_params 
  # @param [Hash] opts the optional parameters
  # @return [DispatchRoute]
  describe 'update_dispatch_route_by_id test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for update_organization_address
  # /addresses/{addressId}
  # Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.
  # @param access_token Samsara API access token.
  # @param address_id ID of the address/geofence
  # @param address 
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'update_organization_address test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for update_vehicles
  # /fleet/set_data
  # This method enables the mutation of metadata for vehicles in the Samsara Cloud.
  # @param access_token Samsara API access token.
  # @param vehicle_update_param 
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'update_vehicles test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end

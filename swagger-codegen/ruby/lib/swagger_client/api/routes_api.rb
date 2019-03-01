=begin
#Samsara API

## Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).

OpenAPI spec version: 1.0.0

Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.3-SNAPSHOT

=end

require 'uri'

module SwaggerClient
  class RoutesApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # /fleet/dispatch/routes
    # Create a new dispatch route.
    # @param access_token Samsara API access token.
    # @param create_dispatch_route_params 
    # @param [Hash] opts the optional parameters
    # @return [DispatchRoute]
    def create_dispatch_route(access_token, create_dispatch_route_params, opts = {})
      data, _status_code, _headers = create_dispatch_route_with_http_info(access_token, create_dispatch_route_params, opts)
      data
    end

    # /fleet/dispatch/routes
    # Create a new dispatch route.
    # @param access_token Samsara API access token.
    # @param create_dispatch_route_params 
    # @param [Hash] opts the optional parameters
    # @return [Array<(DispatchRoute, Fixnum, Hash)>] DispatchRoute data, response status code and response headers
    def create_dispatch_route_with_http_info(access_token, create_dispatch_route_params, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: RoutesApi.create_dispatch_route ...'
      end
      # verify the required parameter 'access_token' is set
      if @api_client.config.client_side_validation && access_token.nil?
        fail ArgumentError, "Missing the required parameter 'access_token' when calling RoutesApi.create_dispatch_route"
      end
      # verify the required parameter 'create_dispatch_route_params' is set
      if @api_client.config.client_side_validation && create_dispatch_route_params.nil?
        fail ArgumentError, "Missing the required parameter 'create_dispatch_route_params' when calling RoutesApi.create_dispatch_route"
      end
      # resource path
      local_var_path = '/fleet/dispatch/routes'

      # query parameters
      query_params = {}
      query_params[:'access_token'] = access_token

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = @api_client.object_to_http_body(create_dispatch_route_params)
      auth_names = []
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'DispatchRoute')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: RoutesApi#create_dispatch_route\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
    # Create a new dispatch route for the driver with driver_id.
    # @param access_token Samsara API access token.
    # @param driver_id ID of the driver with the associated routes.
    # @param create_dispatch_route_params 
    # @param [Hash] opts the optional parameters
    # @return [DispatchRoute]
    def create_driver_dispatch_route(access_token, driver_id, create_dispatch_route_params, opts = {})
      data, _status_code, _headers = create_driver_dispatch_route_with_http_info(access_token, driver_id, create_dispatch_route_params, opts)
      data
    end

    # /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
    # Create a new dispatch route for the driver with driver_id.
    # @param access_token Samsara API access token.
    # @param driver_id ID of the driver with the associated routes.
    # @param create_dispatch_route_params 
    # @param [Hash] opts the optional parameters
    # @return [Array<(DispatchRoute, Fixnum, Hash)>] DispatchRoute data, response status code and response headers
    def create_driver_dispatch_route_with_http_info(access_token, driver_id, create_dispatch_route_params, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: RoutesApi.create_driver_dispatch_route ...'
      end
      # verify the required parameter 'access_token' is set
      if @api_client.config.client_side_validation && access_token.nil?
        fail ArgumentError, "Missing the required parameter 'access_token' when calling RoutesApi.create_driver_dispatch_route"
      end
      # verify the required parameter 'driver_id' is set
      if @api_client.config.client_side_validation && driver_id.nil?
        fail ArgumentError, "Missing the required parameter 'driver_id' when calling RoutesApi.create_driver_dispatch_route"
      end
      # verify the required parameter 'create_dispatch_route_params' is set
      if @api_client.config.client_side_validation && create_dispatch_route_params.nil?
        fail ArgumentError, "Missing the required parameter 'create_dispatch_route_params' when calling RoutesApi.create_driver_dispatch_route"
      end
      # resource path
      local_var_path = '/fleet/drivers/{driver_id}/dispatch/routes'.sub('{' + 'driver_id' + '}', driver_id.to_s)

      # query parameters
      query_params = {}
      query_params[:'access_token'] = access_token

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = @api_client.object_to_http_body(create_dispatch_route_params)
      auth_names = []
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'DispatchRoute')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: RoutesApi#create_driver_dispatch_route\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
    # Create a new dispatch route for the vehicle with vehicle_id.
    # @param access_token Samsara API access token.
    # @param vehicle_id ID of the vehicle with the associated routes.
    # @param create_dispatch_route_params 
    # @param [Hash] opts the optional parameters
    # @return [DispatchRoute]
    def create_vehicle_dispatch_route(access_token, vehicle_id, create_dispatch_route_params, opts = {})
      data, _status_code, _headers = create_vehicle_dispatch_route_with_http_info(access_token, vehicle_id, create_dispatch_route_params, opts)
      data
    end

    # /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
    # Create a new dispatch route for the vehicle with vehicle_id.
    # @param access_token Samsara API access token.
    # @param vehicle_id ID of the vehicle with the associated routes.
    # @param create_dispatch_route_params 
    # @param [Hash] opts the optional parameters
    # @return [Array<(DispatchRoute, Fixnum, Hash)>] DispatchRoute data, response status code and response headers
    def create_vehicle_dispatch_route_with_http_info(access_token, vehicle_id, create_dispatch_route_params, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: RoutesApi.create_vehicle_dispatch_route ...'
      end
      # verify the required parameter 'access_token' is set
      if @api_client.config.client_side_validation && access_token.nil?
        fail ArgumentError, "Missing the required parameter 'access_token' when calling RoutesApi.create_vehicle_dispatch_route"
      end
      # verify the required parameter 'vehicle_id' is set
      if @api_client.config.client_side_validation && vehicle_id.nil?
        fail ArgumentError, "Missing the required parameter 'vehicle_id' when calling RoutesApi.create_vehicle_dispatch_route"
      end
      # verify the required parameter 'create_dispatch_route_params' is set
      if @api_client.config.client_side_validation && create_dispatch_route_params.nil?
        fail ArgumentError, "Missing the required parameter 'create_dispatch_route_params' when calling RoutesApi.create_vehicle_dispatch_route"
      end
      # resource path
      local_var_path = '/fleet/vehicles/{vehicle_id}/dispatch/routes'.sub('{' + 'vehicle_id' + '}', vehicle_id.to_s)

      # query parameters
      query_params = {}
      query_params[:'access_token'] = access_token

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = @api_client.object_to_http_body(create_dispatch_route_params)
      auth_names = []
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'DispatchRoute')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: RoutesApi#create_vehicle_dispatch_route\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # /fleet/dispatch/routes/{route_id:[0-9]+}/
    # Delete a dispatch route and its associated jobs.
    # @param access_token Samsara API access token.
    # @param route_id ID of the dispatch route.
    # @param [Hash] opts the optional parameters
    # @return [nil]
    def delete_dispatch_route_by_id(access_token, route_id, opts = {})
      delete_dispatch_route_by_id_with_http_info(access_token, route_id, opts)
      nil
    end

    # /fleet/dispatch/routes/{route_id:[0-9]+}/
    # Delete a dispatch route and its associated jobs.
    # @param access_token Samsara API access token.
    # @param route_id ID of the dispatch route.
    # @param [Hash] opts the optional parameters
    # @return [Array<(nil, Fixnum, Hash)>] nil, response status code and response headers
    def delete_dispatch_route_by_id_with_http_info(access_token, route_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: RoutesApi.delete_dispatch_route_by_id ...'
      end
      # verify the required parameter 'access_token' is set
      if @api_client.config.client_side_validation && access_token.nil?
        fail ArgumentError, "Missing the required parameter 'access_token' when calling RoutesApi.delete_dispatch_route_by_id"
      end
      # verify the required parameter 'route_id' is set
      if @api_client.config.client_side_validation && route_id.nil?
        fail ArgumentError, "Missing the required parameter 'route_id' when calling RoutesApi.delete_dispatch_route_by_id"
      end
      # resource path
      local_var_path = '/fleet/dispatch/routes/{route_id}'.sub('{' + 'route_id' + '}', route_id.to_s)

      # query parameters
      query_params = {}
      query_params[:'access_token'] = access_token

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = nil
      auth_names = []
      data, status_code, headers = @api_client.call_api(:DELETE, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: RoutesApi#delete_dispatch_route_by_id\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # /fleet/dispatch/routes
    # Fetch all of the dispatch routes for the group.
    # @param access_token Samsara API access token.
    # @param [Hash] opts the optional parameters
    # @option opts [Integer] :group_id Optional group ID if the organization has multiple groups (uncommon).
    # @option opts [Integer] :end_time Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
    # @option opts [Integer] :duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
    # @return [DispatchRoutes]
    def fetch_all_dispatch_routes(access_token, opts = {})
      data, _status_code, _headers = fetch_all_dispatch_routes_with_http_info(access_token, opts)
      data
    end

    # /fleet/dispatch/routes
    # Fetch all of the dispatch routes for the group.
    # @param access_token Samsara API access token.
    # @param [Hash] opts the optional parameters
    # @option opts [Integer] :group_id Optional group ID if the organization has multiple groups (uncommon).
    # @option opts [Integer] :end_time Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
    # @option opts [Integer] :duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
    # @return [Array<(DispatchRoutes, Fixnum, Hash)>] DispatchRoutes data, response status code and response headers
    def fetch_all_dispatch_routes_with_http_info(access_token, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: RoutesApi.fetch_all_dispatch_routes ...'
      end
      # verify the required parameter 'access_token' is set
      if @api_client.config.client_side_validation && access_token.nil?
        fail ArgumentError, "Missing the required parameter 'access_token' when calling RoutesApi.fetch_all_dispatch_routes"
      end
      # resource path
      local_var_path = '/fleet/dispatch/routes'

      # query parameters
      query_params = {}
      query_params[:'access_token'] = access_token
      query_params[:'group_id'] = opts[:'group_id'] if !opts[:'group_id'].nil?
      query_params[:'end_time'] = opts[:'end_time'] if !opts[:'end_time'].nil?
      query_params[:'duration'] = opts[:'duration'] if !opts[:'duration'].nil?

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = nil
      auth_names = []
      data, status_code, headers = @api_client.call_api(:GET, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'DispatchRoutes')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: RoutesApi#fetch_all_dispatch_routes\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # /fleet/dispatch/routes/job_updates
    # Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
    # @param access_token Samsara API access token.
    # @param [Hash] opts the optional parameters
    # @option opts [Integer] :group_id Optional group ID if the organization has multiple groups (uncommon).
    # @option opts [String] :sequence_id Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours.
    # @option opts [String] :include Optionally set include&#x3D;route to include route object in response payload.
    # @return [AllRouteJobUpdates]
    def fetch_all_route_job_updates(access_token, opts = {})
      data, _status_code, _headers = fetch_all_route_job_updates_with_http_info(access_token, opts)
      data
    end

    # /fleet/dispatch/routes/job_updates
    # Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
    # @param access_token Samsara API access token.
    # @param [Hash] opts the optional parameters
    # @option opts [Integer] :group_id Optional group ID if the organization has multiple groups (uncommon).
    # @option opts [String] :sequence_id Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours.
    # @option opts [String] :include Optionally set include&#x3D;route to include route object in response payload.
    # @return [Array<(AllRouteJobUpdates, Fixnum, Hash)>] AllRouteJobUpdates data, response status code and response headers
    def fetch_all_route_job_updates_with_http_info(access_token, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: RoutesApi.fetch_all_route_job_updates ...'
      end
      # verify the required parameter 'access_token' is set
      if @api_client.config.client_side_validation && access_token.nil?
        fail ArgumentError, "Missing the required parameter 'access_token' when calling RoutesApi.fetch_all_route_job_updates"
      end
      # resource path
      local_var_path = '/fleet/dispatch/routes/job_updates'

      # query parameters
      query_params = {}
      query_params[:'access_token'] = access_token
      query_params[:'group_id'] = opts[:'group_id'] if !opts[:'group_id'].nil?
      query_params[:'sequence_id'] = opts[:'sequence_id'] if !opts[:'sequence_id'].nil?
      query_params[:'include'] = opts[:'include'] if !opts[:'include'].nil?

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = nil
      auth_names = []
      data, status_code, headers = @api_client.call_api(:GET, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'AllRouteJobUpdates')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: RoutesApi#fetch_all_route_job_updates\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # /fleet/dispatch/routes/{route_id:[0-9]+}
    # Fetch a dispatch route by id.
    # @param access_token Samsara API access token.
    # @param route_id ID of the dispatch route.
    # @param [Hash] opts the optional parameters
    # @return [DispatchRoute]
    def get_dispatch_route_by_id(access_token, route_id, opts = {})
      data, _status_code, _headers = get_dispatch_route_by_id_with_http_info(access_token, route_id, opts)
      data
    end

    # /fleet/dispatch/routes/{route_id:[0-9]+}
    # Fetch a dispatch route by id.
    # @param access_token Samsara API access token.
    # @param route_id ID of the dispatch route.
    # @param [Hash] opts the optional parameters
    # @return [Array<(DispatchRoute, Fixnum, Hash)>] DispatchRoute data, response status code and response headers
    def get_dispatch_route_by_id_with_http_info(access_token, route_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: RoutesApi.get_dispatch_route_by_id ...'
      end
      # verify the required parameter 'access_token' is set
      if @api_client.config.client_side_validation && access_token.nil?
        fail ArgumentError, "Missing the required parameter 'access_token' when calling RoutesApi.get_dispatch_route_by_id"
      end
      # verify the required parameter 'route_id' is set
      if @api_client.config.client_side_validation && route_id.nil?
        fail ArgumentError, "Missing the required parameter 'route_id' when calling RoutesApi.get_dispatch_route_by_id"
      end
      # resource path
      local_var_path = '/fleet/dispatch/routes/{route_id}'.sub('{' + 'route_id' + '}', route_id.to_s)

      # query parameters
      query_params = {}
      query_params[:'access_token'] = access_token

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = nil
      auth_names = []
      data, status_code, headers = @api_client.call_api(:GET, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'DispatchRoute')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: RoutesApi#get_dispatch_route_by_id\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # /fleet/dispatch/routes/{route_id:[0-9]+}/history
    # Fetch the history of a dispatch route.
    # @param access_token Samsara API access token.
    # @param route_id ID of the route with history.
    # @param [Hash] opts the optional parameters
    # @option opts [Integer] :start_time Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0.
    # @option opts [Integer] :end_time Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs.
    # @return [DispatchRouteHistory]
    def get_dispatch_route_history(access_token, route_id, opts = {})
      data, _status_code, _headers = get_dispatch_route_history_with_http_info(access_token, route_id, opts)
      data
    end

    # /fleet/dispatch/routes/{route_id:[0-9]+}/history
    # Fetch the history of a dispatch route.
    # @param access_token Samsara API access token.
    # @param route_id ID of the route with history.
    # @param [Hash] opts the optional parameters
    # @option opts [Integer] :start_time Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0.
    # @option opts [Integer] :end_time Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs.
    # @return [Array<(DispatchRouteHistory, Fixnum, Hash)>] DispatchRouteHistory data, response status code and response headers
    def get_dispatch_route_history_with_http_info(access_token, route_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: RoutesApi.get_dispatch_route_history ...'
      end
      # verify the required parameter 'access_token' is set
      if @api_client.config.client_side_validation && access_token.nil?
        fail ArgumentError, "Missing the required parameter 'access_token' when calling RoutesApi.get_dispatch_route_history"
      end
      # verify the required parameter 'route_id' is set
      if @api_client.config.client_side_validation && route_id.nil?
        fail ArgumentError, "Missing the required parameter 'route_id' when calling RoutesApi.get_dispatch_route_history"
      end
      # resource path
      local_var_path = '/fleet/dispatch/routes/{route_id}/history'.sub('{' + 'route_id' + '}', route_id.to_s)

      # query parameters
      query_params = {}
      query_params[:'access_token'] = access_token
      query_params[:'start_time'] = opts[:'start_time'] if !opts[:'start_time'].nil?
      query_params[:'end_time'] = opts[:'end_time'] if !opts[:'end_time'].nil?

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = nil
      auth_names = []
      data, status_code, headers = @api_client.call_api(:GET, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'DispatchRouteHistory')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: RoutesApi#get_dispatch_route_history\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
    # Fetch all of the dispatch routes for a given driver.
    # @param access_token Samsara API access token.
    # @param driver_id ID of the driver with the associated routes.
    # @param [Hash] opts the optional parameters
    # @option opts [Integer] :end_time Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
    # @option opts [Integer] :duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
    # @return [DispatchRoutes]
    def get_dispatch_routes_by_driver_id(access_token, driver_id, opts = {})
      data, _status_code, _headers = get_dispatch_routes_by_driver_id_with_http_info(access_token, driver_id, opts)
      data
    end

    # /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
    # Fetch all of the dispatch routes for a given driver.
    # @param access_token Samsara API access token.
    # @param driver_id ID of the driver with the associated routes.
    # @param [Hash] opts the optional parameters
    # @option opts [Integer] :end_time Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
    # @option opts [Integer] :duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
    # @return [Array<(DispatchRoutes, Fixnum, Hash)>] DispatchRoutes data, response status code and response headers
    def get_dispatch_routes_by_driver_id_with_http_info(access_token, driver_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: RoutesApi.get_dispatch_routes_by_driver_id ...'
      end
      # verify the required parameter 'access_token' is set
      if @api_client.config.client_side_validation && access_token.nil?
        fail ArgumentError, "Missing the required parameter 'access_token' when calling RoutesApi.get_dispatch_routes_by_driver_id"
      end
      # verify the required parameter 'driver_id' is set
      if @api_client.config.client_side_validation && driver_id.nil?
        fail ArgumentError, "Missing the required parameter 'driver_id' when calling RoutesApi.get_dispatch_routes_by_driver_id"
      end
      # resource path
      local_var_path = '/fleet/drivers/{driver_id}/dispatch/routes'.sub('{' + 'driver_id' + '}', driver_id.to_s)

      # query parameters
      query_params = {}
      query_params[:'access_token'] = access_token
      query_params[:'end_time'] = opts[:'end_time'] if !opts[:'end_time'].nil?
      query_params[:'duration'] = opts[:'duration'] if !opts[:'duration'].nil?

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = nil
      auth_names = []
      data, status_code, headers = @api_client.call_api(:GET, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'DispatchRoutes')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: RoutesApi#get_dispatch_routes_by_driver_id\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
    # Fetch all of the dispatch routes for a given vehicle.
    # @param access_token Samsara API access token.
    # @param vehicle_id ID of the vehicle with the associated routes.
    # @param [Hash] opts the optional parameters
    # @option opts [Integer] :end_time Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
    # @option opts [Integer] :duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
    # @return [DispatchRoutes]
    def get_dispatch_routes_by_vehicle_id(access_token, vehicle_id, opts = {})
      data, _status_code, _headers = get_dispatch_routes_by_vehicle_id_with_http_info(access_token, vehicle_id, opts)
      data
    end

    # /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
    # Fetch all of the dispatch routes for a given vehicle.
    # @param access_token Samsara API access token.
    # @param vehicle_id ID of the vehicle with the associated routes.
    # @param [Hash] opts the optional parameters
    # @option opts [Integer] :end_time Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
    # @option opts [Integer] :duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
    # @return [Array<(DispatchRoutes, Fixnum, Hash)>] DispatchRoutes data, response status code and response headers
    def get_dispatch_routes_by_vehicle_id_with_http_info(access_token, vehicle_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: RoutesApi.get_dispatch_routes_by_vehicle_id ...'
      end
      # verify the required parameter 'access_token' is set
      if @api_client.config.client_side_validation && access_token.nil?
        fail ArgumentError, "Missing the required parameter 'access_token' when calling RoutesApi.get_dispatch_routes_by_vehicle_id"
      end
      # verify the required parameter 'vehicle_id' is set
      if @api_client.config.client_side_validation && vehicle_id.nil?
        fail ArgumentError, "Missing the required parameter 'vehicle_id' when calling RoutesApi.get_dispatch_routes_by_vehicle_id"
      end
      # resource path
      local_var_path = '/fleet/vehicles/{vehicle_id}/dispatch/routes'.sub('{' + 'vehicle_id' + '}', vehicle_id.to_s)

      # query parameters
      query_params = {}
      query_params[:'access_token'] = access_token
      query_params[:'end_time'] = opts[:'end_time'] if !opts[:'end_time'].nil?
      query_params[:'duration'] = opts[:'duration'] if !opts[:'duration'].nil?

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = nil
      auth_names = []
      data, status_code, headers = @api_client.call_api(:GET, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'DispatchRoutes')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: RoutesApi#get_dispatch_routes_by_vehicle_id\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # /fleet/dispatch/routes/{route_id:[0-9]+}/
    # Update a dispatch route and its associated jobs.
    # @param access_token Samsara API access token.
    # @param route_id ID of the dispatch route.
    # @param update_dispatch_route_params 
    # @param [Hash] opts the optional parameters
    # @return [DispatchRoute]
    def update_dispatch_route_by_id(access_token, route_id, update_dispatch_route_params, opts = {})
      data, _status_code, _headers = update_dispatch_route_by_id_with_http_info(access_token, route_id, update_dispatch_route_params, opts)
      data
    end

    # /fleet/dispatch/routes/{route_id:[0-9]+}/
    # Update a dispatch route and its associated jobs.
    # @param access_token Samsara API access token.
    # @param route_id ID of the dispatch route.
    # @param update_dispatch_route_params 
    # @param [Hash] opts the optional parameters
    # @return [Array<(DispatchRoute, Fixnum, Hash)>] DispatchRoute data, response status code and response headers
    def update_dispatch_route_by_id_with_http_info(access_token, route_id, update_dispatch_route_params, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: RoutesApi.update_dispatch_route_by_id ...'
      end
      # verify the required parameter 'access_token' is set
      if @api_client.config.client_side_validation && access_token.nil?
        fail ArgumentError, "Missing the required parameter 'access_token' when calling RoutesApi.update_dispatch_route_by_id"
      end
      # verify the required parameter 'route_id' is set
      if @api_client.config.client_side_validation && route_id.nil?
        fail ArgumentError, "Missing the required parameter 'route_id' when calling RoutesApi.update_dispatch_route_by_id"
      end
      # verify the required parameter 'update_dispatch_route_params' is set
      if @api_client.config.client_side_validation && update_dispatch_route_params.nil?
        fail ArgumentError, "Missing the required parameter 'update_dispatch_route_params' when calling RoutesApi.update_dispatch_route_by_id"
      end
      # resource path
      local_var_path = '/fleet/dispatch/routes/{route_id}'.sub('{' + 'route_id' + '}', route_id.to_s)

      # query parameters
      query_params = {}
      query_params[:'access_token'] = access_token

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = @api_client.object_to_http_body(update_dispatch_route_params)
      auth_names = []
      data, status_code, headers = @api_client.call_api(:PUT, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'DispatchRoute')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: RoutesApi#update_dispatch_route_by_id\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end

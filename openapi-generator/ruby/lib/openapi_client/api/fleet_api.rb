=begin
#Samsara API

## Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).

OpenAPI spec version: 1.0.0

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 4.0.0-SNAPSHOT

=end

require 'uri'

module OpenapiClient
  class FleetApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # /fleet/add_address
    # This method adds an address book entry to the specified group.
    # @param access_token Samsara API access token.
    # @param address_param 
    # @param [Hash] opts the optional parameters
    # @return [nil]
    def add_fleet_address(access_token, address_param, opts = {})
      add_fleet_address_with_http_info(access_token, address_param, opts)
      nil
    end

    # /fleet/add_address
    # This method adds an address book entry to the specified group.
    # @param access_token Samsara API access token.
    # @param address_param 
    # @param [Hash] opts the optional parameters
    # @return [Array<(nil, Fixnum, Hash)>] nil, response status code and response headers
    def add_fleet_address_with_http_info(access_token, address_param, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: FleetApi.add_fleet_address ...'
      end
      # verify the required parameter 'access_token' is set
      if @api_client.config.client_side_validation && access_token.nil?
        fail ArgumentError, "Missing the required parameter 'access_token' when calling FleetApi.add_fleet_address"
      end
      # verify the required parameter 'address_param' is set
      if @api_client.config.client_side_validation && address_param.nil?
        fail ArgumentError, "Missing the required parameter 'address_param' when calling FleetApi.add_fleet_address"
      end
      # resource path
      local_var_path = '/fleet/add_address'

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
      post_body = @api_client.object_to_http_body(address_param)
      auth_names = []
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: FleetApi#add_fleet_address\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # /addresses
    # Add one or more addresses to the organization
    # @param access_token Samsara API access token.
    # @param addresses 
    # @param [Hash] opts the optional parameters
    # @return [Array<Address>]
    def add_organization_addresses(access_token, addresses, opts = {})
      data, _status_code, _headers = add_organization_addresses_with_http_info(access_token, addresses, opts)
      data
    end

    # /addresses
    # Add one or more addresses to the organization
    # @param access_token Samsara API access token.
    # @param addresses 
    # @param [Hash] opts the optional parameters
    # @return [Array<(Array<Address>, Fixnum, Hash)>] Array<Address> data, response status code and response headers
    def add_organization_addresses_with_http_info(access_token, addresses, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: FleetApi.add_organization_addresses ...'
      end
      # verify the required parameter 'access_token' is set
      if @api_client.config.client_side_validation && access_token.nil?
        fail ArgumentError, "Missing the required parameter 'access_token' when calling FleetApi.add_organization_addresses"
      end
      # verify the required parameter 'addresses' is set
      if @api_client.config.client_side_validation && addresses.nil?
        fail ArgumentError, "Missing the required parameter 'addresses' when calling FleetApi.add_organization_addresses"
      end
      # resource path
      local_var_path = '/addresses'

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
      post_body = @api_client.object_to_http_body(addresses)
      auth_names = []
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Array<Address>')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: FleetApi#add_organization_addresses\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
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
        @api_client.config.logger.debug 'Calling API: FleetApi.create_dispatch_route ...'
      end
      # verify the required parameter 'access_token' is set
      if @api_client.config.client_side_validation && access_token.nil?
        fail ArgumentError, "Missing the required parameter 'access_token' when calling FleetApi.create_dispatch_route"
      end
      # verify the required parameter 'create_dispatch_route_params' is set
      if @api_client.config.client_side_validation && create_dispatch_route_params.nil?
        fail ArgumentError, "Missing the required parameter 'create_dispatch_route_params' when calling FleetApi.create_dispatch_route"
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
        @api_client.config.logger.debug "API called: FleetApi#create_dispatch_route\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # /fleet/drivers/create
    # Create a new driver.
    # @param access_token Samsara API access token.
    # @param create_driver_param Driver creation body
    # @param [Hash] opts the optional parameters
    # @return [Driver]
    def create_driver(access_token, create_driver_param, opts = {})
      data, _status_code, _headers = create_driver_with_http_info(access_token, create_driver_param, opts)
      data
    end

    # /fleet/drivers/create
    # Create a new driver.
    # @param access_token Samsara API access token.
    # @param create_driver_param Driver creation body
    # @param [Hash] opts the optional parameters
    # @return [Array<(Driver, Fixnum, Hash)>] Driver data, response status code and response headers
    def create_driver_with_http_info(access_token, create_driver_param, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: FleetApi.create_driver ...'
      end
      # verify the required parameter 'access_token' is set
      if @api_client.config.client_side_validation && access_token.nil?
        fail ArgumentError, "Missing the required parameter 'access_token' when calling FleetApi.create_driver"
      end
      # verify the required parameter 'create_driver_param' is set
      if @api_client.config.client_side_validation && create_driver_param.nil?
        fail ArgumentError, "Missing the required parameter 'create_driver_param' when calling FleetApi.create_driver"
      end
      # resource path
      local_var_path = '/fleet/drivers/create'

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
      post_body = @api_client.object_to_http_body(create_driver_param)
      auth_names = []
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Driver')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: FleetApi#create_driver\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
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
        @api_client.config.logger.debug 'Calling API: FleetApi.create_driver_dispatch_route ...'
      end
      # verify the required parameter 'access_token' is set
      if @api_client.config.client_side_validation && access_token.nil?
        fail ArgumentError, "Missing the required parameter 'access_token' when calling FleetApi.create_driver_dispatch_route"
      end
      # verify the required parameter 'driver_id' is set
      if @api_client.config.client_side_validation && driver_id.nil?
        fail ArgumentError, "Missing the required parameter 'driver_id' when calling FleetApi.create_driver_dispatch_route"
      end
      # verify the required parameter 'create_dispatch_route_params' is set
      if @api_client.config.client_side_validation && create_dispatch_route_params.nil?
        fail ArgumentError, "Missing the required parameter 'create_dispatch_route_params' when calling FleetApi.create_driver_dispatch_route"
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
        @api_client.config.logger.debug "API called: FleetApi#create_driver_dispatch_route\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # /fleet/drivers/{driver_id:[0-9]+}/documents
    # Create a driver document for the given driver.
    # @param access_token Samsara API access token.
    # @param driver_id ID of the driver for whom the document is created.
    # @param create_document_params To create a document for a given document type, the document type&#39;s uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field&#39;s valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_.
    # @param [Hash] opts the optional parameters
    # @return [Document]
    def create_driver_document(access_token, driver_id, create_document_params, opts = {})
      data, _status_code, _headers = create_driver_document_with_http_info(access_token, driver_id, create_document_params, opts)
      data
    end

    # /fleet/drivers/{driver_id:[0-9]+}/documents
    # Create a driver document for the given driver.
    # @param access_token Samsara API access token.
    # @param driver_id ID of the driver for whom the document is created.
    # @param create_document_params To create a document for a given document type, the document type&#39;s uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field&#39;s valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_.
    # @param [Hash] opts the optional parameters
    # @return [Array<(Document, Fixnum, Hash)>] Document data, response status code and response headers
    def create_driver_document_with_http_info(access_token, driver_id, create_document_params, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: FleetApi.create_driver_document ...'
      end
      # verify the required parameter 'access_token' is set
      if @api_client.config.client_side_validation && access_token.nil?
        fail ArgumentError, "Missing the required parameter 'access_token' when calling FleetApi.create_driver_document"
      end
      # verify the required parameter 'driver_id' is set
      if @api_client.config.client_side_validation && driver_id.nil?
        fail ArgumentError, "Missing the required parameter 'driver_id' when calling FleetApi.create_driver_document"
      end
      # verify the required parameter 'create_document_params' is set
      if @api_client.config.client_side_validation && create_document_params.nil?
        fail ArgumentError, "Missing the required parameter 'create_document_params' when calling FleetApi.create_driver_document"
      end
      # resource path
      local_var_path = '/fleet/drivers/{driver_id}/documents'.sub('{' + 'driver_id' + '}', driver_id.to_s)

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
      post_body = @api_client.object_to_http_body(create_document_params)
      auth_names = []
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Document')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: FleetApi#create_driver_document\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # /fleet/maintenance/dvirs
    # Create a new dvir, marking a vehicle or trailer safe or unsafe.
    # @param access_token Samsara API access token.
    # @param create_dvir_param 
    # @param [Hash] opts the optional parameters
    # @return [DvirBase]
    def create_dvir(access_token, create_dvir_param, opts = {})
      data, _status_code, _headers = create_dvir_with_http_info(access_token, create_dvir_param, opts)
      data
    end

    # /fleet/maintenance/dvirs
    # Create a new dvir, marking a vehicle or trailer safe or unsafe.
    # @param access_token Samsara API access token.
    # @param create_dvir_param 
    # @param [Hash] opts the optional parameters
    # @return [Array<(DvirBase, Fixnum, Hash)>] DvirBase data, response status code and response headers
    def create_dvir_with_http_info(access_token, create_dvir_param, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: FleetApi.create_dvir ...'
      end
      # verify the required parameter 'access_token' is set
      if @api_client.config.client_side_validation && access_token.nil?
        fail ArgumentError, "Missing the required parameter 'access_token' when calling FleetApi.create_dvir"
      end
      # verify the required parameter 'create_dvir_param' is set
      if @api_client.config.client_side_validation && create_dvir_param.nil?
        fail ArgumentError, "Missing the required parameter 'create_dvir_param' when calling FleetApi.create_dvir"
      end
      # resource path
      local_var_path = '/fleet/maintenance/dvirs'

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
      post_body = @api_client.object_to_http_body(create_dvir_param)
      auth_names = []
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'DvirBase')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: FleetApi#create_dvir\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
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
        @api_client.config.logger.debug 'Calling API: FleetApi.create_vehicle_dispatch_route ...'
      end
      # verify the required parameter 'access_token' is set
      if @api_client.config.client_side_validation && access_token.nil?
        fail ArgumentError, "Missing the required parameter 'access_token' when calling FleetApi.create_vehicle_dispatch_route"
      end
      # verify the required parameter 'vehicle_id' is set
      if @api_client.config.client_side_validation && vehicle_id.nil?
        fail ArgumentError, "Missing the required parameter 'vehicle_id' when calling FleetApi.create_vehicle_dispatch_route"
      end
      # verify the required parameter 'create_dispatch_route_params' is set
      if @api_client.config.client_side_validation && create_dispatch_route_params.nil?
        fail ArgumentError, "Missing the required parameter 'create_dispatch_route_params' when calling FleetApi.create_vehicle_dispatch_route"
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
        @api_client.config.logger.debug "API called: FleetApi#create_vehicle_dispatch_route\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
    # Deactivate a driver with the given id.
    # @param access_token Samsara API access token.
    # @param driver_id_or_external_id ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
    # @param [Hash] opts the optional parameters
    # @return [nil]
    def deactivate_driver(access_token, driver_id_or_external_id, opts = {})
      deactivate_driver_with_http_info(access_token, driver_id_or_external_id, opts)
      nil
    end

    # /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
    # Deactivate a driver with the given id.
    # @param access_token Samsara API access token.
    # @param driver_id_or_external_id ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
    # @param [Hash] opts the optional parameters
    # @return [Array<(nil, Fixnum, Hash)>] nil, response status code and response headers
    def deactivate_driver_with_http_info(access_token, driver_id_or_external_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: FleetApi.deactivate_driver ...'
      end
      # verify the required parameter 'access_token' is set
      if @api_client.config.client_side_validation && access_token.nil?
        fail ArgumentError, "Missing the required parameter 'access_token' when calling FleetApi.deactivate_driver"
      end
      # verify the required parameter 'driver_id_or_external_id' is set
      if @api_client.config.client_side_validation && driver_id_or_external_id.nil?
        fail ArgumentError, "Missing the required parameter 'driver_id_or_external_id' when calling FleetApi.deactivate_driver"
      end
      # resource path
      local_var_path = '/fleet/drivers/{driver_id_or_external_id}'.sub('{' + 'driver_id_or_external_id' + '}', driver_id_or_external_id.to_s)

      # query parameters
      query_params = {}
      query_params[:'access_token'] = access_token

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

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
        @api_client.config.logger.debug "API called: FleetApi#deactivate_driver\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
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
        @api_client.config.logger.debug 'Calling API: FleetApi.delete_dispatch_route_by_id ...'
      end
      # verify the required parameter 'access_token' is set
      if @api_client.config.client_side_validation && access_token.nil?
        fail ArgumentError, "Missing the required parameter 'access_token' when calling FleetApi.delete_dispatch_route_by_id"
      end
      # verify the required parameter 'route_id' is set
      if @api_client.config.client_side_validation && route_id.nil?
        fail ArgumentError, "Missing the required parameter 'route_id' when calling FleetApi.delete_dispatch_route_by_id"
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
        @api_client.config.logger.debug "API called: FleetApi#delete_dispatch_route_by_id\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # /addresses/{addressId}
    # Delete an address.
    # @param access_token Samsara API access token.
    # @param address_id ID of the address/geofence
    # @param [Hash] opts the optional parameters
    # @return [nil]
    def delete_organization_address(access_token, address_id, opts = {})
      delete_organization_address_with_http_info(access_token, address_id, opts)
      nil
    end

    # /addresses/{addressId}
    # Delete an address.
    # @param access_token Samsara API access token.
    # @param address_id ID of the address/geofence
    # @param [Hash] opts the optional parameters
    # @return [Array<(nil, Fixnum, Hash)>] nil, response status code and response headers
    def delete_organization_address_with_http_info(access_token, address_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: FleetApi.delete_organization_address ...'
      end
      # verify the required parameter 'access_token' is set
      if @api_client.config.client_side_validation && access_token.nil?
        fail ArgumentError, "Missing the required parameter 'access_token' when calling FleetApi.delete_organization_address"
      end
      # verify the required parameter 'address_id' is set
      if @api_client.config.client_side_validation && address_id.nil?
        fail ArgumentError, "Missing the required parameter 'address_id' when calling FleetApi.delete_organization_address"
      end
      # resource path
      local_var_path = '/addresses/{addressId}'.sub('{' + 'addressId' + '}', address_id.to_s)

      # query parameters
      query_params = {}
      query_params[:'access_token'] = access_token

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

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
        @api_client.config.logger.debug "API called: FleetApi#delete_organization_address\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
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
    # @return [Array<DispatchRoute>]
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
    # @return [Array<(Array<DispatchRoute>, Fixnum, Hash)>] Array<DispatchRoute> data, response status code and response headers
    def fetch_all_dispatch_routes_with_http_info(access_token, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: FleetApi.fetch_all_dispatch_routes ...'
      end
      # verify the required parameter 'access_token' is set
      if @api_client.config.client_side_validation && access_token.nil?
        fail ArgumentError, "Missing the required parameter 'access_token' when calling FleetApi.fetch_all_dispatch_routes"
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
        :return_type => 'Array<DispatchRoute>')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: FleetApi#fetch_all_dispatch_routes\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
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
        @api_client.config.logger.debug 'Calling API: FleetApi.fetch_all_route_job_updates ...'
      end
      # verify the required parameter 'access_token' is set
      if @api_client.config.client_side_validation && access_token.nil?
        fail ArgumentError, "Missing the required parameter 'access_token' when calling FleetApi.fetch_all_route_job_updates"
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
        @api_client.config.logger.debug "API called: FleetApi#fetch_all_route_job_updates\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # /fleet/assets/locations
    # Fetch current locations of all assets for the group.
    # @param access_token Samsara API access token.
    # @param [Hash] opts the optional parameters
    # @option opts [Integer] :group_id Optional group ID if the organization has multiple groups (uncommon).
    # @return [InlineResponse2001]
    def get_all_asset_current_locations(access_token, opts = {})
      data, _status_code, _headers = get_all_asset_current_locations_with_http_info(access_token, opts)
      data
    end

    # /fleet/assets/locations
    # Fetch current locations of all assets for the group.
    # @param access_token Samsara API access token.
    # @param [Hash] opts the optional parameters
    # @option opts [Integer] :group_id Optional group ID if the organization has multiple groups (uncommon).
    # @return [Array<(InlineResponse2001, Fixnum, Hash)>] InlineResponse2001 data, response status code and response headers
    def get_all_asset_current_locations_with_http_info(access_token, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: FleetApi.get_all_asset_current_locations ...'
      end
      # verify the required parameter 'access_token' is set
      if @api_client.config.client_side_validation && access_token.nil?
        fail ArgumentError, "Missing the required parameter 'access_token' when calling FleetApi.get_all_asset_current_locations"
      end
      # resource path
      local_var_path = '/fleet/assets/locations'

      # query parameters
      query_params = {}
      query_params[:'access_token'] = access_token
      query_params[:'group_id'] = opts[:'group_id'] if !opts[:'group_id'].nil?

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

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
        :return_type => 'InlineResponse2001')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: FleetApi#get_all_asset_current_locations\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # /fleet/assets
    # Fetch all of the assets for the group.
    # @param access_token Samsara API access token.
    # @param [Hash] opts the optional parameters
    # @option opts [Integer] :group_id Optional group ID if the organization has multiple groups (uncommon).
    # @return [InlineResponse200]
    def get_all_assets(access_token, opts = {})
      data, _status_code, _headers = get_all_assets_with_http_info(access_token, opts)
      data
    end

    # /fleet/assets
    # Fetch all of the assets for the group.
    # @param access_token Samsara API access token.
    # @param [Hash] opts the optional parameters
    # @option opts [Integer] :group_id Optional group ID if the organization has multiple groups (uncommon).
    # @return [Array<(InlineResponse200, Fixnum, Hash)>] InlineResponse200 data, response status code and response headers
    def get_all_assets_with_http_info(access_token, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: FleetApi.get_all_assets ...'
      end
      # verify the required parameter 'access_token' is set
      if @api_client.config.client_side_validation && access_token.nil?
        fail ArgumentError, "Missing the required parameter 'access_token' when calling FleetApi.get_all_assets"
      end
      # resource path
      local_var_path = '/fleet/assets'

      # query parameters
      query_params = {}
      query_params[:'access_token'] = access_token
      query_params[:'group_id'] = opts[:'group_id'] if !opts[:'group_id'].nil?

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

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
        :return_type => 'InlineResponse200')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: FleetApi#get_all_assets\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # /fleet/drivers/inactive
    # Fetch all deactivated drivers for the group.
    # @param access_token Samsara API access token.
    # @param [Hash] opts the optional parameters
    # @option opts [Integer] :group_id Optional group ID if the organization has multiple groups (uncommon).
    # @return [Array<Driver>]
    def get_all_deactivated_drivers(access_token, opts = {})
      data, _status_code, _headers = get_all_deactivated_drivers_with_http_info(access_token, opts)
      data
    end

    # /fleet/drivers/inactive
    # Fetch all deactivated drivers for the group.
    # @param access_token Samsara API access token.
    # @param [Hash] opts the optional parameters
    # @option opts [Integer] :group_id Optional group ID if the organization has multiple groups (uncommon).
    # @return [Array<(Array<Driver>, Fixnum, Hash)>] Array<Driver> data, response status code and response headers
    def get_all_deactivated_drivers_with_http_info(access_token, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: FleetApi.get_all_deactivated_drivers ...'
      end
      # verify the required parameter 'access_token' is set
      if @api_client.config.client_side_validation && access_token.nil?
        fail ArgumentError, "Missing the required parameter 'access_token' when calling FleetApi.get_all_deactivated_drivers"
      end
      # resource path
      local_var_path = '/fleet/drivers/inactive'

      # query parameters
      query_params = {}
      query_params[:'access_token'] = access_token
      query_params[:'group_id'] = opts[:'group_id'] if !opts[:'group_id'].nil?

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

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
        :return_type => 'Array<Driver>')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: FleetApi#get_all_deactivated_drivers\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # /fleet/assets/{assetId:[0-9]+}/locations
    # Fetch the historical locations for the asset.
    # @param access_token Samsara API access token.
    # @param asset_id ID of the asset
    # @param start_ms Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
    # @param end_ms Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
    # @param [Hash] opts the optional parameters
    # @return [Array<Object>]
    def get_asset_location(access_token, asset_id, start_ms, end_ms, opts = {})
      data, _status_code, _headers = get_asset_location_with_http_info(access_token, asset_id, start_ms, end_ms, opts)
      data
    end

    # /fleet/assets/{assetId:[0-9]+}/locations
    # Fetch the historical locations for the asset.
    # @param access_token Samsara API access token.
    # @param asset_id ID of the asset
    # @param start_ms Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
    # @param end_ms Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
    # @param [Hash] opts the optional parameters
    # @return [Array<(Array<Object>, Fixnum, Hash)>] Array<Object> data, response status code and response headers
    def get_asset_location_with_http_info(access_token, asset_id, start_ms, end_ms, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: FleetApi.get_asset_location ...'
      end
      # verify the required parameter 'access_token' is set
      if @api_client.config.client_side_validation && access_token.nil?
        fail ArgumentError, "Missing the required parameter 'access_token' when calling FleetApi.get_asset_location"
      end
      # verify the required parameter 'asset_id' is set
      if @api_client.config.client_side_validation && asset_id.nil?
        fail ArgumentError, "Missing the required parameter 'asset_id' when calling FleetApi.get_asset_location"
      end
      # verify the required parameter 'start_ms' is set
      if @api_client.config.client_side_validation && start_ms.nil?
        fail ArgumentError, "Missing the required parameter 'start_ms' when calling FleetApi.get_asset_location"
      end
      # verify the required parameter 'end_ms' is set
      if @api_client.config.client_side_validation && end_ms.nil?
        fail ArgumentError, "Missing the required parameter 'end_ms' when calling FleetApi.get_asset_location"
      end
      # resource path
      local_var_path = '/fleet/assets/{asset_id}/locations'.sub('{' + 'asset_id' + '}', asset_id.to_s)

      # query parameters
      query_params = {}
      query_params[:'access_token'] = access_token
      query_params[:'startMs'] = start_ms
      query_params[:'endMs'] = end_ms

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

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
        :return_type => 'Array<Object>')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: FleetApi#get_asset_location\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # /fleet/assets/{assetId:[0-9]+}/reefer
    # Fetch the reefer-specific stats of an asset.
    # @param access_token Samsara API access token.
    # @param asset_id ID of the asset
    # @param start_ms Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
    # @param end_ms Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
    # @param [Hash] opts the optional parameters
    # @return [AssetReeferResponse]
    def get_asset_reefer(access_token, asset_id, start_ms, end_ms, opts = {})
      data, _status_code, _headers = get_asset_reefer_with_http_info(access_token, asset_id, start_ms, end_ms, opts)
      data
    end

    # /fleet/assets/{assetId:[0-9]+}/reefer
    # Fetch the reefer-specific stats of an asset.
    # @param access_token Samsara API access token.
    # @param asset_id ID of the asset
    # @param start_ms Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
    # @param end_ms Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
    # @param [Hash] opts the optional parameters
    # @return [Array<(AssetReeferResponse, Fixnum, Hash)>] AssetReeferResponse data, response status code and response headers
    def get_asset_reefer_with_http_info(access_token, asset_id, start_ms, end_ms, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: FleetApi.get_asset_reefer ...'
      end
      # verify the required parameter 'access_token' is set
      if @api_client.config.client_side_validation && access_token.nil?
        fail ArgumentError, "Missing the required parameter 'access_token' when calling FleetApi.get_asset_reefer"
      end
      # verify the required parameter 'asset_id' is set
      if @api_client.config.client_side_validation && asset_id.nil?
        fail ArgumentError, "Missing the required parameter 'asset_id' when calling FleetApi.get_asset_reefer"
      end
      # verify the required parameter 'start_ms' is set
      if @api_client.config.client_side_validation && start_ms.nil?
        fail ArgumentError, "Missing the required parameter 'start_ms' when calling FleetApi.get_asset_reefer"
      end
      # verify the required parameter 'end_ms' is set
      if @api_client.config.client_side_validation && end_ms.nil?
        fail ArgumentError, "Missing the required parameter 'end_ms' when calling FleetApi.get_asset_reefer"
      end
      # resource path
      local_var_path = '/fleet/assets/{asset_id}/reefer'.sub('{' + 'asset_id' + '}', asset_id.to_s)

      # query parameters
      query_params = {}
      query_params[:'access_token'] = access_token
      query_params[:'startMs'] = start_ms
      query_params[:'endMs'] = end_ms

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

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
        :return_type => 'AssetReeferResponse')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: FleetApi#get_asset_reefer\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
    # Fetch deactivated driver by id.
    # @param access_token Samsara API access token.
    # @param driver_id_or_external_id ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
    # @param [Hash] opts the optional parameters
    # @return [Driver]
    def get_deactivated_driver_by_id(access_token, driver_id_or_external_id, opts = {})
      data, _status_code, _headers = get_deactivated_driver_by_id_with_http_info(access_token, driver_id_or_external_id, opts)
      data
    end

    # /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
    # Fetch deactivated driver by id.
    # @param access_token Samsara API access token.
    # @param driver_id_or_external_id ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
    # @param [Hash] opts the optional parameters
    # @return [Array<(Driver, Fixnum, Hash)>] Driver data, response status code and response headers
    def get_deactivated_driver_by_id_with_http_info(access_token, driver_id_or_external_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: FleetApi.get_deactivated_driver_by_id ...'
      end
      # verify the required parameter 'access_token' is set
      if @api_client.config.client_side_validation && access_token.nil?
        fail ArgumentError, "Missing the required parameter 'access_token' when calling FleetApi.get_deactivated_driver_by_id"
      end
      # verify the required parameter 'driver_id_or_external_id' is set
      if @api_client.config.client_side_validation && driver_id_or_external_id.nil?
        fail ArgumentError, "Missing the required parameter 'driver_id_or_external_id' when calling FleetApi.get_deactivated_driver_by_id"
      end
      # resource path
      local_var_path = '/fleet/drivers/inactive/{driver_id_or_external_id}'.sub('{' + 'driver_id_or_external_id' + '}', driver_id_or_external_id.to_s)

      # query parameters
      query_params = {}
      query_params[:'access_token'] = access_token

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

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
        :return_type => 'Driver')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: FleetApi#get_deactivated_driver_by_id\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
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
        @api_client.config.logger.debug 'Calling API: FleetApi.get_dispatch_route_by_id ...'
      end
      # verify the required parameter 'access_token' is set
      if @api_client.config.client_side_validation && access_token.nil?
        fail ArgumentError, "Missing the required parameter 'access_token' when calling FleetApi.get_dispatch_route_by_id"
      end
      # verify the required parameter 'route_id' is set
      if @api_client.config.client_side_validation && route_id.nil?
        fail ArgumentError, "Missing the required parameter 'route_id' when calling FleetApi.get_dispatch_route_by_id"
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
        @api_client.config.logger.debug "API called: FleetApi#get_dispatch_route_by_id\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
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
        @api_client.config.logger.debug 'Calling API: FleetApi.get_dispatch_route_history ...'
      end
      # verify the required parameter 'access_token' is set
      if @api_client.config.client_side_validation && access_token.nil?
        fail ArgumentError, "Missing the required parameter 'access_token' when calling FleetApi.get_dispatch_route_history"
      end
      # verify the required parameter 'route_id' is set
      if @api_client.config.client_side_validation && route_id.nil?
        fail ArgumentError, "Missing the required parameter 'route_id' when calling FleetApi.get_dispatch_route_history"
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
        @api_client.config.logger.debug "API called: FleetApi#get_dispatch_route_history\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
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
    # @return [Array<DispatchRoute>]
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
    # @return [Array<(Array<DispatchRoute>, Fixnum, Hash)>] Array<DispatchRoute> data, response status code and response headers
    def get_dispatch_routes_by_driver_id_with_http_info(access_token, driver_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: FleetApi.get_dispatch_routes_by_driver_id ...'
      end
      # verify the required parameter 'access_token' is set
      if @api_client.config.client_side_validation && access_token.nil?
        fail ArgumentError, "Missing the required parameter 'access_token' when calling FleetApi.get_dispatch_routes_by_driver_id"
      end
      # verify the required parameter 'driver_id' is set
      if @api_client.config.client_side_validation && driver_id.nil?
        fail ArgumentError, "Missing the required parameter 'driver_id' when calling FleetApi.get_dispatch_routes_by_driver_id"
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
        :return_type => 'Array<DispatchRoute>')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: FleetApi#get_dispatch_routes_by_driver_id\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
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
    # @return [Array<DispatchRoute>]
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
    # @return [Array<(Array<DispatchRoute>, Fixnum, Hash)>] Array<DispatchRoute> data, response status code and response headers
    def get_dispatch_routes_by_vehicle_id_with_http_info(access_token, vehicle_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: FleetApi.get_dispatch_routes_by_vehicle_id ...'
      end
      # verify the required parameter 'access_token' is set
      if @api_client.config.client_side_validation && access_token.nil?
        fail ArgumentError, "Missing the required parameter 'access_token' when calling FleetApi.get_dispatch_routes_by_vehicle_id"
      end
      # verify the required parameter 'vehicle_id' is set
      if @api_client.config.client_side_validation && vehicle_id.nil?
        fail ArgumentError, "Missing the required parameter 'vehicle_id' when calling FleetApi.get_dispatch_routes_by_vehicle_id"
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
        :return_type => 'Array<DispatchRoute>')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: FleetApi#get_dispatch_routes_by_vehicle_id\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
    # Fetch driver by id.
    # @param access_token Samsara API access token.
    # @param driver_id_or_external_id ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
    # @param [Hash] opts the optional parameters
    # @return [Driver]
    def get_driver_by_id(access_token, driver_id_or_external_id, opts = {})
      data, _status_code, _headers = get_driver_by_id_with_http_info(access_token, driver_id_or_external_id, opts)
      data
    end

    # /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
    # Fetch driver by id.
    # @param access_token Samsara API access token.
    # @param driver_id_or_external_id ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
    # @param [Hash] opts the optional parameters
    # @return [Array<(Driver, Fixnum, Hash)>] Driver data, response status code and response headers
    def get_driver_by_id_with_http_info(access_token, driver_id_or_external_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: FleetApi.get_driver_by_id ...'
      end
      # verify the required parameter 'access_token' is set
      if @api_client.config.client_side_validation && access_token.nil?
        fail ArgumentError, "Missing the required parameter 'access_token' when calling FleetApi.get_driver_by_id"
      end
      # verify the required parameter 'driver_id_or_external_id' is set
      if @api_client.config.client_side_validation && driver_id_or_external_id.nil?
        fail ArgumentError, "Missing the required parameter 'driver_id_or_external_id' when calling FleetApi.get_driver_by_id"
      end
      # resource path
      local_var_path = '/fleet/drivers/{driver_id_or_external_id}'.sub('{' + 'driver_id_or_external_id' + '}', driver_id_or_external_id.to_s)

      # query parameters
      query_params = {}
      query_params[:'access_token'] = access_token

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

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
        :return_type => 'Driver')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: FleetApi#get_driver_by_id\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # /fleet/drivers/document_types
    # Fetch all of the document types.
    # @param [Hash] opts the optional parameters
    # @return [Array<DocumentType>]
    def get_driver_document_types_by_org_id(opts = {})
      data, _status_code, _headers = get_driver_document_types_by_org_id_with_http_info(opts)
      data
    end

    # /fleet/drivers/document_types
    # Fetch all of the document types.
    # @param [Hash] opts the optional parameters
    # @return [Array<(Array<DocumentType>, Fixnum, Hash)>] Array<DocumentType> data, response status code and response headers
    def get_driver_document_types_by_org_id_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: FleetApi.get_driver_document_types_by_org_id ...'
      end
      # resource path
      local_var_path = '/fleet/drivers/document_types'

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

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
        :return_type => 'Array<DocumentType>')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: FleetApi#get_driver_document_types_by_org_id\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # /fleet/drivers/documents
    # Fetch all of the documents.
    # @param access_token Samsara API access token.
    # @param [Hash] opts the optional parameters
    # @option opts [Integer] :end_ms Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now.
    # @option opts [Integer] :duration_ms Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours.
    # @return [Array<Document>]
    def get_driver_documents_by_org_id(access_token, opts = {})
      data, _status_code, _headers = get_driver_documents_by_org_id_with_http_info(access_token, opts)
      data
    end

    # /fleet/drivers/documents
    # Fetch all of the documents.
    # @param access_token Samsara API access token.
    # @param [Hash] opts the optional parameters
    # @option opts [Integer] :end_ms Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now.
    # @option opts [Integer] :duration_ms Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours.
    # @return [Array<(Array<Document>, Fixnum, Hash)>] Array<Document> data, response status code and response headers
    def get_driver_documents_by_org_id_with_http_info(access_token, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: FleetApi.get_driver_documents_by_org_id ...'
      end
      # verify the required parameter 'access_token' is set
      if @api_client.config.client_side_validation && access_token.nil?
        fail ArgumentError, "Missing the required parameter 'access_token' when calling FleetApi.get_driver_documents_by_org_id"
      end
      # resource path
      local_var_path = '/fleet/drivers/documents'

      # query parameters
      query_params = {}
      query_params[:'access_token'] = access_token
      query_params[:'endMs'] = opts[:'end_ms'] if !opts[:'end_ms'].nil?
      query_params[:'durationMs'] = opts[:'duration_ms'] if !opts[:'duration_ms'].nil?

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

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
        :return_type => 'Array<Document>')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: FleetApi#get_driver_documents_by_org_id\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # /fleet/drivers/{driverId:[0-9]+}/safety/score
    # Fetch the safety score for the driver.
    # @param driver_id ID of the driver
    # @param access_token Samsara API access token.
    # @param start_ms Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
    # @param end_ms Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
    # @param [Hash] opts the optional parameters
    # @return [DriverSafetyScoreResponse]
    def get_driver_safety_score(driver_id, access_token, start_ms, end_ms, opts = {})
      data, _status_code, _headers = get_driver_safety_score_with_http_info(driver_id, access_token, start_ms, end_ms, opts)
      data
    end

    # /fleet/drivers/{driverId:[0-9]+}/safety/score
    # Fetch the safety score for the driver.
    # @param driver_id ID of the driver
    # @param access_token Samsara API access token.
    # @param start_ms Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
    # @param end_ms Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
    # @param [Hash] opts the optional parameters
    # @return [Array<(DriverSafetyScoreResponse, Fixnum, Hash)>] DriverSafetyScoreResponse data, response status code and response headers
    def get_driver_safety_score_with_http_info(driver_id, access_token, start_ms, end_ms, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: FleetApi.get_driver_safety_score ...'
      end
      # verify the required parameter 'driver_id' is set
      if @api_client.config.client_side_validation && driver_id.nil?
        fail ArgumentError, "Missing the required parameter 'driver_id' when calling FleetApi.get_driver_safety_score"
      end
      # verify the required parameter 'access_token' is set
      if @api_client.config.client_side_validation && access_token.nil?
        fail ArgumentError, "Missing the required parameter 'access_token' when calling FleetApi.get_driver_safety_score"
      end
      # verify the required parameter 'start_ms' is set
      if @api_client.config.client_side_validation && start_ms.nil?
        fail ArgumentError, "Missing the required parameter 'start_ms' when calling FleetApi.get_driver_safety_score"
      end
      # verify the required parameter 'end_ms' is set
      if @api_client.config.client_side_validation && end_ms.nil?
        fail ArgumentError, "Missing the required parameter 'end_ms' when calling FleetApi.get_driver_safety_score"
      end
      # resource path
      local_var_path = '/fleet/drivers/{driverId}/safety/score'.sub('{' + 'driverId' + '}', driver_id.to_s)

      # query parameters
      query_params = {}
      query_params[:'access_token'] = access_token
      query_params[:'startMs'] = start_ms
      query_params[:'endMs'] = end_ms

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

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
        :return_type => 'DriverSafetyScoreResponse')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: FleetApi#get_driver_safety_score\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # /fleet/maintenance/dvirs
    # Get DVIRs for the org within provided time constraints
    # @param access_token Samsara API access token.
    # @param end_ms time in millis until the last dvir log.
    # @param duration_ms time in millis which corresponds to the duration before the end_ms.
    # @param [Hash] opts the optional parameters
    # @option opts [Integer] :group_id Group ID to query.
    # @return [DvirListResponse]
    def get_dvirs(access_token, end_ms, duration_ms, opts = {})
      data, _status_code, _headers = get_dvirs_with_http_info(access_token, end_ms, duration_ms, opts)
      data
    end

    # /fleet/maintenance/dvirs
    # Get DVIRs for the org within provided time constraints
    # @param access_token Samsara API access token.
    # @param end_ms time in millis until the last dvir log.
    # @param duration_ms time in millis which corresponds to the duration before the end_ms.
    # @param [Hash] opts the optional parameters
    # @option opts [Integer] :group_id Group ID to query.
    # @return [Array<(DvirListResponse, Fixnum, Hash)>] DvirListResponse data, response status code and response headers
    def get_dvirs_with_http_info(access_token, end_ms, duration_ms, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: FleetApi.get_dvirs ...'
      end
      # verify the required parameter 'access_token' is set
      if @api_client.config.client_side_validation && access_token.nil?
        fail ArgumentError, "Missing the required parameter 'access_token' when calling FleetApi.get_dvirs"
      end
      # verify the required parameter 'end_ms' is set
      if @api_client.config.client_side_validation && end_ms.nil?
        fail ArgumentError, "Missing the required parameter 'end_ms' when calling FleetApi.get_dvirs"
      end
      # verify the required parameter 'duration_ms' is set
      if @api_client.config.client_side_validation && duration_ms.nil?
        fail ArgumentError, "Missing the required parameter 'duration_ms' when calling FleetApi.get_dvirs"
      end
      # resource path
      local_var_path = '/fleet/maintenance/dvirs'

      # query parameters
      query_params = {}
      query_params[:'access_token'] = access_token
      query_params[:'end_ms'] = end_ms
      query_params[:'duration_ms'] = duration_ms
      query_params[:'group_id'] = opts[:'group_id'] if !opts[:'group_id'].nil?

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

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
        :return_type => 'DvirListResponse')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: FleetApi#get_dvirs\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # /fleet/drivers
    # Get all the drivers for the specified group.
    # @param access_token Samsara API access token.
    # @param group_drivers_param 
    # @param [Hash] opts the optional parameters
    # @return [DriversResponse]
    def get_fleet_drivers(access_token, group_drivers_param, opts = {})
      data, _status_code, _headers = get_fleet_drivers_with_http_info(access_token, group_drivers_param, opts)
      data
    end

    # /fleet/drivers
    # Get all the drivers for the specified group.
    # @param access_token Samsara API access token.
    # @param group_drivers_param 
    # @param [Hash] opts the optional parameters
    # @return [Array<(DriversResponse, Fixnum, Hash)>] DriversResponse data, response status code and response headers
    def get_fleet_drivers_with_http_info(access_token, group_drivers_param, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: FleetApi.get_fleet_drivers ...'
      end
      # verify the required parameter 'access_token' is set
      if @api_client.config.client_side_validation && access_token.nil?
        fail ArgumentError, "Missing the required parameter 'access_token' when calling FleetApi.get_fleet_drivers"
      end
      # verify the required parameter 'group_drivers_param' is set
      if @api_client.config.client_side_validation && group_drivers_param.nil?
        fail ArgumentError, "Missing the required parameter 'group_drivers_param' when calling FleetApi.get_fleet_drivers"
      end
      # resource path
      local_var_path = '/fleet/drivers'

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
      post_body = @api_client.object_to_http_body(group_drivers_param)
      auth_names = []
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'DriversResponse')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: FleetApi#get_fleet_drivers\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
    # Get summarized daily HOS charts for a specified driver.
    # @param access_token Samsara API access token.
    # @param driver_id ID of the driver with HOS logs.
    # @param hos_logs_param 
    # @param [Hash] opts the optional parameters
    # @return [DriverDailyLogResponse]
    def get_fleet_drivers_hos_daily_logs(access_token, driver_id, hos_logs_param, opts = {})
      data, _status_code, _headers = get_fleet_drivers_hos_daily_logs_with_http_info(access_token, driver_id, hos_logs_param, opts)
      data
    end

    # /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
    # Get summarized daily HOS charts for a specified driver.
    # @param access_token Samsara API access token.
    # @param driver_id ID of the driver with HOS logs.
    # @param hos_logs_param 
    # @param [Hash] opts the optional parameters
    # @return [Array<(DriverDailyLogResponse, Fixnum, Hash)>] DriverDailyLogResponse data, response status code and response headers
    def get_fleet_drivers_hos_daily_logs_with_http_info(access_token, driver_id, hos_logs_param, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: FleetApi.get_fleet_drivers_hos_daily_logs ...'
      end
      # verify the required parameter 'access_token' is set
      if @api_client.config.client_side_validation && access_token.nil?
        fail ArgumentError, "Missing the required parameter 'access_token' when calling FleetApi.get_fleet_drivers_hos_daily_logs"
      end
      # verify the required parameter 'driver_id' is set
      if @api_client.config.client_side_validation && driver_id.nil?
        fail ArgumentError, "Missing the required parameter 'driver_id' when calling FleetApi.get_fleet_drivers_hos_daily_logs"
      end
      # verify the required parameter 'hos_logs_param' is set
      if @api_client.config.client_side_validation && hos_logs_param.nil?
        fail ArgumentError, "Missing the required parameter 'hos_logs_param' when calling FleetApi.get_fleet_drivers_hos_daily_logs"
      end
      # resource path
      local_var_path = '/fleet/drivers/{driver_id}/hos_daily_logs'.sub('{' + 'driver_id' + '}', driver_id.to_s)

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
      post_body = @api_client.object_to_http_body(hos_logs_param)
      auth_names = []
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'DriverDailyLogResponse')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: FleetApi#get_fleet_drivers_hos_daily_logs\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # /fleet/drivers/summary
    # Get the distance and time each driver in an organization has driven in a given time period.
    # @param access_token Samsara API access token.
    # @param drivers_summary_param 
    # @param [Hash] opts the optional parameters
    # @option opts [BOOLEAN] :snap_to_day_bounds Snap query result to HOS day boundaries.
    # @return [DriversSummaryResponse]
    def get_fleet_drivers_summary(access_token, drivers_summary_param, opts = {})
      data, _status_code, _headers = get_fleet_drivers_summary_with_http_info(access_token, drivers_summary_param, opts)
      data
    end

    # /fleet/drivers/summary
    # Get the distance and time each driver in an organization has driven in a given time period.
    # @param access_token Samsara API access token.
    # @param drivers_summary_param 
    # @param [Hash] opts the optional parameters
    # @option opts [BOOLEAN] :snap_to_day_bounds Snap query result to HOS day boundaries.
    # @return [Array<(DriversSummaryResponse, Fixnum, Hash)>] DriversSummaryResponse data, response status code and response headers
    def get_fleet_drivers_summary_with_http_info(access_token, drivers_summary_param, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: FleetApi.get_fleet_drivers_summary ...'
      end
      # verify the required parameter 'access_token' is set
      if @api_client.config.client_side_validation && access_token.nil?
        fail ArgumentError, "Missing the required parameter 'access_token' when calling FleetApi.get_fleet_drivers_summary"
      end
      # verify the required parameter 'drivers_summary_param' is set
      if @api_client.config.client_side_validation && drivers_summary_param.nil?
        fail ArgumentError, "Missing the required parameter 'drivers_summary_param' when calling FleetApi.get_fleet_drivers_summary"
      end
      # resource path
      local_var_path = '/fleet/drivers/summary'

      # query parameters
      query_params = {}
      query_params[:'access_token'] = access_token
      query_params[:'snap_to_day_bounds'] = opts[:'snap_to_day_bounds'] if !opts[:'snap_to_day_bounds'].nil?

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = @api_client.object_to_http_body(drivers_summary_param)
      auth_names = []
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'DriversSummaryResponse')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: FleetApi#get_fleet_drivers_summary\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # /fleet/hos_authentication_logs
    # Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.
    # @param access_token Samsara API access token.
    # @param hos_authentication_logs_param 
    # @param [Hash] opts the optional parameters
    # @return [HosAuthenticationLogsResponse]
    def get_fleet_hos_authentication_logs(access_token, hos_authentication_logs_param, opts = {})
      data, _status_code, _headers = get_fleet_hos_authentication_logs_with_http_info(access_token, hos_authentication_logs_param, opts)
      data
    end

    # /fleet/hos_authentication_logs
    # Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.
    # @param access_token Samsara API access token.
    # @param hos_authentication_logs_param 
    # @param [Hash] opts the optional parameters
    # @return [Array<(HosAuthenticationLogsResponse, Fixnum, Hash)>] HosAuthenticationLogsResponse data, response status code and response headers
    def get_fleet_hos_authentication_logs_with_http_info(access_token, hos_authentication_logs_param, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: FleetApi.get_fleet_hos_authentication_logs ...'
      end
      # verify the required parameter 'access_token' is set
      if @api_client.config.client_side_validation && access_token.nil?
        fail ArgumentError, "Missing the required parameter 'access_token' when calling FleetApi.get_fleet_hos_authentication_logs"
      end
      # verify the required parameter 'hos_authentication_logs_param' is set
      if @api_client.config.client_side_validation && hos_authentication_logs_param.nil?
        fail ArgumentError, "Missing the required parameter 'hos_authentication_logs_param' when calling FleetApi.get_fleet_hos_authentication_logs"
      end
      # resource path
      local_var_path = '/fleet/hos_authentication_logs'

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
      post_body = @api_client.object_to_http_body(hos_authentication_logs_param)
      auth_names = []
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'HosAuthenticationLogsResponse')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: FleetApi#get_fleet_hos_authentication_logs\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # /fleet/hos_logs
    # Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.
    # @param access_token Samsara API access token.
    # @param hos_logs_param 
    # @param [Hash] opts the optional parameters
    # @return [HosLogsResponse]
    def get_fleet_hos_logs(access_token, hos_logs_param, opts = {})
      data, _status_code, _headers = get_fleet_hos_logs_with_http_info(access_token, hos_logs_param, opts)
      data
    end

    # /fleet/hos_logs
    # Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.
    # @param access_token Samsara API access token.
    # @param hos_logs_param 
    # @param [Hash] opts the optional parameters
    # @return [Array<(HosLogsResponse, Fixnum, Hash)>] HosLogsResponse data, response status code and response headers
    def get_fleet_hos_logs_with_http_info(access_token, hos_logs_param, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: FleetApi.get_fleet_hos_logs ...'
      end
      # verify the required parameter 'access_token' is set
      if @api_client.config.client_side_validation && access_token.nil?
        fail ArgumentError, "Missing the required parameter 'access_token' when calling FleetApi.get_fleet_hos_logs"
      end
      # verify the required parameter 'hos_logs_param' is set
      if @api_client.config.client_side_validation && hos_logs_param.nil?
        fail ArgumentError, "Missing the required parameter 'hos_logs_param' when calling FleetApi.get_fleet_hos_logs"
      end
      # resource path
      local_var_path = '/fleet/hos_logs'

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
      post_body = @api_client.object_to_http_body(hos_logs_param)
      auth_names = []
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'HosLogsResponse')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: FleetApi#get_fleet_hos_logs\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # /fleet/hos_logs_summary
    # Get the current HOS status for all drivers in the group.
    # @param access_token Samsara API access token.
    # @param hos_logs_param 
    # @param [Hash] opts the optional parameters
    # @return [HosLogsSummaryResponse]
    def get_fleet_hos_logs_summary(access_token, hos_logs_param, opts = {})
      data, _status_code, _headers = get_fleet_hos_logs_summary_with_http_info(access_token, hos_logs_param, opts)
      data
    end

    # /fleet/hos_logs_summary
    # Get the current HOS status for all drivers in the group.
    # @param access_token Samsara API access token.
    # @param hos_logs_param 
    # @param [Hash] opts the optional parameters
    # @return [Array<(HosLogsSummaryResponse, Fixnum, Hash)>] HosLogsSummaryResponse data, response status code and response headers
    def get_fleet_hos_logs_summary_with_http_info(access_token, hos_logs_param, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: FleetApi.get_fleet_hos_logs_summary ...'
      end
      # verify the required parameter 'access_token' is set
      if @api_client.config.client_side_validation && access_token.nil?
        fail ArgumentError, "Missing the required parameter 'access_token' when calling FleetApi.get_fleet_hos_logs_summary"
      end
      # verify the required parameter 'hos_logs_param' is set
      if @api_client.config.client_side_validation && hos_logs_param.nil?
        fail ArgumentError, "Missing the required parameter 'hos_logs_param' when calling FleetApi.get_fleet_hos_logs_summary"
      end
      # resource path
      local_var_path = '/fleet/hos_logs_summary'

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
      post_body = @api_client.object_to_http_body(hos_logs_param)
      auth_names = []
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'HosLogsSummaryResponse')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: FleetApi#get_fleet_hos_logs_summary\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # /fleet/locations
    # Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.
    # @param access_token Samsara API access token.
    # @param group_param 
    # @param [Hash] opts the optional parameters
    # @return [InlineResponse2003]
    def get_fleet_locations(access_token, group_param, opts = {})
      data, _status_code, _headers = get_fleet_locations_with_http_info(access_token, group_param, opts)
      data
    end

    # /fleet/locations
    # Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.
    # @param access_token Samsara API access token.
    # @param group_param 
    # @param [Hash] opts the optional parameters
    # @return [Array<(InlineResponse2003, Fixnum, Hash)>] InlineResponse2003 data, response status code and response headers
    def get_fleet_locations_with_http_info(access_token, group_param, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: FleetApi.get_fleet_locations ...'
      end
      # verify the required parameter 'access_token' is set
      if @api_client.config.client_side_validation && access_token.nil?
        fail ArgumentError, "Missing the required parameter 'access_token' when calling FleetApi.get_fleet_locations"
      end
      # verify the required parameter 'group_param' is set
      if @api_client.config.client_side_validation && group_param.nil?
        fail ArgumentError, "Missing the required parameter 'group_param' when calling FleetApi.get_fleet_locations"
      end
      # resource path
      local_var_path = '/fleet/locations'

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
      post_body = @api_client.object_to_http_body(group_param)
      auth_names = []
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'InlineResponse2003')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: FleetApi#get_fleet_locations\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # /fleet/maintenance/list
    # Get list of the vehicles with any engine faults or check light data.
    # @param access_token Samsara API access token.
    # @param group_param 
    # @param [Hash] opts the optional parameters
    # @return [InlineResponse2004]
    def get_fleet_maintenance_list(access_token, group_param, opts = {})
      data, _status_code, _headers = get_fleet_maintenance_list_with_http_info(access_token, group_param, opts)
      data
    end

    # /fleet/maintenance/list
    # Get list of the vehicles with any engine faults or check light data.
    # @param access_token Samsara API access token.
    # @param group_param 
    # @param [Hash] opts the optional parameters
    # @return [Array<(InlineResponse2004, Fixnum, Hash)>] InlineResponse2004 data, response status code and response headers
    def get_fleet_maintenance_list_with_http_info(access_token, group_param, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: FleetApi.get_fleet_maintenance_list ...'
      end
      # verify the required parameter 'access_token' is set
      if @api_client.config.client_side_validation && access_token.nil?
        fail ArgumentError, "Missing the required parameter 'access_token' when calling FleetApi.get_fleet_maintenance_list"
      end
      # verify the required parameter 'group_param' is set
      if @api_client.config.client_side_validation && group_param.nil?
        fail ArgumentError, "Missing the required parameter 'group_param' when calling FleetApi.get_fleet_maintenance_list"
      end
      # resource path
      local_var_path = '/fleet/maintenance/list'

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
      post_body = @api_client.object_to_http_body(group_param)
      auth_names = []
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'InlineResponse2004')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: FleetApi#get_fleet_maintenance_list\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # /fleet/trips
    # Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.
    # @param access_token Samsara API access token.
    # @param trips_param 
    # @param [Hash] opts the optional parameters
    # @return [TripResponse]
    def get_fleet_trips(access_token, trips_param, opts = {})
      data, _status_code, _headers = get_fleet_trips_with_http_info(access_token, trips_param, opts)
      data
    end

    # /fleet/trips
    # Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.
    # @param access_token Samsara API access token.
    # @param trips_param 
    # @param [Hash] opts the optional parameters
    # @return [Array<(TripResponse, Fixnum, Hash)>] TripResponse data, response status code and response headers
    def get_fleet_trips_with_http_info(access_token, trips_param, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: FleetApi.get_fleet_trips ...'
      end
      # verify the required parameter 'access_token' is set
      if @api_client.config.client_side_validation && access_token.nil?
        fail ArgumentError, "Missing the required parameter 'access_token' when calling FleetApi.get_fleet_trips"
      end
      # verify the required parameter 'trips_param' is set
      if @api_client.config.client_side_validation && trips_param.nil?
        fail ArgumentError, "Missing the required parameter 'trips_param' when calling FleetApi.get_fleet_trips"
      end
      # resource path
      local_var_path = '/fleet/trips'

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
      post_body = @api_client.object_to_http_body(trips_param)
      auth_names = []
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'TripResponse')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: FleetApi#get_fleet_trips\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
    # Gets a specific vehicle.
    # @param access_token Samsara API access token.
    # @param vehicle_id_or_external_id ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.
    # @param [Hash] opts the optional parameters
    # @return [FleetVehicleResponse]
    def get_fleet_vehicle(access_token, vehicle_id_or_external_id, opts = {})
      data, _status_code, _headers = get_fleet_vehicle_with_http_info(access_token, vehicle_id_or_external_id, opts)
      data
    end

    # /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
    # Gets a specific vehicle.
    # @param access_token Samsara API access token.
    # @param vehicle_id_or_external_id ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.
    # @param [Hash] opts the optional parameters
    # @return [Array<(FleetVehicleResponse, Fixnum, Hash)>] FleetVehicleResponse data, response status code and response headers
    def get_fleet_vehicle_with_http_info(access_token, vehicle_id_or_external_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: FleetApi.get_fleet_vehicle ...'
      end
      # verify the required parameter 'access_token' is set
      if @api_client.config.client_side_validation && access_token.nil?
        fail ArgumentError, "Missing the required parameter 'access_token' when calling FleetApi.get_fleet_vehicle"
      end
      # verify the required parameter 'vehicle_id_or_external_id' is set
      if @api_client.config.client_side_validation && vehicle_id_or_external_id.nil?
        fail ArgumentError, "Missing the required parameter 'vehicle_id_or_external_id' when calling FleetApi.get_fleet_vehicle"
      end
      # resource path
      local_var_path = '/fleet/vehicles/{vehicle_id_or_external_id}'.sub('{' + 'vehicle_id_or_external_id' + '}', vehicle_id_or_external_id.to_s)

      # query parameters
      query_params = {}
      query_params[:'access_token'] = access_token

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

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
        :return_type => 'FleetVehicleResponse')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: FleetApi#get_fleet_vehicle\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # /addresses/{addressId}
    # Fetch an address by its id.
    # @param access_token Samsara API access token.
    # @param address_id ID of the address/geofence
    # @param [Hash] opts the optional parameters
    # @return [Address]
    def get_organization_address(access_token, address_id, opts = {})
      data, _status_code, _headers = get_organization_address_with_http_info(access_token, address_id, opts)
      data
    end

    # /addresses/{addressId}
    # Fetch an address by its id.
    # @param access_token Samsara API access token.
    # @param address_id ID of the address/geofence
    # @param [Hash] opts the optional parameters
    # @return [Array<(Address, Fixnum, Hash)>] Address data, response status code and response headers
    def get_organization_address_with_http_info(access_token, address_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: FleetApi.get_organization_address ...'
      end
      # verify the required parameter 'access_token' is set
      if @api_client.config.client_side_validation && access_token.nil?
        fail ArgumentError, "Missing the required parameter 'access_token' when calling FleetApi.get_organization_address"
      end
      # verify the required parameter 'address_id' is set
      if @api_client.config.client_side_validation && address_id.nil?
        fail ArgumentError, "Missing the required parameter 'address_id' when calling FleetApi.get_organization_address"
      end
      # resource path
      local_var_path = '/addresses/{addressId}'.sub('{' + 'addressId' + '}', address_id.to_s)

      # query parameters
      query_params = {}
      query_params[:'access_token'] = access_token

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

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
        :return_type => 'Address')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: FleetApi#get_organization_address\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # /addresses
    # Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.
    # @param access_token Samsara API access token.
    # @param [Hash] opts the optional parameters
    # @return [Array<Address>]
    def get_organization_addresses(access_token, opts = {})
      data, _status_code, _headers = get_organization_addresses_with_http_info(access_token, opts)
      data
    end

    # /addresses
    # Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.
    # @param access_token Samsara API access token.
    # @param [Hash] opts the optional parameters
    # @return [Array<(Array<Address>, Fixnum, Hash)>] Array<Address> data, response status code and response headers
    def get_organization_addresses_with_http_info(access_token, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: FleetApi.get_organization_addresses ...'
      end
      # verify the required parameter 'access_token' is set
      if @api_client.config.client_side_validation && access_token.nil?
        fail ArgumentError, "Missing the required parameter 'access_token' when calling FleetApi.get_organization_addresses"
      end
      # resource path
      local_var_path = '/addresses'

      # query parameters
      query_params = {}
      query_params[:'access_token'] = access_token

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

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
        :return_type => 'Array<Address>')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: FleetApi#get_organization_addresses\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # /contacts/{contact_id}
    # Fetch a contact by its id.
    # @param access_token Samsara API access token.
    # @param contact_id ID of the contact
    # @param [Hash] opts the optional parameters
    # @return [Contact]
    def get_organization_contact(access_token, contact_id, opts = {})
      data, _status_code, _headers = get_organization_contact_with_http_info(access_token, contact_id, opts)
      data
    end

    # /contacts/{contact_id}
    # Fetch a contact by its id.
    # @param access_token Samsara API access token.
    # @param contact_id ID of the contact
    # @param [Hash] opts the optional parameters
    # @return [Array<(Contact, Fixnum, Hash)>] Contact data, response status code and response headers
    def get_organization_contact_with_http_info(access_token, contact_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: FleetApi.get_organization_contact ...'
      end
      # verify the required parameter 'access_token' is set
      if @api_client.config.client_side_validation && access_token.nil?
        fail ArgumentError, "Missing the required parameter 'access_token' when calling FleetApi.get_organization_contact"
      end
      # verify the required parameter 'contact_id' is set
      if @api_client.config.client_side_validation && contact_id.nil?
        fail ArgumentError, "Missing the required parameter 'contact_id' when calling FleetApi.get_organization_contact"
      end
      # resource path
      local_var_path = '/contacts/{contact_id}'.sub('{' + 'contact_id' + '}', contact_id.to_s)

      # query parameters
      query_params = {}
      query_params[:'access_token'] = access_token

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

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
        :return_type => 'Contact')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: FleetApi#get_organization_contact\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
    # Fetch harsh event details for a vehicle.
    # @param vehicle_id ID of the vehicle
    # @param access_token Samsara API access token.
    # @param timestamp Timestamp in milliseconds representing the timestamp of a harsh event.
    # @param [Hash] opts the optional parameters
    # @return [VehicleHarshEventResponse]
    def get_vehicle_harsh_event(vehicle_id, access_token, timestamp, opts = {})
      data, _status_code, _headers = get_vehicle_harsh_event_with_http_info(vehicle_id, access_token, timestamp, opts)
      data
    end

    # /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
    # Fetch harsh event details for a vehicle.
    # @param vehicle_id ID of the vehicle
    # @param access_token Samsara API access token.
    # @param timestamp Timestamp in milliseconds representing the timestamp of a harsh event.
    # @param [Hash] opts the optional parameters
    # @return [Array<(VehicleHarshEventResponse, Fixnum, Hash)>] VehicleHarshEventResponse data, response status code and response headers
    def get_vehicle_harsh_event_with_http_info(vehicle_id, access_token, timestamp, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: FleetApi.get_vehicle_harsh_event ...'
      end
      # verify the required parameter 'vehicle_id' is set
      if @api_client.config.client_side_validation && vehicle_id.nil?
        fail ArgumentError, "Missing the required parameter 'vehicle_id' when calling FleetApi.get_vehicle_harsh_event"
      end
      # verify the required parameter 'access_token' is set
      if @api_client.config.client_side_validation && access_token.nil?
        fail ArgumentError, "Missing the required parameter 'access_token' when calling FleetApi.get_vehicle_harsh_event"
      end
      # verify the required parameter 'timestamp' is set
      if @api_client.config.client_side_validation && timestamp.nil?
        fail ArgumentError, "Missing the required parameter 'timestamp' when calling FleetApi.get_vehicle_harsh_event"
      end
      # resource path
      local_var_path = '/fleet/vehicles/{vehicleId}/safety/harsh_event'.sub('{' + 'vehicleId' + '}', vehicle_id.to_s)

      # query parameters
      query_params = {}
      query_params[:'access_token'] = access_token
      query_params[:'timestamp'] = timestamp

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

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
        :return_type => 'VehicleHarshEventResponse')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: FleetApi#get_vehicle_harsh_event\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # /fleet/vehicles/{vehicle_id:[0-9]+}/locations
    # Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.
    # @param access_token Samsara API access token.
    # @param vehicle_id ID of the vehicle with the associated routes.
    # @param start_ms Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour)
    # @param end_ms Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour)
    # @param [Hash] opts the optional parameters
    # @return [Array<FleetVehicleLocation>]
    def get_vehicle_locations(access_token, vehicle_id, start_ms, end_ms, opts = {})
      data, _status_code, _headers = get_vehicle_locations_with_http_info(access_token, vehicle_id, start_ms, end_ms, opts)
      data
    end

    # /fleet/vehicles/{vehicle_id:[0-9]+}/locations
    # Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.
    # @param access_token Samsara API access token.
    # @param vehicle_id ID of the vehicle with the associated routes.
    # @param start_ms Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour)
    # @param end_ms Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour)
    # @param [Hash] opts the optional parameters
    # @return [Array<(Array<FleetVehicleLocation>, Fixnum, Hash)>] Array<FleetVehicleLocation> data, response status code and response headers
    def get_vehicle_locations_with_http_info(access_token, vehicle_id, start_ms, end_ms, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: FleetApi.get_vehicle_locations ...'
      end
      # verify the required parameter 'access_token' is set
      if @api_client.config.client_side_validation && access_token.nil?
        fail ArgumentError, "Missing the required parameter 'access_token' when calling FleetApi.get_vehicle_locations"
      end
      # verify the required parameter 'vehicle_id' is set
      if @api_client.config.client_side_validation && vehicle_id.nil?
        fail ArgumentError, "Missing the required parameter 'vehicle_id' when calling FleetApi.get_vehicle_locations"
      end
      # verify the required parameter 'start_ms' is set
      if @api_client.config.client_side_validation && start_ms.nil?
        fail ArgumentError, "Missing the required parameter 'start_ms' when calling FleetApi.get_vehicle_locations"
      end
      # verify the required parameter 'end_ms' is set
      if @api_client.config.client_side_validation && end_ms.nil?
        fail ArgumentError, "Missing the required parameter 'end_ms' when calling FleetApi.get_vehicle_locations"
      end
      # resource path
      local_var_path = '/fleet/vehicles/{vehicle_id}/locations'.sub('{' + 'vehicle_id' + '}', vehicle_id.to_s)

      # query parameters
      query_params = {}
      query_params[:'access_token'] = access_token
      query_params[:'startMs'] = start_ms
      query_params[:'endMs'] = end_ms

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

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
        :return_type => 'Array<FleetVehicleLocation>')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: FleetApi#get_vehicle_locations\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
    # Fetch the safety score for the vehicle.
    # @param vehicle_id ID of the vehicle
    # @param access_token Samsara API access token.
    # @param start_ms Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
    # @param end_ms Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
    # @param [Hash] opts the optional parameters
    # @return [VehicleSafetyScoreResponse]
    def get_vehicle_safety_score(vehicle_id, access_token, start_ms, end_ms, opts = {})
      data, _status_code, _headers = get_vehicle_safety_score_with_http_info(vehicle_id, access_token, start_ms, end_ms, opts)
      data
    end

    # /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
    # Fetch the safety score for the vehicle.
    # @param vehicle_id ID of the vehicle
    # @param access_token Samsara API access token.
    # @param start_ms Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
    # @param end_ms Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
    # @param [Hash] opts the optional parameters
    # @return [Array<(VehicleSafetyScoreResponse, Fixnum, Hash)>] VehicleSafetyScoreResponse data, response status code and response headers
    def get_vehicle_safety_score_with_http_info(vehicle_id, access_token, start_ms, end_ms, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: FleetApi.get_vehicle_safety_score ...'
      end
      # verify the required parameter 'vehicle_id' is set
      if @api_client.config.client_side_validation && vehicle_id.nil?
        fail ArgumentError, "Missing the required parameter 'vehicle_id' when calling FleetApi.get_vehicle_safety_score"
      end
      # verify the required parameter 'access_token' is set
      if @api_client.config.client_side_validation && access_token.nil?
        fail ArgumentError, "Missing the required parameter 'access_token' when calling FleetApi.get_vehicle_safety_score"
      end
      # verify the required parameter 'start_ms' is set
      if @api_client.config.client_side_validation && start_ms.nil?
        fail ArgumentError, "Missing the required parameter 'start_ms' when calling FleetApi.get_vehicle_safety_score"
      end
      # verify the required parameter 'end_ms' is set
      if @api_client.config.client_side_validation && end_ms.nil?
        fail ArgumentError, "Missing the required parameter 'end_ms' when calling FleetApi.get_vehicle_safety_score"
      end
      # resource path
      local_var_path = '/fleet/vehicles/{vehicleId}/safety/score'.sub('{' + 'vehicleId' + '}', vehicle_id.to_s)

      # query parameters
      query_params = {}
      query_params[:'access_token'] = access_token
      query_params[:'startMs'] = start_ms
      query_params[:'endMs'] = end_ms

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

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
        :return_type => 'VehicleSafetyScoreResponse')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: FleetApi#get_vehicle_safety_score\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

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
    def get_vehicle_stats(access_token, start_ms, end_ms, opts = {})
      data, _status_code, _headers = get_vehicle_stats_with_http_info(access_token, start_ms, end_ms, opts)
      data
    end

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
    # @return [Array<(InlineResponse2005, Fixnum, Hash)>] InlineResponse2005 data, response status code and response headers
    def get_vehicle_stats_with_http_info(access_token, start_ms, end_ms, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: FleetApi.get_vehicle_stats ...'
      end
      # verify the required parameter 'access_token' is set
      if @api_client.config.client_side_validation && access_token.nil?
        fail ArgumentError, "Missing the required parameter 'access_token' when calling FleetApi.get_vehicle_stats"
      end
      # verify the required parameter 'start_ms' is set
      if @api_client.config.client_side_validation && start_ms.nil?
        fail ArgumentError, "Missing the required parameter 'start_ms' when calling FleetApi.get_vehicle_stats"
      end
      # verify the required parameter 'end_ms' is set
      if @api_client.config.client_side_validation && end_ms.nil?
        fail ArgumentError, "Missing the required parameter 'end_ms' when calling FleetApi.get_vehicle_stats"
      end
      allowable_values = ["engineState", "auxInput1", "auxInput2"]
      if @api_client.config.client_side_validation && opts[:'series'] && !allowable_values.include?(opts[:'series'])
        fail ArgumentError, "invalid value for \"series\", must be one of #{allowable_values}"
      end
      # resource path
      local_var_path = '/fleet/vehicles/stats'

      # query parameters
      query_params = {}
      query_params[:'access_token'] = access_token
      query_params[:'startMs'] = start_ms
      query_params[:'endMs'] = end_ms
      query_params[:'series'] = opts[:'series'] if !opts[:'series'].nil?
      query_params[:'tagIds'] = opts[:'tag_ids'] if !opts[:'tag_ids'].nil?
      query_params[:'startingAfter'] = opts[:'starting_after'] if !opts[:'starting_after'].nil?
      query_params[:'endingBefore'] = opts[:'ending_before'] if !opts[:'ending_before'].nil?
      query_params[:'limit'] = opts[:'limit'] if !opts[:'limit'].nil?

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

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
        :return_type => 'InlineResponse2005')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: FleetApi#get_vehicle_stats\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # /fleet/vehicles/locations
    # Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.
    # @param access_token Samsara API access token.
    # @param start_ms Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes)
    # @param end_ms Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes)
    # @param [Hash] opts the optional parameters
    # @return [Array<Object>]
    def get_vehicles_locations(access_token, start_ms, end_ms, opts = {})
      data, _status_code, _headers = get_vehicles_locations_with_http_info(access_token, start_ms, end_ms, opts)
      data
    end

    # /fleet/vehicles/locations
    # Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.
    # @param access_token Samsara API access token.
    # @param start_ms Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes)
    # @param end_ms Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes)
    # @param [Hash] opts the optional parameters
    # @return [Array<(Array<Object>, Fixnum, Hash)>] Array<Object> data, response status code and response headers
    def get_vehicles_locations_with_http_info(access_token, start_ms, end_ms, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: FleetApi.get_vehicles_locations ...'
      end
      # verify the required parameter 'access_token' is set
      if @api_client.config.client_side_validation && access_token.nil?
        fail ArgumentError, "Missing the required parameter 'access_token' when calling FleetApi.get_vehicles_locations"
      end
      # verify the required parameter 'start_ms' is set
      if @api_client.config.client_side_validation && start_ms.nil?
        fail ArgumentError, "Missing the required parameter 'start_ms' when calling FleetApi.get_vehicles_locations"
      end
      # verify the required parameter 'end_ms' is set
      if @api_client.config.client_side_validation && end_ms.nil?
        fail ArgumentError, "Missing the required parameter 'end_ms' when calling FleetApi.get_vehicles_locations"
      end
      # resource path
      local_var_path = '/fleet/vehicles/locations'

      # query parameters
      query_params = {}
      query_params[:'access_token'] = access_token
      query_params[:'startMs'] = start_ms
      query_params[:'endMs'] = end_ms

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

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
        :return_type => 'Array<Object>')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: FleetApi#get_vehicles_locations\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # /contacts
    # Fetch all contacts for the organization.
    # @param access_token Samsara API access token.
    # @param [Hash] opts the optional parameters
    # @return [Array<Contact>]
    def list_contacts(access_token, opts = {})
      data, _status_code, _headers = list_contacts_with_http_info(access_token, opts)
      data
    end

    # /contacts
    # Fetch all contacts for the organization.
    # @param access_token Samsara API access token.
    # @param [Hash] opts the optional parameters
    # @return [Array<(Array<Contact>, Fixnum, Hash)>] Array<Contact> data, response status code and response headers
    def list_contacts_with_http_info(access_token, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: FleetApi.list_contacts ...'
      end
      # verify the required parameter 'access_token' is set
      if @api_client.config.client_side_validation && access_token.nil?
        fail ArgumentError, "Missing the required parameter 'access_token' when calling FleetApi.list_contacts"
      end
      # resource path
      local_var_path = '/contacts'

      # query parameters
      query_params = {}
      query_params[:'access_token'] = access_token

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

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
        :return_type => 'Array<Contact>')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: FleetApi#list_contacts\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # /fleet/list
    # Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.
    # @param access_token Samsara API access token.
    # @param group_param 
    # @param [Hash] opts the optional parameters
    # @option opts [String] :starting_after Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter.
    # @option opts [String] :ending_before Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter.
    # @option opts [Integer] :limit Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;.
    # @return [InlineResponse2002]
    def list_fleet(access_token, group_param, opts = {})
      data, _status_code, _headers = list_fleet_with_http_info(access_token, group_param, opts)
      data
    end

    # /fleet/list
    # Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.
    # @param access_token Samsara API access token.
    # @param group_param 
    # @param [Hash] opts the optional parameters
    # @option opts [String] :starting_after Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter.
    # @option opts [String] :ending_before Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter.
    # @option opts [Integer] :limit Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;.
    # @return [Array<(InlineResponse2002, Fixnum, Hash)>] InlineResponse2002 data, response status code and response headers
    def list_fleet_with_http_info(access_token, group_param, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: FleetApi.list_fleet ...'
      end
      # verify the required parameter 'access_token' is set
      if @api_client.config.client_side_validation && access_token.nil?
        fail ArgumentError, "Missing the required parameter 'access_token' when calling FleetApi.list_fleet"
      end
      # verify the required parameter 'group_param' is set
      if @api_client.config.client_side_validation && group_param.nil?
        fail ArgumentError, "Missing the required parameter 'group_param' when calling FleetApi.list_fleet"
      end
      # resource path
      local_var_path = '/fleet/list'

      # query parameters
      query_params = {}
      query_params[:'access_token'] = access_token
      query_params[:'startingAfter'] = opts[:'starting_after'] if !opts[:'starting_after'].nil?
      query_params[:'endingBefore'] = opts[:'ending_before'] if !opts[:'ending_before'].nil?
      query_params[:'limit'] = opts[:'limit'] if !opts[:'limit'].nil?

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = @api_client.object_to_http_body(group_param)
      auth_names = []
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'InlineResponse2002')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: FleetApi#list_fleet\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
    # Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.
    # @param access_token Samsara API access token.
    # @param vehicle_id_or_external_id ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.
    # @param data 
    # @param [Hash] opts the optional parameters
    # @return [FleetVehicleResponse]
    def patch_fleet_vehicle(access_token, vehicle_id_or_external_id, data, opts = {})
      data, _status_code, _headers = patch_fleet_vehicle_with_http_info(access_token, vehicle_id_or_external_id, data, opts)
      data
    end

    # /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
    # Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.
    # @param access_token Samsara API access token.
    # @param vehicle_id_or_external_id ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.
    # @param data 
    # @param [Hash] opts the optional parameters
    # @return [Array<(FleetVehicleResponse, Fixnum, Hash)>] FleetVehicleResponse data, response status code and response headers
    def patch_fleet_vehicle_with_http_info(access_token, vehicle_id_or_external_id, data, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: FleetApi.patch_fleet_vehicle ...'
      end
      # verify the required parameter 'access_token' is set
      if @api_client.config.client_side_validation && access_token.nil?
        fail ArgumentError, "Missing the required parameter 'access_token' when calling FleetApi.patch_fleet_vehicle"
      end
      # verify the required parameter 'vehicle_id_or_external_id' is set
      if @api_client.config.client_side_validation && vehicle_id_or_external_id.nil?
        fail ArgumentError, "Missing the required parameter 'vehicle_id_or_external_id' when calling FleetApi.patch_fleet_vehicle"
      end
      # verify the required parameter 'data' is set
      if @api_client.config.client_side_validation && data.nil?
        fail ArgumentError, "Missing the required parameter 'data' when calling FleetApi.patch_fleet_vehicle"
      end
      # resource path
      local_var_path = '/fleet/vehicles/{vehicle_id_or_external_id}'.sub('{' + 'vehicle_id_or_external_id' + '}', vehicle_id_or_external_id.to_s)

      # query parameters
      query_params = {}
      query_params[:'access_token'] = access_token

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json', 'application/merge-patch+json'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = @api_client.object_to_http_body(data)
      auth_names = []
      data, status_code, headers = @api_client.call_api(:PATCH, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'FleetVehicleResponse')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: FleetApi#patch_fleet_vehicle\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
    # Reactivate the inactive driver having id.
    # @param access_token Samsara API access token.
    # @param driver_id_or_external_id ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
    # @param reactivate_driver_param 
    # @param [Hash] opts the optional parameters
    # @return [Driver]
    def reactivate_driver_by_id(access_token, driver_id_or_external_id, reactivate_driver_param, opts = {})
      data, _status_code, _headers = reactivate_driver_by_id_with_http_info(access_token, driver_id_or_external_id, reactivate_driver_param, opts)
      data
    end

    # /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
    # Reactivate the inactive driver having id.
    # @param access_token Samsara API access token.
    # @param driver_id_or_external_id ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
    # @param reactivate_driver_param 
    # @param [Hash] opts the optional parameters
    # @return [Array<(Driver, Fixnum, Hash)>] Driver data, response status code and response headers
    def reactivate_driver_by_id_with_http_info(access_token, driver_id_or_external_id, reactivate_driver_param, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: FleetApi.reactivate_driver_by_id ...'
      end
      # verify the required parameter 'access_token' is set
      if @api_client.config.client_side_validation && access_token.nil?
        fail ArgumentError, "Missing the required parameter 'access_token' when calling FleetApi.reactivate_driver_by_id"
      end
      # verify the required parameter 'driver_id_or_external_id' is set
      if @api_client.config.client_side_validation && driver_id_or_external_id.nil?
        fail ArgumentError, "Missing the required parameter 'driver_id_or_external_id' when calling FleetApi.reactivate_driver_by_id"
      end
      # verify the required parameter 'reactivate_driver_param' is set
      if @api_client.config.client_side_validation && reactivate_driver_param.nil?
        fail ArgumentError, "Missing the required parameter 'reactivate_driver_param' when calling FleetApi.reactivate_driver_by_id"
      end
      # resource path
      local_var_path = '/fleet/drivers/inactive/{driver_id_or_external_id}'.sub('{' + 'driver_id_or_external_id' + '}', driver_id_or_external_id.to_s)

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
      post_body = @api_client.object_to_http_body(reactivate_driver_param)
      auth_names = []
      data, status_code, headers = @api_client.call_api(:PUT, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Driver')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: FleetApi#reactivate_driver_by_id\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
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
        @api_client.config.logger.debug 'Calling API: FleetApi.update_dispatch_route_by_id ...'
      end
      # verify the required parameter 'access_token' is set
      if @api_client.config.client_side_validation && access_token.nil?
        fail ArgumentError, "Missing the required parameter 'access_token' when calling FleetApi.update_dispatch_route_by_id"
      end
      # verify the required parameter 'route_id' is set
      if @api_client.config.client_side_validation && route_id.nil?
        fail ArgumentError, "Missing the required parameter 'route_id' when calling FleetApi.update_dispatch_route_by_id"
      end
      # verify the required parameter 'update_dispatch_route_params' is set
      if @api_client.config.client_side_validation && update_dispatch_route_params.nil?
        fail ArgumentError, "Missing the required parameter 'update_dispatch_route_params' when calling FleetApi.update_dispatch_route_by_id"
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
        @api_client.config.logger.debug "API called: FleetApi#update_dispatch_route_by_id\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # /addresses/{addressId}
    # Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.
    # @param access_token Samsara API access token.
    # @param address_id ID of the address/geofence
    # @param address 
    # @param [Hash] opts the optional parameters
    # @return [nil]
    def update_organization_address(access_token, address_id, address, opts = {})
      update_organization_address_with_http_info(access_token, address_id, address, opts)
      nil
    end

    # /addresses/{addressId}
    # Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.
    # @param access_token Samsara API access token.
    # @param address_id ID of the address/geofence
    # @param address 
    # @param [Hash] opts the optional parameters
    # @return [Array<(nil, Fixnum, Hash)>] nil, response status code and response headers
    def update_organization_address_with_http_info(access_token, address_id, address, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: FleetApi.update_organization_address ...'
      end
      # verify the required parameter 'access_token' is set
      if @api_client.config.client_side_validation && access_token.nil?
        fail ArgumentError, "Missing the required parameter 'access_token' when calling FleetApi.update_organization_address"
      end
      # verify the required parameter 'address_id' is set
      if @api_client.config.client_side_validation && address_id.nil?
        fail ArgumentError, "Missing the required parameter 'address_id' when calling FleetApi.update_organization_address"
      end
      # verify the required parameter 'address' is set
      if @api_client.config.client_side_validation && address.nil?
        fail ArgumentError, "Missing the required parameter 'address' when calling FleetApi.update_organization_address"
      end
      # resource path
      local_var_path = '/addresses/{addressId}'.sub('{' + 'addressId' + '}', address_id.to_s)

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
      post_body = @api_client.object_to_http_body(address)
      auth_names = []
      data, status_code, headers = @api_client.call_api(:PATCH, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: FleetApi#update_organization_address\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # /fleet/set_data
    # This method enables the mutation of metadata for vehicles in the Samsara Cloud.
    # @param access_token Samsara API access token.
    # @param vehicle_update_param 
    # @param [Hash] opts the optional parameters
    # @return [nil]
    def update_vehicles(access_token, vehicle_update_param, opts = {})
      update_vehicles_with_http_info(access_token, vehicle_update_param, opts)
      nil
    end

    # /fleet/set_data
    # This method enables the mutation of metadata for vehicles in the Samsara Cloud.
    # @param access_token Samsara API access token.
    # @param vehicle_update_param 
    # @param [Hash] opts the optional parameters
    # @return [Array<(nil, Fixnum, Hash)>] nil, response status code and response headers
    def update_vehicles_with_http_info(access_token, vehicle_update_param, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: FleetApi.update_vehicles ...'
      end
      # verify the required parameter 'access_token' is set
      if @api_client.config.client_side_validation && access_token.nil?
        fail ArgumentError, "Missing the required parameter 'access_token' when calling FleetApi.update_vehicles"
      end
      # verify the required parameter 'vehicle_update_param' is set
      if @api_client.config.client_side_validation && vehicle_update_param.nil?
        fail ArgumentError, "Missing the required parameter 'vehicle_update_param' when calling FleetApi.update_vehicles"
      end
      # resource path
      local_var_path = '/fleet/set_data'

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
      post_body = @api_client.object_to_http_body(vehicle_update_param)
      auth_names = []
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: FleetApi#update_vehicles\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end

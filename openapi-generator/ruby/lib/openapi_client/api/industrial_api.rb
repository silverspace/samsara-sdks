=begin
#Samsara API

## Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).

OpenAPI spec version: 1.0.0

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 4.0.0-SNAPSHOT

=end

require 'uri'

module OpenapiClient
  class IndustrialApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # /industrial/data
    # Fetch all of the data inputs for a group.
    # @param access_token Samsara API access token.
    # @param [Hash] opts the optional parameters
    # @option opts [Integer] :group_id Optional group ID if the organization has multiple groups (uncommon).
    # @option opts [Integer] :start_ms Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs.
    # @option opts [Integer] :end_ms Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs.
    # @return [InlineResponse2006]
    def get_all_data_inputs(access_token, opts = {})
      data, _status_code, _headers = get_all_data_inputs_with_http_info(access_token, opts)
      data
    end

    # /industrial/data
    # Fetch all of the data inputs for a group.
    # @param access_token Samsara API access token.
    # @param [Hash] opts the optional parameters
    # @option opts [Integer] :group_id Optional group ID if the organization has multiple groups (uncommon).
    # @option opts [Integer] :start_ms Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs.
    # @option opts [Integer] :end_ms Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs.
    # @return [Array<(InlineResponse2006, Fixnum, Hash)>] InlineResponse2006 data, response status code and response headers
    def get_all_data_inputs_with_http_info(access_token, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: IndustrialApi.get_all_data_inputs ...'
      end
      # verify the required parameter 'access_token' is set
      if @api_client.config.client_side_validation && access_token.nil?
        fail ArgumentError, "Missing the required parameter 'access_token' when calling IndustrialApi.get_all_data_inputs"
      end
      # resource path
      local_var_path = '/industrial/data'

      # query parameters
      query_params = {}
      query_params[:'access_token'] = access_token
      query_params[:'group_id'] = opts[:'group_id'] if !opts[:'group_id'].nil?
      query_params[:'startMs'] = opts[:'start_ms'] if !opts[:'start_ms'].nil?
      query_params[:'endMs'] = opts[:'end_ms'] if !opts[:'end_ms'].nil?

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
        :return_type => 'InlineResponse2006')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: IndustrialApi#get_all_data_inputs\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # /industrial/data/{data_input_id:[0-9]+}
    # Fetch datapoints from a given data input.
    # @param access_token Samsara API access token.
    # @param data_input_id ID of the data input
    # @param [Hash] opts the optional parameters
    # @option opts [Integer] :start_ms Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs.
    # @option opts [Integer] :end_ms Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs.
    # @return [DataInputHistoryResponse]
    def get_data_input(access_token, data_input_id, opts = {})
      data, _status_code, _headers = get_data_input_with_http_info(access_token, data_input_id, opts)
      data
    end

    # /industrial/data/{data_input_id:[0-9]+}
    # Fetch datapoints from a given data input.
    # @param access_token Samsara API access token.
    # @param data_input_id ID of the data input
    # @param [Hash] opts the optional parameters
    # @option opts [Integer] :start_ms Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs.
    # @option opts [Integer] :end_ms Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs.
    # @return [Array<(DataInputHistoryResponse, Fixnum, Hash)>] DataInputHistoryResponse data, response status code and response headers
    def get_data_input_with_http_info(access_token, data_input_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: IndustrialApi.get_data_input ...'
      end
      # verify the required parameter 'access_token' is set
      if @api_client.config.client_side_validation && access_token.nil?
        fail ArgumentError, "Missing the required parameter 'access_token' when calling IndustrialApi.get_data_input"
      end
      # verify the required parameter 'data_input_id' is set
      if @api_client.config.client_side_validation && data_input_id.nil?
        fail ArgumentError, "Missing the required parameter 'data_input_id' when calling IndustrialApi.get_data_input"
      end
      # resource path
      local_var_path = '/industrial/data/{data_input_id}'.sub('{' + 'data_input_id' + '}', data_input_id.to_s)

      # query parameters
      query_params = {}
      query_params[:'access_token'] = access_token
      query_params[:'startMs'] = opts[:'start_ms'] if !opts[:'start_ms'].nil?
      query_params[:'endMs'] = opts[:'end_ms'] if !opts[:'end_ms'].nil?

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
        :return_type => 'DataInputHistoryResponse')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: IndustrialApi#get_data_input\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # /machines/list
    # Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and information about them.
    # @param access_token Samsara API access token.
    # @param group_param 
    # @param [Hash] opts the optional parameters
    # @return [InlineResponse2007]
    def get_machines(access_token, group_param, opts = {})
      data, _status_code, _headers = get_machines_with_http_info(access_token, group_param, opts)
      data
    end

    # /machines/list
    # Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and information about them.
    # @param access_token Samsara API access token.
    # @param group_param 
    # @param [Hash] opts the optional parameters
    # @return [Array<(InlineResponse2007, Fixnum, Hash)>] InlineResponse2007 data, response status code and response headers
    def get_machines_with_http_info(access_token, group_param, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: IndustrialApi.get_machines ...'
      end
      # verify the required parameter 'access_token' is set
      if @api_client.config.client_side_validation && access_token.nil?
        fail ArgumentError, "Missing the required parameter 'access_token' when calling IndustrialApi.get_machines"
      end
      # verify the required parameter 'group_param' is set
      if @api_client.config.client_side_validation && group_param.nil?
        fail ArgumentError, "Missing the required parameter 'group_param' when calling IndustrialApi.get_machines"
      end
      # resource path
      local_var_path = '/machines/list'

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
        :return_type => 'InlineResponse2007')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: IndustrialApi#get_machines\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # /machines/history
    # Get historical data for machine objects. This method returns a set of historical data for all machines in a group
    # @param access_token Samsara API access token.
    # @param history_param 
    # @param [Hash] opts the optional parameters
    # @return [MachineHistoryResponse]
    def get_machines_history(access_token, history_param, opts = {})
      data, _status_code, _headers = get_machines_history_with_http_info(access_token, history_param, opts)
      data
    end

    # /machines/history
    # Get historical data for machine objects. This method returns a set of historical data for all machines in a group
    # @param access_token Samsara API access token.
    # @param history_param 
    # @param [Hash] opts the optional parameters
    # @return [Array<(MachineHistoryResponse, Fixnum, Hash)>] MachineHistoryResponse data, response status code and response headers
    def get_machines_history_with_http_info(access_token, history_param, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: IndustrialApi.get_machines_history ...'
      end
      # verify the required parameter 'access_token' is set
      if @api_client.config.client_side_validation && access_token.nil?
        fail ArgumentError, "Missing the required parameter 'access_token' when calling IndustrialApi.get_machines_history"
      end
      # verify the required parameter 'history_param' is set
      if @api_client.config.client_side_validation && history_param.nil?
        fail ArgumentError, "Missing the required parameter 'history_param' when calling IndustrialApi.get_machines_history"
      end
      # resource path
      local_var_path = '/machines/history'

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
      post_body = @api_client.object_to_http_body(history_param)
      auth_names = []
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'MachineHistoryResponse')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: IndustrialApi#get_machines_history\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end

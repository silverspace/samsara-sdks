note
 description:"[
		Samsara API
 		# Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).
  		OpenAPI spec version: 1.0.0
 	    

  	NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

 		 Do not edit the class manually.
 	]"
	date: "$Date$"
	revision: "$Revision$"
	EIS:"Eiffel openapi generator", "src=https://openapi-generator.tech", "protocol=uri"

class
	ROUTES_API

inherit

    API_I


feature -- API Access


	create_dispatch_route (access_token: STRING_32; create_dispatch_route_params: DISPATCH_ROUTE_CREATE): detachable DISPATCH_ROUTE
			-- /fleet/dispatch/routes
			-- Create a new dispatch route.
			-- 
			-- argument: access_token Samsara API access token. (required)
			-- 
			-- argument: create_dispatch_route_params  (required)
			-- 
			-- 
			-- Result DISPATCH_ROUTE
		require
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			l_request.set_body(create_dispatch_route_params)
			l_path := "/fleet/dispatch/routes"
			l_request.fill_query_params(api_client.parameter_to_tuple("", "access_token", access_token));


			if attached {STRING} api_client.select_header_accept (<<"application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type (<<"application/json">>),"Content-Type")
			l_request.set_auth_names (<<>>)
			l_response := api_client.call_api (l_path, "Post", l_request, Void, agent deserializer)
			if l_response.has_error then
				last_error := l_response.error
			elseif attached { DISPATCH_ROUTE } l_response.data ({ DISPATCH_ROUTE }) as l_data then
				Result := l_data
			else
				create last_error.make ("Unknown error: Status response [ " + l_response.status.out + "]")
			end
		end	

	create_driver_dispatch_route (access_token: STRING_32; driver_id: INTEGER_64; create_dispatch_route_params: DISPATCH_ROUTE_CREATE): detachable DISPATCH_ROUTE
			-- /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
			-- Create a new dispatch route for the driver with driver_id.
			-- 
			-- argument: access_token Samsara API access token. (required)
			-- 
			-- argument: driver_id ID of the driver with the associated routes. (required)
			-- 
			-- argument: create_dispatch_route_params  (required)
			-- 
			-- 
			-- Result DISPATCH_ROUTE
		require
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			l_request.set_body(create_dispatch_route_params)
			l_path := "/fleet/drivers/{driver_id}/dispatch/routes"
			l_path.replace_substring_all ("{"+"driver_id"+"}", api_client.url_encode (driver_id.out))
			l_request.fill_query_params(api_client.parameter_to_tuple("", "access_token", access_token));


			if attached {STRING} api_client.select_header_accept (<<"application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type (<<"application/json">>),"Content-Type")
			l_request.set_auth_names (<<>>)
			l_response := api_client.call_api (l_path, "Post", l_request, Void, agent deserializer)
			if l_response.has_error then
				last_error := l_response.error
			elseif attached { DISPATCH_ROUTE } l_response.data ({ DISPATCH_ROUTE }) as l_data then
				Result := l_data
			else
				create last_error.make ("Unknown error: Status response [ " + l_response.status.out + "]")
			end
		end	

	create_vehicle_dispatch_route (access_token: STRING_32; vehicle_id: INTEGER_64; create_dispatch_route_params: DISPATCH_ROUTE_CREATE): detachable DISPATCH_ROUTE
			-- /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
			-- Create a new dispatch route for the vehicle with vehicle_id.
			-- 
			-- argument: access_token Samsara API access token. (required)
			-- 
			-- argument: vehicle_id ID of the vehicle with the associated routes. (required)
			-- 
			-- argument: create_dispatch_route_params  (required)
			-- 
			-- 
			-- Result DISPATCH_ROUTE
		require
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			l_request.set_body(create_dispatch_route_params)
			l_path := "/fleet/vehicles/{vehicle_id}/dispatch/routes"
			l_path.replace_substring_all ("{"+"vehicle_id"+"}", api_client.url_encode (vehicle_id.out))
			l_request.fill_query_params(api_client.parameter_to_tuple("", "access_token", access_token));


			if attached {STRING} api_client.select_header_accept (<<"application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type (<<"application/json">>),"Content-Type")
			l_request.set_auth_names (<<>>)
			l_response := api_client.call_api (l_path, "Post", l_request, Void, agent deserializer)
			if l_response.has_error then
				last_error := l_response.error
			elseif attached { DISPATCH_ROUTE } l_response.data ({ DISPATCH_ROUTE }) as l_data then
				Result := l_data
			else
				create last_error.make ("Unknown error: Status response [ " + l_response.status.out + "]")
			end
		end	

	delete_dispatch_route_by_id (access_token: STRING_32; route_id: INTEGER_64)
			-- /fleet/dispatch/routes/{route_id:[0-9]+}/
			-- Delete a dispatch route and its associated jobs.
			-- 
			-- argument: access_token Samsara API access token. (required)
			-- 
			-- argument: route_id ID of the dispatch route. (required)
			-- 
			-- 
		require
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			
			l_path := "/fleet/dispatch/routes/{route_id}"
			l_path.replace_substring_all ("{"+"route_id"+"}", api_client.url_encode (route_id.out))
			l_request.fill_query_params(api_client.parameter_to_tuple("", "access_token", access_token));


			if attached {STRING} api_client.select_header_accept (<<"application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type (<<>>),"Content-Type")
			l_request.set_auth_names (<<>>)
			l_response := api_client.call_api (l_path, "Delete", l_request, agent serializer, Void)
			if l_response.has_error then
				last_error := l_response.error
			end
		end	

	dispatch_route_by_id (access_token: STRING_32; route_id: INTEGER_64): detachable DISPATCH_ROUTE
			-- /fleet/dispatch/routes/{route_id:[0-9]+}
			-- Fetch a dispatch route by id.
			-- 
			-- argument: access_token Samsara API access token. (required)
			-- 
			-- argument: route_id ID of the dispatch route. (required)
			-- 
			-- 
			-- Result DISPATCH_ROUTE
		require
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			
			l_path := "/fleet/dispatch/routes/{route_id}"
			l_path.replace_substring_all ("{"+"route_id"+"}", api_client.url_encode (route_id.out))
			l_request.fill_query_params(api_client.parameter_to_tuple("", "access_token", access_token));


			if attached {STRING} api_client.select_header_accept (<<"application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type (<<>>),"Content-Type")
			l_request.set_auth_names (<<>>)
			l_response := api_client.call_api (l_path, "Get", l_request, Void, agent deserializer)
			if l_response.has_error then
				last_error := l_response.error
			elseif attached { DISPATCH_ROUTE } l_response.data ({ DISPATCH_ROUTE }) as l_data then
				Result := l_data
			else
				create last_error.make ("Unknown error: Status response [ " + l_response.status.out + "]")
			end
		end	

	dispatch_route_history (access_token: STRING_32; route_id: INTEGER_64; start_time: INTEGER_64; end_time: INTEGER_64): detachable DISPATCH_ROUTE_HISTORY
			-- /fleet/dispatch/routes/{route_id:[0-9]+}/history
			-- Fetch the history of a dispatch route.
			-- 
			-- argument: access_token Samsara API access token. (required)
			-- 
			-- argument: route_id ID of the route with history. (required)
			-- 
			-- argument: start_time Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0. (optional, default to null)
			-- 
			-- argument: end_time Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs. (optional, default to null)
			-- 
			-- 
			-- Result DISPATCH_ROUTE_HISTORY
		require
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			
			l_path := "/fleet/dispatch/routes/{route_id}/history"
			l_path.replace_substring_all ("{"+"route_id"+"}", api_client.url_encode (route_id.out))
			l_request.fill_query_params(api_client.parameter_to_tuple("", "access_token", access_token));
			l_request.fill_query_params(api_client.parameter_to_tuple("", "start_time", start_time));
			l_request.fill_query_params(api_client.parameter_to_tuple("", "end_time", end_time));


			if attached {STRING} api_client.select_header_accept (<<"application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type (<<>>),"Content-Type")
			l_request.set_auth_names (<<>>)
			l_response := api_client.call_api (l_path, "Get", l_request, Void, agent deserializer)
			if l_response.has_error then
				last_error := l_response.error
			elseif attached { DISPATCH_ROUTE_HISTORY } l_response.data ({ DISPATCH_ROUTE_HISTORY }) as l_data then
				Result := l_data
			else
				create last_error.make ("Unknown error: Status response [ " + l_response.status.out + "]")
			end
		end	

	dispatch_routes_by_driver_id (access_token: STRING_32; driver_id: INTEGER_64; end_time: INTEGER_64; duration: INTEGER_64): detachable LIST [DISPATCH_ROUTE]
			-- /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
			-- Fetch all of the dispatch routes for a given driver.
			-- 
			-- argument: access_token Samsara API access token. (required)
			-- 
			-- argument: driver_id ID of the driver with the associated routes. (required)
			-- 
			-- argument: end_time Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional, default to null)
			-- 
			-- argument: duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional, default to null)
			-- 
			-- 
			-- Result LIST [DISPATCH_ROUTE]
		require
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			
			l_path := "/fleet/drivers/{driver_id}/dispatch/routes"
			l_path.replace_substring_all ("{"+"driver_id"+"}", api_client.url_encode (driver_id.out))
			l_request.fill_query_params(api_client.parameter_to_tuple("", "access_token", access_token));
			l_request.fill_query_params(api_client.parameter_to_tuple("", "end_time", end_time));
			l_request.fill_query_params(api_client.parameter_to_tuple("", "duration", duration));


			if attached {STRING} api_client.select_header_accept (<<"application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type (<<>>),"Content-Type")
			l_request.set_auth_names (<<>>)
			l_response := api_client.call_api (l_path, "Get", l_request, Void, agent deserializer)
			if l_response.has_error then
				last_error := l_response.error
			elseif attached { LIST [DISPATCH_ROUTE] } l_response.data ({ LIST [DISPATCH_ROUTE] }) as l_data then
				Result := l_data
			else
				create last_error.make ("Unknown error: Status response [ " + l_response.status.out + "]")
			end
		end	

	dispatch_routes_by_vehicle_id (access_token: STRING_32; vehicle_id: INTEGER_64; end_time: INTEGER_64; duration: INTEGER_64): detachable LIST [DISPATCH_ROUTE]
			-- /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
			-- Fetch all of the dispatch routes for a given vehicle.
			-- 
			-- argument: access_token Samsara API access token. (required)
			-- 
			-- argument: vehicle_id ID of the vehicle with the associated routes. (required)
			-- 
			-- argument: end_time Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional, default to null)
			-- 
			-- argument: duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional, default to null)
			-- 
			-- 
			-- Result LIST [DISPATCH_ROUTE]
		require
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			
			l_path := "/fleet/vehicles/{vehicle_id}/dispatch/routes"
			l_path.replace_substring_all ("{"+"vehicle_id"+"}", api_client.url_encode (vehicle_id.out))
			l_request.fill_query_params(api_client.parameter_to_tuple("", "access_token", access_token));
			l_request.fill_query_params(api_client.parameter_to_tuple("", "end_time", end_time));
			l_request.fill_query_params(api_client.parameter_to_tuple("", "duration", duration));


			if attached {STRING} api_client.select_header_accept (<<"application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type (<<>>),"Content-Type")
			l_request.set_auth_names (<<>>)
			l_response := api_client.call_api (l_path, "Get", l_request, Void, agent deserializer)
			if l_response.has_error then
				last_error := l_response.error
			elseif attached { LIST [DISPATCH_ROUTE] } l_response.data ({ LIST [DISPATCH_ROUTE] }) as l_data then
				Result := l_data
			else
				create last_error.make ("Unknown error: Status response [ " + l_response.status.out + "]")
			end
		end	

	fetch_all_dispatch_routes (access_token: STRING_32; group_id: INTEGER_64; end_time: INTEGER_64; duration: INTEGER_64): detachable LIST [DISPATCH_ROUTE]
			-- /fleet/dispatch/routes
			-- Fetch all of the dispatch routes for the group.
			-- 
			-- argument: access_token Samsara API access token. (required)
			-- 
			-- argument: group_id Optional group ID if the organization has multiple groups (uncommon). (optional, default to null)
			-- 
			-- argument: end_time Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional, default to null)
			-- 
			-- argument: duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional, default to null)
			-- 
			-- 
			-- Result LIST [DISPATCH_ROUTE]
		require
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			
			l_path := "/fleet/dispatch/routes"
			l_request.fill_query_params(api_client.parameter_to_tuple("", "access_token", access_token));
			l_request.fill_query_params(api_client.parameter_to_tuple("", "group_id", group_id));
			l_request.fill_query_params(api_client.parameter_to_tuple("", "end_time", end_time));
			l_request.fill_query_params(api_client.parameter_to_tuple("", "duration", duration));


			if attached {STRING} api_client.select_header_accept (<<"application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type (<<>>),"Content-Type")
			l_request.set_auth_names (<<>>)
			l_response := api_client.call_api (l_path, "Get", l_request, Void, agent deserializer)
			if l_response.has_error then
				last_error := l_response.error
			elseif attached { LIST [DISPATCH_ROUTE] } l_response.data ({ LIST [DISPATCH_ROUTE] }) as l_data then
				Result := l_data
			else
				create last_error.make ("Unknown error: Status response [ " + l_response.status.out + "]")
			end
		end	

	fetch_all_route_job_updates (access_token: STRING_32; group_id: INTEGER_64; sequence_id: STRING_32; include: STRING_32): detachable ALL_ROUTE_JOB_UPDATES
			-- /fleet/dispatch/routes/job_updates
			-- Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
			-- 
			-- argument: access_token Samsara API access token. (required)
			-- 
			-- argument: group_id Optional group ID if the organization has multiple groups (uncommon). (optional, default to null)
			-- 
			-- argument: sequence_id Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours. (optional, default to null)
			-- 
			-- argument: include Optionally set include&#x3D;route to include route object in response payload. (optional, default to null)
			-- 
			-- 
			-- Result ALL_ROUTE_JOB_UPDATES
		require
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			
			l_path := "/fleet/dispatch/routes/job_updates"
			l_request.fill_query_params(api_client.parameter_to_tuple("", "access_token", access_token));
			l_request.fill_query_params(api_client.parameter_to_tuple("", "group_id", group_id));
			l_request.fill_query_params(api_client.parameter_to_tuple("", "sequence_id", sequence_id));
			l_request.fill_query_params(api_client.parameter_to_tuple("", "include", include));


			if attached {STRING} api_client.select_header_accept (<<"application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type (<<>>),"Content-Type")
			l_request.set_auth_names (<<>>)
			l_response := api_client.call_api (l_path, "Get", l_request, Void, agent deserializer)
			if l_response.has_error then
				last_error := l_response.error
			elseif attached { ALL_ROUTE_JOB_UPDATES } l_response.data ({ ALL_ROUTE_JOB_UPDATES }) as l_data then
				Result := l_data
			else
				create last_error.make ("Unknown error: Status response [ " + l_response.status.out + "]")
			end
		end	

	update_dispatch_route_by_id (access_token: STRING_32; route_id: INTEGER_64; update_dispatch_route_params: DISPATCH_ROUTE): detachable DISPATCH_ROUTE
			-- /fleet/dispatch/routes/{route_id:[0-9]+}/
			-- Update a dispatch route and its associated jobs.
			-- 
			-- argument: access_token Samsara API access token. (required)
			-- 
			-- argument: route_id ID of the dispatch route. (required)
			-- 
			-- argument: update_dispatch_route_params  (required)
			-- 
			-- 
			-- Result DISPATCH_ROUTE
		require
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			l_request.set_body(update_dispatch_route_params)
			l_path := "/fleet/dispatch/routes/{route_id}"
			l_path.replace_substring_all ("{"+"route_id"+"}", api_client.url_encode (route_id.out))
			l_request.fill_query_params(api_client.parameter_to_tuple("", "access_token", access_token));


			if attached {STRING} api_client.select_header_accept (<<"application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type (<<"application/json">>),"Content-Type")
			l_request.set_auth_names (<<>>)
			l_response := api_client.call_api (l_path, "Put", l_request, Void, agent deserializer)
			if l_response.has_error then
				last_error := l_response.error
			elseif attached { DISPATCH_ROUTE } l_response.data ({ DISPATCH_ROUTE }) as l_data then
				Result := l_data
			else
				create last_error.make ("Unknown error: Status response [ " + l_response.status.out + "]")
			end
		end	


end

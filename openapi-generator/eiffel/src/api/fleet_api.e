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
	FLEET_API

inherit

    API_I


feature -- API Access


	add_fleet_address (access_token: STRING_32; address_param: INLINE_OBJECT_2)
			-- /fleet/add_address
			-- This method adds an address book entry to the specified group.
			-- 
			-- argument: access_token Samsara API access token. (required)
			-- 
			-- argument: address_param  (required)
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
			l_request.set_body(address_param)
			l_path := "/fleet/add_address"
			l_request.fill_query_params(api_client.parameter_to_tuple("", "access_token", access_token));


			if attached {STRING} api_client.select_header_accept (<<"application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type (<<"application/json">>),"Content-Type")
			l_request.set_auth_names (<<>>)
			l_response := api_client.call_api (l_path, "Post", l_request, agent serializer, Void)
			if l_response.has_error then
				last_error := l_response.error
			end
		end	

	add_organization_addresses (access_token: STRING_32; addresses: INLINE_OBJECT): detachable LIST [ADDRESS]
			-- /addresses
			-- Add one or more addresses to the organization
			-- 
			-- argument: access_token Samsara API access token. (required)
			-- 
			-- argument: addresses  (required)
			-- 
			-- 
			-- Result LIST [ADDRESS]
		require
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			l_request.set_body(addresses)
			l_path := "/addresses"
			l_request.fill_query_params(api_client.parameter_to_tuple("", "access_token", access_token));


			if attached {STRING} api_client.select_header_accept (<<"application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type (<<"application/json">>),"Content-Type")
			l_request.set_auth_names (<<>>)
			l_response := api_client.call_api (l_path, "Post", l_request, Void, agent deserializer)
			if l_response.has_error then
				last_error := l_response.error
			elseif attached { LIST [ADDRESS] } l_response.data ({ LIST [ADDRESS] }) as l_data then
				Result := l_data
			else
				create last_error.make ("Unknown error: Status response [ " + l_response.status.out + "]")
			end
		end	

	all_asset_current_locations (access_token: STRING_32; group_id: INTEGER_64): detachable INLINE_RESPONSE_200_1
			-- /fleet/assets/locations
			-- Fetch current locations of all assets for the group.
			-- 
			-- argument: access_token Samsara API access token. (required)
			-- 
			-- argument: group_id Optional group ID if the organization has multiple groups (uncommon). (optional, default to null)
			-- 
			-- 
			-- Result INLINE_RESPONSE_200_1
		require
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			
			l_path := "/fleet/assets/locations"
			l_request.fill_query_params(api_client.parameter_to_tuple("", "access_token", access_token));
			l_request.fill_query_params(api_client.parameter_to_tuple("", "group_id", group_id));


			if attached {STRING} api_client.select_header_accept (<<"application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type (<<>>),"Content-Type")
			l_request.set_auth_names (<<>>)
			l_response := api_client.call_api (l_path, "Get", l_request, Void, agent deserializer)
			if l_response.has_error then
				last_error := l_response.error
			elseif attached { INLINE_RESPONSE_200_1 } l_response.data ({ INLINE_RESPONSE_200_1 }) as l_data then
				Result := l_data
			else
				create last_error.make ("Unknown error: Status response [ " + l_response.status.out + "]")
			end
		end	

	all_assets (access_token: STRING_32; group_id: INTEGER_64): detachable INLINE_RESPONSE_200
			-- /fleet/assets
			-- Fetch all of the assets for the group.
			-- 
			-- argument: access_token Samsara API access token. (required)
			-- 
			-- argument: group_id Optional group ID if the organization has multiple groups (uncommon). (optional, default to null)
			-- 
			-- 
			-- Result INLINE_RESPONSE_200
		require
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			
			l_path := "/fleet/assets"
			l_request.fill_query_params(api_client.parameter_to_tuple("", "access_token", access_token));
			l_request.fill_query_params(api_client.parameter_to_tuple("", "group_id", group_id));


			if attached {STRING} api_client.select_header_accept (<<"application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type (<<>>),"Content-Type")
			l_request.set_auth_names (<<>>)
			l_response := api_client.call_api (l_path, "Get", l_request, Void, agent deserializer)
			if l_response.has_error then
				last_error := l_response.error
			elseif attached { INLINE_RESPONSE_200 } l_response.data ({ INLINE_RESPONSE_200 }) as l_data then
				Result := l_data
			else
				create last_error.make ("Unknown error: Status response [ " + l_response.status.out + "]")
			end
		end	

	all_deactivated_drivers (access_token: STRING_32; group_id: INTEGER_64): detachable LIST [DRIVER]
			-- /fleet/drivers/inactive
			-- Fetch all deactivated drivers for the group.
			-- 
			-- argument: access_token Samsara API access token. (required)
			-- 
			-- argument: group_id Optional group ID if the organization has multiple groups (uncommon). (optional, default to null)
			-- 
			-- 
			-- Result LIST [DRIVER]
		require
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			
			l_path := "/fleet/drivers/inactive"
			l_request.fill_query_params(api_client.parameter_to_tuple("", "access_token", access_token));
			l_request.fill_query_params(api_client.parameter_to_tuple("", "group_id", group_id));


			if attached {STRING} api_client.select_header_accept (<<"application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type (<<>>),"Content-Type")
			l_request.set_auth_names (<<>>)
			l_response := api_client.call_api (l_path, "Get", l_request, Void, agent deserializer)
			if l_response.has_error then
				last_error := l_response.error
			elseif attached { LIST [DRIVER] } l_response.data ({ LIST [DRIVER] }) as l_data then
				Result := l_data
			else
				create last_error.make ("Unknown error: Status response [ " + l_response.status.out + "]")
			end
		end	

	asset_location (access_token: STRING_32; asset_id: INTEGER_64; start_ms: INTEGER_64; end_ms: INTEGER_64): detachable LIST [ANY]
			-- /fleet/assets/{assetId:[0-9]+}/locations
			-- Fetch the historical locations for the asset.
			-- 
			-- argument: access_token Samsara API access token. (required)
			-- 
			-- argument: asset_id ID of the asset (required)
			-- 
			-- argument: start_ms Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. (required)
			-- 
			-- argument: end_ms Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. (required)
			-- 
			-- 
			-- Result LIST [ANY]
		require
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			
			l_path := "/fleet/assets/{asset_id}/locations"
			l_path.replace_substring_all ("{"+"asset_id"+"}", api_client.url_encode (asset_id.out))
			l_request.fill_query_params(api_client.parameter_to_tuple("", "access_token", access_token));
			l_request.fill_query_params(api_client.parameter_to_tuple("", "startMs", start_ms));
			l_request.fill_query_params(api_client.parameter_to_tuple("", "endMs", end_ms));


			if attached {STRING} api_client.select_header_accept (<<"application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type (<<>>),"Content-Type")
			l_request.set_auth_names (<<>>)
			l_response := api_client.call_api (l_path, "Get", l_request, Void, agent deserializer)
			if l_response.has_error then
				last_error := l_response.error
			elseif attached { LIST [ANY] } l_response.data ({ LIST [ANY] }) as l_data then
				Result := l_data
			else
				create last_error.make ("Unknown error: Status response [ " + l_response.status.out + "]")
			end
		end	

	asset_reefer (access_token: STRING_32; asset_id: INTEGER_64; start_ms: INTEGER_64; end_ms: INTEGER_64): detachable ASSET_REEFER_RESPONSE
			-- /fleet/assets/{assetId:[0-9]+}/reefer
			-- Fetch the reefer-specific stats of an asset.
			-- 
			-- argument: access_token Samsara API access token. (required)
			-- 
			-- argument: asset_id ID of the asset (required)
			-- 
			-- argument: start_ms Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. (required)
			-- 
			-- argument: end_ms Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. (required)
			-- 
			-- 
			-- Result ASSET_REEFER_RESPONSE
		require
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			
			l_path := "/fleet/assets/{asset_id}/reefer"
			l_path.replace_substring_all ("{"+"asset_id"+"}", api_client.url_encode (asset_id.out))
			l_request.fill_query_params(api_client.parameter_to_tuple("", "access_token", access_token));
			l_request.fill_query_params(api_client.parameter_to_tuple("", "startMs", start_ms));
			l_request.fill_query_params(api_client.parameter_to_tuple("", "endMs", end_ms));


			if attached {STRING} api_client.select_header_accept (<<"application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type (<<>>),"Content-Type")
			l_request.set_auth_names (<<>>)
			l_response := api_client.call_api (l_path, "Get", l_request, Void, agent deserializer)
			if l_response.has_error then
				last_error := l_response.error
			elseif attached { ASSET_REEFER_RESPONSE } l_response.data ({ ASSET_REEFER_RESPONSE }) as l_data then
				Result := l_data
			else
				create last_error.make ("Unknown error: Status response [ " + l_response.status.out + "]")
			end
		end	

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

	create_driver (access_token: STRING_32; create_driver_param: DRIVER_FOR_CREATE): detachable DRIVER
			-- /fleet/drivers/create
			-- Create a new driver.
			-- 
			-- argument: access_token Samsara API access token. (required)
			-- 
			-- argument: create_driver_param Driver creation body (required)
			-- 
			-- 
			-- Result DRIVER
		require
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			l_request.set_body(create_driver_param)
			l_path := "/fleet/drivers/create"
			l_request.fill_query_params(api_client.parameter_to_tuple("", "access_token", access_token));


			if attached {STRING} api_client.select_header_accept (<<"application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type (<<"application/json">>),"Content-Type")
			l_request.set_auth_names (<<>>)
			l_response := api_client.call_api (l_path, "Post", l_request, Void, agent deserializer)
			if l_response.has_error then
				last_error := l_response.error
			elseif attached { DRIVER } l_response.data ({ DRIVER }) as l_data then
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

	create_driver_document (access_token: STRING_32; driver_id: INTEGER_64; create_document_params: DOCUMENT_CREATE): detachable DOCUMENT
			-- /fleet/drivers/{driver_id:[0-9]+}/documents
			-- Create a driver document for the given driver.
			-- 
			-- argument: access_token Samsara API access token. (required)
			-- 
			-- argument: driver_id ID of the driver for whom the document is created. (required)
			-- 
			-- argument: create_document_params To create a document for a given document type, the document type&#39;s uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field&#39;s valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_. (required)
			-- 
			-- 
			-- Result DOCUMENT
		require
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			l_request.set_body(create_document_params)
			l_path := "/fleet/drivers/{driver_id}/documents"
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
			elseif attached { DOCUMENT } l_response.data ({ DOCUMENT }) as l_data then
				Result := l_data
			else
				create last_error.make ("Unknown error: Status response [ " + l_response.status.out + "]")
			end
		end	

	create_dvir (access_token: STRING_32; create_dvir_param: INLINE_OBJECT_12): detachable DVIR_BASE
			-- /fleet/maintenance/dvirs
			-- Create a new dvir, marking a vehicle or trailer safe or unsafe.
			-- 
			-- argument: access_token Samsara API access token. (required)
			-- 
			-- argument: create_dvir_param  (required)
			-- 
			-- 
			-- Result DVIR_BASE
		require
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			l_request.set_body(create_dvir_param)
			l_path := "/fleet/maintenance/dvirs"
			l_request.fill_query_params(api_client.parameter_to_tuple("", "access_token", access_token));


			if attached {STRING} api_client.select_header_accept (<<"application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type (<<"application/json">>),"Content-Type")
			l_request.set_auth_names (<<>>)
			l_response := api_client.call_api (l_path, "Post", l_request, Void, agent deserializer)
			if l_response.has_error then
				last_error := l_response.error
			elseif attached { DVIR_BASE } l_response.data ({ DVIR_BASE }) as l_data then
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

	deactivate_driver (access_token: STRING_32; driver_id_or_external_id: STRING_32)
			-- /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
			-- Deactivate a driver with the given id.
			-- 
			-- argument: access_token Samsara API access token. (required)
			-- 
			-- argument: driver_id_or_external_id ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. (required)
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
			
			l_path := "/fleet/drivers/{driver_id_or_external_id}"
			l_path.replace_substring_all ("{"+"driver_id_or_external_id"+"}", api_client.url_encode (driver_id_or_external_id.out))
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

	deactivated_driver_by_id (access_token: STRING_32; driver_id_or_external_id: STRING_32): detachable DRIVER
			-- /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
			-- Fetch deactivated driver by id.
			-- 
			-- argument: access_token Samsara API access token. (required)
			-- 
			-- argument: driver_id_or_external_id ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. (required)
			-- 
			-- 
			-- Result DRIVER
		require
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			
			l_path := "/fleet/drivers/inactive/{driver_id_or_external_id}"
			l_path.replace_substring_all ("{"+"driver_id_or_external_id"+"}", api_client.url_encode (driver_id_or_external_id.out))
			l_request.fill_query_params(api_client.parameter_to_tuple("", "access_token", access_token));


			if attached {STRING} api_client.select_header_accept (<<"application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type (<<>>),"Content-Type")
			l_request.set_auth_names (<<>>)
			l_response := api_client.call_api (l_path, "Get", l_request, Void, agent deserializer)
			if l_response.has_error then
				last_error := l_response.error
			elseif attached { DRIVER } l_response.data ({ DRIVER }) as l_data then
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

	delete_organization_address (access_token: STRING_32; address_id: INTEGER_64)
			-- /addresses/{addressId}
			-- Delete an address.
			-- 
			-- argument: access_token Samsara API access token. (required)
			-- 
			-- argument: address_id ID of the address/geofence (required)
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
			
			l_path := "/addresses/{addressId}"
			l_path.replace_substring_all ("{"+"addressId"+"}", api_client.url_encode (address_id.out))
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

	driver_by_id (access_token: STRING_32; driver_id_or_external_id: STRING_32): detachable DRIVER
			-- /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
			-- Fetch driver by id.
			-- 
			-- argument: access_token Samsara API access token. (required)
			-- 
			-- argument: driver_id_or_external_id ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. (required)
			-- 
			-- 
			-- Result DRIVER
		require
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			
			l_path := "/fleet/drivers/{driver_id_or_external_id}"
			l_path.replace_substring_all ("{"+"driver_id_or_external_id"+"}", api_client.url_encode (driver_id_or_external_id.out))
			l_request.fill_query_params(api_client.parameter_to_tuple("", "access_token", access_token));


			if attached {STRING} api_client.select_header_accept (<<"application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type (<<>>),"Content-Type")
			l_request.set_auth_names (<<>>)
			l_response := api_client.call_api (l_path, "Get", l_request, Void, agent deserializer)
			if l_response.has_error then
				last_error := l_response.error
			elseif attached { DRIVER } l_response.data ({ DRIVER }) as l_data then
				Result := l_data
			else
				create last_error.make ("Unknown error: Status response [ " + l_response.status.out + "]")
			end
		end	

	driver_document_types_by_org_id : detachable LIST [DOCUMENT_TYPE]
			-- /fleet/drivers/document_types
			-- Fetch all of the document types.
			-- 
			-- 
			-- Result LIST [DOCUMENT_TYPE]
		require
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			
			l_path := "/fleet/drivers/document_types"


			if attached {STRING} api_client.select_header_accept (<<"application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type (<<>>),"Content-Type")
			l_request.set_auth_names (<<>>)
			l_response := api_client.call_api (l_path, "Get", l_request, Void, agent deserializer)
			if l_response.has_error then
				last_error := l_response.error
			elseif attached { LIST [DOCUMENT_TYPE] } l_response.data ({ LIST [DOCUMENT_TYPE] }) as l_data then
				Result := l_data
			else
				create last_error.make ("Unknown error: Status response [ " + l_response.status.out + "]")
			end
		end	

	driver_documents_by_org_id (access_token: STRING_32; end_ms: INTEGER_64; duration_ms: INTEGER_64): detachable LIST [DOCUMENT]
			-- /fleet/drivers/documents
			-- Fetch all of the documents.
			-- 
			-- argument: access_token Samsara API access token. (required)
			-- 
			-- argument: end_ms Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now. (optional, default to null)
			-- 
			-- argument: duration_ms Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours. (optional, default to null)
			-- 
			-- 
			-- Result LIST [DOCUMENT]
		require
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			
			l_path := "/fleet/drivers/documents"
			l_request.fill_query_params(api_client.parameter_to_tuple("", "access_token", access_token));
			l_request.fill_query_params(api_client.parameter_to_tuple("", "endMs", end_ms));
			l_request.fill_query_params(api_client.parameter_to_tuple("", "durationMs", duration_ms));


			if attached {STRING} api_client.select_header_accept (<<"application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type (<<>>),"Content-Type")
			l_request.set_auth_names (<<>>)
			l_response := api_client.call_api (l_path, "Get", l_request, Void, agent deserializer)
			if l_response.has_error then
				last_error := l_response.error
			elseif attached { LIST [DOCUMENT] } l_response.data ({ LIST [DOCUMENT] }) as l_data then
				Result := l_data
			else
				create last_error.make ("Unknown error: Status response [ " + l_response.status.out + "]")
			end
		end	

	driver_safety_score (driver_id: INTEGER_64; access_token: STRING_32; start_ms: INTEGER_64; end_ms: INTEGER_64): detachable DRIVER_SAFETY_SCORE_RESPONSE
			-- /fleet/drivers/{driverId:[0-9]+}/safety/score
			-- Fetch the safety score for the driver.
			-- 
			-- argument: driver_id ID of the driver (required)
			-- 
			-- argument: access_token Samsara API access token. (required)
			-- 
			-- argument: start_ms Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. (required)
			-- 
			-- argument: end_ms Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. (required)
			-- 
			-- 
			-- Result DRIVER_SAFETY_SCORE_RESPONSE
		require
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			
			l_path := "/fleet/drivers/{driverId}/safety/score"
			l_path.replace_substring_all ("{"+"driverId"+"}", api_client.url_encode (driver_id.out))
			l_request.fill_query_params(api_client.parameter_to_tuple("", "access_token", access_token));
			l_request.fill_query_params(api_client.parameter_to_tuple("", "startMs", start_ms));
			l_request.fill_query_params(api_client.parameter_to_tuple("", "endMs", end_ms));


			if attached {STRING} api_client.select_header_accept (<<"application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type (<<>>),"Content-Type")
			l_request.set_auth_names (<<>>)
			l_response := api_client.call_api (l_path, "Get", l_request, Void, agent deserializer)
			if l_response.has_error then
				last_error := l_response.error
			elseif attached { DRIVER_SAFETY_SCORE_RESPONSE } l_response.data ({ DRIVER_SAFETY_SCORE_RESPONSE }) as l_data then
				Result := l_data
			else
				create last_error.make ("Unknown error: Status response [ " + l_response.status.out + "]")
			end
		end	

	dvirs (access_token: STRING_32; end_ms: INTEGER_32; duration_ms: INTEGER_32; group_id: INTEGER_32): detachable DVIR_LIST_RESPONSE
			-- /fleet/maintenance/dvirs
			-- Get DVIRs for the org within provided time constraints
			-- 
			-- argument: access_token Samsara API access token. (required)
			-- 
			-- argument: end_ms time in millis until the last dvir log. (required)
			-- 
			-- argument: duration_ms time in millis which corresponds to the duration before the end_ms. (required)
			-- 
			-- argument: group_id Group ID to query. (optional, default to null)
			-- 
			-- 
			-- Result DVIR_LIST_RESPONSE
		require
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			
			l_path := "/fleet/maintenance/dvirs"
			l_request.fill_query_params(api_client.parameter_to_tuple("", "access_token", access_token));
			l_request.fill_query_params(api_client.parameter_to_tuple("", "end_ms", end_ms));
			l_request.fill_query_params(api_client.parameter_to_tuple("", "duration_ms", duration_ms));
			l_request.fill_query_params(api_client.parameter_to_tuple("", "group_id", group_id));


			if attached {STRING} api_client.select_header_accept (<<"application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type (<<>>),"Content-Type")
			l_request.set_auth_names (<<>>)
			l_response := api_client.call_api (l_path, "Get", l_request, Void, agent deserializer)
			if l_response.has_error then
				last_error := l_response.error
			elseif attached { DVIR_LIST_RESPONSE } l_response.data ({ DVIR_LIST_RESPONSE }) as l_data then
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

	fleet_drivers (access_token: STRING_32; group_drivers_param: INLINE_OBJECT_3): detachable DRIVERS_RESPONSE
			-- /fleet/drivers
			-- Get all the drivers for the specified group.
			-- 
			-- argument: access_token Samsara API access token. (required)
			-- 
			-- argument: group_drivers_param  (required)
			-- 
			-- 
			-- Result DRIVERS_RESPONSE
		require
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			l_request.set_body(group_drivers_param)
			l_path := "/fleet/drivers"
			l_request.fill_query_params(api_client.parameter_to_tuple("", "access_token", access_token));


			if attached {STRING} api_client.select_header_accept (<<"application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type (<<"application/json">>),"Content-Type")
			l_request.set_auth_names (<<>>)
			l_response := api_client.call_api (l_path, "Post", l_request, Void, agent deserializer)
			if l_response.has_error then
				last_error := l_response.error
			elseif attached { DRIVERS_RESPONSE } l_response.data ({ DRIVERS_RESPONSE }) as l_data then
				Result := l_data
			else
				create last_error.make ("Unknown error: Status response [ " + l_response.status.out + "]")
			end
		end	

	fleet_drivers_hos_daily_logs (access_token: STRING_32; driver_id: INTEGER_64; hos_logs_param: INLINE_OBJECT_6): detachable DRIVER_DAILY_LOG_RESPONSE
			-- /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
			-- Get summarized daily HOS charts for a specified driver.
			-- 
			-- argument: access_token Samsara API access token. (required)
			-- 
			-- argument: driver_id ID of the driver with HOS logs. (required)
			-- 
			-- argument: hos_logs_param  (required)
			-- 
			-- 
			-- Result DRIVER_DAILY_LOG_RESPONSE
		require
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			l_request.set_body(hos_logs_param)
			l_path := "/fleet/drivers/{driver_id}/hos_daily_logs"
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
			elseif attached { DRIVER_DAILY_LOG_RESPONSE } l_response.data ({ DRIVER_DAILY_LOG_RESPONSE }) as l_data then
				Result := l_data
			else
				create last_error.make ("Unknown error: Status response [ " + l_response.status.out + "]")
			end
		end	

	fleet_drivers_summary (access_token: STRING_32; drivers_summary_param: INLINE_OBJECT_5; snap_to_day_bounds: BOOLEAN): detachable DRIVERS_SUMMARY_RESPONSE
			-- /fleet/drivers/summary
			-- Get the distance and time each driver in an organization has driven in a given time period.
			-- 
			-- argument: access_token Samsara API access token. (required)
			-- 
			-- argument: drivers_summary_param  (required)
			-- 
			-- argument: snap_to_day_bounds Snap query result to HOS day boundaries. (optional, default to null)
			-- 
			-- 
			-- Result DRIVERS_SUMMARY_RESPONSE
		require
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			l_request.set_body(drivers_summary_param)
			l_path := "/fleet/drivers/summary"
			l_request.fill_query_params(api_client.parameter_to_tuple("", "access_token", access_token));
			l_request.fill_query_params(api_client.parameter_to_tuple("", "snap_to_day_bounds", snap_to_day_bounds));


			if attached {STRING} api_client.select_header_accept (<<"application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type (<<"application/json">>),"Content-Type")
			l_request.set_auth_names (<<>>)
			l_response := api_client.call_api (l_path, "Post", l_request, Void, agent deserializer)
			if l_response.has_error then
				last_error := l_response.error
			elseif attached { DRIVERS_SUMMARY_RESPONSE } l_response.data ({ DRIVERS_SUMMARY_RESPONSE }) as l_data then
				Result := l_data
			else
				create last_error.make ("Unknown error: Status response [ " + l_response.status.out + "]")
			end
		end	

	fleet_hos_authentication_logs (access_token: STRING_32; hos_authentication_logs_param: INLINE_OBJECT_7): detachable HOS_AUTHENTICATION_LOGS_RESPONSE
			-- /fleet/hos_authentication_logs
			-- Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.
			-- 
			-- argument: access_token Samsara API access token. (required)
			-- 
			-- argument: hos_authentication_logs_param  (required)
			-- 
			-- 
			-- Result HOS_AUTHENTICATION_LOGS_RESPONSE
		require
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			l_request.set_body(hos_authentication_logs_param)
			l_path := "/fleet/hos_authentication_logs"
			l_request.fill_query_params(api_client.parameter_to_tuple("", "access_token", access_token));


			if attached {STRING} api_client.select_header_accept (<<"application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type (<<"application/json">>),"Content-Type")
			l_request.set_auth_names (<<>>)
			l_response := api_client.call_api (l_path, "Post", l_request, Void, agent deserializer)
			if l_response.has_error then
				last_error := l_response.error
			elseif attached { HOS_AUTHENTICATION_LOGS_RESPONSE } l_response.data ({ HOS_AUTHENTICATION_LOGS_RESPONSE }) as l_data then
				Result := l_data
			else
				create last_error.make ("Unknown error: Status response [ " + l_response.status.out + "]")
			end
		end	

	fleet_hos_logs (access_token: STRING_32; hos_logs_param: INLINE_OBJECT_8): detachable HOS_LOGS_RESPONSE
			-- /fleet/hos_logs
			-- Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.
			-- 
			-- argument: access_token Samsara API access token. (required)
			-- 
			-- argument: hos_logs_param  (required)
			-- 
			-- 
			-- Result HOS_LOGS_RESPONSE
		require
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			l_request.set_body(hos_logs_param)
			l_path := "/fleet/hos_logs"
			l_request.fill_query_params(api_client.parameter_to_tuple("", "access_token", access_token));


			if attached {STRING} api_client.select_header_accept (<<"application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type (<<"application/json">>),"Content-Type")
			l_request.set_auth_names (<<>>)
			l_response := api_client.call_api (l_path, "Post", l_request, Void, agent deserializer)
			if l_response.has_error then
				last_error := l_response.error
			elseif attached { HOS_LOGS_RESPONSE } l_response.data ({ HOS_LOGS_RESPONSE }) as l_data then
				Result := l_data
			else
				create last_error.make ("Unknown error: Status response [ " + l_response.status.out + "]")
			end
		end	

	fleet_hos_logs_summary (access_token: STRING_32; hos_logs_param: INLINE_OBJECT_9): detachable HOS_LOGS_SUMMARY_RESPONSE
			-- /fleet/hos_logs_summary
			-- Get the current HOS status for all drivers in the group.
			-- 
			-- argument: access_token Samsara API access token. (required)
			-- 
			-- argument: hos_logs_param  (required)
			-- 
			-- 
			-- Result HOS_LOGS_SUMMARY_RESPONSE
		require
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			l_request.set_body(hos_logs_param)
			l_path := "/fleet/hos_logs_summary"
			l_request.fill_query_params(api_client.parameter_to_tuple("", "access_token", access_token));


			if attached {STRING} api_client.select_header_accept (<<"application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type (<<"application/json">>),"Content-Type")
			l_request.set_auth_names (<<>>)
			l_response := api_client.call_api (l_path, "Post", l_request, Void, agent deserializer)
			if l_response.has_error then
				last_error := l_response.error
			elseif attached { HOS_LOGS_SUMMARY_RESPONSE } l_response.data ({ HOS_LOGS_SUMMARY_RESPONSE }) as l_data then
				Result := l_data
			else
				create last_error.make ("Unknown error: Status response [ " + l_response.status.out + "]")
			end
		end	

	fleet_locations (access_token: STRING_32; group_param: INLINE_OBJECT_11): detachable INLINE_RESPONSE_200_3
			-- /fleet/locations
			-- Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.
			-- 
			-- argument: access_token Samsara API access token. (required)
			-- 
			-- argument: group_param  (required)
			-- 
			-- 
			-- Result INLINE_RESPONSE_200_3
		require
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			l_request.set_body(group_param)
			l_path := "/fleet/locations"
			l_request.fill_query_params(api_client.parameter_to_tuple("", "access_token", access_token));


			if attached {STRING} api_client.select_header_accept (<<"application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type (<<"application/json">>),"Content-Type")
			l_request.set_auth_names (<<>>)
			l_response := api_client.call_api (l_path, "Post", l_request, Void, agent deserializer)
			if l_response.has_error then
				last_error := l_response.error
			elseif attached { INLINE_RESPONSE_200_3 } l_response.data ({ INLINE_RESPONSE_200_3 }) as l_data then
				Result := l_data
			else
				create last_error.make ("Unknown error: Status response [ " + l_response.status.out + "]")
			end
		end	

	fleet_maintenance_list (access_token: STRING_32; group_param: INLINE_OBJECT_13): detachable INLINE_RESPONSE_200_4
			-- /fleet/maintenance/list
			-- Get list of the vehicles with any engine faults or check light data.
			-- 
			-- argument: access_token Samsara API access token. (required)
			-- 
			-- argument: group_param  (required)
			-- 
			-- 
			-- Result INLINE_RESPONSE_200_4
		require
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			l_request.set_body(group_param)
			l_path := "/fleet/maintenance/list"
			l_request.fill_query_params(api_client.parameter_to_tuple("", "access_token", access_token));


			if attached {STRING} api_client.select_header_accept (<<"application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type (<<"application/json">>),"Content-Type")
			l_request.set_auth_names (<<>>)
			l_response := api_client.call_api (l_path, "Post", l_request, Void, agent deserializer)
			if l_response.has_error then
				last_error := l_response.error
			elseif attached { INLINE_RESPONSE_200_4 } l_response.data ({ INLINE_RESPONSE_200_4 }) as l_data then
				Result := l_data
			else
				create last_error.make ("Unknown error: Status response [ " + l_response.status.out + "]")
			end
		end	

	fleet_trips (access_token: STRING_32; trips_param: INLINE_OBJECT_15): detachable TRIP_RESPONSE
			-- /fleet/trips
			-- Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.
			-- 
			-- argument: access_token Samsara API access token. (required)
			-- 
			-- argument: trips_param  (required)
			-- 
			-- 
			-- Result TRIP_RESPONSE
		require
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			l_request.set_body(trips_param)
			l_path := "/fleet/trips"
			l_request.fill_query_params(api_client.parameter_to_tuple("", "access_token", access_token));


			if attached {STRING} api_client.select_header_accept (<<"application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type (<<"application/json">>),"Content-Type")
			l_request.set_auth_names (<<>>)
			l_response := api_client.call_api (l_path, "Post", l_request, Void, agent deserializer)
			if l_response.has_error then
				last_error := l_response.error
			elseif attached { TRIP_RESPONSE } l_response.data ({ TRIP_RESPONSE }) as l_data then
				Result := l_data
			else
				create last_error.make ("Unknown error: Status response [ " + l_response.status.out + "]")
			end
		end	

	fleet_vehicle (access_token: STRING_32; vehicle_id_or_external_id: STRING_32): detachable FLEET_VEHICLE_RESPONSE
			-- /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
			-- Gets a specific vehicle.
			-- 
			-- argument: access_token Samsara API access token. (required)
			-- 
			-- argument: vehicle_id_or_external_id ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. (required)
			-- 
			-- 
			-- Result FLEET_VEHICLE_RESPONSE
		require
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			
			l_path := "/fleet/vehicles/{vehicle_id_or_external_id}"
			l_path.replace_substring_all ("{"+"vehicle_id_or_external_id"+"}", api_client.url_encode (vehicle_id_or_external_id.out))
			l_request.fill_query_params(api_client.parameter_to_tuple("", "access_token", access_token));


			if attached {STRING} api_client.select_header_accept (<<"application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type (<<>>),"Content-Type")
			l_request.set_auth_names (<<>>)
			l_response := api_client.call_api (l_path, "Get", l_request, Void, agent deserializer)
			if l_response.has_error then
				last_error := l_response.error
			elseif attached { FLEET_VEHICLE_RESPONSE } l_response.data ({ FLEET_VEHICLE_RESPONSE }) as l_data then
				Result := l_data
			else
				create last_error.make ("Unknown error: Status response [ " + l_response.status.out + "]")
			end
		end	

	list_contacts (access_token: STRING_32): detachable LIST [CONTACT]
			-- /contacts
			-- Fetch all contacts for the organization.
			-- 
			-- argument: access_token Samsara API access token. (required)
			-- 
			-- 
			-- Result LIST [CONTACT]
		require
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			
			l_path := "/contacts"
			l_request.fill_query_params(api_client.parameter_to_tuple("", "access_token", access_token));


			if attached {STRING} api_client.select_header_accept (<<"application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type (<<>>),"Content-Type")
			l_request.set_auth_names (<<>>)
			l_response := api_client.call_api (l_path, "Get", l_request, Void, agent deserializer)
			if l_response.has_error then
				last_error := l_response.error
			elseif attached { LIST [CONTACT] } l_response.data ({ LIST [CONTACT] }) as l_data then
				Result := l_data
			else
				create last_error.make ("Unknown error: Status response [ " + l_response.status.out + "]")
			end
		end	

	list_fleet (access_token: STRING_32; group_param: INLINE_OBJECT_10; starting_after: STRING_32; ending_before: STRING_32; limit: INTEGER_64): detachable INLINE_RESPONSE_200_2
			-- /fleet/list
			-- Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.
			-- 
			-- argument: access_token Samsara API access token. (required)
			-- 
			-- argument: group_param  (required)
			-- 
			-- argument: starting_after Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter. (optional, default to null)
			-- 
			-- argument: ending_before Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter. (optional, default to null)
			-- 
			-- argument: limit Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;. (optional, default to null)
			-- 
			-- 
			-- Result INLINE_RESPONSE_200_2
		require
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			l_request.set_body(group_param)
			l_path := "/fleet/list"
			l_request.fill_query_params(api_client.parameter_to_tuple("", "access_token", access_token));
			l_request.fill_query_params(api_client.parameter_to_tuple("", "startingAfter", starting_after));
			l_request.fill_query_params(api_client.parameter_to_tuple("", "endingBefore", ending_before));
			l_request.fill_query_params(api_client.parameter_to_tuple("", "limit", limit));


			if attached {STRING} api_client.select_header_accept (<<"application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type (<<"application/json">>),"Content-Type")
			l_request.set_auth_names (<<>>)
			l_response := api_client.call_api (l_path, "Post", l_request, Void, agent deserializer)
			if l_response.has_error then
				last_error := l_response.error
			elseif attached { INLINE_RESPONSE_200_2 } l_response.data ({ INLINE_RESPONSE_200_2 }) as l_data then
				Result := l_data
			else
				create last_error.make ("Unknown error: Status response [ " + l_response.status.out + "]")
			end
		end	

	organization_address (access_token: STRING_32; address_id: INTEGER_64): detachable ADDRESS
			-- /addresses/{addressId}
			-- Fetch an address by its id.
			-- 
			-- argument: access_token Samsara API access token. (required)
			-- 
			-- argument: address_id ID of the address/geofence (required)
			-- 
			-- 
			-- Result ADDRESS
		require
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			
			l_path := "/addresses/{addressId}"
			l_path.replace_substring_all ("{"+"addressId"+"}", api_client.url_encode (address_id.out))
			l_request.fill_query_params(api_client.parameter_to_tuple("", "access_token", access_token));


			if attached {STRING} api_client.select_header_accept (<<"application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type (<<>>),"Content-Type")
			l_request.set_auth_names (<<>>)
			l_response := api_client.call_api (l_path, "Get", l_request, Void, agent deserializer)
			if l_response.has_error then
				last_error := l_response.error
			elseif attached { ADDRESS } l_response.data ({ ADDRESS }) as l_data then
				Result := l_data
			else
				create last_error.make ("Unknown error: Status response [ " + l_response.status.out + "]")
			end
		end	

	organization_addresses (access_token: STRING_32): detachable LIST [ADDRESS]
			-- /addresses
			-- Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.
			-- 
			-- argument: access_token Samsara API access token. (required)
			-- 
			-- 
			-- Result LIST [ADDRESS]
		require
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			
			l_path := "/addresses"
			l_request.fill_query_params(api_client.parameter_to_tuple("", "access_token", access_token));


			if attached {STRING} api_client.select_header_accept (<<"application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type (<<>>),"Content-Type")
			l_request.set_auth_names (<<>>)
			l_response := api_client.call_api (l_path, "Get", l_request, Void, agent deserializer)
			if l_response.has_error then
				last_error := l_response.error
			elseif attached { LIST [ADDRESS] } l_response.data ({ LIST [ADDRESS] }) as l_data then
				Result := l_data
			else
				create last_error.make ("Unknown error: Status response [ " + l_response.status.out + "]")
			end
		end	

	organization_contact (access_token: STRING_32; contact_id: INTEGER_64): detachable CONTACT
			-- /contacts/{contact_id}
			-- Fetch a contact by its id.
			-- 
			-- argument: access_token Samsara API access token. (required)
			-- 
			-- argument: contact_id ID of the contact (required)
			-- 
			-- 
			-- Result CONTACT
		require
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			
			l_path := "/contacts/{contact_id}"
			l_path.replace_substring_all ("{"+"contact_id"+"}", api_client.url_encode (contact_id.out))
			l_request.fill_query_params(api_client.parameter_to_tuple("", "access_token", access_token));


			if attached {STRING} api_client.select_header_accept (<<"application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type (<<>>),"Content-Type")
			l_request.set_auth_names (<<>>)
			l_response := api_client.call_api (l_path, "Get", l_request, Void, agent deserializer)
			if l_response.has_error then
				last_error := l_response.error
			elseif attached { CONTACT } l_response.data ({ CONTACT }) as l_data then
				Result := l_data
			else
				create last_error.make ("Unknown error: Status response [ " + l_response.status.out + "]")
			end
		end	

	patch_fleet_vehicle (access_token: STRING_32; vehicle_id_or_external_id: STRING_32; data: INLINE_OBJECT_16): detachable FLEET_VEHICLE_RESPONSE
			-- /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
			-- Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.
			-- 
			-- argument: access_token Samsara API access token. (required)
			-- 
			-- argument: vehicle_id_or_external_id ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. (required)
			-- 
			-- argument: data  (required)
			-- 
			-- 
			-- Result FLEET_VEHICLE_RESPONSE
		require
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			l_request.set_body(data)
			l_path := "/fleet/vehicles/{vehicle_id_or_external_id}"
			l_path.replace_substring_all ("{"+"vehicle_id_or_external_id"+"}", api_client.url_encode (vehicle_id_or_external_id.out))
			l_request.fill_query_params(api_client.parameter_to_tuple("", "access_token", access_token));


			if attached {STRING} api_client.select_header_accept (<<"application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type (<<"application/json", "application/merge-patch+json">>),"Content-Type")
			l_request.set_auth_names (<<>>)
			l_response := api_client.call_api (l_path, "Patch", l_request, Void, agent deserializer)
			if l_response.has_error then
				last_error := l_response.error
			elseif attached { FLEET_VEHICLE_RESPONSE } l_response.data ({ FLEET_VEHICLE_RESPONSE }) as l_data then
				Result := l_data
			else
				create last_error.make ("Unknown error: Status response [ " + l_response.status.out + "]")
			end
		end	

	reactivate_driver_by_id (access_token: STRING_32; driver_id_or_external_id: STRING_32; reactivate_driver_param: INLINE_OBJECT_4): detachable DRIVER
			-- /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
			-- Reactivate the inactive driver having id.
			-- 
			-- argument: access_token Samsara API access token. (required)
			-- 
			-- argument: driver_id_or_external_id ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. (required)
			-- 
			-- argument: reactivate_driver_param  (required)
			-- 
			-- 
			-- Result DRIVER
		require
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			l_request.set_body(reactivate_driver_param)
			l_path := "/fleet/drivers/inactive/{driver_id_or_external_id}"
			l_path.replace_substring_all ("{"+"driver_id_or_external_id"+"}", api_client.url_encode (driver_id_or_external_id.out))
			l_request.fill_query_params(api_client.parameter_to_tuple("", "access_token", access_token));


			if attached {STRING} api_client.select_header_accept (<<"application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type (<<"application/json">>),"Content-Type")
			l_request.set_auth_names (<<>>)
			l_response := api_client.call_api (l_path, "Put", l_request, Void, agent deserializer)
			if l_response.has_error then
				last_error := l_response.error
			elseif attached { DRIVER } l_response.data ({ DRIVER }) as l_data then
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

	update_organization_address (access_token: STRING_32; address_id: INTEGER_64; address: INLINE_OBJECT_1)
			-- /addresses/{addressId}
			-- Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.
			-- 
			-- argument: access_token Samsara API access token. (required)
			-- 
			-- argument: address_id ID of the address/geofence (required)
			-- 
			-- argument: address  (required)
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
			l_request.set_body(address)
			l_path := "/addresses/{addressId}"
			l_path.replace_substring_all ("{"+"addressId"+"}", api_client.url_encode (address_id.out))
			l_request.fill_query_params(api_client.parameter_to_tuple("", "access_token", access_token));


			if attached {STRING} api_client.select_header_accept (<<"application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type (<<"application/json">>),"Content-Type")
			l_request.set_auth_names (<<>>)
			l_response := api_client.call_api (l_path, "Patch", l_request, agent serializer, Void)
			if l_response.has_error then
				last_error := l_response.error
			end
		end	

	update_vehicles (access_token: STRING_32; vehicle_update_param: INLINE_OBJECT_14)
			-- /fleet/set_data
			-- This method enables the mutation of metadata for vehicles in the Samsara Cloud.
			-- 
			-- argument: access_token Samsara API access token. (required)
			-- 
			-- argument: vehicle_update_param  (required)
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
			l_request.set_body(vehicle_update_param)
			l_path := "/fleet/set_data"
			l_request.fill_query_params(api_client.parameter_to_tuple("", "access_token", access_token));


			if attached {STRING} api_client.select_header_accept (<<"application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type (<<"application/json">>),"Content-Type")
			l_request.set_auth_names (<<>>)
			l_response := api_client.call_api (l_path, "Post", l_request, agent serializer, Void)
			if l_response.has_error then
				last_error := l_response.error
			end
		end	

	vehicle_harsh_event (vehicle_id: INTEGER_64; access_token: STRING_32; timestamp: INTEGER_64): detachable VEHICLE_HARSH_EVENT_RESPONSE
			-- /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
			-- Fetch harsh event details for a vehicle.
			-- 
			-- argument: vehicle_id ID of the vehicle (required)
			-- 
			-- argument: access_token Samsara API access token. (required)
			-- 
			-- argument: timestamp Timestamp in milliseconds representing the timestamp of a harsh event. (required)
			-- 
			-- 
			-- Result VEHICLE_HARSH_EVENT_RESPONSE
		require
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			
			l_path := "/fleet/vehicles/{vehicleId}/safety/harsh_event"
			l_path.replace_substring_all ("{"+"vehicleId"+"}", api_client.url_encode (vehicle_id.out))
			l_request.fill_query_params(api_client.parameter_to_tuple("", "access_token", access_token));
			l_request.fill_query_params(api_client.parameter_to_tuple("", "timestamp", timestamp));


			if attached {STRING} api_client.select_header_accept (<<"application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type (<<>>),"Content-Type")
			l_request.set_auth_names (<<>>)
			l_response := api_client.call_api (l_path, "Get", l_request, Void, agent deserializer)
			if l_response.has_error then
				last_error := l_response.error
			elseif attached { VEHICLE_HARSH_EVENT_RESPONSE } l_response.data ({ VEHICLE_HARSH_EVENT_RESPONSE }) as l_data then
				Result := l_data
			else
				create last_error.make ("Unknown error: Status response [ " + l_response.status.out + "]")
			end
		end	

	vehicle_locations (access_token: STRING_32; vehicle_id: INTEGER_64; start_ms: INTEGER_64; end_ms: INTEGER_64): detachable LIST [FLEET_VEHICLE_LOCATION]
			-- /fleet/vehicles/{vehicle_id:[0-9]+}/locations
			-- Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.
			-- 
			-- argument: access_token Samsara API access token. (required)
			-- 
			-- argument: vehicle_id ID of the vehicle with the associated routes. (required)
			-- 
			-- argument: start_ms Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour) (required)
			-- 
			-- argument: end_ms Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour) (required)
			-- 
			-- 
			-- Result LIST [FLEET_VEHICLE_LOCATION]
		require
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			
			l_path := "/fleet/vehicles/{vehicle_id}/locations"
			l_path.replace_substring_all ("{"+"vehicle_id"+"}", api_client.url_encode (vehicle_id.out))
			l_request.fill_query_params(api_client.parameter_to_tuple("", "access_token", access_token));
			l_request.fill_query_params(api_client.parameter_to_tuple("", "startMs", start_ms));
			l_request.fill_query_params(api_client.parameter_to_tuple("", "endMs", end_ms));


			if attached {STRING} api_client.select_header_accept (<<"application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type (<<>>),"Content-Type")
			l_request.set_auth_names (<<>>)
			l_response := api_client.call_api (l_path, "Get", l_request, Void, agent deserializer)
			if l_response.has_error then
				last_error := l_response.error
			elseif attached { LIST [FLEET_VEHICLE_LOCATION] } l_response.data ({ LIST [FLEET_VEHICLE_LOCATION] }) as l_data then
				Result := l_data
			else
				create last_error.make ("Unknown error: Status response [ " + l_response.status.out + "]")
			end
		end	

	vehicle_safety_score (vehicle_id: INTEGER_64; access_token: STRING_32; start_ms: INTEGER_64; end_ms: INTEGER_64): detachable VEHICLE_SAFETY_SCORE_RESPONSE
			-- /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
			-- Fetch the safety score for the vehicle.
			-- 
			-- argument: vehicle_id ID of the vehicle (required)
			-- 
			-- argument: access_token Samsara API access token. (required)
			-- 
			-- argument: start_ms Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. (required)
			-- 
			-- argument: end_ms Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. (required)
			-- 
			-- 
			-- Result VEHICLE_SAFETY_SCORE_RESPONSE
		require
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			
			l_path := "/fleet/vehicles/{vehicleId}/safety/score"
			l_path.replace_substring_all ("{"+"vehicleId"+"}", api_client.url_encode (vehicle_id.out))
			l_request.fill_query_params(api_client.parameter_to_tuple("", "access_token", access_token));
			l_request.fill_query_params(api_client.parameter_to_tuple("", "startMs", start_ms));
			l_request.fill_query_params(api_client.parameter_to_tuple("", "endMs", end_ms));


			if attached {STRING} api_client.select_header_accept (<<"application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type (<<>>),"Content-Type")
			l_request.set_auth_names (<<>>)
			l_response := api_client.call_api (l_path, "Get", l_request, Void, agent deserializer)
			if l_response.has_error then
				last_error := l_response.error
			elseif attached { VEHICLE_SAFETY_SCORE_RESPONSE } l_response.data ({ VEHICLE_SAFETY_SCORE_RESPONSE }) as l_data then
				Result := l_data
			else
				create last_error.make ("Unknown error: Status response [ " + l_response.status.out + "]")
			end
		end	

	vehicle_stats (access_token: STRING_32; start_ms: INTEGER_32; end_ms: INTEGER_32; series: STRING_32; tag_ids: STRING_32; starting_after: STRING_32; ending_before: STRING_32; limit: INTEGER_64): detachable INLINE_RESPONSE_200_5
			-- /fleet/vehicles/stats
			-- Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time.
			-- 
			-- argument: access_token Samsara API access token. (required)
			-- 
			-- argument: start_ms Time in Unix epoch milliseconds for the start of the query. (required)
			-- 
			-- argument: end_ms Time in Unix epoch milliseconds for the end of the query. (required)
			-- 
			-- argument: series Comma-separated list of stat types. Options are engineState, auxInput1, and auxInput2. If this parameter is excluded, all 3 stat types will be returned. Example: series&#x3D;engineState,auxInput2 (optional, default to null)
			-- 
			-- argument: tag_ids Comma-separated list of tag ids. Example: tagIds&#x3D;1,2,3 (optional, default to null)
			-- 
			-- argument: starting_after Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter. (optional, default to null)
			-- 
			-- argument: ending_before Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter. (optional, default to null)
			-- 
			-- argument: limit Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;. (optional, default to null)
			-- 
			-- 
			-- Result INLINE_RESPONSE_200_5
		require
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			
			l_path := "/fleet/vehicles/stats"
			l_request.fill_query_params(api_client.parameter_to_tuple("", "access_token", access_token));
			l_request.fill_query_params(api_client.parameter_to_tuple("", "startMs", start_ms));
			l_request.fill_query_params(api_client.parameter_to_tuple("", "endMs", end_ms));
			l_request.fill_query_params(api_client.parameter_to_tuple("", "series", series));
			l_request.fill_query_params(api_client.parameter_to_tuple("", "tagIds", tag_ids));
			l_request.fill_query_params(api_client.parameter_to_tuple("", "startingAfter", starting_after));
			l_request.fill_query_params(api_client.parameter_to_tuple("", "endingBefore", ending_before));
			l_request.fill_query_params(api_client.parameter_to_tuple("", "limit", limit));


			if attached {STRING} api_client.select_header_accept (<<"application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type (<<>>),"Content-Type")
			l_request.set_auth_names (<<>>)
			l_response := api_client.call_api (l_path, "Get", l_request, Void, agent deserializer)
			if l_response.has_error then
				last_error := l_response.error
			elseif attached { INLINE_RESPONSE_200_5 } l_response.data ({ INLINE_RESPONSE_200_5 }) as l_data then
				Result := l_data
			else
				create last_error.make ("Unknown error: Status response [ " + l_response.status.out + "]")
			end
		end	

	vehicles_locations (access_token: STRING_32; start_ms: INTEGER_32; end_ms: INTEGER_32): detachable LIST [ANY]
			-- /fleet/vehicles/locations
			-- Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.
			-- 
			-- argument: access_token Samsara API access token. (required)
			-- 
			-- argument: start_ms Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes) (required)
			-- 
			-- argument: end_ms Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes) (required)
			-- 
			-- 
			-- Result LIST [ANY]
		require
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			
			l_path := "/fleet/vehicles/locations"
			l_request.fill_query_params(api_client.parameter_to_tuple("", "access_token", access_token));
			l_request.fill_query_params(api_client.parameter_to_tuple("", "startMs", start_ms));
			l_request.fill_query_params(api_client.parameter_to_tuple("", "endMs", end_ms));


			if attached {STRING} api_client.select_header_accept (<<"application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type (<<>>),"Content-Type")
			l_request.set_auth_names (<<>>)
			l_response := api_client.call_api (l_path, "Get", l_request, Void, agent deserializer)
			if l_response.has_error then
				last_error := l_response.error
			elseif attached { LIST [ANY] } l_response.data ({ LIST [ANY] }) as l_data then
				Result := l_data
			else
				create last_error.make ("Unknown error: Status response [ " + l_response.status.out + "]")
			end
		end	


end

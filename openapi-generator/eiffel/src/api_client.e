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
	API_CLIENT

create
	make

feature {NONE} -- Initialization

	make
		do
			create default_header_map.make (0)
			set_base_path (default_base_path)

				--set default user_agent
			set_user_agent("OpenAPI-Generator//Eiffel");

			create authentications.make (3) 
		end

feature -- Access

	default_base_path: STRING = "https://api.samsara.com/v1"
			-- default base path.

	base_path: STRING
			-- base path.

	authentications: STRING_TABLE [AUTHENTICATION]
			-- autentication table.

feature -- Status Report

	is_basic_auth_configured: BOOLEAN
			-- is basic auth configured.

	is_api_key_configured: BOOLEAN
			-- is api key auth configured.		

	is_oauth_configured: BOOLEAN
			-- is oauth configured.

feature -- Access: Authentication

	authentication_by_name (a_name: STRING): detachable AUTHENTICATION
			-- Return the Authentication for the given name `a_name', Void if not found.
		do
			Result := authentications.at (a_name)
		end

feature -- Helper: Basic Authentication

	set_password (a_password: STRING_32)
			-- Set basic auth `password' with `a_password'.
		require
			is_basic_auth_configured: is_basic_auth_configured
		do
			across authentications as ic loop
				if attached {HTTP_BASIC_AUTH} ic.item as l_basic_auth then
					l_basic_auth.set_password (a_password)
				end
			end
		end

	set_username (a_username: STRING_32)
			-- Set basic auth `username' with `a_username'.
		require
			is_basic_auth_configured: is_basic_auth_configured
		do
			across authentications as ic loop
				if attached {HTTP_BASIC_AUTH} ic.item as l_basic_auth then
					l_basic_auth.set_user_name (a_username)
				end
			end
		end

feature -- Helper: Api Key Authentication

	set_api_key (a_api_key: STRING_32)
			-- Set `api_key' authentication key with `a_api_key'.
		require
			is_api_key_configured: is_api_key_configured
		do
			across authentications as ic loop
				if attached {API_KEY_AUTH} ic.item as l_api_key then
					l_api_key.set_api_key (a_api_key)
				end
			end
		end

	set_api_prefix (a_api_prefix: STRING_32)
			-- Set `api_key_prefix' authentication with `a_api_prefix'.
		require
			is_api_key_configured: is_api_key_configured
		do
			across authentications as ic loop
				if attached {API_KEY_AUTH} ic.item as l_api_key then
					l_api_key.set_api_key_prefix (a_api_prefix)
				end
			end
		end

feature -- Helper: OAuth Authentication

	set_access_token (a_token: STRING_32)
			-- Set OAuth access token with `a_token'.
		require
			is_oauth_configured: is_oauth_configured
		do
			across authentications as ic loop
				if attached {OAUTH} ic.item as l_oauth then
					l_oauth.set_access_token (a_token)
				end
			end
		end

feature -- Query Parameter Helpers

	parameter_to_tuple (a_collection_format, a_name: STRING; a_value: detachable ANY): LIST [TUPLE [name: STRING; value: STRING]]
			-- A list of tuples with name and valule.
			-- collectionFormat collection format (e.g. csv, tsv)
			-- name Name
			-- value Value
    	require
			valid_name: not a_name.is_empty
		local
			l_format: STRING
			l_delimiter: STRING
			l_value: STRING
		do
			if attached {LIST [ANY]} a_value as a_list then
					-- Collection
				if a_list.is_empty then
						-- Return an empty list	
					create {ARRAYED_LIST [TUPLE [name: STRING; value: STRING]]} Result.make (0)
				else
						-- collection format: multi, csv, ssv, tsv, pipes.
					create {ARRAYED_LIST [TUPLE [name: STRING; value: STRING]]} Result.make (a_list.count)
					if a_collection_format.is_empty then
						l_format := "csv" -- default: csv
					else
						l_format := a_collection_format
					end
					if l_format.is_case_insensitive_equal ("multi") then
						across a_list as ic loop
							Result.force ([a_name, parameter_to_string (ic.item)])
						end
					else
						if l_format.is_case_insensitive_equal ("csv") then
							l_delimiter := ","
						elseif l_format.is_case_insensitive_equal ("ssv") then
							l_delimiter := " "
						elseif l_format.is_case_insensitive_equal ("tsv") then
							l_delimiter := "\t"
						elseif l_format.is_case_insensitive_equal ("pipes") then
							l_delimiter := "|"
						else
							l_delimiter := ","
						end
						across a_list as ic  from create l_value.make_empty
						loop
							l_value.append (parameter_to_string (ic.item))
							l_value.append (l_delimiter)
						end
						l_value.remove_tail (1)
						Result.force ([a_name,l_value])
					end
				end
			else
				create {ARRAYED_LIST [TUPLE [name: STRING; value: STRING]]} Result.make (1)
				if attached a_value then
					Result.force ([a_name,a_value.out])
				else
					Result.force ([a_name,""])
				end

			end
		end


	parameter_to_string (a_param: detachable ANY): STRING
			-- return the string representation of the givien object `a_param'.
		do
			if a_param = Void then
				Result := ""
			else
				if attached {BOOLEAN} a_param as bool then
					Result := bool.out
				elseif attached {NUMERIC} a_param as num then
					if attached {INTEGER_64} num as i64 then
						Result := i64.out
					elseif attached {INTEGER_32} num as i32 then
						Result := i32.out
					elseif attached {INTEGER_16} num as i16 then
						Result := i16.out
					elseif attached {INTEGER_8} num as i8 then
						Result := i8.out
					elseif attached {NATURAL_64} num as n64 then
						Result := n64.out
					elseif attached {NATURAL_32} num as n32 then
						Result := n32.out
					elseif attached {NATURAL_16} num as n16 then
						Result := n16.out
					elseif attached {NATURAL_8} num as n8 then
						Result := n8.out
					elseif attached {REAL_64} num as r64 then
						Result := r64.out
					elseif attached {REAL_32} num as r32 then
						Result := r32.out
					else
						check is_basic_numeric_type: False end
					end
					Result := num.out
				elseif attached {CHARACTER_8} a_param as ch8 then
					Result := ch8.out
				elseif attached {CHARACTER_32} a_param as ch32 then
					Result := ch32.out
				elseif attached {POINTER} a_param as ptr then
					Result := ptr.to_integer_32.out
				elseif attached {DATE} a_param as date then
						--TODO improve to support
						-- date	string	As defined by full-date - RFC3339
					Result := date.debug_output
				elseif attached {DATE_TIME} a_param as date_time then
						-- TODO improve to support
						-- dateTime	string	date-time	As defined by date-time - RFC3339
					Result := date_time.date.debug_output
				elseif attached {STRING_32} a_param as str_32 then
					Result := str_32
				elseif attached {STRING_8} a_param as str_8 then
					Result := str_8
				else
					-- Unsupported Object type.
					Result := ""
				end
			end
		end


feature -- Status Report

	is_valid_uri (a_uri: STRING): BOOLEAN
			-- Is `a_uri' a valid uri?
		local
			l_uri: URI
		do
			create l_uri.make_from_string (a_uri)
			Result := l_uri.is_valid
		end

feature --Helper: Http Client

	select_header_accept (a_accept: ARRAY [STRING]): detachable STRING
			-- Select the Accept header's value from the given accepts array.
		do
			a_accept.compare_objects
			if a_accept.has ("application/json") then
				Result := "application/json"
			end
		end

	select_header_content_type (a_content_types: ARRAY [STRING]): STRING
			-- Select the Content-Type header's value from the given array.
			-- at the moment `application/json'
		do
			a_content_types.compare_objects
			if a_content_types.is_empty then
				Result := "application/json"
			elseif a_content_types.has ("application/json") then
				Result := "application/json"
			else
				Result := a_content_types.at (1)
			end
		end

	update_params_for_auth (a_auth_names: ARRAY [STRING]; a_query_params: LIST [TUPLE [name: STRING; value: STRING]];  a_header_params: STRING_TABLE [STRING] )
			-- Update query and header parameters based on authentication settings.
			-- a_auth_names:The authentications to apply.
			-- a_queryParams  List of query parameters.
			-- a_headerParams  Map of header parameters
		do
			across a_auth_names as ic loop
				if attached authentications.at (ic.item) as l_auth then
					l_auth.apply_to_params (a_query_params, a_header_params)
				end
			end
		end


	accepts_request_body (a_method: STRING): BOOLEAN
			-- Does the method `a_method' accepts a request body?
		do
			if
				a_method.is_case_insensitive_equal_general ("POST") or else
				a_method.is_case_insensitive_equal_general ("PUT") or else
				a_method.is_case_insensitive_equal_general ("PATCH") or else
				a_method.is_case_insensitive_equal_general ("DELETE")
			then
				Result := True
			end
		end

	url_encode (a_val: STRING): STRING
			-- Url encode `a_val'
		do
			Result := (create {URL_ENCODER}).encoded_string (a_val)
		end	

feature -- HTTP client: call api

	call_api (a_path: STRING_8; a_method: STRING_8; a_request: API_CLIENT_REQUEST; a_serializer: detachable FUNCTION [TUPLE [STRING, ANY], STRING]; a_deserializer: detachable FUNCTION [TUPLE [STRING, STRING, TYPE [detachable ANY]], detachable ANY] ): API_CLIENT_RESPONSE
			-- Execute an HTTP request with the given options.
			-- Relative path `a_path'
			-- Method `a_method'  "GET", "HEAD", "OPTIONS", "POST", "PUT", "PATCH" and "DELETE"
			-- A request `a_request' wth
			-- The query parameters: `query_params'.
			-- The Header parameters: `header_params'.
			-- The Request Body: `body' could be Void, object to be serialized using the serializer function `a_serializer' with a given content_type.
			-- this function will need to be added by the user with the supported content types in the target API class.
			-- The authentications to apply `auth_names'.
			-- `a_deserializer': is a deserializer function that will need to be added by the user to map the string response to the target object with
			-- with a content type.

		local
			l_url: STRING_8
			l_response: HTTP_CLIENT_RESPONSE
			l_context_executor: HTTP_CLIENT_REQUEST_CONTEXT
			l_content_type: STRING
			l_error: API_ERROR
		do
			    --! TODO remove hardcoded values!!!.
			    --! Maybe we can create an object REQUEST_PARAMETERS
			    -- call_api (a_param: REQUEST_PARAMETERS)

				-- create context executor per request.
			create l_context_executor.make
			update_params_for_auth (a_request.auth_names, a_request.query_params, a_request.header_params)
			l_url := build_url (a_path, a_request.query_params)
			add_header_params (l_context_executor, a_request.header_params)

			if attached a_request.header_params.at ("Content-Type") as ll_content_type  then
				l_content_type := ll_content_type
			else
				l_content_type := "application/json"
			end

			if not accepts_request_body (a_method) then
				-- do nothing
			elseif l_content_type.is_case_insensitive_equal ("application/x-www-form-urlencoded") then
				add_form_data (l_context_executor, a_request.form_params)
			elseif l_content_type.is_case_insensitive_equal ("multipart/form-data") then
				-- add_mulipart_data (l_context_executor, a_form_params, l_content_type)
				-- here we need a way to identify files.
			elseif a_request.body = Void then
				if a_method.is_case_insensitive_equal ("DELETE") then
						-- DELETE no need a request body.
				else
						-- use an empty request body (for POST, PUT and PATCH)
					l_context_executor.set_upload_data ("")
				end
			else
				if
					attached a_request.body as l_body  and then
					attached a_serializer as l_custom_serializer
				then
						-- Serialize an object `a_body' to content-type `l_type'
						-- if not support by default you will need to extend
						-- the target API with the corresponding implementation.	
					l_context_executor.set_upload_data((create {API_SERIALIZER}).serializer (l_custom_serializer, l_content_type, l_body))
				end			
			end

			if
				a_method.is_case_insensitive_equal ("GET")
			then
				l_response := execute_get (l_context_executor, l_url)
			elseif a_method.is_case_insensitive_equal ("POST") then
				l_response := execute_post (l_context_executor, l_url, Void)
			else
				create l_error.make ("Method [" + a_method + "] not supported")
				create Result.make (l_response, l_error, a_deserializer)
			end
			create Result.make (l_response, l_error, a_deserializer)
		end



	build_url (a_path: STRING_8; a_query_params: LIST [TUPLE [name: STRING; value: STRING]]): STRING_8
			-- Build a relatative url to `base_path' with `a_path' and a list of
			-- query parameters `a_query_params'.
		local
			l_query: STRING
		do
			if a_query_params.is_empty then
				Result := a_path
			else
				Result := a_path
				create l_query.make_empty
				across a_query_params as ic loop
					l_query.append (ic.item.name)
					l_query.append_character ('=')
					l_query.append (ic.item.value)
					l_query.append_character ('&')
				end
				l_query.remove_tail (1)
				if Result.has ('?') then
					Result.append_character ('&')
					Result.append (l_query)
				else
					Result.append_character ('?')
					Result.append (l_query)
				end
			end
		end

	add_header_params (a_content_executor:HTTP_CLIENT_REQUEST_CONTEXT; a_header_params: STRING_TABLE [STRING])
			-- Set header parameters `a_header_params' to the request context executor `a_content_executor', including default headers.
		do
				-- headers
			across a_header_params as ic  loop
				a_content_executor.add_header (ic.key.as_string_8, ic.item)
			end

				-- default headers
			across default_header_map as ic  loop
				if not a_header_params.has (ic.key) then
					a_content_executor.add_header (ic.key.as_string_8, ic.item)
				end
			end
		end

	add_form_data (a_content_executor:HTTP_CLIENT_REQUEST_CONTEXT; a_form_params: STRING_TABLE [ANY])
			-- Set form parameters `a_form_params' to the request context executor `a_content_executor'.
		do
				-- form params
			across a_form_params as ic  loop
				if attached {STRING} ic.item as l_item then
					a_content_executor.add_form_parameter (ic.key, l_item)
				end
			end
		end

	add_multipart_data (a_content_executor:HTTP_CLIENT_REQUEST_CONTEXT; a_form_params: STRING_TABLE [ANY]; a_content_type: STRING)
			-- Set form parameters `a_form_params' to the request context executor `a_content_executor'.
		do
				-- multipart form params
			across a_form_params as ic  loop
				if attached {FILE} ic.item as l_item then
					a_content_executor.add_header ("Content-Type", a_content_type )
					a_content_executor.set_upload_filename (l_item.path.absolute_path.name)
					a_content_executor.add_form_parameter (ic.key, l_item.path.name)
				end
			end
		end

feature -- HTTP client: Change Element

	set_base_path (a_path: STRING)
			-- Set `base_path' with `a_path'.
		require
			is_valid_uri: is_valid_uri (a_path)
		do
			base_path := a_path
		end

	set_user_agent (a_agent: STRING_8)
			-- Set user agent with `a_agent`.
		do
			add_header ("User-Agent", a_agent)
		end

	add_header (k: READABLE_STRING_8; v: READABLE_STRING_8)
			-- Add http header line `k:v'.
		do
			default_header_map.force (v, k)
		end

feature {NONE} -- Implementation

	default_header_map: STRING_TABLE [STRING]
			-- default header map.

	http_session: detachable HTTP_CLIENT_SESSION
			-- http client session.

	get_http_session
			-- Initialize http client session.
		local
			h: DEFAULT_HTTP_CLIENT
			b: like base_path
		do
			create h
			b := base_path
			if b = Void then
				b := ""
			end
			b.left_adjust
			b.right_justify
			if attached {HTTP_CLIENT_SESSION} h.new_session (b) as sess then
				http_session := sess
				sess.set_timeout (-1)
				sess.set_connect_timeout (-1)
				sess.set_is_insecure (True)
				sess.set_any_auth_type
				debug ("curl")
					sess.set_is_debug (True)
				end
				debug ("proxy8888")
					sess.set_proxy ("127.0.0.1", 8888) --| inspect traffic with http://www.fiddler2.com/					
				end
			end
		end

feature -- HTTP client helpers

	execute_get (context_executor: HTTP_CLIENT_REQUEST_CONTEXT; command_name: READABLE_STRING_8): detachable HTTP_CLIENT_RESPONSE
		do
			get_http_session
			if attached http_session as sess then
				Result := sess.get (command_name, context_executor)
			end
		end

	execute_post (context_executor: HTTP_CLIENT_REQUEST_CONTEXT; command_name: READABLE_STRING_8; data: detachable READABLE_STRING_8): detachable HTTP_CLIENT_RESPONSE
		do
			get_http_session
			if attached http_session as sess then
				Result := sess.post (command_name, context_executor, data)
			end
		end

	execute_delete (context_executor: HTTP_CLIENT_REQUEST_CONTEXT; command_name: READABLE_STRING_8): detachable HTTP_CLIENT_RESPONSE
		do
			get_http_session
			if attached http_session as sess then
				Result := sess.delete (command_name, context_executor)
			end
		end

	execute_put (context_executor: HTTP_CLIENT_REQUEST_CONTEXT; command_name: READABLE_STRING_8; data: detachable READABLE_STRING_8): detachable HTTP_CLIENT_RESPONSE
		do
			get_http_session
			if attached http_session as sess then
				Result := sess.put (command_name, context_executor, data)
			end
		end

end

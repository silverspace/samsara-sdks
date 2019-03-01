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
class HOS_LOGS_RESPONSE_LOGS 

inherit

  ANY
      redefine
          out 
      end


feature --Access

    loc_lng: REAL_64 
      -- Longitude at which the log was recorded.
    log_start_ms: INTEGER_64 
      -- The time at which the log/HOS status started in UNIX milliseconds.
    driver_id: INTEGER_64 
      -- ID of the driver.
    status_type: detachable STRING_32 
      -- The Hours of Service status type. One of `OFF_DUTY`, `SLEEPER_BED`, `DRIVING`, `ON_DUTY`, `YARD_MOVE`, `PERSONAL_CONVEYANCE`.
    loc_city: detachable STRING_32 
      -- City in which the log was recorded.
    group_id: INTEGER_64 
      -- ID of the group.
    loc_name: detachable STRING_32 
      -- Name of location at which the log was recorded.
    loc_lat: REAL_64 
      -- Latitude at which the log was recorded.
    remark: detachable STRING_32 
      -- Remark associated with the log entry.
    loc_state: detachable STRING_32 
      -- State in which the log was recorded.
    vehicle_id: INTEGER_64 
      -- ID of the vehicle.
    codriver_ids: LIST [INTEGER_64] 
      

feature -- Change Element  
 
    set_loc_lng (a_name: like loc_lng)
        -- Set 'loc_lng' with 'a_name'.
      do
        loc_lng := a_name
      ensure
        loc_lng_set: loc_lng = a_name		
      end

    set_log_start_ms (a_name: like log_start_ms)
        -- Set 'log_start_ms' with 'a_name'.
      do
        log_start_ms := a_name
      ensure
        log_start_ms_set: log_start_ms = a_name		
      end

    set_driver_id (a_name: like driver_id)
        -- Set 'driver_id' with 'a_name'.
      do
        driver_id := a_name
      ensure
        driver_id_set: driver_id = a_name		
      end

    set_status_type (a_name: like status_type)
        -- Set 'status_type' with 'a_name'.
      do
        status_type := a_name
      ensure
        status_type_set: status_type = a_name		
      end

    set_loc_city (a_name: like loc_city)
        -- Set 'loc_city' with 'a_name'.
      do
        loc_city := a_name
      ensure
        loc_city_set: loc_city = a_name		
      end

    set_group_id (a_name: like group_id)
        -- Set 'group_id' with 'a_name'.
      do
        group_id := a_name
      ensure
        group_id_set: group_id = a_name		
      end

    set_loc_name (a_name: like loc_name)
        -- Set 'loc_name' with 'a_name'.
      do
        loc_name := a_name
      ensure
        loc_name_set: loc_name = a_name		
      end

    set_loc_lat (a_name: like loc_lat)
        -- Set 'loc_lat' with 'a_name'.
      do
        loc_lat := a_name
      ensure
        loc_lat_set: loc_lat = a_name		
      end

    set_remark (a_name: like remark)
        -- Set 'remark' with 'a_name'.
      do
        remark := a_name
      ensure
        remark_set: remark = a_name		
      end

    set_loc_state (a_name: like loc_state)
        -- Set 'loc_state' with 'a_name'.
      do
        loc_state := a_name
      ensure
        loc_state_set: loc_state = a_name		
      end

    set_vehicle_id (a_name: like vehicle_id)
        -- Set 'vehicle_id' with 'a_name'.
      do
        vehicle_id := a_name
      ensure
        vehicle_id_set: vehicle_id = a_name		
      end

    set_codriver_ids (a_name: like codriver_ids)
        -- Set 'codriver_ids' with 'a_name'.
      do
        codriver_ids := a_name
      ensure
        codriver_ids_set: codriver_ids = a_name		
      end


 feature -- Status Report

    out: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass HOS_LOGS_RESPONSE_LOGS%N")
        if attached loc_lng as l_loc_lng then
          Result.append ("%Nloc_lng:")
          Result.append (l_loc_lng.out)
          Result.append ("%N")    
        end  
        if attached log_start_ms as l_log_start_ms then
          Result.append ("%Nlog_start_ms:")
          Result.append (l_log_start_ms.out)
          Result.append ("%N")    
        end  
        if attached driver_id as l_driver_id then
          Result.append ("%Ndriver_id:")
          Result.append (l_driver_id.out)
          Result.append ("%N")    
        end  
        if attached status_type as l_status_type then
          Result.append ("%Nstatus_type:")
          Result.append (l_status_type.out)
          Result.append ("%N")    
        end  
        if attached loc_city as l_loc_city then
          Result.append ("%Nloc_city:")
          Result.append (l_loc_city.out)
          Result.append ("%N")    
        end  
        if attached group_id as l_group_id then
          Result.append ("%Ngroup_id:")
          Result.append (l_group_id.out)
          Result.append ("%N")    
        end  
        if attached loc_name as l_loc_name then
          Result.append ("%Nloc_name:")
          Result.append (l_loc_name.out)
          Result.append ("%N")    
        end  
        if attached loc_lat as l_loc_lat then
          Result.append ("%Nloc_lat:")
          Result.append (l_loc_lat.out)
          Result.append ("%N")    
        end  
        if attached remark as l_remark then
          Result.append ("%Nremark:")
          Result.append (l_remark.out)
          Result.append ("%N")    
        end  
        if attached loc_state as l_loc_state then
          Result.append ("%Nloc_state:")
          Result.append (l_loc_state.out)
          Result.append ("%N")    
        end  
        if attached vehicle_id as l_vehicle_id then
          Result.append ("%Nvehicle_id:")
          Result.append (l_vehicle_id.out)
          Result.append ("%N")    
        end  
        if attached codriver_ids as l_codriver_ids then
          across l_codriver_ids as ic loop
            Result.append ("%N codriver_ids:")
            Result.append (ic.item.out)
            Result.append ("%N")
          end
        end 
      end
end



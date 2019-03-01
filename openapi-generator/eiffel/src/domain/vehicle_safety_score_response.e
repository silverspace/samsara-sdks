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
class VEHICLE_SAFETY_SCORE_RESPONSE 

inherit

  ANY
      redefine
          out 
      end


feature --Access

    crash_count: INTEGER_32 
      -- Crash event count
    harsh_accel_count: INTEGER_32 
      -- Harsh acceleration event count
    harsh_braking_count: INTEGER_32 
      -- Harsh braking event count
    harsh_events: detachable LIST [SAFETY_REPORT_HARSH_EVENT] 
      
    harsh_turning_count: INTEGER_32 
      -- Harsh turning event count
    safety_score: INTEGER_32 
      -- Safety Score
    safety_score_rank: detachable STRING_32 
      -- Safety Score Rank
    time_over_speed_limit_ms: INTEGER_32 
      -- Amount of time driven over the speed limit in milliseconds
    total_distance_driven_meters: INTEGER_32 
      -- Total distance driven in meters
    total_harsh_event_count: INTEGER_32 
      -- Total harsh event count
    total_time_driven_ms: INTEGER_32 
      -- Amount of time driven in milliseconds
    vehicle_id: INTEGER_32 
      -- Vehicle ID

feature -- Change Element  
 
    set_crash_count (a_name: like crash_count)
        -- Set 'crash_count' with 'a_name'.
      do
        crash_count := a_name
      ensure
        crash_count_set: crash_count = a_name		
      end

    set_harsh_accel_count (a_name: like harsh_accel_count)
        -- Set 'harsh_accel_count' with 'a_name'.
      do
        harsh_accel_count := a_name
      ensure
        harsh_accel_count_set: harsh_accel_count = a_name		
      end

    set_harsh_braking_count (a_name: like harsh_braking_count)
        -- Set 'harsh_braking_count' with 'a_name'.
      do
        harsh_braking_count := a_name
      ensure
        harsh_braking_count_set: harsh_braking_count = a_name		
      end

    set_harsh_events (a_name: like harsh_events)
        -- Set 'harsh_events' with 'a_name'.
      do
        harsh_events := a_name
      ensure
        harsh_events_set: harsh_events = a_name		
      end

    set_harsh_turning_count (a_name: like harsh_turning_count)
        -- Set 'harsh_turning_count' with 'a_name'.
      do
        harsh_turning_count := a_name
      ensure
        harsh_turning_count_set: harsh_turning_count = a_name		
      end

    set_safety_score (a_name: like safety_score)
        -- Set 'safety_score' with 'a_name'.
      do
        safety_score := a_name
      ensure
        safety_score_set: safety_score = a_name		
      end

    set_safety_score_rank (a_name: like safety_score_rank)
        -- Set 'safety_score_rank' with 'a_name'.
      do
        safety_score_rank := a_name
      ensure
        safety_score_rank_set: safety_score_rank = a_name		
      end

    set_time_over_speed_limit_ms (a_name: like time_over_speed_limit_ms)
        -- Set 'time_over_speed_limit_ms' with 'a_name'.
      do
        time_over_speed_limit_ms := a_name
      ensure
        time_over_speed_limit_ms_set: time_over_speed_limit_ms = a_name		
      end

    set_total_distance_driven_meters (a_name: like total_distance_driven_meters)
        -- Set 'total_distance_driven_meters' with 'a_name'.
      do
        total_distance_driven_meters := a_name
      ensure
        total_distance_driven_meters_set: total_distance_driven_meters = a_name		
      end

    set_total_harsh_event_count (a_name: like total_harsh_event_count)
        -- Set 'total_harsh_event_count' with 'a_name'.
      do
        total_harsh_event_count := a_name
      ensure
        total_harsh_event_count_set: total_harsh_event_count = a_name		
      end

    set_total_time_driven_ms (a_name: like total_time_driven_ms)
        -- Set 'total_time_driven_ms' with 'a_name'.
      do
        total_time_driven_ms := a_name
      ensure
        total_time_driven_ms_set: total_time_driven_ms = a_name		
      end

    set_vehicle_id (a_name: like vehicle_id)
        -- Set 'vehicle_id' with 'a_name'.
      do
        vehicle_id := a_name
      ensure
        vehicle_id_set: vehicle_id = a_name		
      end


 feature -- Status Report

    out: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass VEHICLE_SAFETY_SCORE_RESPONSE%N")
        if attached crash_count as l_crash_count then
          Result.append ("%Ncrash_count:")
          Result.append (l_crash_count.out)
          Result.append ("%N")    
        end  
        if attached harsh_accel_count as l_harsh_accel_count then
          Result.append ("%Nharsh_accel_count:")
          Result.append (l_harsh_accel_count.out)
          Result.append ("%N")    
        end  
        if attached harsh_braking_count as l_harsh_braking_count then
          Result.append ("%Nharsh_braking_count:")
          Result.append (l_harsh_braking_count.out)
          Result.append ("%N")    
        end  
        if attached harsh_events as l_harsh_events then
          across l_harsh_events as ic loop
            Result.append ("%N harsh_events:")
            Result.append (ic.item.out)
            Result.append ("%N")
          end
        end 
        if attached harsh_turning_count as l_harsh_turning_count then
          Result.append ("%Nharsh_turning_count:")
          Result.append (l_harsh_turning_count.out)
          Result.append ("%N")    
        end  
        if attached safety_score as l_safety_score then
          Result.append ("%Nsafety_score:")
          Result.append (l_safety_score.out)
          Result.append ("%N")    
        end  
        if attached safety_score_rank as l_safety_score_rank then
          Result.append ("%Nsafety_score_rank:")
          Result.append (l_safety_score_rank.out)
          Result.append ("%N")    
        end  
        if attached time_over_speed_limit_ms as l_time_over_speed_limit_ms then
          Result.append ("%Ntime_over_speed_limit_ms:")
          Result.append (l_time_over_speed_limit_ms.out)
          Result.append ("%N")    
        end  
        if attached total_distance_driven_meters as l_total_distance_driven_meters then
          Result.append ("%Ntotal_distance_driven_meters:")
          Result.append (l_total_distance_driven_meters.out)
          Result.append ("%N")    
        end  
        if attached total_harsh_event_count as l_total_harsh_event_count then
          Result.append ("%Ntotal_harsh_event_count:")
          Result.append (l_total_harsh_event_count.out)
          Result.append ("%N")    
        end  
        if attached total_time_driven_ms as l_total_time_driven_ms then
          Result.append ("%Ntotal_time_driven_ms:")
          Result.append (l_total_time_driven_ms.out)
          Result.append ("%N")    
        end  
        if attached vehicle_id as l_vehicle_id then
          Result.append ("%Nvehicle_id:")
          Result.append (l_vehicle_id.out)
          Result.append ("%N")    
        end  
      end
end



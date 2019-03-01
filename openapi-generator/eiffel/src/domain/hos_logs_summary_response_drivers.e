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
class HOS_LOGS_SUMMARY_RESPONSE_DRIVERS 

inherit

  ANY
      redefine
          out 
      end


feature --Access

    time_until_break: INTEGER_64 
      -- The amount of time (in ms) remaining until the driver cannot drive without a rest break.
    vehicle_name: detachable STRING_32 
      -- Name of the vehicle.
    driving_in_violation_today: INTEGER_64 
      -- The amount of driving time in violation today (in ms).
    driver_id: INTEGER_64 
      -- ID of the driver.
    cycle_remaining: INTEGER_64 
      -- The amount of remaining cycle time (in ms).
    driver_name: detachable STRING_32 
      -- Name of the driver.
    duty_status: detachable STRING_32 
      -- The Hours of Service status type. One of `OFF_DUTY`, `SLEEPER_BED`, `DRIVING`, `ON_DUTY`, `YARD_MOVE`, `PERSONAL_CONVEYANCE`.
    cycle_tomorrow: INTEGER_64 
      -- The amount of cycle time (in ms) available tomorrow.
    shift_drive_remaining: INTEGER_64 
      -- The amount of remaining shift drive time (in ms).
    time_in_current_status: INTEGER_64 
      -- The amount of time (in ms) that the driver has been in the current `dutyStatus`.
    driving_in_violation_cycle: INTEGER_64 
      -- The amount of driving time in violation in this cycle (in ms).
    shift_remaining: INTEGER_64 
      -- The amount of remaining shift time (in ms).

feature -- Change Element  
 
    set_time_until_break (a_name: like time_until_break)
        -- Set 'time_until_break' with 'a_name'.
      do
        time_until_break := a_name
      ensure
        time_until_break_set: time_until_break = a_name		
      end

    set_vehicle_name (a_name: like vehicle_name)
        -- Set 'vehicle_name' with 'a_name'.
      do
        vehicle_name := a_name
      ensure
        vehicle_name_set: vehicle_name = a_name		
      end

    set_driving_in_violation_today (a_name: like driving_in_violation_today)
        -- Set 'driving_in_violation_today' with 'a_name'.
      do
        driving_in_violation_today := a_name
      ensure
        driving_in_violation_today_set: driving_in_violation_today = a_name		
      end

    set_driver_id (a_name: like driver_id)
        -- Set 'driver_id' with 'a_name'.
      do
        driver_id := a_name
      ensure
        driver_id_set: driver_id = a_name		
      end

    set_cycle_remaining (a_name: like cycle_remaining)
        -- Set 'cycle_remaining' with 'a_name'.
      do
        cycle_remaining := a_name
      ensure
        cycle_remaining_set: cycle_remaining = a_name		
      end

    set_driver_name (a_name: like driver_name)
        -- Set 'driver_name' with 'a_name'.
      do
        driver_name := a_name
      ensure
        driver_name_set: driver_name = a_name		
      end

    set_duty_status (a_name: like duty_status)
        -- Set 'duty_status' with 'a_name'.
      do
        duty_status := a_name
      ensure
        duty_status_set: duty_status = a_name		
      end

    set_cycle_tomorrow (a_name: like cycle_tomorrow)
        -- Set 'cycle_tomorrow' with 'a_name'.
      do
        cycle_tomorrow := a_name
      ensure
        cycle_tomorrow_set: cycle_tomorrow = a_name		
      end

    set_shift_drive_remaining (a_name: like shift_drive_remaining)
        -- Set 'shift_drive_remaining' with 'a_name'.
      do
        shift_drive_remaining := a_name
      ensure
        shift_drive_remaining_set: shift_drive_remaining = a_name		
      end

    set_time_in_current_status (a_name: like time_in_current_status)
        -- Set 'time_in_current_status' with 'a_name'.
      do
        time_in_current_status := a_name
      ensure
        time_in_current_status_set: time_in_current_status = a_name		
      end

    set_driving_in_violation_cycle (a_name: like driving_in_violation_cycle)
        -- Set 'driving_in_violation_cycle' with 'a_name'.
      do
        driving_in_violation_cycle := a_name
      ensure
        driving_in_violation_cycle_set: driving_in_violation_cycle = a_name		
      end

    set_shift_remaining (a_name: like shift_remaining)
        -- Set 'shift_remaining' with 'a_name'.
      do
        shift_remaining := a_name
      ensure
        shift_remaining_set: shift_remaining = a_name		
      end


 feature -- Status Report

    out: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass HOS_LOGS_SUMMARY_RESPONSE_DRIVERS%N")
        if attached time_until_break as l_time_until_break then
          Result.append ("%Ntime_until_break:")
          Result.append (l_time_until_break.out)
          Result.append ("%N")    
        end  
        if attached vehicle_name as l_vehicle_name then
          Result.append ("%Nvehicle_name:")
          Result.append (l_vehicle_name.out)
          Result.append ("%N")    
        end  
        if attached driving_in_violation_today as l_driving_in_violation_today then
          Result.append ("%Ndriving_in_violation_today:")
          Result.append (l_driving_in_violation_today.out)
          Result.append ("%N")    
        end  
        if attached driver_id as l_driver_id then
          Result.append ("%Ndriver_id:")
          Result.append (l_driver_id.out)
          Result.append ("%N")    
        end  
        if attached cycle_remaining as l_cycle_remaining then
          Result.append ("%Ncycle_remaining:")
          Result.append (l_cycle_remaining.out)
          Result.append ("%N")    
        end  
        if attached driver_name as l_driver_name then
          Result.append ("%Ndriver_name:")
          Result.append (l_driver_name.out)
          Result.append ("%N")    
        end  
        if attached duty_status as l_duty_status then
          Result.append ("%Nduty_status:")
          Result.append (l_duty_status.out)
          Result.append ("%N")    
        end  
        if attached cycle_tomorrow as l_cycle_tomorrow then
          Result.append ("%Ncycle_tomorrow:")
          Result.append (l_cycle_tomorrow.out)
          Result.append ("%N")    
        end  
        if attached shift_drive_remaining as l_shift_drive_remaining then
          Result.append ("%Nshift_drive_remaining:")
          Result.append (l_shift_drive_remaining.out)
          Result.append ("%N")    
        end  
        if attached time_in_current_status as l_time_in_current_status then
          Result.append ("%Ntime_in_current_status:")
          Result.append (l_time_in_current_status.out)
          Result.append ("%N")    
        end  
        if attached driving_in_violation_cycle as l_driving_in_violation_cycle then
          Result.append ("%Ndriving_in_violation_cycle:")
          Result.append (l_driving_in_violation_cycle.out)
          Result.append ("%N")    
        end  
        if attached shift_remaining as l_shift_remaining then
          Result.append ("%Nshift_remaining:")
          Result.append (l_shift_remaining.out)
          Result.append ("%N")    
        end  
      end
end



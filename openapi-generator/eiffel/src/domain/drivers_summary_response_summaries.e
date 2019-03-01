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
class DRIVERS_SUMMARY_RESPONSE_SUMMARIES 

inherit

  ANY
      redefine
          out 
      end


feature --Access

    driver_id: INTEGER_64 
      -- ID of the driver.
    distance_miles: REAL_64 
      -- Distance driven in miles, rounded to two decimal places.
    drive_ms: INTEGER_64 
      -- Duration in milliseconds that driver was driving during the requested time range
    active_ms: INTEGER_64 
      -- Duration in milliseconds that driver was on duty or driving during the requested time range
    driver_username: detachable STRING_32 
      -- Username of the driver.
    group_id: INTEGER_64 
      -- Group of the driver.
    driver_name: detachable STRING_32 
      -- Name of the driver.
    on_duty_ms: INTEGER_64 
      -- Duration in milliseconds that driver was on duty during the requested time range

feature -- Change Element  
 
    set_driver_id (a_name: like driver_id)
        -- Set 'driver_id' with 'a_name'.
      do
        driver_id := a_name
      ensure
        driver_id_set: driver_id = a_name		
      end

    set_distance_miles (a_name: like distance_miles)
        -- Set 'distance_miles' with 'a_name'.
      do
        distance_miles := a_name
      ensure
        distance_miles_set: distance_miles = a_name		
      end

    set_drive_ms (a_name: like drive_ms)
        -- Set 'drive_ms' with 'a_name'.
      do
        drive_ms := a_name
      ensure
        drive_ms_set: drive_ms = a_name		
      end

    set_active_ms (a_name: like active_ms)
        -- Set 'active_ms' with 'a_name'.
      do
        active_ms := a_name
      ensure
        active_ms_set: active_ms = a_name		
      end

    set_driver_username (a_name: like driver_username)
        -- Set 'driver_username' with 'a_name'.
      do
        driver_username := a_name
      ensure
        driver_username_set: driver_username = a_name		
      end

    set_group_id (a_name: like group_id)
        -- Set 'group_id' with 'a_name'.
      do
        group_id := a_name
      ensure
        group_id_set: group_id = a_name		
      end

    set_driver_name (a_name: like driver_name)
        -- Set 'driver_name' with 'a_name'.
      do
        driver_name := a_name
      ensure
        driver_name_set: driver_name = a_name		
      end

    set_on_duty_ms (a_name: like on_duty_ms)
        -- Set 'on_duty_ms' with 'a_name'.
      do
        on_duty_ms := a_name
      ensure
        on_duty_ms_set: on_duty_ms = a_name		
      end


 feature -- Status Report

    out: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass DRIVERS_SUMMARY_RESPONSE_SUMMARIES%N")
        if attached driver_id as l_driver_id then
          Result.append ("%Ndriver_id:")
          Result.append (l_driver_id.out)
          Result.append ("%N")    
        end  
        if attached distance_miles as l_distance_miles then
          Result.append ("%Ndistance_miles:")
          Result.append (l_distance_miles.out)
          Result.append ("%N")    
        end  
        if attached drive_ms as l_drive_ms then
          Result.append ("%Ndrive_ms:")
          Result.append (l_drive_ms.out)
          Result.append ("%N")    
        end  
        if attached active_ms as l_active_ms then
          Result.append ("%Nactive_ms:")
          Result.append (l_active_ms.out)
          Result.append ("%N")    
        end  
        if attached driver_username as l_driver_username then
          Result.append ("%Ndriver_username:")
          Result.append (l_driver_username.out)
          Result.append ("%N")    
        end  
        if attached group_id as l_group_id then
          Result.append ("%Ngroup_id:")
          Result.append (l_group_id.out)
          Result.append ("%N")    
        end  
        if attached driver_name as l_driver_name then
          Result.append ("%Ndriver_name:")
          Result.append (l_driver_name.out)
          Result.append ("%N")    
        end  
        if attached on_duty_ms as l_on_duty_ms then
          Result.append ("%Non_duty_ms:")
          Result.append (l_on_duty_ms.out)
          Result.append ("%N")    
        end  
      end
end



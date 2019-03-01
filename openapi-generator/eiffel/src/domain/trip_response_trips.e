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
class TRIP_RESPONSE_TRIPS 

inherit

  ANY
      redefine
          out 
      end


feature --Access

    end_odometer: INTEGER_32 
      -- Odometer reading at the end of the trip.
    distance_meters: INTEGER_32 
      -- Length of the trip in meters.
    end_ms: INTEGER_32 
      -- End of the trip in UNIX milliseconds.
    start_ms: INTEGER_32 
      -- Beginning of the trip in UNIX milliseconds.
    fuel_consumed_ml: INTEGER_32 
      -- Amount in milliliters of fuel consumed on this trip.
    start_address: detachable STRING_32 
      -- Text representation of nearest identifiable location to the start (latitude, longitude) coordinates.
    start_coordinates: detachable TRIP_RESPONSE_START_COORDINATES 
      
    end_coordinates: detachable TRIP_RESPONSE_END_COORDINATES 
      
    start_odometer: INTEGER_32 
      -- Odometer reading at the beginning of the trip.
    driver_id: INTEGER_32 
      -- ID of the driver.
    start_location: detachable STRING_32 
      -- Geocoded street address of start (latitude, longitude) coordinates.
    toll_meters: INTEGER_32 
      -- Length in meters trip spent on toll roads.
    end_address: detachable STRING_32 
      -- Text representation of nearest identifiable location to the end (latitude, longitude) coordinates.
    end_location: detachable STRING_32 
      -- Geocoded street address of start (latitude, longitude) coordinates.

feature -- Change Element  
 
    set_end_odometer (a_name: like end_odometer)
        -- Set 'end_odometer' with 'a_name'.
      do
        end_odometer := a_name
      ensure
        end_odometer_set: end_odometer = a_name		
      end

    set_distance_meters (a_name: like distance_meters)
        -- Set 'distance_meters' with 'a_name'.
      do
        distance_meters := a_name
      ensure
        distance_meters_set: distance_meters = a_name		
      end

    set_end_ms (a_name: like end_ms)
        -- Set 'end_ms' with 'a_name'.
      do
        end_ms := a_name
      ensure
        end_ms_set: end_ms = a_name		
      end

    set_start_ms (a_name: like start_ms)
        -- Set 'start_ms' with 'a_name'.
      do
        start_ms := a_name
      ensure
        start_ms_set: start_ms = a_name		
      end

    set_fuel_consumed_ml (a_name: like fuel_consumed_ml)
        -- Set 'fuel_consumed_ml' with 'a_name'.
      do
        fuel_consumed_ml := a_name
      ensure
        fuel_consumed_ml_set: fuel_consumed_ml = a_name		
      end

    set_start_address (a_name: like start_address)
        -- Set 'start_address' with 'a_name'.
      do
        start_address := a_name
      ensure
        start_address_set: start_address = a_name		
      end

    set_start_coordinates (a_name: like start_coordinates)
        -- Set 'start_coordinates' with 'a_name'.
      do
        start_coordinates := a_name
      ensure
        start_coordinates_set: start_coordinates = a_name		
      end

    set_end_coordinates (a_name: like end_coordinates)
        -- Set 'end_coordinates' with 'a_name'.
      do
        end_coordinates := a_name
      ensure
        end_coordinates_set: end_coordinates = a_name		
      end

    set_start_odometer (a_name: like start_odometer)
        -- Set 'start_odometer' with 'a_name'.
      do
        start_odometer := a_name
      ensure
        start_odometer_set: start_odometer = a_name		
      end

    set_driver_id (a_name: like driver_id)
        -- Set 'driver_id' with 'a_name'.
      do
        driver_id := a_name
      ensure
        driver_id_set: driver_id = a_name		
      end

    set_start_location (a_name: like start_location)
        -- Set 'start_location' with 'a_name'.
      do
        start_location := a_name
      ensure
        start_location_set: start_location = a_name		
      end

    set_toll_meters (a_name: like toll_meters)
        -- Set 'toll_meters' with 'a_name'.
      do
        toll_meters := a_name
      ensure
        toll_meters_set: toll_meters = a_name		
      end

    set_end_address (a_name: like end_address)
        -- Set 'end_address' with 'a_name'.
      do
        end_address := a_name
      ensure
        end_address_set: end_address = a_name		
      end

    set_end_location (a_name: like end_location)
        -- Set 'end_location' with 'a_name'.
      do
        end_location := a_name
      ensure
        end_location_set: end_location = a_name		
      end


 feature -- Status Report

    out: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass TRIP_RESPONSE_TRIPS%N")
        if attached end_odometer as l_end_odometer then
          Result.append ("%Nend_odometer:")
          Result.append (l_end_odometer.out)
          Result.append ("%N")    
        end  
        if attached distance_meters as l_distance_meters then
          Result.append ("%Ndistance_meters:")
          Result.append (l_distance_meters.out)
          Result.append ("%N")    
        end  
        if attached end_ms as l_end_ms then
          Result.append ("%Nend_ms:")
          Result.append (l_end_ms.out)
          Result.append ("%N")    
        end  
        if attached start_ms as l_start_ms then
          Result.append ("%Nstart_ms:")
          Result.append (l_start_ms.out)
          Result.append ("%N")    
        end  
        if attached fuel_consumed_ml as l_fuel_consumed_ml then
          Result.append ("%Nfuel_consumed_ml:")
          Result.append (l_fuel_consumed_ml.out)
          Result.append ("%N")    
        end  
        if attached start_address as l_start_address then
          Result.append ("%Nstart_address:")
          Result.append (l_start_address.out)
          Result.append ("%N")    
        end  
        if attached start_coordinates as l_start_coordinates then
          Result.append ("%Nstart_coordinates:")
          Result.append (l_start_coordinates.out)
          Result.append ("%N")    
        end  
        if attached end_coordinates as l_end_coordinates then
          Result.append ("%Nend_coordinates:")
          Result.append (l_end_coordinates.out)
          Result.append ("%N")    
        end  
        if attached start_odometer as l_start_odometer then
          Result.append ("%Nstart_odometer:")
          Result.append (l_start_odometer.out)
          Result.append ("%N")    
        end  
        if attached driver_id as l_driver_id then
          Result.append ("%Ndriver_id:")
          Result.append (l_driver_id.out)
          Result.append ("%N")    
        end  
        if attached start_location as l_start_location then
          Result.append ("%Nstart_location:")
          Result.append (l_start_location.out)
          Result.append ("%N")    
        end  
        if attached toll_meters as l_toll_meters then
          Result.append ("%Ntoll_meters:")
          Result.append (l_toll_meters.out)
          Result.append ("%N")    
        end  
        if attached end_address as l_end_address then
          Result.append ("%Nend_address:")
          Result.append (l_end_address.out)
          Result.append ("%N")    
        end  
        if attached end_location as l_end_location then
          Result.append ("%Nend_location:")
          Result.append (l_end_location.out)
          Result.append ("%N")    
        end  
      end
end



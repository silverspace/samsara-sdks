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
class VEHICLE_LOCATION 

inherit

  ANY
      redefine
          out 
      end


feature --Access

    heading: REAL_64 
      -- Heading in degrees.
    id: INTEGER_64 
      -- ID of the vehicle.
    latitude: REAL_64 
      -- Latitude in decimal degrees.
    location: detachable STRING_32 
      -- Text representation of nearest identifiable location to (latitude, longitude) coordinates.
    longitude: REAL_64 
      -- Longitude in decimal degrees.
    name: detachable STRING_32 
      -- Name of the vehicle.
    odometer_meters: INTEGER_64 
      -- The number of meters reported by the odometer.
    on_trip: BOOLEAN 
      -- Whether or not a trip is currently in progress for this vehicle. More information available via /fleet/trips endpoint.
    speed: REAL_64 
      -- Speed in miles per hour.
    time: INTEGER_32 
      -- The time the reported location was logged, reported as a UNIX timestamp in milliseconds.
    vin: detachable STRING_32 
      -- Vehicle Identification Number (VIN) of the vehicle.

feature -- Change Element  
 
    set_heading (a_name: like heading)
        -- Set 'heading' with 'a_name'.
      do
        heading := a_name
      ensure
        heading_set: heading = a_name		
      end

    set_id (a_name: like id)
        -- Set 'id' with 'a_name'.
      do
        id := a_name
      ensure
        id_set: id = a_name		
      end

    set_latitude (a_name: like latitude)
        -- Set 'latitude' with 'a_name'.
      do
        latitude := a_name
      ensure
        latitude_set: latitude = a_name		
      end

    set_location (a_name: like location)
        -- Set 'location' with 'a_name'.
      do
        location := a_name
      ensure
        location_set: location = a_name		
      end

    set_longitude (a_name: like longitude)
        -- Set 'longitude' with 'a_name'.
      do
        longitude := a_name
      ensure
        longitude_set: longitude = a_name		
      end

    set_name (a_name: like name)
        -- Set 'name' with 'a_name'.
      do
        name := a_name
      ensure
        name_set: name = a_name		
      end

    set_odometer_meters (a_name: like odometer_meters)
        -- Set 'odometer_meters' with 'a_name'.
      do
        odometer_meters := a_name
      ensure
        odometer_meters_set: odometer_meters = a_name		
      end

    set_on_trip (a_name: like on_trip)
        -- Set 'on_trip' with 'a_name'.
      do
        on_trip := a_name
      ensure
        on_trip_set: on_trip = a_name		
      end

    set_speed (a_name: like speed)
        -- Set 'speed' with 'a_name'.
      do
        speed := a_name
      ensure
        speed_set: speed = a_name		
      end

    set_time (a_name: like time)
        -- Set 'time' with 'a_name'.
      do
        time := a_name
      ensure
        time_set: time = a_name		
      end

    set_vin (a_name: like vin)
        -- Set 'vin' with 'a_name'.
      do
        vin := a_name
      ensure
        vin_set: vin = a_name		
      end


 feature -- Status Report

    out: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass VEHICLE_LOCATION%N")
        if attached heading as l_heading then
          Result.append ("%Nheading:")
          Result.append (l_heading.out)
          Result.append ("%N")    
        end  
        if attached id as l_id then
          Result.append ("%Nid:")
          Result.append (l_id.out)
          Result.append ("%N")    
        end  
        if attached latitude as l_latitude then
          Result.append ("%Nlatitude:")
          Result.append (l_latitude.out)
          Result.append ("%N")    
        end  
        if attached location as l_location then
          Result.append ("%Nlocation:")
          Result.append (l_location.out)
          Result.append ("%N")    
        end  
        if attached longitude as l_longitude then
          Result.append ("%Nlongitude:")
          Result.append (l_longitude.out)
          Result.append ("%N")    
        end  
        if attached name as l_name then
          Result.append ("%Nname:")
          Result.append (l_name.out)
          Result.append ("%N")    
        end  
        if attached odometer_meters as l_odometer_meters then
          Result.append ("%Nodometer_meters:")
          Result.append (l_odometer_meters.out)
          Result.append ("%N")    
        end  
        if attached on_trip as l_on_trip then
          Result.append ("%Non_trip:")
          Result.append (l_on_trip.out)
          Result.append ("%N")    
        end  
        if attached speed as l_speed then
          Result.append ("%Nspeed:")
          Result.append (l_speed.out)
          Result.append ("%N")    
        end  
        if attached time as l_time then
          Result.append ("%Ntime:")
          Result.append (l_time.out)
          Result.append ("%N")    
        end  
        if attached vin as l_vin then
          Result.append ("%Nvin:")
          Result.append (l_vin.out)
          Result.append ("%N")    
        end  
      end
end



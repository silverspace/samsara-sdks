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
class DISPATCH_ROUTE_BASE 

inherit

  ANY
      redefine
          out 
      end


feature --Access

    actual_end_ms: INTEGER_64 
      -- The time in Unix epoch milliseconds that the route actually ended.
    actual_start_ms: INTEGER_64 
      -- The time in Unix epoch milliseconds that the route actually started.
    driver_id: INTEGER_64 
      -- ID of the driver assigned to the dispatch route. Note that driver_id and vehicle_id are mutually exclusive. If neither is specified, then the route is unassigned.
    group_id: INTEGER_64 
      -- ID of the group if the organization has multiple groups (optional).
    name: detachable STRING_32 
      -- Descriptive name of this route.
    scheduled_end_ms: INTEGER_64 
      -- The time in Unix epoch milliseconds that the last job in the route is scheduled to end.
    scheduled_meters: INTEGER_64 
      -- The distance expected to be traveled for this route in meters.
    scheduled_start_ms: INTEGER_64 
      -- The time in Unix epoch milliseconds that the route is scheduled to start.
    start_location_address: detachable STRING_32 
      -- The address of the route's starting location, as it would be recognized if provided to maps.google.com. Optional if a valid start location address ID is provided.
    start_location_address_id: INTEGER_64 
      -- ID of the start location associated with an address book entry. Optional if valid values are provided for start location address or latitude/longitude. If a valid start location address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the start location name is not provided.
    start_location_lat: REAL_64 
      -- Latitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.
    start_location_lng: REAL_64 
      -- Longitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.
    start_location_name: detachable STRING_32 
      -- The name of the route's starting location. If provided, it will take precedence over the name of the address book entry.
    trailer_id: INTEGER_64 
      -- ID of the trailer assigned to the dispatch route. Note that trailers can only be assigned to routes that have a Vehicle or Driver assigned to them.
    vehicle_id: INTEGER_64 
      -- ID of the vehicle assigned to the dispatch route. Note that vehicle_id and driver_id are mutually exclusive. If neither is specified, then the route is unassigned.

feature -- Change Element  
 
    set_actual_end_ms (a_name: like actual_end_ms)
        -- Set 'actual_end_ms' with 'a_name'.
      do
        actual_end_ms := a_name
      ensure
        actual_end_ms_set: actual_end_ms = a_name		
      end

    set_actual_start_ms (a_name: like actual_start_ms)
        -- Set 'actual_start_ms' with 'a_name'.
      do
        actual_start_ms := a_name
      ensure
        actual_start_ms_set: actual_start_ms = a_name		
      end

    set_driver_id (a_name: like driver_id)
        -- Set 'driver_id' with 'a_name'.
      do
        driver_id := a_name
      ensure
        driver_id_set: driver_id = a_name		
      end

    set_group_id (a_name: like group_id)
        -- Set 'group_id' with 'a_name'.
      do
        group_id := a_name
      ensure
        group_id_set: group_id = a_name		
      end

    set_name (a_name: like name)
        -- Set 'name' with 'a_name'.
      do
        name := a_name
      ensure
        name_set: name = a_name		
      end

    set_scheduled_end_ms (a_name: like scheduled_end_ms)
        -- Set 'scheduled_end_ms' with 'a_name'.
      do
        scheduled_end_ms := a_name
      ensure
        scheduled_end_ms_set: scheduled_end_ms = a_name		
      end

    set_scheduled_meters (a_name: like scheduled_meters)
        -- Set 'scheduled_meters' with 'a_name'.
      do
        scheduled_meters := a_name
      ensure
        scheduled_meters_set: scheduled_meters = a_name		
      end

    set_scheduled_start_ms (a_name: like scheduled_start_ms)
        -- Set 'scheduled_start_ms' with 'a_name'.
      do
        scheduled_start_ms := a_name
      ensure
        scheduled_start_ms_set: scheduled_start_ms = a_name		
      end

    set_start_location_address (a_name: like start_location_address)
        -- Set 'start_location_address' with 'a_name'.
      do
        start_location_address := a_name
      ensure
        start_location_address_set: start_location_address = a_name		
      end

    set_start_location_address_id (a_name: like start_location_address_id)
        -- Set 'start_location_address_id' with 'a_name'.
      do
        start_location_address_id := a_name
      ensure
        start_location_address_id_set: start_location_address_id = a_name		
      end

    set_start_location_lat (a_name: like start_location_lat)
        -- Set 'start_location_lat' with 'a_name'.
      do
        start_location_lat := a_name
      ensure
        start_location_lat_set: start_location_lat = a_name		
      end

    set_start_location_lng (a_name: like start_location_lng)
        -- Set 'start_location_lng' with 'a_name'.
      do
        start_location_lng := a_name
      ensure
        start_location_lng_set: start_location_lng = a_name		
      end

    set_start_location_name (a_name: like start_location_name)
        -- Set 'start_location_name' with 'a_name'.
      do
        start_location_name := a_name
      ensure
        start_location_name_set: start_location_name = a_name		
      end

    set_trailer_id (a_name: like trailer_id)
        -- Set 'trailer_id' with 'a_name'.
      do
        trailer_id := a_name
      ensure
        trailer_id_set: trailer_id = a_name		
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
        Result.append("%Nclass DISPATCH_ROUTE_BASE%N")
        if attached actual_end_ms as l_actual_end_ms then
          Result.append ("%Nactual_end_ms:")
          Result.append (l_actual_end_ms.out)
          Result.append ("%N")    
        end  
        if attached actual_start_ms as l_actual_start_ms then
          Result.append ("%Nactual_start_ms:")
          Result.append (l_actual_start_ms.out)
          Result.append ("%N")    
        end  
        if attached driver_id as l_driver_id then
          Result.append ("%Ndriver_id:")
          Result.append (l_driver_id.out)
          Result.append ("%N")    
        end  
        if attached group_id as l_group_id then
          Result.append ("%Ngroup_id:")
          Result.append (l_group_id.out)
          Result.append ("%N")    
        end  
        if attached name as l_name then
          Result.append ("%Nname:")
          Result.append (l_name.out)
          Result.append ("%N")    
        end  
        if attached scheduled_end_ms as l_scheduled_end_ms then
          Result.append ("%Nscheduled_end_ms:")
          Result.append (l_scheduled_end_ms.out)
          Result.append ("%N")    
        end  
        if attached scheduled_meters as l_scheduled_meters then
          Result.append ("%Nscheduled_meters:")
          Result.append (l_scheduled_meters.out)
          Result.append ("%N")    
        end  
        if attached scheduled_start_ms as l_scheduled_start_ms then
          Result.append ("%Nscheduled_start_ms:")
          Result.append (l_scheduled_start_ms.out)
          Result.append ("%N")    
        end  
        if attached start_location_address as l_start_location_address then
          Result.append ("%Nstart_location_address:")
          Result.append (l_start_location_address.out)
          Result.append ("%N")    
        end  
        if attached start_location_address_id as l_start_location_address_id then
          Result.append ("%Nstart_location_address_id:")
          Result.append (l_start_location_address_id.out)
          Result.append ("%N")    
        end  
        if attached start_location_lat as l_start_location_lat then
          Result.append ("%Nstart_location_lat:")
          Result.append (l_start_location_lat.out)
          Result.append ("%N")    
        end  
        if attached start_location_lng as l_start_location_lng then
          Result.append ("%Nstart_location_lng:")
          Result.append (l_start_location_lng.out)
          Result.append ("%N")    
        end  
        if attached start_location_name as l_start_location_name then
          Result.append ("%Nstart_location_name:")
          Result.append (l_start_location_name.out)
          Result.append ("%N")    
        end  
        if attached trailer_id as l_trailer_id then
          Result.append ("%Ntrailer_id:")
          Result.append (l_trailer_id.out)
          Result.append ("%N")    
        end  
        if attached vehicle_id as l_vehicle_id then
          Result.append ("%Nvehicle_id:")
          Result.append (l_vehicle_id.out)
          Result.append ("%N")    
        end  
      end
end



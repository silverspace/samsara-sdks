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
class DISPATCH_JOB 

inherit

  ANY
      redefine
          out 
      end


feature --Access

    destination_address: detachable STRING_32 
      -- The address of the job destination, as it would be recognized if provided to maps.google.com. Optional if a valid destination address ID is provided.
    destination_address_id: INTEGER_64 
      -- ID of the job destination associated with an address book entry. Optional if valid values are provided for destination address or latitude/longitude. If a valid destination address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the destination name is not provided.
    destination_lat: REAL_64 
      -- Latitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.
    destination_lng: REAL_64 
      -- Longitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.
    destination_name: detachable STRING_32 
      -- The name of the job destination. If provided, it will take precedence over the name of the address book entry.
    notes: detachable STRING_32 
      -- Notes regarding the details of this job.
    scheduled_arrival_time_ms: INTEGER_64 
      -- The time at which the assigned driver is scheduled to arrive at the job destination.
    scheduled_departure_time_ms: INTEGER_64 
      -- The time at which the assigned driver is scheduled to depart from the job destination.
    arrived_at_ms: INTEGER_64 
      -- The time at which the driver arrived at the job destination.
    completed_at_ms: INTEGER_64 
      -- The time at which the job was marked complete (e.g. started driving to the next destination).
    dispatch_route_id: INTEGER_64 
      -- ID of the route that this job belongs to.
    driver_id: INTEGER_64 
      -- ID of the driver assigned to the dispatch job.
    en_route_at_ms: INTEGER_64 
      -- The time at which the assigned driver started fulfilling the job (e.g. started driving to the destination).
    estimated_arrival_ms: INTEGER_64 
      -- The time at which the assigned driver is estimated to arrive at the job destination. Only valid for en-route jobs.
    fleet_viewer_url: detachable STRING_32 
      -- Fleet viewer url of the dispatch job.
    group_id: INTEGER_64 
      
    id: INTEGER_64 
      -- ID of the Samsara dispatch job.
    job_state: detachable JOB_STATUS 
      
    skipped_at_ms: INTEGER_64 
      -- The time at which the job was marked skipped.
    vehicle_id: INTEGER_64 
      -- ID of the vehicle used for the dispatch job.

feature -- Change Element  
 
    set_destination_address (a_name: like destination_address)
        -- Set 'destination_address' with 'a_name'.
      do
        destination_address := a_name
      ensure
        destination_address_set: destination_address = a_name		
      end

    set_destination_address_id (a_name: like destination_address_id)
        -- Set 'destination_address_id' with 'a_name'.
      do
        destination_address_id := a_name
      ensure
        destination_address_id_set: destination_address_id = a_name		
      end

    set_destination_lat (a_name: like destination_lat)
        -- Set 'destination_lat' with 'a_name'.
      do
        destination_lat := a_name
      ensure
        destination_lat_set: destination_lat = a_name		
      end

    set_destination_lng (a_name: like destination_lng)
        -- Set 'destination_lng' with 'a_name'.
      do
        destination_lng := a_name
      ensure
        destination_lng_set: destination_lng = a_name		
      end

    set_destination_name (a_name: like destination_name)
        -- Set 'destination_name' with 'a_name'.
      do
        destination_name := a_name
      ensure
        destination_name_set: destination_name = a_name		
      end

    set_notes (a_name: like notes)
        -- Set 'notes' with 'a_name'.
      do
        notes := a_name
      ensure
        notes_set: notes = a_name		
      end

    set_scheduled_arrival_time_ms (a_name: like scheduled_arrival_time_ms)
        -- Set 'scheduled_arrival_time_ms' with 'a_name'.
      do
        scheduled_arrival_time_ms := a_name
      ensure
        scheduled_arrival_time_ms_set: scheduled_arrival_time_ms = a_name		
      end

    set_scheduled_departure_time_ms (a_name: like scheduled_departure_time_ms)
        -- Set 'scheduled_departure_time_ms' with 'a_name'.
      do
        scheduled_departure_time_ms := a_name
      ensure
        scheduled_departure_time_ms_set: scheduled_departure_time_ms = a_name		
      end

    set_arrived_at_ms (a_name: like arrived_at_ms)
        -- Set 'arrived_at_ms' with 'a_name'.
      do
        arrived_at_ms := a_name
      ensure
        arrived_at_ms_set: arrived_at_ms = a_name		
      end

    set_completed_at_ms (a_name: like completed_at_ms)
        -- Set 'completed_at_ms' with 'a_name'.
      do
        completed_at_ms := a_name
      ensure
        completed_at_ms_set: completed_at_ms = a_name		
      end

    set_dispatch_route_id (a_name: like dispatch_route_id)
        -- Set 'dispatch_route_id' with 'a_name'.
      do
        dispatch_route_id := a_name
      ensure
        dispatch_route_id_set: dispatch_route_id = a_name		
      end

    set_driver_id (a_name: like driver_id)
        -- Set 'driver_id' with 'a_name'.
      do
        driver_id := a_name
      ensure
        driver_id_set: driver_id = a_name		
      end

    set_en_route_at_ms (a_name: like en_route_at_ms)
        -- Set 'en_route_at_ms' with 'a_name'.
      do
        en_route_at_ms := a_name
      ensure
        en_route_at_ms_set: en_route_at_ms = a_name		
      end

    set_estimated_arrival_ms (a_name: like estimated_arrival_ms)
        -- Set 'estimated_arrival_ms' with 'a_name'.
      do
        estimated_arrival_ms := a_name
      ensure
        estimated_arrival_ms_set: estimated_arrival_ms = a_name		
      end

    set_fleet_viewer_url (a_name: like fleet_viewer_url)
        -- Set 'fleet_viewer_url' with 'a_name'.
      do
        fleet_viewer_url := a_name
      ensure
        fleet_viewer_url_set: fleet_viewer_url = a_name		
      end

    set_group_id (a_name: like group_id)
        -- Set 'group_id' with 'a_name'.
      do
        group_id := a_name
      ensure
        group_id_set: group_id = a_name		
      end

    set_id (a_name: like id)
        -- Set 'id' with 'a_name'.
      do
        id := a_name
      ensure
        id_set: id = a_name		
      end

    set_job_state (a_name: like job_state)
        -- Set 'job_state' with 'a_name'.
      do
        job_state := a_name
      ensure
        job_state_set: job_state = a_name		
      end

    set_skipped_at_ms (a_name: like skipped_at_ms)
        -- Set 'skipped_at_ms' with 'a_name'.
      do
        skipped_at_ms := a_name
      ensure
        skipped_at_ms_set: skipped_at_ms = a_name		
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
        Result.append("%Nclass DISPATCH_JOB%N")
        if attached destination_address as l_destination_address then
          Result.append ("%Ndestination_address:")
          Result.append (l_destination_address.out)
          Result.append ("%N")    
        end  
        if attached destination_address_id as l_destination_address_id then
          Result.append ("%Ndestination_address_id:")
          Result.append (l_destination_address_id.out)
          Result.append ("%N")    
        end  
        if attached destination_lat as l_destination_lat then
          Result.append ("%Ndestination_lat:")
          Result.append (l_destination_lat.out)
          Result.append ("%N")    
        end  
        if attached destination_lng as l_destination_lng then
          Result.append ("%Ndestination_lng:")
          Result.append (l_destination_lng.out)
          Result.append ("%N")    
        end  
        if attached destination_name as l_destination_name then
          Result.append ("%Ndestination_name:")
          Result.append (l_destination_name.out)
          Result.append ("%N")    
        end  
        if attached notes as l_notes then
          Result.append ("%Nnotes:")
          Result.append (l_notes.out)
          Result.append ("%N")    
        end  
        if attached scheduled_arrival_time_ms as l_scheduled_arrival_time_ms then
          Result.append ("%Nscheduled_arrival_time_ms:")
          Result.append (l_scheduled_arrival_time_ms.out)
          Result.append ("%N")    
        end  
        if attached scheduled_departure_time_ms as l_scheduled_departure_time_ms then
          Result.append ("%Nscheduled_departure_time_ms:")
          Result.append (l_scheduled_departure_time_ms.out)
          Result.append ("%N")    
        end  
        if attached arrived_at_ms as l_arrived_at_ms then
          Result.append ("%Narrived_at_ms:")
          Result.append (l_arrived_at_ms.out)
          Result.append ("%N")    
        end  
        if attached completed_at_ms as l_completed_at_ms then
          Result.append ("%Ncompleted_at_ms:")
          Result.append (l_completed_at_ms.out)
          Result.append ("%N")    
        end  
        if attached dispatch_route_id as l_dispatch_route_id then
          Result.append ("%Ndispatch_route_id:")
          Result.append (l_dispatch_route_id.out)
          Result.append ("%N")    
        end  
        if attached driver_id as l_driver_id then
          Result.append ("%Ndriver_id:")
          Result.append (l_driver_id.out)
          Result.append ("%N")    
        end  
        if attached en_route_at_ms as l_en_route_at_ms then
          Result.append ("%Nen_route_at_ms:")
          Result.append (l_en_route_at_ms.out)
          Result.append ("%N")    
        end  
        if attached estimated_arrival_ms as l_estimated_arrival_ms then
          Result.append ("%Nestimated_arrival_ms:")
          Result.append (l_estimated_arrival_ms.out)
          Result.append ("%N")    
        end  
        if attached fleet_viewer_url as l_fleet_viewer_url then
          Result.append ("%Nfleet_viewer_url:")
          Result.append (l_fleet_viewer_url.out)
          Result.append ("%N")    
        end  
        if attached group_id as l_group_id then
          Result.append ("%Ngroup_id:")
          Result.append (l_group_id.out)
          Result.append ("%N")    
        end  
        if attached id as l_id then
          Result.append ("%Nid:")
          Result.append (l_id.out)
          Result.append ("%N")    
        end  
        if attached job_state as l_job_state then
          Result.append ("%Njob_state:")
          Result.append (l_job_state.out)
          Result.append ("%N")    
        end  
        if attached skipped_at_ms as l_skipped_at_ms then
          Result.append ("%Nskipped_at_ms:")
          Result.append (l_skipped_at_ms.out)
          Result.append ("%N")    
        end  
        if attached vehicle_id as l_vehicle_id then
          Result.append ("%Nvehicle_id:")
          Result.append (l_vehicle_id.out)
          Result.append ("%N")    
        end  
      end
end



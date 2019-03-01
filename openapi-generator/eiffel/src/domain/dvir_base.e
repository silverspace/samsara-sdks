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
class DVIR_BASE 

inherit

  ANY
      redefine
          out 
      end


feature --Access

    author_signature: detachable DVIR_BASE_AUTHOR_SIGNATURE 
      
    defects_corrected: BOOLEAN 
      -- Signifies if the defects on the vehicle corrected after the DVIR is done.
    defects_need_not_be_corrected: BOOLEAN 
      -- Signifies if the defects on this vehicle can be ignored.
    id: INTEGER_64 
      -- The id of this DVIR record.
    inspection_type: detachable STRING_32 
      -- Inspection type of the DVIR.
    mechanic_notes: detachable STRING_32 
      -- The mechanics notes on the DVIR.
    mechanic_or_agent_signature: detachable DVIR_BASE_MECHANIC_OR_AGENT_SIGNATURE 
      
    next_driver_signature: detachable DVIR_BASE_NEXT_DRIVER_SIGNATURE 
      
    odometer_miles: INTEGER_64 
      -- The odometer reading in miles for the vehicle when the DVIR was done.
    time_ms: INTEGER_64 
      -- Timestamp of this DVIR in UNIX milliseconds.
    trailer_defects: detachable LIST [DVIR_BASE_TRAILER_DEFECTS] 
      -- Defects registered for the trailer which was part of the DVIR.
    trailer_id: INTEGER_32 
      -- The id of the trailer which was part of the DVIR.
    trailer_name: detachable STRING_32 
      -- The name of the trailer which was part of the DVIR.
    vehicle: detachable DVIR_BASE_VEHICLE 
      
    vehicle_condition: detachable STRING_32 
      -- The condition of vechile on which DVIR was done.
    vehicle_defects: detachable LIST [DVIR_BASE_TRAILER_DEFECTS] 
      -- Defects registered for the vehicle which was part of the DVIR.

feature -- Change Element  
 
    set_author_signature (a_name: like author_signature)
        -- Set 'author_signature' with 'a_name'.
      do
        author_signature := a_name
      ensure
        author_signature_set: author_signature = a_name		
      end

    set_defects_corrected (a_name: like defects_corrected)
        -- Set 'defects_corrected' with 'a_name'.
      do
        defects_corrected := a_name
      ensure
        defects_corrected_set: defects_corrected = a_name		
      end

    set_defects_need_not_be_corrected (a_name: like defects_need_not_be_corrected)
        -- Set 'defects_need_not_be_corrected' with 'a_name'.
      do
        defects_need_not_be_corrected := a_name
      ensure
        defects_need_not_be_corrected_set: defects_need_not_be_corrected = a_name		
      end

    set_id (a_name: like id)
        -- Set 'id' with 'a_name'.
      do
        id := a_name
      ensure
        id_set: id = a_name		
      end

    set_inspection_type (a_name: like inspection_type)
        -- Set 'inspection_type' with 'a_name'.
      do
        inspection_type := a_name
      ensure
        inspection_type_set: inspection_type = a_name		
      end

    set_mechanic_notes (a_name: like mechanic_notes)
        -- Set 'mechanic_notes' with 'a_name'.
      do
        mechanic_notes := a_name
      ensure
        mechanic_notes_set: mechanic_notes = a_name		
      end

    set_mechanic_or_agent_signature (a_name: like mechanic_or_agent_signature)
        -- Set 'mechanic_or_agent_signature' with 'a_name'.
      do
        mechanic_or_agent_signature := a_name
      ensure
        mechanic_or_agent_signature_set: mechanic_or_agent_signature = a_name		
      end

    set_next_driver_signature (a_name: like next_driver_signature)
        -- Set 'next_driver_signature' with 'a_name'.
      do
        next_driver_signature := a_name
      ensure
        next_driver_signature_set: next_driver_signature = a_name		
      end

    set_odometer_miles (a_name: like odometer_miles)
        -- Set 'odometer_miles' with 'a_name'.
      do
        odometer_miles := a_name
      ensure
        odometer_miles_set: odometer_miles = a_name		
      end

    set_time_ms (a_name: like time_ms)
        -- Set 'time_ms' with 'a_name'.
      do
        time_ms := a_name
      ensure
        time_ms_set: time_ms = a_name		
      end

    set_trailer_defects (a_name: like trailer_defects)
        -- Set 'trailer_defects' with 'a_name'.
      do
        trailer_defects := a_name
      ensure
        trailer_defects_set: trailer_defects = a_name		
      end

    set_trailer_id (a_name: like trailer_id)
        -- Set 'trailer_id' with 'a_name'.
      do
        trailer_id := a_name
      ensure
        trailer_id_set: trailer_id = a_name		
      end

    set_trailer_name (a_name: like trailer_name)
        -- Set 'trailer_name' with 'a_name'.
      do
        trailer_name := a_name
      ensure
        trailer_name_set: trailer_name = a_name		
      end

    set_vehicle (a_name: like vehicle)
        -- Set 'vehicle' with 'a_name'.
      do
        vehicle := a_name
      ensure
        vehicle_set: vehicle = a_name		
      end

    set_vehicle_condition (a_name: like vehicle_condition)
        -- Set 'vehicle_condition' with 'a_name'.
      do
        vehicle_condition := a_name
      ensure
        vehicle_condition_set: vehicle_condition = a_name		
      end

    set_vehicle_defects (a_name: like vehicle_defects)
        -- Set 'vehicle_defects' with 'a_name'.
      do
        vehicle_defects := a_name
      ensure
        vehicle_defects_set: vehicle_defects = a_name		
      end


 feature -- Status Report

    out: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass DVIR_BASE%N")
        if attached author_signature as l_author_signature then
          Result.append ("%Nauthor_signature:")
          Result.append (l_author_signature.out)
          Result.append ("%N")    
        end  
        if attached defects_corrected as l_defects_corrected then
          Result.append ("%Ndefects_corrected:")
          Result.append (l_defects_corrected.out)
          Result.append ("%N")    
        end  
        if attached defects_need_not_be_corrected as l_defects_need_not_be_corrected then
          Result.append ("%Ndefects_need_not_be_corrected:")
          Result.append (l_defects_need_not_be_corrected.out)
          Result.append ("%N")    
        end  
        if attached id as l_id then
          Result.append ("%Nid:")
          Result.append (l_id.out)
          Result.append ("%N")    
        end  
        if attached inspection_type as l_inspection_type then
          Result.append ("%Ninspection_type:")
          Result.append (l_inspection_type.out)
          Result.append ("%N")    
        end  
        if attached mechanic_notes as l_mechanic_notes then
          Result.append ("%Nmechanic_notes:")
          Result.append (l_mechanic_notes.out)
          Result.append ("%N")    
        end  
        if attached mechanic_or_agent_signature as l_mechanic_or_agent_signature then
          Result.append ("%Nmechanic_or_agent_signature:")
          Result.append (l_mechanic_or_agent_signature.out)
          Result.append ("%N")    
        end  
        if attached next_driver_signature as l_next_driver_signature then
          Result.append ("%Nnext_driver_signature:")
          Result.append (l_next_driver_signature.out)
          Result.append ("%N")    
        end  
        if attached odometer_miles as l_odometer_miles then
          Result.append ("%Nodometer_miles:")
          Result.append (l_odometer_miles.out)
          Result.append ("%N")    
        end  
        if attached time_ms as l_time_ms then
          Result.append ("%Ntime_ms:")
          Result.append (l_time_ms.out)
          Result.append ("%N")    
        end  
        if attached trailer_defects as l_trailer_defects then
          across l_trailer_defects as ic loop
            Result.append ("%N trailer_defects:")
            Result.append (ic.item.out)
            Result.append ("%N")
          end
        end 
        if attached trailer_id as l_trailer_id then
          Result.append ("%Ntrailer_id:")
          Result.append (l_trailer_id.out)
          Result.append ("%N")    
        end  
        if attached trailer_name as l_trailer_name then
          Result.append ("%Ntrailer_name:")
          Result.append (l_trailer_name.out)
          Result.append ("%N")    
        end  
        if attached vehicle as l_vehicle then
          Result.append ("%Nvehicle:")
          Result.append (l_vehicle.out)
          Result.append ("%N")    
        end  
        if attached vehicle_condition as l_vehicle_condition then
          Result.append ("%Nvehicle_condition:")
          Result.append (l_vehicle_condition.out)
          Result.append ("%N")    
        end  
        if attached vehicle_defects as l_vehicle_defects then
          across l_vehicle_defects as ic loop
            Result.append ("%N vehicle_defects:")
            Result.append (ic.item.out)
            Result.append ("%N")
          end
        end 
      end
end



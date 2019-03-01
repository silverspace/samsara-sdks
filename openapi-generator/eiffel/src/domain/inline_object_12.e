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
class INLINE_OBJECT_12 

inherit

  ANY
      redefine
          out 
      end


feature --Access

    inspection_type: detachable STRING_32 
      -- Only type 'mechanic' is currently accepted.
    mechanic_notes: detachable STRING_32 
      -- Any notes from the mechanic.
    odometer_miles: INTEGER_32 
      -- The current odometer of the vehicle.
    previous_defects_corrected: BOOLEAN 
      -- Whether any previous defects were corrected. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true.
    previous_defects_ignored: BOOLEAN 
      -- Whether any previous defects were ignored. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true.
    safe: detachable STRING_32 
      -- Whether or not this vehicle or trailer is safe to drive.
    trailer_id: INTEGER_32 
      -- Id of trailer being inspected. Either vehicleId or trailerId must be provided.
    user_email: detachable STRING_32 
      -- The Samsara login email for the person creating the DVIR. The email must correspond to a Samsara user's email.
    vehicle_id: INTEGER_32 
      -- Id of vehicle being inspected. Either vehicleId or trailerId must be provided.

feature -- Change Element  
 
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

    set_odometer_miles (a_name: like odometer_miles)
        -- Set 'odometer_miles' with 'a_name'.
      do
        odometer_miles := a_name
      ensure
        odometer_miles_set: odometer_miles = a_name		
      end

    set_previous_defects_corrected (a_name: like previous_defects_corrected)
        -- Set 'previous_defects_corrected' with 'a_name'.
      do
        previous_defects_corrected := a_name
      ensure
        previous_defects_corrected_set: previous_defects_corrected = a_name		
      end

    set_previous_defects_ignored (a_name: like previous_defects_ignored)
        -- Set 'previous_defects_ignored' with 'a_name'.
      do
        previous_defects_ignored := a_name
      ensure
        previous_defects_ignored_set: previous_defects_ignored = a_name		
      end

    set_safe (a_name: like safe)
        -- Set 'safe' with 'a_name'.
      do
        safe := a_name
      ensure
        safe_set: safe = a_name		
      end

    set_trailer_id (a_name: like trailer_id)
        -- Set 'trailer_id' with 'a_name'.
      do
        trailer_id := a_name
      ensure
        trailer_id_set: trailer_id = a_name		
      end

    set_user_email (a_name: like user_email)
        -- Set 'user_email' with 'a_name'.
      do
        user_email := a_name
      ensure
        user_email_set: user_email = a_name		
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
        Result.append("%Nclass INLINE_OBJECT_12%N")
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
        if attached odometer_miles as l_odometer_miles then
          Result.append ("%Nodometer_miles:")
          Result.append (l_odometer_miles.out)
          Result.append ("%N")    
        end  
        if attached previous_defects_corrected as l_previous_defects_corrected then
          Result.append ("%Nprevious_defects_corrected:")
          Result.append (l_previous_defects_corrected.out)
          Result.append ("%N")    
        end  
        if attached previous_defects_ignored as l_previous_defects_ignored then
          Result.append ("%Nprevious_defects_ignored:")
          Result.append (l_previous_defects_ignored.out)
          Result.append ("%N")    
        end  
        if attached safe as l_safe then
          Result.append ("%Nsafe:")
          Result.append (l_safe.out)
          Result.append ("%N")    
        end  
        if attached trailer_id as l_trailer_id then
          Result.append ("%Ntrailer_id:")
          Result.append (l_trailer_id.out)
          Result.append ("%N")    
        end  
        if attached user_email as l_user_email then
          Result.append ("%Nuser_email:")
          Result.append (l_user_email.out)
          Result.append ("%N")    
        end  
        if attached vehicle_id as l_vehicle_id then
          Result.append ("%Nvehicle_id:")
          Result.append (l_vehicle_id.out)
          Result.append ("%N")    
        end  
      end
end



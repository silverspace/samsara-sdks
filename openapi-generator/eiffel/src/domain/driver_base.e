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
class DRIVER_BASE 

inherit

  ANY
      redefine
          out 
      end


feature --Access

    eld_adverse_weather_exemption_enabled: BOOLEAN 
      -- Flag indicating this driver may use Adverse Weather exemptions in ELD logs.
    eld_big_day_exemption_enabled: BOOLEAN 
      -- Flag indicating this driver may use Big Day excemptions in ELD logs.
    eld_day_start_hour: INTEGER_32 
      -- 0 indicating midnight-to-midnight ELD driving hours, 12 to indicate noon-to-noon driving hours.
    eld_exempt: BOOLEAN 
      -- Flag indicating this driver is exempt from the Electronic Logging Mandate.
    eld_exempt_reason: detachable STRING_32 
      -- Reason that this driver is exempt from the Electronic Logging Mandate (see eldExempt).
    eld_pc_enabled: BOOLEAN 
      -- Flag indicating this driver may select the Personal Conveyance duty status in ELD logs.
    eld_ym_enabled: BOOLEAN 
      -- Flag indicating this driver may select the Yard Move duty status in ELD logs.
    external_ids: detachable STRING_TABLE[STRING_32] 
      -- Dictionary of external IDs (string key-value pairs)
    group_id: INTEGER_64 
      -- ID of the group if the organization has multiple groups (uncommon).
    license_number: detachable STRING_32 
      -- Driver's state issued license number.
    license_state: detachable STRING_32 
      -- Abbreviation of state that issued driver's license.
    name: detachable STRING_32 
      -- Driver's name.
    notes: detachable STRING_32 
      -- Notes about the driver.
    phone: detachable STRING_32 
      -- Driver's phone number. Please include only digits, ex. 4157771234
    username: detachable STRING_32 
      -- Driver's login username into the driver app.
    vehicle_id: INTEGER_64 
      -- ID of the vehicle assigned to the driver for static vehicle assignments. (uncommon).

feature -- Change Element  
 
    set_eld_adverse_weather_exemption_enabled (a_name: like eld_adverse_weather_exemption_enabled)
        -- Set 'eld_adverse_weather_exemption_enabled' with 'a_name'.
      do
        eld_adverse_weather_exemption_enabled := a_name
      ensure
        eld_adverse_weather_exemption_enabled_set: eld_adverse_weather_exemption_enabled = a_name		
      end

    set_eld_big_day_exemption_enabled (a_name: like eld_big_day_exemption_enabled)
        -- Set 'eld_big_day_exemption_enabled' with 'a_name'.
      do
        eld_big_day_exemption_enabled := a_name
      ensure
        eld_big_day_exemption_enabled_set: eld_big_day_exemption_enabled = a_name		
      end

    set_eld_day_start_hour (a_name: like eld_day_start_hour)
        -- Set 'eld_day_start_hour' with 'a_name'.
      do
        eld_day_start_hour := a_name
      ensure
        eld_day_start_hour_set: eld_day_start_hour = a_name		
      end

    set_eld_exempt (a_name: like eld_exempt)
        -- Set 'eld_exempt' with 'a_name'.
      do
        eld_exempt := a_name
      ensure
        eld_exempt_set: eld_exempt = a_name		
      end

    set_eld_exempt_reason (a_name: like eld_exempt_reason)
        -- Set 'eld_exempt_reason' with 'a_name'.
      do
        eld_exempt_reason := a_name
      ensure
        eld_exempt_reason_set: eld_exempt_reason = a_name		
      end

    set_eld_pc_enabled (a_name: like eld_pc_enabled)
        -- Set 'eld_pc_enabled' with 'a_name'.
      do
        eld_pc_enabled := a_name
      ensure
        eld_pc_enabled_set: eld_pc_enabled = a_name		
      end

    set_eld_ym_enabled (a_name: like eld_ym_enabled)
        -- Set 'eld_ym_enabled' with 'a_name'.
      do
        eld_ym_enabled := a_name
      ensure
        eld_ym_enabled_set: eld_ym_enabled = a_name		
      end

    set_external_ids (a_name: like external_ids)
        -- Set 'external_ids' with 'a_name'.
      do
        external_ids := a_name
      ensure
        external_ids_set: external_ids = a_name		
      end

    set_group_id (a_name: like group_id)
        -- Set 'group_id' with 'a_name'.
      do
        group_id := a_name
      ensure
        group_id_set: group_id = a_name		
      end

    set_license_number (a_name: like license_number)
        -- Set 'license_number' with 'a_name'.
      do
        license_number := a_name
      ensure
        license_number_set: license_number = a_name		
      end

    set_license_state (a_name: like license_state)
        -- Set 'license_state' with 'a_name'.
      do
        license_state := a_name
      ensure
        license_state_set: license_state = a_name		
      end

    set_name (a_name: like name)
        -- Set 'name' with 'a_name'.
      do
        name := a_name
      ensure
        name_set: name = a_name		
      end

    set_notes (a_name: like notes)
        -- Set 'notes' with 'a_name'.
      do
        notes := a_name
      ensure
        notes_set: notes = a_name		
      end

    set_phone (a_name: like phone)
        -- Set 'phone' with 'a_name'.
      do
        phone := a_name
      ensure
        phone_set: phone = a_name		
      end

    set_username (a_name: like username)
        -- Set 'username' with 'a_name'.
      do
        username := a_name
      ensure
        username_set: username = a_name		
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
        Result.append("%Nclass DRIVER_BASE%N")
        if attached eld_adverse_weather_exemption_enabled as l_eld_adverse_weather_exemption_enabled then
          Result.append ("%Neld_adverse_weather_exemption_enabled:")
          Result.append (l_eld_adverse_weather_exemption_enabled.out)
          Result.append ("%N")    
        end  
        if attached eld_big_day_exemption_enabled as l_eld_big_day_exemption_enabled then
          Result.append ("%Neld_big_day_exemption_enabled:")
          Result.append (l_eld_big_day_exemption_enabled.out)
          Result.append ("%N")    
        end  
        if attached eld_day_start_hour as l_eld_day_start_hour then
          Result.append ("%Neld_day_start_hour:")
          Result.append (l_eld_day_start_hour.out)
          Result.append ("%N")    
        end  
        if attached eld_exempt as l_eld_exempt then
          Result.append ("%Neld_exempt:")
          Result.append (l_eld_exempt.out)
          Result.append ("%N")    
        end  
        if attached eld_exempt_reason as l_eld_exempt_reason then
          Result.append ("%Neld_exempt_reason:")
          Result.append (l_eld_exempt_reason.out)
          Result.append ("%N")    
        end  
        if attached eld_pc_enabled as l_eld_pc_enabled then
          Result.append ("%Neld_pc_enabled:")
          Result.append (l_eld_pc_enabled.out)
          Result.append ("%N")    
        end  
        if attached eld_ym_enabled as l_eld_ym_enabled then
          Result.append ("%Neld_ym_enabled:")
          Result.append (l_eld_ym_enabled.out)
          Result.append ("%N")    
        end  
        if attached external_ids as l_external_ids then
          Result.append ("%Nexternal_ids:")
          across l_external_ids as ic loop
            Result.append ("%N")
            Result.append ("key:")
            Result.append (ic.key.out)
            Result.append (" - ")
            Result.append ("val:")
            Result.append (ic.item.out)
            Result.append ("%N")
          end
        end        
        if attached group_id as l_group_id then
          Result.append ("%Ngroup_id:")
          Result.append (l_group_id.out)
          Result.append ("%N")    
        end  
        if attached license_number as l_license_number then
          Result.append ("%Nlicense_number:")
          Result.append (l_license_number.out)
          Result.append ("%N")    
        end  
        if attached license_state as l_license_state then
          Result.append ("%Nlicense_state:")
          Result.append (l_license_state.out)
          Result.append ("%N")    
        end  
        if attached name as l_name then
          Result.append ("%Nname:")
          Result.append (l_name.out)
          Result.append ("%N")    
        end  
        if attached notes as l_notes then
          Result.append ("%Nnotes:")
          Result.append (l_notes.out)
          Result.append ("%N")    
        end  
        if attached phone as l_phone then
          Result.append ("%Nphone:")
          Result.append (l_phone.out)
          Result.append ("%N")    
        end  
        if attached username as l_username then
          Result.append ("%Nusername:")
          Result.append (l_username.out)
          Result.append ("%N")    
        end  
        if attached vehicle_id as l_vehicle_id then
          Result.append ("%Nvehicle_id:")
          Result.append (l_vehicle_id.out)
          Result.append ("%N")    
        end  
      end
end



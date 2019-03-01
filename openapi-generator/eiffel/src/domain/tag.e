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
class TAG 

inherit

  ANY
      redefine
          out 
      end


feature --Access

    addresses: detachable LIST [TAGGED_ADDRESS] 
      -- The addresses that belong to this tag.
    assets: detachable LIST [TAGGED_ASSET] 
      -- The assets that belong to this tag.
    drivers: detachable LIST [TAGGED_DRIVER] 
      -- The drivers that belong to this tag.
    group_id: INTEGER_64 
      -- The GroupID that this tag belongs to.
    id: INTEGER_64 
      -- The ID of this tag.
    machines: detachable LIST [TAGGED_MACHINE] 
      -- The machines that belong to this tag.
    name: detachable STRING_32 
      -- Name of this tag.
    parent_tag_id: INTEGER_64 
      -- If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag's parent tag.
    sensors: detachable LIST [TAGGED_SENSOR] 
      -- The sensors that belong to this tag.
    vehicles: detachable LIST [TAGGED_VEHICLE] 
      -- The vehicles that belong to this tag.

feature -- Change Element  
 
    set_addresses (a_name: like addresses)
        -- Set 'addresses' with 'a_name'.
      do
        addresses := a_name
      ensure
        addresses_set: addresses = a_name		
      end

    set_assets (a_name: like assets)
        -- Set 'assets' with 'a_name'.
      do
        assets := a_name
      ensure
        assets_set: assets = a_name		
      end

    set_drivers (a_name: like drivers)
        -- Set 'drivers' with 'a_name'.
      do
        drivers := a_name
      ensure
        drivers_set: drivers = a_name		
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

    set_machines (a_name: like machines)
        -- Set 'machines' with 'a_name'.
      do
        machines := a_name
      ensure
        machines_set: machines = a_name		
      end

    set_name (a_name: like name)
        -- Set 'name' with 'a_name'.
      do
        name := a_name
      ensure
        name_set: name = a_name		
      end

    set_parent_tag_id (a_name: like parent_tag_id)
        -- Set 'parent_tag_id' with 'a_name'.
      do
        parent_tag_id := a_name
      ensure
        parent_tag_id_set: parent_tag_id = a_name		
      end

    set_sensors (a_name: like sensors)
        -- Set 'sensors' with 'a_name'.
      do
        sensors := a_name
      ensure
        sensors_set: sensors = a_name		
      end

    set_vehicles (a_name: like vehicles)
        -- Set 'vehicles' with 'a_name'.
      do
        vehicles := a_name
      ensure
        vehicles_set: vehicles = a_name		
      end


 feature -- Status Report

    out: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass TAG%N")
        if attached addresses as l_addresses then
          across l_addresses as ic loop
            Result.append ("%N addresses:")
            Result.append (ic.item.out)
            Result.append ("%N")
          end
        end 
        if attached assets as l_assets then
          across l_assets as ic loop
            Result.append ("%N assets:")
            Result.append (ic.item.out)
            Result.append ("%N")
          end
        end 
        if attached drivers as l_drivers then
          across l_drivers as ic loop
            Result.append ("%N drivers:")
            Result.append (ic.item.out)
            Result.append ("%N")
          end
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
        if attached machines as l_machines then
          across l_machines as ic loop
            Result.append ("%N machines:")
            Result.append (ic.item.out)
            Result.append ("%N")
          end
        end 
        if attached name as l_name then
          Result.append ("%Nname:")
          Result.append (l_name.out)
          Result.append ("%N")    
        end  
        if attached parent_tag_id as l_parent_tag_id then
          Result.append ("%Nparent_tag_id:")
          Result.append (l_parent_tag_id.out)
          Result.append ("%N")    
        end  
        if attached sensors as l_sensors then
          across l_sensors as ic loop
            Result.append ("%N sensors:")
            Result.append (ic.item.out)
            Result.append ("%N")
          end
        end 
        if attached vehicles as l_vehicles then
          across l_vehicles as ic loop
            Result.append ("%N vehicles:")
            Result.append (ic.item.out)
            Result.append ("%N")
          end
        end 
      end
end



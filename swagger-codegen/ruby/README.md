# swagger_client

SwaggerClient - the Ruby gem for the Samsara API

# Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).

This SDK is automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen) project:

- API version: 1.0.0
- Package version: 1.0.0
- Build package: io.swagger.codegen.languages.RubyClientCodegen

## Installation

### Build a gem

To build the Ruby code into a gem:

```shell
gem build swagger_client.gemspec
```

Then either install the gem locally:

```shell
gem install ./swagger_client-1.0.0.gem
```
(for development, run `gem install --dev ./swagger_client-1.0.0.gem` to install the development dependencies)

or publish the gem to a gem hosting service, e.g. [RubyGems](https://rubygems.org/).

Finally add this to the Gemfile:

    gem 'swagger_client', '~> 1.0.0'

### Install from Git

If the Ruby gem is hosted at a git repository: https://github.com/GIT_USER_ID/GIT_REPO_ID, then add the following in the Gemfile:

    gem 'swagger_client', :git => 'https://github.com/GIT_USER_ID/GIT_REPO_ID.git'

### Include the Ruby code directly

Include the Ruby code directly using `-I` as follows:

```shell
ruby -Ilib script.rb
```

## Getting Started

Please follow the [installation](#installation) procedure and then run the following code:
```ruby
# Load the gem
require 'swagger_client'

api_instance = SwaggerClient::AssetsApi.new

access_token = 'access_token_example' # String | Samsara API access token.

opts = { 
  group_id: 789 # Integer | Optional group ID if the organization has multiple groups (uncommon).
}

begin
  #/fleet/assets/locations
  result = api_instance.get_all_asset_current_locations(access_token, , opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AssetsApi->get_all_asset_current_locations: #{e}"
end

```

## Documentation for API Endpoints

All URIs are relative to *https://api.samsara.com/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*SwaggerClient::AssetsApi* | [**get_all_asset_current_locations**](docs/AssetsApi.md#get_all_asset_current_locations) | **GET** /fleet/assets/locations | /fleet/assets/locations
*SwaggerClient::AssetsApi* | [**get_all_assets**](docs/AssetsApi.md#get_all_assets) | **GET** /fleet/assets | /fleet/assets
*SwaggerClient::AssetsApi* | [**get_asset_location**](docs/AssetsApi.md#get_asset_location) | **GET** /fleet/assets/{asset_id}/locations | /fleet/assets/{assetId:[0-9]+}/locations
*SwaggerClient::AssetsApi* | [**get_asset_reefer**](docs/AssetsApi.md#get_asset_reefer) | **GET** /fleet/assets/{asset_id}/reefer | /fleet/assets/{assetId:[0-9]+}/reefer
*SwaggerClient::DriversApi* | [**create_driver**](docs/DriversApi.md#create_driver) | **POST** /fleet/drivers/create | /fleet/drivers/create
*SwaggerClient::DriversApi* | [**deactivate_driver**](docs/DriversApi.md#deactivate_driver) | **DELETE** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*SwaggerClient::DriversApi* | [**get_all_deactivated_drivers**](docs/DriversApi.md#get_all_deactivated_drivers) | **GET** /fleet/drivers/inactive | /fleet/drivers/inactive
*SwaggerClient::DriversApi* | [**get_deactivated_driver_by_id**](docs/DriversApi.md#get_deactivated_driver_by_id) | **GET** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*SwaggerClient::DriversApi* | [**get_driver_by_id**](docs/DriversApi.md#get_driver_by_id) | **GET** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*SwaggerClient::DriversApi* | [**reactivate_driver_by_id**](docs/DriversApi.md#reactivate_driver_by_id) | **PUT** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*SwaggerClient::FleetApi* | [**add_fleet_address**](docs/FleetApi.md#add_fleet_address) | **POST** /fleet/add_address | /fleet/add_address
*SwaggerClient::FleetApi* | [**add_organization_addresses**](docs/FleetApi.md#add_organization_addresses) | **POST** /addresses | /addresses
*SwaggerClient::FleetApi* | [**create_dispatch_route**](docs/FleetApi.md#create_dispatch_route) | **POST** /fleet/dispatch/routes | /fleet/dispatch/routes
*SwaggerClient::FleetApi* | [**create_driver**](docs/FleetApi.md#create_driver) | **POST** /fleet/drivers/create | /fleet/drivers/create
*SwaggerClient::FleetApi* | [**create_driver_dispatch_route**](docs/FleetApi.md#create_driver_dispatch_route) | **POST** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
*SwaggerClient::FleetApi* | [**create_driver_document**](docs/FleetApi.md#create_driver_document) | **POST** /fleet/drivers/{driver_id}/documents | /fleet/drivers/{driver_id:[0-9]+}/documents
*SwaggerClient::FleetApi* | [**create_dvir**](docs/FleetApi.md#create_dvir) | **POST** /fleet/maintenance/dvirs | /fleet/maintenance/dvirs
*SwaggerClient::FleetApi* | [**create_vehicle_dispatch_route**](docs/FleetApi.md#create_vehicle_dispatch_route) | **POST** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
*SwaggerClient::FleetApi* | [**deactivate_driver**](docs/FleetApi.md#deactivate_driver) | **DELETE** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*SwaggerClient::FleetApi* | [**delete_dispatch_route_by_id**](docs/FleetApi.md#delete_dispatch_route_by_id) | **DELETE** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
*SwaggerClient::FleetApi* | [**delete_organization_address**](docs/FleetApi.md#delete_organization_address) | **DELETE** /addresses/{addressId} | /addresses/{addressId}
*SwaggerClient::FleetApi* | [**fetch_all_dispatch_routes**](docs/FleetApi.md#fetch_all_dispatch_routes) | **GET** /fleet/dispatch/routes | /fleet/dispatch/routes
*SwaggerClient::FleetApi* | [**fetch_all_route_job_updates**](docs/FleetApi.md#fetch_all_route_job_updates) | **GET** /fleet/dispatch/routes/job_updates | /fleet/dispatch/routes/job_updates
*SwaggerClient::FleetApi* | [**get_all_asset_current_locations**](docs/FleetApi.md#get_all_asset_current_locations) | **GET** /fleet/assets/locations | /fleet/assets/locations
*SwaggerClient::FleetApi* | [**get_all_assets**](docs/FleetApi.md#get_all_assets) | **GET** /fleet/assets | /fleet/assets
*SwaggerClient::FleetApi* | [**get_all_deactivated_drivers**](docs/FleetApi.md#get_all_deactivated_drivers) | **GET** /fleet/drivers/inactive | /fleet/drivers/inactive
*SwaggerClient::FleetApi* | [**get_asset_location**](docs/FleetApi.md#get_asset_location) | **GET** /fleet/assets/{asset_id}/locations | /fleet/assets/{assetId:[0-9]+}/locations
*SwaggerClient::FleetApi* | [**get_asset_reefer**](docs/FleetApi.md#get_asset_reefer) | **GET** /fleet/assets/{asset_id}/reefer | /fleet/assets/{assetId:[0-9]+}/reefer
*SwaggerClient::FleetApi* | [**get_deactivated_driver_by_id**](docs/FleetApi.md#get_deactivated_driver_by_id) | **GET** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*SwaggerClient::FleetApi* | [**get_dispatch_route_by_id**](docs/FleetApi.md#get_dispatch_route_by_id) | **GET** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}
*SwaggerClient::FleetApi* | [**get_dispatch_route_history**](docs/FleetApi.md#get_dispatch_route_history) | **GET** /fleet/dispatch/routes/{route_id}/history | /fleet/dispatch/routes/{route_id:[0-9]+}/history
*SwaggerClient::FleetApi* | [**get_dispatch_routes_by_driver_id**](docs/FleetApi.md#get_dispatch_routes_by_driver_id) | **GET** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
*SwaggerClient::FleetApi* | [**get_dispatch_routes_by_vehicle_id**](docs/FleetApi.md#get_dispatch_routes_by_vehicle_id) | **GET** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
*SwaggerClient::FleetApi* | [**get_driver_by_id**](docs/FleetApi.md#get_driver_by_id) | **GET** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*SwaggerClient::FleetApi* | [**get_driver_document_types_by_org_id**](docs/FleetApi.md#get_driver_document_types_by_org_id) | **GET** /fleet/drivers/document_types | /fleet/drivers/document_types
*SwaggerClient::FleetApi* | [**get_driver_documents_by_org_id**](docs/FleetApi.md#get_driver_documents_by_org_id) | **GET** /fleet/drivers/documents | /fleet/drivers/documents
*SwaggerClient::FleetApi* | [**get_driver_safety_score**](docs/FleetApi.md#get_driver_safety_score) | **GET** /fleet/drivers/{driverId}/safety/score | /fleet/drivers/{driverId:[0-9]+}/safety/score
*SwaggerClient::FleetApi* | [**get_dvirs**](docs/FleetApi.md#get_dvirs) | **GET** /fleet/maintenance/dvirs | /fleet/maintenance/dvirs
*SwaggerClient::FleetApi* | [**get_fleet_drivers**](docs/FleetApi.md#get_fleet_drivers) | **POST** /fleet/drivers | /fleet/drivers
*SwaggerClient::FleetApi* | [**get_fleet_drivers_hos_daily_logs**](docs/FleetApi.md#get_fleet_drivers_hos_daily_logs) | **POST** /fleet/drivers/{driver_id}/hos_daily_logs | /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
*SwaggerClient::FleetApi* | [**get_fleet_drivers_summary**](docs/FleetApi.md#get_fleet_drivers_summary) | **POST** /fleet/drivers/summary | /fleet/drivers/summary
*SwaggerClient::FleetApi* | [**get_fleet_hos_authentication_logs**](docs/FleetApi.md#get_fleet_hos_authentication_logs) | **POST** /fleet/hos_authentication_logs | /fleet/hos_authentication_logs
*SwaggerClient::FleetApi* | [**get_fleet_hos_logs**](docs/FleetApi.md#get_fleet_hos_logs) | **POST** /fleet/hos_logs | /fleet/hos_logs
*SwaggerClient::FleetApi* | [**get_fleet_hos_logs_summary**](docs/FleetApi.md#get_fleet_hos_logs_summary) | **POST** /fleet/hos_logs_summary | /fleet/hos_logs_summary
*SwaggerClient::FleetApi* | [**get_fleet_locations**](docs/FleetApi.md#get_fleet_locations) | **POST** /fleet/locations | /fleet/locations
*SwaggerClient::FleetApi* | [**get_fleet_maintenance_list**](docs/FleetApi.md#get_fleet_maintenance_list) | **POST** /fleet/maintenance/list | /fleet/maintenance/list
*SwaggerClient::FleetApi* | [**get_fleet_trips**](docs/FleetApi.md#get_fleet_trips) | **POST** /fleet/trips | /fleet/trips
*SwaggerClient::FleetApi* | [**get_fleet_vehicle**](docs/FleetApi.md#get_fleet_vehicle) | **GET** /fleet/vehicles/{vehicle_id_or_external_id} | /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*SwaggerClient::FleetApi* | [**get_organization_address**](docs/FleetApi.md#get_organization_address) | **GET** /addresses/{addressId} | /addresses/{addressId}
*SwaggerClient::FleetApi* | [**get_organization_addresses**](docs/FleetApi.md#get_organization_addresses) | **GET** /addresses | /addresses
*SwaggerClient::FleetApi* | [**get_organization_contact**](docs/FleetApi.md#get_organization_contact) | **GET** /contacts/{contact_id} | /contacts/{contact_id}
*SwaggerClient::FleetApi* | [**get_vehicle_harsh_event**](docs/FleetApi.md#get_vehicle_harsh_event) | **GET** /fleet/vehicles/{vehicleId}/safety/harsh_event | /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
*SwaggerClient::FleetApi* | [**get_vehicle_locations**](docs/FleetApi.md#get_vehicle_locations) | **GET** /fleet/vehicles/{vehicle_id}/locations | /fleet/vehicles/{vehicle_id:[0-9]+}/locations
*SwaggerClient::FleetApi* | [**get_vehicle_safety_score**](docs/FleetApi.md#get_vehicle_safety_score) | **GET** /fleet/vehicles/{vehicleId}/safety/score | /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
*SwaggerClient::FleetApi* | [**get_vehicle_stats**](docs/FleetApi.md#get_vehicle_stats) | **GET** /fleet/vehicles/stats | /fleet/vehicles/stats
*SwaggerClient::FleetApi* | [**get_vehicles_locations**](docs/FleetApi.md#get_vehicles_locations) | **GET** /fleet/vehicles/locations | /fleet/vehicles/locations
*SwaggerClient::FleetApi* | [**list_contacts**](docs/FleetApi.md#list_contacts) | **GET** /contacts | /contacts
*SwaggerClient::FleetApi* | [**list_fleet**](docs/FleetApi.md#list_fleet) | **POST** /fleet/list | /fleet/list
*SwaggerClient::FleetApi* | [**patch_fleet_vehicle**](docs/FleetApi.md#patch_fleet_vehicle) | **PATCH** /fleet/vehicles/{vehicle_id_or_external_id} | /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*SwaggerClient::FleetApi* | [**reactivate_driver_by_id**](docs/FleetApi.md#reactivate_driver_by_id) | **PUT** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*SwaggerClient::FleetApi* | [**update_dispatch_route_by_id**](docs/FleetApi.md#update_dispatch_route_by_id) | **PUT** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
*SwaggerClient::FleetApi* | [**update_organization_address**](docs/FleetApi.md#update_organization_address) | **PATCH** /addresses/{addressId} | /addresses/{addressId}
*SwaggerClient::FleetApi* | [**update_vehicles**](docs/FleetApi.md#update_vehicles) | **POST** /fleet/set_data | /fleet/set_data
*SwaggerClient::IndustrialApi* | [**get_all_data_inputs**](docs/IndustrialApi.md#get_all_data_inputs) | **GET** /industrial/data | /industrial/data
*SwaggerClient::IndustrialApi* | [**get_data_input**](docs/IndustrialApi.md#get_data_input) | **GET** /industrial/data/{data_input_id} | /industrial/data/{data_input_id:[0-9]+}
*SwaggerClient::IndustrialApi* | [**get_machines**](docs/IndustrialApi.md#get_machines) | **POST** /machines/list | /machines/list
*SwaggerClient::IndustrialApi* | [**get_machines_history**](docs/IndustrialApi.md#get_machines_history) | **POST** /machines/history | /machines/history
*SwaggerClient::RoutesApi* | [**create_dispatch_route**](docs/RoutesApi.md#create_dispatch_route) | **POST** /fleet/dispatch/routes | /fleet/dispatch/routes
*SwaggerClient::RoutesApi* | [**create_driver_dispatch_route**](docs/RoutesApi.md#create_driver_dispatch_route) | **POST** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
*SwaggerClient::RoutesApi* | [**create_vehicle_dispatch_route**](docs/RoutesApi.md#create_vehicle_dispatch_route) | **POST** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
*SwaggerClient::RoutesApi* | [**delete_dispatch_route_by_id**](docs/RoutesApi.md#delete_dispatch_route_by_id) | **DELETE** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
*SwaggerClient::RoutesApi* | [**fetch_all_dispatch_routes**](docs/RoutesApi.md#fetch_all_dispatch_routes) | **GET** /fleet/dispatch/routes | /fleet/dispatch/routes
*SwaggerClient::RoutesApi* | [**fetch_all_route_job_updates**](docs/RoutesApi.md#fetch_all_route_job_updates) | **GET** /fleet/dispatch/routes/job_updates | /fleet/dispatch/routes/job_updates
*SwaggerClient::RoutesApi* | [**get_dispatch_route_by_id**](docs/RoutesApi.md#get_dispatch_route_by_id) | **GET** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}
*SwaggerClient::RoutesApi* | [**get_dispatch_route_history**](docs/RoutesApi.md#get_dispatch_route_history) | **GET** /fleet/dispatch/routes/{route_id}/history | /fleet/dispatch/routes/{route_id:[0-9]+}/history
*SwaggerClient::RoutesApi* | [**get_dispatch_routes_by_driver_id**](docs/RoutesApi.md#get_dispatch_routes_by_driver_id) | **GET** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
*SwaggerClient::RoutesApi* | [**get_dispatch_routes_by_vehicle_id**](docs/RoutesApi.md#get_dispatch_routes_by_vehicle_id) | **GET** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
*SwaggerClient::RoutesApi* | [**update_dispatch_route_by_id**](docs/RoutesApi.md#update_dispatch_route_by_id) | **PUT** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
*SwaggerClient::SafetyApi* | [**get_driver_safety_score**](docs/SafetyApi.md#get_driver_safety_score) | **GET** /fleet/drivers/{driverId}/safety/score | /fleet/drivers/{driverId:[0-9]+}/safety/score
*SwaggerClient::SafetyApi* | [**get_vehicle_harsh_event**](docs/SafetyApi.md#get_vehicle_harsh_event) | **GET** /fleet/vehicles/{vehicleId}/safety/harsh_event | /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
*SwaggerClient::SafetyApi* | [**get_vehicle_safety_score**](docs/SafetyApi.md#get_vehicle_safety_score) | **GET** /fleet/vehicles/{vehicleId}/safety/score | /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
*SwaggerClient::SensorsApi* | [**get_sensors**](docs/SensorsApi.md#get_sensors) | **POST** /sensors/list | /sensors/list
*SwaggerClient::SensorsApi* | [**get_sensors_cargo**](docs/SensorsApi.md#get_sensors_cargo) | **POST** /sensors/cargo | /sensors/cargo
*SwaggerClient::SensorsApi* | [**get_sensors_door**](docs/SensorsApi.md#get_sensors_door) | **POST** /sensors/door | /sensors/door
*SwaggerClient::SensorsApi* | [**get_sensors_history**](docs/SensorsApi.md#get_sensors_history) | **POST** /sensors/history | /sensors/history
*SwaggerClient::SensorsApi* | [**get_sensors_humidity**](docs/SensorsApi.md#get_sensors_humidity) | **POST** /sensors/humidity | /sensors/humidity
*SwaggerClient::SensorsApi* | [**get_sensors_temperature**](docs/SensorsApi.md#get_sensors_temperature) | **POST** /sensors/temperature | /sensors/temperature
*SwaggerClient::TagsApi* | [**create_tag**](docs/TagsApi.md#create_tag) | **POST** /tags | /tags
*SwaggerClient::TagsApi* | [**delete_tag_by_id**](docs/TagsApi.md#delete_tag_by_id) | **DELETE** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
*SwaggerClient::TagsApi* | [**get_all_tags**](docs/TagsApi.md#get_all_tags) | **GET** /tags | /tags
*SwaggerClient::TagsApi* | [**get_tag_by_id**](docs/TagsApi.md#get_tag_by_id) | **GET** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
*SwaggerClient::TagsApi* | [**modify_tag_by_id**](docs/TagsApi.md#modify_tag_by_id) | **PATCH** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
*SwaggerClient::TagsApi* | [**update_tag_by_id**](docs/TagsApi.md#update_tag_by_id) | **PUT** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
*SwaggerClient::UsersApi* | [**delete_user_by_id**](docs/UsersApi.md#delete_user_by_id) | **DELETE** /users/{userId} | /users/{userId:[0-9]+}
*SwaggerClient::UsersApi* | [**get_user_by_id**](docs/UsersApi.md#get_user_by_id) | **GET** /users/{userId} | /users/{userId:[0-9]+}
*SwaggerClient::UsersApi* | [**list_user_roles**](docs/UsersApi.md#list_user_roles) | **GET** /user_roles | /user_roles
*SwaggerClient::UsersApi* | [**list_users**](docs/UsersApi.md#list_users) | **GET** /users | /users


## Documentation for Models

 - [SwaggerClient::Address](docs/Address.md)
 - [SwaggerClient::AddressGeofence](docs/AddressGeofence.md)
 - [SwaggerClient::AddressGeofenceCircle](docs/AddressGeofenceCircle.md)
 - [SwaggerClient::AddressGeofencePolygon](docs/AddressGeofencePolygon.md)
 - [SwaggerClient::AddressGeofencePolygonVertices](docs/AddressGeofencePolygonVertices.md)
 - [SwaggerClient::AddressNotes](docs/AddressNotes.md)
 - [SwaggerClient::AddressParam](docs/AddressParam.md)
 - [SwaggerClient::Addresses](docs/Addresses.md)
 - [SwaggerClient::AddressesAddresses](docs/AddressesAddresses.md)
 - [SwaggerClient::AllRouteJobUpdates](docs/AllRouteJobUpdates.md)
 - [SwaggerClient::Asset](docs/Asset.md)
 - [SwaggerClient::AssetCable](docs/AssetCable.md)
 - [SwaggerClient::AssetCurrentLocation](docs/AssetCurrentLocation.md)
 - [SwaggerClient::AssetCurrentLocationsResponse](docs/AssetCurrentLocationsResponse.md)
 - [SwaggerClient::AssetLocationResponse](docs/AssetLocationResponse.md)
 - [SwaggerClient::AssetLocationResponseInner](docs/AssetLocationResponseInner.md)
 - [SwaggerClient::AssetReeferResponse](docs/AssetReeferResponse.md)
 - [SwaggerClient::AssetReeferResponseReeferStats](docs/AssetReeferResponseReeferStats.md)
 - [SwaggerClient::AssetReeferResponseReeferStatsAlarms](docs/AssetReeferResponseReeferStatsAlarms.md)
 - [SwaggerClient::AssetReeferResponseReeferStatsAlarms1](docs/AssetReeferResponseReeferStatsAlarms1.md)
 - [SwaggerClient::AssetReeferResponseReeferStatsEngineHours](docs/AssetReeferResponseReeferStatsEngineHours.md)
 - [SwaggerClient::AssetReeferResponseReeferStatsFuelPercentage](docs/AssetReeferResponseReeferStatsFuelPercentage.md)
 - [SwaggerClient::AssetReeferResponseReeferStatsPowerStatus](docs/AssetReeferResponseReeferStatsPowerStatus.md)
 - [SwaggerClient::AssetReeferResponseReeferStatsReturnAirTemp](docs/AssetReeferResponseReeferStatsReturnAirTemp.md)
 - [SwaggerClient::AssetReeferResponseReeferStatsSetPoint](docs/AssetReeferResponseReeferStatsSetPoint.md)
 - [SwaggerClient::AuxInput](docs/AuxInput.md)
 - [SwaggerClient::AuxInputSeries](docs/AuxInputSeries.md)
 - [SwaggerClient::CargoResponse](docs/CargoResponse.md)
 - [SwaggerClient::CargoResponseSensors](docs/CargoResponseSensors.md)
 - [SwaggerClient::Contact](docs/Contact.md)
 - [SwaggerClient::ContactIds](docs/ContactIds.md)
 - [SwaggerClient::CreateDvirParam](docs/CreateDvirParam.md)
 - [SwaggerClient::CurrentDriver](docs/CurrentDriver.md)
 - [SwaggerClient::Data](docs/Data.md)
 - [SwaggerClient::DataInputHistoryResponse](docs/DataInputHistoryResponse.md)
 - [SwaggerClient::DataInputHistoryResponsePoints](docs/DataInputHistoryResponsePoints.md)
 - [SwaggerClient::DispatchJobCreate](docs/DispatchJobCreate.md)
 - [SwaggerClient::DispatchRouteBase](docs/DispatchRouteBase.md)
 - [SwaggerClient::DispatchRouteHistoricalEntry](docs/DispatchRouteHistoricalEntry.md)
 - [SwaggerClient::DispatchRouteHistory](docs/DispatchRouteHistory.md)
 - [SwaggerClient::DispatchRoutes](docs/DispatchRoutes.md)
 - [SwaggerClient::DocumentBase](docs/DocumentBase.md)
 - [SwaggerClient::DocumentFieldCreate](docs/DocumentFieldCreate.md)
 - [SwaggerClient::DocumentFieldCreatePhotoValue](docs/DocumentFieldCreatePhotoValue.md)
 - [SwaggerClient::DocumentFieldType](docs/DocumentFieldType.md)
 - [SwaggerClient::DocumentFieldTypeNumberValueTypeMetadata](docs/DocumentFieldTypeNumberValueTypeMetadata.md)
 - [SwaggerClient::DocumentFieldTypes](docs/DocumentFieldTypes.md)
 - [SwaggerClient::DocumentType](docs/DocumentType.md)
 - [SwaggerClient::DocumentTypes](docs/DocumentTypes.md)
 - [SwaggerClient::Documents](docs/Documents.md)
 - [SwaggerClient::DoorResponse](docs/DoorResponse.md)
 - [SwaggerClient::DoorResponseSensors](docs/DoorResponseSensors.md)
 - [SwaggerClient::DriverBase](docs/DriverBase.md)
 - [SwaggerClient::DriverDailyLogResponse](docs/DriverDailyLogResponse.md)
 - [SwaggerClient::DriverDailyLogResponseDays](docs/DriverDailyLogResponseDays.md)
 - [SwaggerClient::DriverSafetyScoreResponse](docs/DriverSafetyScoreResponse.md)
 - [SwaggerClient::DriversResponse](docs/DriversResponse.md)
 - [SwaggerClient::DriversSummaryParam](docs/DriversSummaryParam.md)
 - [SwaggerClient::DriversSummaryResponse](docs/DriversSummaryResponse.md)
 - [SwaggerClient::DriversSummaryResponseSummaries](docs/DriversSummaryResponseSummaries.md)
 - [SwaggerClient::DvirBase](docs/DvirBase.md)
 - [SwaggerClient::DvirBaseAuthorSignature](docs/DvirBaseAuthorSignature.md)
 - [SwaggerClient::DvirBaseMechanicOrAgentSignature](docs/DvirBaseMechanicOrAgentSignature.md)
 - [SwaggerClient::DvirBaseNextDriverSignature](docs/DvirBaseNextDriverSignature.md)
 - [SwaggerClient::DvirBaseTrailerDefects](docs/DvirBaseTrailerDefects.md)
 - [SwaggerClient::DvirBaseVehicle](docs/DvirBaseVehicle.md)
 - [SwaggerClient::DvirListResponse](docs/DvirListResponse.md)
 - [SwaggerClient::EngineState](docs/EngineState.md)
 - [SwaggerClient::ErrorResponse](docs/ErrorResponse.md)
 - [SwaggerClient::FleetVehicleLocation](docs/FleetVehicleLocation.md)
 - [SwaggerClient::FleetVehicleLocations](docs/FleetVehicleLocations.md)
 - [SwaggerClient::FleetVehicleResponse](docs/FleetVehicleResponse.md)
 - [SwaggerClient::FleetVehicleResponseVehicleInfo](docs/FleetVehicleResponseVehicleInfo.md)
 - [SwaggerClient::FleetVehiclesLocations](docs/FleetVehiclesLocations.md)
 - [SwaggerClient::FleetVehiclesLocationsInner](docs/FleetVehiclesLocationsInner.md)
 - [SwaggerClient::GroupDriversParam](docs/GroupDriversParam.md)
 - [SwaggerClient::GroupParam](docs/GroupParam.md)
 - [SwaggerClient::HistoryParam](docs/HistoryParam.md)
 - [SwaggerClient::HistoryParam1](docs/HistoryParam1.md)
 - [SwaggerClient::HosAuthenticationLogsParam](docs/HosAuthenticationLogsParam.md)
 - [SwaggerClient::HosAuthenticationLogsResponse](docs/HosAuthenticationLogsResponse.md)
 - [SwaggerClient::HosAuthenticationLogsResponseAuthenticationLogs](docs/HosAuthenticationLogsResponseAuthenticationLogs.md)
 - [SwaggerClient::HosLogsParam](docs/HosLogsParam.md)
 - [SwaggerClient::HosLogsParam1](docs/HosLogsParam1.md)
 - [SwaggerClient::HosLogsParam2](docs/HosLogsParam2.md)
 - [SwaggerClient::HosLogsResponse](docs/HosLogsResponse.md)
 - [SwaggerClient::HosLogsResponseLogs](docs/HosLogsResponseLogs.md)
 - [SwaggerClient::HosLogsSummaryResponse](docs/HosLogsSummaryResponse.md)
 - [SwaggerClient::HosLogsSummaryResponseDrivers](docs/HosLogsSummaryResponseDrivers.md)
 - [SwaggerClient::HumidityResponse](docs/HumidityResponse.md)
 - [SwaggerClient::HumidityResponseSensors](docs/HumidityResponseSensors.md)
 - [SwaggerClient::InlineResponse200](docs/InlineResponse200.md)
 - [SwaggerClient::InlineResponse2001](docs/InlineResponse2001.md)
 - [SwaggerClient::InlineResponse2002](docs/InlineResponse2002.md)
 - [SwaggerClient::InlineResponse2003](docs/InlineResponse2003.md)
 - [SwaggerClient::InlineResponse2004](docs/InlineResponse2004.md)
 - [SwaggerClient::InlineResponse2005](docs/InlineResponse2005.md)
 - [SwaggerClient::InlineResponse2005VehicleStats](docs/InlineResponse2005VehicleStats.md)
 - [SwaggerClient::InlineResponse2006](docs/InlineResponse2006.md)
 - [SwaggerClient::InlineResponse2007](docs/InlineResponse2007.md)
 - [SwaggerClient::InlineResponse2008](docs/InlineResponse2008.md)
 - [SwaggerClient::InlineResponse2009](docs/InlineResponse2009.md)
 - [SwaggerClient::JobStatus](docs/JobStatus.md)
 - [SwaggerClient::JobUpdateObject](docs/JobUpdateObject.md)
 - [SwaggerClient::Machine](docs/Machine.md)
 - [SwaggerClient::MachineHistoryResponse](docs/MachineHistoryResponse.md)
 - [SwaggerClient::MachineHistoryResponseMachines](docs/MachineHistoryResponseMachines.md)
 - [SwaggerClient::MachineHistoryResponseVibrations](docs/MachineHistoryResponseVibrations.md)
 - [SwaggerClient::Pagination](docs/Pagination.md)
 - [SwaggerClient::PrevJobStatus](docs/PrevJobStatus.md)
 - [SwaggerClient::ReactivateDriverParam](docs/ReactivateDriverParam.md)
 - [SwaggerClient::SafetyReportHarshEvent](docs/SafetyReportHarshEvent.md)
 - [SwaggerClient::Sensor](docs/Sensor.md)
 - [SwaggerClient::SensorHistoryResponse](docs/SensorHistoryResponse.md)
 - [SwaggerClient::SensorHistoryResponseResults](docs/SensorHistoryResponseResults.md)
 - [SwaggerClient::SensorParam](docs/SensorParam.md)
 - [SwaggerClient::SensorshistorySeries](docs/SensorshistorySeries.md)
 - [SwaggerClient::Tag](docs/Tag.md)
 - [SwaggerClient::TagCreate](docs/TagCreate.md)
 - [SwaggerClient::TagIds](docs/TagIds.md)
 - [SwaggerClient::TagMetadata](docs/TagMetadata.md)
 - [SwaggerClient::TagModify](docs/TagModify.md)
 - [SwaggerClient::TagModifyAdd](docs/TagModifyAdd.md)
 - [SwaggerClient::TagModifyDelete](docs/TagModifyDelete.md)
 - [SwaggerClient::TagUpdate](docs/TagUpdate.md)
 - [SwaggerClient::TaggedAddressBase](docs/TaggedAddressBase.md)
 - [SwaggerClient::TaggedAssetBase](docs/TaggedAssetBase.md)
 - [SwaggerClient::TaggedDriverBase](docs/TaggedDriverBase.md)
 - [SwaggerClient::TaggedMachineBase](docs/TaggedMachineBase.md)
 - [SwaggerClient::TaggedSensorBase](docs/TaggedSensorBase.md)
 - [SwaggerClient::TaggedVehicleBase](docs/TaggedVehicleBase.md)
 - [SwaggerClient::TemperatureResponse](docs/TemperatureResponse.md)
 - [SwaggerClient::TemperatureResponseSensors](docs/TemperatureResponseSensors.md)
 - [SwaggerClient::TripResponse](docs/TripResponse.md)
 - [SwaggerClient::TripResponseEndCoordinates](docs/TripResponseEndCoordinates.md)
 - [SwaggerClient::TripResponseStartCoordinates](docs/TripResponseStartCoordinates.md)
 - [SwaggerClient::TripResponseTrips](docs/TripResponseTrips.md)
 - [SwaggerClient::TripsParam](docs/TripsParam.md)
 - [SwaggerClient::UserBase](docs/UserBase.md)
 - [SwaggerClient::UserRole](docs/UserRole.md)
 - [SwaggerClient::UserTagRole](docs/UserTagRole.md)
 - [SwaggerClient::UserTagRoleTag](docs/UserTagRoleTag.md)
 - [SwaggerClient::Vehicle](docs/Vehicle.md)
 - [SwaggerClient::VehicleHarshEventResponse](docs/VehicleHarshEventResponse.md)
 - [SwaggerClient::VehicleHarshEventResponseLocation](docs/VehicleHarshEventResponseLocation.md)
 - [SwaggerClient::VehicleLocation](docs/VehicleLocation.md)
 - [SwaggerClient::VehicleMaintenance](docs/VehicleMaintenance.md)
 - [SwaggerClient::VehicleMaintenanceJ1939](docs/VehicleMaintenanceJ1939.md)
 - [SwaggerClient::VehicleMaintenanceJ1939CheckEngineLight](docs/VehicleMaintenanceJ1939CheckEngineLight.md)
 - [SwaggerClient::VehicleMaintenanceJ1939DiagnosticTroubleCodes](docs/VehicleMaintenanceJ1939DiagnosticTroubleCodes.md)
 - [SwaggerClient::VehicleMaintenancePassenger](docs/VehicleMaintenancePassenger.md)
 - [SwaggerClient::VehicleMaintenancePassengerCheckEngineLight](docs/VehicleMaintenancePassengerCheckEngineLight.md)
 - [SwaggerClient::VehicleMaintenancePassengerDiagnosticTroubleCodes](docs/VehicleMaintenancePassengerDiagnosticTroubleCodes.md)
 - [SwaggerClient::VehicleSafetyScoreResponse](docs/VehicleSafetyScoreResponse.md)
 - [SwaggerClient::VehicleUpdateParam](docs/VehicleUpdateParam.md)
 - [SwaggerClient::DispatchJob](docs/DispatchJob.md)
 - [SwaggerClient::DispatchRoute](docs/DispatchRoute.md)
 - [SwaggerClient::DispatchRouteCreate](docs/DispatchRouteCreate.md)
 - [SwaggerClient::Document](docs/Document.md)
 - [SwaggerClient::DocumentCreate](docs/DocumentCreate.md)
 - [SwaggerClient::DocumentField](docs/DocumentField.md)
 - [SwaggerClient::Driver](docs/Driver.md)
 - [SwaggerClient::DriverForCreate](docs/DriverForCreate.md)
 - [SwaggerClient::TaggedAddress](docs/TaggedAddress.md)
 - [SwaggerClient::TaggedAsset](docs/TaggedAsset.md)
 - [SwaggerClient::TaggedDriver](docs/TaggedDriver.md)
 - [SwaggerClient::TaggedMachine](docs/TaggedMachine.md)
 - [SwaggerClient::TaggedSensor](docs/TaggedSensor.md)
 - [SwaggerClient::TaggedVehicle](docs/TaggedVehicle.md)
 - [SwaggerClient::User](docs/User.md)


## Documentation for Authorization

 All endpoints do not require authorization.


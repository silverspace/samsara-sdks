# openapi_client

OpenapiClient - the Ruby gem for the Samsara API

# Introduction

Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.

The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.

API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.

If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)

# Endpoints

All our APIs can be accessed through HTTP requests to URLs like:

```curl
https://api.samsara.com/<version>/<endpoint>
```

All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.

# Authentication

To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.

Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.

Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.

```curl
https://api.samsara.com/<version>/<endpoint>?access_token={access_token}
```

All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.

# Request Methods

Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.

## GET

GET requests are typically used for fetching data (like data for a particular driver).

## POST

POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).

## PUT

PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).

## PATCH

PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).

## DELETE

DELETE requests are used for deleting a record (like deleting a tag from the system).

# Response Codes

All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.

## 2XX

These are successful responses and indicate that the API request returned the expected response.

## 4XX

These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.

## 5XX

These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.

# Error Responses

In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.

| Status Code | Message | Description |
|-------------|----------------|-------------------------------------------------------------------|
| 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). |
| 404 | Page not found | The API endpoint being accessed is invalid. |
| 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |

# Versioning

All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.

# FAQs

Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).

This SDK is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 1.0.0
- Package version: 1.0.0
- Build package: org.openapitools.codegen.languages.RubyClientCodegen

## Installation

### Build a gem

To build the Ruby code into a gem:

```shell
gem build openapi_client.gemspec
```

Then either install the gem locally:

```shell
gem install ./openapi_client-1.0.0.gem
```
(for development, run `gem install --dev ./openapi_client-1.0.0.gem` to install the development dependencies)

or publish the gem to a gem hosting service, e.g. [RubyGems](https://rubygems.org/).

Finally add this to the Gemfile:

    gem 'openapi_client', '~> 1.0.0'

### Install from Git

If the Ruby gem is hosted at a git repository: https://github.com/GIT_USER_ID/GIT_REPO_ID, then add the following in the Gemfile:

    gem 'openapi_client', :git => 'https://github.com/GIT_USER_ID/GIT_REPO_ID.git'

### Include the Ruby code directly

Include the Ruby code directly using `-I` as follows:

```shell
ruby -Ilib script.rb
```

## Getting Started

Please follow the [installation](#installation) procedure and then run the following code:
```ruby
# Load the gem
require 'openapi_client'

api_instance = OpenapiClient::AssetsApi.new
access_token = 'access_token_example' # String | Samsara API access token.
opts = {
  group_id: 56 # Integer | Optional group ID if the organization has multiple groups (uncommon).
}

begin
  #/fleet/assets/locations
  result = api_instance.get_all_asset_current_locations(access_token, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Exception when calling AssetsApi->get_all_asset_current_locations: #{e}"
end

```

## Documentation for API Endpoints

All URIs are relative to *https://api.samsara.com/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*OpenapiClient::AssetsApi* | [**get_all_asset_current_locations**](docs/AssetsApi.md#get_all_asset_current_locations) | **GET** /fleet/assets/locations | /fleet/assets/locations
*OpenapiClient::AssetsApi* | [**get_all_assets**](docs/AssetsApi.md#get_all_assets) | **GET** /fleet/assets | /fleet/assets
*OpenapiClient::AssetsApi* | [**get_asset_location**](docs/AssetsApi.md#get_asset_location) | **GET** /fleet/assets/{asset_id}/locations | /fleet/assets/{assetId:[0-9]+}/locations
*OpenapiClient::AssetsApi* | [**get_asset_reefer**](docs/AssetsApi.md#get_asset_reefer) | **GET** /fleet/assets/{asset_id}/reefer | /fleet/assets/{assetId:[0-9]+}/reefer
*OpenapiClient::DriversApi* | [**create_driver**](docs/DriversApi.md#create_driver) | **POST** /fleet/drivers/create | /fleet/drivers/create
*OpenapiClient::DriversApi* | [**deactivate_driver**](docs/DriversApi.md#deactivate_driver) | **DELETE** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*OpenapiClient::DriversApi* | [**get_all_deactivated_drivers**](docs/DriversApi.md#get_all_deactivated_drivers) | **GET** /fleet/drivers/inactive | /fleet/drivers/inactive
*OpenapiClient::DriversApi* | [**get_deactivated_driver_by_id**](docs/DriversApi.md#get_deactivated_driver_by_id) | **GET** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*OpenapiClient::DriversApi* | [**get_driver_by_id**](docs/DriversApi.md#get_driver_by_id) | **GET** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*OpenapiClient::DriversApi* | [**reactivate_driver_by_id**](docs/DriversApi.md#reactivate_driver_by_id) | **PUT** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*OpenapiClient::FleetApi* | [**add_fleet_address**](docs/FleetApi.md#add_fleet_address) | **POST** /fleet/add_address | /fleet/add_address
*OpenapiClient::FleetApi* | [**add_organization_addresses**](docs/FleetApi.md#add_organization_addresses) | **POST** /addresses | /addresses
*OpenapiClient::FleetApi* | [**create_dispatch_route**](docs/FleetApi.md#create_dispatch_route) | **POST** /fleet/dispatch/routes | /fleet/dispatch/routes
*OpenapiClient::FleetApi* | [**create_driver**](docs/FleetApi.md#create_driver) | **POST** /fleet/drivers/create | /fleet/drivers/create
*OpenapiClient::FleetApi* | [**create_driver_dispatch_route**](docs/FleetApi.md#create_driver_dispatch_route) | **POST** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
*OpenapiClient::FleetApi* | [**create_driver_document**](docs/FleetApi.md#create_driver_document) | **POST** /fleet/drivers/{driver_id}/documents | /fleet/drivers/{driver_id:[0-9]+}/documents
*OpenapiClient::FleetApi* | [**create_dvir**](docs/FleetApi.md#create_dvir) | **POST** /fleet/maintenance/dvirs | /fleet/maintenance/dvirs
*OpenapiClient::FleetApi* | [**create_vehicle_dispatch_route**](docs/FleetApi.md#create_vehicle_dispatch_route) | **POST** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
*OpenapiClient::FleetApi* | [**deactivate_driver**](docs/FleetApi.md#deactivate_driver) | **DELETE** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*OpenapiClient::FleetApi* | [**delete_dispatch_route_by_id**](docs/FleetApi.md#delete_dispatch_route_by_id) | **DELETE** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
*OpenapiClient::FleetApi* | [**delete_organization_address**](docs/FleetApi.md#delete_organization_address) | **DELETE** /addresses/{addressId} | /addresses/{addressId}
*OpenapiClient::FleetApi* | [**fetch_all_dispatch_routes**](docs/FleetApi.md#fetch_all_dispatch_routes) | **GET** /fleet/dispatch/routes | /fleet/dispatch/routes
*OpenapiClient::FleetApi* | [**fetch_all_route_job_updates**](docs/FleetApi.md#fetch_all_route_job_updates) | **GET** /fleet/dispatch/routes/job_updates | /fleet/dispatch/routes/job_updates
*OpenapiClient::FleetApi* | [**get_all_asset_current_locations**](docs/FleetApi.md#get_all_asset_current_locations) | **GET** /fleet/assets/locations | /fleet/assets/locations
*OpenapiClient::FleetApi* | [**get_all_assets**](docs/FleetApi.md#get_all_assets) | **GET** /fleet/assets | /fleet/assets
*OpenapiClient::FleetApi* | [**get_all_deactivated_drivers**](docs/FleetApi.md#get_all_deactivated_drivers) | **GET** /fleet/drivers/inactive | /fleet/drivers/inactive
*OpenapiClient::FleetApi* | [**get_asset_location**](docs/FleetApi.md#get_asset_location) | **GET** /fleet/assets/{asset_id}/locations | /fleet/assets/{assetId:[0-9]+}/locations
*OpenapiClient::FleetApi* | [**get_asset_reefer**](docs/FleetApi.md#get_asset_reefer) | **GET** /fleet/assets/{asset_id}/reefer | /fleet/assets/{assetId:[0-9]+}/reefer
*OpenapiClient::FleetApi* | [**get_deactivated_driver_by_id**](docs/FleetApi.md#get_deactivated_driver_by_id) | **GET** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*OpenapiClient::FleetApi* | [**get_dispatch_route_by_id**](docs/FleetApi.md#get_dispatch_route_by_id) | **GET** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}
*OpenapiClient::FleetApi* | [**get_dispatch_route_history**](docs/FleetApi.md#get_dispatch_route_history) | **GET** /fleet/dispatch/routes/{route_id}/history | /fleet/dispatch/routes/{route_id:[0-9]+}/history
*OpenapiClient::FleetApi* | [**get_dispatch_routes_by_driver_id**](docs/FleetApi.md#get_dispatch_routes_by_driver_id) | **GET** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
*OpenapiClient::FleetApi* | [**get_dispatch_routes_by_vehicle_id**](docs/FleetApi.md#get_dispatch_routes_by_vehicle_id) | **GET** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
*OpenapiClient::FleetApi* | [**get_driver_by_id**](docs/FleetApi.md#get_driver_by_id) | **GET** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*OpenapiClient::FleetApi* | [**get_driver_document_types_by_org_id**](docs/FleetApi.md#get_driver_document_types_by_org_id) | **GET** /fleet/drivers/document_types | /fleet/drivers/document_types
*OpenapiClient::FleetApi* | [**get_driver_documents_by_org_id**](docs/FleetApi.md#get_driver_documents_by_org_id) | **GET** /fleet/drivers/documents | /fleet/drivers/documents
*OpenapiClient::FleetApi* | [**get_driver_safety_score**](docs/FleetApi.md#get_driver_safety_score) | **GET** /fleet/drivers/{driverId}/safety/score | /fleet/drivers/{driverId:[0-9]+}/safety/score
*OpenapiClient::FleetApi* | [**get_dvirs**](docs/FleetApi.md#get_dvirs) | **GET** /fleet/maintenance/dvirs | /fleet/maintenance/dvirs
*OpenapiClient::FleetApi* | [**get_fleet_drivers**](docs/FleetApi.md#get_fleet_drivers) | **POST** /fleet/drivers | /fleet/drivers
*OpenapiClient::FleetApi* | [**get_fleet_drivers_hos_daily_logs**](docs/FleetApi.md#get_fleet_drivers_hos_daily_logs) | **POST** /fleet/drivers/{driver_id}/hos_daily_logs | /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
*OpenapiClient::FleetApi* | [**get_fleet_drivers_summary**](docs/FleetApi.md#get_fleet_drivers_summary) | **POST** /fleet/drivers/summary | /fleet/drivers/summary
*OpenapiClient::FleetApi* | [**get_fleet_hos_authentication_logs**](docs/FleetApi.md#get_fleet_hos_authentication_logs) | **POST** /fleet/hos_authentication_logs | /fleet/hos_authentication_logs
*OpenapiClient::FleetApi* | [**get_fleet_hos_logs**](docs/FleetApi.md#get_fleet_hos_logs) | **POST** /fleet/hos_logs | /fleet/hos_logs
*OpenapiClient::FleetApi* | [**get_fleet_hos_logs_summary**](docs/FleetApi.md#get_fleet_hos_logs_summary) | **POST** /fleet/hos_logs_summary | /fleet/hos_logs_summary
*OpenapiClient::FleetApi* | [**get_fleet_locations**](docs/FleetApi.md#get_fleet_locations) | **POST** /fleet/locations | /fleet/locations
*OpenapiClient::FleetApi* | [**get_fleet_maintenance_list**](docs/FleetApi.md#get_fleet_maintenance_list) | **POST** /fleet/maintenance/list | /fleet/maintenance/list
*OpenapiClient::FleetApi* | [**get_fleet_trips**](docs/FleetApi.md#get_fleet_trips) | **POST** /fleet/trips | /fleet/trips
*OpenapiClient::FleetApi* | [**get_fleet_vehicle**](docs/FleetApi.md#get_fleet_vehicle) | **GET** /fleet/vehicles/{vehicle_id_or_external_id} | /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*OpenapiClient::FleetApi* | [**get_organization_address**](docs/FleetApi.md#get_organization_address) | **GET** /addresses/{addressId} | /addresses/{addressId}
*OpenapiClient::FleetApi* | [**get_organization_addresses**](docs/FleetApi.md#get_organization_addresses) | **GET** /addresses | /addresses
*OpenapiClient::FleetApi* | [**get_organization_contact**](docs/FleetApi.md#get_organization_contact) | **GET** /contacts/{contact_id} | /contacts/{contact_id}
*OpenapiClient::FleetApi* | [**get_vehicle_harsh_event**](docs/FleetApi.md#get_vehicle_harsh_event) | **GET** /fleet/vehicles/{vehicleId}/safety/harsh_event | /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
*OpenapiClient::FleetApi* | [**get_vehicle_locations**](docs/FleetApi.md#get_vehicle_locations) | **GET** /fleet/vehicles/{vehicle_id}/locations | /fleet/vehicles/{vehicle_id:[0-9]+}/locations
*OpenapiClient::FleetApi* | [**get_vehicle_safety_score**](docs/FleetApi.md#get_vehicle_safety_score) | **GET** /fleet/vehicles/{vehicleId}/safety/score | /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
*OpenapiClient::FleetApi* | [**get_vehicle_stats**](docs/FleetApi.md#get_vehicle_stats) | **GET** /fleet/vehicles/stats | /fleet/vehicles/stats
*OpenapiClient::FleetApi* | [**get_vehicles_locations**](docs/FleetApi.md#get_vehicles_locations) | **GET** /fleet/vehicles/locations | /fleet/vehicles/locations
*OpenapiClient::FleetApi* | [**list_contacts**](docs/FleetApi.md#list_contacts) | **GET** /contacts | /contacts
*OpenapiClient::FleetApi* | [**list_fleet**](docs/FleetApi.md#list_fleet) | **POST** /fleet/list | /fleet/list
*OpenapiClient::FleetApi* | [**patch_fleet_vehicle**](docs/FleetApi.md#patch_fleet_vehicle) | **PATCH** /fleet/vehicles/{vehicle_id_or_external_id} | /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*OpenapiClient::FleetApi* | [**reactivate_driver_by_id**](docs/FleetApi.md#reactivate_driver_by_id) | **PUT** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*OpenapiClient::FleetApi* | [**update_dispatch_route_by_id**](docs/FleetApi.md#update_dispatch_route_by_id) | **PUT** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
*OpenapiClient::FleetApi* | [**update_organization_address**](docs/FleetApi.md#update_organization_address) | **PATCH** /addresses/{addressId} | /addresses/{addressId}
*OpenapiClient::FleetApi* | [**update_vehicles**](docs/FleetApi.md#update_vehicles) | **POST** /fleet/set_data | /fleet/set_data
*OpenapiClient::IndustrialApi* | [**get_all_data_inputs**](docs/IndustrialApi.md#get_all_data_inputs) | **GET** /industrial/data | /industrial/data
*OpenapiClient::IndustrialApi* | [**get_data_input**](docs/IndustrialApi.md#get_data_input) | **GET** /industrial/data/{data_input_id} | /industrial/data/{data_input_id:[0-9]+}
*OpenapiClient::IndustrialApi* | [**get_machines**](docs/IndustrialApi.md#get_machines) | **POST** /machines/list | /machines/list
*OpenapiClient::IndustrialApi* | [**get_machines_history**](docs/IndustrialApi.md#get_machines_history) | **POST** /machines/history | /machines/history
*OpenapiClient::RoutesApi* | [**create_dispatch_route**](docs/RoutesApi.md#create_dispatch_route) | **POST** /fleet/dispatch/routes | /fleet/dispatch/routes
*OpenapiClient::RoutesApi* | [**create_driver_dispatch_route**](docs/RoutesApi.md#create_driver_dispatch_route) | **POST** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
*OpenapiClient::RoutesApi* | [**create_vehicle_dispatch_route**](docs/RoutesApi.md#create_vehicle_dispatch_route) | **POST** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
*OpenapiClient::RoutesApi* | [**delete_dispatch_route_by_id**](docs/RoutesApi.md#delete_dispatch_route_by_id) | **DELETE** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
*OpenapiClient::RoutesApi* | [**fetch_all_dispatch_routes**](docs/RoutesApi.md#fetch_all_dispatch_routes) | **GET** /fleet/dispatch/routes | /fleet/dispatch/routes
*OpenapiClient::RoutesApi* | [**fetch_all_route_job_updates**](docs/RoutesApi.md#fetch_all_route_job_updates) | **GET** /fleet/dispatch/routes/job_updates | /fleet/dispatch/routes/job_updates
*OpenapiClient::RoutesApi* | [**get_dispatch_route_by_id**](docs/RoutesApi.md#get_dispatch_route_by_id) | **GET** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}
*OpenapiClient::RoutesApi* | [**get_dispatch_route_history**](docs/RoutesApi.md#get_dispatch_route_history) | **GET** /fleet/dispatch/routes/{route_id}/history | /fleet/dispatch/routes/{route_id:[0-9]+}/history
*OpenapiClient::RoutesApi* | [**get_dispatch_routes_by_driver_id**](docs/RoutesApi.md#get_dispatch_routes_by_driver_id) | **GET** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
*OpenapiClient::RoutesApi* | [**get_dispatch_routes_by_vehicle_id**](docs/RoutesApi.md#get_dispatch_routes_by_vehicle_id) | **GET** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
*OpenapiClient::RoutesApi* | [**update_dispatch_route_by_id**](docs/RoutesApi.md#update_dispatch_route_by_id) | **PUT** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
*OpenapiClient::SafetyApi* | [**get_driver_safety_score**](docs/SafetyApi.md#get_driver_safety_score) | **GET** /fleet/drivers/{driverId}/safety/score | /fleet/drivers/{driverId:[0-9]+}/safety/score
*OpenapiClient::SafetyApi* | [**get_vehicle_harsh_event**](docs/SafetyApi.md#get_vehicle_harsh_event) | **GET** /fleet/vehicles/{vehicleId}/safety/harsh_event | /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
*OpenapiClient::SafetyApi* | [**get_vehicle_safety_score**](docs/SafetyApi.md#get_vehicle_safety_score) | **GET** /fleet/vehicles/{vehicleId}/safety/score | /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
*OpenapiClient::SensorsApi* | [**get_sensors**](docs/SensorsApi.md#get_sensors) | **POST** /sensors/list | /sensors/list
*OpenapiClient::SensorsApi* | [**get_sensors_cargo**](docs/SensorsApi.md#get_sensors_cargo) | **POST** /sensors/cargo | /sensors/cargo
*OpenapiClient::SensorsApi* | [**get_sensors_door**](docs/SensorsApi.md#get_sensors_door) | **POST** /sensors/door | /sensors/door
*OpenapiClient::SensorsApi* | [**get_sensors_history**](docs/SensorsApi.md#get_sensors_history) | **POST** /sensors/history | /sensors/history
*OpenapiClient::SensorsApi* | [**get_sensors_humidity**](docs/SensorsApi.md#get_sensors_humidity) | **POST** /sensors/humidity | /sensors/humidity
*OpenapiClient::SensorsApi* | [**get_sensors_temperature**](docs/SensorsApi.md#get_sensors_temperature) | **POST** /sensors/temperature | /sensors/temperature
*OpenapiClient::TagsApi* | [**create_tag**](docs/TagsApi.md#create_tag) | **POST** /tags | /tags
*OpenapiClient::TagsApi* | [**delete_tag_by_id**](docs/TagsApi.md#delete_tag_by_id) | **DELETE** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
*OpenapiClient::TagsApi* | [**get_all_tags**](docs/TagsApi.md#get_all_tags) | **GET** /tags | /tags
*OpenapiClient::TagsApi* | [**get_tag_by_id**](docs/TagsApi.md#get_tag_by_id) | **GET** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
*OpenapiClient::TagsApi* | [**modify_tag_by_id**](docs/TagsApi.md#modify_tag_by_id) | **PATCH** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
*OpenapiClient::TagsApi* | [**update_tag_by_id**](docs/TagsApi.md#update_tag_by_id) | **PUT** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
*OpenapiClient::UsersApi* | [**delete_user_by_id**](docs/UsersApi.md#delete_user_by_id) | **DELETE** /users/{userId} | /users/{userId:[0-9]+}
*OpenapiClient::UsersApi* | [**get_user_by_id**](docs/UsersApi.md#get_user_by_id) | **GET** /users/{userId} | /users/{userId:[0-9]+}
*OpenapiClient::UsersApi* | [**list_user_roles**](docs/UsersApi.md#list_user_roles) | **GET** /user_roles | /user_roles
*OpenapiClient::UsersApi* | [**list_users**](docs/UsersApi.md#list_users) | **GET** /users | /users


## Documentation for Models

 - [OpenapiClient::Address](docs/Address.md)
 - [OpenapiClient::AddressGeofence](docs/AddressGeofence.md)
 - [OpenapiClient::AddressGeofenceCircle](docs/AddressGeofenceCircle.md)
 - [OpenapiClient::AddressGeofencePolygon](docs/AddressGeofencePolygon.md)
 - [OpenapiClient::AddressGeofencePolygonVertices](docs/AddressGeofencePolygonVertices.md)
 - [OpenapiClient::AddressesAddresses](docs/AddressesAddresses.md)
 - [OpenapiClient::AllRouteJobUpdates](docs/AllRouteJobUpdates.md)
 - [OpenapiClient::Asset](docs/Asset.md)
 - [OpenapiClient::AssetCable](docs/AssetCable.md)
 - [OpenapiClient::AssetCurrentLocation](docs/AssetCurrentLocation.md)
 - [OpenapiClient::AssetCurrentLocationsResponse](docs/AssetCurrentLocationsResponse.md)
 - [OpenapiClient::AssetReeferResponse](docs/AssetReeferResponse.md)
 - [OpenapiClient::AssetReeferResponseReeferStats](docs/AssetReeferResponseReeferStats.md)
 - [OpenapiClient::AssetReeferResponseReeferStatsAlarms](docs/AssetReeferResponseReeferStatsAlarms.md)
 - [OpenapiClient::AssetReeferResponseReeferStatsAlarms1](docs/AssetReeferResponseReeferStatsAlarms1.md)
 - [OpenapiClient::AssetReeferResponseReeferStatsEngineHours](docs/AssetReeferResponseReeferStatsEngineHours.md)
 - [OpenapiClient::AssetReeferResponseReeferStatsFuelPercentage](docs/AssetReeferResponseReeferStatsFuelPercentage.md)
 - [OpenapiClient::AssetReeferResponseReeferStatsPowerStatus](docs/AssetReeferResponseReeferStatsPowerStatus.md)
 - [OpenapiClient::AssetReeferResponseReeferStatsReturnAirTemp](docs/AssetReeferResponseReeferStatsReturnAirTemp.md)
 - [OpenapiClient::AssetReeferResponseReeferStatsSetPoint](docs/AssetReeferResponseReeferStatsSetPoint.md)
 - [OpenapiClient::AuxInput](docs/AuxInput.md)
 - [OpenapiClient::AuxInputSeries](docs/AuxInputSeries.md)
 - [OpenapiClient::CargoResponse](docs/CargoResponse.md)
 - [OpenapiClient::CargoResponseSensors](docs/CargoResponseSensors.md)
 - [OpenapiClient::Contact](docs/Contact.md)
 - [OpenapiClient::CurrentDriver](docs/CurrentDriver.md)
 - [OpenapiClient::DataInputHistoryResponse](docs/DataInputHistoryResponse.md)
 - [OpenapiClient::DataInputHistoryResponsePoints](docs/DataInputHistoryResponsePoints.md)
 - [OpenapiClient::DispatchJob](docs/DispatchJob.md)
 - [OpenapiClient::DispatchJobCreate](docs/DispatchJobCreate.md)
 - [OpenapiClient::DispatchRoute](docs/DispatchRoute.md)
 - [OpenapiClient::DispatchRouteBase](docs/DispatchRouteBase.md)
 - [OpenapiClient::DispatchRouteCreate](docs/DispatchRouteCreate.md)
 - [OpenapiClient::DispatchRouteHistoricalEntry](docs/DispatchRouteHistoricalEntry.md)
 - [OpenapiClient::DispatchRouteHistory](docs/DispatchRouteHistory.md)
 - [OpenapiClient::Document](docs/Document.md)
 - [OpenapiClient::DocumentBase](docs/DocumentBase.md)
 - [OpenapiClient::DocumentCreate](docs/DocumentCreate.md)
 - [OpenapiClient::DocumentField](docs/DocumentField.md)
 - [OpenapiClient::DocumentFieldCreate](docs/DocumentFieldCreate.md)
 - [OpenapiClient::DocumentFieldCreatePhotoValue](docs/DocumentFieldCreatePhotoValue.md)
 - [OpenapiClient::DocumentFieldType](docs/DocumentFieldType.md)
 - [OpenapiClient::DocumentFieldTypeNumberValueTypeMetadata](docs/DocumentFieldTypeNumberValueTypeMetadata.md)
 - [OpenapiClient::DocumentType](docs/DocumentType.md)
 - [OpenapiClient::DoorResponse](docs/DoorResponse.md)
 - [OpenapiClient::DoorResponseSensors](docs/DoorResponseSensors.md)
 - [OpenapiClient::Driver](docs/Driver.md)
 - [OpenapiClient::DriverBase](docs/DriverBase.md)
 - [OpenapiClient::DriverDailyLogResponse](docs/DriverDailyLogResponse.md)
 - [OpenapiClient::DriverDailyLogResponseDays](docs/DriverDailyLogResponseDays.md)
 - [OpenapiClient::DriverForCreate](docs/DriverForCreate.md)
 - [OpenapiClient::DriverSafetyScoreResponse](docs/DriverSafetyScoreResponse.md)
 - [OpenapiClient::DriversResponse](docs/DriversResponse.md)
 - [OpenapiClient::DriversSummaryResponse](docs/DriversSummaryResponse.md)
 - [OpenapiClient::DriversSummaryResponseSummaries](docs/DriversSummaryResponseSummaries.md)
 - [OpenapiClient::DvirBase](docs/DvirBase.md)
 - [OpenapiClient::DvirBaseAuthorSignature](docs/DvirBaseAuthorSignature.md)
 - [OpenapiClient::DvirBaseMechanicOrAgentSignature](docs/DvirBaseMechanicOrAgentSignature.md)
 - [OpenapiClient::DvirBaseNextDriverSignature](docs/DvirBaseNextDriverSignature.md)
 - [OpenapiClient::DvirBaseTrailerDefects](docs/DvirBaseTrailerDefects.md)
 - [OpenapiClient::DvirBaseVehicle](docs/DvirBaseVehicle.md)
 - [OpenapiClient::DvirListResponse](docs/DvirListResponse.md)
 - [OpenapiClient::EngineState](docs/EngineState.md)
 - [OpenapiClient::FleetVehicleLocation](docs/FleetVehicleLocation.md)
 - [OpenapiClient::FleetVehicleResponse](docs/FleetVehicleResponse.md)
 - [OpenapiClient::FleetVehicleResponseVehicleInfo](docs/FleetVehicleResponseVehicleInfo.md)
 - [OpenapiClient::HosAuthenticationLogsResponse](docs/HosAuthenticationLogsResponse.md)
 - [OpenapiClient::HosAuthenticationLogsResponseAuthenticationLogs](docs/HosAuthenticationLogsResponseAuthenticationLogs.md)
 - [OpenapiClient::HosLogsResponse](docs/HosLogsResponse.md)
 - [OpenapiClient::HosLogsResponseLogs](docs/HosLogsResponseLogs.md)
 - [OpenapiClient::HosLogsSummaryResponse](docs/HosLogsSummaryResponse.md)
 - [OpenapiClient::HosLogsSummaryResponseDrivers](docs/HosLogsSummaryResponseDrivers.md)
 - [OpenapiClient::HumidityResponse](docs/HumidityResponse.md)
 - [OpenapiClient::HumidityResponseSensors](docs/HumidityResponseSensors.md)
 - [OpenapiClient::InlineObject](docs/InlineObject.md)
 - [OpenapiClient::InlineObject1](docs/InlineObject1.md)
 - [OpenapiClient::InlineObject10](docs/InlineObject10.md)
 - [OpenapiClient::InlineObject11](docs/InlineObject11.md)
 - [OpenapiClient::InlineObject12](docs/InlineObject12.md)
 - [OpenapiClient::InlineObject13](docs/InlineObject13.md)
 - [OpenapiClient::InlineObject14](docs/InlineObject14.md)
 - [OpenapiClient::InlineObject15](docs/InlineObject15.md)
 - [OpenapiClient::InlineObject16](docs/InlineObject16.md)
 - [OpenapiClient::InlineObject17](docs/InlineObject17.md)
 - [OpenapiClient::InlineObject18](docs/InlineObject18.md)
 - [OpenapiClient::InlineObject19](docs/InlineObject19.md)
 - [OpenapiClient::InlineObject2](docs/InlineObject2.md)
 - [OpenapiClient::InlineObject20](docs/InlineObject20.md)
 - [OpenapiClient::InlineObject21](docs/InlineObject21.md)
 - [OpenapiClient::InlineObject22](docs/InlineObject22.md)
 - [OpenapiClient::InlineObject23](docs/InlineObject23.md)
 - [OpenapiClient::InlineObject24](docs/InlineObject24.md)
 - [OpenapiClient::InlineObject3](docs/InlineObject3.md)
 - [OpenapiClient::InlineObject4](docs/InlineObject4.md)
 - [OpenapiClient::InlineObject5](docs/InlineObject5.md)
 - [OpenapiClient::InlineObject6](docs/InlineObject6.md)
 - [OpenapiClient::InlineObject7](docs/InlineObject7.md)
 - [OpenapiClient::InlineObject8](docs/InlineObject8.md)
 - [OpenapiClient::InlineObject9](docs/InlineObject9.md)
 - [OpenapiClient::InlineResponse200](docs/InlineResponse200.md)
 - [OpenapiClient::InlineResponse2001](docs/InlineResponse2001.md)
 - [OpenapiClient::InlineResponse2002](docs/InlineResponse2002.md)
 - [OpenapiClient::InlineResponse2003](docs/InlineResponse2003.md)
 - [OpenapiClient::InlineResponse2004](docs/InlineResponse2004.md)
 - [OpenapiClient::InlineResponse2005](docs/InlineResponse2005.md)
 - [OpenapiClient::InlineResponse2005VehicleStats](docs/InlineResponse2005VehicleStats.md)
 - [OpenapiClient::InlineResponse2006](docs/InlineResponse2006.md)
 - [OpenapiClient::InlineResponse2007](docs/InlineResponse2007.md)
 - [OpenapiClient::InlineResponse2008](docs/InlineResponse2008.md)
 - [OpenapiClient::InlineResponse2009](docs/InlineResponse2009.md)
 - [OpenapiClient::JobStatus](docs/JobStatus.md)
 - [OpenapiClient::JobUpdateObject](docs/JobUpdateObject.md)
 - [OpenapiClient::Machine](docs/Machine.md)
 - [OpenapiClient::MachineHistoryResponse](docs/MachineHistoryResponse.md)
 - [OpenapiClient::MachineHistoryResponseMachines](docs/MachineHistoryResponseMachines.md)
 - [OpenapiClient::MachineHistoryResponseVibrations](docs/MachineHistoryResponseVibrations.md)
 - [OpenapiClient::Pagination](docs/Pagination.md)
 - [OpenapiClient::PrevJobStatus](docs/PrevJobStatus.md)
 - [OpenapiClient::SafetyReportHarshEvent](docs/SafetyReportHarshEvent.md)
 - [OpenapiClient::Sensor](docs/Sensor.md)
 - [OpenapiClient::SensorHistoryResponse](docs/SensorHistoryResponse.md)
 - [OpenapiClient::SensorHistoryResponseResults](docs/SensorHistoryResponseResults.md)
 - [OpenapiClient::SensorsHistorySeries](docs/SensorsHistorySeries.md)
 - [OpenapiClient::Tag](docs/Tag.md)
 - [OpenapiClient::TagCreate](docs/TagCreate.md)
 - [OpenapiClient::TagMetadata](docs/TagMetadata.md)
 - [OpenapiClient::TagModify](docs/TagModify.md)
 - [OpenapiClient::TagModifyAdd](docs/TagModifyAdd.md)
 - [OpenapiClient::TagModifyDelete](docs/TagModifyDelete.md)
 - [OpenapiClient::TagUpdate](docs/TagUpdate.md)
 - [OpenapiClient::TaggedAddress](docs/TaggedAddress.md)
 - [OpenapiClient::TaggedAddressBase](docs/TaggedAddressBase.md)
 - [OpenapiClient::TaggedAsset](docs/TaggedAsset.md)
 - [OpenapiClient::TaggedAssetBase](docs/TaggedAssetBase.md)
 - [OpenapiClient::TaggedDriver](docs/TaggedDriver.md)
 - [OpenapiClient::TaggedDriverBase](docs/TaggedDriverBase.md)
 - [OpenapiClient::TaggedMachine](docs/TaggedMachine.md)
 - [OpenapiClient::TaggedMachineBase](docs/TaggedMachineBase.md)
 - [OpenapiClient::TaggedSensor](docs/TaggedSensor.md)
 - [OpenapiClient::TaggedSensorBase](docs/TaggedSensorBase.md)
 - [OpenapiClient::TaggedVehicle](docs/TaggedVehicle.md)
 - [OpenapiClient::TaggedVehicleBase](docs/TaggedVehicleBase.md)
 - [OpenapiClient::TemperatureResponse](docs/TemperatureResponse.md)
 - [OpenapiClient::TemperatureResponseSensors](docs/TemperatureResponseSensors.md)
 - [OpenapiClient::TripResponse](docs/TripResponse.md)
 - [OpenapiClient::TripResponseEndCoordinates](docs/TripResponseEndCoordinates.md)
 - [OpenapiClient::TripResponseStartCoordinates](docs/TripResponseStartCoordinates.md)
 - [OpenapiClient::TripResponseTrips](docs/TripResponseTrips.md)
 - [OpenapiClient::User](docs/User.md)
 - [OpenapiClient::UserBase](docs/UserBase.md)
 - [OpenapiClient::UserRole](docs/UserRole.md)
 - [OpenapiClient::UserTagRole](docs/UserTagRole.md)
 - [OpenapiClient::UserTagRoleTag](docs/UserTagRoleTag.md)
 - [OpenapiClient::Vehicle](docs/Vehicle.md)
 - [OpenapiClient::VehicleHarshEventResponse](docs/VehicleHarshEventResponse.md)
 - [OpenapiClient::VehicleHarshEventResponseLocation](docs/VehicleHarshEventResponseLocation.md)
 - [OpenapiClient::VehicleLocation](docs/VehicleLocation.md)
 - [OpenapiClient::VehicleMaintenance](docs/VehicleMaintenance.md)
 - [OpenapiClient::VehicleMaintenanceJ1939](docs/VehicleMaintenanceJ1939.md)
 - [OpenapiClient::VehicleMaintenanceJ1939CheckEngineLight](docs/VehicleMaintenanceJ1939CheckEngineLight.md)
 - [OpenapiClient::VehicleMaintenanceJ1939DiagnosticTroubleCodes](docs/VehicleMaintenanceJ1939DiagnosticTroubleCodes.md)
 - [OpenapiClient::VehicleMaintenancePassenger](docs/VehicleMaintenancePassenger.md)
 - [OpenapiClient::VehicleMaintenancePassengerCheckEngineLight](docs/VehicleMaintenancePassengerCheckEngineLight.md)
 - [OpenapiClient::VehicleMaintenancePassengerDiagnosticTroubleCodes](docs/VehicleMaintenancePassengerDiagnosticTroubleCodes.md)
 - [OpenapiClient::VehicleSafetyScoreResponse](docs/VehicleSafetyScoreResponse.md)


## Documentation for Authorization

 All endpoints do not require authorization.


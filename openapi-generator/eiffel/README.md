# Eiffel API client for openapi

# Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).

## Overview
This API client was generated by the [OpenAPI Generator](https://openapi-generator.tech) project.  By using the [openapi-spec](https://openapis.org) from a remote server, you can easily generate an API client.

- API version: 1.0.0
- Package version: 1.0.0
- Build package: org.openapitools.codegen.languages.EiffelClientCodegen

## Installation
Add the library into your Eiffel configuration file.
```
    "<library name="api_client" location="%PATH_TO_EIFFEL_OPENAPI_CLIENT%\api_client.ecf"/>"
```

## Documentation for API Endpoints

All URIs are relative to *https://api.samsara.com/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ASSETS_API* | [**all_asset_current_locations**](docs/ASSETS_API.md#all_asset_current_locations) | **Get** /fleet/assets/locations | /fleet/assets/locations
*ASSETS_API* | [**all_assets**](docs/ASSETS_API.md#all_assets) | **Get** /fleet/assets | /fleet/assets
*ASSETS_API* | [**asset_location**](docs/ASSETS_API.md#asset_location) | **Get** /fleet/assets/{asset_id}/locations | /fleet/assets/{assetId:[0-9]+}/locations
*ASSETS_API* | [**asset_reefer**](docs/ASSETS_API.md#asset_reefer) | **Get** /fleet/assets/{asset_id}/reefer | /fleet/assets/{assetId:[0-9]+}/reefer
*DRIVERS_API* | [**all_deactivated_drivers**](docs/DRIVERS_API.md#all_deactivated_drivers) | **Get** /fleet/drivers/inactive | /fleet/drivers/inactive
*DRIVERS_API* | [**create_driver**](docs/DRIVERS_API.md#create_driver) | **Post** /fleet/drivers/create | /fleet/drivers/create
*DRIVERS_API* | [**deactivate_driver**](docs/DRIVERS_API.md#deactivate_driver) | **Delete** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*DRIVERS_API* | [**deactivated_driver_by_id**](docs/DRIVERS_API.md#deactivated_driver_by_id) | **Get** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*DRIVERS_API* | [**driver_by_id**](docs/DRIVERS_API.md#driver_by_id) | **Get** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*DRIVERS_API* | [**reactivate_driver_by_id**](docs/DRIVERS_API.md#reactivate_driver_by_id) | **Put** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*FLEET_API* | [**add_fleet_address**](docs/FLEET_API.md#add_fleet_address) | **Post** /fleet/add_address | /fleet/add_address
*FLEET_API* | [**add_organization_addresses**](docs/FLEET_API.md#add_organization_addresses) | **Post** /addresses | /addresses
*FLEET_API* | [**all_asset_current_locations**](docs/FLEET_API.md#all_asset_current_locations) | **Get** /fleet/assets/locations | /fleet/assets/locations
*FLEET_API* | [**all_assets**](docs/FLEET_API.md#all_assets) | **Get** /fleet/assets | /fleet/assets
*FLEET_API* | [**all_deactivated_drivers**](docs/FLEET_API.md#all_deactivated_drivers) | **Get** /fleet/drivers/inactive | /fleet/drivers/inactive
*FLEET_API* | [**asset_location**](docs/FLEET_API.md#asset_location) | **Get** /fleet/assets/{asset_id}/locations | /fleet/assets/{assetId:[0-9]+}/locations
*FLEET_API* | [**asset_reefer**](docs/FLEET_API.md#asset_reefer) | **Get** /fleet/assets/{asset_id}/reefer | /fleet/assets/{assetId:[0-9]+}/reefer
*FLEET_API* | [**create_dispatch_route**](docs/FLEET_API.md#create_dispatch_route) | **Post** /fleet/dispatch/routes | /fleet/dispatch/routes
*FLEET_API* | [**create_driver**](docs/FLEET_API.md#create_driver) | **Post** /fleet/drivers/create | /fleet/drivers/create
*FLEET_API* | [**create_driver_dispatch_route**](docs/FLEET_API.md#create_driver_dispatch_route) | **Post** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
*FLEET_API* | [**create_driver_document**](docs/FLEET_API.md#create_driver_document) | **Post** /fleet/drivers/{driver_id}/documents | /fleet/drivers/{driver_id:[0-9]+}/documents
*FLEET_API* | [**create_dvir**](docs/FLEET_API.md#create_dvir) | **Post** /fleet/maintenance/dvirs | /fleet/maintenance/dvirs
*FLEET_API* | [**create_vehicle_dispatch_route**](docs/FLEET_API.md#create_vehicle_dispatch_route) | **Post** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
*FLEET_API* | [**deactivate_driver**](docs/FLEET_API.md#deactivate_driver) | **Delete** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*FLEET_API* | [**deactivated_driver_by_id**](docs/FLEET_API.md#deactivated_driver_by_id) | **Get** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*FLEET_API* | [**delete_dispatch_route_by_id**](docs/FLEET_API.md#delete_dispatch_route_by_id) | **Delete** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
*FLEET_API* | [**delete_organization_address**](docs/FLEET_API.md#delete_organization_address) | **Delete** /addresses/{addressId} | /addresses/{addressId}
*FLEET_API* | [**dispatch_route_by_id**](docs/FLEET_API.md#dispatch_route_by_id) | **Get** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}
*FLEET_API* | [**dispatch_route_history**](docs/FLEET_API.md#dispatch_route_history) | **Get** /fleet/dispatch/routes/{route_id}/history | /fleet/dispatch/routes/{route_id:[0-9]+}/history
*FLEET_API* | [**dispatch_routes_by_driver_id**](docs/FLEET_API.md#dispatch_routes_by_driver_id) | **Get** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
*FLEET_API* | [**dispatch_routes_by_vehicle_id**](docs/FLEET_API.md#dispatch_routes_by_vehicle_id) | **Get** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
*FLEET_API* | [**driver_by_id**](docs/FLEET_API.md#driver_by_id) | **Get** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*FLEET_API* | [**driver_document_types_by_org_id**](docs/FLEET_API.md#driver_document_types_by_org_id) | **Get** /fleet/drivers/document_types | /fleet/drivers/document_types
*FLEET_API* | [**driver_documents_by_org_id**](docs/FLEET_API.md#driver_documents_by_org_id) | **Get** /fleet/drivers/documents | /fleet/drivers/documents
*FLEET_API* | [**driver_safety_score**](docs/FLEET_API.md#driver_safety_score) | **Get** /fleet/drivers/{driverId}/safety/score | /fleet/drivers/{driverId:[0-9]+}/safety/score
*FLEET_API* | [**dvirs**](docs/FLEET_API.md#dvirs) | **Get** /fleet/maintenance/dvirs | /fleet/maintenance/dvirs
*FLEET_API* | [**fetch_all_dispatch_routes**](docs/FLEET_API.md#fetch_all_dispatch_routes) | **Get** /fleet/dispatch/routes | /fleet/dispatch/routes
*FLEET_API* | [**fetch_all_route_job_updates**](docs/FLEET_API.md#fetch_all_route_job_updates) | **Get** /fleet/dispatch/routes/job_updates | /fleet/dispatch/routes/job_updates
*FLEET_API* | [**fleet_drivers**](docs/FLEET_API.md#fleet_drivers) | **Post** /fleet/drivers | /fleet/drivers
*FLEET_API* | [**fleet_drivers_hos_daily_logs**](docs/FLEET_API.md#fleet_drivers_hos_daily_logs) | **Post** /fleet/drivers/{driver_id}/hos_daily_logs | /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
*FLEET_API* | [**fleet_drivers_summary**](docs/FLEET_API.md#fleet_drivers_summary) | **Post** /fleet/drivers/summary | /fleet/drivers/summary
*FLEET_API* | [**fleet_hos_authentication_logs**](docs/FLEET_API.md#fleet_hos_authentication_logs) | **Post** /fleet/hos_authentication_logs | /fleet/hos_authentication_logs
*FLEET_API* | [**fleet_hos_logs**](docs/FLEET_API.md#fleet_hos_logs) | **Post** /fleet/hos_logs | /fleet/hos_logs
*FLEET_API* | [**fleet_hos_logs_summary**](docs/FLEET_API.md#fleet_hos_logs_summary) | **Post** /fleet/hos_logs_summary | /fleet/hos_logs_summary
*FLEET_API* | [**fleet_locations**](docs/FLEET_API.md#fleet_locations) | **Post** /fleet/locations | /fleet/locations
*FLEET_API* | [**fleet_maintenance_list**](docs/FLEET_API.md#fleet_maintenance_list) | **Post** /fleet/maintenance/list | /fleet/maintenance/list
*FLEET_API* | [**fleet_trips**](docs/FLEET_API.md#fleet_trips) | **Post** /fleet/trips | /fleet/trips
*FLEET_API* | [**fleet_vehicle**](docs/FLEET_API.md#fleet_vehicle) | **Get** /fleet/vehicles/{vehicle_id_or_external_id} | /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*FLEET_API* | [**list_contacts**](docs/FLEET_API.md#list_contacts) | **Get** /contacts | /contacts
*FLEET_API* | [**list_fleet**](docs/FLEET_API.md#list_fleet) | **Post** /fleet/list | /fleet/list
*FLEET_API* | [**organization_address**](docs/FLEET_API.md#organization_address) | **Get** /addresses/{addressId} | /addresses/{addressId}
*FLEET_API* | [**organization_addresses**](docs/FLEET_API.md#organization_addresses) | **Get** /addresses | /addresses
*FLEET_API* | [**organization_contact**](docs/FLEET_API.md#organization_contact) | **Get** /contacts/{contact_id} | /contacts/{contact_id}
*FLEET_API* | [**patch_fleet_vehicle**](docs/FLEET_API.md#patch_fleet_vehicle) | **Patch** /fleet/vehicles/{vehicle_id_or_external_id} | /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*FLEET_API* | [**reactivate_driver_by_id**](docs/FLEET_API.md#reactivate_driver_by_id) | **Put** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*FLEET_API* | [**update_dispatch_route_by_id**](docs/FLEET_API.md#update_dispatch_route_by_id) | **Put** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
*FLEET_API* | [**update_organization_address**](docs/FLEET_API.md#update_organization_address) | **Patch** /addresses/{addressId} | /addresses/{addressId}
*FLEET_API* | [**update_vehicles**](docs/FLEET_API.md#update_vehicles) | **Post** /fleet/set_data | /fleet/set_data
*FLEET_API* | [**vehicle_harsh_event**](docs/FLEET_API.md#vehicle_harsh_event) | **Get** /fleet/vehicles/{vehicleId}/safety/harsh_event | /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
*FLEET_API* | [**vehicle_locations**](docs/FLEET_API.md#vehicle_locations) | **Get** /fleet/vehicles/{vehicle_id}/locations | /fleet/vehicles/{vehicle_id:[0-9]+}/locations
*FLEET_API* | [**vehicle_safety_score**](docs/FLEET_API.md#vehicle_safety_score) | **Get** /fleet/vehicles/{vehicleId}/safety/score | /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
*FLEET_API* | [**vehicle_stats**](docs/FLEET_API.md#vehicle_stats) | **Get** /fleet/vehicles/stats | /fleet/vehicles/stats
*FLEET_API* | [**vehicles_locations**](docs/FLEET_API.md#vehicles_locations) | **Get** /fleet/vehicles/locations | /fleet/vehicles/locations
*INDUSTRIAL_API* | [**all_data_inputs**](docs/INDUSTRIAL_API.md#all_data_inputs) | **Get** /industrial/data | /industrial/data
*INDUSTRIAL_API* | [**data_input**](docs/INDUSTRIAL_API.md#data_input) | **Get** /industrial/data/{data_input_id} | /industrial/data/{data_input_id:[0-9]+}
*INDUSTRIAL_API* | [**machines**](docs/INDUSTRIAL_API.md#machines) | **Post** /machines/list | /machines/list
*INDUSTRIAL_API* | [**machines_history**](docs/INDUSTRIAL_API.md#machines_history) | **Post** /machines/history | /machines/history
*ROUTES_API* | [**create_dispatch_route**](docs/ROUTES_API.md#create_dispatch_route) | **Post** /fleet/dispatch/routes | /fleet/dispatch/routes
*ROUTES_API* | [**create_driver_dispatch_route**](docs/ROUTES_API.md#create_driver_dispatch_route) | **Post** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
*ROUTES_API* | [**create_vehicle_dispatch_route**](docs/ROUTES_API.md#create_vehicle_dispatch_route) | **Post** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
*ROUTES_API* | [**delete_dispatch_route_by_id**](docs/ROUTES_API.md#delete_dispatch_route_by_id) | **Delete** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
*ROUTES_API* | [**dispatch_route_by_id**](docs/ROUTES_API.md#dispatch_route_by_id) | **Get** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}
*ROUTES_API* | [**dispatch_route_history**](docs/ROUTES_API.md#dispatch_route_history) | **Get** /fleet/dispatch/routes/{route_id}/history | /fleet/dispatch/routes/{route_id:[0-9]+}/history
*ROUTES_API* | [**dispatch_routes_by_driver_id**](docs/ROUTES_API.md#dispatch_routes_by_driver_id) | **Get** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
*ROUTES_API* | [**dispatch_routes_by_vehicle_id**](docs/ROUTES_API.md#dispatch_routes_by_vehicle_id) | **Get** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
*ROUTES_API* | [**fetch_all_dispatch_routes**](docs/ROUTES_API.md#fetch_all_dispatch_routes) | **Get** /fleet/dispatch/routes | /fleet/dispatch/routes
*ROUTES_API* | [**fetch_all_route_job_updates**](docs/ROUTES_API.md#fetch_all_route_job_updates) | **Get** /fleet/dispatch/routes/job_updates | /fleet/dispatch/routes/job_updates
*ROUTES_API* | [**update_dispatch_route_by_id**](docs/ROUTES_API.md#update_dispatch_route_by_id) | **Put** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
*SAFETY_API* | [**driver_safety_score**](docs/SAFETY_API.md#driver_safety_score) | **Get** /fleet/drivers/{driverId}/safety/score | /fleet/drivers/{driverId:[0-9]+}/safety/score
*SAFETY_API* | [**vehicle_harsh_event**](docs/SAFETY_API.md#vehicle_harsh_event) | **Get** /fleet/vehicles/{vehicleId}/safety/harsh_event | /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
*SAFETY_API* | [**vehicle_safety_score**](docs/SAFETY_API.md#vehicle_safety_score) | **Get** /fleet/vehicles/{vehicleId}/safety/score | /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
*SENSORS_API* | [**sensors**](docs/SENSORS_API.md#sensors) | **Post** /sensors/list | /sensors/list
*SENSORS_API* | [**sensors_cargo**](docs/SENSORS_API.md#sensors_cargo) | **Post** /sensors/cargo | /sensors/cargo
*SENSORS_API* | [**sensors_door**](docs/SENSORS_API.md#sensors_door) | **Post** /sensors/door | /sensors/door
*SENSORS_API* | [**sensors_history**](docs/SENSORS_API.md#sensors_history) | **Post** /sensors/history | /sensors/history
*SENSORS_API* | [**sensors_humidity**](docs/SENSORS_API.md#sensors_humidity) | **Post** /sensors/humidity | /sensors/humidity
*SENSORS_API* | [**sensors_temperature**](docs/SENSORS_API.md#sensors_temperature) | **Post** /sensors/temperature | /sensors/temperature
*TAGS_API* | [**all_tags**](docs/TAGS_API.md#all_tags) | **Get** /tags | /tags
*TAGS_API* | [**create_tag**](docs/TAGS_API.md#create_tag) | **Post** /tags | /tags
*TAGS_API* | [**delete_tag_by_id**](docs/TAGS_API.md#delete_tag_by_id) | **Delete** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
*TAGS_API* | [**modify_tag_by_id**](docs/TAGS_API.md#modify_tag_by_id) | **Patch** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
*TAGS_API* | [**tag_by_id**](docs/TAGS_API.md#tag_by_id) | **Get** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
*TAGS_API* | [**update_tag_by_id**](docs/TAGS_API.md#update_tag_by_id) | **Put** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
*USERS_API* | [**delete_user_by_id**](docs/USERS_API.md#delete_user_by_id) | **Delete** /users/{userId} | /users/{userId:[0-9]+}
*USERS_API* | [**list_user_roles**](docs/USERS_API.md#list_user_roles) | **Get** /user_roles | /user_roles
*USERS_API* | [**list_users**](docs/USERS_API.md#list_users) | **Get** /users | /users
*USERS_API* | [**user_by_id**](docs/USERS_API.md#user_by_id) | **Get** /users/{userId} | /users/{userId:[0-9]+}


## Documentation For Models

 - [ADDRESS](docs/ADDRESS.md)
 - [ADDRESS_GEOFENCE](docs/ADDRESS_GEOFENCE.md)
 - [ADDRESS_GEOFENCE_CIRCLE](docs/ADDRESS_GEOFENCE_CIRCLE.md)
 - [ADDRESS_GEOFENCE_POLYGON](docs/ADDRESS_GEOFENCE_POLYGON.md)
 - [ADDRESS_GEOFENCE_POLYGON_VERTICES](docs/ADDRESS_GEOFENCE_POLYGON_VERTICES.md)
 - [ALL_ROUTE_JOB_UPDATES](docs/ALL_ROUTE_JOB_UPDATES.md)
 - [ASSET](docs/ASSET.md)
 - [ASSET_CABLE](docs/ASSET_CABLE.md)
 - [ASSET_CURRENT_LOCATION](docs/ASSET_CURRENT_LOCATION.md)
 - [ASSET_CURRENT_LOCATIONS_RESPONSE](docs/ASSET_CURRENT_LOCATIONS_RESPONSE.md)
 - [ASSET_REEFER_RESPONSE](docs/ASSET_REEFER_RESPONSE.md)
 - [ASSET_REEFER_RESPONSE_REEFER_STATS](docs/ASSET_REEFER_RESPONSE_REEFER_STATS.md)
 - [ASSET_REEFER_RESPONSE_REEFER_STATS_ALARMS](docs/ASSET_REEFER_RESPONSE_REEFER_STATS_ALARMS.md)
 - [ASSET_REEFER_RESPONSE_REEFER_STATS_ALARMS_1](docs/ASSET_REEFER_RESPONSE_REEFER_STATS_ALARMS_1.md)
 - [ASSET_REEFER_RESPONSE_REEFER_STATS_ENGINE_HOURS](docs/ASSET_REEFER_RESPONSE_REEFER_STATS_ENGINE_HOURS.md)
 - [ASSET_REEFER_RESPONSE_REEFER_STATS_FUEL_PERCENTAGE](docs/ASSET_REEFER_RESPONSE_REEFER_STATS_FUEL_PERCENTAGE.md)
 - [ASSET_REEFER_RESPONSE_REEFER_STATS_POWER_STATUS](docs/ASSET_REEFER_RESPONSE_REEFER_STATS_POWER_STATUS.md)
 - [ASSET_REEFER_RESPONSE_REEFER_STATS_RETURN_AIR_TEMP](docs/ASSET_REEFER_RESPONSE_REEFER_STATS_RETURN_AIR_TEMP.md)
 - [ASSET_REEFER_RESPONSE_REEFER_STATS_SET_POINT](docs/ASSET_REEFER_RESPONSE_REEFER_STATS_SET_POINT.md)
 - [AUX_INPUT](docs/AUX_INPUT.md)
 - [AUX_INPUT_SERIES](docs/AUX_INPUT_SERIES.md)
 - [CARGO_RESPONSE](docs/CARGO_RESPONSE.md)
 - [CARGO_RESPONSE_SENSORS](docs/CARGO_RESPONSE_SENSORS.md)
 - [CONTACT](docs/CONTACT.md)
 - [CURRENT_DRIVER](docs/CURRENT_DRIVER.md)
 - [DATA_INPUT_HISTORY_RESPONSE](docs/DATA_INPUT_HISTORY_RESPONSE.md)
 - [DATA_INPUT_HISTORY_RESPONSE_POINTS](docs/DATA_INPUT_HISTORY_RESPONSE_POINTS.md)
 - [DISPATCH_JOB](docs/DISPATCH_JOB.md)
 - [DISPATCH_JOB_CREATE](docs/DISPATCH_JOB_CREATE.md)
 - [DISPATCH_ROUTE](docs/DISPATCH_ROUTE.md)
 - [DISPATCH_ROUTE_BASE](docs/DISPATCH_ROUTE_BASE.md)
 - [DISPATCH_ROUTE_CREATE](docs/DISPATCH_ROUTE_CREATE.md)
 - [DISPATCH_ROUTE_HISTORICAL_ENTRY](docs/DISPATCH_ROUTE_HISTORICAL_ENTRY.md)
 - [DISPATCH_ROUTE_HISTORY](docs/DISPATCH_ROUTE_HISTORY.md)
 - [DOCUMENT](docs/DOCUMENT.md)
 - [DOCUMENT_BASE](docs/DOCUMENT_BASE.md)
 - [DOCUMENT_CREATE](docs/DOCUMENT_CREATE.md)
 - [DOCUMENT_FIELD](docs/DOCUMENT_FIELD.md)
 - [DOCUMENT_FIELD_CREATE](docs/DOCUMENT_FIELD_CREATE.md)
 - [DOCUMENT_FIELD_CREATE_PHOTO_VALUE](docs/DOCUMENT_FIELD_CREATE_PHOTO_VALUE.md)
 - [DOCUMENT_FIELD_TYPE](docs/DOCUMENT_FIELD_TYPE.md)
 - [DOCUMENT_FIELD_TYPE_NUMBER_VALUE_TYPE_METADATA](docs/DOCUMENT_FIELD_TYPE_NUMBER_VALUE_TYPE_METADATA.md)
 - [DOCUMENT_TYPE](docs/DOCUMENT_TYPE.md)
 - [DOOR_RESPONSE](docs/DOOR_RESPONSE.md)
 - [DOOR_RESPONSE_SENSORS](docs/DOOR_RESPONSE_SENSORS.md)
 - [DRIVER](docs/DRIVER.md)
 - [DRIVERS_RESPONSE](docs/DRIVERS_RESPONSE.md)
 - [DRIVERS_SUMMARY_RESPONSE](docs/DRIVERS_SUMMARY_RESPONSE.md)
 - [DRIVERS_SUMMARY_RESPONSE_SUMMARIES](docs/DRIVERS_SUMMARY_RESPONSE_SUMMARIES.md)
 - [DRIVER_BASE](docs/DRIVER_BASE.md)
 - [DRIVER_DAILY_LOG_RESPONSE](docs/DRIVER_DAILY_LOG_RESPONSE.md)
 - [DRIVER_DAILY_LOG_RESPONSE_DAYS](docs/DRIVER_DAILY_LOG_RESPONSE_DAYS.md)
 - [DRIVER_FOR_CREATE](docs/DRIVER_FOR_CREATE.md)
 - [DRIVER_SAFETY_SCORE_RESPONSE](docs/DRIVER_SAFETY_SCORE_RESPONSE.md)
 - [DVIR_BASE](docs/DVIR_BASE.md)
 - [DVIR_BASE_AUTHOR_SIGNATURE](docs/DVIR_BASE_AUTHOR_SIGNATURE.md)
 - [DVIR_BASE_MECHANIC_OR_AGENT_SIGNATURE](docs/DVIR_BASE_MECHANIC_OR_AGENT_SIGNATURE.md)
 - [DVIR_BASE_NEXT_DRIVER_SIGNATURE](docs/DVIR_BASE_NEXT_DRIVER_SIGNATURE.md)
 - [DVIR_BASE_TRAILER_DEFECTS](docs/DVIR_BASE_TRAILER_DEFECTS.md)
 - [DVIR_BASE_VEHICLE](docs/DVIR_BASE_VEHICLE.md)
 - [DVIR_LIST_RESPONSE](docs/DVIR_LIST_RESPONSE.md)
 - [ENGINE_STATE](docs/ENGINE_STATE.md)
 - [FLEET_VEHICLE_LOCATION](docs/FLEET_VEHICLE_LOCATION.md)
 - [FLEET_VEHICLE_RESPONSE](docs/FLEET_VEHICLE_RESPONSE.md)
 - [FLEET_VEHICLE_RESPONSE_VEHICLE_INFO](docs/FLEET_VEHICLE_RESPONSE_VEHICLE_INFO.md)
 - [HOS_AUTHENTICATION_LOGS_RESPONSE](docs/HOS_AUTHENTICATION_LOGS_RESPONSE.md)
 - [HOS_AUTHENTICATION_LOGS_RESPONSE_AUTHENTICATION_LOGS](docs/HOS_AUTHENTICATION_LOGS_RESPONSE_AUTHENTICATION_LOGS.md)
 - [HOS_LOGS_RESPONSE](docs/HOS_LOGS_RESPONSE.md)
 - [HOS_LOGS_RESPONSE_LOGS](docs/HOS_LOGS_RESPONSE_LOGS.md)
 - [HOS_LOGS_SUMMARY_RESPONSE](docs/HOS_LOGS_SUMMARY_RESPONSE.md)
 - [HOS_LOGS_SUMMARY_RESPONSE_DRIVERS](docs/HOS_LOGS_SUMMARY_RESPONSE_DRIVERS.md)
 - [HUMIDITY_RESPONSE](docs/HUMIDITY_RESPONSE.md)
 - [HUMIDITY_RESPONSE_SENSORS](docs/HUMIDITY_RESPONSE_SENSORS.md)
 - [INLINE_OBJECT](docs/INLINE_OBJECT.md)
 - [INLINE_OBJECT_1](docs/INLINE_OBJECT_1.md)
 - [INLINE_OBJECT_10](docs/INLINE_OBJECT_10.md)
 - [INLINE_OBJECT_11](docs/INLINE_OBJECT_11.md)
 - [INLINE_OBJECT_12](docs/INLINE_OBJECT_12.md)
 - [INLINE_OBJECT_13](docs/INLINE_OBJECT_13.md)
 - [INLINE_OBJECT_14](docs/INLINE_OBJECT_14.md)
 - [INLINE_OBJECT_15](docs/INLINE_OBJECT_15.md)
 - [INLINE_OBJECT_16](docs/INLINE_OBJECT_16.md)
 - [INLINE_OBJECT_17](docs/INLINE_OBJECT_17.md)
 - [INLINE_OBJECT_18](docs/INLINE_OBJECT_18.md)
 - [INLINE_OBJECT_19](docs/INLINE_OBJECT_19.md)
 - [INLINE_OBJECT_2](docs/INLINE_OBJECT_2.md)
 - [INLINE_OBJECT_20](docs/INLINE_OBJECT_20.md)
 - [INLINE_OBJECT_21](docs/INLINE_OBJECT_21.md)
 - [INLINE_OBJECT_22](docs/INLINE_OBJECT_22.md)
 - [INLINE_OBJECT_23](docs/INLINE_OBJECT_23.md)
 - [INLINE_OBJECT_24](docs/INLINE_OBJECT_24.md)
 - [INLINE_OBJECT_3](docs/INLINE_OBJECT_3.md)
 - [INLINE_OBJECT_4](docs/INLINE_OBJECT_4.md)
 - [INLINE_OBJECT_5](docs/INLINE_OBJECT_5.md)
 - [INLINE_OBJECT_6](docs/INLINE_OBJECT_6.md)
 - [INLINE_OBJECT_7](docs/INLINE_OBJECT_7.md)
 - [INLINE_OBJECT_8](docs/INLINE_OBJECT_8.md)
 - [INLINE_OBJECT_9](docs/INLINE_OBJECT_9.md)
 - [INLINE_RESPONSE_200](docs/INLINE_RESPONSE_200.md)
 - [INLINE_RESPONSE_200_1](docs/INLINE_RESPONSE_200_1.md)
 - [INLINE_RESPONSE_200_2](docs/INLINE_RESPONSE_200_2.md)
 - [INLINE_RESPONSE_200_3](docs/INLINE_RESPONSE_200_3.md)
 - [INLINE_RESPONSE_200_4](docs/INLINE_RESPONSE_200_4.md)
 - [INLINE_RESPONSE_200_5](docs/INLINE_RESPONSE_200_5.md)
 - [INLINE_RESPONSE_200_5_VEHICLE_STATS](docs/INLINE_RESPONSE_200_5_VEHICLE_STATS.md)
 - [INLINE_RESPONSE_200_6](docs/INLINE_RESPONSE_200_6.md)
 - [INLINE_RESPONSE_200_7](docs/INLINE_RESPONSE_200_7.md)
 - [INLINE_RESPONSE_200_8](docs/INLINE_RESPONSE_200_8.md)
 - [INLINE_RESPONSE_200_9](docs/INLINE_RESPONSE_200_9.md)
 - [JOB_STATUS](docs/JOB_STATUS.md)
 - [JOB_UPDATE_OBJECT](docs/JOB_UPDATE_OBJECT.md)
 - [MACHINE](docs/MACHINE.md)
 - [MACHINE_HISTORY_RESPONSE](docs/MACHINE_HISTORY_RESPONSE.md)
 - [MACHINE_HISTORY_RESPONSE_MACHINES](docs/MACHINE_HISTORY_RESPONSE_MACHINES.md)
 - [MACHINE_HISTORY_RESPONSE_VIBRATIONS](docs/MACHINE_HISTORY_RESPONSE_VIBRATIONS.md)
 - [PAGINATION](docs/PAGINATION.md)
 - [PREV_JOB_STATUS](docs/PREV_JOB_STATUS.md)
 - [SAFETY_REPORT_HARSH_EVENT](docs/SAFETY_REPORT_HARSH_EVENT.md)
 - [SENSOR](docs/SENSOR.md)
 - [SENSOR_HISTORY_RESPONSE](docs/SENSOR_HISTORY_RESPONSE.md)
 - [SENSOR_HISTORY_RESPONSE_RESULTS](docs/SENSOR_HISTORY_RESPONSE_RESULTS.md)
 - [TAG](docs/TAG.md)
 - [TAGGED_ADDRESS](docs/TAGGED_ADDRESS.md)
 - [TAGGED_ADDRESS_BASE](docs/TAGGED_ADDRESS_BASE.md)
 - [TAGGED_ASSET](docs/TAGGED_ASSET.md)
 - [TAGGED_ASSET_BASE](docs/TAGGED_ASSET_BASE.md)
 - [TAGGED_DRIVER](docs/TAGGED_DRIVER.md)
 - [TAGGED_DRIVER_BASE](docs/TAGGED_DRIVER_BASE.md)
 - [TAGGED_MACHINE](docs/TAGGED_MACHINE.md)
 - [TAGGED_MACHINE_BASE](docs/TAGGED_MACHINE_BASE.md)
 - [TAGGED_SENSOR](docs/TAGGED_SENSOR.md)
 - [TAGGED_SENSOR_BASE](docs/TAGGED_SENSOR_BASE.md)
 - [TAGGED_VEHICLE](docs/TAGGED_VEHICLE.md)
 - [TAGGED_VEHICLE_BASE](docs/TAGGED_VEHICLE_BASE.md)
 - [TAG_CREATE](docs/TAG_CREATE.md)
 - [TAG_METADATA](docs/TAG_METADATA.md)
 - [TAG_MODIFY](docs/TAG_MODIFY.md)
 - [TAG_MODIFY_ADD](docs/TAG_MODIFY_ADD.md)
 - [TAG_MODIFY_DELETE](docs/TAG_MODIFY_DELETE.md)
 - [TAG_UPDATE](docs/TAG_UPDATE.md)
 - [TEMPERATURE_RESPONSE](docs/TEMPERATURE_RESPONSE.md)
 - [TEMPERATURE_RESPONSE_SENSORS](docs/TEMPERATURE_RESPONSE_SENSORS.md)
 - [TRIP_RESPONSE](docs/TRIP_RESPONSE.md)
 - [TRIP_RESPONSE_END_COORDINATES](docs/TRIP_RESPONSE_END_COORDINATES.md)
 - [TRIP_RESPONSE_START_COORDINATES](docs/TRIP_RESPONSE_START_COORDINATES.md)
 - [TRIP_RESPONSE_TRIPS](docs/TRIP_RESPONSE_TRIPS.md)
 - [USER](docs/USER.md)
 - [USER_BASE](docs/USER_BASE.md)
 - [USER_ROLE](docs/USER_ROLE.md)
 - [USER_TAG_ROLE](docs/USER_TAG_ROLE.md)
 - [USER_TAG_ROLE_TAG](docs/USER_TAG_ROLE_TAG.md)
 - [VEHICLE](docs/VEHICLE.md)
 - [VEHICLE_HARSH_EVENT_RESPONSE](docs/VEHICLE_HARSH_EVENT_RESPONSE.md)
 - [VEHICLE_HARSH_EVENT_RESPONSE_LOCATION](docs/VEHICLE_HARSH_EVENT_RESPONSE_LOCATION.md)
 - [VEHICLE_LOCATION](docs/VEHICLE_LOCATION.md)
 - [VEHICLE_MAINTENANCE](docs/VEHICLE_MAINTENANCE.md)
 - [VEHICLE_MAINTENANCE_J1939](docs/VEHICLE_MAINTENANCE_J1939.md)
 - [VEHICLE_MAINTENANCE_J1939_CHECK_ENGINE_LIGHT](docs/VEHICLE_MAINTENANCE_J1939_CHECK_ENGINE_LIGHT.md)
 - [VEHICLE_MAINTENANCE_J1939_DIAGNOSTIC_TROUBLE_CODES](docs/VEHICLE_MAINTENANCE_J1939_DIAGNOSTIC_TROUBLE_CODES.md)
 - [VEHICLE_MAINTENANCE_PASSENGER](docs/VEHICLE_MAINTENANCE_PASSENGER.md)
 - [VEHICLE_MAINTENANCE_PASSENGER_CHECK_ENGINE_LIGHT](docs/VEHICLE_MAINTENANCE_PASSENGER_CHECK_ENGINE_LIGHT.md)
 - [VEHICLE_MAINTENANCE_PASSENGER_DIAGNOSTIC_TROUBLE_CODES](docs/VEHICLE_MAINTENANCE_PASSENGER_DIAGNOSTIC_TROUBLE_CODES.md)
 - [VEHICLE_SAFETY_SCORE_RESPONSE](docs/VEHICLE_SAFETY_SCORE_RESPONSE.md)
 - [_ADDRESSES_ADDRESSES](docs/_ADDRESSES_ADDRESSES.md)
 - [_SENSORS_HISTORY_SERIES](docs/_SENSORS_HISTORY_SERIES.md)


## Documentation For Authorization

 All endpoints do not require authorization.


## Author




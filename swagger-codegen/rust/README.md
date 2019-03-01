# Rust API client for samsara

# Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).

## Overview
This API client was generated by the [swagger-codegen](https://github.com/swagger-api/swagger-codegen) project.  By using the [swagger-spec](https://github.com/swagger-api/swagger-spec) from a remote server, you can easily generate an API client.

- API version: 1.0.0
- Package version: 1.0.0
- Build package: io.swagger.codegen.languages.RustClientCodegen

## Installation
Put the package under your project folder and add the following in import:
```
    "./samsara"
```

## Documentation for API Endpoints

All URIs are relative to *https://api.samsara.com/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AssetsApi* | [**get_all_asset_current_locations**](docs/AssetsApi.md#get_all_asset_current_locations) | **Get** /fleet/assets/locations | /fleet/assets/locations
*AssetsApi* | [**get_all_assets**](docs/AssetsApi.md#get_all_assets) | **Get** /fleet/assets | /fleet/assets
*AssetsApi* | [**get_asset_location**](docs/AssetsApi.md#get_asset_location) | **Get** /fleet/assets/{asset_id}/locations | /fleet/assets/{assetId:[0-9]+}/locations
*AssetsApi* | [**get_asset_reefer**](docs/AssetsApi.md#get_asset_reefer) | **Get** /fleet/assets/{asset_id}/reefer | /fleet/assets/{assetId:[0-9]+}/reefer
*DriversApi* | [**create_driver**](docs/DriversApi.md#create_driver) | **Post** /fleet/drivers/create | /fleet/drivers/create
*DriversApi* | [**deactivate_driver**](docs/DriversApi.md#deactivate_driver) | **Delete** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*DriversApi* | [**get_all_deactivated_drivers**](docs/DriversApi.md#get_all_deactivated_drivers) | **Get** /fleet/drivers/inactive | /fleet/drivers/inactive
*DriversApi* | [**get_deactivated_driver_by_id**](docs/DriversApi.md#get_deactivated_driver_by_id) | **Get** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*DriversApi* | [**get_driver_by_id**](docs/DriversApi.md#get_driver_by_id) | **Get** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*DriversApi* | [**reactivate_driver_by_id**](docs/DriversApi.md#reactivate_driver_by_id) | **Put** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*FleetApi* | [**add_fleet_address**](docs/FleetApi.md#add_fleet_address) | **Post** /fleet/add_address | /fleet/add_address
*FleetApi* | [**add_organization_addresses**](docs/FleetApi.md#add_organization_addresses) | **Post** /addresses | /addresses
*FleetApi* | [**create_dispatch_route**](docs/FleetApi.md#create_dispatch_route) | **Post** /fleet/dispatch/routes | /fleet/dispatch/routes
*FleetApi* | [**create_driver**](docs/FleetApi.md#create_driver) | **Post** /fleet/drivers/create | /fleet/drivers/create
*FleetApi* | [**create_driver_dispatch_route**](docs/FleetApi.md#create_driver_dispatch_route) | **Post** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
*FleetApi* | [**create_driver_document**](docs/FleetApi.md#create_driver_document) | **Post** /fleet/drivers/{driver_id}/documents | /fleet/drivers/{driver_id:[0-9]+}/documents
*FleetApi* | [**create_dvir**](docs/FleetApi.md#create_dvir) | **Post** /fleet/maintenance/dvirs | /fleet/maintenance/dvirs
*FleetApi* | [**create_vehicle_dispatch_route**](docs/FleetApi.md#create_vehicle_dispatch_route) | **Post** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
*FleetApi* | [**deactivate_driver**](docs/FleetApi.md#deactivate_driver) | **Delete** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*FleetApi* | [**delete_dispatch_route_by_id**](docs/FleetApi.md#delete_dispatch_route_by_id) | **Delete** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
*FleetApi* | [**delete_organization_address**](docs/FleetApi.md#delete_organization_address) | **Delete** /addresses/{addressId} | /addresses/{addressId}
*FleetApi* | [**fetch_all_dispatch_routes**](docs/FleetApi.md#fetch_all_dispatch_routes) | **Get** /fleet/dispatch/routes | /fleet/dispatch/routes
*FleetApi* | [**fetch_all_route_job_updates**](docs/FleetApi.md#fetch_all_route_job_updates) | **Get** /fleet/dispatch/routes/job_updates | /fleet/dispatch/routes/job_updates
*FleetApi* | [**get_all_asset_current_locations**](docs/FleetApi.md#get_all_asset_current_locations) | **Get** /fleet/assets/locations | /fleet/assets/locations
*FleetApi* | [**get_all_assets**](docs/FleetApi.md#get_all_assets) | **Get** /fleet/assets | /fleet/assets
*FleetApi* | [**get_all_deactivated_drivers**](docs/FleetApi.md#get_all_deactivated_drivers) | **Get** /fleet/drivers/inactive | /fleet/drivers/inactive
*FleetApi* | [**get_asset_location**](docs/FleetApi.md#get_asset_location) | **Get** /fleet/assets/{asset_id}/locations | /fleet/assets/{assetId:[0-9]+}/locations
*FleetApi* | [**get_asset_reefer**](docs/FleetApi.md#get_asset_reefer) | **Get** /fleet/assets/{asset_id}/reefer | /fleet/assets/{assetId:[0-9]+}/reefer
*FleetApi* | [**get_deactivated_driver_by_id**](docs/FleetApi.md#get_deactivated_driver_by_id) | **Get** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*FleetApi* | [**get_dispatch_route_by_id**](docs/FleetApi.md#get_dispatch_route_by_id) | **Get** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}
*FleetApi* | [**get_dispatch_route_history**](docs/FleetApi.md#get_dispatch_route_history) | **Get** /fleet/dispatch/routes/{route_id}/history | /fleet/dispatch/routes/{route_id:[0-9]+}/history
*FleetApi* | [**get_dispatch_routes_by_driver_id**](docs/FleetApi.md#get_dispatch_routes_by_driver_id) | **Get** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
*FleetApi* | [**get_dispatch_routes_by_vehicle_id**](docs/FleetApi.md#get_dispatch_routes_by_vehicle_id) | **Get** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
*FleetApi* | [**get_driver_by_id**](docs/FleetApi.md#get_driver_by_id) | **Get** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*FleetApi* | [**get_driver_document_types_by_org_id**](docs/FleetApi.md#get_driver_document_types_by_org_id) | **Get** /fleet/drivers/document_types | /fleet/drivers/document_types
*FleetApi* | [**get_driver_documents_by_org_id**](docs/FleetApi.md#get_driver_documents_by_org_id) | **Get** /fleet/drivers/documents | /fleet/drivers/documents
*FleetApi* | [**get_driver_safety_score**](docs/FleetApi.md#get_driver_safety_score) | **Get** /fleet/drivers/{driverId}/safety/score | /fleet/drivers/{driverId:[0-9]+}/safety/score
*FleetApi* | [**get_dvirs**](docs/FleetApi.md#get_dvirs) | **Get** /fleet/maintenance/dvirs | /fleet/maintenance/dvirs
*FleetApi* | [**get_fleet_drivers**](docs/FleetApi.md#get_fleet_drivers) | **Post** /fleet/drivers | /fleet/drivers
*FleetApi* | [**get_fleet_drivers_hos_daily_logs**](docs/FleetApi.md#get_fleet_drivers_hos_daily_logs) | **Post** /fleet/drivers/{driver_id}/hos_daily_logs | /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
*FleetApi* | [**get_fleet_drivers_summary**](docs/FleetApi.md#get_fleet_drivers_summary) | **Post** /fleet/drivers/summary | /fleet/drivers/summary
*FleetApi* | [**get_fleet_hos_authentication_logs**](docs/FleetApi.md#get_fleet_hos_authentication_logs) | **Post** /fleet/hos_authentication_logs | /fleet/hos_authentication_logs
*FleetApi* | [**get_fleet_hos_logs**](docs/FleetApi.md#get_fleet_hos_logs) | **Post** /fleet/hos_logs | /fleet/hos_logs
*FleetApi* | [**get_fleet_hos_logs_summary**](docs/FleetApi.md#get_fleet_hos_logs_summary) | **Post** /fleet/hos_logs_summary | /fleet/hos_logs_summary
*FleetApi* | [**get_fleet_locations**](docs/FleetApi.md#get_fleet_locations) | **Post** /fleet/locations | /fleet/locations
*FleetApi* | [**get_fleet_maintenance_list**](docs/FleetApi.md#get_fleet_maintenance_list) | **Post** /fleet/maintenance/list | /fleet/maintenance/list
*FleetApi* | [**get_fleet_trips**](docs/FleetApi.md#get_fleet_trips) | **Post** /fleet/trips | /fleet/trips
*FleetApi* | [**get_fleet_vehicle**](docs/FleetApi.md#get_fleet_vehicle) | **Get** /fleet/vehicles/{vehicle_id_or_external_id} | /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*FleetApi* | [**get_organization_address**](docs/FleetApi.md#get_organization_address) | **Get** /addresses/{addressId} | /addresses/{addressId}
*FleetApi* | [**get_organization_addresses**](docs/FleetApi.md#get_organization_addresses) | **Get** /addresses | /addresses
*FleetApi* | [**get_organization_contact**](docs/FleetApi.md#get_organization_contact) | **Get** /contacts/{contact_id} | /contacts/{contact_id}
*FleetApi* | [**get_vehicle_harsh_event**](docs/FleetApi.md#get_vehicle_harsh_event) | **Get** /fleet/vehicles/{vehicleId}/safety/harsh_event | /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
*FleetApi* | [**get_vehicle_locations**](docs/FleetApi.md#get_vehicle_locations) | **Get** /fleet/vehicles/{vehicle_id}/locations | /fleet/vehicles/{vehicle_id:[0-9]+}/locations
*FleetApi* | [**get_vehicle_safety_score**](docs/FleetApi.md#get_vehicle_safety_score) | **Get** /fleet/vehicles/{vehicleId}/safety/score | /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
*FleetApi* | [**get_vehicle_stats**](docs/FleetApi.md#get_vehicle_stats) | **Get** /fleet/vehicles/stats | /fleet/vehicles/stats
*FleetApi* | [**get_vehicles_locations**](docs/FleetApi.md#get_vehicles_locations) | **Get** /fleet/vehicles/locations | /fleet/vehicles/locations
*FleetApi* | [**list_contacts**](docs/FleetApi.md#list_contacts) | **Get** /contacts | /contacts
*FleetApi* | [**list_fleet**](docs/FleetApi.md#list_fleet) | **Post** /fleet/list | /fleet/list
*FleetApi* | [**patch_fleet_vehicle**](docs/FleetApi.md#patch_fleet_vehicle) | **Patch** /fleet/vehicles/{vehicle_id_or_external_id} | /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*FleetApi* | [**reactivate_driver_by_id**](docs/FleetApi.md#reactivate_driver_by_id) | **Put** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*FleetApi* | [**update_dispatch_route_by_id**](docs/FleetApi.md#update_dispatch_route_by_id) | **Put** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
*FleetApi* | [**update_organization_address**](docs/FleetApi.md#update_organization_address) | **Patch** /addresses/{addressId} | /addresses/{addressId}
*FleetApi* | [**update_vehicles**](docs/FleetApi.md#update_vehicles) | **Post** /fleet/set_data | /fleet/set_data
*IndustrialApi* | [**get_all_data_inputs**](docs/IndustrialApi.md#get_all_data_inputs) | **Get** /industrial/data | /industrial/data
*IndustrialApi* | [**get_data_input**](docs/IndustrialApi.md#get_data_input) | **Get** /industrial/data/{data_input_id} | /industrial/data/{data_input_id:[0-9]+}
*IndustrialApi* | [**get_machines**](docs/IndustrialApi.md#get_machines) | **Post** /machines/list | /machines/list
*IndustrialApi* | [**get_machines_history**](docs/IndustrialApi.md#get_machines_history) | **Post** /machines/history | /machines/history
*RoutesApi* | [**create_dispatch_route**](docs/RoutesApi.md#create_dispatch_route) | **Post** /fleet/dispatch/routes | /fleet/dispatch/routes
*RoutesApi* | [**create_driver_dispatch_route**](docs/RoutesApi.md#create_driver_dispatch_route) | **Post** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
*RoutesApi* | [**create_vehicle_dispatch_route**](docs/RoutesApi.md#create_vehicle_dispatch_route) | **Post** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
*RoutesApi* | [**delete_dispatch_route_by_id**](docs/RoutesApi.md#delete_dispatch_route_by_id) | **Delete** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
*RoutesApi* | [**fetch_all_dispatch_routes**](docs/RoutesApi.md#fetch_all_dispatch_routes) | **Get** /fleet/dispatch/routes | /fleet/dispatch/routes
*RoutesApi* | [**fetch_all_route_job_updates**](docs/RoutesApi.md#fetch_all_route_job_updates) | **Get** /fleet/dispatch/routes/job_updates | /fleet/dispatch/routes/job_updates
*RoutesApi* | [**get_dispatch_route_by_id**](docs/RoutesApi.md#get_dispatch_route_by_id) | **Get** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}
*RoutesApi* | [**get_dispatch_route_history**](docs/RoutesApi.md#get_dispatch_route_history) | **Get** /fleet/dispatch/routes/{route_id}/history | /fleet/dispatch/routes/{route_id:[0-9]+}/history
*RoutesApi* | [**get_dispatch_routes_by_driver_id**](docs/RoutesApi.md#get_dispatch_routes_by_driver_id) | **Get** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
*RoutesApi* | [**get_dispatch_routes_by_vehicle_id**](docs/RoutesApi.md#get_dispatch_routes_by_vehicle_id) | **Get** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
*RoutesApi* | [**update_dispatch_route_by_id**](docs/RoutesApi.md#update_dispatch_route_by_id) | **Put** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
*SafetyApi* | [**get_driver_safety_score**](docs/SafetyApi.md#get_driver_safety_score) | **Get** /fleet/drivers/{driverId}/safety/score | /fleet/drivers/{driverId:[0-9]+}/safety/score
*SafetyApi* | [**get_vehicle_harsh_event**](docs/SafetyApi.md#get_vehicle_harsh_event) | **Get** /fleet/vehicles/{vehicleId}/safety/harsh_event | /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
*SafetyApi* | [**get_vehicle_safety_score**](docs/SafetyApi.md#get_vehicle_safety_score) | **Get** /fleet/vehicles/{vehicleId}/safety/score | /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
*SensorsApi* | [**get_sensors**](docs/SensorsApi.md#get_sensors) | **Post** /sensors/list | /sensors/list
*SensorsApi* | [**get_sensors_cargo**](docs/SensorsApi.md#get_sensors_cargo) | **Post** /sensors/cargo | /sensors/cargo
*SensorsApi* | [**get_sensors_door**](docs/SensorsApi.md#get_sensors_door) | **Post** /sensors/door | /sensors/door
*SensorsApi* | [**get_sensors_history**](docs/SensorsApi.md#get_sensors_history) | **Post** /sensors/history | /sensors/history
*SensorsApi* | [**get_sensors_humidity**](docs/SensorsApi.md#get_sensors_humidity) | **Post** /sensors/humidity | /sensors/humidity
*SensorsApi* | [**get_sensors_temperature**](docs/SensorsApi.md#get_sensors_temperature) | **Post** /sensors/temperature | /sensors/temperature
*TagsApi* | [**create_tag**](docs/TagsApi.md#create_tag) | **Post** /tags | /tags
*TagsApi* | [**delete_tag_by_id**](docs/TagsApi.md#delete_tag_by_id) | **Delete** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
*TagsApi* | [**get_all_tags**](docs/TagsApi.md#get_all_tags) | **Get** /tags | /tags
*TagsApi* | [**get_tag_by_id**](docs/TagsApi.md#get_tag_by_id) | **Get** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
*TagsApi* | [**modify_tag_by_id**](docs/TagsApi.md#modify_tag_by_id) | **Patch** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
*TagsApi* | [**update_tag_by_id**](docs/TagsApi.md#update_tag_by_id) | **Put** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
*UsersApi* | [**delete_user_by_id**](docs/UsersApi.md#delete_user_by_id) | **Delete** /users/{userId} | /users/{userId:[0-9]+}
*UsersApi* | [**get_user_by_id**](docs/UsersApi.md#get_user_by_id) | **Get** /users/{userId} | /users/{userId:[0-9]+}
*UsersApi* | [**list_user_roles**](docs/UsersApi.md#list_user_roles) | **Get** /user_roles | /user_roles
*UsersApi* | [**list_users**](docs/UsersApi.md#list_users) | **Get** /users | /users


## Documentation For Models

 - [Address](docs/Address.md)
 - [AddressGeofence](docs/AddressGeofence.md)
 - [AddressGeofenceCircle](docs/AddressGeofenceCircle.md)
 - [AddressGeofencePolygon](docs/AddressGeofencePolygon.md)
 - [AddressGeofencePolygonVertices](docs/AddressGeofencePolygonVertices.md)
 - [AddressNotes](docs/AddressNotes.md)
 - [AddressParam](docs/AddressParam.md)
 - [Addresses](docs/Addresses.md)
 - [AddressesAddresses](docs/AddressesAddresses.md)
 - [AllRouteJobUpdates](docs/AllRouteJobUpdates.md)
 - [Asset](docs/Asset.md)
 - [AssetCable](docs/AssetCable.md)
 - [AssetCurrentLocation](docs/AssetCurrentLocation.md)
 - [AssetCurrentLocationsResponse](docs/AssetCurrentLocationsResponse.md)
 - [AssetLocationResponse](docs/AssetLocationResponse.md)
 - [AssetLocationResponseInner](docs/AssetLocationResponseInner.md)
 - [AssetReeferResponse](docs/AssetReeferResponse.md)
 - [AssetReeferResponseReeferStats](docs/AssetReeferResponseReeferStats.md)
 - [AssetReeferResponseReeferStatsAlarms](docs/AssetReeferResponseReeferStatsAlarms.md)
 - [AssetReeferResponseReeferStatsAlarms1](docs/AssetReeferResponseReeferStatsAlarms1.md)
 - [AssetReeferResponseReeferStatsEngineHours](docs/AssetReeferResponseReeferStatsEngineHours.md)
 - [AssetReeferResponseReeferStatsFuelPercentage](docs/AssetReeferResponseReeferStatsFuelPercentage.md)
 - [AssetReeferResponseReeferStatsPowerStatus](docs/AssetReeferResponseReeferStatsPowerStatus.md)
 - [AssetReeferResponseReeferStatsReturnAirTemp](docs/AssetReeferResponseReeferStatsReturnAirTemp.md)
 - [AssetReeferResponseReeferStatsSetPoint](docs/AssetReeferResponseReeferStatsSetPoint.md)
 - [AuxInput](docs/AuxInput.md)
 - [AuxInputSeries](docs/AuxInputSeries.md)
 - [CargoResponse](docs/CargoResponse.md)
 - [CargoResponseSensors](docs/CargoResponseSensors.md)
 - [Contact](docs/Contact.md)
 - [ContactIds](docs/ContactIds.md)
 - [CreateDvirParam](docs/CreateDvirParam.md)
 - [CurrentDriver](docs/CurrentDriver.md)
 - [Data](docs/Data.md)
 - [DataInputHistoryResponse](docs/DataInputHistoryResponse.md)
 - [DataInputHistoryResponsePoints](docs/DataInputHistoryResponsePoints.md)
 - [DispatchJobCreate](docs/DispatchJobCreate.md)
 - [DispatchRouteBase](docs/DispatchRouteBase.md)
 - [DispatchRouteHistoricalEntry](docs/DispatchRouteHistoricalEntry.md)
 - [DispatchRouteHistory](docs/DispatchRouteHistory.md)
 - [DispatchRoutes](docs/DispatchRoutes.md)
 - [DocumentBase](docs/DocumentBase.md)
 - [DocumentFieldCreate](docs/DocumentFieldCreate.md)
 - [DocumentFieldCreatePhotoValue](docs/DocumentFieldCreatePhotoValue.md)
 - [DocumentFieldType](docs/DocumentFieldType.md)
 - [DocumentFieldTypeNumberValueTypeMetadata](docs/DocumentFieldTypeNumberValueTypeMetadata.md)
 - [DocumentFieldTypes](docs/DocumentFieldTypes.md)
 - [DocumentType](docs/DocumentType.md)
 - [DocumentTypes](docs/DocumentTypes.md)
 - [Documents](docs/Documents.md)
 - [DoorResponse](docs/DoorResponse.md)
 - [DoorResponseSensors](docs/DoorResponseSensors.md)
 - [DriverBase](docs/DriverBase.md)
 - [DriverDailyLogResponse](docs/DriverDailyLogResponse.md)
 - [DriverDailyLogResponseDays](docs/DriverDailyLogResponseDays.md)
 - [DriverSafetyScoreResponse](docs/DriverSafetyScoreResponse.md)
 - [DriversResponse](docs/DriversResponse.md)
 - [DriversSummaryParam](docs/DriversSummaryParam.md)
 - [DriversSummaryResponse](docs/DriversSummaryResponse.md)
 - [DriversSummaryResponseSummaries](docs/DriversSummaryResponseSummaries.md)
 - [DvirBase](docs/DvirBase.md)
 - [DvirBaseAuthorSignature](docs/DvirBaseAuthorSignature.md)
 - [DvirBaseMechanicOrAgentSignature](docs/DvirBaseMechanicOrAgentSignature.md)
 - [DvirBaseNextDriverSignature](docs/DvirBaseNextDriverSignature.md)
 - [DvirBaseTrailerDefects](docs/DvirBaseTrailerDefects.md)
 - [DvirBaseVehicle](docs/DvirBaseVehicle.md)
 - [DvirListResponse](docs/DvirListResponse.md)
 - [EngineState](docs/EngineState.md)
 - [ErrorResponse](docs/ErrorResponse.md)
 - [FleetVehicleLocation](docs/FleetVehicleLocation.md)
 - [FleetVehicleLocations](docs/FleetVehicleLocations.md)
 - [FleetVehicleResponse](docs/FleetVehicleResponse.md)
 - [FleetVehicleResponseVehicleInfo](docs/FleetVehicleResponseVehicleInfo.md)
 - [FleetVehiclesLocations](docs/FleetVehiclesLocations.md)
 - [FleetVehiclesLocationsInner](docs/FleetVehiclesLocationsInner.md)
 - [GroupDriversParam](docs/GroupDriversParam.md)
 - [GroupParam](docs/GroupParam.md)
 - [HistoryParam](docs/HistoryParam.md)
 - [HistoryParam1](docs/HistoryParam1.md)
 - [HosAuthenticationLogsParam](docs/HosAuthenticationLogsParam.md)
 - [HosAuthenticationLogsResponse](docs/HosAuthenticationLogsResponse.md)
 - [HosAuthenticationLogsResponseAuthenticationLogs](docs/HosAuthenticationLogsResponseAuthenticationLogs.md)
 - [HosLogsParam](docs/HosLogsParam.md)
 - [HosLogsParam1](docs/HosLogsParam1.md)
 - [HosLogsParam2](docs/HosLogsParam2.md)
 - [HosLogsResponse](docs/HosLogsResponse.md)
 - [HosLogsResponseLogs](docs/HosLogsResponseLogs.md)
 - [HosLogsSummaryResponse](docs/HosLogsSummaryResponse.md)
 - [HosLogsSummaryResponseDrivers](docs/HosLogsSummaryResponseDrivers.md)
 - [HumidityResponse](docs/HumidityResponse.md)
 - [HumidityResponseSensors](docs/HumidityResponseSensors.md)
 - [InlineResponse200](docs/InlineResponse200.md)
 - [InlineResponse2001](docs/InlineResponse2001.md)
 - [InlineResponse2002](docs/InlineResponse2002.md)
 - [InlineResponse2003](docs/InlineResponse2003.md)
 - [InlineResponse2004](docs/InlineResponse2004.md)
 - [InlineResponse2005](docs/InlineResponse2005.md)
 - [InlineResponse2005VehicleStats](docs/InlineResponse2005VehicleStats.md)
 - [InlineResponse2006](docs/InlineResponse2006.md)
 - [InlineResponse2007](docs/InlineResponse2007.md)
 - [InlineResponse2008](docs/InlineResponse2008.md)
 - [InlineResponse2009](docs/InlineResponse2009.md)
 - [JobStatus](docs/JobStatus.md)
 - [JobUpdateObject](docs/JobUpdateObject.md)
 - [Machine](docs/Machine.md)
 - [MachineHistoryResponse](docs/MachineHistoryResponse.md)
 - [MachineHistoryResponseMachines](docs/MachineHistoryResponseMachines.md)
 - [MachineHistoryResponseVibrations](docs/MachineHistoryResponseVibrations.md)
 - [Pagination](docs/Pagination.md)
 - [PrevJobStatus](docs/PrevJobStatus.md)
 - [ReactivateDriverParam](docs/ReactivateDriverParam.md)
 - [SafetyReportHarshEvent](docs/SafetyReportHarshEvent.md)
 - [Sensor](docs/Sensor.md)
 - [SensorHistoryResponse](docs/SensorHistoryResponse.md)
 - [SensorHistoryResponseResults](docs/SensorHistoryResponseResults.md)
 - [SensorParam](docs/SensorParam.md)
 - [SensorshistorySeries](docs/SensorshistorySeries.md)
 - [Tag](docs/Tag.md)
 - [TagCreate](docs/TagCreate.md)
 - [TagIds](docs/TagIds.md)
 - [TagMetadata](docs/TagMetadata.md)
 - [TagModify](docs/TagModify.md)
 - [TagModifyAdd](docs/TagModifyAdd.md)
 - [TagModifyDelete](docs/TagModifyDelete.md)
 - [TagUpdate](docs/TagUpdate.md)
 - [TaggedAddressBase](docs/TaggedAddressBase.md)
 - [TaggedAssetBase](docs/TaggedAssetBase.md)
 - [TaggedDriverBase](docs/TaggedDriverBase.md)
 - [TaggedMachineBase](docs/TaggedMachineBase.md)
 - [TaggedSensorBase](docs/TaggedSensorBase.md)
 - [TaggedVehicleBase](docs/TaggedVehicleBase.md)
 - [TemperatureResponse](docs/TemperatureResponse.md)
 - [TemperatureResponseSensors](docs/TemperatureResponseSensors.md)
 - [TripResponse](docs/TripResponse.md)
 - [TripResponseEndCoordinates](docs/TripResponseEndCoordinates.md)
 - [TripResponseStartCoordinates](docs/TripResponseStartCoordinates.md)
 - [TripResponseTrips](docs/TripResponseTrips.md)
 - [TripsParam](docs/TripsParam.md)
 - [UserBase](docs/UserBase.md)
 - [UserRole](docs/UserRole.md)
 - [UserTagRole](docs/UserTagRole.md)
 - [UserTagRoleTag](docs/UserTagRoleTag.md)
 - [Vehicle](docs/Vehicle.md)
 - [VehicleHarshEventResponse](docs/VehicleHarshEventResponse.md)
 - [VehicleHarshEventResponseLocation](docs/VehicleHarshEventResponseLocation.md)
 - [VehicleLocation](docs/VehicleLocation.md)
 - [VehicleMaintenance](docs/VehicleMaintenance.md)
 - [VehicleMaintenanceJ1939](docs/VehicleMaintenanceJ1939.md)
 - [VehicleMaintenanceJ1939CheckEngineLight](docs/VehicleMaintenanceJ1939CheckEngineLight.md)
 - [VehicleMaintenanceJ1939DiagnosticTroubleCodes](docs/VehicleMaintenanceJ1939DiagnosticTroubleCodes.md)
 - [VehicleMaintenancePassenger](docs/VehicleMaintenancePassenger.md)
 - [VehicleMaintenancePassengerCheckEngineLight](docs/VehicleMaintenancePassengerCheckEngineLight.md)
 - [VehicleMaintenancePassengerDiagnosticTroubleCodes](docs/VehicleMaintenancePassengerDiagnosticTroubleCodes.md)
 - [VehicleSafetyScoreResponse](docs/VehicleSafetyScoreResponse.md)
 - [VehicleUpdateParam](docs/VehicleUpdateParam.md)
 - [DispatchJob](docs/DispatchJob.md)
 - [DispatchRoute](docs/DispatchRoute.md)
 - [DispatchRouteCreate](docs/DispatchRouteCreate.md)
 - [Document](docs/Document.md)
 - [DocumentCreate](docs/DocumentCreate.md)
 - [DocumentField](docs/DocumentField.md)
 - [Driver](docs/Driver.md)
 - [DriverForCreate](docs/DriverForCreate.md)
 - [TaggedAddress](docs/TaggedAddress.md)
 - [TaggedAsset](docs/TaggedAsset.md)
 - [TaggedDriver](docs/TaggedDriver.md)
 - [TaggedMachine](docs/TaggedMachine.md)
 - [TaggedSensor](docs/TaggedSensor.md)
 - [TaggedVehicle](docs/TaggedVehicle.md)
 - [User](docs/User.md)


## Documentation For Authorization
 Endpoints do not require authorization.


## Author




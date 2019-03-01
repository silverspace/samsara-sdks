# org.openapitools.server - Kotlin Server library for Samsara API

# Introduction

Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.

The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.

API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.

If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)

# Endpoints

All our APIs can be accessed through HTTP requests to URLs like:

&#x60;&#x60;&#x60;curl
https://api.samsara.com/&lt;version&gt;/&lt;endpoint&gt;
&#x60;&#x60;&#x60;

All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.

# Authentication

To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under &#x60;Settings-&gt;Organization-&gt;API Tokens&#x60;.

Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.

Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.

&#x60;&#x60;&#x60;curl
https://api.samsara.com/&lt;version&gt;/&lt;endpoint&gt;?access_token&#x3D;{access_token}
&#x60;&#x60;&#x60;

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

All our APIs are versioned. Our current API version is &#x60;v1&#x60; and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.

# FAQs

Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).

Generated by OpenAPI Generator 4.0.0-SNAPSHOT.

## Requires

* Kotlin 1.2.10
* Gradle 4.3

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Running

The server builds as a fat jar with a main entrypoint. To start the service, run `java -jar ./build/libs/kotlin-server.jar`.

You may also run in docker:

```
docker build -t kotlin-server .
docker run -p 8080:8080 kotlin-server
```

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs (see ktor documentation for more info).
* ~Supports collection formats for query parameters: csv, tsv, ssv, pipes.~
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://api.samsara.com/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AssetsApi* | [**getAllAssetCurrentLocations**](docs/AssetsApi.md#getallassetcurrentlocations) | **GET** /fleet/assets/locations | /fleet/assets/locations
*AssetsApi* | [**getAllAssets**](docs/AssetsApi.md#getallassets) | **GET** /fleet/assets | /fleet/assets
*AssetsApi* | [**getAssetLocation**](docs/AssetsApi.md#getassetlocation) | **GET** /fleet/assets/{asset_id}/locations | /fleet/assets/{assetId:[0-9]+}/locations
*AssetsApi* | [**getAssetReefer**](docs/AssetsApi.md#getassetreefer) | **GET** /fleet/assets/{asset_id}/reefer | /fleet/assets/{assetId:[0-9]+}/reefer
*DriversApi* | [**createDriver**](docs/DriversApi.md#createdriver) | **POST** /fleet/drivers/create | /fleet/drivers/create
*DriversApi* | [**deactivateDriver**](docs/DriversApi.md#deactivatedriver) | **DELETE** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*DriversApi* | [**getAllDeactivatedDrivers**](docs/DriversApi.md#getalldeactivateddrivers) | **GET** /fleet/drivers/inactive | /fleet/drivers/inactive
*DriversApi* | [**getDeactivatedDriverById**](docs/DriversApi.md#getdeactivateddriverbyid) | **GET** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*DriversApi* | [**getDriverById**](docs/DriversApi.md#getdriverbyid) | **GET** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*DriversApi* | [**reactivateDriverById**](docs/DriversApi.md#reactivatedriverbyid) | **PUT** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*FleetApi* | [**addFleetAddress**](docs/FleetApi.md#addfleetaddress) | **POST** /fleet/add_address | /fleet/add_address
*FleetApi* | [**addOrganizationAddresses**](docs/FleetApi.md#addorganizationaddresses) | **POST** /addresses | /addresses
*FleetApi* | [**createDispatchRoute**](docs/FleetApi.md#createdispatchroute) | **POST** /fleet/dispatch/routes | /fleet/dispatch/routes
*FleetApi* | [**createDriver**](docs/FleetApi.md#createdriver) | **POST** /fleet/drivers/create | /fleet/drivers/create
*FleetApi* | [**createDriverDispatchRoute**](docs/FleetApi.md#createdriverdispatchroute) | **POST** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
*FleetApi* | [**createDriverDocument**](docs/FleetApi.md#createdriverdocument) | **POST** /fleet/drivers/{driver_id}/documents | /fleet/drivers/{driver_id:[0-9]+}/documents
*FleetApi* | [**createDvir**](docs/FleetApi.md#createdvir) | **POST** /fleet/maintenance/dvirs | /fleet/maintenance/dvirs
*FleetApi* | [**createVehicleDispatchRoute**](docs/FleetApi.md#createvehicledispatchroute) | **POST** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
*FleetApi* | [**deactivateDriver**](docs/FleetApi.md#deactivatedriver) | **DELETE** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*FleetApi* | [**deleteDispatchRouteById**](docs/FleetApi.md#deletedispatchroutebyid) | **DELETE** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
*FleetApi* | [**deleteOrganizationAddress**](docs/FleetApi.md#deleteorganizationaddress) | **DELETE** /addresses/{addressId} | /addresses/{addressId}
*FleetApi* | [**fetchAllDispatchRoutes**](docs/FleetApi.md#fetchalldispatchroutes) | **GET** /fleet/dispatch/routes | /fleet/dispatch/routes
*FleetApi* | [**fetchAllRouteJobUpdates**](docs/FleetApi.md#fetchallroutejobupdates) | **GET** /fleet/dispatch/routes/job_updates | /fleet/dispatch/routes/job_updates
*FleetApi* | [**getAllAssetCurrentLocations**](docs/FleetApi.md#getallassetcurrentlocations) | **GET** /fleet/assets/locations | /fleet/assets/locations
*FleetApi* | [**getAllAssets**](docs/FleetApi.md#getallassets) | **GET** /fleet/assets | /fleet/assets
*FleetApi* | [**getAllDeactivatedDrivers**](docs/FleetApi.md#getalldeactivateddrivers) | **GET** /fleet/drivers/inactive | /fleet/drivers/inactive
*FleetApi* | [**getAssetLocation**](docs/FleetApi.md#getassetlocation) | **GET** /fleet/assets/{asset_id}/locations | /fleet/assets/{assetId:[0-9]+}/locations
*FleetApi* | [**getAssetReefer**](docs/FleetApi.md#getassetreefer) | **GET** /fleet/assets/{asset_id}/reefer | /fleet/assets/{assetId:[0-9]+}/reefer
*FleetApi* | [**getDeactivatedDriverById**](docs/FleetApi.md#getdeactivateddriverbyid) | **GET** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*FleetApi* | [**getDispatchRouteById**](docs/FleetApi.md#getdispatchroutebyid) | **GET** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}
*FleetApi* | [**getDispatchRouteHistory**](docs/FleetApi.md#getdispatchroutehistory) | **GET** /fleet/dispatch/routes/{route_id}/history | /fleet/dispatch/routes/{route_id:[0-9]+}/history
*FleetApi* | [**getDispatchRoutesByDriverId**](docs/FleetApi.md#getdispatchroutesbydriverid) | **GET** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
*FleetApi* | [**getDispatchRoutesByVehicleId**](docs/FleetApi.md#getdispatchroutesbyvehicleid) | **GET** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
*FleetApi* | [**getDriverById**](docs/FleetApi.md#getdriverbyid) | **GET** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*FleetApi* | [**getDriverDocumentTypesByOrgId**](docs/FleetApi.md#getdriverdocumenttypesbyorgid) | **GET** /fleet/drivers/document_types | /fleet/drivers/document_types
*FleetApi* | [**getDriverDocumentsByOrgId**](docs/FleetApi.md#getdriverdocumentsbyorgid) | **GET** /fleet/drivers/documents | /fleet/drivers/documents
*FleetApi* | [**getDriverSafetyScore**](docs/FleetApi.md#getdriversafetyscore) | **GET** /fleet/drivers/{driverId}/safety/score | /fleet/drivers/{driverId:[0-9]+}/safety/score
*FleetApi* | [**getDvirs**](docs/FleetApi.md#getdvirs) | **GET** /fleet/maintenance/dvirs | /fleet/maintenance/dvirs
*FleetApi* | [**getFleetDrivers**](docs/FleetApi.md#getfleetdrivers) | **POST** /fleet/drivers | /fleet/drivers
*FleetApi* | [**getFleetDriversHosDailyLogs**](docs/FleetApi.md#getfleetdrivershosdailylogs) | **POST** /fleet/drivers/{driver_id}/hos_daily_logs | /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
*FleetApi* | [**getFleetDriversSummary**](docs/FleetApi.md#getfleetdriverssummary) | **POST** /fleet/drivers/summary | /fleet/drivers/summary
*FleetApi* | [**getFleetHosAuthenticationLogs**](docs/FleetApi.md#getfleethosauthenticationlogs) | **POST** /fleet/hos_authentication_logs | /fleet/hos_authentication_logs
*FleetApi* | [**getFleetHosLogs**](docs/FleetApi.md#getfleethoslogs) | **POST** /fleet/hos_logs | /fleet/hos_logs
*FleetApi* | [**getFleetHosLogsSummary**](docs/FleetApi.md#getfleethoslogssummary) | **POST** /fleet/hos_logs_summary | /fleet/hos_logs_summary
*FleetApi* | [**getFleetLocations**](docs/FleetApi.md#getfleetlocations) | **POST** /fleet/locations | /fleet/locations
*FleetApi* | [**getFleetMaintenanceList**](docs/FleetApi.md#getfleetmaintenancelist) | **POST** /fleet/maintenance/list | /fleet/maintenance/list
*FleetApi* | [**getFleetTrips**](docs/FleetApi.md#getfleettrips) | **POST** /fleet/trips | /fleet/trips
*FleetApi* | [**getFleetVehicle**](docs/FleetApi.md#getfleetvehicle) | **GET** /fleet/vehicles/{vehicle_id_or_external_id} | /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*FleetApi* | [**getOrganizationAddress**](docs/FleetApi.md#getorganizationaddress) | **GET** /addresses/{addressId} | /addresses/{addressId}
*FleetApi* | [**getOrganizationAddresses**](docs/FleetApi.md#getorganizationaddresses) | **GET** /addresses | /addresses
*FleetApi* | [**getOrganizationContact**](docs/FleetApi.md#getorganizationcontact) | **GET** /contacts/{contact_id} | /contacts/{contact_id}
*FleetApi* | [**getVehicleHarshEvent**](docs/FleetApi.md#getvehicleharshevent) | **GET** /fleet/vehicles/{vehicleId}/safety/harsh_event | /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
*FleetApi* | [**getVehicleLocations**](docs/FleetApi.md#getvehiclelocations) | **GET** /fleet/vehicles/{vehicle_id}/locations | /fleet/vehicles/{vehicle_id:[0-9]+}/locations
*FleetApi* | [**getVehicleSafetyScore**](docs/FleetApi.md#getvehiclesafetyscore) | **GET** /fleet/vehicles/{vehicleId}/safety/score | /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
*FleetApi* | [**getVehicleStats**](docs/FleetApi.md#getvehiclestats) | **GET** /fleet/vehicles/stats | /fleet/vehicles/stats
*FleetApi* | [**getVehiclesLocations**](docs/FleetApi.md#getvehicleslocations) | **GET** /fleet/vehicles/locations | /fleet/vehicles/locations
*FleetApi* | [**listContacts**](docs/FleetApi.md#listcontacts) | **GET** /contacts | /contacts
*FleetApi* | [**listFleet**](docs/FleetApi.md#listfleet) | **POST** /fleet/list | /fleet/list
*FleetApi* | [**patchFleetVehicle**](docs/FleetApi.md#patchfleetvehicle) | **PATCH** /fleet/vehicles/{vehicle_id_or_external_id} | /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*FleetApi* | [**reactivateDriverById**](docs/FleetApi.md#reactivatedriverbyid) | **PUT** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*FleetApi* | [**updateDispatchRouteById**](docs/FleetApi.md#updatedispatchroutebyid) | **PUT** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
*FleetApi* | [**updateOrganizationAddress**](docs/FleetApi.md#updateorganizationaddress) | **PATCH** /addresses/{addressId} | /addresses/{addressId}
*FleetApi* | [**updateVehicles**](docs/FleetApi.md#updatevehicles) | **POST** /fleet/set_data | /fleet/set_data
*IndustrialApi* | [**getAllDataInputs**](docs/IndustrialApi.md#getalldatainputs) | **GET** /industrial/data | /industrial/data
*IndustrialApi* | [**getDataInput**](docs/IndustrialApi.md#getdatainput) | **GET** /industrial/data/{data_input_id} | /industrial/data/{data_input_id:[0-9]+}
*IndustrialApi* | [**getMachines**](docs/IndustrialApi.md#getmachines) | **POST** /machines/list | /machines/list
*IndustrialApi* | [**getMachinesHistory**](docs/IndustrialApi.md#getmachineshistory) | **POST** /machines/history | /machines/history
*RoutesApi* | [**createDispatchRoute**](docs/RoutesApi.md#createdispatchroute) | **POST** /fleet/dispatch/routes | /fleet/dispatch/routes
*RoutesApi* | [**createDriverDispatchRoute**](docs/RoutesApi.md#createdriverdispatchroute) | **POST** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
*RoutesApi* | [**createVehicleDispatchRoute**](docs/RoutesApi.md#createvehicledispatchroute) | **POST** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
*RoutesApi* | [**deleteDispatchRouteById**](docs/RoutesApi.md#deletedispatchroutebyid) | **DELETE** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
*RoutesApi* | [**fetchAllDispatchRoutes**](docs/RoutesApi.md#fetchalldispatchroutes) | **GET** /fleet/dispatch/routes | /fleet/dispatch/routes
*RoutesApi* | [**fetchAllRouteJobUpdates**](docs/RoutesApi.md#fetchallroutejobupdates) | **GET** /fleet/dispatch/routes/job_updates | /fleet/dispatch/routes/job_updates
*RoutesApi* | [**getDispatchRouteById**](docs/RoutesApi.md#getdispatchroutebyid) | **GET** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}
*RoutesApi* | [**getDispatchRouteHistory**](docs/RoutesApi.md#getdispatchroutehistory) | **GET** /fleet/dispatch/routes/{route_id}/history | /fleet/dispatch/routes/{route_id:[0-9]+}/history
*RoutesApi* | [**getDispatchRoutesByDriverId**](docs/RoutesApi.md#getdispatchroutesbydriverid) | **GET** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
*RoutesApi* | [**getDispatchRoutesByVehicleId**](docs/RoutesApi.md#getdispatchroutesbyvehicleid) | **GET** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
*RoutesApi* | [**updateDispatchRouteById**](docs/RoutesApi.md#updatedispatchroutebyid) | **PUT** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
*SafetyApi* | [**getDriverSafetyScore**](docs/SafetyApi.md#getdriversafetyscore) | **GET** /fleet/drivers/{driverId}/safety/score | /fleet/drivers/{driverId:[0-9]+}/safety/score
*SafetyApi* | [**getVehicleHarshEvent**](docs/SafetyApi.md#getvehicleharshevent) | **GET** /fleet/vehicles/{vehicleId}/safety/harsh_event | /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
*SafetyApi* | [**getVehicleSafetyScore**](docs/SafetyApi.md#getvehiclesafetyscore) | **GET** /fleet/vehicles/{vehicleId}/safety/score | /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
*SensorsApi* | [**getSensors**](docs/SensorsApi.md#getsensors) | **POST** /sensors/list | /sensors/list
*SensorsApi* | [**getSensorsCargo**](docs/SensorsApi.md#getsensorscargo) | **POST** /sensors/cargo | /sensors/cargo
*SensorsApi* | [**getSensorsDoor**](docs/SensorsApi.md#getsensorsdoor) | **POST** /sensors/door | /sensors/door
*SensorsApi* | [**getSensorsHistory**](docs/SensorsApi.md#getsensorshistory) | **POST** /sensors/history | /sensors/history
*SensorsApi* | [**getSensorsHumidity**](docs/SensorsApi.md#getsensorshumidity) | **POST** /sensors/humidity | /sensors/humidity
*SensorsApi* | [**getSensorsTemperature**](docs/SensorsApi.md#getsensorstemperature) | **POST** /sensors/temperature | /sensors/temperature
*TagsApi* | [**createTag**](docs/TagsApi.md#createtag) | **POST** /tags | /tags
*TagsApi* | [**deleteTagById**](docs/TagsApi.md#deletetagbyid) | **DELETE** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
*TagsApi* | [**getAllTags**](docs/TagsApi.md#getalltags) | **GET** /tags | /tags
*TagsApi* | [**getTagById**](docs/TagsApi.md#gettagbyid) | **GET** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
*TagsApi* | [**modifyTagById**](docs/TagsApi.md#modifytagbyid) | **PATCH** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
*TagsApi* | [**updateTagById**](docs/TagsApi.md#updatetagbyid) | **PUT** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
*UsersApi* | [**deleteUserById**](docs/UsersApi.md#deleteuserbyid) | **DELETE** /users/{userId} | /users/{userId:[0-9]+}
*UsersApi* | [**getUserById**](docs/UsersApi.md#getuserbyid) | **GET** /users/{userId} | /users/{userId:[0-9]+}
*UsersApi* | [**listUserRoles**](docs/UsersApi.md#listuserroles) | **GET** /user_roles | /user_roles
*UsersApi* | [**listUsers**](docs/UsersApi.md#listusers) | **GET** /users | /users


<a name="documentation-for-models"></a>
## Documentation for Models

 - [org.openapitools.server.models.Address](docs/Address.md)
 - [org.openapitools.server.models.AddressGeofence](docs/AddressGeofence.md)
 - [org.openapitools.server.models.AddressGeofenceCircle](docs/AddressGeofenceCircle.md)
 - [org.openapitools.server.models.AddressGeofencePolygon](docs/AddressGeofencePolygon.md)
 - [org.openapitools.server.models.AddressGeofencePolygonVertices](docs/AddressGeofencePolygonVertices.md)
 - [org.openapitools.server.models.AddressesAddresses](docs/AddressesAddresses.md)
 - [org.openapitools.server.models.AllRouteJobUpdates](docs/AllRouteJobUpdates.md)
 - [org.openapitools.server.models.Asset](docs/Asset.md)
 - [org.openapitools.server.models.AssetCable](docs/AssetCable.md)
 - [org.openapitools.server.models.AssetCurrentLocation](docs/AssetCurrentLocation.md)
 - [org.openapitools.server.models.AssetCurrentLocationsResponse](docs/AssetCurrentLocationsResponse.md)
 - [org.openapitools.server.models.AssetReeferResponse](docs/AssetReeferResponse.md)
 - [org.openapitools.server.models.AssetReeferResponseReeferStats](docs/AssetReeferResponseReeferStats.md)
 - [org.openapitools.server.models.AssetReeferResponseReeferStatsAlarms](docs/AssetReeferResponseReeferStatsAlarms.md)
 - [org.openapitools.server.models.AssetReeferResponseReeferStatsAlarms1](docs/AssetReeferResponseReeferStatsAlarms1.md)
 - [org.openapitools.server.models.AssetReeferResponseReeferStatsEngineHours](docs/AssetReeferResponseReeferStatsEngineHours.md)
 - [org.openapitools.server.models.AssetReeferResponseReeferStatsFuelPercentage](docs/AssetReeferResponseReeferStatsFuelPercentage.md)
 - [org.openapitools.server.models.AssetReeferResponseReeferStatsPowerStatus](docs/AssetReeferResponseReeferStatsPowerStatus.md)
 - [org.openapitools.server.models.AssetReeferResponseReeferStatsReturnAirTemp](docs/AssetReeferResponseReeferStatsReturnAirTemp.md)
 - [org.openapitools.server.models.AssetReeferResponseReeferStatsSetPoint](docs/AssetReeferResponseReeferStatsSetPoint.md)
 - [org.openapitools.server.models.AuxInput](docs/AuxInput.md)
 - [org.openapitools.server.models.AuxInputSeries](docs/AuxInputSeries.md)
 - [org.openapitools.server.models.CargoResponse](docs/CargoResponse.md)
 - [org.openapitools.server.models.CargoResponseSensors](docs/CargoResponseSensors.md)
 - [org.openapitools.server.models.Contact](docs/Contact.md)
 - [org.openapitools.server.models.CurrentDriver](docs/CurrentDriver.md)
 - [org.openapitools.server.models.DataInputHistoryResponse](docs/DataInputHistoryResponse.md)
 - [org.openapitools.server.models.DataInputHistoryResponsePoints](docs/DataInputHistoryResponsePoints.md)
 - [org.openapitools.server.models.DispatchJob](docs/DispatchJob.md)
 - [org.openapitools.server.models.DispatchJobCreate](docs/DispatchJobCreate.md)
 - [org.openapitools.server.models.DispatchRoute](docs/DispatchRoute.md)
 - [org.openapitools.server.models.DispatchRouteBase](docs/DispatchRouteBase.md)
 - [org.openapitools.server.models.DispatchRouteCreate](docs/DispatchRouteCreate.md)
 - [org.openapitools.server.models.DispatchRouteHistoricalEntry](docs/DispatchRouteHistoricalEntry.md)
 - [org.openapitools.server.models.DispatchRouteHistory](docs/DispatchRouteHistory.md)
 - [org.openapitools.server.models.Document](docs/Document.md)
 - [org.openapitools.server.models.DocumentBase](docs/DocumentBase.md)
 - [org.openapitools.server.models.DocumentCreate](docs/DocumentCreate.md)
 - [org.openapitools.server.models.DocumentField](docs/DocumentField.md)
 - [org.openapitools.server.models.DocumentFieldCreate](docs/DocumentFieldCreate.md)
 - [org.openapitools.server.models.DocumentFieldCreatePhotoValue](docs/DocumentFieldCreatePhotoValue.md)
 - [org.openapitools.server.models.DocumentFieldType](docs/DocumentFieldType.md)
 - [org.openapitools.server.models.DocumentFieldTypeNumberValueTypeMetadata](docs/DocumentFieldTypeNumberValueTypeMetadata.md)
 - [org.openapitools.server.models.DocumentType](docs/DocumentType.md)
 - [org.openapitools.server.models.DoorResponse](docs/DoorResponse.md)
 - [org.openapitools.server.models.DoorResponseSensors](docs/DoorResponseSensors.md)
 - [org.openapitools.server.models.Driver](docs/Driver.md)
 - [org.openapitools.server.models.DriverBase](docs/DriverBase.md)
 - [org.openapitools.server.models.DriverDailyLogResponse](docs/DriverDailyLogResponse.md)
 - [org.openapitools.server.models.DriverDailyLogResponseDays](docs/DriverDailyLogResponseDays.md)
 - [org.openapitools.server.models.DriverForCreate](docs/DriverForCreate.md)
 - [org.openapitools.server.models.DriverSafetyScoreResponse](docs/DriverSafetyScoreResponse.md)
 - [org.openapitools.server.models.DriversResponse](docs/DriversResponse.md)
 - [org.openapitools.server.models.DriversSummaryResponse](docs/DriversSummaryResponse.md)
 - [org.openapitools.server.models.DriversSummaryResponseSummaries](docs/DriversSummaryResponseSummaries.md)
 - [org.openapitools.server.models.DvirBase](docs/DvirBase.md)
 - [org.openapitools.server.models.DvirBaseAuthorSignature](docs/DvirBaseAuthorSignature.md)
 - [org.openapitools.server.models.DvirBaseMechanicOrAgentSignature](docs/DvirBaseMechanicOrAgentSignature.md)
 - [org.openapitools.server.models.DvirBaseNextDriverSignature](docs/DvirBaseNextDriverSignature.md)
 - [org.openapitools.server.models.DvirBaseTrailerDefects](docs/DvirBaseTrailerDefects.md)
 - [org.openapitools.server.models.DvirBaseVehicle](docs/DvirBaseVehicle.md)
 - [org.openapitools.server.models.DvirListResponse](docs/DvirListResponse.md)
 - [org.openapitools.server.models.EngineState](docs/EngineState.md)
 - [org.openapitools.server.models.FleetVehicleLocation](docs/FleetVehicleLocation.md)
 - [org.openapitools.server.models.FleetVehicleResponse](docs/FleetVehicleResponse.md)
 - [org.openapitools.server.models.FleetVehicleResponseVehicleInfo](docs/FleetVehicleResponseVehicleInfo.md)
 - [org.openapitools.server.models.HosAuthenticationLogsResponse](docs/HosAuthenticationLogsResponse.md)
 - [org.openapitools.server.models.HosAuthenticationLogsResponseAuthenticationLogs](docs/HosAuthenticationLogsResponseAuthenticationLogs.md)
 - [org.openapitools.server.models.HosLogsResponse](docs/HosLogsResponse.md)
 - [org.openapitools.server.models.HosLogsResponseLogs](docs/HosLogsResponseLogs.md)
 - [org.openapitools.server.models.HosLogsSummaryResponse](docs/HosLogsSummaryResponse.md)
 - [org.openapitools.server.models.HosLogsSummaryResponseDrivers](docs/HosLogsSummaryResponseDrivers.md)
 - [org.openapitools.server.models.HumidityResponse](docs/HumidityResponse.md)
 - [org.openapitools.server.models.HumidityResponseSensors](docs/HumidityResponseSensors.md)
 - [org.openapitools.server.models.InlineObject](docs/InlineObject.md)
 - [org.openapitools.server.models.InlineObject1](docs/InlineObject1.md)
 - [org.openapitools.server.models.InlineObject10](docs/InlineObject10.md)
 - [org.openapitools.server.models.InlineObject11](docs/InlineObject11.md)
 - [org.openapitools.server.models.InlineObject12](docs/InlineObject12.md)
 - [org.openapitools.server.models.InlineObject13](docs/InlineObject13.md)
 - [org.openapitools.server.models.InlineObject14](docs/InlineObject14.md)
 - [org.openapitools.server.models.InlineObject15](docs/InlineObject15.md)
 - [org.openapitools.server.models.InlineObject16](docs/InlineObject16.md)
 - [org.openapitools.server.models.InlineObject17](docs/InlineObject17.md)
 - [org.openapitools.server.models.InlineObject18](docs/InlineObject18.md)
 - [org.openapitools.server.models.InlineObject19](docs/InlineObject19.md)
 - [org.openapitools.server.models.InlineObject2](docs/InlineObject2.md)
 - [org.openapitools.server.models.InlineObject20](docs/InlineObject20.md)
 - [org.openapitools.server.models.InlineObject21](docs/InlineObject21.md)
 - [org.openapitools.server.models.InlineObject22](docs/InlineObject22.md)
 - [org.openapitools.server.models.InlineObject23](docs/InlineObject23.md)
 - [org.openapitools.server.models.InlineObject24](docs/InlineObject24.md)
 - [org.openapitools.server.models.InlineObject3](docs/InlineObject3.md)
 - [org.openapitools.server.models.InlineObject4](docs/InlineObject4.md)
 - [org.openapitools.server.models.InlineObject5](docs/InlineObject5.md)
 - [org.openapitools.server.models.InlineObject6](docs/InlineObject6.md)
 - [org.openapitools.server.models.InlineObject7](docs/InlineObject7.md)
 - [org.openapitools.server.models.InlineObject8](docs/InlineObject8.md)
 - [org.openapitools.server.models.InlineObject9](docs/InlineObject9.md)
 - [org.openapitools.server.models.InlineResponse200](docs/InlineResponse200.md)
 - [org.openapitools.server.models.InlineResponse2001](docs/InlineResponse2001.md)
 - [org.openapitools.server.models.InlineResponse2002](docs/InlineResponse2002.md)
 - [org.openapitools.server.models.InlineResponse2003](docs/InlineResponse2003.md)
 - [org.openapitools.server.models.InlineResponse2004](docs/InlineResponse2004.md)
 - [org.openapitools.server.models.InlineResponse2005](docs/InlineResponse2005.md)
 - [org.openapitools.server.models.InlineResponse2005VehicleStats](docs/InlineResponse2005VehicleStats.md)
 - [org.openapitools.server.models.InlineResponse2006](docs/InlineResponse2006.md)
 - [org.openapitools.server.models.InlineResponse2007](docs/InlineResponse2007.md)
 - [org.openapitools.server.models.InlineResponse2008](docs/InlineResponse2008.md)
 - [org.openapitools.server.models.InlineResponse2009](docs/InlineResponse2009.md)
 - [org.openapitools.server.models.JobStatus](docs/JobStatus.md)
 - [org.openapitools.server.models.JobUpdateObject](docs/JobUpdateObject.md)
 - [org.openapitools.server.models.Machine](docs/Machine.md)
 - [org.openapitools.server.models.MachineHistoryResponse](docs/MachineHistoryResponse.md)
 - [org.openapitools.server.models.MachineHistoryResponseMachines](docs/MachineHistoryResponseMachines.md)
 - [org.openapitools.server.models.MachineHistoryResponseVibrations](docs/MachineHistoryResponseVibrations.md)
 - [org.openapitools.server.models.Pagination](docs/Pagination.md)
 - [org.openapitools.server.models.PrevJobStatus](docs/PrevJobStatus.md)
 - [org.openapitools.server.models.SafetyReportHarshEvent](docs/SafetyReportHarshEvent.md)
 - [org.openapitools.server.models.Sensor](docs/Sensor.md)
 - [org.openapitools.server.models.SensorHistoryResponse](docs/SensorHistoryResponse.md)
 - [org.openapitools.server.models.SensorHistoryResponseResults](docs/SensorHistoryResponseResults.md)
 - [org.openapitools.server.models.SensorsHistorySeries](docs/SensorsHistorySeries.md)
 - [org.openapitools.server.models.Tag](docs/Tag.md)
 - [org.openapitools.server.models.TagCreate](docs/TagCreate.md)
 - [org.openapitools.server.models.TagMetadata](docs/TagMetadata.md)
 - [org.openapitools.server.models.TagModify](docs/TagModify.md)
 - [org.openapitools.server.models.TagModifyAdd](docs/TagModifyAdd.md)
 - [org.openapitools.server.models.TagModifyDelete](docs/TagModifyDelete.md)
 - [org.openapitools.server.models.TagUpdate](docs/TagUpdate.md)
 - [org.openapitools.server.models.TaggedAddress](docs/TaggedAddress.md)
 - [org.openapitools.server.models.TaggedAddressBase](docs/TaggedAddressBase.md)
 - [org.openapitools.server.models.TaggedAsset](docs/TaggedAsset.md)
 - [org.openapitools.server.models.TaggedAssetBase](docs/TaggedAssetBase.md)
 - [org.openapitools.server.models.TaggedDriver](docs/TaggedDriver.md)
 - [org.openapitools.server.models.TaggedDriverBase](docs/TaggedDriverBase.md)
 - [org.openapitools.server.models.TaggedMachine](docs/TaggedMachine.md)
 - [org.openapitools.server.models.TaggedMachineBase](docs/TaggedMachineBase.md)
 - [org.openapitools.server.models.TaggedSensor](docs/TaggedSensor.md)
 - [org.openapitools.server.models.TaggedSensorBase](docs/TaggedSensorBase.md)
 - [org.openapitools.server.models.TaggedVehicle](docs/TaggedVehicle.md)
 - [org.openapitools.server.models.TaggedVehicleBase](docs/TaggedVehicleBase.md)
 - [org.openapitools.server.models.TemperatureResponse](docs/TemperatureResponse.md)
 - [org.openapitools.server.models.TemperatureResponseSensors](docs/TemperatureResponseSensors.md)
 - [org.openapitools.server.models.TripResponse](docs/TripResponse.md)
 - [org.openapitools.server.models.TripResponseEndCoordinates](docs/TripResponseEndCoordinates.md)
 - [org.openapitools.server.models.TripResponseStartCoordinates](docs/TripResponseStartCoordinates.md)
 - [org.openapitools.server.models.TripResponseTrips](docs/TripResponseTrips.md)
 - [org.openapitools.server.models.User](docs/User.md)
 - [org.openapitools.server.models.UserBase](docs/UserBase.md)
 - [org.openapitools.server.models.UserRole](docs/UserRole.md)
 - [org.openapitools.server.models.UserTagRole](docs/UserTagRole.md)
 - [org.openapitools.server.models.UserTagRoleTag](docs/UserTagRoleTag.md)
 - [org.openapitools.server.models.Vehicle](docs/Vehicle.md)
 - [org.openapitools.server.models.VehicleHarshEventResponse](docs/VehicleHarshEventResponse.md)
 - [org.openapitools.server.models.VehicleHarshEventResponseLocation](docs/VehicleHarshEventResponseLocation.md)
 - [org.openapitools.server.models.VehicleLocation](docs/VehicleLocation.md)
 - [org.openapitools.server.models.VehicleMaintenance](docs/VehicleMaintenance.md)
 - [org.openapitools.server.models.VehicleMaintenanceJ1939](docs/VehicleMaintenanceJ1939.md)
 - [org.openapitools.server.models.VehicleMaintenanceJ1939CheckEngineLight](docs/VehicleMaintenanceJ1939CheckEngineLight.md)
 - [org.openapitools.server.models.VehicleMaintenanceJ1939DiagnosticTroubleCodes](docs/VehicleMaintenanceJ1939DiagnosticTroubleCodes.md)
 - [org.openapitools.server.models.VehicleMaintenancePassenger](docs/VehicleMaintenancePassenger.md)
 - [org.openapitools.server.models.VehicleMaintenancePassengerCheckEngineLight](docs/VehicleMaintenancePassengerCheckEngineLight.md)
 - [org.openapitools.server.models.VehicleMaintenancePassengerDiagnosticTroubleCodes](docs/VehicleMaintenancePassengerDiagnosticTroubleCodes.md)
 - [org.openapitools.server.models.VehicleSafetyScoreResponse](docs/VehicleSafetyScoreResponse.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

All endpoints do not require authorization.

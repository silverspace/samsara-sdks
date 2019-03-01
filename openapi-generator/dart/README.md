# openapi
# Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).

This Dart package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 1.0.0
- Build package: org.openapitools.codegen.languages.DartClientCodegen

## Requirements

Dart 1.20.0 or later OR Flutter 0.0.20 or later

## Installation & Usage

### Github
If this Dart package is published to Github, please include the following in pubspec.yaml
```
name: openapi
version: 1.0.0
description: OpenAPI API client
dependencies:
  openapi:
    git: https://github.com/GIT_USER_ID/GIT_REPO_ID.git
      version: 'any'
```

### Local
To use the package in your local drive, please include the following in pubspec.yaml
```
dependencies:
  openapi:
    path: /path/to/openapi
```

## Tests

TODO

## Getting Started

Please follow the [installation procedure](#installation--usage) and then run the following:

```dart
import 'package:openapi/api.dart';


var api_instance = new AssetsApi();
var accessToken = accessToken_example; // String | Samsara API access token.
var groupId = 789; // int | Optional group ID if the organization has multiple groups (uncommon).

try {
    var result = api_instance.getAllAssetCurrentLocations(accessToken, groupId);
    print(result);
} catch (e) {
    print("Exception when calling AssetsApi->getAllAssetCurrentLocations: $e\n");
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.samsara.com/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AssetsApi* | [**getAllAssetCurrentLocations**](docs//AssetsApi.md#getallassetcurrentlocations) | **GET** /fleet/assets/locations | /fleet/assets/locations
*AssetsApi* | [**getAllAssets**](docs//AssetsApi.md#getallassets) | **GET** /fleet/assets | /fleet/assets
*AssetsApi* | [**getAssetLocation**](docs//AssetsApi.md#getassetlocation) | **GET** /fleet/assets/{asset_id}/locations | /fleet/assets/{assetId:[0-9]+}/locations
*AssetsApi* | [**getAssetReefer**](docs//AssetsApi.md#getassetreefer) | **GET** /fleet/assets/{asset_id}/reefer | /fleet/assets/{assetId:[0-9]+}/reefer
*DriversApi* | [**createDriver**](docs//DriversApi.md#createdriver) | **POST** /fleet/drivers/create | /fleet/drivers/create
*DriversApi* | [**deactivateDriver**](docs//DriversApi.md#deactivatedriver) | **DELETE** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*DriversApi* | [**getAllDeactivatedDrivers**](docs//DriversApi.md#getalldeactivateddrivers) | **GET** /fleet/drivers/inactive | /fleet/drivers/inactive
*DriversApi* | [**getDeactivatedDriverById**](docs//DriversApi.md#getdeactivateddriverbyid) | **GET** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*DriversApi* | [**getDriverById**](docs//DriversApi.md#getdriverbyid) | **GET** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*DriversApi* | [**reactivateDriverById**](docs//DriversApi.md#reactivatedriverbyid) | **PUT** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*FleetApi* | [**addFleetAddress**](docs//FleetApi.md#addfleetaddress) | **POST** /fleet/add_address | /fleet/add_address
*FleetApi* | [**addOrganizationAddresses**](docs//FleetApi.md#addorganizationaddresses) | **POST** /addresses | /addresses
*FleetApi* | [**createDispatchRoute**](docs//FleetApi.md#createdispatchroute) | **POST** /fleet/dispatch/routes | /fleet/dispatch/routes
*FleetApi* | [**createDriver**](docs//FleetApi.md#createdriver) | **POST** /fleet/drivers/create | /fleet/drivers/create
*FleetApi* | [**createDriverDispatchRoute**](docs//FleetApi.md#createdriverdispatchroute) | **POST** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
*FleetApi* | [**createDriverDocument**](docs//FleetApi.md#createdriverdocument) | **POST** /fleet/drivers/{driver_id}/documents | /fleet/drivers/{driver_id:[0-9]+}/documents
*FleetApi* | [**createDvir**](docs//FleetApi.md#createdvir) | **POST** /fleet/maintenance/dvirs | /fleet/maintenance/dvirs
*FleetApi* | [**createVehicleDispatchRoute**](docs//FleetApi.md#createvehicledispatchroute) | **POST** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
*FleetApi* | [**deactivateDriver**](docs//FleetApi.md#deactivatedriver) | **DELETE** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*FleetApi* | [**deleteDispatchRouteById**](docs//FleetApi.md#deletedispatchroutebyid) | **DELETE** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
*FleetApi* | [**deleteOrganizationAddress**](docs//FleetApi.md#deleteorganizationaddress) | **DELETE** /addresses/{addressId} | /addresses/{addressId}
*FleetApi* | [**fetchAllDispatchRoutes**](docs//FleetApi.md#fetchalldispatchroutes) | **GET** /fleet/dispatch/routes | /fleet/dispatch/routes
*FleetApi* | [**fetchAllRouteJobUpdates**](docs//FleetApi.md#fetchallroutejobupdates) | **GET** /fleet/dispatch/routes/job_updates | /fleet/dispatch/routes/job_updates
*FleetApi* | [**getAllAssetCurrentLocations**](docs//FleetApi.md#getallassetcurrentlocations) | **GET** /fleet/assets/locations | /fleet/assets/locations
*FleetApi* | [**getAllAssets**](docs//FleetApi.md#getallassets) | **GET** /fleet/assets | /fleet/assets
*FleetApi* | [**getAllDeactivatedDrivers**](docs//FleetApi.md#getalldeactivateddrivers) | **GET** /fleet/drivers/inactive | /fleet/drivers/inactive
*FleetApi* | [**getAssetLocation**](docs//FleetApi.md#getassetlocation) | **GET** /fleet/assets/{asset_id}/locations | /fleet/assets/{assetId:[0-9]+}/locations
*FleetApi* | [**getAssetReefer**](docs//FleetApi.md#getassetreefer) | **GET** /fleet/assets/{asset_id}/reefer | /fleet/assets/{assetId:[0-9]+}/reefer
*FleetApi* | [**getDeactivatedDriverById**](docs//FleetApi.md#getdeactivateddriverbyid) | **GET** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*FleetApi* | [**getDispatchRouteById**](docs//FleetApi.md#getdispatchroutebyid) | **GET** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}
*FleetApi* | [**getDispatchRouteHistory**](docs//FleetApi.md#getdispatchroutehistory) | **GET** /fleet/dispatch/routes/{route_id}/history | /fleet/dispatch/routes/{route_id:[0-9]+}/history
*FleetApi* | [**getDispatchRoutesByDriverId**](docs//FleetApi.md#getdispatchroutesbydriverid) | **GET** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
*FleetApi* | [**getDispatchRoutesByVehicleId**](docs//FleetApi.md#getdispatchroutesbyvehicleid) | **GET** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
*FleetApi* | [**getDriverById**](docs//FleetApi.md#getdriverbyid) | **GET** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*FleetApi* | [**getDriverDocumentTypesByOrgId**](docs//FleetApi.md#getdriverdocumenttypesbyorgid) | **GET** /fleet/drivers/document_types | /fleet/drivers/document_types
*FleetApi* | [**getDriverDocumentsByOrgId**](docs//FleetApi.md#getdriverdocumentsbyorgid) | **GET** /fleet/drivers/documents | /fleet/drivers/documents
*FleetApi* | [**getDriverSafetyScore**](docs//FleetApi.md#getdriversafetyscore) | **GET** /fleet/drivers/{driverId}/safety/score | /fleet/drivers/{driverId:[0-9]+}/safety/score
*FleetApi* | [**getDvirs**](docs//FleetApi.md#getdvirs) | **GET** /fleet/maintenance/dvirs | /fleet/maintenance/dvirs
*FleetApi* | [**getFleetDrivers**](docs//FleetApi.md#getfleetdrivers) | **POST** /fleet/drivers | /fleet/drivers
*FleetApi* | [**getFleetDriversHosDailyLogs**](docs//FleetApi.md#getfleetdrivershosdailylogs) | **POST** /fleet/drivers/{driver_id}/hos_daily_logs | /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
*FleetApi* | [**getFleetDriversSummary**](docs//FleetApi.md#getfleetdriverssummary) | **POST** /fleet/drivers/summary | /fleet/drivers/summary
*FleetApi* | [**getFleetHosAuthenticationLogs**](docs//FleetApi.md#getfleethosauthenticationlogs) | **POST** /fleet/hos_authentication_logs | /fleet/hos_authentication_logs
*FleetApi* | [**getFleetHosLogs**](docs//FleetApi.md#getfleethoslogs) | **POST** /fleet/hos_logs | /fleet/hos_logs
*FleetApi* | [**getFleetHosLogsSummary**](docs//FleetApi.md#getfleethoslogssummary) | **POST** /fleet/hos_logs_summary | /fleet/hos_logs_summary
*FleetApi* | [**getFleetLocations**](docs//FleetApi.md#getfleetlocations) | **POST** /fleet/locations | /fleet/locations
*FleetApi* | [**getFleetMaintenanceList**](docs//FleetApi.md#getfleetmaintenancelist) | **POST** /fleet/maintenance/list | /fleet/maintenance/list
*FleetApi* | [**getFleetTrips**](docs//FleetApi.md#getfleettrips) | **POST** /fleet/trips | /fleet/trips
*FleetApi* | [**getFleetVehicle**](docs//FleetApi.md#getfleetvehicle) | **GET** /fleet/vehicles/{vehicle_id_or_external_id} | /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*FleetApi* | [**getOrganizationAddress**](docs//FleetApi.md#getorganizationaddress) | **GET** /addresses/{addressId} | /addresses/{addressId}
*FleetApi* | [**getOrganizationAddresses**](docs//FleetApi.md#getorganizationaddresses) | **GET** /addresses | /addresses
*FleetApi* | [**getOrganizationContact**](docs//FleetApi.md#getorganizationcontact) | **GET** /contacts/{contact_id} | /contacts/{contact_id}
*FleetApi* | [**getVehicleHarshEvent**](docs//FleetApi.md#getvehicleharshevent) | **GET** /fleet/vehicles/{vehicleId}/safety/harsh_event | /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
*FleetApi* | [**getVehicleLocations**](docs//FleetApi.md#getvehiclelocations) | **GET** /fleet/vehicles/{vehicle_id}/locations | /fleet/vehicles/{vehicle_id:[0-9]+}/locations
*FleetApi* | [**getVehicleSafetyScore**](docs//FleetApi.md#getvehiclesafetyscore) | **GET** /fleet/vehicles/{vehicleId}/safety/score | /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
*FleetApi* | [**getVehicleStats**](docs//FleetApi.md#getvehiclestats) | **GET** /fleet/vehicles/stats | /fleet/vehicles/stats
*FleetApi* | [**getVehiclesLocations**](docs//FleetApi.md#getvehicleslocations) | **GET** /fleet/vehicles/locations | /fleet/vehicles/locations
*FleetApi* | [**listContacts**](docs//FleetApi.md#listcontacts) | **GET** /contacts | /contacts
*FleetApi* | [**listFleet**](docs//FleetApi.md#listfleet) | **POST** /fleet/list | /fleet/list
*FleetApi* | [**patchFleetVehicle**](docs//FleetApi.md#patchfleetvehicle) | **PATCH** /fleet/vehicles/{vehicle_id_or_external_id} | /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*FleetApi* | [**reactivateDriverById**](docs//FleetApi.md#reactivatedriverbyid) | **PUT** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*FleetApi* | [**updateDispatchRouteById**](docs//FleetApi.md#updatedispatchroutebyid) | **PUT** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
*FleetApi* | [**updateOrganizationAddress**](docs//FleetApi.md#updateorganizationaddress) | **PATCH** /addresses/{addressId} | /addresses/{addressId}
*FleetApi* | [**updateVehicles**](docs//FleetApi.md#updatevehicles) | **POST** /fleet/set_data | /fleet/set_data
*IndustrialApi* | [**getAllDataInputs**](docs//IndustrialApi.md#getalldatainputs) | **GET** /industrial/data | /industrial/data
*IndustrialApi* | [**getDataInput**](docs//IndustrialApi.md#getdatainput) | **GET** /industrial/data/{data_input_id} | /industrial/data/{data_input_id:[0-9]+}
*IndustrialApi* | [**getMachines**](docs//IndustrialApi.md#getmachines) | **POST** /machines/list | /machines/list
*IndustrialApi* | [**getMachinesHistory**](docs//IndustrialApi.md#getmachineshistory) | **POST** /machines/history | /machines/history
*RoutesApi* | [**createDispatchRoute**](docs//RoutesApi.md#createdispatchroute) | **POST** /fleet/dispatch/routes | /fleet/dispatch/routes
*RoutesApi* | [**createDriverDispatchRoute**](docs//RoutesApi.md#createdriverdispatchroute) | **POST** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
*RoutesApi* | [**createVehicleDispatchRoute**](docs//RoutesApi.md#createvehicledispatchroute) | **POST** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
*RoutesApi* | [**deleteDispatchRouteById**](docs//RoutesApi.md#deletedispatchroutebyid) | **DELETE** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
*RoutesApi* | [**fetchAllDispatchRoutes**](docs//RoutesApi.md#fetchalldispatchroutes) | **GET** /fleet/dispatch/routes | /fleet/dispatch/routes
*RoutesApi* | [**fetchAllRouteJobUpdates**](docs//RoutesApi.md#fetchallroutejobupdates) | **GET** /fleet/dispatch/routes/job_updates | /fleet/dispatch/routes/job_updates
*RoutesApi* | [**getDispatchRouteById**](docs//RoutesApi.md#getdispatchroutebyid) | **GET** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}
*RoutesApi* | [**getDispatchRouteHistory**](docs//RoutesApi.md#getdispatchroutehistory) | **GET** /fleet/dispatch/routes/{route_id}/history | /fleet/dispatch/routes/{route_id:[0-9]+}/history
*RoutesApi* | [**getDispatchRoutesByDriverId**](docs//RoutesApi.md#getdispatchroutesbydriverid) | **GET** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
*RoutesApi* | [**getDispatchRoutesByVehicleId**](docs//RoutesApi.md#getdispatchroutesbyvehicleid) | **GET** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
*RoutesApi* | [**updateDispatchRouteById**](docs//RoutesApi.md#updatedispatchroutebyid) | **PUT** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
*SafetyApi* | [**getDriverSafetyScore**](docs//SafetyApi.md#getdriversafetyscore) | **GET** /fleet/drivers/{driverId}/safety/score | /fleet/drivers/{driverId:[0-9]+}/safety/score
*SafetyApi* | [**getVehicleHarshEvent**](docs//SafetyApi.md#getvehicleharshevent) | **GET** /fleet/vehicles/{vehicleId}/safety/harsh_event | /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
*SafetyApi* | [**getVehicleSafetyScore**](docs//SafetyApi.md#getvehiclesafetyscore) | **GET** /fleet/vehicles/{vehicleId}/safety/score | /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
*SensorsApi* | [**getSensors**](docs//SensorsApi.md#getsensors) | **POST** /sensors/list | /sensors/list
*SensorsApi* | [**getSensorsCargo**](docs//SensorsApi.md#getsensorscargo) | **POST** /sensors/cargo | /sensors/cargo
*SensorsApi* | [**getSensorsDoor**](docs//SensorsApi.md#getsensorsdoor) | **POST** /sensors/door | /sensors/door
*SensorsApi* | [**getSensorsHistory**](docs//SensorsApi.md#getsensorshistory) | **POST** /sensors/history | /sensors/history
*SensorsApi* | [**getSensorsHumidity**](docs//SensorsApi.md#getsensorshumidity) | **POST** /sensors/humidity | /sensors/humidity
*SensorsApi* | [**getSensorsTemperature**](docs//SensorsApi.md#getsensorstemperature) | **POST** /sensors/temperature | /sensors/temperature
*TagsApi* | [**createTag**](docs//TagsApi.md#createtag) | **POST** /tags | /tags
*TagsApi* | [**deleteTagById**](docs//TagsApi.md#deletetagbyid) | **DELETE** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
*TagsApi* | [**getAllTags**](docs//TagsApi.md#getalltags) | **GET** /tags | /tags
*TagsApi* | [**getTagById**](docs//TagsApi.md#gettagbyid) | **GET** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
*TagsApi* | [**modifyTagById**](docs//TagsApi.md#modifytagbyid) | **PATCH** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
*TagsApi* | [**updateTagById**](docs//TagsApi.md#updatetagbyid) | **PUT** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
*UsersApi* | [**deleteUserById**](docs//UsersApi.md#deleteuserbyid) | **DELETE** /users/{userId} | /users/{userId:[0-9]+}
*UsersApi* | [**getUserById**](docs//UsersApi.md#getuserbyid) | **GET** /users/{userId} | /users/{userId:[0-9]+}
*UsersApi* | [**listUserRoles**](docs//UsersApi.md#listuserroles) | **GET** /user_roles | /user_roles
*UsersApi* | [**listUsers**](docs//UsersApi.md#listusers) | **GET** /users | /users


## Documentation For Models

 - [Address](docs//Address.md)
 - [AddressGeofence](docs//AddressGeofence.md)
 - [AddressGeofenceCircle](docs//AddressGeofenceCircle.md)
 - [AddressGeofencePolygon](docs//AddressGeofencePolygon.md)
 - [AddressGeofencePolygonVertices](docs//AddressGeofencePolygonVertices.md)
 - [AddressesAddresses](docs//AddressesAddresses.md)
 - [AllRouteJobUpdates](docs//AllRouteJobUpdates.md)
 - [Asset](docs//Asset.md)
 - [AssetCable](docs//AssetCable.md)
 - [AssetCurrentLocation](docs//AssetCurrentLocation.md)
 - [AssetCurrentLocationsResponse](docs//AssetCurrentLocationsResponse.md)
 - [AssetReeferResponse](docs//AssetReeferResponse.md)
 - [AssetReeferResponseReeferStats](docs//AssetReeferResponseReeferStats.md)
 - [AssetReeferResponseReeferStatsAlarms](docs//AssetReeferResponseReeferStatsAlarms.md)
 - [AssetReeferResponseReeferStatsAlarms1](docs//AssetReeferResponseReeferStatsAlarms1.md)
 - [AssetReeferResponseReeferStatsEngineHours](docs//AssetReeferResponseReeferStatsEngineHours.md)
 - [AssetReeferResponseReeferStatsFuelPercentage](docs//AssetReeferResponseReeferStatsFuelPercentage.md)
 - [AssetReeferResponseReeferStatsPowerStatus](docs//AssetReeferResponseReeferStatsPowerStatus.md)
 - [AssetReeferResponseReeferStatsReturnAirTemp](docs//AssetReeferResponseReeferStatsReturnAirTemp.md)
 - [AssetReeferResponseReeferStatsSetPoint](docs//AssetReeferResponseReeferStatsSetPoint.md)
 - [AuxInput](docs//AuxInput.md)
 - [AuxInputSeries](docs//AuxInputSeries.md)
 - [CargoResponse](docs//CargoResponse.md)
 - [CargoResponseSensors](docs//CargoResponseSensors.md)
 - [Contact](docs//Contact.md)
 - [CurrentDriver](docs//CurrentDriver.md)
 - [DataInputHistoryResponse](docs//DataInputHistoryResponse.md)
 - [DataInputHistoryResponsePoints](docs//DataInputHistoryResponsePoints.md)
 - [DispatchJob](docs//DispatchJob.md)
 - [DispatchJobCreate](docs//DispatchJobCreate.md)
 - [DispatchRoute](docs//DispatchRoute.md)
 - [DispatchRouteBase](docs//DispatchRouteBase.md)
 - [DispatchRouteCreate](docs//DispatchRouteCreate.md)
 - [DispatchRouteHistoricalEntry](docs//DispatchRouteHistoricalEntry.md)
 - [DispatchRouteHistory](docs//DispatchRouteHistory.md)
 - [Document](docs//Document.md)
 - [DocumentBase](docs//DocumentBase.md)
 - [DocumentCreate](docs//DocumentCreate.md)
 - [DocumentField](docs//DocumentField.md)
 - [DocumentFieldCreate](docs//DocumentFieldCreate.md)
 - [DocumentFieldCreatePhotoValue](docs//DocumentFieldCreatePhotoValue.md)
 - [DocumentFieldType](docs//DocumentFieldType.md)
 - [DocumentFieldTypeNumberValueTypeMetadata](docs//DocumentFieldTypeNumberValueTypeMetadata.md)
 - [DocumentType](docs//DocumentType.md)
 - [DoorResponse](docs//DoorResponse.md)
 - [DoorResponseSensors](docs//DoorResponseSensors.md)
 - [Driver](docs//Driver.md)
 - [DriverBase](docs//DriverBase.md)
 - [DriverDailyLogResponse](docs//DriverDailyLogResponse.md)
 - [DriverDailyLogResponseDays](docs//DriverDailyLogResponseDays.md)
 - [DriverForCreate](docs//DriverForCreate.md)
 - [DriverSafetyScoreResponse](docs//DriverSafetyScoreResponse.md)
 - [DriversResponse](docs//DriversResponse.md)
 - [DriversSummaryResponse](docs//DriversSummaryResponse.md)
 - [DriversSummaryResponseSummaries](docs//DriversSummaryResponseSummaries.md)
 - [DvirBase](docs//DvirBase.md)
 - [DvirBaseAuthorSignature](docs//DvirBaseAuthorSignature.md)
 - [DvirBaseMechanicOrAgentSignature](docs//DvirBaseMechanicOrAgentSignature.md)
 - [DvirBaseNextDriverSignature](docs//DvirBaseNextDriverSignature.md)
 - [DvirBaseTrailerDefects](docs//DvirBaseTrailerDefects.md)
 - [DvirBaseVehicle](docs//DvirBaseVehicle.md)
 - [DvirListResponse](docs//DvirListResponse.md)
 - [EngineState](docs//EngineState.md)
 - [FleetVehicleLocation](docs//FleetVehicleLocation.md)
 - [FleetVehicleResponse](docs//FleetVehicleResponse.md)
 - [FleetVehicleResponseVehicleInfo](docs//FleetVehicleResponseVehicleInfo.md)
 - [HosAuthenticationLogsResponse](docs//HosAuthenticationLogsResponse.md)
 - [HosAuthenticationLogsResponseAuthenticationLogs](docs//HosAuthenticationLogsResponseAuthenticationLogs.md)
 - [HosLogsResponse](docs//HosLogsResponse.md)
 - [HosLogsResponseLogs](docs//HosLogsResponseLogs.md)
 - [HosLogsSummaryResponse](docs//HosLogsSummaryResponse.md)
 - [HosLogsSummaryResponseDrivers](docs//HosLogsSummaryResponseDrivers.md)
 - [HumidityResponse](docs//HumidityResponse.md)
 - [HumidityResponseSensors](docs//HumidityResponseSensors.md)
 - [InlineObject](docs//InlineObject.md)
 - [InlineObject1](docs//InlineObject1.md)
 - [InlineObject10](docs//InlineObject10.md)
 - [InlineObject11](docs//InlineObject11.md)
 - [InlineObject12](docs//InlineObject12.md)
 - [InlineObject13](docs//InlineObject13.md)
 - [InlineObject14](docs//InlineObject14.md)
 - [InlineObject15](docs//InlineObject15.md)
 - [InlineObject16](docs//InlineObject16.md)
 - [InlineObject17](docs//InlineObject17.md)
 - [InlineObject18](docs//InlineObject18.md)
 - [InlineObject19](docs//InlineObject19.md)
 - [InlineObject2](docs//InlineObject2.md)
 - [InlineObject20](docs//InlineObject20.md)
 - [InlineObject21](docs//InlineObject21.md)
 - [InlineObject22](docs//InlineObject22.md)
 - [InlineObject23](docs//InlineObject23.md)
 - [InlineObject24](docs//InlineObject24.md)
 - [InlineObject3](docs//InlineObject3.md)
 - [InlineObject4](docs//InlineObject4.md)
 - [InlineObject5](docs//InlineObject5.md)
 - [InlineObject6](docs//InlineObject6.md)
 - [InlineObject7](docs//InlineObject7.md)
 - [InlineObject8](docs//InlineObject8.md)
 - [InlineObject9](docs//InlineObject9.md)
 - [InlineResponse200](docs//InlineResponse200.md)
 - [InlineResponse2001](docs//InlineResponse2001.md)
 - [InlineResponse2002](docs//InlineResponse2002.md)
 - [InlineResponse2003](docs//InlineResponse2003.md)
 - [InlineResponse2004](docs//InlineResponse2004.md)
 - [InlineResponse2005](docs//InlineResponse2005.md)
 - [InlineResponse2005VehicleStats](docs//InlineResponse2005VehicleStats.md)
 - [InlineResponse2006](docs//InlineResponse2006.md)
 - [InlineResponse2007](docs//InlineResponse2007.md)
 - [InlineResponse2008](docs//InlineResponse2008.md)
 - [InlineResponse2009](docs//InlineResponse2009.md)
 - [JobStatus](docs//JobStatus.md)
 - [JobUpdateObject](docs//JobUpdateObject.md)
 - [Machine](docs//Machine.md)
 - [MachineHistoryResponse](docs//MachineHistoryResponse.md)
 - [MachineHistoryResponseMachines](docs//MachineHistoryResponseMachines.md)
 - [MachineHistoryResponseVibrations](docs//MachineHistoryResponseVibrations.md)
 - [Pagination](docs//Pagination.md)
 - [PrevJobStatus](docs//PrevJobStatus.md)
 - [SafetyReportHarshEvent](docs//SafetyReportHarshEvent.md)
 - [Sensor](docs//Sensor.md)
 - [SensorHistoryResponse](docs//SensorHistoryResponse.md)
 - [SensorHistoryResponseResults](docs//SensorHistoryResponseResults.md)
 - [SensorsHistorySeries](docs//SensorsHistorySeries.md)
 - [Tag](docs//Tag.md)
 - [TagCreate](docs//TagCreate.md)
 - [TagMetadata](docs//TagMetadata.md)
 - [TagModify](docs//TagModify.md)
 - [TagModifyAdd](docs//TagModifyAdd.md)
 - [TagModifyDelete](docs//TagModifyDelete.md)
 - [TagUpdate](docs//TagUpdate.md)
 - [TaggedAddress](docs//TaggedAddress.md)
 - [TaggedAddressBase](docs//TaggedAddressBase.md)
 - [TaggedAsset](docs//TaggedAsset.md)
 - [TaggedAssetBase](docs//TaggedAssetBase.md)
 - [TaggedDriver](docs//TaggedDriver.md)
 - [TaggedDriverBase](docs//TaggedDriverBase.md)
 - [TaggedMachine](docs//TaggedMachine.md)
 - [TaggedMachineBase](docs//TaggedMachineBase.md)
 - [TaggedSensor](docs//TaggedSensor.md)
 - [TaggedSensorBase](docs//TaggedSensorBase.md)
 - [TaggedVehicle](docs//TaggedVehicle.md)
 - [TaggedVehicleBase](docs//TaggedVehicleBase.md)
 - [TemperatureResponse](docs//TemperatureResponse.md)
 - [TemperatureResponseSensors](docs//TemperatureResponseSensors.md)
 - [TripResponse](docs//TripResponse.md)
 - [TripResponseEndCoordinates](docs//TripResponseEndCoordinates.md)
 - [TripResponseStartCoordinates](docs//TripResponseStartCoordinates.md)
 - [TripResponseTrips](docs//TripResponseTrips.md)
 - [User](docs//User.md)
 - [UserBase](docs//UserBase.md)
 - [UserRole](docs//UserRole.md)
 - [UserTagRole](docs//UserTagRole.md)
 - [UserTagRoleTag](docs//UserTagRoleTag.md)
 - [Vehicle](docs//Vehicle.md)
 - [VehicleHarshEventResponse](docs//VehicleHarshEventResponse.md)
 - [VehicleHarshEventResponseLocation](docs//VehicleHarshEventResponseLocation.md)
 - [VehicleLocation](docs//VehicleLocation.md)
 - [VehicleMaintenance](docs//VehicleMaintenance.md)
 - [VehicleMaintenanceJ1939](docs//VehicleMaintenanceJ1939.md)
 - [VehicleMaintenanceJ1939CheckEngineLight](docs//VehicleMaintenanceJ1939CheckEngineLight.md)
 - [VehicleMaintenanceJ1939DiagnosticTroubleCodes](docs//VehicleMaintenanceJ1939DiagnosticTroubleCodes.md)
 - [VehicleMaintenancePassenger](docs//VehicleMaintenancePassenger.md)
 - [VehicleMaintenancePassengerCheckEngineLight](docs//VehicleMaintenancePassengerCheckEngineLight.md)
 - [VehicleMaintenancePassengerDiagnosticTroubleCodes](docs//VehicleMaintenancePassengerDiagnosticTroubleCodes.md)
 - [VehicleSafetyScoreResponse](docs//VehicleSafetyScoreResponse.md)


## Documentation For Authorization

 All endpoints do not require authorization.


## Author





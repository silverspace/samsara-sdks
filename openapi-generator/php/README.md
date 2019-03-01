# OpenAPIClient-php
# Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).

This PHP package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 1.0.0
- Build package: org.openapitools.codegen.languages.PhpClientCodegen

## Requirements

PHP 5.5 and later

## Installation & Usage
### Composer

To install the bindings via [Composer](http://getcomposer.org/), add the following to `composer.json`:

```
{
  "repositories": [
    {
      "type": "vcs",
      "url": "https://github.com/GIT_USER_ID/GIT_REPO_ID.git"
    }
  ],
  "require": {
    "GIT_USER_ID/GIT_REPO_ID": "*@dev"
  }
}
```

Then run `composer install`

### Manual Installation

Download the files and include `autoload.php`:

```php
    require_once('/path/to/OpenAPIClient-php/vendor/autoload.php');
```

## Tests

To run the unit tests:

```
composer install
./vendor/bin/phpunit
```

## Getting Started

Please follow the [installation procedure](#installation--usage) and then run the following:

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\AssetsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$access_token = 'access_token_example'; // string | Samsara API access token.
$group_id = 56; // int | Optional group ID if the organization has multiple groups (uncommon).

try {
    $result = $apiInstance->getAllAssetCurrentLocations($access_token, $group_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AssetsApi->getAllAssetCurrentLocations: ', $e->getMessage(), PHP_EOL;
}

?>
```

## Documentation for API Endpoints

All URIs are relative to *https://api.samsara.com/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AssetsApi* | [**getAllAssetCurrentLocations**](docs/Api/AssetsApi.md#getallassetcurrentlocations) | **GET** /fleet/assets/locations | /fleet/assets/locations
*AssetsApi* | [**getAllAssets**](docs/Api/AssetsApi.md#getallassets) | **GET** /fleet/assets | /fleet/assets
*AssetsApi* | [**getAssetLocation**](docs/Api/AssetsApi.md#getassetlocation) | **GET** /fleet/assets/{asset_id}/locations | /fleet/assets/{assetId:[0-9]+}/locations
*AssetsApi* | [**getAssetReefer**](docs/Api/AssetsApi.md#getassetreefer) | **GET** /fleet/assets/{asset_id}/reefer | /fleet/assets/{assetId:[0-9]+}/reefer
*DriversApi* | [**createDriver**](docs/Api/DriversApi.md#createdriver) | **POST** /fleet/drivers/create | /fleet/drivers/create
*DriversApi* | [**deactivateDriver**](docs/Api/DriversApi.md#deactivatedriver) | **DELETE** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*DriversApi* | [**getAllDeactivatedDrivers**](docs/Api/DriversApi.md#getalldeactivateddrivers) | **GET** /fleet/drivers/inactive | /fleet/drivers/inactive
*DriversApi* | [**getDeactivatedDriverById**](docs/Api/DriversApi.md#getdeactivateddriverbyid) | **GET** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*DriversApi* | [**getDriverById**](docs/Api/DriversApi.md#getdriverbyid) | **GET** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*DriversApi* | [**reactivateDriverById**](docs/Api/DriversApi.md#reactivatedriverbyid) | **PUT** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*FleetApi* | [**addFleetAddress**](docs/Api/FleetApi.md#addfleetaddress) | **POST** /fleet/add_address | /fleet/add_address
*FleetApi* | [**addOrganizationAddresses**](docs/Api/FleetApi.md#addorganizationaddresses) | **POST** /addresses | /addresses
*FleetApi* | [**createDispatchRoute**](docs/Api/FleetApi.md#createdispatchroute) | **POST** /fleet/dispatch/routes | /fleet/dispatch/routes
*FleetApi* | [**createDriver**](docs/Api/FleetApi.md#createdriver) | **POST** /fleet/drivers/create | /fleet/drivers/create
*FleetApi* | [**createDriverDispatchRoute**](docs/Api/FleetApi.md#createdriverdispatchroute) | **POST** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
*FleetApi* | [**createDriverDocument**](docs/Api/FleetApi.md#createdriverdocument) | **POST** /fleet/drivers/{driver_id}/documents | /fleet/drivers/{driver_id:[0-9]+}/documents
*FleetApi* | [**createDvir**](docs/Api/FleetApi.md#createdvir) | **POST** /fleet/maintenance/dvirs | /fleet/maintenance/dvirs
*FleetApi* | [**createVehicleDispatchRoute**](docs/Api/FleetApi.md#createvehicledispatchroute) | **POST** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
*FleetApi* | [**deactivateDriver**](docs/Api/FleetApi.md#deactivatedriver) | **DELETE** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*FleetApi* | [**deleteDispatchRouteById**](docs/Api/FleetApi.md#deletedispatchroutebyid) | **DELETE** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
*FleetApi* | [**deleteOrganizationAddress**](docs/Api/FleetApi.md#deleteorganizationaddress) | **DELETE** /addresses/{addressId} | /addresses/{addressId}
*FleetApi* | [**fetchAllDispatchRoutes**](docs/Api/FleetApi.md#fetchalldispatchroutes) | **GET** /fleet/dispatch/routes | /fleet/dispatch/routes
*FleetApi* | [**fetchAllRouteJobUpdates**](docs/Api/FleetApi.md#fetchallroutejobupdates) | **GET** /fleet/dispatch/routes/job_updates | /fleet/dispatch/routes/job_updates
*FleetApi* | [**getAllAssetCurrentLocations**](docs/Api/FleetApi.md#getallassetcurrentlocations) | **GET** /fleet/assets/locations | /fleet/assets/locations
*FleetApi* | [**getAllAssets**](docs/Api/FleetApi.md#getallassets) | **GET** /fleet/assets | /fleet/assets
*FleetApi* | [**getAllDeactivatedDrivers**](docs/Api/FleetApi.md#getalldeactivateddrivers) | **GET** /fleet/drivers/inactive | /fleet/drivers/inactive
*FleetApi* | [**getAssetLocation**](docs/Api/FleetApi.md#getassetlocation) | **GET** /fleet/assets/{asset_id}/locations | /fleet/assets/{assetId:[0-9]+}/locations
*FleetApi* | [**getAssetReefer**](docs/Api/FleetApi.md#getassetreefer) | **GET** /fleet/assets/{asset_id}/reefer | /fleet/assets/{assetId:[0-9]+}/reefer
*FleetApi* | [**getDeactivatedDriverById**](docs/Api/FleetApi.md#getdeactivateddriverbyid) | **GET** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*FleetApi* | [**getDispatchRouteById**](docs/Api/FleetApi.md#getdispatchroutebyid) | **GET** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}
*FleetApi* | [**getDispatchRouteHistory**](docs/Api/FleetApi.md#getdispatchroutehistory) | **GET** /fleet/dispatch/routes/{route_id}/history | /fleet/dispatch/routes/{route_id:[0-9]+}/history
*FleetApi* | [**getDispatchRoutesByDriverId**](docs/Api/FleetApi.md#getdispatchroutesbydriverid) | **GET** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
*FleetApi* | [**getDispatchRoutesByVehicleId**](docs/Api/FleetApi.md#getdispatchroutesbyvehicleid) | **GET** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
*FleetApi* | [**getDriverById**](docs/Api/FleetApi.md#getdriverbyid) | **GET** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*FleetApi* | [**getDriverDocumentTypesByOrgId**](docs/Api/FleetApi.md#getdriverdocumenttypesbyorgid) | **GET** /fleet/drivers/document_types | /fleet/drivers/document_types
*FleetApi* | [**getDriverDocumentsByOrgId**](docs/Api/FleetApi.md#getdriverdocumentsbyorgid) | **GET** /fleet/drivers/documents | /fleet/drivers/documents
*FleetApi* | [**getDriverSafetyScore**](docs/Api/FleetApi.md#getdriversafetyscore) | **GET** /fleet/drivers/{driverId}/safety/score | /fleet/drivers/{driverId:[0-9]+}/safety/score
*FleetApi* | [**getDvirs**](docs/Api/FleetApi.md#getdvirs) | **GET** /fleet/maintenance/dvirs | /fleet/maintenance/dvirs
*FleetApi* | [**getFleetDrivers**](docs/Api/FleetApi.md#getfleetdrivers) | **POST** /fleet/drivers | /fleet/drivers
*FleetApi* | [**getFleetDriversHosDailyLogs**](docs/Api/FleetApi.md#getfleetdrivershosdailylogs) | **POST** /fleet/drivers/{driver_id}/hos_daily_logs | /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
*FleetApi* | [**getFleetDriversSummary**](docs/Api/FleetApi.md#getfleetdriverssummary) | **POST** /fleet/drivers/summary | /fleet/drivers/summary
*FleetApi* | [**getFleetHosAuthenticationLogs**](docs/Api/FleetApi.md#getfleethosauthenticationlogs) | **POST** /fleet/hos_authentication_logs | /fleet/hos_authentication_logs
*FleetApi* | [**getFleetHosLogs**](docs/Api/FleetApi.md#getfleethoslogs) | **POST** /fleet/hos_logs | /fleet/hos_logs
*FleetApi* | [**getFleetHosLogsSummary**](docs/Api/FleetApi.md#getfleethoslogssummary) | **POST** /fleet/hos_logs_summary | /fleet/hos_logs_summary
*FleetApi* | [**getFleetLocations**](docs/Api/FleetApi.md#getfleetlocations) | **POST** /fleet/locations | /fleet/locations
*FleetApi* | [**getFleetMaintenanceList**](docs/Api/FleetApi.md#getfleetmaintenancelist) | **POST** /fleet/maintenance/list | /fleet/maintenance/list
*FleetApi* | [**getFleetTrips**](docs/Api/FleetApi.md#getfleettrips) | **POST** /fleet/trips | /fleet/trips
*FleetApi* | [**getFleetVehicle**](docs/Api/FleetApi.md#getfleetvehicle) | **GET** /fleet/vehicles/{vehicle_id_or_external_id} | /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*FleetApi* | [**getOrganizationAddress**](docs/Api/FleetApi.md#getorganizationaddress) | **GET** /addresses/{addressId} | /addresses/{addressId}
*FleetApi* | [**getOrganizationAddresses**](docs/Api/FleetApi.md#getorganizationaddresses) | **GET** /addresses | /addresses
*FleetApi* | [**getOrganizationContact**](docs/Api/FleetApi.md#getorganizationcontact) | **GET** /contacts/{contact_id} | /contacts/{contact_id}
*FleetApi* | [**getVehicleHarshEvent**](docs/Api/FleetApi.md#getvehicleharshevent) | **GET** /fleet/vehicles/{vehicleId}/safety/harsh_event | /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
*FleetApi* | [**getVehicleLocations**](docs/Api/FleetApi.md#getvehiclelocations) | **GET** /fleet/vehicles/{vehicle_id}/locations | /fleet/vehicles/{vehicle_id:[0-9]+}/locations
*FleetApi* | [**getVehicleSafetyScore**](docs/Api/FleetApi.md#getvehiclesafetyscore) | **GET** /fleet/vehicles/{vehicleId}/safety/score | /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
*FleetApi* | [**getVehicleStats**](docs/Api/FleetApi.md#getvehiclestats) | **GET** /fleet/vehicles/stats | /fleet/vehicles/stats
*FleetApi* | [**getVehiclesLocations**](docs/Api/FleetApi.md#getvehicleslocations) | **GET** /fleet/vehicles/locations | /fleet/vehicles/locations
*FleetApi* | [**listContacts**](docs/Api/FleetApi.md#listcontacts) | **GET** /contacts | /contacts
*FleetApi* | [**listFleet**](docs/Api/FleetApi.md#listfleet) | **POST** /fleet/list | /fleet/list
*FleetApi* | [**patchFleetVehicle**](docs/Api/FleetApi.md#patchfleetvehicle) | **PATCH** /fleet/vehicles/{vehicle_id_or_external_id} | /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*FleetApi* | [**reactivateDriverById**](docs/Api/FleetApi.md#reactivatedriverbyid) | **PUT** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*FleetApi* | [**updateDispatchRouteById**](docs/Api/FleetApi.md#updatedispatchroutebyid) | **PUT** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
*FleetApi* | [**updateOrganizationAddress**](docs/Api/FleetApi.md#updateorganizationaddress) | **PATCH** /addresses/{addressId} | /addresses/{addressId}
*FleetApi* | [**updateVehicles**](docs/Api/FleetApi.md#updatevehicles) | **POST** /fleet/set_data | /fleet/set_data
*IndustrialApi* | [**getAllDataInputs**](docs/Api/IndustrialApi.md#getalldatainputs) | **GET** /industrial/data | /industrial/data
*IndustrialApi* | [**getDataInput**](docs/Api/IndustrialApi.md#getdatainput) | **GET** /industrial/data/{data_input_id} | /industrial/data/{data_input_id:[0-9]+}
*IndustrialApi* | [**getMachines**](docs/Api/IndustrialApi.md#getmachines) | **POST** /machines/list | /machines/list
*IndustrialApi* | [**getMachinesHistory**](docs/Api/IndustrialApi.md#getmachineshistory) | **POST** /machines/history | /machines/history
*RoutesApi* | [**createDispatchRoute**](docs/Api/RoutesApi.md#createdispatchroute) | **POST** /fleet/dispatch/routes | /fleet/dispatch/routes
*RoutesApi* | [**createDriverDispatchRoute**](docs/Api/RoutesApi.md#createdriverdispatchroute) | **POST** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
*RoutesApi* | [**createVehicleDispatchRoute**](docs/Api/RoutesApi.md#createvehicledispatchroute) | **POST** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
*RoutesApi* | [**deleteDispatchRouteById**](docs/Api/RoutesApi.md#deletedispatchroutebyid) | **DELETE** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
*RoutesApi* | [**fetchAllDispatchRoutes**](docs/Api/RoutesApi.md#fetchalldispatchroutes) | **GET** /fleet/dispatch/routes | /fleet/dispatch/routes
*RoutesApi* | [**fetchAllRouteJobUpdates**](docs/Api/RoutesApi.md#fetchallroutejobupdates) | **GET** /fleet/dispatch/routes/job_updates | /fleet/dispatch/routes/job_updates
*RoutesApi* | [**getDispatchRouteById**](docs/Api/RoutesApi.md#getdispatchroutebyid) | **GET** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}
*RoutesApi* | [**getDispatchRouteHistory**](docs/Api/RoutesApi.md#getdispatchroutehistory) | **GET** /fleet/dispatch/routes/{route_id}/history | /fleet/dispatch/routes/{route_id:[0-9]+}/history
*RoutesApi* | [**getDispatchRoutesByDriverId**](docs/Api/RoutesApi.md#getdispatchroutesbydriverid) | **GET** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
*RoutesApi* | [**getDispatchRoutesByVehicleId**](docs/Api/RoutesApi.md#getdispatchroutesbyvehicleid) | **GET** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
*RoutesApi* | [**updateDispatchRouteById**](docs/Api/RoutesApi.md#updatedispatchroutebyid) | **PUT** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
*SafetyApi* | [**getDriverSafetyScore**](docs/Api/SafetyApi.md#getdriversafetyscore) | **GET** /fleet/drivers/{driverId}/safety/score | /fleet/drivers/{driverId:[0-9]+}/safety/score
*SafetyApi* | [**getVehicleHarshEvent**](docs/Api/SafetyApi.md#getvehicleharshevent) | **GET** /fleet/vehicles/{vehicleId}/safety/harsh_event | /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
*SafetyApi* | [**getVehicleSafetyScore**](docs/Api/SafetyApi.md#getvehiclesafetyscore) | **GET** /fleet/vehicles/{vehicleId}/safety/score | /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
*SensorsApi* | [**getSensors**](docs/Api/SensorsApi.md#getsensors) | **POST** /sensors/list | /sensors/list
*SensorsApi* | [**getSensorsCargo**](docs/Api/SensorsApi.md#getsensorscargo) | **POST** /sensors/cargo | /sensors/cargo
*SensorsApi* | [**getSensorsDoor**](docs/Api/SensorsApi.md#getsensorsdoor) | **POST** /sensors/door | /sensors/door
*SensorsApi* | [**getSensorsHistory**](docs/Api/SensorsApi.md#getsensorshistory) | **POST** /sensors/history | /sensors/history
*SensorsApi* | [**getSensorsHumidity**](docs/Api/SensorsApi.md#getsensorshumidity) | **POST** /sensors/humidity | /sensors/humidity
*SensorsApi* | [**getSensorsTemperature**](docs/Api/SensorsApi.md#getsensorstemperature) | **POST** /sensors/temperature | /sensors/temperature
*TagsApi* | [**createTag**](docs/Api/TagsApi.md#createtag) | **POST** /tags | /tags
*TagsApi* | [**deleteTagById**](docs/Api/TagsApi.md#deletetagbyid) | **DELETE** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
*TagsApi* | [**getAllTags**](docs/Api/TagsApi.md#getalltags) | **GET** /tags | /tags
*TagsApi* | [**getTagById**](docs/Api/TagsApi.md#gettagbyid) | **GET** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
*TagsApi* | [**modifyTagById**](docs/Api/TagsApi.md#modifytagbyid) | **PATCH** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
*TagsApi* | [**updateTagById**](docs/Api/TagsApi.md#updatetagbyid) | **PUT** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
*UsersApi* | [**deleteUserById**](docs/Api/UsersApi.md#deleteuserbyid) | **DELETE** /users/{userId} | /users/{userId:[0-9]+}
*UsersApi* | [**getUserById**](docs/Api/UsersApi.md#getuserbyid) | **GET** /users/{userId} | /users/{userId:[0-9]+}
*UsersApi* | [**listUserRoles**](docs/Api/UsersApi.md#listuserroles) | **GET** /user_roles | /user_roles
*UsersApi* | [**listUsers**](docs/Api/UsersApi.md#listusers) | **GET** /users | /users


## Documentation For Models

 - [Address](docs/Model/Address.md)
 - [AddressGeofence](docs/Model/AddressGeofence.md)
 - [AddressGeofenceCircle](docs/Model/AddressGeofenceCircle.md)
 - [AddressGeofencePolygon](docs/Model/AddressGeofencePolygon.md)
 - [AddressGeofencePolygonVertices](docs/Model/AddressGeofencePolygonVertices.md)
 - [AddressesAddresses](docs/Model/AddressesAddresses.md)
 - [AllRouteJobUpdates](docs/Model/AllRouteJobUpdates.md)
 - [Asset](docs/Model/Asset.md)
 - [AssetCable](docs/Model/AssetCable.md)
 - [AssetCurrentLocation](docs/Model/AssetCurrentLocation.md)
 - [AssetCurrentLocationsResponse](docs/Model/AssetCurrentLocationsResponse.md)
 - [AssetReeferResponse](docs/Model/AssetReeferResponse.md)
 - [AssetReeferResponseReeferStats](docs/Model/AssetReeferResponseReeferStats.md)
 - [AssetReeferResponseReeferStatsAlarms](docs/Model/AssetReeferResponseReeferStatsAlarms.md)
 - [AssetReeferResponseReeferStatsAlarms1](docs/Model/AssetReeferResponseReeferStatsAlarms1.md)
 - [AssetReeferResponseReeferStatsEngineHours](docs/Model/AssetReeferResponseReeferStatsEngineHours.md)
 - [AssetReeferResponseReeferStatsFuelPercentage](docs/Model/AssetReeferResponseReeferStatsFuelPercentage.md)
 - [AssetReeferResponseReeferStatsPowerStatus](docs/Model/AssetReeferResponseReeferStatsPowerStatus.md)
 - [AssetReeferResponseReeferStatsReturnAirTemp](docs/Model/AssetReeferResponseReeferStatsReturnAirTemp.md)
 - [AssetReeferResponseReeferStatsSetPoint](docs/Model/AssetReeferResponseReeferStatsSetPoint.md)
 - [AuxInput](docs/Model/AuxInput.md)
 - [AuxInputSeries](docs/Model/AuxInputSeries.md)
 - [CargoResponse](docs/Model/CargoResponse.md)
 - [CargoResponseSensors](docs/Model/CargoResponseSensors.md)
 - [Contact](docs/Model/Contact.md)
 - [CurrentDriver](docs/Model/CurrentDriver.md)
 - [DataInputHistoryResponse](docs/Model/DataInputHistoryResponse.md)
 - [DataInputHistoryResponsePoints](docs/Model/DataInputHistoryResponsePoints.md)
 - [DispatchJob](docs/Model/DispatchJob.md)
 - [DispatchJobCreate](docs/Model/DispatchJobCreate.md)
 - [DispatchRoute](docs/Model/DispatchRoute.md)
 - [DispatchRouteBase](docs/Model/DispatchRouteBase.md)
 - [DispatchRouteCreate](docs/Model/DispatchRouteCreate.md)
 - [DispatchRouteHistoricalEntry](docs/Model/DispatchRouteHistoricalEntry.md)
 - [DispatchRouteHistory](docs/Model/DispatchRouteHistory.md)
 - [Document](docs/Model/Document.md)
 - [DocumentBase](docs/Model/DocumentBase.md)
 - [DocumentCreate](docs/Model/DocumentCreate.md)
 - [DocumentField](docs/Model/DocumentField.md)
 - [DocumentFieldCreate](docs/Model/DocumentFieldCreate.md)
 - [DocumentFieldCreatePhotoValue](docs/Model/DocumentFieldCreatePhotoValue.md)
 - [DocumentFieldType](docs/Model/DocumentFieldType.md)
 - [DocumentFieldTypeNumberValueTypeMetadata](docs/Model/DocumentFieldTypeNumberValueTypeMetadata.md)
 - [DocumentType](docs/Model/DocumentType.md)
 - [DoorResponse](docs/Model/DoorResponse.md)
 - [DoorResponseSensors](docs/Model/DoorResponseSensors.md)
 - [Driver](docs/Model/Driver.md)
 - [DriverBase](docs/Model/DriverBase.md)
 - [DriverDailyLogResponse](docs/Model/DriverDailyLogResponse.md)
 - [DriverDailyLogResponseDays](docs/Model/DriverDailyLogResponseDays.md)
 - [DriverForCreate](docs/Model/DriverForCreate.md)
 - [DriverSafetyScoreResponse](docs/Model/DriverSafetyScoreResponse.md)
 - [DriversResponse](docs/Model/DriversResponse.md)
 - [DriversSummaryResponse](docs/Model/DriversSummaryResponse.md)
 - [DriversSummaryResponseSummaries](docs/Model/DriversSummaryResponseSummaries.md)
 - [DvirBase](docs/Model/DvirBase.md)
 - [DvirBaseAuthorSignature](docs/Model/DvirBaseAuthorSignature.md)
 - [DvirBaseMechanicOrAgentSignature](docs/Model/DvirBaseMechanicOrAgentSignature.md)
 - [DvirBaseNextDriverSignature](docs/Model/DvirBaseNextDriverSignature.md)
 - [DvirBaseTrailerDefects](docs/Model/DvirBaseTrailerDefects.md)
 - [DvirBaseVehicle](docs/Model/DvirBaseVehicle.md)
 - [DvirListResponse](docs/Model/DvirListResponse.md)
 - [EngineState](docs/Model/EngineState.md)
 - [FleetVehicleLocation](docs/Model/FleetVehicleLocation.md)
 - [FleetVehicleResponse](docs/Model/FleetVehicleResponse.md)
 - [FleetVehicleResponseVehicleInfo](docs/Model/FleetVehicleResponseVehicleInfo.md)
 - [HosAuthenticationLogsResponse](docs/Model/HosAuthenticationLogsResponse.md)
 - [HosAuthenticationLogsResponseAuthenticationLogs](docs/Model/HosAuthenticationLogsResponseAuthenticationLogs.md)
 - [HosLogsResponse](docs/Model/HosLogsResponse.md)
 - [HosLogsResponseLogs](docs/Model/HosLogsResponseLogs.md)
 - [HosLogsSummaryResponse](docs/Model/HosLogsSummaryResponse.md)
 - [HosLogsSummaryResponseDrivers](docs/Model/HosLogsSummaryResponseDrivers.md)
 - [HumidityResponse](docs/Model/HumidityResponse.md)
 - [HumidityResponseSensors](docs/Model/HumidityResponseSensors.md)
 - [InlineObject](docs/Model/InlineObject.md)
 - [InlineObject1](docs/Model/InlineObject1.md)
 - [InlineObject10](docs/Model/InlineObject10.md)
 - [InlineObject11](docs/Model/InlineObject11.md)
 - [InlineObject12](docs/Model/InlineObject12.md)
 - [InlineObject13](docs/Model/InlineObject13.md)
 - [InlineObject14](docs/Model/InlineObject14.md)
 - [InlineObject15](docs/Model/InlineObject15.md)
 - [InlineObject16](docs/Model/InlineObject16.md)
 - [InlineObject17](docs/Model/InlineObject17.md)
 - [InlineObject18](docs/Model/InlineObject18.md)
 - [InlineObject19](docs/Model/InlineObject19.md)
 - [InlineObject2](docs/Model/InlineObject2.md)
 - [InlineObject20](docs/Model/InlineObject20.md)
 - [InlineObject21](docs/Model/InlineObject21.md)
 - [InlineObject22](docs/Model/InlineObject22.md)
 - [InlineObject23](docs/Model/InlineObject23.md)
 - [InlineObject24](docs/Model/InlineObject24.md)
 - [InlineObject3](docs/Model/InlineObject3.md)
 - [InlineObject4](docs/Model/InlineObject4.md)
 - [InlineObject5](docs/Model/InlineObject5.md)
 - [InlineObject6](docs/Model/InlineObject6.md)
 - [InlineObject7](docs/Model/InlineObject7.md)
 - [InlineObject8](docs/Model/InlineObject8.md)
 - [InlineObject9](docs/Model/InlineObject9.md)
 - [InlineResponse200](docs/Model/InlineResponse200.md)
 - [InlineResponse2001](docs/Model/InlineResponse2001.md)
 - [InlineResponse2002](docs/Model/InlineResponse2002.md)
 - [InlineResponse2003](docs/Model/InlineResponse2003.md)
 - [InlineResponse2004](docs/Model/InlineResponse2004.md)
 - [InlineResponse2005](docs/Model/InlineResponse2005.md)
 - [InlineResponse2005VehicleStats](docs/Model/InlineResponse2005VehicleStats.md)
 - [InlineResponse2006](docs/Model/InlineResponse2006.md)
 - [InlineResponse2007](docs/Model/InlineResponse2007.md)
 - [InlineResponse2008](docs/Model/InlineResponse2008.md)
 - [InlineResponse2009](docs/Model/InlineResponse2009.md)
 - [JobStatus](docs/Model/JobStatus.md)
 - [JobUpdateObject](docs/Model/JobUpdateObject.md)
 - [Machine](docs/Model/Machine.md)
 - [MachineHistoryResponse](docs/Model/MachineHistoryResponse.md)
 - [MachineHistoryResponseMachines](docs/Model/MachineHistoryResponseMachines.md)
 - [MachineHistoryResponseVibrations](docs/Model/MachineHistoryResponseVibrations.md)
 - [Pagination](docs/Model/Pagination.md)
 - [PrevJobStatus](docs/Model/PrevJobStatus.md)
 - [SafetyReportHarshEvent](docs/Model/SafetyReportHarshEvent.md)
 - [Sensor](docs/Model/Sensor.md)
 - [SensorHistoryResponse](docs/Model/SensorHistoryResponse.md)
 - [SensorHistoryResponseResults](docs/Model/SensorHistoryResponseResults.md)
 - [SensorsHistorySeries](docs/Model/SensorsHistorySeries.md)
 - [Tag](docs/Model/Tag.md)
 - [TagCreate](docs/Model/TagCreate.md)
 - [TagMetadata](docs/Model/TagMetadata.md)
 - [TagModify](docs/Model/TagModify.md)
 - [TagModifyAdd](docs/Model/TagModifyAdd.md)
 - [TagModifyDelete](docs/Model/TagModifyDelete.md)
 - [TagUpdate](docs/Model/TagUpdate.md)
 - [TaggedAddress](docs/Model/TaggedAddress.md)
 - [TaggedAddressBase](docs/Model/TaggedAddressBase.md)
 - [TaggedAsset](docs/Model/TaggedAsset.md)
 - [TaggedAssetBase](docs/Model/TaggedAssetBase.md)
 - [TaggedDriver](docs/Model/TaggedDriver.md)
 - [TaggedDriverBase](docs/Model/TaggedDriverBase.md)
 - [TaggedMachine](docs/Model/TaggedMachine.md)
 - [TaggedMachineBase](docs/Model/TaggedMachineBase.md)
 - [TaggedSensor](docs/Model/TaggedSensor.md)
 - [TaggedSensorBase](docs/Model/TaggedSensorBase.md)
 - [TaggedVehicle](docs/Model/TaggedVehicle.md)
 - [TaggedVehicleBase](docs/Model/TaggedVehicleBase.md)
 - [TemperatureResponse](docs/Model/TemperatureResponse.md)
 - [TemperatureResponseSensors](docs/Model/TemperatureResponseSensors.md)
 - [TripResponse](docs/Model/TripResponse.md)
 - [TripResponseEndCoordinates](docs/Model/TripResponseEndCoordinates.md)
 - [TripResponseStartCoordinates](docs/Model/TripResponseStartCoordinates.md)
 - [TripResponseTrips](docs/Model/TripResponseTrips.md)
 - [User](docs/Model/User.md)
 - [UserBase](docs/Model/UserBase.md)
 - [UserRole](docs/Model/UserRole.md)
 - [UserTagRole](docs/Model/UserTagRole.md)
 - [UserTagRoleTag](docs/Model/UserTagRoleTag.md)
 - [Vehicle](docs/Model/Vehicle.md)
 - [VehicleHarshEventResponse](docs/Model/VehicleHarshEventResponse.md)
 - [VehicleHarshEventResponseLocation](docs/Model/VehicleHarshEventResponseLocation.md)
 - [VehicleLocation](docs/Model/VehicleLocation.md)
 - [VehicleMaintenance](docs/Model/VehicleMaintenance.md)
 - [VehicleMaintenanceJ1939](docs/Model/VehicleMaintenanceJ1939.md)
 - [VehicleMaintenanceJ1939CheckEngineLight](docs/Model/VehicleMaintenanceJ1939CheckEngineLight.md)
 - [VehicleMaintenanceJ1939DiagnosticTroubleCodes](docs/Model/VehicleMaintenanceJ1939DiagnosticTroubleCodes.md)
 - [VehicleMaintenancePassenger](docs/Model/VehicleMaintenancePassenger.md)
 - [VehicleMaintenancePassengerCheckEngineLight](docs/Model/VehicleMaintenancePassengerCheckEngineLight.md)
 - [VehicleMaintenancePassengerDiagnosticTroubleCodes](docs/Model/VehicleMaintenancePassengerDiagnosticTroubleCodes.md)
 - [VehicleSafetyScoreResponse](docs/Model/VehicleSafetyScoreResponse.md)


## Documentation For Authorization

All endpoints do not require authorization.

## Author





# OpenAPIServer
# Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).

This [Symfony](https://symfony.com/) bundle is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 1.0.0
- Build package: org.openapitools.codegen.languages.PhpSymfonyServerCodegen

## Requirements

PHP 5.4.0 and later

## Installation & Usage

To install the dependencies via [Composer](http://getcomposer.org/), add the following repository to `composer.json` of your Symfony project:

```json
{
    "repositories": [{
        "type": "path",
        "url": "//Path to your generated openapi bundle"
    }],
}
```

Then run:

```
composer require GIT_USER_ID/GIT_REPO_ID:dev-master
```

to add the generated openapi bundle as a dependency.

## Tests

To run the unit tests for the generated bundle, first navigate to the directory containing the code, then run the following commands:

```
composer install
./vendor/bin/phpunit
```


## Getting Started

Step 1: Please follow the [installation procedure](#installation--usage) first.

Step 2: Enable the bundle in the kernel:

```php
<?php
// app/AppKernel.php

public function registerBundles()
{
    $bundles = array(
        // ...
        new OpenAPI\Server\OpenAPIServerBundle(),
        // ...
    );
}
```

Step 3: Register the routes:

```yaml
# app/config/routing.yml
open_apiserver:
    resource: "@OpenAPIServerBundle/Resources/config/routing.yml"
```

Step 4: Implement the API calls:

```php
<?php
// src/Acme/MyBundle/Api/AssetsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\AssetsApiInterface;

class AssetsApi implements AssetsApiInterface // An interface is autogenerated
{

    // Other operation methods ...
}
```

Step 5: Tag your API implementation:

```yaml
# src/Acme/MyBundle/Resources/services.yml
services:
    # ...
    acme.my_bundle.api.assets:
        class: Acme\MyBundle\Api\AssetsApi
        tags:
            - { name: "open_apiserver.api", api: "assets" }
    # ...
```

Now you can start using the bundle!


## Documentation for API Endpoints

All URIs are relative to *https://api.samsara.com/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AssetsApiInterface* | [**getAllAssetCurrentLocations**](Resources/docs/Api/AssetsApiInterface.md#getallassetcurrentlocations) | **GET** /fleet/assets/locations | /fleet/assets/locations
*AssetsApiInterface* | [**getAllAssets**](Resources/docs/Api/AssetsApiInterface.md#getallassets) | **GET** /fleet/assets | /fleet/assets
*AssetsApiInterface* | [**getAssetLocation**](Resources/docs/Api/AssetsApiInterface.md#getassetlocation) | **GET** /fleet/assets/{asset_id}/locations | /fleet/assets/{assetId:[0-9]+}/locations
*AssetsApiInterface* | [**getAssetReefer**](Resources/docs/Api/AssetsApiInterface.md#getassetreefer) | **GET** /fleet/assets/{asset_id}/reefer | /fleet/assets/{assetId:[0-9]+}/reefer
*DriversApiInterface* | [**createDriver**](Resources/docs/Api/DriversApiInterface.md#createdriver) | **POST** /fleet/drivers/create | /fleet/drivers/create
*DriversApiInterface* | [**deactivateDriver**](Resources/docs/Api/DriversApiInterface.md#deactivatedriver) | **DELETE** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*DriversApiInterface* | [**getAllDeactivatedDrivers**](Resources/docs/Api/DriversApiInterface.md#getalldeactivateddrivers) | **GET** /fleet/drivers/inactive | /fleet/drivers/inactive
*DriversApiInterface* | [**getDeactivatedDriverById**](Resources/docs/Api/DriversApiInterface.md#getdeactivateddriverbyid) | **GET** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*DriversApiInterface* | [**getDriverById**](Resources/docs/Api/DriversApiInterface.md#getdriverbyid) | **GET** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*DriversApiInterface* | [**reactivateDriverById**](Resources/docs/Api/DriversApiInterface.md#reactivatedriverbyid) | **PUT** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*FleetApiInterface* | [**addFleetAddress**](Resources/docs/Api/FleetApiInterface.md#addfleetaddress) | **POST** /fleet/add_address | /fleet/add_address
*FleetApiInterface* | [**addOrganizationAddresses**](Resources/docs/Api/FleetApiInterface.md#addorganizationaddresses) | **POST** /addresses | /addresses
*FleetApiInterface* | [**createDispatchRoute**](Resources/docs/Api/FleetApiInterface.md#createdispatchroute) | **POST** /fleet/dispatch/routes | /fleet/dispatch/routes
*FleetApiInterface* | [**createDriver**](Resources/docs/Api/FleetApiInterface.md#createdriver) | **POST** /fleet/drivers/create | /fleet/drivers/create
*FleetApiInterface* | [**createDriverDispatchRoute**](Resources/docs/Api/FleetApiInterface.md#createdriverdispatchroute) | **POST** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
*FleetApiInterface* | [**createDriverDocument**](Resources/docs/Api/FleetApiInterface.md#createdriverdocument) | **POST** /fleet/drivers/{driver_id}/documents | /fleet/drivers/{driver_id:[0-9]+}/documents
*FleetApiInterface* | [**createDvir**](Resources/docs/Api/FleetApiInterface.md#createdvir) | **POST** /fleet/maintenance/dvirs | /fleet/maintenance/dvirs
*FleetApiInterface* | [**createVehicleDispatchRoute**](Resources/docs/Api/FleetApiInterface.md#createvehicledispatchroute) | **POST** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
*FleetApiInterface* | [**deactivateDriver**](Resources/docs/Api/FleetApiInterface.md#deactivatedriver) | **DELETE** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*FleetApiInterface* | [**deleteDispatchRouteById**](Resources/docs/Api/FleetApiInterface.md#deletedispatchroutebyid) | **DELETE** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
*FleetApiInterface* | [**deleteOrganizationAddress**](Resources/docs/Api/FleetApiInterface.md#deleteorganizationaddress) | **DELETE** /addresses/{addressId} | /addresses/{addressId}
*FleetApiInterface* | [**fetchAllDispatchRoutes**](Resources/docs/Api/FleetApiInterface.md#fetchalldispatchroutes) | **GET** /fleet/dispatch/routes | /fleet/dispatch/routes
*FleetApiInterface* | [**fetchAllRouteJobUpdates**](Resources/docs/Api/FleetApiInterface.md#fetchallroutejobupdates) | **GET** /fleet/dispatch/routes/job_updates | /fleet/dispatch/routes/job_updates
*FleetApiInterface* | [**getAllAssetCurrentLocations**](Resources/docs/Api/FleetApiInterface.md#getallassetcurrentlocations) | **GET** /fleet/assets/locations | /fleet/assets/locations
*FleetApiInterface* | [**getAllAssets**](Resources/docs/Api/FleetApiInterface.md#getallassets) | **GET** /fleet/assets | /fleet/assets
*FleetApiInterface* | [**getAllDeactivatedDrivers**](Resources/docs/Api/FleetApiInterface.md#getalldeactivateddrivers) | **GET** /fleet/drivers/inactive | /fleet/drivers/inactive
*FleetApiInterface* | [**getAssetLocation**](Resources/docs/Api/FleetApiInterface.md#getassetlocation) | **GET** /fleet/assets/{asset_id}/locations | /fleet/assets/{assetId:[0-9]+}/locations
*FleetApiInterface* | [**getAssetReefer**](Resources/docs/Api/FleetApiInterface.md#getassetreefer) | **GET** /fleet/assets/{asset_id}/reefer | /fleet/assets/{assetId:[0-9]+}/reefer
*FleetApiInterface* | [**getDeactivatedDriverById**](Resources/docs/Api/FleetApiInterface.md#getdeactivateddriverbyid) | **GET** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*FleetApiInterface* | [**getDispatchRouteById**](Resources/docs/Api/FleetApiInterface.md#getdispatchroutebyid) | **GET** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}
*FleetApiInterface* | [**getDispatchRouteHistory**](Resources/docs/Api/FleetApiInterface.md#getdispatchroutehistory) | **GET** /fleet/dispatch/routes/{route_id}/history | /fleet/dispatch/routes/{route_id:[0-9]+}/history
*FleetApiInterface* | [**getDispatchRoutesByDriverId**](Resources/docs/Api/FleetApiInterface.md#getdispatchroutesbydriverid) | **GET** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
*FleetApiInterface* | [**getDispatchRoutesByVehicleId**](Resources/docs/Api/FleetApiInterface.md#getdispatchroutesbyvehicleid) | **GET** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
*FleetApiInterface* | [**getDriverById**](Resources/docs/Api/FleetApiInterface.md#getdriverbyid) | **GET** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*FleetApiInterface* | [**getDriverDocumentTypesByOrgId**](Resources/docs/Api/FleetApiInterface.md#getdriverdocumenttypesbyorgid) | **GET** /fleet/drivers/document_types | /fleet/drivers/document_types
*FleetApiInterface* | [**getDriverDocumentsByOrgId**](Resources/docs/Api/FleetApiInterface.md#getdriverdocumentsbyorgid) | **GET** /fleet/drivers/documents | /fleet/drivers/documents
*FleetApiInterface* | [**getDriverSafetyScore**](Resources/docs/Api/FleetApiInterface.md#getdriversafetyscore) | **GET** /fleet/drivers/{driverId}/safety/score | /fleet/drivers/{driverId:[0-9]+}/safety/score
*FleetApiInterface* | [**getDvirs**](Resources/docs/Api/FleetApiInterface.md#getdvirs) | **GET** /fleet/maintenance/dvirs | /fleet/maintenance/dvirs
*FleetApiInterface* | [**getFleetDrivers**](Resources/docs/Api/FleetApiInterface.md#getfleetdrivers) | **POST** /fleet/drivers | /fleet/drivers
*FleetApiInterface* | [**getFleetDriversHosDailyLogs**](Resources/docs/Api/FleetApiInterface.md#getfleetdrivershosdailylogs) | **POST** /fleet/drivers/{driver_id}/hos_daily_logs | /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
*FleetApiInterface* | [**getFleetDriversSummary**](Resources/docs/Api/FleetApiInterface.md#getfleetdriverssummary) | **POST** /fleet/drivers/summary | /fleet/drivers/summary
*FleetApiInterface* | [**getFleetHosAuthenticationLogs**](Resources/docs/Api/FleetApiInterface.md#getfleethosauthenticationlogs) | **POST** /fleet/hos_authentication_logs | /fleet/hos_authentication_logs
*FleetApiInterface* | [**getFleetHosLogs**](Resources/docs/Api/FleetApiInterface.md#getfleethoslogs) | **POST** /fleet/hos_logs | /fleet/hos_logs
*FleetApiInterface* | [**getFleetHosLogsSummary**](Resources/docs/Api/FleetApiInterface.md#getfleethoslogssummary) | **POST** /fleet/hos_logs_summary | /fleet/hos_logs_summary
*FleetApiInterface* | [**getFleetLocations**](Resources/docs/Api/FleetApiInterface.md#getfleetlocations) | **POST** /fleet/locations | /fleet/locations
*FleetApiInterface* | [**getFleetMaintenanceList**](Resources/docs/Api/FleetApiInterface.md#getfleetmaintenancelist) | **POST** /fleet/maintenance/list | /fleet/maintenance/list
*FleetApiInterface* | [**getFleetTrips**](Resources/docs/Api/FleetApiInterface.md#getfleettrips) | **POST** /fleet/trips | /fleet/trips
*FleetApiInterface* | [**getFleetVehicle**](Resources/docs/Api/FleetApiInterface.md#getfleetvehicle) | **GET** /fleet/vehicles/{vehicle_id_or_external_id} | /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*FleetApiInterface* | [**getOrganizationAddress**](Resources/docs/Api/FleetApiInterface.md#getorganizationaddress) | **GET** /addresses/{addressId} | /addresses/{addressId}
*FleetApiInterface* | [**getOrganizationAddresses**](Resources/docs/Api/FleetApiInterface.md#getorganizationaddresses) | **GET** /addresses | /addresses
*FleetApiInterface* | [**getOrganizationContact**](Resources/docs/Api/FleetApiInterface.md#getorganizationcontact) | **GET** /contacts/{contact_id} | /contacts/{contact_id}
*FleetApiInterface* | [**getVehicleHarshEvent**](Resources/docs/Api/FleetApiInterface.md#getvehicleharshevent) | **GET** /fleet/vehicles/{vehicleId}/safety/harsh_event | /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
*FleetApiInterface* | [**getVehicleLocations**](Resources/docs/Api/FleetApiInterface.md#getvehiclelocations) | **GET** /fleet/vehicles/{vehicle_id}/locations | /fleet/vehicles/{vehicle_id:[0-9]+}/locations
*FleetApiInterface* | [**getVehicleSafetyScore**](Resources/docs/Api/FleetApiInterface.md#getvehiclesafetyscore) | **GET** /fleet/vehicles/{vehicleId}/safety/score | /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
*FleetApiInterface* | [**getVehicleStats**](Resources/docs/Api/FleetApiInterface.md#getvehiclestats) | **GET** /fleet/vehicles/stats | /fleet/vehicles/stats
*FleetApiInterface* | [**getVehiclesLocations**](Resources/docs/Api/FleetApiInterface.md#getvehicleslocations) | **GET** /fleet/vehicles/locations | /fleet/vehicles/locations
*FleetApiInterface* | [**listContacts**](Resources/docs/Api/FleetApiInterface.md#listcontacts) | **GET** /contacts | /contacts
*FleetApiInterface* | [**listFleet**](Resources/docs/Api/FleetApiInterface.md#listfleet) | **POST** /fleet/list | /fleet/list
*FleetApiInterface* | [**patchFleetVehicle**](Resources/docs/Api/FleetApiInterface.md#patchfleetvehicle) | **PATCH** /fleet/vehicles/{vehicle_id_or_external_id} | /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*FleetApiInterface* | [**reactivateDriverById**](Resources/docs/Api/FleetApiInterface.md#reactivatedriverbyid) | **PUT** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*FleetApiInterface* | [**updateDispatchRouteById**](Resources/docs/Api/FleetApiInterface.md#updatedispatchroutebyid) | **PUT** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
*FleetApiInterface* | [**updateOrganizationAddress**](Resources/docs/Api/FleetApiInterface.md#updateorganizationaddress) | **PATCH** /addresses/{addressId} | /addresses/{addressId}
*FleetApiInterface* | [**updateVehicles**](Resources/docs/Api/FleetApiInterface.md#updatevehicles) | **POST** /fleet/set_data | /fleet/set_data
*IndustrialApiInterface* | [**getAllDataInputs**](Resources/docs/Api/IndustrialApiInterface.md#getalldatainputs) | **GET** /industrial/data | /industrial/data
*IndustrialApiInterface* | [**getDataInput**](Resources/docs/Api/IndustrialApiInterface.md#getdatainput) | **GET** /industrial/data/{data_input_id} | /industrial/data/{data_input_id:[0-9]+}
*IndustrialApiInterface* | [**getMachines**](Resources/docs/Api/IndustrialApiInterface.md#getmachines) | **POST** /machines/list | /machines/list
*IndustrialApiInterface* | [**getMachinesHistory**](Resources/docs/Api/IndustrialApiInterface.md#getmachineshistory) | **POST** /machines/history | /machines/history
*RoutesApiInterface* | [**createDispatchRoute**](Resources/docs/Api/RoutesApiInterface.md#createdispatchroute) | **POST** /fleet/dispatch/routes | /fleet/dispatch/routes
*RoutesApiInterface* | [**createDriverDispatchRoute**](Resources/docs/Api/RoutesApiInterface.md#createdriverdispatchroute) | **POST** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
*RoutesApiInterface* | [**createVehicleDispatchRoute**](Resources/docs/Api/RoutesApiInterface.md#createvehicledispatchroute) | **POST** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
*RoutesApiInterface* | [**deleteDispatchRouteById**](Resources/docs/Api/RoutesApiInterface.md#deletedispatchroutebyid) | **DELETE** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
*RoutesApiInterface* | [**fetchAllDispatchRoutes**](Resources/docs/Api/RoutesApiInterface.md#fetchalldispatchroutes) | **GET** /fleet/dispatch/routes | /fleet/dispatch/routes
*RoutesApiInterface* | [**fetchAllRouteJobUpdates**](Resources/docs/Api/RoutesApiInterface.md#fetchallroutejobupdates) | **GET** /fleet/dispatch/routes/job_updates | /fleet/dispatch/routes/job_updates
*RoutesApiInterface* | [**getDispatchRouteById**](Resources/docs/Api/RoutesApiInterface.md#getdispatchroutebyid) | **GET** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}
*RoutesApiInterface* | [**getDispatchRouteHistory**](Resources/docs/Api/RoutesApiInterface.md#getdispatchroutehistory) | **GET** /fleet/dispatch/routes/{route_id}/history | /fleet/dispatch/routes/{route_id:[0-9]+}/history
*RoutesApiInterface* | [**getDispatchRoutesByDriverId**](Resources/docs/Api/RoutesApiInterface.md#getdispatchroutesbydriverid) | **GET** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
*RoutesApiInterface* | [**getDispatchRoutesByVehicleId**](Resources/docs/Api/RoutesApiInterface.md#getdispatchroutesbyvehicleid) | **GET** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
*RoutesApiInterface* | [**updateDispatchRouteById**](Resources/docs/Api/RoutesApiInterface.md#updatedispatchroutebyid) | **PUT** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
*SafetyApiInterface* | [**getDriverSafetyScore**](Resources/docs/Api/SafetyApiInterface.md#getdriversafetyscore) | **GET** /fleet/drivers/{driverId}/safety/score | /fleet/drivers/{driverId:[0-9]+}/safety/score
*SafetyApiInterface* | [**getVehicleHarshEvent**](Resources/docs/Api/SafetyApiInterface.md#getvehicleharshevent) | **GET** /fleet/vehicles/{vehicleId}/safety/harsh_event | /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
*SafetyApiInterface* | [**getVehicleSafetyScore**](Resources/docs/Api/SafetyApiInterface.md#getvehiclesafetyscore) | **GET** /fleet/vehicles/{vehicleId}/safety/score | /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
*SensorsApiInterface* | [**getSensors**](Resources/docs/Api/SensorsApiInterface.md#getsensors) | **POST** /sensors/list | /sensors/list
*SensorsApiInterface* | [**getSensorsCargo**](Resources/docs/Api/SensorsApiInterface.md#getsensorscargo) | **POST** /sensors/cargo | /sensors/cargo
*SensorsApiInterface* | [**getSensorsDoor**](Resources/docs/Api/SensorsApiInterface.md#getsensorsdoor) | **POST** /sensors/door | /sensors/door
*SensorsApiInterface* | [**getSensorsHistory**](Resources/docs/Api/SensorsApiInterface.md#getsensorshistory) | **POST** /sensors/history | /sensors/history
*SensorsApiInterface* | [**getSensorsHumidity**](Resources/docs/Api/SensorsApiInterface.md#getsensorshumidity) | **POST** /sensors/humidity | /sensors/humidity
*SensorsApiInterface* | [**getSensorsTemperature**](Resources/docs/Api/SensorsApiInterface.md#getsensorstemperature) | **POST** /sensors/temperature | /sensors/temperature
*TagsApiInterface* | [**createTag**](Resources/docs/Api/TagsApiInterface.md#createtag) | **POST** /tags | /tags
*TagsApiInterface* | [**deleteTagById**](Resources/docs/Api/TagsApiInterface.md#deletetagbyid) | **DELETE** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
*TagsApiInterface* | [**getAllTags**](Resources/docs/Api/TagsApiInterface.md#getalltags) | **GET** /tags | /tags
*TagsApiInterface* | [**getTagById**](Resources/docs/Api/TagsApiInterface.md#gettagbyid) | **GET** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
*TagsApiInterface* | [**modifyTagById**](Resources/docs/Api/TagsApiInterface.md#modifytagbyid) | **PATCH** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
*TagsApiInterface* | [**updateTagById**](Resources/docs/Api/TagsApiInterface.md#updatetagbyid) | **PUT** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
*UsersApiInterface* | [**deleteUserById**](Resources/docs/Api/UsersApiInterface.md#deleteuserbyid) | **DELETE** /users/{userId} | /users/{userId:[0-9]+}
*UsersApiInterface* | [**getUserById**](Resources/docs/Api/UsersApiInterface.md#getuserbyid) | **GET** /users/{userId} | /users/{userId:[0-9]+}
*UsersApiInterface* | [**listUserRoles**](Resources/docs/Api/UsersApiInterface.md#listuserroles) | **GET** /user_roles | /user_roles
*UsersApiInterface* | [**listUsers**](Resources/docs/Api/UsersApiInterface.md#listusers) | **GET** /users | /users


## Documentation For Models

 - [Address](Resources/docs/Model/Address.md)
 - [AddressGeofence](Resources/docs/Model/AddressGeofence.md)
 - [AddressGeofenceCircle](Resources/docs/Model/AddressGeofenceCircle.md)
 - [AddressGeofencePolygon](Resources/docs/Model/AddressGeofencePolygon.md)
 - [AddressGeofencePolygonVertices](Resources/docs/Model/AddressGeofencePolygonVertices.md)
 - [AddressesAddresses](Resources/docs/Model/AddressesAddresses.md)
 - [AllRouteJobUpdates](Resources/docs/Model/AllRouteJobUpdates.md)
 - [Asset](Resources/docs/Model/Asset.md)
 - [AssetCable](Resources/docs/Model/AssetCable.md)
 - [AssetCurrentLocation](Resources/docs/Model/AssetCurrentLocation.md)
 - [AssetCurrentLocationsResponse](Resources/docs/Model/AssetCurrentLocationsResponse.md)
 - [AssetReeferResponse](Resources/docs/Model/AssetReeferResponse.md)
 - [AssetReeferResponseReeferStats](Resources/docs/Model/AssetReeferResponseReeferStats.md)
 - [AssetReeferResponseReeferStatsAlarms](Resources/docs/Model/AssetReeferResponseReeferStatsAlarms.md)
 - [AssetReeferResponseReeferStatsAlarms1](Resources/docs/Model/AssetReeferResponseReeferStatsAlarms1.md)
 - [AssetReeferResponseReeferStatsEngineHours](Resources/docs/Model/AssetReeferResponseReeferStatsEngineHours.md)
 - [AssetReeferResponseReeferStatsFuelPercentage](Resources/docs/Model/AssetReeferResponseReeferStatsFuelPercentage.md)
 - [AssetReeferResponseReeferStatsPowerStatus](Resources/docs/Model/AssetReeferResponseReeferStatsPowerStatus.md)
 - [AssetReeferResponseReeferStatsReturnAirTemp](Resources/docs/Model/AssetReeferResponseReeferStatsReturnAirTemp.md)
 - [AssetReeferResponseReeferStatsSetPoint](Resources/docs/Model/AssetReeferResponseReeferStatsSetPoint.md)
 - [AuxInput](Resources/docs/Model/AuxInput.md)
 - [AuxInputSeries](Resources/docs/Model/AuxInputSeries.md)
 - [CargoResponse](Resources/docs/Model/CargoResponse.md)
 - [CargoResponseSensors](Resources/docs/Model/CargoResponseSensors.md)
 - [Contact](Resources/docs/Model/Contact.md)
 - [CurrentDriver](Resources/docs/Model/CurrentDriver.md)
 - [DataInputHistoryResponse](Resources/docs/Model/DataInputHistoryResponse.md)
 - [DataInputHistoryResponsePoints](Resources/docs/Model/DataInputHistoryResponsePoints.md)
 - [DispatchJob](Resources/docs/Model/DispatchJob.md)
 - [DispatchJobCreate](Resources/docs/Model/DispatchJobCreate.md)
 - [DispatchRoute](Resources/docs/Model/DispatchRoute.md)
 - [DispatchRouteBase](Resources/docs/Model/DispatchRouteBase.md)
 - [DispatchRouteCreate](Resources/docs/Model/DispatchRouteCreate.md)
 - [DispatchRouteHistoricalEntry](Resources/docs/Model/DispatchRouteHistoricalEntry.md)
 - [DispatchRouteHistory](Resources/docs/Model/DispatchRouteHistory.md)
 - [Document](Resources/docs/Model/Document.md)
 - [DocumentBase](Resources/docs/Model/DocumentBase.md)
 - [DocumentCreate](Resources/docs/Model/DocumentCreate.md)
 - [DocumentField](Resources/docs/Model/DocumentField.md)
 - [DocumentFieldCreate](Resources/docs/Model/DocumentFieldCreate.md)
 - [DocumentFieldCreatePhotoValue](Resources/docs/Model/DocumentFieldCreatePhotoValue.md)
 - [DocumentFieldType](Resources/docs/Model/DocumentFieldType.md)
 - [DocumentFieldTypeNumberValueTypeMetadata](Resources/docs/Model/DocumentFieldTypeNumberValueTypeMetadata.md)
 - [DocumentType](Resources/docs/Model/DocumentType.md)
 - [DoorResponse](Resources/docs/Model/DoorResponse.md)
 - [DoorResponseSensors](Resources/docs/Model/DoorResponseSensors.md)
 - [Driver](Resources/docs/Model/Driver.md)
 - [DriverBase](Resources/docs/Model/DriverBase.md)
 - [DriverDailyLogResponse](Resources/docs/Model/DriverDailyLogResponse.md)
 - [DriverDailyLogResponseDays](Resources/docs/Model/DriverDailyLogResponseDays.md)
 - [DriverForCreate](Resources/docs/Model/DriverForCreate.md)
 - [DriverSafetyScoreResponse](Resources/docs/Model/DriverSafetyScoreResponse.md)
 - [DriversResponse](Resources/docs/Model/DriversResponse.md)
 - [DriversSummaryResponse](Resources/docs/Model/DriversSummaryResponse.md)
 - [DriversSummaryResponseSummaries](Resources/docs/Model/DriversSummaryResponseSummaries.md)
 - [DvirBase](Resources/docs/Model/DvirBase.md)
 - [DvirBaseAuthorSignature](Resources/docs/Model/DvirBaseAuthorSignature.md)
 - [DvirBaseMechanicOrAgentSignature](Resources/docs/Model/DvirBaseMechanicOrAgentSignature.md)
 - [DvirBaseNextDriverSignature](Resources/docs/Model/DvirBaseNextDriverSignature.md)
 - [DvirBaseTrailerDefects](Resources/docs/Model/DvirBaseTrailerDefects.md)
 - [DvirBaseVehicle](Resources/docs/Model/DvirBaseVehicle.md)
 - [DvirListResponse](Resources/docs/Model/DvirListResponse.md)
 - [EngineState](Resources/docs/Model/EngineState.md)
 - [FleetVehicleLocation](Resources/docs/Model/FleetVehicleLocation.md)
 - [FleetVehicleResponse](Resources/docs/Model/FleetVehicleResponse.md)
 - [FleetVehicleResponseVehicleInfo](Resources/docs/Model/FleetVehicleResponseVehicleInfo.md)
 - [HosAuthenticationLogsResponse](Resources/docs/Model/HosAuthenticationLogsResponse.md)
 - [HosAuthenticationLogsResponseAuthenticationLogs](Resources/docs/Model/HosAuthenticationLogsResponseAuthenticationLogs.md)
 - [HosLogsResponse](Resources/docs/Model/HosLogsResponse.md)
 - [HosLogsResponseLogs](Resources/docs/Model/HosLogsResponseLogs.md)
 - [HosLogsSummaryResponse](Resources/docs/Model/HosLogsSummaryResponse.md)
 - [HosLogsSummaryResponseDrivers](Resources/docs/Model/HosLogsSummaryResponseDrivers.md)
 - [HumidityResponse](Resources/docs/Model/HumidityResponse.md)
 - [HumidityResponseSensors](Resources/docs/Model/HumidityResponseSensors.md)
 - [InlineObject](Resources/docs/Model/InlineObject.md)
 - [InlineObject1](Resources/docs/Model/InlineObject1.md)
 - [InlineObject10](Resources/docs/Model/InlineObject10.md)
 - [InlineObject11](Resources/docs/Model/InlineObject11.md)
 - [InlineObject12](Resources/docs/Model/InlineObject12.md)
 - [InlineObject13](Resources/docs/Model/InlineObject13.md)
 - [InlineObject14](Resources/docs/Model/InlineObject14.md)
 - [InlineObject15](Resources/docs/Model/InlineObject15.md)
 - [InlineObject16](Resources/docs/Model/InlineObject16.md)
 - [InlineObject17](Resources/docs/Model/InlineObject17.md)
 - [InlineObject18](Resources/docs/Model/InlineObject18.md)
 - [InlineObject19](Resources/docs/Model/InlineObject19.md)
 - [InlineObject2](Resources/docs/Model/InlineObject2.md)
 - [InlineObject20](Resources/docs/Model/InlineObject20.md)
 - [InlineObject21](Resources/docs/Model/InlineObject21.md)
 - [InlineObject22](Resources/docs/Model/InlineObject22.md)
 - [InlineObject23](Resources/docs/Model/InlineObject23.md)
 - [InlineObject24](Resources/docs/Model/InlineObject24.md)
 - [InlineObject3](Resources/docs/Model/InlineObject3.md)
 - [InlineObject4](Resources/docs/Model/InlineObject4.md)
 - [InlineObject5](Resources/docs/Model/InlineObject5.md)
 - [InlineObject6](Resources/docs/Model/InlineObject6.md)
 - [InlineObject7](Resources/docs/Model/InlineObject7.md)
 - [InlineObject8](Resources/docs/Model/InlineObject8.md)
 - [InlineObject9](Resources/docs/Model/InlineObject9.md)
 - [InlineResponse200](Resources/docs/Model/InlineResponse200.md)
 - [InlineResponse2001](Resources/docs/Model/InlineResponse2001.md)
 - [InlineResponse2002](Resources/docs/Model/InlineResponse2002.md)
 - [InlineResponse2003](Resources/docs/Model/InlineResponse2003.md)
 - [InlineResponse2004](Resources/docs/Model/InlineResponse2004.md)
 - [InlineResponse2005](Resources/docs/Model/InlineResponse2005.md)
 - [InlineResponse2005VehicleStats](Resources/docs/Model/InlineResponse2005VehicleStats.md)
 - [InlineResponse2006](Resources/docs/Model/InlineResponse2006.md)
 - [InlineResponse2007](Resources/docs/Model/InlineResponse2007.md)
 - [InlineResponse2008](Resources/docs/Model/InlineResponse2008.md)
 - [InlineResponse2009](Resources/docs/Model/InlineResponse2009.md)
 - [JobStatus](Resources/docs/Model/JobStatus.md)
 - [JobUpdateObject](Resources/docs/Model/JobUpdateObject.md)
 - [Machine](Resources/docs/Model/Machine.md)
 - [MachineHistoryResponse](Resources/docs/Model/MachineHistoryResponse.md)
 - [MachineHistoryResponseMachines](Resources/docs/Model/MachineHistoryResponseMachines.md)
 - [MachineHistoryResponseVibrations](Resources/docs/Model/MachineHistoryResponseVibrations.md)
 - [Pagination](Resources/docs/Model/Pagination.md)
 - [PrevJobStatus](Resources/docs/Model/PrevJobStatus.md)
 - [SafetyReportHarshEvent](Resources/docs/Model/SafetyReportHarshEvent.md)
 - [Sensor](Resources/docs/Model/Sensor.md)
 - [SensorHistoryResponse](Resources/docs/Model/SensorHistoryResponse.md)
 - [SensorHistoryResponseResults](Resources/docs/Model/SensorHistoryResponseResults.md)
 - [SensorsHistorySeries](Resources/docs/Model/SensorsHistorySeries.md)
 - [Tag](Resources/docs/Model/Tag.md)
 - [TagCreate](Resources/docs/Model/TagCreate.md)
 - [TagMetadata](Resources/docs/Model/TagMetadata.md)
 - [TagModify](Resources/docs/Model/TagModify.md)
 - [TagModifyAdd](Resources/docs/Model/TagModifyAdd.md)
 - [TagModifyDelete](Resources/docs/Model/TagModifyDelete.md)
 - [TagUpdate](Resources/docs/Model/TagUpdate.md)
 - [TaggedAddress](Resources/docs/Model/TaggedAddress.md)
 - [TaggedAddressBase](Resources/docs/Model/TaggedAddressBase.md)
 - [TaggedAsset](Resources/docs/Model/TaggedAsset.md)
 - [TaggedAssetBase](Resources/docs/Model/TaggedAssetBase.md)
 - [TaggedDriver](Resources/docs/Model/TaggedDriver.md)
 - [TaggedDriverBase](Resources/docs/Model/TaggedDriverBase.md)
 - [TaggedMachine](Resources/docs/Model/TaggedMachine.md)
 - [TaggedMachineBase](Resources/docs/Model/TaggedMachineBase.md)
 - [TaggedSensor](Resources/docs/Model/TaggedSensor.md)
 - [TaggedSensorBase](Resources/docs/Model/TaggedSensorBase.md)
 - [TaggedVehicle](Resources/docs/Model/TaggedVehicle.md)
 - [TaggedVehicleBase](Resources/docs/Model/TaggedVehicleBase.md)
 - [TemperatureResponse](Resources/docs/Model/TemperatureResponse.md)
 - [TemperatureResponseSensors](Resources/docs/Model/TemperatureResponseSensors.md)
 - [TripResponse](Resources/docs/Model/TripResponse.md)
 - [TripResponseEndCoordinates](Resources/docs/Model/TripResponseEndCoordinates.md)
 - [TripResponseStartCoordinates](Resources/docs/Model/TripResponseStartCoordinates.md)
 - [TripResponseTrips](Resources/docs/Model/TripResponseTrips.md)
 - [User](Resources/docs/Model/User.md)
 - [UserBase](Resources/docs/Model/UserBase.md)
 - [UserRole](Resources/docs/Model/UserRole.md)
 - [UserTagRole](Resources/docs/Model/UserTagRole.md)
 - [UserTagRoleTag](Resources/docs/Model/UserTagRoleTag.md)
 - [Vehicle](Resources/docs/Model/Vehicle.md)
 - [VehicleHarshEventResponse](Resources/docs/Model/VehicleHarshEventResponse.md)
 - [VehicleHarshEventResponseLocation](Resources/docs/Model/VehicleHarshEventResponseLocation.md)
 - [VehicleLocation](Resources/docs/Model/VehicleLocation.md)
 - [VehicleMaintenance](Resources/docs/Model/VehicleMaintenance.md)
 - [VehicleMaintenanceJ1939](Resources/docs/Model/VehicleMaintenanceJ1939.md)
 - [VehicleMaintenanceJ1939CheckEngineLight](Resources/docs/Model/VehicleMaintenanceJ1939CheckEngineLight.md)
 - [VehicleMaintenanceJ1939DiagnosticTroubleCodes](Resources/docs/Model/VehicleMaintenanceJ1939DiagnosticTroubleCodes.md)
 - [VehicleMaintenancePassenger](Resources/docs/Model/VehicleMaintenancePassenger.md)
 - [VehicleMaintenancePassengerCheckEngineLight](Resources/docs/Model/VehicleMaintenancePassengerCheckEngineLight.md)
 - [VehicleMaintenancePassengerDiagnosticTroubleCodes](Resources/docs/Model/VehicleMaintenancePassengerDiagnosticTroubleCodes.md)
 - [VehicleSafetyScoreResponse](Resources/docs/Model/VehicleSafetyScoreResponse.md)


## Documentation For Authorization

 All endpoints do not require authorization.


## Author





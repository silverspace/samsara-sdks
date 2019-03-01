# php-base - PHP Slim Server library for Samsara API

* [OpenAPI Generator](https://openapi-generator.tech)
* [Slim Framework Documentation](https://www.slimframework.com/docs/)

## Requirements

* Web server with URL rewriting
* PHP 7.0 or newer

This package contains `.htaccess` for Apache configuration.
If you use another server(Nginx, HHVM, IIS, lighttpd) check out [Web Servers](https://www.slimframework.com/docs/v3/start/web-servers.html) doc.

## Installation via [Composer](https://getcomposer.org/)

Navigate into your project's root directory and execute the bash command shown below.
This command downloads the Slim Framework and its third-party dependencies into your project's `vendor/` directory.
```bash
$ composer install
```

## Start devserver

Run the following command in terminal to start localhost web server, assuming `./php-slim-server/` is public-accessible directory with `index.php` file:
```bash
$ php -S localhost:8888 -t php-slim-server
```
> **Warning** This web server was designed to aid application development.
> It may also be useful for testing purposes or for application demonstrations that are run in controlled environments.
> It is not intended to be a full-featured web server. It should not be used on a public network.

## Tests

### PHPUnit

This package uses PHPUnit 6 or 7(depends from your PHP version) for unit testing.
[Test folder](test) contains templates which you can fill with real test assertions.
How to write tests read at [PHPUnit Manual - Chapter 2. Writing Tests for PHPUnit](https://phpunit.de/manual/6.5/en/writing-tests-for-phpunit.html).

#### Run

Command | Target
---- | ----
`$ composer test` | All tests
`$ composer test-apis` | Apis tests
`$ composer test-models` | Models tests

#### Config

Package contains fully functional config `./phpunit.xml.dist` file. Create `./phpunit.xml` in root folder to override it.

Quote from [3. The Command-Line Test Runner — PHPUnit 7.4 Manual](https://phpunit.readthedocs.io/en/7.4/textui.html#command-line-options):

> If phpunit.xml or phpunit.xml.dist (in that order) exist in the current working directory and --configuration is not used, the configuration will be automatically read from that file.

### PHP CodeSniffer

[PHP CodeSniffer Documentation](https://github.com/squizlabs/PHP_CodeSniffer/wiki). This tool helps to follow coding style and avoid common PHP coding mistakes.

#### Run

```bash
$ composer phpcs
```

#### Config

Package contains fully functional config `./phpcs.xml.dist` file. It checks source code against PSR-1 and PSR-2 coding standards.
Create `./phpcs.xml` in root folder to override it. More info at [Using a Default Configuration File](https://github.com/squizlabs/PHP_CodeSniffer/wiki/Advanced-Usage#using-a-default-configuration-file)

### PHPLint

[PHPLint Documentation](https://github.com/overtrue/phplint). Checks PHP syntax only.

#### Run

```bash
$ composer phplint
```

## Show errors

Switch on option in `./index.php`:
```diff
    /**
     * When true, additional information about exceptions are displayed by the default
     * error handler.
     * Default: false
     */
--- // 'displayErrorDetails' => false,
+++ 'displayErrorDetails' => true,
```

## API Endpoints

All URIs are relative to *https://api.samsara.com/v1*

> Important! Do not modify abstract API controllers directly! Instead extend them by implementation classes like:

```php
// src/Api/PetApi.php

namespace OpenAPIServer\Api;

use OpenAPIServer\Api\AbstractPetApi;

class PetApi extends AbstractPetApi
{

    public function addPet($request, $response, $args)
    {
        // your implementation of addPet method here
    }
}
```

Place all your implementation classes in `./src` folder accordingly.
For instance, when abstract class located at `./lib/Api/AbstractPetApi.php` you need to create implementation class at `./src/Api/PetApi.php`.

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AbstractAssetsApi* | **getAllAssetCurrentLocations** | **GET** /fleet/assets/locations | /fleet/assets/locations
*AbstractAssetsApi* | **getAllAssets** | **GET** /fleet/assets | /fleet/assets
*AbstractAssetsApi* | **getAssetLocation** | **GET** /fleet/assets/{asset_id}/locations | /fleet/assets/{assetId:[0-9]+}/locations
*AbstractAssetsApi* | **getAssetReefer** | **GET** /fleet/assets/{asset_id}/reefer | /fleet/assets/{assetId:[0-9]+}/reefer
*AbstractDriversApi* | **createDriver** | **POST** /fleet/drivers/create | /fleet/drivers/create
*AbstractDriversApi* | **getAllDeactivatedDrivers** | **GET** /fleet/drivers/inactive | /fleet/drivers/inactive
*AbstractDriversApi* | **deactivateDriver** | **DELETE** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*AbstractDriversApi* | **getDeactivatedDriverById** | **GET** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*AbstractDriversApi* | **getDriverById** | **GET** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*AbstractDriversApi* | **reactivateDriverById** | **PUT** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*AbstractFleetApi* | **addFleetAddress** | **POST** /fleet/add_address | /fleet/add_address
*AbstractFleetApi* | **addOrganizationAddresses** | **POST** /addresses | /addresses
*AbstractFleetApi* | **createDispatchRoute** | **POST** /fleet/dispatch/routes | /fleet/dispatch/routes
*AbstractFleetApi* | **createDriver** | **POST** /fleet/drivers/create | /fleet/drivers/create
*AbstractFleetApi* | **createDvir** | **POST** /fleet/maintenance/dvirs | /fleet/maintenance/dvirs
*AbstractFleetApi* | **fetchAllDispatchRoutes** | **GET** /fleet/dispatch/routes | /fleet/dispatch/routes
*AbstractFleetApi* | **fetchAllRouteJobUpdates** | **GET** /fleet/dispatch/routes/job_updates | /fleet/dispatch/routes/job_updates
*AbstractFleetApi* | **getAllAssetCurrentLocations** | **GET** /fleet/assets/locations | /fleet/assets/locations
*AbstractFleetApi* | **getAllAssets** | **GET** /fleet/assets | /fleet/assets
*AbstractFleetApi* | **getAllDeactivatedDrivers** | **GET** /fleet/drivers/inactive | /fleet/drivers/inactive
*AbstractFleetApi* | **getDriverDocumentTypesByOrgId** | **GET** /fleet/drivers/document_types | /fleet/drivers/document_types
*AbstractFleetApi* | **getDriverDocumentsByOrgId** | **GET** /fleet/drivers/documents | /fleet/drivers/documents
*AbstractFleetApi* | **getDvirs** | **GET** /fleet/maintenance/dvirs | /fleet/maintenance/dvirs
*AbstractFleetApi* | **getFleetDrivers** | **POST** /fleet/drivers | /fleet/drivers
*AbstractFleetApi* | **getFleetDriversSummary** | **POST** /fleet/drivers/summary | /fleet/drivers/summary
*AbstractFleetApi* | **getFleetHosAuthenticationLogs** | **POST** /fleet/hos_authentication_logs | /fleet/hos_authentication_logs
*AbstractFleetApi* | **getFleetHosLogs** | **POST** /fleet/hos_logs | /fleet/hos_logs
*AbstractFleetApi* | **getFleetHosLogsSummary** | **POST** /fleet/hos_logs_summary | /fleet/hos_logs_summary
*AbstractFleetApi* | **getFleetLocations** | **POST** /fleet/locations | /fleet/locations
*AbstractFleetApi* | **getFleetMaintenanceList** | **POST** /fleet/maintenance/list | /fleet/maintenance/list
*AbstractFleetApi* | **getFleetTrips** | **POST** /fleet/trips | /fleet/trips
*AbstractFleetApi* | **getOrganizationAddresses** | **GET** /addresses | /addresses
*AbstractFleetApi* | **getVehicleStats** | **GET** /fleet/vehicles/stats | /fleet/vehicles/stats
*AbstractFleetApi* | **getVehiclesLocations** | **GET** /fleet/vehicles/locations | /fleet/vehicles/locations
*AbstractFleetApi* | **listContacts** | **GET** /contacts | /contacts
*AbstractFleetApi* | **listFleet** | **POST** /fleet/list | /fleet/list
*AbstractFleetApi* | **updateVehicles** | **POST** /fleet/set_data | /fleet/set_data
*AbstractFleetApi* | **createDriverDispatchRoute** | **POST** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
*AbstractFleetApi* | **createDriverDocument** | **POST** /fleet/drivers/{driver_id}/documents | /fleet/drivers/{driver_id:[0-9]+}/documents
*AbstractFleetApi* | **createVehicleDispatchRoute** | **POST** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
*AbstractFleetApi* | **deactivateDriver** | **DELETE** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*AbstractFleetApi* | **deleteDispatchRouteById** | **DELETE** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
*AbstractFleetApi* | **deleteOrganizationAddress** | **DELETE** /addresses/{addressId} | /addresses/{addressId}
*AbstractFleetApi* | **getAssetLocation** | **GET** /fleet/assets/{asset_id}/locations | /fleet/assets/{assetId:[0-9]+}/locations
*AbstractFleetApi* | **getAssetReefer** | **GET** /fleet/assets/{asset_id}/reefer | /fleet/assets/{assetId:[0-9]+}/reefer
*AbstractFleetApi* | **getDeactivatedDriverById** | **GET** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*AbstractFleetApi* | **getDispatchRouteById** | **GET** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}
*AbstractFleetApi* | **getDispatchRouteHistory** | **GET** /fleet/dispatch/routes/{route_id}/history | /fleet/dispatch/routes/{route_id:[0-9]+}/history
*AbstractFleetApi* | **getDispatchRoutesByDriverId** | **GET** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
*AbstractFleetApi* | **getDispatchRoutesByVehicleId** | **GET** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
*AbstractFleetApi* | **getDriverById** | **GET** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*AbstractFleetApi* | **getDriverSafetyScore** | **GET** /fleet/drivers/{driverId}/safety/score | /fleet/drivers/{driverId:[0-9]+}/safety/score
*AbstractFleetApi* | **getFleetDriversHosDailyLogs** | **POST** /fleet/drivers/{driver_id}/hos_daily_logs | /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
*AbstractFleetApi* | **getFleetVehicle** | **GET** /fleet/vehicles/{vehicle_id_or_external_id} | /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*AbstractFleetApi* | **getOrganizationAddress** | **GET** /addresses/{addressId} | /addresses/{addressId}
*AbstractFleetApi* | **getOrganizationContact** | **GET** /contacts/{contact_id} | /contacts/{contact_id}
*AbstractFleetApi* | **getVehicleHarshEvent** | **GET** /fleet/vehicles/{vehicleId}/safety/harsh_event | /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
*AbstractFleetApi* | **getVehicleLocations** | **GET** /fleet/vehicles/{vehicle_id}/locations | /fleet/vehicles/{vehicle_id:[0-9]+}/locations
*AbstractFleetApi* | **getVehicleSafetyScore** | **GET** /fleet/vehicles/{vehicleId}/safety/score | /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
*AbstractFleetApi* | **patchFleetVehicle** | **PATCH** /fleet/vehicles/{vehicle_id_or_external_id} | /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*AbstractFleetApi* | **reactivateDriverById** | **PUT** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*AbstractFleetApi* | **updateDispatchRouteById** | **PUT** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
*AbstractFleetApi* | **updateOrganizationAddress** | **PATCH** /addresses/{addressId} | /addresses/{addressId}
*AbstractIndustrialApi* | **getAllDataInputs** | **GET** /industrial/data | /industrial/data
*AbstractIndustrialApi* | **getMachines** | **POST** /machines/list | /machines/list
*AbstractIndustrialApi* | **getMachinesHistory** | **POST** /machines/history | /machines/history
*AbstractIndustrialApi* | **getDataInput** | **GET** /industrial/data/{data_input_id} | /industrial/data/{data_input_id:[0-9]+}
*AbstractRoutesApi* | **createDispatchRoute** | **POST** /fleet/dispatch/routes | /fleet/dispatch/routes
*AbstractRoutesApi* | **fetchAllDispatchRoutes** | **GET** /fleet/dispatch/routes | /fleet/dispatch/routes
*AbstractRoutesApi* | **fetchAllRouteJobUpdates** | **GET** /fleet/dispatch/routes/job_updates | /fleet/dispatch/routes/job_updates
*AbstractRoutesApi* | **createDriverDispatchRoute** | **POST** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
*AbstractRoutesApi* | **createVehicleDispatchRoute** | **POST** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
*AbstractRoutesApi* | **deleteDispatchRouteById** | **DELETE** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
*AbstractRoutesApi* | **getDispatchRouteById** | **GET** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}
*AbstractRoutesApi* | **getDispatchRouteHistory** | **GET** /fleet/dispatch/routes/{route_id}/history | /fleet/dispatch/routes/{route_id:[0-9]+}/history
*AbstractRoutesApi* | **getDispatchRoutesByDriverId** | **GET** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
*AbstractRoutesApi* | **getDispatchRoutesByVehicleId** | **GET** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
*AbstractRoutesApi* | **updateDispatchRouteById** | **PUT** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
*AbstractSafetyApi* | **getDriverSafetyScore** | **GET** /fleet/drivers/{driverId}/safety/score | /fleet/drivers/{driverId:[0-9]+}/safety/score
*AbstractSafetyApi* | **getVehicleHarshEvent** | **GET** /fleet/vehicles/{vehicleId}/safety/harsh_event | /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
*AbstractSafetyApi* | **getVehicleSafetyScore** | **GET** /fleet/vehicles/{vehicleId}/safety/score | /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
*AbstractSensorsApi* | **getSensors** | **POST** /sensors/list | /sensors/list
*AbstractSensorsApi* | **getSensorsCargo** | **POST** /sensors/cargo | /sensors/cargo
*AbstractSensorsApi* | **getSensorsDoor** | **POST** /sensors/door | /sensors/door
*AbstractSensorsApi* | **getSensorsHistory** | **POST** /sensors/history | /sensors/history
*AbstractSensorsApi* | **getSensorsHumidity** | **POST** /sensors/humidity | /sensors/humidity
*AbstractSensorsApi* | **getSensorsTemperature** | **POST** /sensors/temperature | /sensors/temperature
*AbstractTagsApi* | **createTag** | **POST** /tags | /tags
*AbstractTagsApi* | **getAllTags** | **GET** /tags | /tags
*AbstractTagsApi* | **deleteTagById** | **DELETE** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
*AbstractTagsApi* | **getTagById** | **GET** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
*AbstractTagsApi* | **modifyTagById** | **PATCH** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
*AbstractTagsApi* | **updateTagById** | **PUT** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
*AbstractUsersApi* | **listUserRoles** | **GET** /user_roles | /user_roles
*AbstractUsersApi* | **listUsers** | **GET** /users | /users
*AbstractUsersApi* | **deleteUserById** | **DELETE** /users/{userId} | /users/{userId:[0-9]+}
*AbstractUsersApi* | **getUserById** | **GET** /users/{userId} | /users/{userId:[0-9]+}


## Models

* OpenAPIServer\Model\Address
* OpenAPIServer\Model\AddressGeofence
* OpenAPIServer\Model\AddressGeofenceCircle
* OpenAPIServer\Model\AddressGeofencePolygon
* OpenAPIServer\Model\AddressGeofencePolygonVertices
* OpenAPIServer\Model\AddressesAddresses
* OpenAPIServer\Model\AllRouteJobUpdates
* OpenAPIServer\Model\Asset
* OpenAPIServer\Model\AssetCable
* OpenAPIServer\Model\AssetCurrentLocation
* OpenAPIServer\Model\AssetCurrentLocationsResponse
* OpenAPIServer\Model\AssetReeferResponse
* OpenAPIServer\Model\AssetReeferResponseReeferStats
* OpenAPIServer\Model\AssetReeferResponseReeferStatsAlarms
* OpenAPIServer\Model\AssetReeferResponseReeferStatsAlarms1
* OpenAPIServer\Model\AssetReeferResponseReeferStatsEngineHours
* OpenAPIServer\Model\AssetReeferResponseReeferStatsFuelPercentage
* OpenAPIServer\Model\AssetReeferResponseReeferStatsPowerStatus
* OpenAPIServer\Model\AssetReeferResponseReeferStatsReturnAirTemp
* OpenAPIServer\Model\AssetReeferResponseReeferStatsSetPoint
* OpenAPIServer\Model\AuxInput
* OpenAPIServer\Model\AuxInputSeries
* OpenAPIServer\Model\CargoResponse
* OpenAPIServer\Model\CargoResponseSensors
* OpenAPIServer\Model\Contact
* OpenAPIServer\Model\CurrentDriver
* OpenAPIServer\Model\DataInputHistoryResponse
* OpenAPIServer\Model\DataInputHistoryResponsePoints
* OpenAPIServer\Model\DispatchJob
* OpenAPIServer\Model\DispatchJobCreate
* OpenAPIServer\Model\DispatchRoute
* OpenAPIServer\Model\DispatchRouteBase
* OpenAPIServer\Model\DispatchRouteCreate
* OpenAPIServer\Model\DispatchRouteHistoricalEntry
* OpenAPIServer\Model\DispatchRouteHistory
* OpenAPIServer\Model\Document
* OpenAPIServer\Model\DocumentBase
* OpenAPIServer\Model\DocumentCreate
* OpenAPIServer\Model\DocumentField
* OpenAPIServer\Model\DocumentFieldCreate
* OpenAPIServer\Model\DocumentFieldCreatePhotoValue
* OpenAPIServer\Model\DocumentFieldType
* OpenAPIServer\Model\DocumentFieldTypeNumberValueTypeMetadata
* OpenAPIServer\Model\DocumentType
* OpenAPIServer\Model\DoorResponse
* OpenAPIServer\Model\DoorResponseSensors
* OpenAPIServer\Model\Driver
* OpenAPIServer\Model\DriverBase
* OpenAPIServer\Model\DriverDailyLogResponse
* OpenAPIServer\Model\DriverDailyLogResponseDays
* OpenAPIServer\Model\DriverForCreate
* OpenAPIServer\Model\DriverSafetyScoreResponse
* OpenAPIServer\Model\DriversResponse
* OpenAPIServer\Model\DriversSummaryResponse
* OpenAPIServer\Model\DriversSummaryResponseSummaries
* OpenAPIServer\Model\DvirBase
* OpenAPIServer\Model\DvirBaseAuthorSignature
* OpenAPIServer\Model\DvirBaseMechanicOrAgentSignature
* OpenAPIServer\Model\DvirBaseNextDriverSignature
* OpenAPIServer\Model\DvirBaseTrailerDefects
* OpenAPIServer\Model\DvirBaseVehicle
* OpenAPIServer\Model\DvirListResponse
* OpenAPIServer\Model\EngineState
* OpenAPIServer\Model\FleetVehicleLocation
* OpenAPIServer\Model\FleetVehicleResponse
* OpenAPIServer\Model\FleetVehicleResponseVehicleInfo
* OpenAPIServer\Model\HosAuthenticationLogsResponse
* OpenAPIServer\Model\HosAuthenticationLogsResponseAuthenticationLogs
* OpenAPIServer\Model\HosLogsResponse
* OpenAPIServer\Model\HosLogsResponseLogs
* OpenAPIServer\Model\HosLogsSummaryResponse
* OpenAPIServer\Model\HosLogsSummaryResponseDrivers
* OpenAPIServer\Model\HumidityResponse
* OpenAPIServer\Model\HumidityResponseSensors
* OpenAPIServer\Model\InlineObject
* OpenAPIServer\Model\InlineObject1
* OpenAPIServer\Model\InlineObject10
* OpenAPIServer\Model\InlineObject11
* OpenAPIServer\Model\InlineObject12
* OpenAPIServer\Model\InlineObject13
* OpenAPIServer\Model\InlineObject14
* OpenAPIServer\Model\InlineObject15
* OpenAPIServer\Model\InlineObject16
* OpenAPIServer\Model\InlineObject17
* OpenAPIServer\Model\InlineObject18
* OpenAPIServer\Model\InlineObject19
* OpenAPIServer\Model\InlineObject2
* OpenAPIServer\Model\InlineObject20
* OpenAPIServer\Model\InlineObject21
* OpenAPIServer\Model\InlineObject22
* OpenAPIServer\Model\InlineObject23
* OpenAPIServer\Model\InlineObject24
* OpenAPIServer\Model\InlineObject3
* OpenAPIServer\Model\InlineObject4
* OpenAPIServer\Model\InlineObject5
* OpenAPIServer\Model\InlineObject6
* OpenAPIServer\Model\InlineObject7
* OpenAPIServer\Model\InlineObject8
* OpenAPIServer\Model\InlineObject9
* OpenAPIServer\Model\InlineResponse200
* OpenAPIServer\Model\InlineResponse2001
* OpenAPIServer\Model\InlineResponse2002
* OpenAPIServer\Model\InlineResponse2003
* OpenAPIServer\Model\InlineResponse2004
* OpenAPIServer\Model\InlineResponse2005
* OpenAPIServer\Model\InlineResponse2005VehicleStats
* OpenAPIServer\Model\InlineResponse2006
* OpenAPIServer\Model\InlineResponse2007
* OpenAPIServer\Model\InlineResponse2008
* OpenAPIServer\Model\InlineResponse2009
* OpenAPIServer\Model\JobStatus
* OpenAPIServer\Model\JobUpdateObject
* OpenAPIServer\Model\Machine
* OpenAPIServer\Model\MachineHistoryResponse
* OpenAPIServer\Model\MachineHistoryResponseMachines
* OpenAPIServer\Model\MachineHistoryResponseVibrations
* OpenAPIServer\Model\Pagination
* OpenAPIServer\Model\PrevJobStatus
* OpenAPIServer\Model\SafetyReportHarshEvent
* OpenAPIServer\Model\Sensor
* OpenAPIServer\Model\SensorHistoryResponse
* OpenAPIServer\Model\SensorHistoryResponseResults
* OpenAPIServer\Model\SensorsHistorySeries
* OpenAPIServer\Model\Tag
* OpenAPIServer\Model\TagCreate
* OpenAPIServer\Model\TagMetadata
* OpenAPIServer\Model\TagModify
* OpenAPIServer\Model\TagModifyAdd
* OpenAPIServer\Model\TagModifyDelete
* OpenAPIServer\Model\TagUpdate
* OpenAPIServer\Model\TaggedAddress
* OpenAPIServer\Model\TaggedAddressBase
* OpenAPIServer\Model\TaggedAsset
* OpenAPIServer\Model\TaggedAssetBase
* OpenAPIServer\Model\TaggedDriver
* OpenAPIServer\Model\TaggedDriverBase
* OpenAPIServer\Model\TaggedMachine
* OpenAPIServer\Model\TaggedMachineBase
* OpenAPIServer\Model\TaggedSensor
* OpenAPIServer\Model\TaggedSensorBase
* OpenAPIServer\Model\TaggedVehicle
* OpenAPIServer\Model\TaggedVehicleBase
* OpenAPIServer\Model\TemperatureResponse
* OpenAPIServer\Model\TemperatureResponseSensors
* OpenAPIServer\Model\TripResponse
* OpenAPIServer\Model\TripResponseEndCoordinates
* OpenAPIServer\Model\TripResponseStartCoordinates
* OpenAPIServer\Model\TripResponseTrips
* OpenAPIServer\Model\User
* OpenAPIServer\Model\UserBase
* OpenAPIServer\Model\UserRole
* OpenAPIServer\Model\UserTagRole
* OpenAPIServer\Model\UserTagRoleTag
* OpenAPIServer\Model\Vehicle
* OpenAPIServer\Model\VehicleHarshEventResponse
* OpenAPIServer\Model\VehicleHarshEventResponseLocation
* OpenAPIServer\Model\VehicleLocation
* OpenAPIServer\Model\VehicleMaintenance
* OpenAPIServer\Model\VehicleMaintenanceJ1939
* OpenAPIServer\Model\VehicleMaintenanceJ1939CheckEngineLight
* OpenAPIServer\Model\VehicleMaintenanceJ1939DiagnosticTroubleCodes
* OpenAPIServer\Model\VehicleMaintenancePassenger
* OpenAPIServer\Model\VehicleMaintenancePassengerCheckEngineLight
* OpenAPIServer\Model\VehicleMaintenancePassengerDiagnosticTroubleCodes
* OpenAPIServer\Model\VehicleSafetyScoreResponse



# org.openapitools.client - Kotlin client library for Samsara API

## Requires

* Kotlin 1.1.2
* Gradle 3.3

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

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

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

 - [org.openapitools.client.models.Address](docs/Address.md)
 - [org.openapitools.client.models.AddressGeofence](docs/AddressGeofence.md)
 - [org.openapitools.client.models.AddressGeofenceCircle](docs/AddressGeofenceCircle.md)
 - [org.openapitools.client.models.AddressGeofencePolygon](docs/AddressGeofencePolygon.md)
 - [org.openapitools.client.models.AddressGeofencePolygonVertices](docs/AddressGeofencePolygonVertices.md)
 - [org.openapitools.client.models.AddressesAddresses](docs/AddressesAddresses.md)
 - [org.openapitools.client.models.AllRouteJobUpdates](docs/AllRouteJobUpdates.md)
 - [org.openapitools.client.models.Asset](docs/Asset.md)
 - [org.openapitools.client.models.AssetCable](docs/AssetCable.md)
 - [org.openapitools.client.models.AssetCurrentLocation](docs/AssetCurrentLocation.md)
 - [org.openapitools.client.models.AssetCurrentLocationsResponse](docs/AssetCurrentLocationsResponse.md)
 - [org.openapitools.client.models.AssetReeferResponse](docs/AssetReeferResponse.md)
 - [org.openapitools.client.models.AssetReeferResponseReeferStats](docs/AssetReeferResponseReeferStats.md)
 - [org.openapitools.client.models.AssetReeferResponseReeferStatsAlarms](docs/AssetReeferResponseReeferStatsAlarms.md)
 - [org.openapitools.client.models.AssetReeferResponseReeferStatsAlarms1](docs/AssetReeferResponseReeferStatsAlarms1.md)
 - [org.openapitools.client.models.AssetReeferResponseReeferStatsEngineHours](docs/AssetReeferResponseReeferStatsEngineHours.md)
 - [org.openapitools.client.models.AssetReeferResponseReeferStatsFuelPercentage](docs/AssetReeferResponseReeferStatsFuelPercentage.md)
 - [org.openapitools.client.models.AssetReeferResponseReeferStatsPowerStatus](docs/AssetReeferResponseReeferStatsPowerStatus.md)
 - [org.openapitools.client.models.AssetReeferResponseReeferStatsReturnAirTemp](docs/AssetReeferResponseReeferStatsReturnAirTemp.md)
 - [org.openapitools.client.models.AssetReeferResponseReeferStatsSetPoint](docs/AssetReeferResponseReeferStatsSetPoint.md)
 - [org.openapitools.client.models.AuxInput](docs/AuxInput.md)
 - [org.openapitools.client.models.AuxInputSeries](docs/AuxInputSeries.md)
 - [org.openapitools.client.models.CargoResponse](docs/CargoResponse.md)
 - [org.openapitools.client.models.CargoResponseSensors](docs/CargoResponseSensors.md)
 - [org.openapitools.client.models.Contact](docs/Contact.md)
 - [org.openapitools.client.models.CurrentDriver](docs/CurrentDriver.md)
 - [org.openapitools.client.models.DataInputHistoryResponse](docs/DataInputHistoryResponse.md)
 - [org.openapitools.client.models.DataInputHistoryResponsePoints](docs/DataInputHistoryResponsePoints.md)
 - [org.openapitools.client.models.DispatchJob](docs/DispatchJob.md)
 - [org.openapitools.client.models.DispatchJobCreate](docs/DispatchJobCreate.md)
 - [org.openapitools.client.models.DispatchRoute](docs/DispatchRoute.md)
 - [org.openapitools.client.models.DispatchRouteBase](docs/DispatchRouteBase.md)
 - [org.openapitools.client.models.DispatchRouteCreate](docs/DispatchRouteCreate.md)
 - [org.openapitools.client.models.DispatchRouteHistoricalEntry](docs/DispatchRouteHistoricalEntry.md)
 - [org.openapitools.client.models.DispatchRouteHistory](docs/DispatchRouteHistory.md)
 - [org.openapitools.client.models.Document](docs/Document.md)
 - [org.openapitools.client.models.DocumentBase](docs/DocumentBase.md)
 - [org.openapitools.client.models.DocumentCreate](docs/DocumentCreate.md)
 - [org.openapitools.client.models.DocumentField](docs/DocumentField.md)
 - [org.openapitools.client.models.DocumentFieldCreate](docs/DocumentFieldCreate.md)
 - [org.openapitools.client.models.DocumentFieldCreatePhotoValue](docs/DocumentFieldCreatePhotoValue.md)
 - [org.openapitools.client.models.DocumentFieldType](docs/DocumentFieldType.md)
 - [org.openapitools.client.models.DocumentFieldTypeNumberValueTypeMetadata](docs/DocumentFieldTypeNumberValueTypeMetadata.md)
 - [org.openapitools.client.models.DocumentType](docs/DocumentType.md)
 - [org.openapitools.client.models.DoorResponse](docs/DoorResponse.md)
 - [org.openapitools.client.models.DoorResponseSensors](docs/DoorResponseSensors.md)
 - [org.openapitools.client.models.Driver](docs/Driver.md)
 - [org.openapitools.client.models.DriverBase](docs/DriverBase.md)
 - [org.openapitools.client.models.DriverDailyLogResponse](docs/DriverDailyLogResponse.md)
 - [org.openapitools.client.models.DriverDailyLogResponseDays](docs/DriverDailyLogResponseDays.md)
 - [org.openapitools.client.models.DriverForCreate](docs/DriverForCreate.md)
 - [org.openapitools.client.models.DriverSafetyScoreResponse](docs/DriverSafetyScoreResponse.md)
 - [org.openapitools.client.models.DriversResponse](docs/DriversResponse.md)
 - [org.openapitools.client.models.DriversSummaryResponse](docs/DriversSummaryResponse.md)
 - [org.openapitools.client.models.DriversSummaryResponseSummaries](docs/DriversSummaryResponseSummaries.md)
 - [org.openapitools.client.models.DvirBase](docs/DvirBase.md)
 - [org.openapitools.client.models.DvirBaseAuthorSignature](docs/DvirBaseAuthorSignature.md)
 - [org.openapitools.client.models.DvirBaseMechanicOrAgentSignature](docs/DvirBaseMechanicOrAgentSignature.md)
 - [org.openapitools.client.models.DvirBaseNextDriverSignature](docs/DvirBaseNextDriverSignature.md)
 - [org.openapitools.client.models.DvirBaseTrailerDefects](docs/DvirBaseTrailerDefects.md)
 - [org.openapitools.client.models.DvirBaseVehicle](docs/DvirBaseVehicle.md)
 - [org.openapitools.client.models.DvirListResponse](docs/DvirListResponse.md)
 - [org.openapitools.client.models.EngineState](docs/EngineState.md)
 - [org.openapitools.client.models.FleetVehicleLocation](docs/FleetVehicleLocation.md)
 - [org.openapitools.client.models.FleetVehicleResponse](docs/FleetVehicleResponse.md)
 - [org.openapitools.client.models.FleetVehicleResponseVehicleInfo](docs/FleetVehicleResponseVehicleInfo.md)
 - [org.openapitools.client.models.HosAuthenticationLogsResponse](docs/HosAuthenticationLogsResponse.md)
 - [org.openapitools.client.models.HosAuthenticationLogsResponseAuthenticationLogs](docs/HosAuthenticationLogsResponseAuthenticationLogs.md)
 - [org.openapitools.client.models.HosLogsResponse](docs/HosLogsResponse.md)
 - [org.openapitools.client.models.HosLogsResponseLogs](docs/HosLogsResponseLogs.md)
 - [org.openapitools.client.models.HosLogsSummaryResponse](docs/HosLogsSummaryResponse.md)
 - [org.openapitools.client.models.HosLogsSummaryResponseDrivers](docs/HosLogsSummaryResponseDrivers.md)
 - [org.openapitools.client.models.HumidityResponse](docs/HumidityResponse.md)
 - [org.openapitools.client.models.HumidityResponseSensors](docs/HumidityResponseSensors.md)
 - [org.openapitools.client.models.InlineObject](docs/InlineObject.md)
 - [org.openapitools.client.models.InlineObject1](docs/InlineObject1.md)
 - [org.openapitools.client.models.InlineObject10](docs/InlineObject10.md)
 - [org.openapitools.client.models.InlineObject11](docs/InlineObject11.md)
 - [org.openapitools.client.models.InlineObject12](docs/InlineObject12.md)
 - [org.openapitools.client.models.InlineObject13](docs/InlineObject13.md)
 - [org.openapitools.client.models.InlineObject14](docs/InlineObject14.md)
 - [org.openapitools.client.models.InlineObject15](docs/InlineObject15.md)
 - [org.openapitools.client.models.InlineObject16](docs/InlineObject16.md)
 - [org.openapitools.client.models.InlineObject17](docs/InlineObject17.md)
 - [org.openapitools.client.models.InlineObject18](docs/InlineObject18.md)
 - [org.openapitools.client.models.InlineObject19](docs/InlineObject19.md)
 - [org.openapitools.client.models.InlineObject2](docs/InlineObject2.md)
 - [org.openapitools.client.models.InlineObject20](docs/InlineObject20.md)
 - [org.openapitools.client.models.InlineObject21](docs/InlineObject21.md)
 - [org.openapitools.client.models.InlineObject22](docs/InlineObject22.md)
 - [org.openapitools.client.models.InlineObject23](docs/InlineObject23.md)
 - [org.openapitools.client.models.InlineObject24](docs/InlineObject24.md)
 - [org.openapitools.client.models.InlineObject3](docs/InlineObject3.md)
 - [org.openapitools.client.models.InlineObject4](docs/InlineObject4.md)
 - [org.openapitools.client.models.InlineObject5](docs/InlineObject5.md)
 - [org.openapitools.client.models.InlineObject6](docs/InlineObject6.md)
 - [org.openapitools.client.models.InlineObject7](docs/InlineObject7.md)
 - [org.openapitools.client.models.InlineObject8](docs/InlineObject8.md)
 - [org.openapitools.client.models.InlineObject9](docs/InlineObject9.md)
 - [org.openapitools.client.models.InlineResponse200](docs/InlineResponse200.md)
 - [org.openapitools.client.models.InlineResponse2001](docs/InlineResponse2001.md)
 - [org.openapitools.client.models.InlineResponse2002](docs/InlineResponse2002.md)
 - [org.openapitools.client.models.InlineResponse2003](docs/InlineResponse2003.md)
 - [org.openapitools.client.models.InlineResponse2004](docs/InlineResponse2004.md)
 - [org.openapitools.client.models.InlineResponse2005](docs/InlineResponse2005.md)
 - [org.openapitools.client.models.InlineResponse2005VehicleStats](docs/InlineResponse2005VehicleStats.md)
 - [org.openapitools.client.models.InlineResponse2006](docs/InlineResponse2006.md)
 - [org.openapitools.client.models.InlineResponse2007](docs/InlineResponse2007.md)
 - [org.openapitools.client.models.InlineResponse2008](docs/InlineResponse2008.md)
 - [org.openapitools.client.models.InlineResponse2009](docs/InlineResponse2009.md)
 - [org.openapitools.client.models.JobStatus](docs/JobStatus.md)
 - [org.openapitools.client.models.JobUpdateObject](docs/JobUpdateObject.md)
 - [org.openapitools.client.models.Machine](docs/Machine.md)
 - [org.openapitools.client.models.MachineHistoryResponse](docs/MachineHistoryResponse.md)
 - [org.openapitools.client.models.MachineHistoryResponseMachines](docs/MachineHistoryResponseMachines.md)
 - [org.openapitools.client.models.MachineHistoryResponseVibrations](docs/MachineHistoryResponseVibrations.md)
 - [org.openapitools.client.models.Pagination](docs/Pagination.md)
 - [org.openapitools.client.models.PrevJobStatus](docs/PrevJobStatus.md)
 - [org.openapitools.client.models.SafetyReportHarshEvent](docs/SafetyReportHarshEvent.md)
 - [org.openapitools.client.models.Sensor](docs/Sensor.md)
 - [org.openapitools.client.models.SensorHistoryResponse](docs/SensorHistoryResponse.md)
 - [org.openapitools.client.models.SensorHistoryResponseResults](docs/SensorHistoryResponseResults.md)
 - [org.openapitools.client.models.SensorsHistorySeries](docs/SensorsHistorySeries.md)
 - [org.openapitools.client.models.Tag](docs/Tag.md)
 - [org.openapitools.client.models.TagCreate](docs/TagCreate.md)
 - [org.openapitools.client.models.TagMetadata](docs/TagMetadata.md)
 - [org.openapitools.client.models.TagModify](docs/TagModify.md)
 - [org.openapitools.client.models.TagModifyAdd](docs/TagModifyAdd.md)
 - [org.openapitools.client.models.TagModifyDelete](docs/TagModifyDelete.md)
 - [org.openapitools.client.models.TagUpdate](docs/TagUpdate.md)
 - [org.openapitools.client.models.TaggedAddress](docs/TaggedAddress.md)
 - [org.openapitools.client.models.TaggedAddressBase](docs/TaggedAddressBase.md)
 - [org.openapitools.client.models.TaggedAsset](docs/TaggedAsset.md)
 - [org.openapitools.client.models.TaggedAssetBase](docs/TaggedAssetBase.md)
 - [org.openapitools.client.models.TaggedDriver](docs/TaggedDriver.md)
 - [org.openapitools.client.models.TaggedDriverBase](docs/TaggedDriverBase.md)
 - [org.openapitools.client.models.TaggedMachine](docs/TaggedMachine.md)
 - [org.openapitools.client.models.TaggedMachineBase](docs/TaggedMachineBase.md)
 - [org.openapitools.client.models.TaggedSensor](docs/TaggedSensor.md)
 - [org.openapitools.client.models.TaggedSensorBase](docs/TaggedSensorBase.md)
 - [org.openapitools.client.models.TaggedVehicle](docs/TaggedVehicle.md)
 - [org.openapitools.client.models.TaggedVehicleBase](docs/TaggedVehicleBase.md)
 - [org.openapitools.client.models.TemperatureResponse](docs/TemperatureResponse.md)
 - [org.openapitools.client.models.TemperatureResponseSensors](docs/TemperatureResponseSensors.md)
 - [org.openapitools.client.models.TripResponse](docs/TripResponse.md)
 - [org.openapitools.client.models.TripResponseEndCoordinates](docs/TripResponseEndCoordinates.md)
 - [org.openapitools.client.models.TripResponseStartCoordinates](docs/TripResponseStartCoordinates.md)
 - [org.openapitools.client.models.TripResponseTrips](docs/TripResponseTrips.md)
 - [org.openapitools.client.models.User](docs/User.md)
 - [org.openapitools.client.models.UserBase](docs/UserBase.md)
 - [org.openapitools.client.models.UserRole](docs/UserRole.md)
 - [org.openapitools.client.models.UserTagRole](docs/UserTagRole.md)
 - [org.openapitools.client.models.UserTagRoleTag](docs/UserTagRoleTag.md)
 - [org.openapitools.client.models.Vehicle](docs/Vehicle.md)
 - [org.openapitools.client.models.VehicleHarshEventResponse](docs/VehicleHarshEventResponse.md)
 - [org.openapitools.client.models.VehicleHarshEventResponseLocation](docs/VehicleHarshEventResponseLocation.md)
 - [org.openapitools.client.models.VehicleLocation](docs/VehicleLocation.md)
 - [org.openapitools.client.models.VehicleMaintenance](docs/VehicleMaintenance.md)
 - [org.openapitools.client.models.VehicleMaintenanceJ1939](docs/VehicleMaintenanceJ1939.md)
 - [org.openapitools.client.models.VehicleMaintenanceJ1939CheckEngineLight](docs/VehicleMaintenanceJ1939CheckEngineLight.md)
 - [org.openapitools.client.models.VehicleMaintenanceJ1939DiagnosticTroubleCodes](docs/VehicleMaintenanceJ1939DiagnosticTroubleCodes.md)
 - [org.openapitools.client.models.VehicleMaintenancePassenger](docs/VehicleMaintenancePassenger.md)
 - [org.openapitools.client.models.VehicleMaintenancePassengerCheckEngineLight](docs/VehicleMaintenancePassengerCheckEngineLight.md)
 - [org.openapitools.client.models.VehicleMaintenancePassengerDiagnosticTroubleCodes](docs/VehicleMaintenancePassengerDiagnosticTroubleCodes.md)
 - [org.openapitools.client.models.VehicleSafetyScoreResponse](docs/VehicleSafetyScoreResponse.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

All endpoints do not require authorization.

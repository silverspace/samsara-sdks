# Samsara API Bash client

## Overview
This is a Bash client script for accessing Samsara API service.

The script uses cURL underneath for making all REST calls.

## Usage

```shell
# Make sure the script has executable rights
$ chmod u+x 

# Print the list of operations available on the service
$ ./ -h

# Print the service description
$ ./ --about

# Print detailed information about specific operation
$ ./ <operationId> -h

# Make GET request
./ --host http://<hostname>:<port> --accept xml <operationId> <queryParam1>=<value1> <header_key1>:<header_value2>

# Make GET request using arbitrary curl options (must be passed before <operationId>) to an SSL service using username:password
 -k -sS --tlsv1.2 --host https://<hostname> -u <user>:<password> --accept xml <operationId> <queryParam1>=<value1> <header_key1>:<header_value2>

# Make POST request
$ echo '<body_content>' |  --host <hostname> --content-type json <operationId> -

# Make POST request with simple JSON content, e.g.:
# {
#   "key1": "value1",
#   "key2": "value2",
#   "key3": 23
# }
$ echo '<body_content>' |  --host <hostname> --content-type json <operationId> key1==value1 key2=value2 key3:=23 -

# Preview the cURL command without actually executing it
$  --host http://<hostname>:<port> --dry-run <operationid>

```

## Docker image
You can easily create a Docker image containing a preconfigured environment
for using the REST Bash client including working autocompletion and short
welcome message with basic instructions, using the generated Dockerfile:

```shell
docker build -t my-rest-client .
docker run -it my-rest-client
```

By default you will be logged into a Zsh environment which has much more
advanced auto completion, but you can switch to Bash, where basic autocompletion
is also available.

## Shell completion

### Bash
The generated bash-completion script can be either directly loaded to the current Bash session using:

```shell
source .bash-completion
```

Alternatively, the script can be copied to the `/etc/bash-completion.d` (or on OSX with Homebrew to `/usr/local/etc/bash-completion.d`):

```shell
sudo cp .bash-completion /etc/bash-completion.d/
```

#### OS X
On OSX you might need to install bash-completion using Homebrew:
```shell
brew install bash-completion
```
and add the following to the `~/.bashrc`:

```shell
if [ -f $(brew --prefix)/etc/bash_completion ]; then
  . $(brew --prefix)/etc/bash_completion
fi
```

### Zsh
In Zsh, the generated `_` Zsh completion file must be copied to one of the folders under `$FPATH` variable.


## Documentation for API Endpoints

All URIs are relative to */v1*

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


## Documentation For Models

 - [Address](docs/Address.md)
 - [AddressGeofence](docs/AddressGeofence.md)
 - [AddressGeofenceCircle](docs/AddressGeofenceCircle.md)
 - [AddressGeofencePolygon](docs/AddressGeofencePolygon.md)
 - [AddressGeofencePolygonVertices](docs/AddressGeofencePolygonVertices.md)
 - [AddressesAddresses](docs/AddressesAddresses.md)
 - [AllRouteJobUpdates](docs/AllRouteJobUpdates.md)
 - [Asset](docs/Asset.md)
 - [AssetCable](docs/AssetCable.md)
 - [AssetCurrentLocation](docs/AssetCurrentLocation.md)
 - [AssetCurrentLocationsResponse](docs/AssetCurrentLocationsResponse.md)
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
 - [CurrentDriver](docs/CurrentDriver.md)
 - [DataInputHistoryResponse](docs/DataInputHistoryResponse.md)
 - [DataInputHistoryResponsePoints](docs/DataInputHistoryResponsePoints.md)
 - [DispatchJob](docs/DispatchJob.md)
 - [DispatchJobCreate](docs/DispatchJobCreate.md)
 - [DispatchRoute](docs/DispatchRoute.md)
 - [DispatchRouteBase](docs/DispatchRouteBase.md)
 - [DispatchRouteCreate](docs/DispatchRouteCreate.md)
 - [DispatchRouteHistoricalEntry](docs/DispatchRouteHistoricalEntry.md)
 - [DispatchRouteHistory](docs/DispatchRouteHistory.md)
 - [Document](docs/Document.md)
 - [DocumentBase](docs/DocumentBase.md)
 - [DocumentCreate](docs/DocumentCreate.md)
 - [DocumentField](docs/DocumentField.md)
 - [DocumentFieldCreate](docs/DocumentFieldCreate.md)
 - [DocumentFieldCreatePhotoValue](docs/DocumentFieldCreatePhotoValue.md)
 - [DocumentFieldType](docs/DocumentFieldType.md)
 - [DocumentFieldTypeNumberValueTypeMetadata](docs/DocumentFieldTypeNumberValueTypeMetadata.md)
 - [DocumentType](docs/DocumentType.md)
 - [DoorResponse](docs/DoorResponse.md)
 - [DoorResponseSensors](docs/DoorResponseSensors.md)
 - [Driver](docs/Driver.md)
 - [DriverBase](docs/DriverBase.md)
 - [DriverDailyLogResponse](docs/DriverDailyLogResponse.md)
 - [DriverDailyLogResponseDays](docs/DriverDailyLogResponseDays.md)
 - [DriverForCreate](docs/DriverForCreate.md)
 - [DriverSafetyScoreResponse](docs/DriverSafetyScoreResponse.md)
 - [DriversResponse](docs/DriversResponse.md)
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
 - [FleetVehicleLocation](docs/FleetVehicleLocation.md)
 - [FleetVehicleResponse](docs/FleetVehicleResponse.md)
 - [FleetVehicleResponseVehicleInfo](docs/FleetVehicleResponseVehicleInfo.md)
 - [HosAuthenticationLogsResponse](docs/HosAuthenticationLogsResponse.md)
 - [HosAuthenticationLogsResponseAuthenticationLogs](docs/HosAuthenticationLogsResponseAuthenticationLogs.md)
 - [HosLogsResponse](docs/HosLogsResponse.md)
 - [HosLogsResponseLogs](docs/HosLogsResponseLogs.md)
 - [HosLogsSummaryResponse](docs/HosLogsSummaryResponse.md)
 - [HosLogsSummaryResponseDrivers](docs/HosLogsSummaryResponseDrivers.md)
 - [HumidityResponse](docs/HumidityResponse.md)
 - [HumidityResponseSensors](docs/HumidityResponseSensors.md)
 - [InlineObject](docs/InlineObject.md)
 - [InlineObject1](docs/InlineObject1.md)
 - [InlineObject10](docs/InlineObject10.md)
 - [InlineObject11](docs/InlineObject11.md)
 - [InlineObject12](docs/InlineObject12.md)
 - [InlineObject13](docs/InlineObject13.md)
 - [InlineObject14](docs/InlineObject14.md)
 - [InlineObject15](docs/InlineObject15.md)
 - [InlineObject16](docs/InlineObject16.md)
 - [InlineObject17](docs/InlineObject17.md)
 - [InlineObject18](docs/InlineObject18.md)
 - [InlineObject19](docs/InlineObject19.md)
 - [InlineObject2](docs/InlineObject2.md)
 - [InlineObject20](docs/InlineObject20.md)
 - [InlineObject21](docs/InlineObject21.md)
 - [InlineObject22](docs/InlineObject22.md)
 - [InlineObject23](docs/InlineObject23.md)
 - [InlineObject24](docs/InlineObject24.md)
 - [InlineObject3](docs/InlineObject3.md)
 - [InlineObject4](docs/InlineObject4.md)
 - [InlineObject5](docs/InlineObject5.md)
 - [InlineObject6](docs/InlineObject6.md)
 - [InlineObject7](docs/InlineObject7.md)
 - [InlineObject8](docs/InlineObject8.md)
 - [InlineObject9](docs/InlineObject9.md)
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
 - [SafetyReportHarshEvent](docs/SafetyReportHarshEvent.md)
 - [Sensor](docs/Sensor.md)
 - [SensorHistoryResponse](docs/SensorHistoryResponse.md)
 - [SensorHistoryResponseResults](docs/SensorHistoryResponseResults.md)
 - [SensorsHistorySeries](docs/SensorsHistorySeries.md)
 - [Tag](docs/Tag.md)
 - [TagCreate](docs/TagCreate.md)
 - [TagMetadata](docs/TagMetadata.md)
 - [TagModify](docs/TagModify.md)
 - [TagModifyAdd](docs/TagModifyAdd.md)
 - [TagModifyDelete](docs/TagModifyDelete.md)
 - [TagUpdate](docs/TagUpdate.md)
 - [TaggedAddress](docs/TaggedAddress.md)
 - [TaggedAddressBase](docs/TaggedAddressBase.md)
 - [TaggedAsset](docs/TaggedAsset.md)
 - [TaggedAssetBase](docs/TaggedAssetBase.md)
 - [TaggedDriver](docs/TaggedDriver.md)
 - [TaggedDriverBase](docs/TaggedDriverBase.md)
 - [TaggedMachine](docs/TaggedMachine.md)
 - [TaggedMachineBase](docs/TaggedMachineBase.md)
 - [TaggedSensor](docs/TaggedSensor.md)
 - [TaggedSensorBase](docs/TaggedSensorBase.md)
 - [TaggedVehicle](docs/TaggedVehicle.md)
 - [TaggedVehicleBase](docs/TaggedVehicleBase.md)
 - [TemperatureResponse](docs/TemperatureResponse.md)
 - [TemperatureResponseSensors](docs/TemperatureResponseSensors.md)
 - [TripResponse](docs/TripResponse.md)
 - [TripResponseEndCoordinates](docs/TripResponseEndCoordinates.md)
 - [TripResponseStartCoordinates](docs/TripResponseStartCoordinates.md)
 - [TripResponseTrips](docs/TripResponseTrips.md)
 - [User](docs/User.md)
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


## Documentation For Authorization

 All endpoints do not require authorization.


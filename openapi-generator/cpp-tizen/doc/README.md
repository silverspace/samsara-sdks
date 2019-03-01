# Documentation for Samsara API 1.0.0 Tizen Client SDK

## How do I get the doc files?
First generate source code by running `openapi-generator`
Then run `doc/generateDocumentation.sh` from the output folder. It will generate all the doc files and put them in the `doc/SDK` directory.
To successfully generate documentation it needs `Doxygen` installed in the path.
*Note* - Before generating the documentation, put the logo of the project as the file `doc/logo.png` before running `doxygen`.


## How do I use this?
This is the structure of the doc folder:

```
.
├── logo.png                  \\Logo of the project
├── Doxyfile                  \\Doxygen config files
├── generateDocumentation.sh  \\Script to run to generate documentation
├── README.md                 \\This file
├── SDK                       \\Documentation for all classes in Samsara API Tizen Client SDK. See ./html/index.html
│   └── html

```

## *tl;dr* run this:

```
doc/generateDocumentation.sh
```

The above SDK folder will be generated. See the index.html inside the SDK folder.


## What's Doxygen?
Doxygen is the de facto standard tool for generating/extracting documentation from annotated/unannotated C++ sources, but it also supports other popular programming languages such as C, Objective-C, C#, PHP, Java, Python, IDL (Corba, Microsoft, and UNO/OpenOffice flavors), Fortran, VHDL, Tcl, and to some extent D.

Check out [Doxygen](https://www.doxygen.org/) for additional information about the Doxygen project.

## I Don't want to run Doxygen. What are the API files for accessing the REST endpoints?
All URIs are relative to https://api.samsara.comhttps://api.samsara.com/v1

### AssetsManager
Method | HTTP request | Description
------------- | ------------- | -------------
*getAllAssetCurrentLocationsSync* | *GET* /fleet/assets/locations | /fleet/assets/locations.
*getAllAssetCurrentLocationsASync* | *GET* /fleet/assets/locations | /fleet/assets/locations.
*getAllAssetsSync* | *GET* /fleet/assets | /fleet/assets.
*getAllAssetsASync* | *GET* /fleet/assets | /fleet/assets.
*getAssetLocationSync* | *GET* /fleet/assets/{asset_id}/locations | /fleet/assets/{assetId:[0-9]+}/locations.
*getAssetLocationASync* | *GET* /fleet/assets/{asset_id}/locations | /fleet/assets/{assetId:[0-9]+}/locations.
*getAssetReeferSync* | *GET* /fleet/assets/{asset_id}/reefer | /fleet/assets/{assetId:[0-9]+}/reefer.
*getAssetReeferASync* | *GET* /fleet/assets/{asset_id}/reefer | /fleet/assets/{assetId:[0-9]+}/reefer.

### DriversManager
Method | HTTP request | Description
------------- | ------------- | -------------
*createDriverSync* | *POST* /fleet/drivers/create | /fleet/drivers/create.
*createDriverASync* | *POST* /fleet/drivers/create | /fleet/drivers/create.
*deactivateDriverSync* | *DELETE* /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}.
*deactivateDriverASync* | *DELETE* /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}.
*getAllDeactivatedDriversSync* | *GET* /fleet/drivers/inactive | /fleet/drivers/inactive.
*getAllDeactivatedDriversASync* | *GET* /fleet/drivers/inactive | /fleet/drivers/inactive.
*getDeactivatedDriverByIdSync* | *GET* /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}.
*getDeactivatedDriverByIdASync* | *GET* /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}.
*getDriverByIdSync* | *GET* /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}.
*getDriverByIdASync* | *GET* /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}.
*reactivateDriverByIdSync* | *PUT* /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}.
*reactivateDriverByIdASync* | *PUT* /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}.

### FleetManager
Method | HTTP request | Description
------------- | ------------- | -------------
*addFleetAddressSync* | *POST* /fleet/add_address | /fleet/add_address.
*addFleetAddressASync* | *POST* /fleet/add_address | /fleet/add_address.
*addOrganizationAddressesSync* | *POST* /addresses | /addresses.
*addOrganizationAddressesASync* | *POST* /addresses | /addresses.
*createDispatchRouteSync* | *POST* /fleet/dispatch/routes | /fleet/dispatch/routes.
*createDispatchRouteASync* | *POST* /fleet/dispatch/routes | /fleet/dispatch/routes.
*createDriverSync* | *POST* /fleet/drivers/create | /fleet/drivers/create.
*createDriverASync* | *POST* /fleet/drivers/create | /fleet/drivers/create.
*createDriverDispatchRouteSync* | *POST* /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes.
*createDriverDispatchRouteASync* | *POST* /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes.
*createDriverDocumentSync* | *POST* /fleet/drivers/{driver_id}/documents | /fleet/drivers/{driver_id:[0-9]+}/documents.
*createDriverDocumentASync* | *POST* /fleet/drivers/{driver_id}/documents | /fleet/drivers/{driver_id:[0-9]+}/documents.
*createDvirSync* | *POST* /fleet/maintenance/dvirs | /fleet/maintenance/dvirs.
*createDvirASync* | *POST* /fleet/maintenance/dvirs | /fleet/maintenance/dvirs.
*createVehicleDispatchRouteSync* | *POST* /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes.
*createVehicleDispatchRouteASync* | *POST* /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes.
*deactivateDriverSync* | *DELETE* /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}.
*deactivateDriverASync* | *DELETE* /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}.
*deleteDispatchRouteByIdSync* | *DELETE* /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/.
*deleteDispatchRouteByIdASync* | *DELETE* /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/.
*deleteOrganizationAddressSync* | *DELETE* /addresses/{addressId} | /addresses/{addressId}.
*deleteOrganizationAddressASync* | *DELETE* /addresses/{addressId} | /addresses/{addressId}.
*fetchAllDispatchRoutesSync* | *GET* /fleet/dispatch/routes | /fleet/dispatch/routes.
*fetchAllDispatchRoutesASync* | *GET* /fleet/dispatch/routes | /fleet/dispatch/routes.
*fetchAllRouteJobUpdatesSync* | *GET* /fleet/dispatch/routes/job_updates | /fleet/dispatch/routes/job_updates.
*fetchAllRouteJobUpdatesASync* | *GET* /fleet/dispatch/routes/job_updates | /fleet/dispatch/routes/job_updates.
*getAllAssetCurrentLocationsSync* | *GET* /fleet/assets/locations | /fleet/assets/locations.
*getAllAssetCurrentLocationsASync* | *GET* /fleet/assets/locations | /fleet/assets/locations.
*getAllAssetsSync* | *GET* /fleet/assets | /fleet/assets.
*getAllAssetsASync* | *GET* /fleet/assets | /fleet/assets.
*getAllDeactivatedDriversSync* | *GET* /fleet/drivers/inactive | /fleet/drivers/inactive.
*getAllDeactivatedDriversASync* | *GET* /fleet/drivers/inactive | /fleet/drivers/inactive.
*getAssetLocationSync* | *GET* /fleet/assets/{asset_id}/locations | /fleet/assets/{assetId:[0-9]+}/locations.
*getAssetLocationASync* | *GET* /fleet/assets/{asset_id}/locations | /fleet/assets/{assetId:[0-9]+}/locations.
*getAssetReeferSync* | *GET* /fleet/assets/{asset_id}/reefer | /fleet/assets/{assetId:[0-9]+}/reefer.
*getAssetReeferASync* | *GET* /fleet/assets/{asset_id}/reefer | /fleet/assets/{assetId:[0-9]+}/reefer.
*getDeactivatedDriverByIdSync* | *GET* /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}.
*getDeactivatedDriverByIdASync* | *GET* /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}.
*getDispatchRouteByIdSync* | *GET* /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}.
*getDispatchRouteByIdASync* | *GET* /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}.
*getDispatchRouteHistorySync* | *GET* /fleet/dispatch/routes/{route_id}/history | /fleet/dispatch/routes/{route_id:[0-9]+}/history.
*getDispatchRouteHistoryASync* | *GET* /fleet/dispatch/routes/{route_id}/history | /fleet/dispatch/routes/{route_id:[0-9]+}/history.
*getDispatchRoutesByDriverIdSync* | *GET* /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes.
*getDispatchRoutesByDriverIdASync* | *GET* /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes.
*getDispatchRoutesByVehicleIdSync* | *GET* /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes.
*getDispatchRoutesByVehicleIdASync* | *GET* /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes.
*getDriverByIdSync* | *GET* /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}.
*getDriverByIdASync* | *GET* /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}.
*getDriverDocumentTypesByOrgIdSync* | *GET* /fleet/drivers/document_types | /fleet/drivers/document_types.
*getDriverDocumentTypesByOrgIdASync* | *GET* /fleet/drivers/document_types | /fleet/drivers/document_types.
*getDriverDocumentsByOrgIdSync* | *GET* /fleet/drivers/documents | /fleet/drivers/documents.
*getDriverDocumentsByOrgIdASync* | *GET* /fleet/drivers/documents | /fleet/drivers/documents.
*getDriverSafetyScoreSync* | *GET* /fleet/drivers/{driverId}/safety/score | /fleet/drivers/{driverId:[0-9]+}/safety/score.
*getDriverSafetyScoreASync* | *GET* /fleet/drivers/{driverId}/safety/score | /fleet/drivers/{driverId:[0-9]+}/safety/score.
*getDvirsSync* | *GET* /fleet/maintenance/dvirs | /fleet/maintenance/dvirs.
*getDvirsASync* | *GET* /fleet/maintenance/dvirs | /fleet/maintenance/dvirs.
*getFleetDriversSync* | *POST* /fleet/drivers | /fleet/drivers.
*getFleetDriversASync* | *POST* /fleet/drivers | /fleet/drivers.
*getFleetDriversHosDailyLogsSync* | *POST* /fleet/drivers/{driver_id}/hos_daily_logs | /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs.
*getFleetDriversHosDailyLogsASync* | *POST* /fleet/drivers/{driver_id}/hos_daily_logs | /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs.
*getFleetDriversSummarySync* | *POST* /fleet/drivers/summary | /fleet/drivers/summary.
*getFleetDriversSummaryASync* | *POST* /fleet/drivers/summary | /fleet/drivers/summary.
*getFleetHosAuthenticationLogsSync* | *POST* /fleet/hos_authentication_logs | /fleet/hos_authentication_logs.
*getFleetHosAuthenticationLogsASync* | *POST* /fleet/hos_authentication_logs | /fleet/hos_authentication_logs.
*getFleetHosLogsSync* | *POST* /fleet/hos_logs | /fleet/hos_logs.
*getFleetHosLogsASync* | *POST* /fleet/hos_logs | /fleet/hos_logs.
*getFleetHosLogsSummarySync* | *POST* /fleet/hos_logs_summary | /fleet/hos_logs_summary.
*getFleetHosLogsSummaryASync* | *POST* /fleet/hos_logs_summary | /fleet/hos_logs_summary.
*getFleetLocationsSync* | *POST* /fleet/locations | /fleet/locations.
*getFleetLocationsASync* | *POST* /fleet/locations | /fleet/locations.
*getFleetMaintenanceListSync* | *POST* /fleet/maintenance/list | /fleet/maintenance/list.
*getFleetMaintenanceListASync* | *POST* /fleet/maintenance/list | /fleet/maintenance/list.
*getFleetTripsSync* | *POST* /fleet/trips | /fleet/trips.
*getFleetTripsASync* | *POST* /fleet/trips | /fleet/trips.
*getFleetVehicleSync* | *GET* /fleet/vehicles/{vehicle_id_or_external_id} | /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}.
*getFleetVehicleASync* | *GET* /fleet/vehicles/{vehicle_id_or_external_id} | /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}.
*getOrganizationAddressSync* | *GET* /addresses/{addressId} | /addresses/{addressId}.
*getOrganizationAddressASync* | *GET* /addresses/{addressId} | /addresses/{addressId}.
*getOrganizationAddressesSync* | *GET* /addresses | /addresses.
*getOrganizationAddressesASync* | *GET* /addresses | /addresses.
*getOrganizationContactSync* | *GET* /contacts/{contact_id} | /contacts/{contact_id}.
*getOrganizationContactASync* | *GET* /contacts/{contact_id} | /contacts/{contact_id}.
*getVehicleHarshEventSync* | *GET* /fleet/vehicles/{vehicleId}/safety/harsh_event | /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event.
*getVehicleHarshEventASync* | *GET* /fleet/vehicles/{vehicleId}/safety/harsh_event | /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event.
*getVehicleLocationsSync* | *GET* /fleet/vehicles/{vehicle_id}/locations | /fleet/vehicles/{vehicle_id:[0-9]+}/locations.
*getVehicleLocationsASync* | *GET* /fleet/vehicles/{vehicle_id}/locations | /fleet/vehicles/{vehicle_id:[0-9]+}/locations.
*getVehicleSafetyScoreSync* | *GET* /fleet/vehicles/{vehicleId}/safety/score | /fleet/vehicles/{vehicleId:[0-9]+}/safety/score.
*getVehicleSafetyScoreASync* | *GET* /fleet/vehicles/{vehicleId}/safety/score | /fleet/vehicles/{vehicleId:[0-9]+}/safety/score.
*getVehicleStatsSync* | *GET* /fleet/vehicles/stats | /fleet/vehicles/stats.
*getVehicleStatsASync* | *GET* /fleet/vehicles/stats | /fleet/vehicles/stats.
*getVehiclesLocationsSync* | *GET* /fleet/vehicles/locations | /fleet/vehicles/locations.
*getVehiclesLocationsASync* | *GET* /fleet/vehicles/locations | /fleet/vehicles/locations.
*listContactsSync* | *GET* /contacts | /contacts.
*listContactsASync* | *GET* /contacts | /contacts.
*listFleetSync* | *POST* /fleet/list | /fleet/list.
*listFleetASync* | *POST* /fleet/list | /fleet/list.
*patchFleetVehicleSync* | *PATCH* /fleet/vehicles/{vehicle_id_or_external_id} | /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}.
*patchFleetVehicleASync* | *PATCH* /fleet/vehicles/{vehicle_id_or_external_id} | /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}.
*reactivateDriverByIdSync* | *PUT* /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}.
*reactivateDriverByIdASync* | *PUT* /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}.
*updateDispatchRouteByIdSync* | *PUT* /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/.
*updateDispatchRouteByIdASync* | *PUT* /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/.
*updateOrganizationAddressSync* | *PATCH* /addresses/{addressId} | /addresses/{addressId}.
*updateOrganizationAddressASync* | *PATCH* /addresses/{addressId} | /addresses/{addressId}.
*updateVehiclesSync* | *POST* /fleet/set_data | /fleet/set_data.
*updateVehiclesASync* | *POST* /fleet/set_data | /fleet/set_data.

### IndustrialManager
Method | HTTP request | Description
------------- | ------------- | -------------
*getAllDataInputsSync* | *GET* /industrial/data | /industrial/data.
*getAllDataInputsASync* | *GET* /industrial/data | /industrial/data.
*getDataInputSync* | *GET* /industrial/data/{data_input_id} | /industrial/data/{data_input_id:[0-9]+}.
*getDataInputASync* | *GET* /industrial/data/{data_input_id} | /industrial/data/{data_input_id:[0-9]+}.
*getMachinesSync* | *POST* /machines/list | /machines/list.
*getMachinesASync* | *POST* /machines/list | /machines/list.
*getMachinesHistorySync* | *POST* /machines/history | /machines/history.
*getMachinesHistoryASync* | *POST* /machines/history | /machines/history.

### RoutesManager
Method | HTTP request | Description
------------- | ------------- | -------------
*createDispatchRouteSync* | *POST* /fleet/dispatch/routes | /fleet/dispatch/routes.
*createDispatchRouteASync* | *POST* /fleet/dispatch/routes | /fleet/dispatch/routes.
*createDriverDispatchRouteSync* | *POST* /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes.
*createDriverDispatchRouteASync* | *POST* /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes.
*createVehicleDispatchRouteSync* | *POST* /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes.
*createVehicleDispatchRouteASync* | *POST* /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes.
*deleteDispatchRouteByIdSync* | *DELETE* /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/.
*deleteDispatchRouteByIdASync* | *DELETE* /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/.
*fetchAllDispatchRoutesSync* | *GET* /fleet/dispatch/routes | /fleet/dispatch/routes.
*fetchAllDispatchRoutesASync* | *GET* /fleet/dispatch/routes | /fleet/dispatch/routes.
*fetchAllRouteJobUpdatesSync* | *GET* /fleet/dispatch/routes/job_updates | /fleet/dispatch/routes/job_updates.
*fetchAllRouteJobUpdatesASync* | *GET* /fleet/dispatch/routes/job_updates | /fleet/dispatch/routes/job_updates.
*getDispatchRouteByIdSync* | *GET* /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}.
*getDispatchRouteByIdASync* | *GET* /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}.
*getDispatchRouteHistorySync* | *GET* /fleet/dispatch/routes/{route_id}/history | /fleet/dispatch/routes/{route_id:[0-9]+}/history.
*getDispatchRouteHistoryASync* | *GET* /fleet/dispatch/routes/{route_id}/history | /fleet/dispatch/routes/{route_id:[0-9]+}/history.
*getDispatchRoutesByDriverIdSync* | *GET* /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes.
*getDispatchRoutesByDriverIdASync* | *GET* /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes.
*getDispatchRoutesByVehicleIdSync* | *GET* /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes.
*getDispatchRoutesByVehicleIdASync* | *GET* /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes.
*updateDispatchRouteByIdSync* | *PUT* /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/.
*updateDispatchRouteByIdASync* | *PUT* /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/.

### SafetyManager
Method | HTTP request | Description
------------- | ------------- | -------------
*getDriverSafetyScoreSync* | *GET* /fleet/drivers/{driverId}/safety/score | /fleet/drivers/{driverId:[0-9]+}/safety/score.
*getDriverSafetyScoreASync* | *GET* /fleet/drivers/{driverId}/safety/score | /fleet/drivers/{driverId:[0-9]+}/safety/score.
*getVehicleHarshEventSync* | *GET* /fleet/vehicles/{vehicleId}/safety/harsh_event | /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event.
*getVehicleHarshEventASync* | *GET* /fleet/vehicles/{vehicleId}/safety/harsh_event | /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event.
*getVehicleSafetyScoreSync* | *GET* /fleet/vehicles/{vehicleId}/safety/score | /fleet/vehicles/{vehicleId:[0-9]+}/safety/score.
*getVehicleSafetyScoreASync* | *GET* /fleet/vehicles/{vehicleId}/safety/score | /fleet/vehicles/{vehicleId:[0-9]+}/safety/score.

### SensorsManager
Method | HTTP request | Description
------------- | ------------- | -------------
*getSensorsSync* | *POST* /sensors/list | /sensors/list.
*getSensorsASync* | *POST* /sensors/list | /sensors/list.
*getSensorsCargoSync* | *POST* /sensors/cargo | /sensors/cargo.
*getSensorsCargoASync* | *POST* /sensors/cargo | /sensors/cargo.
*getSensorsDoorSync* | *POST* /sensors/door | /sensors/door.
*getSensorsDoorASync* | *POST* /sensors/door | /sensors/door.
*getSensorsHistorySync* | *POST* /sensors/history | /sensors/history.
*getSensorsHistoryASync* | *POST* /sensors/history | /sensors/history.
*getSensorsHumiditySync* | *POST* /sensors/humidity | /sensors/humidity.
*getSensorsHumidityASync* | *POST* /sensors/humidity | /sensors/humidity.
*getSensorsTemperatureSync* | *POST* /sensors/temperature | /sensors/temperature.
*getSensorsTemperatureASync* | *POST* /sensors/temperature | /sensors/temperature.

### TagsManager
Method | HTTP request | Description
------------- | ------------- | -------------
*createTagSync* | *POST* /tags | /tags.
*createTagASync* | *POST* /tags | /tags.
*deleteTagByIdSync* | *DELETE* /tags/{tag_id} | /tags/{tag_id:[0-9]+}.
*deleteTagByIdASync* | *DELETE* /tags/{tag_id} | /tags/{tag_id:[0-9]+}.
*getAllTagsSync* | *GET* /tags | /tags.
*getAllTagsASync* | *GET* /tags | /tags.
*getTagByIdSync* | *GET* /tags/{tag_id} | /tags/{tag_id:[0-9]+}.
*getTagByIdASync* | *GET* /tags/{tag_id} | /tags/{tag_id:[0-9]+}.
*modifyTagByIdSync* | *PATCH* /tags/{tag_id} | /tags/{tag_id:[0-9]+}.
*modifyTagByIdASync* | *PATCH* /tags/{tag_id} | /tags/{tag_id:[0-9]+}.
*updateTagByIdSync* | *PUT* /tags/{tag_id} | /tags/{tag_id:[0-9]+}.
*updateTagByIdASync* | *PUT* /tags/{tag_id} | /tags/{tag_id:[0-9]+}.

### UsersManager
Method | HTTP request | Description
------------- | ------------- | -------------
*deleteUserByIdSync* | *DELETE* /users/{userId} | /users/{userId:[0-9]+}.
*deleteUserByIdASync* | *DELETE* /users/{userId} | /users/{userId:[0-9]+}.
*getUserByIdSync* | *GET* /users/{userId} | /users/{userId:[0-9]+}.
*getUserByIdASync* | *GET* /users/{userId} | /users/{userId:[0-9]+}.
*listUserRolesSync* | *GET* /user_roles | /user_roles.
*listUserRolesASync* | *GET* /user_roles | /user_roles.
*listUsersSync* | *GET* /users | /users.
*listUsersASync* | *GET* /users | /users.


## What are the Model files for the data structures/objects?
Class | Description
------------- | -------------
 *Address* | Information about an address/geofence. Geofences are either a circle or a polygon.
 *AddressGeofence* | The geofence that defines this address and its bounds. This can either be a circle, or a polygon - only one key should be provided, depending on the geofence type.
 *AddressGeofence_circle* | Information about a circular geofence. This field is only populated if the geofence is a circle.
 *AddressGeofence_polygon* | Information about a polygon geofence. This field is only populated if the geofence is a polygon.
 *AddressGeofence_polygon_vertices* | 
 *AllRouteJobUpdates* | 
 *Asset* | Basic information of an asset
 *AssetCurrentLocation* | Current location of an asset
 *AssetCurrentLocationsResponse* | Basic information of an asset
 *AssetReeferResponse* | Reefer-specific asset details
 *AssetReeferResponse_reeferStats* | 
 *AssetReeferResponse_reeferStats_alarms* | 
 *AssetReeferResponse_reeferStats_alarms_1* | 
 *AssetReeferResponse_reeferStats_engineHours* | 
 *AssetReeferResponse_reeferStats_fuelPercentage* | 
 *AssetReeferResponse_reeferStats_powerStatus* | 
 *AssetReeferResponse_reeferStats_returnAirTemp* | 
 *AssetReeferResponse_reeferStats_setPoint* | 
 *Asset_cable* | 
 *AuxInput* | Digital value of an aux input.
 *AuxInputSeries* | A list of aux input values over a timerange.
 *CargoResponse* | Contains the current cargo status of a sensor.
 *CargoResponse_sensors* | 
 *Contact* | Information about a notification contact for alerts.
 *CurrentDriver* | 
 *DataInputHistoryResponse* | 
 *DataInputHistoryResponse_points* | 
 *DispatchJob* | 
 *DispatchJobCreate* | 
 *DispatchRoute* | 
 *DispatchRouteBase* | 
 *DispatchRouteCreate* | 
 *DispatchRouteHistoricalEntry* | 
 *DispatchRouteHistory* | 
 *Document* | 
 *DocumentBase* | 
 *DocumentCreate* | 
 *DocumentField* | 
 *DocumentFieldCreate* | 
 *DocumentFieldCreate_photoValue* | 
 *DocumentFieldType* | 
 *DocumentFieldType_numberValueTypeMetadata* | Additional metadata information for a number field type. Only defined when a field type has valueType: ValueType_Number.
 *DocumentType* | 
 *DoorResponse* | Contains the current door status of a sensor.
 *DoorResponse_sensors* | 
 *Driver* | 
 *DriverBase* | 
 *DriverDailyLogResponse* | 
 *DriverDailyLogResponse_days* | 
 *DriverForCreate* | 
 *DriverSafetyScoreResponse* | Safety score details for a driver
 *DriversResponse* | 
 *DriversSummaryResponse* | 
 *DriversSummaryResponse_Summaries* | 
 *DvirBase* | 
 *DvirBase_authorSignature* | The authors signature for the DVIR.
 *DvirBase_mechanicOrAgentSignature* | The mechanic's or agent's signature for the DVIR.
 *DvirBase_nextDriverSignature* | The next driver signature for the DVIR.
 *DvirBase_trailerDefects* | 
 *DvirBase_vehicle* | The vehicle on which DVIR was done.
 *DvirListResponse* | 
 *EngineState* | The state of the vehicle over time. State can be Running, Off, or Idle.
 *FleetVehicleLocation* | Contains the location and speed of a vehicle at a particular time
 *FleetVehicleResponse* | A vehicle object as returned for fleet/vehicle
 *FleetVehicleResponse_vehicleInfo* | 
 *HosAuthenticationLogsResponse* | 
 *HosAuthenticationLogsResponse_authenticationLogs* | 
 *HosLogsResponse* | 
 *HosLogsResponse_logs* | 
 *HosLogsSummaryResponse* | 
 *HosLogsSummaryResponse_drivers* | 
 *HumidityResponse* | Contains the current humidity of a sensor.
 *HumidityResponse_sensors* | 
 *Inline_object* | 
 *Inline_object_1* | 
 *Inline_object_10* | 
 *Inline_object_11* | 
 *Inline_object_12* | 
 *Inline_object_13* | 
 *Inline_object_14* | 
 *Inline_object_15* | 
 *Inline_object_16* | 
 *Inline_object_17* | 
 *Inline_object_18* | 
 *Inline_object_19* | 
 *Inline_object_2* | 
 *Inline_object_20* | 
 *Inline_object_21* | 
 *Inline_object_22* | 
 *Inline_object_23* | 
 *Inline_object_24* | 
 *Inline_object_3* | 
 *Inline_object_4* | 
 *Inline_object_5* | 
 *Inline_object_6* | 
 *Inline_object_7* | 
 *Inline_object_8* | 
 *Inline_object_9* | 
 *Inline_response_200* | 
 *Inline_response_200_1* | 
 *Inline_response_200_2* | 
 *Inline_response_200_3* | 
 *Inline_response_200_4* | 
 *Inline_response_200_5* | 
 *Inline_response_200_5_vehicleStats* | 
 *Inline_response_200_6* | 
 *Inline_response_200_7* | 
 *Inline_response_200_8* | 
 *Inline_response_200_9* | 
 *JobStatus* | The current state of the dispatch job.
 *JobUpdateObject* | 
 *Machine* | Contains information about a machine.
 *MachineHistoryResponse* | Contains the results for a machine history request
 *MachineHistoryResponse_machines* | 
 *MachineHistoryResponse_vibrations* | 
 *Pagination* | 
 *PrevJobStatus* | The previous state of the dispatch job.
 *SafetyReportHarshEvent* | List of harsh events
 *Sensor* | Contains information about a sensor.
 *SensorHistoryResponse* | Contains the results for a sensor history request. Each result contains a timestamp and datapoint for each requested (sensor, field) pair.
 *SensorHistoryResponse_results* | 
 *Tag* | 
 *TagCreate* | 
 *TagMetadata* | 
 *TagModify* | 
 *TagModify_add* | Specify devices, etc. that should be added to the tag.
 *TagModify_delete* | Specify devices, etc. that should be removed from the tag.
 *TagUpdate* | 
 *TaggedAddress* | 
 *TaggedAddressBase* | 
 *TaggedAsset* | 
 *TaggedAssetBase* | 
 *TaggedDriver* | 
 *TaggedDriverBase* | 
 *TaggedMachine* | 
 *TaggedMachineBase* | 
 *TaggedSensor* | 
 *TaggedSensorBase* | 
 *TaggedVehicle* | 
 *TaggedVehicleBase* | 
 *TemperatureResponse* | Contains the current temperatures of a sensor.
 *TemperatureResponse_sensors* | 
 *TripResponse* | Contains the trips for the vehicle in the requested timeframe. A trip is represented as an object that contains startMs, startLocation, startAddress, startCoordinates, endMs, endLocation, endAddress and endCoordinates.
 *TripResponse_endCoordinates* | End (latitude, longitude) in decimal degrees.
 *TripResponse_startCoordinates* | Start (latitude, longitude) in decimal degrees.
 *TripResponse_trips* | 
 *User* | 
 *UserBase* | 
 *UserRole* | 
 *UserTagRole* | 
 *UserTagRole_tag* | 
 *Vehicle* | A vehicle object.
 *VehicleHarshEventResponse* | Harsh event details for a vehicle
 *VehicleHarshEventResponse_location* | 
 *VehicleLocation* | Contains the location, in latitude and longitude, of a vehicle.
 *VehicleMaintenance* | Contains any J1939/Passenger engine light warnings and engine faults.
 *VehicleMaintenance_j1939* | J1939 based data. Null if no data is available.
 *VehicleMaintenance_j1939_checkEngineLight* | J1939 check engine lights.
 *VehicleMaintenance_j1939_diagnosticTroubleCodes* | 
 *VehicleMaintenance_passenger* | Passenger vehicle data. Null if no data is available.
 *VehicleMaintenance_passenger_checkEngineLight* | Passenger vehicle check engine light.
 *VehicleMaintenance_passenger_diagnosticTroubleCodes* | 
 *VehicleSafetyScoreResponse* | Safety score details for a vehicle
 *_addresses_addresses* | 
 *_sensors_history_series* | Sensor ID and field to query.


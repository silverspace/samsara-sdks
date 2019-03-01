# Samsara API API Client

# Introduction\n\nSamsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.\n\nThe Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.\n\nAPI access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.\n\nIf you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)\n\n# Endpoints\n\nAll our APIs can be accessed through HTTP requests to URLs like:\n\n```curl\nhttps://api.samsara.com/<version>/<endpoint>\n```\n\nAll our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.\n\n# Authentication\n\nTo authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.\n\nYour API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.\n\nAuthentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.\n\n```curl\nhttps://api.samsara.com/<version>/<endpoint>?access_token={access_token}\n```\n\nAll API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.\n\n# Request Methods\n\nOur API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.\n\n## GET\n\nGET requests are typically used for fetching data (like data for a particular driver).\n\n## POST\n\nPOST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).\n\n## PUT\n\nPUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).\n\n## PATCH\n\nPATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).\n\n## DELETE\n\nDELETE requests are used for deleting a record (like deleting a tag from the system).\n\n# Response Codes\n\nAll API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.\n\n## 2XX\n\nThese are successful responses and indicate that the API request returned the expected response.\n\n## 4XX\n\nThese indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.\n\n## 5XX\n\nThese indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.\n\n# Error Responses\n\nIn case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.\n\n| Status Code | Message | Description |\n|-------------|----------------|-------------------------------------------------------------------|\n| 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). |\n| 404 | Page not found | The API endpoint being accessed is invalid. |\n| 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |\n\n# Versioning\n\nAll our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.\n\n# FAQs\n\nCheck out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).

## Requirements

- [Salesforce DX](https://www.salesforce.com/products/platform/products/salesforce-dx/)


If everything is set correctly:

- Running `sfdx version` in a command prompt should output something like:

  ```bash
  sfdx-cli/5.7.5-05549de (darwin-amd64) go1.7.5 sfdxstable
  ```


## Installation

1. Copy the output into your Salesforce DX folder - or alternatively deploy the output directly into the workspace.
2. Deploy the code via Salesforce DX to your Scratch Org

   ```bash
   $ sfdx force:source:push
   ```
3. If the API needs authentication update the Named Credential in Setup.
4. Run your Apex tests using

    ```bash
    $ sfdx sfdx force:apex:test:run
    ```
5. Retrieve the job id from the console and check the test results.

  ```bash
  $ sfdx force:apex:test:report -i theJobId
  ```


## Getting Started

Please follow the [installation](#installation) instruction and execute the following Apex code:

```java
OASAssetsApi api = new OASAssetsApi();

Map<String, Object> params = new Map<String, Object>{
    'accessToken' => 'null',
    'groupId' => 2147483648L
};

try {
    // cross your fingers
    OASInlineResponse2001 result = api.getAllAssetCurrentLocations(params);
    System.debug(result);
} catch (OAS.ApiException e) {
    // ...handle your exceptions
}
```

## Documentation for API Endpoints

All URIs are relative to *https://api.samsara.com/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*OASAssetsApi* | [**getAllAssetCurrentLocations**](OASAssetsApi.md#getAllAssetCurrentLocations) | **GET** /fleet/assets/locations | /fleet/assets/locations
*OASAssetsApi* | [**getAllAssets**](OASAssetsApi.md#getAllAssets) | **GET** /fleet/assets | /fleet/assets
*OASAssetsApi* | [**getAssetLocation**](OASAssetsApi.md#getAssetLocation) | **GET** /fleet/assets/{asset_id}/locations | /fleet/assets/{assetId:[0-9]+}/locations
*OASAssetsApi* | [**getAssetReefer**](OASAssetsApi.md#getAssetReefer) | **GET** /fleet/assets/{asset_id}/reefer | /fleet/assets/{assetId:[0-9]+}/reefer
*OASDriversApi* | [**createDriver**](OASDriversApi.md#createDriver) | **POST** /fleet/drivers/create | /fleet/drivers/create
*OASDriversApi* | [**deactivateDriver**](OASDriversApi.md#deactivateDriver) | **DELETE** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*OASDriversApi* | [**getAllDeactivatedDrivers**](OASDriversApi.md#getAllDeactivatedDrivers) | **GET** /fleet/drivers/inactive | /fleet/drivers/inactive
*OASDriversApi* | [**getDeactivatedDriverById**](OASDriversApi.md#getDeactivatedDriverById) | **GET** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*OASDriversApi* | [**getDriverById**](OASDriversApi.md#getDriverById) | **GET** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*OASDriversApi* | [**reactivateDriverById**](OASDriversApi.md#reactivateDriverById) | **PUT** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*OASFleetApi* | [**addFleetAddress**](OASFleetApi.md#addFleetAddress) | **POST** /fleet/add_address | /fleet/add_address
*OASFleetApi* | [**addOrganizationAddresses**](OASFleetApi.md#addOrganizationAddresses) | **POST** /addresses | /addresses
*OASFleetApi* | [**createDispatchRoute**](OASFleetApi.md#createDispatchRoute) | **POST** /fleet/dispatch/routes | /fleet/dispatch/routes
*OASFleetApi* | [**createDriver**](OASFleetApi.md#createDriver) | **POST** /fleet/drivers/create | /fleet/drivers/create
*OASFleetApi* | [**createDriverDispatchRoute**](OASFleetApi.md#createDriverDispatchRoute) | **POST** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
*OASFleetApi* | [**createDriverDocument**](OASFleetApi.md#createDriverDocument) | **POST** /fleet/drivers/{driver_id}/documents | /fleet/drivers/{driver_id:[0-9]+}/documents
*OASFleetApi* | [**createDvir**](OASFleetApi.md#createDvir) | **POST** /fleet/maintenance/dvirs | /fleet/maintenance/dvirs
*OASFleetApi* | [**createVehicleDispatchRoute**](OASFleetApi.md#createVehicleDispatchRoute) | **POST** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
*OASFleetApi* | [**deactivateDriver**](OASFleetApi.md#deactivateDriver) | **DELETE** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*OASFleetApi* | [**deleteDispatchRouteById**](OASFleetApi.md#deleteDispatchRouteById) | **DELETE** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
*OASFleetApi* | [**deleteOrganizationAddress**](OASFleetApi.md#deleteOrganizationAddress) | **DELETE** /addresses/{addressId} | /addresses/{addressId}
*OASFleetApi* | [**fetchAllDispatchRoutes**](OASFleetApi.md#fetchAllDispatchRoutes) | **GET** /fleet/dispatch/routes | /fleet/dispatch/routes
*OASFleetApi* | [**fetchAllRouteJobUpdates**](OASFleetApi.md#fetchAllRouteJobUpdates) | **GET** /fleet/dispatch/routes/job_updates | /fleet/dispatch/routes/job_updates
*OASFleetApi* | [**getAllAssetCurrentLocations**](OASFleetApi.md#getAllAssetCurrentLocations) | **GET** /fleet/assets/locations | /fleet/assets/locations
*OASFleetApi* | [**getAllAssets**](OASFleetApi.md#getAllAssets) | **GET** /fleet/assets | /fleet/assets
*OASFleetApi* | [**getAllDeactivatedDrivers**](OASFleetApi.md#getAllDeactivatedDrivers) | **GET** /fleet/drivers/inactive | /fleet/drivers/inactive
*OASFleetApi* | [**getAssetLocation**](OASFleetApi.md#getAssetLocation) | **GET** /fleet/assets/{asset_id}/locations | /fleet/assets/{assetId:[0-9]+}/locations
*OASFleetApi* | [**getAssetReefer**](OASFleetApi.md#getAssetReefer) | **GET** /fleet/assets/{asset_id}/reefer | /fleet/assets/{assetId:[0-9]+}/reefer
*OASFleetApi* | [**getDeactivatedDriverById**](OASFleetApi.md#getDeactivatedDriverById) | **GET** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*OASFleetApi* | [**getDispatchRouteById**](OASFleetApi.md#getDispatchRouteById) | **GET** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}
*OASFleetApi* | [**getDispatchRouteHistory**](OASFleetApi.md#getDispatchRouteHistory) | **GET** /fleet/dispatch/routes/{route_id}/history | /fleet/dispatch/routes/{route_id:[0-9]+}/history
*OASFleetApi* | [**getDispatchRoutesByDriverId**](OASFleetApi.md#getDispatchRoutesByDriverId) | **GET** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
*OASFleetApi* | [**getDispatchRoutesByVehicleId**](OASFleetApi.md#getDispatchRoutesByVehicleId) | **GET** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
*OASFleetApi* | [**getDriverById**](OASFleetApi.md#getDriverById) | **GET** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*OASFleetApi* | [**getDriverDocumentTypesByOrgId**](OASFleetApi.md#getDriverDocumentTypesByOrgId) | **GET** /fleet/drivers/document_types | /fleet/drivers/document_types
*OASFleetApi* | [**getDriverDocumentsByOrgId**](OASFleetApi.md#getDriverDocumentsByOrgId) | **GET** /fleet/drivers/documents | /fleet/drivers/documents
*OASFleetApi* | [**getDriverSafetyScore**](OASFleetApi.md#getDriverSafetyScore) | **GET** /fleet/drivers/{driverId}/safety/score | /fleet/drivers/{driverId:[0-9]+}/safety/score
*OASFleetApi* | [**getDvirs**](OASFleetApi.md#getDvirs) | **GET** /fleet/maintenance/dvirs | /fleet/maintenance/dvirs
*OASFleetApi* | [**getFleetDrivers**](OASFleetApi.md#getFleetDrivers) | **POST** /fleet/drivers | /fleet/drivers
*OASFleetApi* | [**getFleetDriversHosDailyLogs**](OASFleetApi.md#getFleetDriversHosDailyLogs) | **POST** /fleet/drivers/{driver_id}/hos_daily_logs | /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
*OASFleetApi* | [**getFleetDriversSummary**](OASFleetApi.md#getFleetDriversSummary) | **POST** /fleet/drivers/summary | /fleet/drivers/summary
*OASFleetApi* | [**getFleetHosAuthenticationLogs**](OASFleetApi.md#getFleetHosAuthenticationLogs) | **POST** /fleet/hos_authentication_logs | /fleet/hos_authentication_logs
*OASFleetApi* | [**getFleetHosLogs**](OASFleetApi.md#getFleetHosLogs) | **POST** /fleet/hos_logs | /fleet/hos_logs
*OASFleetApi* | [**getFleetHosLogsSummary**](OASFleetApi.md#getFleetHosLogsSummary) | **POST** /fleet/hos_logs_summary | /fleet/hos_logs_summary
*OASFleetApi* | [**getFleetLocations**](OASFleetApi.md#getFleetLocations) | **POST** /fleet/locations | /fleet/locations
*OASFleetApi* | [**getFleetMaintenanceList**](OASFleetApi.md#getFleetMaintenanceList) | **POST** /fleet/maintenance/list | /fleet/maintenance/list
*OASFleetApi* | [**getFleetTrips**](OASFleetApi.md#getFleetTrips) | **POST** /fleet/trips | /fleet/trips
*OASFleetApi* | [**getFleetVehicle**](OASFleetApi.md#getFleetVehicle) | **GET** /fleet/vehicles/{vehicle_id_or_external_id} | /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*OASFleetApi* | [**getOrganizationAddress**](OASFleetApi.md#getOrganizationAddress) | **GET** /addresses/{addressId} | /addresses/{addressId}
*OASFleetApi* | [**getOrganizationAddresses**](OASFleetApi.md#getOrganizationAddresses) | **GET** /addresses | /addresses
*OASFleetApi* | [**getOrganizationContact**](OASFleetApi.md#getOrganizationContact) | **GET** /contacts/{contact_id} | /contacts/{contact_id}
*OASFleetApi* | [**getVehicleHarshEvent**](OASFleetApi.md#getVehicleHarshEvent) | **GET** /fleet/vehicles/{vehicleId}/safety/harsh_event | /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
*OASFleetApi* | [**getVehicleLocations**](OASFleetApi.md#getVehicleLocations) | **GET** /fleet/vehicles/{vehicle_id}/locations | /fleet/vehicles/{vehicle_id:[0-9]+}/locations
*OASFleetApi* | [**getVehicleSafetyScore**](OASFleetApi.md#getVehicleSafetyScore) | **GET** /fleet/vehicles/{vehicleId}/safety/score | /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
*OASFleetApi* | [**getVehicleStats**](OASFleetApi.md#getVehicleStats) | **GET** /fleet/vehicles/stats | /fleet/vehicles/stats
*OASFleetApi* | [**getVehiclesLocations**](OASFleetApi.md#getVehiclesLocations) | **GET** /fleet/vehicles/locations | /fleet/vehicles/locations
*OASFleetApi* | [**listContacts**](OASFleetApi.md#listContacts) | **GET** /contacts | /contacts
*OASFleetApi* | [**listFleet**](OASFleetApi.md#listFleet) | **POST** /fleet/list | /fleet/list
*OASFleetApi* | [**patchFleetVehicle**](OASFleetApi.md#patchFleetVehicle) | **PATCH** /fleet/vehicles/{vehicle_id_or_external_id} | /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*OASFleetApi* | [**reactivateDriverById**](OASFleetApi.md#reactivateDriverById) | **PUT** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*OASFleetApi* | [**updateDispatchRouteById**](OASFleetApi.md#updateDispatchRouteById) | **PUT** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
*OASFleetApi* | [**updateOrganizationAddress**](OASFleetApi.md#updateOrganizationAddress) | **PATCH** /addresses/{addressId} | /addresses/{addressId}
*OASFleetApi* | [**updateVehicles**](OASFleetApi.md#updateVehicles) | **POST** /fleet/set_data | /fleet/set_data
*OASIndustrialApi* | [**getAllDataInputs**](OASIndustrialApi.md#getAllDataInputs) | **GET** /industrial/data | /industrial/data
*OASIndustrialApi* | [**getDataInput**](OASIndustrialApi.md#getDataInput) | **GET** /industrial/data/{data_input_id} | /industrial/data/{data_input_id:[0-9]+}
*OASIndustrialApi* | [**getMachines**](OASIndustrialApi.md#getMachines) | **POST** /machines/list | /machines/list
*OASIndustrialApi* | [**getMachinesHistory**](OASIndustrialApi.md#getMachinesHistory) | **POST** /machines/history | /machines/history
*OASRoutesApi* | [**createDispatchRoute**](OASRoutesApi.md#createDispatchRoute) | **POST** /fleet/dispatch/routes | /fleet/dispatch/routes
*OASRoutesApi* | [**createDriverDispatchRoute**](OASRoutesApi.md#createDriverDispatchRoute) | **POST** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
*OASRoutesApi* | [**createVehicleDispatchRoute**](OASRoutesApi.md#createVehicleDispatchRoute) | **POST** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
*OASRoutesApi* | [**deleteDispatchRouteById**](OASRoutesApi.md#deleteDispatchRouteById) | **DELETE** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
*OASRoutesApi* | [**fetchAllDispatchRoutes**](OASRoutesApi.md#fetchAllDispatchRoutes) | **GET** /fleet/dispatch/routes | /fleet/dispatch/routes
*OASRoutesApi* | [**fetchAllRouteJobUpdates**](OASRoutesApi.md#fetchAllRouteJobUpdates) | **GET** /fleet/dispatch/routes/job_updates | /fleet/dispatch/routes/job_updates
*OASRoutesApi* | [**getDispatchRouteById**](OASRoutesApi.md#getDispatchRouteById) | **GET** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}
*OASRoutesApi* | [**getDispatchRouteHistory**](OASRoutesApi.md#getDispatchRouteHistory) | **GET** /fleet/dispatch/routes/{route_id}/history | /fleet/dispatch/routes/{route_id:[0-9]+}/history
*OASRoutesApi* | [**getDispatchRoutesByDriverId**](OASRoutesApi.md#getDispatchRoutesByDriverId) | **GET** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
*OASRoutesApi* | [**getDispatchRoutesByVehicleId**](OASRoutesApi.md#getDispatchRoutesByVehicleId) | **GET** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
*OASRoutesApi* | [**updateDispatchRouteById**](OASRoutesApi.md#updateDispatchRouteById) | **PUT** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
*OASSafetyApi* | [**getDriverSafetyScore**](OASSafetyApi.md#getDriverSafetyScore) | **GET** /fleet/drivers/{driverId}/safety/score | /fleet/drivers/{driverId:[0-9]+}/safety/score
*OASSafetyApi* | [**getVehicleHarshEvent**](OASSafetyApi.md#getVehicleHarshEvent) | **GET** /fleet/vehicles/{vehicleId}/safety/harsh_event | /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
*OASSafetyApi* | [**getVehicleSafetyScore**](OASSafetyApi.md#getVehicleSafetyScore) | **GET** /fleet/vehicles/{vehicleId}/safety/score | /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
*OASSensorsApi* | [**getSensors**](OASSensorsApi.md#getSensors) | **POST** /sensors/list | /sensors/list
*OASSensorsApi* | [**getSensorsCargo**](OASSensorsApi.md#getSensorsCargo) | **POST** /sensors/cargo | /sensors/cargo
*OASSensorsApi* | [**getSensorsDoor**](OASSensorsApi.md#getSensorsDoor) | **POST** /sensors/door | /sensors/door
*OASSensorsApi* | [**getSensorsHistory**](OASSensorsApi.md#getSensorsHistory) | **POST** /sensors/history | /sensors/history
*OASSensorsApi* | [**getSensorsHumidity**](OASSensorsApi.md#getSensorsHumidity) | **POST** /sensors/humidity | /sensors/humidity
*OASSensorsApi* | [**getSensorsTemperature**](OASSensorsApi.md#getSensorsTemperature) | **POST** /sensors/temperature | /sensors/temperature
*OASTagsApi* | [**createTag**](OASTagsApi.md#createTag) | **POST** /tags | /tags
*OASTagsApi* | [**deleteTagById**](OASTagsApi.md#deleteTagById) | **DELETE** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
*OASTagsApi* | [**getAllTags**](OASTagsApi.md#getAllTags) | **GET** /tags | /tags
*OASTagsApi* | [**getTagById**](OASTagsApi.md#getTagById) | **GET** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
*OASTagsApi* | [**modifyTagById**](OASTagsApi.md#modifyTagById) | **PATCH** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
*OASTagsApi* | [**updateTagById**](OASTagsApi.md#updateTagById) | **PUT** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
*OASUsersApi* | [**deleteUserById**](OASUsersApi.md#deleteUserById) | **DELETE** /users/{userId} | /users/{userId:[0-9]+}
*OASUsersApi* | [**getUserById**](OASUsersApi.md#getUserById) | **GET** /users/{userId} | /users/{userId:[0-9]+}
*OASUsersApi* | [**listUserRoles**](OASUsersApi.md#listUserRoles) | **GET** /user_roles | /user_roles
*OASUsersApi* | [**listUsers**](OASUsersApi.md#listUsers) | **GET** /users | /users


## Documentation for Models

 - [OASAddress](OASAddress.md)
 - [OASAddressGeofence](OASAddressGeofence.md)
 - [OASAddressGeofenceCircle](OASAddressGeofenceCircle.md)
 - [OASAddressGeofencePolygon](OASAddressGeofencePolygon.md)
 - [OASAddressGeofencePolygonVertices](OASAddressGeofencePolygonVertices.md)
 - [OASAddressesAddresses](OASAddressesAddresses.md)
 - [OASAllRouteJobUpdates](OASAllRouteJobUpdates.md)
 - [OASAsset](OASAsset.md)
 - [OASAssetCable](OASAssetCable.md)
 - [OASAssetCurrentLocation](OASAssetCurrentLocation.md)
 - [OASAssetCurrentLocationsResponse](OASAssetCurrentLocationsResponse.md)
 - [OASAssetReeferResponse](OASAssetReeferResponse.md)
 - [OASAssetReeferResponseReeferStats](OASAssetReeferResponseReeferStats.md)
 - [OASAssetReeferResponseReeferStatsAla](OASAssetReeferResponseReeferStatsAla.md)
 - [OASAssetReeferResponseReeferStatsEng](OASAssetReeferResponseReeferStatsEng.md)
 - [OASAssetReeferResponseReeferStatsFue](OASAssetReeferResponseReeferStatsFue.md)
 - [OASAssetReeferResponseReeferStatsPow](OASAssetReeferResponseReeferStatsPow.md)
 - [OASAssetReeferResponseReeferStatsRet](OASAssetReeferResponseReeferStatsRet.md)
 - [OASAssetReeferResponseReeferStatsSet](OASAssetReeferResponseReeferStatsSet.md)
 - [OASAuxInput](OASAuxInput.md)
 - [OASAuxInputSeries](OASAuxInputSeries.md)
 - [OASCargoResponse](OASCargoResponse.md)
 - [OASCargoResponseSensors](OASCargoResponseSensors.md)
 - [OASContact](OASContact.md)
 - [OASCurrentDriver](OASCurrentDriver.md)
 - [OASDataInputHistoryResponse](OASDataInputHistoryResponse.md)
 - [OASDataInputHistoryResponsePoints](OASDataInputHistoryResponsePoints.md)
 - [OASDispatchJob](OASDispatchJob.md)
 - [OASDispatchJobCreate](OASDispatchJobCreate.md)
 - [OASDispatchRoute](OASDispatchRoute.md)
 - [OASDispatchRouteBase](OASDispatchRouteBase.md)
 - [OASDispatchRouteCreate](OASDispatchRouteCreate.md)
 - [OASDispatchRouteHistoricalEntry](OASDispatchRouteHistoricalEntry.md)
 - [OASDispatchRouteHistory](OASDispatchRouteHistory.md)
 - [OASDocument](OASDocument.md)
 - [OASDocumentBase](OASDocumentBase.md)
 - [OASDocumentCreate](OASDocumentCreate.md)
 - [OASDocumentField](OASDocumentField.md)
 - [OASDocumentFieldCreate](OASDocumentFieldCreate.md)
 - [OASDocumentFieldCreatePhotoValue](OASDocumentFieldCreatePhotoValue.md)
 - [OASDocumentFieldType](OASDocumentFieldType.md)
 - [OASDocumentFieldTypeNumberValueTypeM](OASDocumentFieldTypeNumberValueTypeM.md)
 - [OASDocumentType](OASDocumentType.md)
 - [OASDoorResponse](OASDoorResponse.md)
 - [OASDoorResponseSensors](OASDoorResponseSensors.md)
 - [OASDriver](OASDriver.md)
 - [OASDriverBase](OASDriverBase.md)
 - [OASDriverDailyLogResponse](OASDriverDailyLogResponse.md)
 - [OASDriverDailyLogResponseDays](OASDriverDailyLogResponseDays.md)
 - [OASDriverForCreate](OASDriverForCreate.md)
 - [OASDriverSafetyScoreResponse](OASDriverSafetyScoreResponse.md)
 - [OASDriversResponse](OASDriversResponse.md)
 - [OASDriversSummaryResponse](OASDriversSummaryResponse.md)
 - [OASDriversSummaryResponseSummaries](OASDriversSummaryResponseSummaries.md)
 - [OASDvirBase](OASDvirBase.md)
 - [OASDvirBaseAuthorSignature](OASDvirBaseAuthorSignature.md)
 - [OASDvirBaseMechanicOrAgentSignature](OASDvirBaseMechanicOrAgentSignature.md)
 - [OASDvirBaseNextDriverSignature](OASDvirBaseNextDriverSignature.md)
 - [OASDvirBaseTrailerDefects](OASDvirBaseTrailerDefects.md)
 - [OASDvirBaseVehicle](OASDvirBaseVehicle.md)
 - [OASDvirListResponse](OASDvirListResponse.md)
 - [OASEngineState](OASEngineState.md)
 - [OASFleetVehicleLocation](OASFleetVehicleLocation.md)
 - [OASFleetVehicleResponse](OASFleetVehicleResponse.md)
 - [OASFleetVehicleResponseVehicleInfo](OASFleetVehicleResponseVehicleInfo.md)
 - [OASHosAuthenticationLogsResponse](OASHosAuthenticationLogsResponse.md)
 - [OASHosAuthenticationLogsResponseAuth](OASHosAuthenticationLogsResponseAuth.md)
 - [OASHosLogsResponse](OASHosLogsResponse.md)
 - [OASHosLogsResponseLogs](OASHosLogsResponseLogs.md)
 - [OASHosLogsSummaryResponse](OASHosLogsSummaryResponse.md)
 - [OASHosLogsSummaryResponseDrivers](OASHosLogsSummaryResponseDrivers.md)
 - [OASHumidityResponse](OASHumidityResponse.md)
 - [OASHumidityResponseSensors](OASHumidityResponseSensors.md)
 - [OASInlineObject](OASInlineObject.md)
 - [OASInlineObject1](OASInlineObject1.md)
 - [OASInlineObject10](OASInlineObject10.md)
 - [OASInlineObject11](OASInlineObject11.md)
 - [OASInlineObject12](OASInlineObject12.md)
 - [OASInlineObject13](OASInlineObject13.md)
 - [OASInlineObject14](OASInlineObject14.md)
 - [OASInlineObject15](OASInlineObject15.md)
 - [OASInlineObject16](OASInlineObject16.md)
 - [OASInlineObject17](OASInlineObject17.md)
 - [OASInlineObject18](OASInlineObject18.md)
 - [OASInlineObject19](OASInlineObject19.md)
 - [OASInlineObject2](OASInlineObject2.md)
 - [OASInlineObject20](OASInlineObject20.md)
 - [OASInlineObject21](OASInlineObject21.md)
 - [OASInlineObject22](OASInlineObject22.md)
 - [OASInlineObject23](OASInlineObject23.md)
 - [OASInlineObject24](OASInlineObject24.md)
 - [OASInlineObject3](OASInlineObject3.md)
 - [OASInlineObject4](OASInlineObject4.md)
 - [OASInlineObject5](OASInlineObject5.md)
 - [OASInlineObject6](OASInlineObject6.md)
 - [OASInlineObject7](OASInlineObject7.md)
 - [OASInlineObject8](OASInlineObject8.md)
 - [OASInlineObject9](OASInlineObject9.md)
 - [OASInlineResponse200](OASInlineResponse200.md)
 - [OASInlineResponse2001](OASInlineResponse2001.md)
 - [OASInlineResponse2002](OASInlineResponse2002.md)
 - [OASInlineResponse2003](OASInlineResponse2003.md)
 - [OASInlineResponse2004](OASInlineResponse2004.md)
 - [OASInlineResponse2005](OASInlineResponse2005.md)
 - [OASInlineResponse2005VehicleStats](OASInlineResponse2005VehicleStats.md)
 - [OASInlineResponse2006](OASInlineResponse2006.md)
 - [OASInlineResponse2007](OASInlineResponse2007.md)
 - [OASInlineResponse2008](OASInlineResponse2008.md)
 - [OASInlineResponse2009](OASInlineResponse2009.md)
 - [OASJobStatus](OASJobStatus.md)
 - [OASJobUpdateObject](OASJobUpdateObject.md)
 - [OASMachine](OASMachine.md)
 - [OASMachineHistoryResponse](OASMachineHistoryResponse.md)
 - [OASMachineHistoryResponseMachines](OASMachineHistoryResponseMachines.md)
 - [OASMachineHistoryResponseVibrations](OASMachineHistoryResponseVibrations.md)
 - [OASPagination](OASPagination.md)
 - [OASPrevJobStatus](OASPrevJobStatus.md)
 - [OASSafetyReportHarshEvent](OASSafetyReportHarshEvent.md)
 - [OASSensor](OASSensor.md)
 - [OASSensorHistoryResponse](OASSensorHistoryResponse.md)
 - [OASSensorHistoryResponseResults](OASSensorHistoryResponseResults.md)
 - [OASSensorsHistorySeries](OASSensorsHistorySeries.md)
 - [OASTag](OASTag.md)
 - [OASTagCreate](OASTagCreate.md)
 - [OASTagMetadata](OASTagMetadata.md)
 - [OASTagModify](OASTagModify.md)
 - [OASTagModifyAdd](OASTagModifyAdd.md)
 - [OASTagModifyDelete](OASTagModifyDelete.md)
 - [OASTagUpdate](OASTagUpdate.md)
 - [OASTaggedAddress](OASTaggedAddress.md)
 - [OASTaggedAddressBase](OASTaggedAddressBase.md)
 - [OASTaggedAsset](OASTaggedAsset.md)
 - [OASTaggedAssetBase](OASTaggedAssetBase.md)
 - [OASTaggedDriver](OASTaggedDriver.md)
 - [OASTaggedDriverBase](OASTaggedDriverBase.md)
 - [OASTaggedMachine](OASTaggedMachine.md)
 - [OASTaggedMachineBase](OASTaggedMachineBase.md)
 - [OASTaggedSensor](OASTaggedSensor.md)
 - [OASTaggedSensorBase](OASTaggedSensorBase.md)
 - [OASTaggedVehicle](OASTaggedVehicle.md)
 - [OASTaggedVehicleBase](OASTaggedVehicleBase.md)
 - [OASTemperatureResponse](OASTemperatureResponse.md)
 - [OASTemperatureResponseSensors](OASTemperatureResponseSensors.md)
 - [OASTripResponse](OASTripResponse.md)
 - [OASTripResponseEndCoordinates](OASTripResponseEndCoordinates.md)
 - [OASTripResponseStartCoordinates](OASTripResponseStartCoordinates.md)
 - [OASTripResponseTrips](OASTripResponseTrips.md)
 - [OASUser](OASUser.md)
 - [OASUserBase](OASUserBase.md)
 - [OASUserRole](OASUserRole.md)
 - [OASUserTagRole](OASUserTagRole.md)
 - [OASUserTagRoleTag](OASUserTagRoleTag.md)
 - [OASVehicle](OASVehicle.md)
 - [OASVehicleHarshEventResponse](OASVehicleHarshEventResponse.md)
 - [OASVehicleHarshEventResponseLocation](OASVehicleHarshEventResponseLocation.md)
 - [OASVehicleLocation](OASVehicleLocation.md)
 - [OASVehicleMaintenance](OASVehicleMaintenance.md)
 - [OASVehicleMaintenanceJ1939](OASVehicleMaintenanceJ1939.md)
 - [OASVehicleMaintenanceJ1939CheckEngin](OASVehicleMaintenanceJ1939CheckEngin.md)
 - [OASVehicleMaintenanceJ1939Diagnostic](OASVehicleMaintenanceJ1939Diagnostic.md)
 - [OASVehicleMaintenancePassenger](OASVehicleMaintenancePassenger.md)
 - [OASVehicleMaintenancePassengerCheckE](OASVehicleMaintenancePassengerCheckE.md)
 - [OASVehicleMaintenancePassengerDiagno](OASVehicleMaintenancePassengerDiagno.md)
 - [OASVehicleSafetyScoreResponse](OASVehicleSafetyScoreResponse.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Author




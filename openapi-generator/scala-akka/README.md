# openapi-client

Samsara API
- API version: 1.0.0

# Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*

## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle/SBT

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.openapitools</groupId>
  <artifactId>openapi-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.openapitools:openapi-client:1.0.0"
```

### SBT users

```scala
libraryDependencies += "org.openapitools" % "openapi-client" % "1.0.0"
```

## Getting Started

## Documentation for API Endpoints

All URIs are relative to *https://api.samsara.com/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AssetsApi* | **getAllAssetCurrentLocations** | **GET** /fleet/assets/locations | /fleet/assets/locations
*AssetsApi* | **getAllAssets** | **GET** /fleet/assets | /fleet/assets
*AssetsApi* | **getAssetLocation** | **GET** /fleet/assets/{asset_id}/locations | /fleet/assets/{assetId:[0-9]+}/locations
*AssetsApi* | **getAssetReefer** | **GET** /fleet/assets/{asset_id}/reefer | /fleet/assets/{assetId:[0-9]+}/reefer
*DriversApi* | **createDriver** | **POST** /fleet/drivers/create | /fleet/drivers/create
*DriversApi* | **deactivateDriver** | **DELETE** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*DriversApi* | **getAllDeactivatedDrivers** | **GET** /fleet/drivers/inactive | /fleet/drivers/inactive
*DriversApi* | **getDeactivatedDriverById** | **GET** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*DriversApi* | **getDriverById** | **GET** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*DriversApi* | **reactivateDriverById** | **PUT** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*FleetApi* | **addFleetAddress** | **POST** /fleet/add_address | /fleet/add_address
*FleetApi* | **addOrganizationAddresses** | **POST** /addresses | /addresses
*FleetApi* | **createDispatchRoute** | **POST** /fleet/dispatch/routes | /fleet/dispatch/routes
*FleetApi* | **createDriver** | **POST** /fleet/drivers/create | /fleet/drivers/create
*FleetApi* | **createDriverDispatchRoute** | **POST** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
*FleetApi* | **createDriverDocument** | **POST** /fleet/drivers/{driver_id}/documents | /fleet/drivers/{driver_id:[0-9]+}/documents
*FleetApi* | **createDvir** | **POST** /fleet/maintenance/dvirs | /fleet/maintenance/dvirs
*FleetApi* | **createVehicleDispatchRoute** | **POST** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
*FleetApi* | **deactivateDriver** | **DELETE** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*FleetApi* | **deleteDispatchRouteById** | **DELETE** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
*FleetApi* | **deleteOrganizationAddress** | **DELETE** /addresses/{addressId} | /addresses/{addressId}
*FleetApi* | **fetchAllDispatchRoutes** | **GET** /fleet/dispatch/routes | /fleet/dispatch/routes
*FleetApi* | **fetchAllRouteJobUpdates** | **GET** /fleet/dispatch/routes/job_updates | /fleet/dispatch/routes/job_updates
*FleetApi* | **getAllAssetCurrentLocations** | **GET** /fleet/assets/locations | /fleet/assets/locations
*FleetApi* | **getAllAssets** | **GET** /fleet/assets | /fleet/assets
*FleetApi* | **getAllDeactivatedDrivers** | **GET** /fleet/drivers/inactive | /fleet/drivers/inactive
*FleetApi* | **getAssetLocation** | **GET** /fleet/assets/{asset_id}/locations | /fleet/assets/{assetId:[0-9]+}/locations
*FleetApi* | **getAssetReefer** | **GET** /fleet/assets/{asset_id}/reefer | /fleet/assets/{assetId:[0-9]+}/reefer
*FleetApi* | **getDeactivatedDriverById** | **GET** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*FleetApi* | **getDispatchRouteById** | **GET** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}
*FleetApi* | **getDispatchRouteHistory** | **GET** /fleet/dispatch/routes/{route_id}/history | /fleet/dispatch/routes/{route_id:[0-9]+}/history
*FleetApi* | **getDispatchRoutesByDriverId** | **GET** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
*FleetApi* | **getDispatchRoutesByVehicleId** | **GET** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
*FleetApi* | **getDriverById** | **GET** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*FleetApi* | **getDriverDocumentTypesByOrgId** | **GET** /fleet/drivers/document_types | /fleet/drivers/document_types
*FleetApi* | **getDriverDocumentsByOrgId** | **GET** /fleet/drivers/documents | /fleet/drivers/documents
*FleetApi* | **getDriverSafetyScore** | **GET** /fleet/drivers/{driverId}/safety/score | /fleet/drivers/{driverId:[0-9]+}/safety/score
*FleetApi* | **getDvirs** | **GET** /fleet/maintenance/dvirs | /fleet/maintenance/dvirs
*FleetApi* | **getFleetDrivers** | **POST** /fleet/drivers | /fleet/drivers
*FleetApi* | **getFleetDriversHosDailyLogs** | **POST** /fleet/drivers/{driver_id}/hos_daily_logs | /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
*FleetApi* | **getFleetDriversSummary** | **POST** /fleet/drivers/summary | /fleet/drivers/summary
*FleetApi* | **getFleetHosAuthenticationLogs** | **POST** /fleet/hos_authentication_logs | /fleet/hos_authentication_logs
*FleetApi* | **getFleetHosLogs** | **POST** /fleet/hos_logs | /fleet/hos_logs
*FleetApi* | **getFleetHosLogsSummary** | **POST** /fleet/hos_logs_summary | /fleet/hos_logs_summary
*FleetApi* | **getFleetLocations** | **POST** /fleet/locations | /fleet/locations
*FleetApi* | **getFleetMaintenanceList** | **POST** /fleet/maintenance/list | /fleet/maintenance/list
*FleetApi* | **getFleetTrips** | **POST** /fleet/trips | /fleet/trips
*FleetApi* | **getFleetVehicle** | **GET** /fleet/vehicles/{vehicle_id_or_external_id} | /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*FleetApi* | **getOrganizationAddress** | **GET** /addresses/{addressId} | /addresses/{addressId}
*FleetApi* | **getOrganizationAddresses** | **GET** /addresses | /addresses
*FleetApi* | **getOrganizationContact** | **GET** /contacts/{contact_id} | /contacts/{contact_id}
*FleetApi* | **getVehicleHarshEvent** | **GET** /fleet/vehicles/{vehicleId}/safety/harsh_event | /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
*FleetApi* | **getVehicleLocations** | **GET** /fleet/vehicles/{vehicle_id}/locations | /fleet/vehicles/{vehicle_id:[0-9]+}/locations
*FleetApi* | **getVehicleSafetyScore** | **GET** /fleet/vehicles/{vehicleId}/safety/score | /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
*FleetApi* | **getVehicleStats** | **GET** /fleet/vehicles/stats | /fleet/vehicles/stats
*FleetApi* | **getVehiclesLocations** | **GET** /fleet/vehicles/locations | /fleet/vehicles/locations
*FleetApi* | **listContacts** | **GET** /contacts | /contacts
*FleetApi* | **listFleet** | **POST** /fleet/list | /fleet/list
*FleetApi* | **patchFleetVehicle** | **PATCH** /fleet/vehicles/{vehicle_id_or_external_id} | /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*FleetApi* | **reactivateDriverById** | **PUT** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*FleetApi* | **updateDispatchRouteById** | **PUT** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
*FleetApi* | **updateOrganizationAddress** | **PATCH** /addresses/{addressId} | /addresses/{addressId}
*FleetApi* | **updateVehicles** | **POST** /fleet/set_data | /fleet/set_data
*IndustrialApi* | **getAllDataInputs** | **GET** /industrial/data | /industrial/data
*IndustrialApi* | **getDataInput** | **GET** /industrial/data/{data_input_id} | /industrial/data/{data_input_id:[0-9]+}
*IndustrialApi* | **getMachines** | **POST** /machines/list | /machines/list
*IndustrialApi* | **getMachinesHistory** | **POST** /machines/history | /machines/history
*RoutesApi* | **createDispatchRoute** | **POST** /fleet/dispatch/routes | /fleet/dispatch/routes
*RoutesApi* | **createDriverDispatchRoute** | **POST** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
*RoutesApi* | **createVehicleDispatchRoute** | **POST** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
*RoutesApi* | **deleteDispatchRouteById** | **DELETE** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
*RoutesApi* | **fetchAllDispatchRoutes** | **GET** /fleet/dispatch/routes | /fleet/dispatch/routes
*RoutesApi* | **fetchAllRouteJobUpdates** | **GET** /fleet/dispatch/routes/job_updates | /fleet/dispatch/routes/job_updates
*RoutesApi* | **getDispatchRouteById** | **GET** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}
*RoutesApi* | **getDispatchRouteHistory** | **GET** /fleet/dispatch/routes/{route_id}/history | /fleet/dispatch/routes/{route_id:[0-9]+}/history
*RoutesApi* | **getDispatchRoutesByDriverId** | **GET** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
*RoutesApi* | **getDispatchRoutesByVehicleId** | **GET** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
*RoutesApi* | **updateDispatchRouteById** | **PUT** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
*SafetyApi* | **getDriverSafetyScore** | **GET** /fleet/drivers/{driverId}/safety/score | /fleet/drivers/{driverId:[0-9]+}/safety/score
*SafetyApi* | **getVehicleHarshEvent** | **GET** /fleet/vehicles/{vehicleId}/safety/harsh_event | /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
*SafetyApi* | **getVehicleSafetyScore** | **GET** /fleet/vehicles/{vehicleId}/safety/score | /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
*SensorsApi* | **getSensors** | **POST** /sensors/list | /sensors/list
*SensorsApi* | **getSensorsCargo** | **POST** /sensors/cargo | /sensors/cargo
*SensorsApi* | **getSensorsDoor** | **POST** /sensors/door | /sensors/door
*SensorsApi* | **getSensorsHistory** | **POST** /sensors/history | /sensors/history
*SensorsApi* | **getSensorsHumidity** | **POST** /sensors/humidity | /sensors/humidity
*SensorsApi* | **getSensorsTemperature** | **POST** /sensors/temperature | /sensors/temperature
*TagsApi* | **createTag** | **POST** /tags | /tags
*TagsApi* | **deleteTagById** | **DELETE** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
*TagsApi* | **getAllTags** | **GET** /tags | /tags
*TagsApi* | **getTagById** | **GET** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
*TagsApi* | **modifyTagById** | **PATCH** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
*TagsApi* | **updateTagById** | **PUT** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
*UsersApi* | **deleteUserById** | **DELETE** /users/{userId} | /users/{userId:[0-9]+}
*UsersApi* | **getUserById** | **GET** /users/{userId} | /users/{userId:[0-9]+}
*UsersApi* | **listUserRoles** | **GET** /user_roles | /user_roles
*UsersApi* | **listUsers** | **GET** /users | /users


## Documentation for Models

 - [Address](Address.md)
 - [AddressGeofence](AddressGeofence.md)
 - [AddressGeofenceCircle](AddressGeofenceCircle.md)
 - [AddressGeofencePolygon](AddressGeofencePolygon.md)
 - [AddressGeofencePolygonVertices](AddressGeofencePolygonVertices.md)
 - [AddressesAddresses](AddressesAddresses.md)
 - [AllRouteJobUpdates](AllRouteJobUpdates.md)
 - [Asset](Asset.md)
 - [AssetCable](AssetCable.md)
 - [AssetCurrentLocation](AssetCurrentLocation.md)
 - [AssetCurrentLocationsResponse](AssetCurrentLocationsResponse.md)
 - [AssetReeferResponse](AssetReeferResponse.md)
 - [AssetReeferResponseReeferStats](AssetReeferResponseReeferStats.md)
 - [AssetReeferResponseReeferStatsAlarms](AssetReeferResponseReeferStatsAlarms.md)
 - [AssetReeferResponseReeferStatsAlarms1](AssetReeferResponseReeferStatsAlarms1.md)
 - [AssetReeferResponseReeferStatsEngineHours](AssetReeferResponseReeferStatsEngineHours.md)
 - [AssetReeferResponseReeferStatsFuelPercentage](AssetReeferResponseReeferStatsFuelPercentage.md)
 - [AssetReeferResponseReeferStatsPowerStatus](AssetReeferResponseReeferStatsPowerStatus.md)
 - [AssetReeferResponseReeferStatsReturnAirTemp](AssetReeferResponseReeferStatsReturnAirTemp.md)
 - [AssetReeferResponseReeferStatsSetPoint](AssetReeferResponseReeferStatsSetPoint.md)
 - [AuxInput](AuxInput.md)
 - [AuxInputSeries](AuxInputSeries.md)
 - [CargoResponse](CargoResponse.md)
 - [CargoResponseSensors](CargoResponseSensors.md)
 - [Contact](Contact.md)
 - [CurrentDriver](CurrentDriver.md)
 - [DataInputHistoryResponse](DataInputHistoryResponse.md)
 - [DataInputHistoryResponsePoints](DataInputHistoryResponsePoints.md)
 - [DispatchJob](DispatchJob.md)
 - [DispatchJobCreate](DispatchJobCreate.md)
 - [DispatchRoute](DispatchRoute.md)
 - [DispatchRouteBase](DispatchRouteBase.md)
 - [DispatchRouteCreate](DispatchRouteCreate.md)
 - [DispatchRouteHistoricalEntry](DispatchRouteHistoricalEntry.md)
 - [DispatchRouteHistory](DispatchRouteHistory.md)
 - [Document](Document.md)
 - [DocumentBase](DocumentBase.md)
 - [DocumentCreate](DocumentCreate.md)
 - [DocumentField](DocumentField.md)
 - [DocumentFieldCreate](DocumentFieldCreate.md)
 - [DocumentFieldCreatePhotoValue](DocumentFieldCreatePhotoValue.md)
 - [DocumentFieldType](DocumentFieldType.md)
 - [DocumentFieldTypeNumberValueTypeMetadata](DocumentFieldTypeNumberValueTypeMetadata.md)
 - [DocumentType](DocumentType.md)
 - [DoorResponse](DoorResponse.md)
 - [DoorResponseSensors](DoorResponseSensors.md)
 - [Driver](Driver.md)
 - [DriverBase](DriverBase.md)
 - [DriverDailyLogResponse](DriverDailyLogResponse.md)
 - [DriverDailyLogResponseDays](DriverDailyLogResponseDays.md)
 - [DriverForCreate](DriverForCreate.md)
 - [DriverSafetyScoreResponse](DriverSafetyScoreResponse.md)
 - [DriversResponse](DriversResponse.md)
 - [DriversSummaryResponse](DriversSummaryResponse.md)
 - [DriversSummaryResponseSummaries](DriversSummaryResponseSummaries.md)
 - [DvirBase](DvirBase.md)
 - [DvirBaseAuthorSignature](DvirBaseAuthorSignature.md)
 - [DvirBaseMechanicOrAgentSignature](DvirBaseMechanicOrAgentSignature.md)
 - [DvirBaseNextDriverSignature](DvirBaseNextDriverSignature.md)
 - [DvirBaseTrailerDefects](DvirBaseTrailerDefects.md)
 - [DvirBaseVehicle](DvirBaseVehicle.md)
 - [DvirListResponse](DvirListResponse.md)
 - [EngineState](EngineState.md)
 - [FleetVehicleLocation](FleetVehicleLocation.md)
 - [FleetVehicleResponse](FleetVehicleResponse.md)
 - [FleetVehicleResponseVehicleInfo](FleetVehicleResponseVehicleInfo.md)
 - [HosAuthenticationLogsResponse](HosAuthenticationLogsResponse.md)
 - [HosAuthenticationLogsResponseAuthenticationLogs](HosAuthenticationLogsResponseAuthenticationLogs.md)
 - [HosLogsResponse](HosLogsResponse.md)
 - [HosLogsResponseLogs](HosLogsResponseLogs.md)
 - [HosLogsSummaryResponse](HosLogsSummaryResponse.md)
 - [HosLogsSummaryResponseDrivers](HosLogsSummaryResponseDrivers.md)
 - [HumidityResponse](HumidityResponse.md)
 - [HumidityResponseSensors](HumidityResponseSensors.md)
 - [InlineObject](InlineObject.md)
 - [InlineObject1](InlineObject1.md)
 - [InlineObject10](InlineObject10.md)
 - [InlineObject11](InlineObject11.md)
 - [InlineObject12](InlineObject12.md)
 - [InlineObject13](InlineObject13.md)
 - [InlineObject14](InlineObject14.md)
 - [InlineObject15](InlineObject15.md)
 - [InlineObject16](InlineObject16.md)
 - [InlineObject17](InlineObject17.md)
 - [InlineObject18](InlineObject18.md)
 - [InlineObject19](InlineObject19.md)
 - [InlineObject2](InlineObject2.md)
 - [InlineObject20](InlineObject20.md)
 - [InlineObject21](InlineObject21.md)
 - [InlineObject22](InlineObject22.md)
 - [InlineObject23](InlineObject23.md)
 - [InlineObject24](InlineObject24.md)
 - [InlineObject3](InlineObject3.md)
 - [InlineObject4](InlineObject4.md)
 - [InlineObject5](InlineObject5.md)
 - [InlineObject6](InlineObject6.md)
 - [InlineObject7](InlineObject7.md)
 - [InlineObject8](InlineObject8.md)
 - [InlineObject9](InlineObject9.md)
 - [InlineResponse200](InlineResponse200.md)
 - [InlineResponse2001](InlineResponse2001.md)
 - [InlineResponse2002](InlineResponse2002.md)
 - [InlineResponse2003](InlineResponse2003.md)
 - [InlineResponse2004](InlineResponse2004.md)
 - [InlineResponse2005](InlineResponse2005.md)
 - [InlineResponse2005VehicleStats](InlineResponse2005VehicleStats.md)
 - [InlineResponse2006](InlineResponse2006.md)
 - [InlineResponse2007](InlineResponse2007.md)
 - [InlineResponse2008](InlineResponse2008.md)
 - [InlineResponse2009](InlineResponse2009.md)
 - [JobStatus](JobStatus.md)
 - [JobUpdateObject](JobUpdateObject.md)
 - [Machine](Machine.md)
 - [MachineHistoryResponse](MachineHistoryResponse.md)
 - [MachineHistoryResponseMachines](MachineHistoryResponseMachines.md)
 - [MachineHistoryResponseVibrations](MachineHistoryResponseVibrations.md)
 - [Pagination](Pagination.md)
 - [PrevJobStatus](PrevJobStatus.md)
 - [SafetyReportHarshEvent](SafetyReportHarshEvent.md)
 - [Sensor](Sensor.md)
 - [SensorHistoryResponse](SensorHistoryResponse.md)
 - [SensorHistoryResponseResults](SensorHistoryResponseResults.md)
 - [SensorsHistorySeries](SensorsHistorySeries.md)
 - [Tag](Tag.md)
 - [TagCreate](TagCreate.md)
 - [TagMetadata](TagMetadata.md)
 - [TagModify](TagModify.md)
 - [TagModifyAdd](TagModifyAdd.md)
 - [TagModifyDelete](TagModifyDelete.md)
 - [TagUpdate](TagUpdate.md)
 - [TaggedAddress](TaggedAddress.md)
 - [TaggedAddressBase](TaggedAddressBase.md)
 - [TaggedAsset](TaggedAsset.md)
 - [TaggedAssetBase](TaggedAssetBase.md)
 - [TaggedDriver](TaggedDriver.md)
 - [TaggedDriverBase](TaggedDriverBase.md)
 - [TaggedMachine](TaggedMachine.md)
 - [TaggedMachineBase](TaggedMachineBase.md)
 - [TaggedSensor](TaggedSensor.md)
 - [TaggedSensorBase](TaggedSensorBase.md)
 - [TaggedVehicle](TaggedVehicle.md)
 - [TaggedVehicleBase](TaggedVehicleBase.md)
 - [TemperatureResponse](TemperatureResponse.md)
 - [TemperatureResponseSensors](TemperatureResponseSensors.md)
 - [TripResponse](TripResponse.md)
 - [TripResponseEndCoordinates](TripResponseEndCoordinates.md)
 - [TripResponseStartCoordinates](TripResponseStartCoordinates.md)
 - [TripResponseTrips](TripResponseTrips.md)
 - [User](User.md)
 - [UserBase](UserBase.md)
 - [UserRole](UserRole.md)
 - [UserTagRole](UserTagRole.md)
 - [UserTagRoleTag](UserTagRoleTag.md)
 - [Vehicle](Vehicle.md)
 - [VehicleHarshEventResponse](VehicleHarshEventResponse.md)
 - [VehicleHarshEventResponseLocation](VehicleHarshEventResponseLocation.md)
 - [VehicleLocation](VehicleLocation.md)
 - [VehicleMaintenance](VehicleMaintenance.md)
 - [VehicleMaintenanceJ1939](VehicleMaintenanceJ1939.md)
 - [VehicleMaintenanceJ1939CheckEngineLight](VehicleMaintenanceJ1939CheckEngineLight.md)
 - [VehicleMaintenanceJ1939DiagnosticTroubleCodes](VehicleMaintenanceJ1939DiagnosticTroubleCodes.md)
 - [VehicleMaintenancePassenger](VehicleMaintenancePassenger.md)
 - [VehicleMaintenancePassengerCheckEngineLight](VehicleMaintenancePassengerCheckEngineLight.md)
 - [VehicleMaintenancePassengerDiagnosticTroubleCodes](VehicleMaintenancePassengerDiagnosticTroubleCodes.md)
 - [VehicleSafetyScoreResponse](VehicleSafetyScoreResponse.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Author



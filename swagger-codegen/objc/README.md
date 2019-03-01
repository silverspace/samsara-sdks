# SwaggerClient

# Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).

This ObjC package is automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen) project:

- API version: 1.0.0
- Package version: 
- Build package: io.swagger.codegen.languages.ObjcClientCodegen

## Requirements

The SDK requires [**ARC (Automatic Reference Counting)**](http://stackoverflow.com/questions/7778356/how-to-enable-disable-automatic-reference-counting) to be enabled in the Xcode project.

## Installation & Usage
### Install from Github using [CocoaPods](https://cocoapods.org/)

Add the following to the Podfile:

```ruby
pod 'SwaggerClient', :git => 'https://github.com/GIT_USER_ID/GIT_REPO_ID.git'
```

To specify a particular branch, append `, :branch => 'branch-name-here'`

To specify a particular commit, append `, :commit => '11aa22'`

### Install from local path using [CocoaPods](https://cocoapods.org/)

Put the SDK under your project folder (e.g. /path/to/objc_project/Vendor/SwaggerClient) and then add the following to the Podfile:

```ruby
pod 'SwaggerClient', :path => 'Vendor/SwaggerClient'
```

### Usage

Import the following:

```objc
#import <SwaggerClient/SWGApiClient.h>
#import <SwaggerClient/SWGDefaultConfiguration.h>
// load models
#import <SwaggerClient/SWGAddress.h>
#import <SwaggerClient/SWGAddressGeofence.h>
#import <SwaggerClient/SWGAddressGeofenceCircle.h>
#import <SwaggerClient/SWGAddressGeofencePolygon.h>
#import <SwaggerClient/SWGAddressGeofencePolygonVertices.h>
#import <SwaggerClient/SWGAddressNotes.h>
#import <SwaggerClient/SWGAddressParam.h>
#import <SwaggerClient/SWGAddresses.h>
#import <SwaggerClient/SWGAddressesAddresses.h>
#import <SwaggerClient/SWGAllRouteJobUpdates.h>
#import <SwaggerClient/SWGAsset.h>
#import <SwaggerClient/SWGAssetCable.h>
#import <SwaggerClient/SWGAssetCurrentLocation.h>
#import <SwaggerClient/SWGAssetCurrentLocationsResponse.h>
#import <SwaggerClient/SWGAssetLocationResponse.h>
#import <SwaggerClient/SWGAssetLocationResponseInner.h>
#import <SwaggerClient/SWGAssetReeferResponse.h>
#import <SwaggerClient/SWGAssetReeferResponseReeferStats.h>
#import <SwaggerClient/SWGAssetReeferResponseReeferStatsAlarms.h>
#import <SwaggerClient/SWGAssetReeferResponseReeferStatsAlarms1.h>
#import <SwaggerClient/SWGAssetReeferResponseReeferStatsEngineHours.h>
#import <SwaggerClient/SWGAssetReeferResponseReeferStatsFuelPercentage.h>
#import <SwaggerClient/SWGAssetReeferResponseReeferStatsPowerStatus.h>
#import <SwaggerClient/SWGAssetReeferResponseReeferStatsReturnAirTemp.h>
#import <SwaggerClient/SWGAssetReeferResponseReeferStatsSetPoint.h>
#import <SwaggerClient/SWGAuxInput.h>
#import <SwaggerClient/SWGAuxInputSeries.h>
#import <SwaggerClient/SWGCargoResponse.h>
#import <SwaggerClient/SWGCargoResponseSensors.h>
#import <SwaggerClient/SWGContact.h>
#import <SwaggerClient/SWGContactIds.h>
#import <SwaggerClient/SWGCreateDvirParam.h>
#import <SwaggerClient/SWGCurrentDriver.h>
#import <SwaggerClient/SWGData.h>
#import <SwaggerClient/SWGDataInputHistoryResponse.h>
#import <SwaggerClient/SWGDataInputHistoryResponsePoints.h>
#import <SwaggerClient/SWGDispatchJobCreate.h>
#import <SwaggerClient/SWGDispatchRouteBase.h>
#import <SwaggerClient/SWGDispatchRouteHistoricalEntry.h>
#import <SwaggerClient/SWGDispatchRouteHistory.h>
#import <SwaggerClient/SWGDispatchRoutes.h>
#import <SwaggerClient/SWGDocumentBase.h>
#import <SwaggerClient/SWGDocumentFieldCreate.h>
#import <SwaggerClient/SWGDocumentFieldCreatePhotoValue.h>
#import <SwaggerClient/SWGDocumentFieldType.h>
#import <SwaggerClient/SWGDocumentFieldTypeNumberValueTypeMetadata.h>
#import <SwaggerClient/SWGDocumentFieldTypes.h>
#import <SwaggerClient/SWGDocumentType.h>
#import <SwaggerClient/SWGDocumentTypes.h>
#import <SwaggerClient/SWGDocuments.h>
#import <SwaggerClient/SWGDoorResponse.h>
#import <SwaggerClient/SWGDoorResponseSensors.h>
#import <SwaggerClient/SWGDriverBase.h>
#import <SwaggerClient/SWGDriverDailyLogResponse.h>
#import <SwaggerClient/SWGDriverDailyLogResponseDays.h>
#import <SwaggerClient/SWGDriverSafetyScoreResponse.h>
#import <SwaggerClient/SWGDriversResponse.h>
#import <SwaggerClient/SWGDriversSummaryParam.h>
#import <SwaggerClient/SWGDriversSummaryResponse.h>
#import <SwaggerClient/SWGDriversSummaryResponseSummaries.h>
#import <SwaggerClient/SWGDvirBase.h>
#import <SwaggerClient/SWGDvirBaseAuthorSignature.h>
#import <SwaggerClient/SWGDvirBaseMechanicOrAgentSignature.h>
#import <SwaggerClient/SWGDvirBaseNextDriverSignature.h>
#import <SwaggerClient/SWGDvirBaseTrailerDefects.h>
#import <SwaggerClient/SWGDvirBaseVehicle.h>
#import <SwaggerClient/SWGDvirListResponse.h>
#import <SwaggerClient/SWGEngineState.h>
#import <SwaggerClient/SWGErrorResponse.h>
#import <SwaggerClient/SWGFleetVehicleLocation.h>
#import <SwaggerClient/SWGFleetVehicleLocations.h>
#import <SwaggerClient/SWGFleetVehicleResponse.h>
#import <SwaggerClient/SWGFleetVehicleResponseVehicleInfo.h>
#import <SwaggerClient/SWGFleetVehiclesLocations.h>
#import <SwaggerClient/SWGFleetVehiclesLocationsInner.h>
#import <SwaggerClient/SWGGroupDriversParam.h>
#import <SwaggerClient/SWGGroupParam.h>
#import <SwaggerClient/SWGHistoryParam.h>
#import <SwaggerClient/SWGHistoryParam1.h>
#import <SwaggerClient/SWGHosAuthenticationLogsParam.h>
#import <SwaggerClient/SWGHosAuthenticationLogsResponse.h>
#import <SwaggerClient/SWGHosAuthenticationLogsResponseAuthenticationLogs.h>
#import <SwaggerClient/SWGHosLogsParam.h>
#import <SwaggerClient/SWGHosLogsParam1.h>
#import <SwaggerClient/SWGHosLogsParam2.h>
#import <SwaggerClient/SWGHosLogsResponse.h>
#import <SwaggerClient/SWGHosLogsResponseLogs.h>
#import <SwaggerClient/SWGHosLogsSummaryResponse.h>
#import <SwaggerClient/SWGHosLogsSummaryResponseDrivers.h>
#import <SwaggerClient/SWGHumidityResponse.h>
#import <SwaggerClient/SWGHumidityResponseSensors.h>
#import <SwaggerClient/SWGInlineResponse200.h>
#import <SwaggerClient/SWGInlineResponse2001.h>
#import <SwaggerClient/SWGInlineResponse2002.h>
#import <SwaggerClient/SWGInlineResponse2003.h>
#import <SwaggerClient/SWGInlineResponse2004.h>
#import <SwaggerClient/SWGInlineResponse2005.h>
#import <SwaggerClient/SWGInlineResponse2005VehicleStats.h>
#import <SwaggerClient/SWGInlineResponse2006.h>
#import <SwaggerClient/SWGInlineResponse2007.h>
#import <SwaggerClient/SWGInlineResponse2008.h>
#import <SwaggerClient/SWGInlineResponse2009.h>
#import <SwaggerClient/SWGJobStatus.h>
#import <SwaggerClient/SWGJobUpdateObject.h>
#import <SwaggerClient/SWGMachine.h>
#import <SwaggerClient/SWGMachineHistoryResponse.h>
#import <SwaggerClient/SWGMachineHistoryResponseMachines.h>
#import <SwaggerClient/SWGMachineHistoryResponseVibrations.h>
#import <SwaggerClient/SWGPagination.h>
#import <SwaggerClient/SWGPrevJobStatus.h>
#import <SwaggerClient/SWGReactivateDriverParam.h>
#import <SwaggerClient/SWGSafetyReportHarshEvent.h>
#import <SwaggerClient/SWGSensor.h>
#import <SwaggerClient/SWGSensorHistoryResponse.h>
#import <SwaggerClient/SWGSensorHistoryResponseResults.h>
#import <SwaggerClient/SWGSensorParam.h>
#import <SwaggerClient/SWGSensorshistorySeries.h>
#import <SwaggerClient/SWGTag.h>
#import <SwaggerClient/SWGTagCreate.h>
#import <SwaggerClient/SWGTagIds.h>
#import <SwaggerClient/SWGTagMetadata.h>
#import <SwaggerClient/SWGTagModify.h>
#import <SwaggerClient/SWGTagModifyAdd.h>
#import <SwaggerClient/SWGTagModifyDelete.h>
#import <SwaggerClient/SWGTagUpdate.h>
#import <SwaggerClient/SWGTaggedAddressBase.h>
#import <SwaggerClient/SWGTaggedAssetBase.h>
#import <SwaggerClient/SWGTaggedDriverBase.h>
#import <SwaggerClient/SWGTaggedMachineBase.h>
#import <SwaggerClient/SWGTaggedSensorBase.h>
#import <SwaggerClient/SWGTaggedVehicleBase.h>
#import <SwaggerClient/SWGTemperatureResponse.h>
#import <SwaggerClient/SWGTemperatureResponseSensors.h>
#import <SwaggerClient/SWGTripResponse.h>
#import <SwaggerClient/SWGTripResponseEndCoordinates.h>
#import <SwaggerClient/SWGTripResponseStartCoordinates.h>
#import <SwaggerClient/SWGTripResponseTrips.h>
#import <SwaggerClient/SWGTripsParam.h>
#import <SwaggerClient/SWGUserBase.h>
#import <SwaggerClient/SWGUserRole.h>
#import <SwaggerClient/SWGUserTagRole.h>
#import <SwaggerClient/SWGUserTagRoleTag.h>
#import <SwaggerClient/SWGVehicle.h>
#import <SwaggerClient/SWGVehicleHarshEventResponse.h>
#import <SwaggerClient/SWGVehicleHarshEventResponseLocation.h>
#import <SwaggerClient/SWGVehicleLocation.h>
#import <SwaggerClient/SWGVehicleMaintenance.h>
#import <SwaggerClient/SWGVehicleMaintenanceJ1939.h>
#import <SwaggerClient/SWGVehicleMaintenanceJ1939CheckEngineLight.h>
#import <SwaggerClient/SWGVehicleMaintenanceJ1939DiagnosticTroubleCodes.h>
#import <SwaggerClient/SWGVehicleMaintenancePassenger.h>
#import <SwaggerClient/SWGVehicleMaintenancePassengerCheckEngineLight.h>
#import <SwaggerClient/SWGVehicleMaintenancePassengerDiagnosticTroubleCodes.h>
#import <SwaggerClient/SWGVehicleSafetyScoreResponse.h>
#import <SwaggerClient/SWGVehicleUpdateParam.h>
#import <SwaggerClient/SWGDispatchJob.h>
#import <SwaggerClient/SWGDispatchRoute.h>
#import <SwaggerClient/SWGDispatchRouteCreate.h>
#import <SwaggerClient/SWGDocument.h>
#import <SwaggerClient/SWGDocumentCreate.h>
#import <SwaggerClient/SWGDocumentField.h>
#import <SwaggerClient/SWGDriver.h>
#import <SwaggerClient/SWGDriverForCreate.h>
#import <SwaggerClient/SWGTaggedAddress.h>
#import <SwaggerClient/SWGTaggedAsset.h>
#import <SwaggerClient/SWGTaggedDriver.h>
#import <SwaggerClient/SWGTaggedMachine.h>
#import <SwaggerClient/SWGTaggedSensor.h>
#import <SwaggerClient/SWGTaggedVehicle.h>
#import <SwaggerClient/SWGUser.h>
// load API classes for accessing endpoints
#import <SwaggerClient/SWGAssetsApi.h>
#import <SwaggerClient/SWGDriversApi.h>
#import <SwaggerClient/SWGFleetApi.h>
#import <SwaggerClient/SWGIndustrialApi.h>
#import <SwaggerClient/SWGRoutesApi.h>
#import <SwaggerClient/SWGSafetyApi.h>
#import <SwaggerClient/SWGSensorsApi.h>
#import <SwaggerClient/SWGTagsApi.h>
#import <SwaggerClient/SWGUsersApi.h>

```

## Recommendation

It's recommended to create an instance of ApiClient per thread in a multi-threaded environment to avoid any potential issues.

## Getting Started

Please follow the [installation procedure](#installation--usage) and then run the following:

```objc


NSString* *accessToken = @"accessToken_example"; // Samsara API access token.
NSNumber* *groupId = @789; // Optional group ID if the organization has multiple groups (uncommon). (optional)

SWGAssetsApi *apiInstance = [[SWGAssetsApi alloc] init];

// /fleet/assets/locations
[apiInstance getAllAssetCurrentLocationsWithAccessToken:accessToken
    groupId:groupId
              completionHandler: ^(SWGInlineResponse2001* output, NSError* error) {
                            if (output) {
                                NSLog(@"%@", output);
                            }
                            if (error) {
                                NSLog(@"Error: %@", error);
                            }
                        }];

```

## Documentation for API Endpoints

All URIs are relative to *https://api.samsara.com/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*SWGAssetsApi* | [**getAllAssetCurrentLocations**](docs/SWGAssetsApi.md#getallassetcurrentlocations) | **GET** /fleet/assets/locations | /fleet/assets/locations
*SWGAssetsApi* | [**getAllAssets**](docs/SWGAssetsApi.md#getallassets) | **GET** /fleet/assets | /fleet/assets
*SWGAssetsApi* | [**getAssetLocation**](docs/SWGAssetsApi.md#getassetlocation) | **GET** /fleet/assets/{asset_id}/locations | /fleet/assets/{assetId:[0-9]+}/locations
*SWGAssetsApi* | [**getAssetReefer**](docs/SWGAssetsApi.md#getassetreefer) | **GET** /fleet/assets/{asset_id}/reefer | /fleet/assets/{assetId:[0-9]+}/reefer
*SWGDriversApi* | [**createDriver**](docs/SWGDriversApi.md#createdriver) | **POST** /fleet/drivers/create | /fleet/drivers/create
*SWGDriversApi* | [**deactivateDriver**](docs/SWGDriversApi.md#deactivatedriver) | **DELETE** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*SWGDriversApi* | [**getAllDeactivatedDrivers**](docs/SWGDriversApi.md#getalldeactivateddrivers) | **GET** /fleet/drivers/inactive | /fleet/drivers/inactive
*SWGDriversApi* | [**getDeactivatedDriverById**](docs/SWGDriversApi.md#getdeactivateddriverbyid) | **GET** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*SWGDriversApi* | [**getDriverById**](docs/SWGDriversApi.md#getdriverbyid) | **GET** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*SWGDriversApi* | [**reactivateDriverById**](docs/SWGDriversApi.md#reactivatedriverbyid) | **PUT** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*SWGFleetApi* | [**addFleetAddress**](docs/SWGFleetApi.md#addfleetaddress) | **POST** /fleet/add_address | /fleet/add_address
*SWGFleetApi* | [**addOrganizationAddresses**](docs/SWGFleetApi.md#addorganizationaddresses) | **POST** /addresses | /addresses
*SWGFleetApi* | [**createDispatchRoute**](docs/SWGFleetApi.md#createdispatchroute) | **POST** /fleet/dispatch/routes | /fleet/dispatch/routes
*SWGFleetApi* | [**createDriver**](docs/SWGFleetApi.md#createdriver) | **POST** /fleet/drivers/create | /fleet/drivers/create
*SWGFleetApi* | [**createDriverDispatchRoute**](docs/SWGFleetApi.md#createdriverdispatchroute) | **POST** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
*SWGFleetApi* | [**createDriverDocument**](docs/SWGFleetApi.md#createdriverdocument) | **POST** /fleet/drivers/{driver_id}/documents | /fleet/drivers/{driver_id:[0-9]+}/documents
*SWGFleetApi* | [**createDvir**](docs/SWGFleetApi.md#createdvir) | **POST** /fleet/maintenance/dvirs | /fleet/maintenance/dvirs
*SWGFleetApi* | [**createVehicleDispatchRoute**](docs/SWGFleetApi.md#createvehicledispatchroute) | **POST** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
*SWGFleetApi* | [**deactivateDriver**](docs/SWGFleetApi.md#deactivatedriver) | **DELETE** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*SWGFleetApi* | [**deleteDispatchRouteById**](docs/SWGFleetApi.md#deletedispatchroutebyid) | **DELETE** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
*SWGFleetApi* | [**deleteOrganizationAddress**](docs/SWGFleetApi.md#deleteorganizationaddress) | **DELETE** /addresses/{addressId} | /addresses/{addressId}
*SWGFleetApi* | [**fetchAllDispatchRoutes**](docs/SWGFleetApi.md#fetchalldispatchroutes) | **GET** /fleet/dispatch/routes | /fleet/dispatch/routes
*SWGFleetApi* | [**fetchAllRouteJobUpdates**](docs/SWGFleetApi.md#fetchallroutejobupdates) | **GET** /fleet/dispatch/routes/job_updates | /fleet/dispatch/routes/job_updates
*SWGFleetApi* | [**getAllAssetCurrentLocations**](docs/SWGFleetApi.md#getallassetcurrentlocations) | **GET** /fleet/assets/locations | /fleet/assets/locations
*SWGFleetApi* | [**getAllAssets**](docs/SWGFleetApi.md#getallassets) | **GET** /fleet/assets | /fleet/assets
*SWGFleetApi* | [**getAllDeactivatedDrivers**](docs/SWGFleetApi.md#getalldeactivateddrivers) | **GET** /fleet/drivers/inactive | /fleet/drivers/inactive
*SWGFleetApi* | [**getAssetLocation**](docs/SWGFleetApi.md#getassetlocation) | **GET** /fleet/assets/{asset_id}/locations | /fleet/assets/{assetId:[0-9]+}/locations
*SWGFleetApi* | [**getAssetReefer**](docs/SWGFleetApi.md#getassetreefer) | **GET** /fleet/assets/{asset_id}/reefer | /fleet/assets/{assetId:[0-9]+}/reefer
*SWGFleetApi* | [**getDeactivatedDriverById**](docs/SWGFleetApi.md#getdeactivateddriverbyid) | **GET** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*SWGFleetApi* | [**getDispatchRouteById**](docs/SWGFleetApi.md#getdispatchroutebyid) | **GET** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}
*SWGFleetApi* | [**getDispatchRouteHistory**](docs/SWGFleetApi.md#getdispatchroutehistory) | **GET** /fleet/dispatch/routes/{route_id}/history | /fleet/dispatch/routes/{route_id:[0-9]+}/history
*SWGFleetApi* | [**getDispatchRoutesByDriverId**](docs/SWGFleetApi.md#getdispatchroutesbydriverid) | **GET** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
*SWGFleetApi* | [**getDispatchRoutesByVehicleId**](docs/SWGFleetApi.md#getdispatchroutesbyvehicleid) | **GET** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
*SWGFleetApi* | [**getDriverById**](docs/SWGFleetApi.md#getdriverbyid) | **GET** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*SWGFleetApi* | [**getDriverDocumentTypesByOrgId**](docs/SWGFleetApi.md#getdriverdocumenttypesbyorgid) | **GET** /fleet/drivers/document_types | /fleet/drivers/document_types
*SWGFleetApi* | [**getDriverDocumentsByOrgId**](docs/SWGFleetApi.md#getdriverdocumentsbyorgid) | **GET** /fleet/drivers/documents | /fleet/drivers/documents
*SWGFleetApi* | [**getDriverSafetyScore**](docs/SWGFleetApi.md#getdriversafetyscore) | **GET** /fleet/drivers/{driverId}/safety/score | /fleet/drivers/{driverId:[0-9]+}/safety/score
*SWGFleetApi* | [**getDvirs**](docs/SWGFleetApi.md#getdvirs) | **GET** /fleet/maintenance/dvirs | /fleet/maintenance/dvirs
*SWGFleetApi* | [**getFleetDrivers**](docs/SWGFleetApi.md#getfleetdrivers) | **POST** /fleet/drivers | /fleet/drivers
*SWGFleetApi* | [**getFleetDriversHosDailyLogs**](docs/SWGFleetApi.md#getfleetdrivershosdailylogs) | **POST** /fleet/drivers/{driver_id}/hos_daily_logs | /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
*SWGFleetApi* | [**getFleetDriversSummary**](docs/SWGFleetApi.md#getfleetdriverssummary) | **POST** /fleet/drivers/summary | /fleet/drivers/summary
*SWGFleetApi* | [**getFleetHosAuthenticationLogs**](docs/SWGFleetApi.md#getfleethosauthenticationlogs) | **POST** /fleet/hos_authentication_logs | /fleet/hos_authentication_logs
*SWGFleetApi* | [**getFleetHosLogs**](docs/SWGFleetApi.md#getfleethoslogs) | **POST** /fleet/hos_logs | /fleet/hos_logs
*SWGFleetApi* | [**getFleetHosLogsSummary**](docs/SWGFleetApi.md#getfleethoslogssummary) | **POST** /fleet/hos_logs_summary | /fleet/hos_logs_summary
*SWGFleetApi* | [**getFleetLocations**](docs/SWGFleetApi.md#getfleetlocations) | **POST** /fleet/locations | /fleet/locations
*SWGFleetApi* | [**getFleetMaintenanceList**](docs/SWGFleetApi.md#getfleetmaintenancelist) | **POST** /fleet/maintenance/list | /fleet/maintenance/list
*SWGFleetApi* | [**getFleetTrips**](docs/SWGFleetApi.md#getfleettrips) | **POST** /fleet/trips | /fleet/trips
*SWGFleetApi* | [**getFleetVehicle**](docs/SWGFleetApi.md#getfleetvehicle) | **GET** /fleet/vehicles/{vehicle_id_or_external_id} | /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*SWGFleetApi* | [**getOrganizationAddress**](docs/SWGFleetApi.md#getorganizationaddress) | **GET** /addresses/{addressId} | /addresses/{addressId}
*SWGFleetApi* | [**getOrganizationAddresses**](docs/SWGFleetApi.md#getorganizationaddresses) | **GET** /addresses | /addresses
*SWGFleetApi* | [**getOrganizationContact**](docs/SWGFleetApi.md#getorganizationcontact) | **GET** /contacts/{contact_id} | /contacts/{contact_id}
*SWGFleetApi* | [**getVehicleHarshEvent**](docs/SWGFleetApi.md#getvehicleharshevent) | **GET** /fleet/vehicles/{vehicleId}/safety/harsh_event | /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
*SWGFleetApi* | [**getVehicleLocations**](docs/SWGFleetApi.md#getvehiclelocations) | **GET** /fleet/vehicles/{vehicle_id}/locations | /fleet/vehicles/{vehicle_id:[0-9]+}/locations
*SWGFleetApi* | [**getVehicleSafetyScore**](docs/SWGFleetApi.md#getvehiclesafetyscore) | **GET** /fleet/vehicles/{vehicleId}/safety/score | /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
*SWGFleetApi* | [**getVehicleStats**](docs/SWGFleetApi.md#getvehiclestats) | **GET** /fleet/vehicles/stats | /fleet/vehicles/stats
*SWGFleetApi* | [**getVehiclesLocations**](docs/SWGFleetApi.md#getvehicleslocations) | **GET** /fleet/vehicles/locations | /fleet/vehicles/locations
*SWGFleetApi* | [**listContacts**](docs/SWGFleetApi.md#listcontacts) | **GET** /contacts | /contacts
*SWGFleetApi* | [**listFleet**](docs/SWGFleetApi.md#listfleet) | **POST** /fleet/list | /fleet/list
*SWGFleetApi* | [**patchFleetVehicle**](docs/SWGFleetApi.md#patchfleetvehicle) | **PATCH** /fleet/vehicles/{vehicle_id_or_external_id} | /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*SWGFleetApi* | [**reactivateDriverById**](docs/SWGFleetApi.md#reactivatedriverbyid) | **PUT** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*SWGFleetApi* | [**updateDispatchRouteById**](docs/SWGFleetApi.md#updatedispatchroutebyid) | **PUT** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
*SWGFleetApi* | [**updateOrganizationAddress**](docs/SWGFleetApi.md#updateorganizationaddress) | **PATCH** /addresses/{addressId} | /addresses/{addressId}
*SWGFleetApi* | [**updateVehicles**](docs/SWGFleetApi.md#updatevehicles) | **POST** /fleet/set_data | /fleet/set_data
*SWGIndustrialApi* | [**getAllDataInputs**](docs/SWGIndustrialApi.md#getalldatainputs) | **GET** /industrial/data | /industrial/data
*SWGIndustrialApi* | [**getDataInput**](docs/SWGIndustrialApi.md#getdatainput) | **GET** /industrial/data/{data_input_id} | /industrial/data/{data_input_id:[0-9]+}
*SWGIndustrialApi* | [**getMachines**](docs/SWGIndustrialApi.md#getmachines) | **POST** /machines/list | /machines/list
*SWGIndustrialApi* | [**getMachinesHistory**](docs/SWGIndustrialApi.md#getmachineshistory) | **POST** /machines/history | /machines/history
*SWGRoutesApi* | [**createDispatchRoute**](docs/SWGRoutesApi.md#createdispatchroute) | **POST** /fleet/dispatch/routes | /fleet/dispatch/routes
*SWGRoutesApi* | [**createDriverDispatchRoute**](docs/SWGRoutesApi.md#createdriverdispatchroute) | **POST** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
*SWGRoutesApi* | [**createVehicleDispatchRoute**](docs/SWGRoutesApi.md#createvehicledispatchroute) | **POST** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
*SWGRoutesApi* | [**deleteDispatchRouteById**](docs/SWGRoutesApi.md#deletedispatchroutebyid) | **DELETE** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
*SWGRoutesApi* | [**fetchAllDispatchRoutes**](docs/SWGRoutesApi.md#fetchalldispatchroutes) | **GET** /fleet/dispatch/routes | /fleet/dispatch/routes
*SWGRoutesApi* | [**fetchAllRouteJobUpdates**](docs/SWGRoutesApi.md#fetchallroutejobupdates) | **GET** /fleet/dispatch/routes/job_updates | /fleet/dispatch/routes/job_updates
*SWGRoutesApi* | [**getDispatchRouteById**](docs/SWGRoutesApi.md#getdispatchroutebyid) | **GET** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}
*SWGRoutesApi* | [**getDispatchRouteHistory**](docs/SWGRoutesApi.md#getdispatchroutehistory) | **GET** /fleet/dispatch/routes/{route_id}/history | /fleet/dispatch/routes/{route_id:[0-9]+}/history
*SWGRoutesApi* | [**getDispatchRoutesByDriverId**](docs/SWGRoutesApi.md#getdispatchroutesbydriverid) | **GET** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
*SWGRoutesApi* | [**getDispatchRoutesByVehicleId**](docs/SWGRoutesApi.md#getdispatchroutesbyvehicleid) | **GET** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
*SWGRoutesApi* | [**updateDispatchRouteById**](docs/SWGRoutesApi.md#updatedispatchroutebyid) | **PUT** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
*SWGSafetyApi* | [**getDriverSafetyScore**](docs/SWGSafetyApi.md#getdriversafetyscore) | **GET** /fleet/drivers/{driverId}/safety/score | /fleet/drivers/{driverId:[0-9]+}/safety/score
*SWGSafetyApi* | [**getVehicleHarshEvent**](docs/SWGSafetyApi.md#getvehicleharshevent) | **GET** /fleet/vehicles/{vehicleId}/safety/harsh_event | /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
*SWGSafetyApi* | [**getVehicleSafetyScore**](docs/SWGSafetyApi.md#getvehiclesafetyscore) | **GET** /fleet/vehicles/{vehicleId}/safety/score | /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
*SWGSensorsApi* | [**getSensors**](docs/SWGSensorsApi.md#getsensors) | **POST** /sensors/list | /sensors/list
*SWGSensorsApi* | [**getSensorsCargo**](docs/SWGSensorsApi.md#getsensorscargo) | **POST** /sensors/cargo | /sensors/cargo
*SWGSensorsApi* | [**getSensorsDoor**](docs/SWGSensorsApi.md#getsensorsdoor) | **POST** /sensors/door | /sensors/door
*SWGSensorsApi* | [**getSensorsHistory**](docs/SWGSensorsApi.md#getsensorshistory) | **POST** /sensors/history | /sensors/history
*SWGSensorsApi* | [**getSensorsHumidity**](docs/SWGSensorsApi.md#getsensorshumidity) | **POST** /sensors/humidity | /sensors/humidity
*SWGSensorsApi* | [**getSensorsTemperature**](docs/SWGSensorsApi.md#getsensorstemperature) | **POST** /sensors/temperature | /sensors/temperature
*SWGTagsApi* | [**createTag**](docs/SWGTagsApi.md#createtag) | **POST** /tags | /tags
*SWGTagsApi* | [**deleteTagById**](docs/SWGTagsApi.md#deletetagbyid) | **DELETE** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
*SWGTagsApi* | [**getAllTags**](docs/SWGTagsApi.md#getalltags) | **GET** /tags | /tags
*SWGTagsApi* | [**getTagById**](docs/SWGTagsApi.md#gettagbyid) | **GET** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
*SWGTagsApi* | [**modifyTagById**](docs/SWGTagsApi.md#modifytagbyid) | **PATCH** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
*SWGTagsApi* | [**updateTagById**](docs/SWGTagsApi.md#updatetagbyid) | **PUT** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
*SWGUsersApi* | [**deleteUserById**](docs/SWGUsersApi.md#deleteuserbyid) | **DELETE** /users/{userId} | /users/{userId:[0-9]+}
*SWGUsersApi* | [**getUserById**](docs/SWGUsersApi.md#getuserbyid) | **GET** /users/{userId} | /users/{userId:[0-9]+}
*SWGUsersApi* | [**listUserRoles**](docs/SWGUsersApi.md#listuserroles) | **GET** /user_roles | /user_roles
*SWGUsersApi* | [**listUsers**](docs/SWGUsersApi.md#listusers) | **GET** /users | /users


## Documentation For Models

 - [SWGAddress](docs/SWGAddress.md)
 - [SWGAddressGeofence](docs/SWGAddressGeofence.md)
 - [SWGAddressGeofenceCircle](docs/SWGAddressGeofenceCircle.md)
 - [SWGAddressGeofencePolygon](docs/SWGAddressGeofencePolygon.md)
 - [SWGAddressGeofencePolygonVertices](docs/SWGAddressGeofencePolygonVertices.md)
 - [SWGAddressNotes](docs/SWGAddressNotes.md)
 - [SWGAddressParam](docs/SWGAddressParam.md)
 - [SWGAddresses](docs/SWGAddresses.md)
 - [SWGAddressesAddresses](docs/SWGAddressesAddresses.md)
 - [SWGAllRouteJobUpdates](docs/SWGAllRouteJobUpdates.md)
 - [SWGAsset](docs/SWGAsset.md)
 - [SWGAssetCable](docs/SWGAssetCable.md)
 - [SWGAssetCurrentLocation](docs/SWGAssetCurrentLocation.md)
 - [SWGAssetCurrentLocationsResponse](docs/SWGAssetCurrentLocationsResponse.md)
 - [SWGAssetLocationResponse](docs/SWGAssetLocationResponse.md)
 - [SWGAssetLocationResponseInner](docs/SWGAssetLocationResponseInner.md)
 - [SWGAssetReeferResponse](docs/SWGAssetReeferResponse.md)
 - [SWGAssetReeferResponseReeferStats](docs/SWGAssetReeferResponseReeferStats.md)
 - [SWGAssetReeferResponseReeferStatsAlarms](docs/SWGAssetReeferResponseReeferStatsAlarms.md)
 - [SWGAssetReeferResponseReeferStatsAlarms1](docs/SWGAssetReeferResponseReeferStatsAlarms1.md)
 - [SWGAssetReeferResponseReeferStatsEngineHours](docs/SWGAssetReeferResponseReeferStatsEngineHours.md)
 - [SWGAssetReeferResponseReeferStatsFuelPercentage](docs/SWGAssetReeferResponseReeferStatsFuelPercentage.md)
 - [SWGAssetReeferResponseReeferStatsPowerStatus](docs/SWGAssetReeferResponseReeferStatsPowerStatus.md)
 - [SWGAssetReeferResponseReeferStatsReturnAirTemp](docs/SWGAssetReeferResponseReeferStatsReturnAirTemp.md)
 - [SWGAssetReeferResponseReeferStatsSetPoint](docs/SWGAssetReeferResponseReeferStatsSetPoint.md)
 - [SWGAuxInput](docs/SWGAuxInput.md)
 - [SWGAuxInputSeries](docs/SWGAuxInputSeries.md)
 - [SWGCargoResponse](docs/SWGCargoResponse.md)
 - [SWGCargoResponseSensors](docs/SWGCargoResponseSensors.md)
 - [SWGContact](docs/SWGContact.md)
 - [SWGContactIds](docs/SWGContactIds.md)
 - [SWGCreateDvirParam](docs/SWGCreateDvirParam.md)
 - [SWGCurrentDriver](docs/SWGCurrentDriver.md)
 - [SWGData](docs/SWGData.md)
 - [SWGDataInputHistoryResponse](docs/SWGDataInputHistoryResponse.md)
 - [SWGDataInputHistoryResponsePoints](docs/SWGDataInputHistoryResponsePoints.md)
 - [SWGDispatchJobCreate](docs/SWGDispatchJobCreate.md)
 - [SWGDispatchRouteBase](docs/SWGDispatchRouteBase.md)
 - [SWGDispatchRouteHistoricalEntry](docs/SWGDispatchRouteHistoricalEntry.md)
 - [SWGDispatchRouteHistory](docs/SWGDispatchRouteHistory.md)
 - [SWGDispatchRoutes](docs/SWGDispatchRoutes.md)
 - [SWGDocumentBase](docs/SWGDocumentBase.md)
 - [SWGDocumentFieldCreate](docs/SWGDocumentFieldCreate.md)
 - [SWGDocumentFieldCreatePhotoValue](docs/SWGDocumentFieldCreatePhotoValue.md)
 - [SWGDocumentFieldType](docs/SWGDocumentFieldType.md)
 - [SWGDocumentFieldTypeNumberValueTypeMetadata](docs/SWGDocumentFieldTypeNumberValueTypeMetadata.md)
 - [SWGDocumentFieldTypes](docs/SWGDocumentFieldTypes.md)
 - [SWGDocumentType](docs/SWGDocumentType.md)
 - [SWGDocumentTypes](docs/SWGDocumentTypes.md)
 - [SWGDocuments](docs/SWGDocuments.md)
 - [SWGDoorResponse](docs/SWGDoorResponse.md)
 - [SWGDoorResponseSensors](docs/SWGDoorResponseSensors.md)
 - [SWGDriverBase](docs/SWGDriverBase.md)
 - [SWGDriverDailyLogResponse](docs/SWGDriverDailyLogResponse.md)
 - [SWGDriverDailyLogResponseDays](docs/SWGDriverDailyLogResponseDays.md)
 - [SWGDriverSafetyScoreResponse](docs/SWGDriverSafetyScoreResponse.md)
 - [SWGDriversResponse](docs/SWGDriversResponse.md)
 - [SWGDriversSummaryParam](docs/SWGDriversSummaryParam.md)
 - [SWGDriversSummaryResponse](docs/SWGDriversSummaryResponse.md)
 - [SWGDriversSummaryResponseSummaries](docs/SWGDriversSummaryResponseSummaries.md)
 - [SWGDvirBase](docs/SWGDvirBase.md)
 - [SWGDvirBaseAuthorSignature](docs/SWGDvirBaseAuthorSignature.md)
 - [SWGDvirBaseMechanicOrAgentSignature](docs/SWGDvirBaseMechanicOrAgentSignature.md)
 - [SWGDvirBaseNextDriverSignature](docs/SWGDvirBaseNextDriverSignature.md)
 - [SWGDvirBaseTrailerDefects](docs/SWGDvirBaseTrailerDefects.md)
 - [SWGDvirBaseVehicle](docs/SWGDvirBaseVehicle.md)
 - [SWGDvirListResponse](docs/SWGDvirListResponse.md)
 - [SWGEngineState](docs/SWGEngineState.md)
 - [SWGErrorResponse](docs/SWGErrorResponse.md)
 - [SWGFleetVehicleLocation](docs/SWGFleetVehicleLocation.md)
 - [SWGFleetVehicleLocations](docs/SWGFleetVehicleLocations.md)
 - [SWGFleetVehicleResponse](docs/SWGFleetVehicleResponse.md)
 - [SWGFleetVehicleResponseVehicleInfo](docs/SWGFleetVehicleResponseVehicleInfo.md)
 - [SWGFleetVehiclesLocations](docs/SWGFleetVehiclesLocations.md)
 - [SWGFleetVehiclesLocationsInner](docs/SWGFleetVehiclesLocationsInner.md)
 - [SWGGroupDriversParam](docs/SWGGroupDriversParam.md)
 - [SWGGroupParam](docs/SWGGroupParam.md)
 - [SWGHistoryParam](docs/SWGHistoryParam.md)
 - [SWGHistoryParam1](docs/SWGHistoryParam1.md)
 - [SWGHosAuthenticationLogsParam](docs/SWGHosAuthenticationLogsParam.md)
 - [SWGHosAuthenticationLogsResponse](docs/SWGHosAuthenticationLogsResponse.md)
 - [SWGHosAuthenticationLogsResponseAuthenticationLogs](docs/SWGHosAuthenticationLogsResponseAuthenticationLogs.md)
 - [SWGHosLogsParam](docs/SWGHosLogsParam.md)
 - [SWGHosLogsParam1](docs/SWGHosLogsParam1.md)
 - [SWGHosLogsParam2](docs/SWGHosLogsParam2.md)
 - [SWGHosLogsResponse](docs/SWGHosLogsResponse.md)
 - [SWGHosLogsResponseLogs](docs/SWGHosLogsResponseLogs.md)
 - [SWGHosLogsSummaryResponse](docs/SWGHosLogsSummaryResponse.md)
 - [SWGHosLogsSummaryResponseDrivers](docs/SWGHosLogsSummaryResponseDrivers.md)
 - [SWGHumidityResponse](docs/SWGHumidityResponse.md)
 - [SWGHumidityResponseSensors](docs/SWGHumidityResponseSensors.md)
 - [SWGInlineResponse200](docs/SWGInlineResponse200.md)
 - [SWGInlineResponse2001](docs/SWGInlineResponse2001.md)
 - [SWGInlineResponse2002](docs/SWGInlineResponse2002.md)
 - [SWGInlineResponse2003](docs/SWGInlineResponse2003.md)
 - [SWGInlineResponse2004](docs/SWGInlineResponse2004.md)
 - [SWGInlineResponse2005](docs/SWGInlineResponse2005.md)
 - [SWGInlineResponse2005VehicleStats](docs/SWGInlineResponse2005VehicleStats.md)
 - [SWGInlineResponse2006](docs/SWGInlineResponse2006.md)
 - [SWGInlineResponse2007](docs/SWGInlineResponse2007.md)
 - [SWGInlineResponse2008](docs/SWGInlineResponse2008.md)
 - [SWGInlineResponse2009](docs/SWGInlineResponse2009.md)
 - [SWGJobStatus](docs/SWGJobStatus.md)
 - [SWGJobUpdateObject](docs/SWGJobUpdateObject.md)
 - [SWGMachine](docs/SWGMachine.md)
 - [SWGMachineHistoryResponse](docs/SWGMachineHistoryResponse.md)
 - [SWGMachineHistoryResponseMachines](docs/SWGMachineHistoryResponseMachines.md)
 - [SWGMachineHistoryResponseVibrations](docs/SWGMachineHistoryResponseVibrations.md)
 - [SWGPagination](docs/SWGPagination.md)
 - [SWGPrevJobStatus](docs/SWGPrevJobStatus.md)
 - [SWGReactivateDriverParam](docs/SWGReactivateDriverParam.md)
 - [SWGSafetyReportHarshEvent](docs/SWGSafetyReportHarshEvent.md)
 - [SWGSensor](docs/SWGSensor.md)
 - [SWGSensorHistoryResponse](docs/SWGSensorHistoryResponse.md)
 - [SWGSensorHistoryResponseResults](docs/SWGSensorHistoryResponseResults.md)
 - [SWGSensorParam](docs/SWGSensorParam.md)
 - [SWGSensorshistorySeries](docs/SWGSensorshistorySeries.md)
 - [SWGTag](docs/SWGTag.md)
 - [SWGTagCreate](docs/SWGTagCreate.md)
 - [SWGTagIds](docs/SWGTagIds.md)
 - [SWGTagMetadata](docs/SWGTagMetadata.md)
 - [SWGTagModify](docs/SWGTagModify.md)
 - [SWGTagModifyAdd](docs/SWGTagModifyAdd.md)
 - [SWGTagModifyDelete](docs/SWGTagModifyDelete.md)
 - [SWGTagUpdate](docs/SWGTagUpdate.md)
 - [SWGTaggedAddressBase](docs/SWGTaggedAddressBase.md)
 - [SWGTaggedAssetBase](docs/SWGTaggedAssetBase.md)
 - [SWGTaggedDriverBase](docs/SWGTaggedDriverBase.md)
 - [SWGTaggedMachineBase](docs/SWGTaggedMachineBase.md)
 - [SWGTaggedSensorBase](docs/SWGTaggedSensorBase.md)
 - [SWGTaggedVehicleBase](docs/SWGTaggedVehicleBase.md)
 - [SWGTemperatureResponse](docs/SWGTemperatureResponse.md)
 - [SWGTemperatureResponseSensors](docs/SWGTemperatureResponseSensors.md)
 - [SWGTripResponse](docs/SWGTripResponse.md)
 - [SWGTripResponseEndCoordinates](docs/SWGTripResponseEndCoordinates.md)
 - [SWGTripResponseStartCoordinates](docs/SWGTripResponseStartCoordinates.md)
 - [SWGTripResponseTrips](docs/SWGTripResponseTrips.md)
 - [SWGTripsParam](docs/SWGTripsParam.md)
 - [SWGUserBase](docs/SWGUserBase.md)
 - [SWGUserRole](docs/SWGUserRole.md)
 - [SWGUserTagRole](docs/SWGUserTagRole.md)
 - [SWGUserTagRoleTag](docs/SWGUserTagRoleTag.md)
 - [SWGVehicle](docs/SWGVehicle.md)
 - [SWGVehicleHarshEventResponse](docs/SWGVehicleHarshEventResponse.md)
 - [SWGVehicleHarshEventResponseLocation](docs/SWGVehicleHarshEventResponseLocation.md)
 - [SWGVehicleLocation](docs/SWGVehicleLocation.md)
 - [SWGVehicleMaintenance](docs/SWGVehicleMaintenance.md)
 - [SWGVehicleMaintenanceJ1939](docs/SWGVehicleMaintenanceJ1939.md)
 - [SWGVehicleMaintenanceJ1939CheckEngineLight](docs/SWGVehicleMaintenanceJ1939CheckEngineLight.md)
 - [SWGVehicleMaintenanceJ1939DiagnosticTroubleCodes](docs/SWGVehicleMaintenanceJ1939DiagnosticTroubleCodes.md)
 - [SWGVehicleMaintenancePassenger](docs/SWGVehicleMaintenancePassenger.md)
 - [SWGVehicleMaintenancePassengerCheckEngineLight](docs/SWGVehicleMaintenancePassengerCheckEngineLight.md)
 - [SWGVehicleMaintenancePassengerDiagnosticTroubleCodes](docs/SWGVehicleMaintenancePassengerDiagnosticTroubleCodes.md)
 - [SWGVehicleSafetyScoreResponse](docs/SWGVehicleSafetyScoreResponse.md)
 - [SWGVehicleUpdateParam](docs/SWGVehicleUpdateParam.md)
 - [SWGDispatchJob](docs/SWGDispatchJob.md)
 - [SWGDispatchRoute](docs/SWGDispatchRoute.md)
 - [SWGDispatchRouteCreate](docs/SWGDispatchRouteCreate.md)
 - [SWGDocument](docs/SWGDocument.md)
 - [SWGDocumentCreate](docs/SWGDocumentCreate.md)
 - [SWGDocumentField](docs/SWGDocumentField.md)
 - [SWGDriver](docs/SWGDriver.md)
 - [SWGDriverForCreate](docs/SWGDriverForCreate.md)
 - [SWGTaggedAddress](docs/SWGTaggedAddress.md)
 - [SWGTaggedAsset](docs/SWGTaggedAsset.md)
 - [SWGTaggedDriver](docs/SWGTaggedDriver.md)
 - [SWGTaggedMachine](docs/SWGTaggedMachine.md)
 - [SWGTaggedSensor](docs/SWGTaggedSensor.md)
 - [SWGTaggedVehicle](docs/SWGTaggedVehicle.md)
 - [SWGUser](docs/SWGUser.md)


## Documentation For Authorization

 All endpoints do not require authorization.


## Author





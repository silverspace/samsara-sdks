# OpenAPIClient

# Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).

This ObjC package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 1.0.0
- Package version: 
- Build package: org.openapitools.codegen.languages.ObjcClientCodegen

## Requirements

The SDK requires [**ARC (Automatic Reference Counting)**](http://stackoverflow.com/questions/7778356/how-to-enable-disable-automatic-reference-counting) to be enabled in the Xcode project.

## Installation & Usage
### Install from Github using [CocoaPods](https://cocoapods.org/)

Add the following to the Podfile:

```ruby
pod 'OpenAPIClient', :git => 'https://github.com/GIT_USER_ID/GIT_REPO_ID.git'
```

To specify a particular branch, append `, :branch => 'branch-name-here'`

To specify a particular commit, append `, :commit => '11aa22'`

### Install from local path using [CocoaPods](https://cocoapods.org/)

Put the SDK under your project folder (e.g. /path/to/objc_project/Vendor/OpenAPIClient) and then add the following to the Podfile:

```ruby
pod 'OpenAPIClient', :path => 'Vendor/OpenAPIClient'
```

### Usage

Import the following:

```objc
#import <OpenAPIClient/OAIApiClient.h>
#import <OpenAPIClient/OAIDefaultConfiguration.h>
// load models
#import <OpenAPIClient/OAIAddress.h>
#import <OpenAPIClient/OAIAddressGeofence.h>
#import <OpenAPIClient/OAIAddressGeofenceCircle.h>
#import <OpenAPIClient/OAIAddressGeofencePolygon.h>
#import <OpenAPIClient/OAIAddressGeofencePolygonVertices.h>
#import <OpenAPIClient/OAIAddressesAddresses.h>
#import <OpenAPIClient/OAIAllRouteJobUpdates.h>
#import <OpenAPIClient/OAIAsset.h>
#import <OpenAPIClient/OAIAssetCable.h>
#import <OpenAPIClient/OAIAssetCurrentLocation.h>
#import <OpenAPIClient/OAIAssetCurrentLocationsResponse.h>
#import <OpenAPIClient/OAIAssetReeferResponse.h>
#import <OpenAPIClient/OAIAssetReeferResponseReeferStats.h>
#import <OpenAPIClient/OAIAssetReeferResponseReeferStatsAlarms.h>
#import <OpenAPIClient/OAIAssetReeferResponseReeferStatsAlarms1.h>
#import <OpenAPIClient/OAIAssetReeferResponseReeferStatsEngineHours.h>
#import <OpenAPIClient/OAIAssetReeferResponseReeferStatsFuelPercentage.h>
#import <OpenAPIClient/OAIAssetReeferResponseReeferStatsPowerStatus.h>
#import <OpenAPIClient/OAIAssetReeferResponseReeferStatsReturnAirTemp.h>
#import <OpenAPIClient/OAIAssetReeferResponseReeferStatsSetPoint.h>
#import <OpenAPIClient/OAIAuxInput.h>
#import <OpenAPIClient/OAIAuxInputSeries.h>
#import <OpenAPIClient/OAICargoResponse.h>
#import <OpenAPIClient/OAICargoResponseSensors.h>
#import <OpenAPIClient/OAIContact.h>
#import <OpenAPIClient/OAICurrentDriver.h>
#import <OpenAPIClient/OAIDataInputHistoryResponse.h>
#import <OpenAPIClient/OAIDataInputHistoryResponsePoints.h>
#import <OpenAPIClient/OAIDispatchJob.h>
#import <OpenAPIClient/OAIDispatchJobCreate.h>
#import <OpenAPIClient/OAIDispatchRoute.h>
#import <OpenAPIClient/OAIDispatchRouteBase.h>
#import <OpenAPIClient/OAIDispatchRouteCreate.h>
#import <OpenAPIClient/OAIDispatchRouteHistoricalEntry.h>
#import <OpenAPIClient/OAIDispatchRouteHistory.h>
#import <OpenAPIClient/OAIDocument.h>
#import <OpenAPIClient/OAIDocumentBase.h>
#import <OpenAPIClient/OAIDocumentCreate.h>
#import <OpenAPIClient/OAIDocumentField.h>
#import <OpenAPIClient/OAIDocumentFieldCreate.h>
#import <OpenAPIClient/OAIDocumentFieldCreatePhotoValue.h>
#import <OpenAPIClient/OAIDocumentFieldType.h>
#import <OpenAPIClient/OAIDocumentFieldTypeNumberValueTypeMetadata.h>
#import <OpenAPIClient/OAIDocumentType.h>
#import <OpenAPIClient/OAIDoorResponse.h>
#import <OpenAPIClient/OAIDoorResponseSensors.h>
#import <OpenAPIClient/OAIDriver.h>
#import <OpenAPIClient/OAIDriverBase.h>
#import <OpenAPIClient/OAIDriverDailyLogResponse.h>
#import <OpenAPIClient/OAIDriverDailyLogResponseDays.h>
#import <OpenAPIClient/OAIDriverForCreate.h>
#import <OpenAPIClient/OAIDriverSafetyScoreResponse.h>
#import <OpenAPIClient/OAIDriversResponse.h>
#import <OpenAPIClient/OAIDriversSummaryResponse.h>
#import <OpenAPIClient/OAIDriversSummaryResponseSummaries.h>
#import <OpenAPIClient/OAIDvirBase.h>
#import <OpenAPIClient/OAIDvirBaseAuthorSignature.h>
#import <OpenAPIClient/OAIDvirBaseMechanicOrAgentSignature.h>
#import <OpenAPIClient/OAIDvirBaseNextDriverSignature.h>
#import <OpenAPIClient/OAIDvirBaseTrailerDefects.h>
#import <OpenAPIClient/OAIDvirBaseVehicle.h>
#import <OpenAPIClient/OAIDvirListResponse.h>
#import <OpenAPIClient/OAIEngineState.h>
#import <OpenAPIClient/OAIFleetVehicleLocation.h>
#import <OpenAPIClient/OAIFleetVehicleResponse.h>
#import <OpenAPIClient/OAIFleetVehicleResponseVehicleInfo.h>
#import <OpenAPIClient/OAIHosAuthenticationLogsResponse.h>
#import <OpenAPIClient/OAIHosAuthenticationLogsResponseAuthenticationLogs.h>
#import <OpenAPIClient/OAIHosLogsResponse.h>
#import <OpenAPIClient/OAIHosLogsResponseLogs.h>
#import <OpenAPIClient/OAIHosLogsSummaryResponse.h>
#import <OpenAPIClient/OAIHosLogsSummaryResponseDrivers.h>
#import <OpenAPIClient/OAIHumidityResponse.h>
#import <OpenAPIClient/OAIHumidityResponseSensors.h>
#import <OpenAPIClient/OAIInlineObject.h>
#import <OpenAPIClient/OAIInlineObject1.h>
#import <OpenAPIClient/OAIInlineObject10.h>
#import <OpenAPIClient/OAIInlineObject11.h>
#import <OpenAPIClient/OAIInlineObject12.h>
#import <OpenAPIClient/OAIInlineObject13.h>
#import <OpenAPIClient/OAIInlineObject14.h>
#import <OpenAPIClient/OAIInlineObject15.h>
#import <OpenAPIClient/OAIInlineObject16.h>
#import <OpenAPIClient/OAIInlineObject17.h>
#import <OpenAPIClient/OAIInlineObject18.h>
#import <OpenAPIClient/OAIInlineObject19.h>
#import <OpenAPIClient/OAIInlineObject2.h>
#import <OpenAPIClient/OAIInlineObject20.h>
#import <OpenAPIClient/OAIInlineObject21.h>
#import <OpenAPIClient/OAIInlineObject22.h>
#import <OpenAPIClient/OAIInlineObject23.h>
#import <OpenAPIClient/OAIInlineObject24.h>
#import <OpenAPIClient/OAIInlineObject3.h>
#import <OpenAPIClient/OAIInlineObject4.h>
#import <OpenAPIClient/OAIInlineObject5.h>
#import <OpenAPIClient/OAIInlineObject6.h>
#import <OpenAPIClient/OAIInlineObject7.h>
#import <OpenAPIClient/OAIInlineObject8.h>
#import <OpenAPIClient/OAIInlineObject9.h>
#import <OpenAPIClient/OAIInlineResponse200.h>
#import <OpenAPIClient/OAIInlineResponse2001.h>
#import <OpenAPIClient/OAIInlineResponse2002.h>
#import <OpenAPIClient/OAIInlineResponse2003.h>
#import <OpenAPIClient/OAIInlineResponse2004.h>
#import <OpenAPIClient/OAIInlineResponse2005.h>
#import <OpenAPIClient/OAIInlineResponse2005VehicleStats.h>
#import <OpenAPIClient/OAIInlineResponse2006.h>
#import <OpenAPIClient/OAIInlineResponse2007.h>
#import <OpenAPIClient/OAIInlineResponse2008.h>
#import <OpenAPIClient/OAIInlineResponse2009.h>
#import <OpenAPIClient/OAIJobStatus.h>
#import <OpenAPIClient/OAIJobUpdateObject.h>
#import <OpenAPIClient/OAIMachine.h>
#import <OpenAPIClient/OAIMachineHistoryResponse.h>
#import <OpenAPIClient/OAIMachineHistoryResponseMachines.h>
#import <OpenAPIClient/OAIMachineHistoryResponseVibrations.h>
#import <OpenAPIClient/OAIPagination.h>
#import <OpenAPIClient/OAIPrevJobStatus.h>
#import <OpenAPIClient/OAISafetyReportHarshEvent.h>
#import <OpenAPIClient/OAISensor.h>
#import <OpenAPIClient/OAISensorHistoryResponse.h>
#import <OpenAPIClient/OAISensorHistoryResponseResults.h>
#import <OpenAPIClient/OAISensorsHistorySeries.h>
#import <OpenAPIClient/OAITag.h>
#import <OpenAPIClient/OAITagCreate.h>
#import <OpenAPIClient/OAITagMetadata.h>
#import <OpenAPIClient/OAITagModify.h>
#import <OpenAPIClient/OAITagModifyAdd.h>
#import <OpenAPIClient/OAITagModifyDelete.h>
#import <OpenAPIClient/OAITagUpdate.h>
#import <OpenAPIClient/OAITaggedAddress.h>
#import <OpenAPIClient/OAITaggedAddressBase.h>
#import <OpenAPIClient/OAITaggedAsset.h>
#import <OpenAPIClient/OAITaggedAssetBase.h>
#import <OpenAPIClient/OAITaggedDriver.h>
#import <OpenAPIClient/OAITaggedDriverBase.h>
#import <OpenAPIClient/OAITaggedMachine.h>
#import <OpenAPIClient/OAITaggedMachineBase.h>
#import <OpenAPIClient/OAITaggedSensor.h>
#import <OpenAPIClient/OAITaggedSensorBase.h>
#import <OpenAPIClient/OAITaggedVehicle.h>
#import <OpenAPIClient/OAITaggedVehicleBase.h>
#import <OpenAPIClient/OAITemperatureResponse.h>
#import <OpenAPIClient/OAITemperatureResponseSensors.h>
#import <OpenAPIClient/OAITripResponse.h>
#import <OpenAPIClient/OAITripResponseEndCoordinates.h>
#import <OpenAPIClient/OAITripResponseStartCoordinates.h>
#import <OpenAPIClient/OAITripResponseTrips.h>
#import <OpenAPIClient/OAIUser.h>
#import <OpenAPIClient/OAIUserBase.h>
#import <OpenAPIClient/OAIUserRole.h>
#import <OpenAPIClient/OAIUserTagRole.h>
#import <OpenAPIClient/OAIUserTagRoleTag.h>
#import <OpenAPIClient/OAIVehicle.h>
#import <OpenAPIClient/OAIVehicleHarshEventResponse.h>
#import <OpenAPIClient/OAIVehicleHarshEventResponseLocation.h>
#import <OpenAPIClient/OAIVehicleLocation.h>
#import <OpenAPIClient/OAIVehicleMaintenance.h>
#import <OpenAPIClient/OAIVehicleMaintenanceJ1939.h>
#import <OpenAPIClient/OAIVehicleMaintenanceJ1939CheckEngineLight.h>
#import <OpenAPIClient/OAIVehicleMaintenanceJ1939DiagnosticTroubleCodes.h>
#import <OpenAPIClient/OAIVehicleMaintenancePassenger.h>
#import <OpenAPIClient/OAIVehicleMaintenancePassengerCheckEngineLight.h>
#import <OpenAPIClient/OAIVehicleMaintenancePassengerDiagnosticTroubleCodes.h>
#import <OpenAPIClient/OAIVehicleSafetyScoreResponse.h>
// load API classes for accessing endpoints
#import <OpenAPIClient/OAIAssetsApi.h>
#import <OpenAPIClient/OAIDriversApi.h>
#import <OpenAPIClient/OAIFleetApi.h>
#import <OpenAPIClient/OAIIndustrialApi.h>
#import <OpenAPIClient/OAIRoutesApi.h>
#import <OpenAPIClient/OAISafetyApi.h>
#import <OpenAPIClient/OAISensorsApi.h>
#import <OpenAPIClient/OAITagsApi.h>
#import <OpenAPIClient/OAIUsersApi.h>

```

## Recommendation

It's recommended to create an instance of ApiClient per thread in a multi-threaded environment to avoid any potential issues.

## Getting Started

Please follow the [installation procedure](#installation--usage) and then run the following:

```objc


NSString* *accessToken = @"accessToken_example"; // Samsara API access token.
NSNumber* *groupId = @56; // Optional group ID if the organization has multiple groups (uncommon). (optional)

OAIAssetsApi *apiInstance = [[OAIAssetsApi alloc] init];

// /fleet/assets/locations
[apiInstance getAllAssetCurrentLocationsWithAccessToken:accessToken
    groupId:groupId
              completionHandler: ^(OAIInlineResponse2001* output, NSError* error) {
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
*OAIAssetsApi* | [**getAllAssetCurrentLocations**](docs/OAIAssetsApi.md#getallassetcurrentlocations) | **GET** /fleet/assets/locations | /fleet/assets/locations
*OAIAssetsApi* | [**getAllAssets**](docs/OAIAssetsApi.md#getallassets) | **GET** /fleet/assets | /fleet/assets
*OAIAssetsApi* | [**getAssetLocation**](docs/OAIAssetsApi.md#getassetlocation) | **GET** /fleet/assets/{asset_id}/locations | /fleet/assets/{assetId:[0-9]+}/locations
*OAIAssetsApi* | [**getAssetReefer**](docs/OAIAssetsApi.md#getassetreefer) | **GET** /fleet/assets/{asset_id}/reefer | /fleet/assets/{assetId:[0-9]+}/reefer
*OAIDriversApi* | [**createDriver**](docs/OAIDriversApi.md#createdriver) | **POST** /fleet/drivers/create | /fleet/drivers/create
*OAIDriversApi* | [**deactivateDriver**](docs/OAIDriversApi.md#deactivatedriver) | **DELETE** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*OAIDriversApi* | [**getAllDeactivatedDrivers**](docs/OAIDriversApi.md#getalldeactivateddrivers) | **GET** /fleet/drivers/inactive | /fleet/drivers/inactive
*OAIDriversApi* | [**getDeactivatedDriverById**](docs/OAIDriversApi.md#getdeactivateddriverbyid) | **GET** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*OAIDriversApi* | [**getDriverById**](docs/OAIDriversApi.md#getdriverbyid) | **GET** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*OAIDriversApi* | [**reactivateDriverById**](docs/OAIDriversApi.md#reactivatedriverbyid) | **PUT** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*OAIFleetApi* | [**addFleetAddress**](docs/OAIFleetApi.md#addfleetaddress) | **POST** /fleet/add_address | /fleet/add_address
*OAIFleetApi* | [**addOrganizationAddresses**](docs/OAIFleetApi.md#addorganizationaddresses) | **POST** /addresses | /addresses
*OAIFleetApi* | [**createDispatchRoute**](docs/OAIFleetApi.md#createdispatchroute) | **POST** /fleet/dispatch/routes | /fleet/dispatch/routes
*OAIFleetApi* | [**createDriver**](docs/OAIFleetApi.md#createdriver) | **POST** /fleet/drivers/create | /fleet/drivers/create
*OAIFleetApi* | [**createDriverDispatchRoute**](docs/OAIFleetApi.md#createdriverdispatchroute) | **POST** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
*OAIFleetApi* | [**createDriverDocument**](docs/OAIFleetApi.md#createdriverdocument) | **POST** /fleet/drivers/{driver_id}/documents | /fleet/drivers/{driver_id:[0-9]+}/documents
*OAIFleetApi* | [**createDvir**](docs/OAIFleetApi.md#createdvir) | **POST** /fleet/maintenance/dvirs | /fleet/maintenance/dvirs
*OAIFleetApi* | [**createVehicleDispatchRoute**](docs/OAIFleetApi.md#createvehicledispatchroute) | **POST** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
*OAIFleetApi* | [**deactivateDriver**](docs/OAIFleetApi.md#deactivatedriver) | **DELETE** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*OAIFleetApi* | [**deleteDispatchRouteById**](docs/OAIFleetApi.md#deletedispatchroutebyid) | **DELETE** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
*OAIFleetApi* | [**deleteOrganizationAddress**](docs/OAIFleetApi.md#deleteorganizationaddress) | **DELETE** /addresses/{addressId} | /addresses/{addressId}
*OAIFleetApi* | [**fetchAllDispatchRoutes**](docs/OAIFleetApi.md#fetchalldispatchroutes) | **GET** /fleet/dispatch/routes | /fleet/dispatch/routes
*OAIFleetApi* | [**fetchAllRouteJobUpdates**](docs/OAIFleetApi.md#fetchallroutejobupdates) | **GET** /fleet/dispatch/routes/job_updates | /fleet/dispatch/routes/job_updates
*OAIFleetApi* | [**getAllAssetCurrentLocations**](docs/OAIFleetApi.md#getallassetcurrentlocations) | **GET** /fleet/assets/locations | /fleet/assets/locations
*OAIFleetApi* | [**getAllAssets**](docs/OAIFleetApi.md#getallassets) | **GET** /fleet/assets | /fleet/assets
*OAIFleetApi* | [**getAllDeactivatedDrivers**](docs/OAIFleetApi.md#getalldeactivateddrivers) | **GET** /fleet/drivers/inactive | /fleet/drivers/inactive
*OAIFleetApi* | [**getAssetLocation**](docs/OAIFleetApi.md#getassetlocation) | **GET** /fleet/assets/{asset_id}/locations | /fleet/assets/{assetId:[0-9]+}/locations
*OAIFleetApi* | [**getAssetReefer**](docs/OAIFleetApi.md#getassetreefer) | **GET** /fleet/assets/{asset_id}/reefer | /fleet/assets/{assetId:[0-9]+}/reefer
*OAIFleetApi* | [**getDeactivatedDriverById**](docs/OAIFleetApi.md#getdeactivateddriverbyid) | **GET** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*OAIFleetApi* | [**getDispatchRouteById**](docs/OAIFleetApi.md#getdispatchroutebyid) | **GET** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}
*OAIFleetApi* | [**getDispatchRouteHistory**](docs/OAIFleetApi.md#getdispatchroutehistory) | **GET** /fleet/dispatch/routes/{route_id}/history | /fleet/dispatch/routes/{route_id:[0-9]+}/history
*OAIFleetApi* | [**getDispatchRoutesByDriverId**](docs/OAIFleetApi.md#getdispatchroutesbydriverid) | **GET** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
*OAIFleetApi* | [**getDispatchRoutesByVehicleId**](docs/OAIFleetApi.md#getdispatchroutesbyvehicleid) | **GET** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
*OAIFleetApi* | [**getDriverById**](docs/OAIFleetApi.md#getdriverbyid) | **GET** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*OAIFleetApi* | [**getDriverDocumentTypesByOrgId**](docs/OAIFleetApi.md#getdriverdocumenttypesbyorgid) | **GET** /fleet/drivers/document_types | /fleet/drivers/document_types
*OAIFleetApi* | [**getDriverDocumentsByOrgId**](docs/OAIFleetApi.md#getdriverdocumentsbyorgid) | **GET** /fleet/drivers/documents | /fleet/drivers/documents
*OAIFleetApi* | [**getDriverSafetyScore**](docs/OAIFleetApi.md#getdriversafetyscore) | **GET** /fleet/drivers/{driverId}/safety/score | /fleet/drivers/{driverId:[0-9]+}/safety/score
*OAIFleetApi* | [**getDvirs**](docs/OAIFleetApi.md#getdvirs) | **GET** /fleet/maintenance/dvirs | /fleet/maintenance/dvirs
*OAIFleetApi* | [**getFleetDrivers**](docs/OAIFleetApi.md#getfleetdrivers) | **POST** /fleet/drivers | /fleet/drivers
*OAIFleetApi* | [**getFleetDriversHosDailyLogs**](docs/OAIFleetApi.md#getfleetdrivershosdailylogs) | **POST** /fleet/drivers/{driver_id}/hos_daily_logs | /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
*OAIFleetApi* | [**getFleetDriversSummary**](docs/OAIFleetApi.md#getfleetdriverssummary) | **POST** /fleet/drivers/summary | /fleet/drivers/summary
*OAIFleetApi* | [**getFleetHosAuthenticationLogs**](docs/OAIFleetApi.md#getfleethosauthenticationlogs) | **POST** /fleet/hos_authentication_logs | /fleet/hos_authentication_logs
*OAIFleetApi* | [**getFleetHosLogs**](docs/OAIFleetApi.md#getfleethoslogs) | **POST** /fleet/hos_logs | /fleet/hos_logs
*OAIFleetApi* | [**getFleetHosLogsSummary**](docs/OAIFleetApi.md#getfleethoslogssummary) | **POST** /fleet/hos_logs_summary | /fleet/hos_logs_summary
*OAIFleetApi* | [**getFleetLocations**](docs/OAIFleetApi.md#getfleetlocations) | **POST** /fleet/locations | /fleet/locations
*OAIFleetApi* | [**getFleetMaintenanceList**](docs/OAIFleetApi.md#getfleetmaintenancelist) | **POST** /fleet/maintenance/list | /fleet/maintenance/list
*OAIFleetApi* | [**getFleetTrips**](docs/OAIFleetApi.md#getfleettrips) | **POST** /fleet/trips | /fleet/trips
*OAIFleetApi* | [**getFleetVehicle**](docs/OAIFleetApi.md#getfleetvehicle) | **GET** /fleet/vehicles/{vehicle_id_or_external_id} | /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*OAIFleetApi* | [**getOrganizationAddress**](docs/OAIFleetApi.md#getorganizationaddress) | **GET** /addresses/{addressId} | /addresses/{addressId}
*OAIFleetApi* | [**getOrganizationAddresses**](docs/OAIFleetApi.md#getorganizationaddresses) | **GET** /addresses | /addresses
*OAIFleetApi* | [**getOrganizationContact**](docs/OAIFleetApi.md#getorganizationcontact) | **GET** /contacts/{contact_id} | /contacts/{contact_id}
*OAIFleetApi* | [**getVehicleHarshEvent**](docs/OAIFleetApi.md#getvehicleharshevent) | **GET** /fleet/vehicles/{vehicleId}/safety/harsh_event | /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
*OAIFleetApi* | [**getVehicleLocations**](docs/OAIFleetApi.md#getvehiclelocations) | **GET** /fleet/vehicles/{vehicle_id}/locations | /fleet/vehicles/{vehicle_id:[0-9]+}/locations
*OAIFleetApi* | [**getVehicleSafetyScore**](docs/OAIFleetApi.md#getvehiclesafetyscore) | **GET** /fleet/vehicles/{vehicleId}/safety/score | /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
*OAIFleetApi* | [**getVehicleStats**](docs/OAIFleetApi.md#getvehiclestats) | **GET** /fleet/vehicles/stats | /fleet/vehicles/stats
*OAIFleetApi* | [**getVehiclesLocations**](docs/OAIFleetApi.md#getvehicleslocations) | **GET** /fleet/vehicles/locations | /fleet/vehicles/locations
*OAIFleetApi* | [**listContacts**](docs/OAIFleetApi.md#listcontacts) | **GET** /contacts | /contacts
*OAIFleetApi* | [**listFleet**](docs/OAIFleetApi.md#listfleet) | **POST** /fleet/list | /fleet/list
*OAIFleetApi* | [**patchFleetVehicle**](docs/OAIFleetApi.md#patchfleetvehicle) | **PATCH** /fleet/vehicles/{vehicle_id_or_external_id} | /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*OAIFleetApi* | [**reactivateDriverById**](docs/OAIFleetApi.md#reactivatedriverbyid) | **PUT** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*OAIFleetApi* | [**updateDispatchRouteById**](docs/OAIFleetApi.md#updatedispatchroutebyid) | **PUT** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
*OAIFleetApi* | [**updateOrganizationAddress**](docs/OAIFleetApi.md#updateorganizationaddress) | **PATCH** /addresses/{addressId} | /addresses/{addressId}
*OAIFleetApi* | [**updateVehicles**](docs/OAIFleetApi.md#updatevehicles) | **POST** /fleet/set_data | /fleet/set_data
*OAIIndustrialApi* | [**getAllDataInputs**](docs/OAIIndustrialApi.md#getalldatainputs) | **GET** /industrial/data | /industrial/data
*OAIIndustrialApi* | [**getDataInput**](docs/OAIIndustrialApi.md#getdatainput) | **GET** /industrial/data/{data_input_id} | /industrial/data/{data_input_id:[0-9]+}
*OAIIndustrialApi* | [**getMachines**](docs/OAIIndustrialApi.md#getmachines) | **POST** /machines/list | /machines/list
*OAIIndustrialApi* | [**getMachinesHistory**](docs/OAIIndustrialApi.md#getmachineshistory) | **POST** /machines/history | /machines/history
*OAIRoutesApi* | [**createDispatchRoute**](docs/OAIRoutesApi.md#createdispatchroute) | **POST** /fleet/dispatch/routes | /fleet/dispatch/routes
*OAIRoutesApi* | [**createDriverDispatchRoute**](docs/OAIRoutesApi.md#createdriverdispatchroute) | **POST** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
*OAIRoutesApi* | [**createVehicleDispatchRoute**](docs/OAIRoutesApi.md#createvehicledispatchroute) | **POST** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
*OAIRoutesApi* | [**deleteDispatchRouteById**](docs/OAIRoutesApi.md#deletedispatchroutebyid) | **DELETE** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
*OAIRoutesApi* | [**fetchAllDispatchRoutes**](docs/OAIRoutesApi.md#fetchalldispatchroutes) | **GET** /fleet/dispatch/routes | /fleet/dispatch/routes
*OAIRoutesApi* | [**fetchAllRouteJobUpdates**](docs/OAIRoutesApi.md#fetchallroutejobupdates) | **GET** /fleet/dispatch/routes/job_updates | /fleet/dispatch/routes/job_updates
*OAIRoutesApi* | [**getDispatchRouteById**](docs/OAIRoutesApi.md#getdispatchroutebyid) | **GET** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}
*OAIRoutesApi* | [**getDispatchRouteHistory**](docs/OAIRoutesApi.md#getdispatchroutehistory) | **GET** /fleet/dispatch/routes/{route_id}/history | /fleet/dispatch/routes/{route_id:[0-9]+}/history
*OAIRoutesApi* | [**getDispatchRoutesByDriverId**](docs/OAIRoutesApi.md#getdispatchroutesbydriverid) | **GET** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
*OAIRoutesApi* | [**getDispatchRoutesByVehicleId**](docs/OAIRoutesApi.md#getdispatchroutesbyvehicleid) | **GET** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
*OAIRoutesApi* | [**updateDispatchRouteById**](docs/OAIRoutesApi.md#updatedispatchroutebyid) | **PUT** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
*OAISafetyApi* | [**getDriverSafetyScore**](docs/OAISafetyApi.md#getdriversafetyscore) | **GET** /fleet/drivers/{driverId}/safety/score | /fleet/drivers/{driverId:[0-9]+}/safety/score
*OAISafetyApi* | [**getVehicleHarshEvent**](docs/OAISafetyApi.md#getvehicleharshevent) | **GET** /fleet/vehicles/{vehicleId}/safety/harsh_event | /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
*OAISafetyApi* | [**getVehicleSafetyScore**](docs/OAISafetyApi.md#getvehiclesafetyscore) | **GET** /fleet/vehicles/{vehicleId}/safety/score | /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
*OAISensorsApi* | [**getSensors**](docs/OAISensorsApi.md#getsensors) | **POST** /sensors/list | /sensors/list
*OAISensorsApi* | [**getSensorsCargo**](docs/OAISensorsApi.md#getsensorscargo) | **POST** /sensors/cargo | /sensors/cargo
*OAISensorsApi* | [**getSensorsDoor**](docs/OAISensorsApi.md#getsensorsdoor) | **POST** /sensors/door | /sensors/door
*OAISensorsApi* | [**getSensorsHistory**](docs/OAISensorsApi.md#getsensorshistory) | **POST** /sensors/history | /sensors/history
*OAISensorsApi* | [**getSensorsHumidity**](docs/OAISensorsApi.md#getsensorshumidity) | **POST** /sensors/humidity | /sensors/humidity
*OAISensorsApi* | [**getSensorsTemperature**](docs/OAISensorsApi.md#getsensorstemperature) | **POST** /sensors/temperature | /sensors/temperature
*OAITagsApi* | [**createTag**](docs/OAITagsApi.md#createtag) | **POST** /tags | /tags
*OAITagsApi* | [**deleteTagById**](docs/OAITagsApi.md#deletetagbyid) | **DELETE** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
*OAITagsApi* | [**getAllTags**](docs/OAITagsApi.md#getalltags) | **GET** /tags | /tags
*OAITagsApi* | [**getTagById**](docs/OAITagsApi.md#gettagbyid) | **GET** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
*OAITagsApi* | [**modifyTagById**](docs/OAITagsApi.md#modifytagbyid) | **PATCH** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
*OAITagsApi* | [**updateTagById**](docs/OAITagsApi.md#updatetagbyid) | **PUT** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
*OAIUsersApi* | [**deleteUserById**](docs/OAIUsersApi.md#deleteuserbyid) | **DELETE** /users/{userId} | /users/{userId:[0-9]+}
*OAIUsersApi* | [**getUserById**](docs/OAIUsersApi.md#getuserbyid) | **GET** /users/{userId} | /users/{userId:[0-9]+}
*OAIUsersApi* | [**listUserRoles**](docs/OAIUsersApi.md#listuserroles) | **GET** /user_roles | /user_roles
*OAIUsersApi* | [**listUsers**](docs/OAIUsersApi.md#listusers) | **GET** /users | /users


## Documentation For Models

 - [OAIAddress](docs/OAIAddress.md)
 - [OAIAddressGeofence](docs/OAIAddressGeofence.md)
 - [OAIAddressGeofenceCircle](docs/OAIAddressGeofenceCircle.md)
 - [OAIAddressGeofencePolygon](docs/OAIAddressGeofencePolygon.md)
 - [OAIAddressGeofencePolygonVertices](docs/OAIAddressGeofencePolygonVertices.md)
 - [OAIAddressesAddresses](docs/OAIAddressesAddresses.md)
 - [OAIAllRouteJobUpdates](docs/OAIAllRouteJobUpdates.md)
 - [OAIAsset](docs/OAIAsset.md)
 - [OAIAssetCable](docs/OAIAssetCable.md)
 - [OAIAssetCurrentLocation](docs/OAIAssetCurrentLocation.md)
 - [OAIAssetCurrentLocationsResponse](docs/OAIAssetCurrentLocationsResponse.md)
 - [OAIAssetReeferResponse](docs/OAIAssetReeferResponse.md)
 - [OAIAssetReeferResponseReeferStats](docs/OAIAssetReeferResponseReeferStats.md)
 - [OAIAssetReeferResponseReeferStatsAlarms](docs/OAIAssetReeferResponseReeferStatsAlarms.md)
 - [OAIAssetReeferResponseReeferStatsAlarms1](docs/OAIAssetReeferResponseReeferStatsAlarms1.md)
 - [OAIAssetReeferResponseReeferStatsEngineHours](docs/OAIAssetReeferResponseReeferStatsEngineHours.md)
 - [OAIAssetReeferResponseReeferStatsFuelPercentage](docs/OAIAssetReeferResponseReeferStatsFuelPercentage.md)
 - [OAIAssetReeferResponseReeferStatsPowerStatus](docs/OAIAssetReeferResponseReeferStatsPowerStatus.md)
 - [OAIAssetReeferResponseReeferStatsReturnAirTemp](docs/OAIAssetReeferResponseReeferStatsReturnAirTemp.md)
 - [OAIAssetReeferResponseReeferStatsSetPoint](docs/OAIAssetReeferResponseReeferStatsSetPoint.md)
 - [OAIAuxInput](docs/OAIAuxInput.md)
 - [OAIAuxInputSeries](docs/OAIAuxInputSeries.md)
 - [OAICargoResponse](docs/OAICargoResponse.md)
 - [OAICargoResponseSensors](docs/OAICargoResponseSensors.md)
 - [OAIContact](docs/OAIContact.md)
 - [OAICurrentDriver](docs/OAICurrentDriver.md)
 - [OAIDataInputHistoryResponse](docs/OAIDataInputHistoryResponse.md)
 - [OAIDataInputHistoryResponsePoints](docs/OAIDataInputHistoryResponsePoints.md)
 - [OAIDispatchJob](docs/OAIDispatchJob.md)
 - [OAIDispatchJobCreate](docs/OAIDispatchJobCreate.md)
 - [OAIDispatchRoute](docs/OAIDispatchRoute.md)
 - [OAIDispatchRouteBase](docs/OAIDispatchRouteBase.md)
 - [OAIDispatchRouteCreate](docs/OAIDispatchRouteCreate.md)
 - [OAIDispatchRouteHistoricalEntry](docs/OAIDispatchRouteHistoricalEntry.md)
 - [OAIDispatchRouteHistory](docs/OAIDispatchRouteHistory.md)
 - [OAIDocument](docs/OAIDocument.md)
 - [OAIDocumentBase](docs/OAIDocumentBase.md)
 - [OAIDocumentCreate](docs/OAIDocumentCreate.md)
 - [OAIDocumentField](docs/OAIDocumentField.md)
 - [OAIDocumentFieldCreate](docs/OAIDocumentFieldCreate.md)
 - [OAIDocumentFieldCreatePhotoValue](docs/OAIDocumentFieldCreatePhotoValue.md)
 - [OAIDocumentFieldType](docs/OAIDocumentFieldType.md)
 - [OAIDocumentFieldTypeNumberValueTypeMetadata](docs/OAIDocumentFieldTypeNumberValueTypeMetadata.md)
 - [OAIDocumentType](docs/OAIDocumentType.md)
 - [OAIDoorResponse](docs/OAIDoorResponse.md)
 - [OAIDoorResponseSensors](docs/OAIDoorResponseSensors.md)
 - [OAIDriver](docs/OAIDriver.md)
 - [OAIDriverBase](docs/OAIDriverBase.md)
 - [OAIDriverDailyLogResponse](docs/OAIDriverDailyLogResponse.md)
 - [OAIDriverDailyLogResponseDays](docs/OAIDriverDailyLogResponseDays.md)
 - [OAIDriverForCreate](docs/OAIDriverForCreate.md)
 - [OAIDriverSafetyScoreResponse](docs/OAIDriverSafetyScoreResponse.md)
 - [OAIDriversResponse](docs/OAIDriversResponse.md)
 - [OAIDriversSummaryResponse](docs/OAIDriversSummaryResponse.md)
 - [OAIDriversSummaryResponseSummaries](docs/OAIDriversSummaryResponseSummaries.md)
 - [OAIDvirBase](docs/OAIDvirBase.md)
 - [OAIDvirBaseAuthorSignature](docs/OAIDvirBaseAuthorSignature.md)
 - [OAIDvirBaseMechanicOrAgentSignature](docs/OAIDvirBaseMechanicOrAgentSignature.md)
 - [OAIDvirBaseNextDriverSignature](docs/OAIDvirBaseNextDriverSignature.md)
 - [OAIDvirBaseTrailerDefects](docs/OAIDvirBaseTrailerDefects.md)
 - [OAIDvirBaseVehicle](docs/OAIDvirBaseVehicle.md)
 - [OAIDvirListResponse](docs/OAIDvirListResponse.md)
 - [OAIEngineState](docs/OAIEngineState.md)
 - [OAIFleetVehicleLocation](docs/OAIFleetVehicleLocation.md)
 - [OAIFleetVehicleResponse](docs/OAIFleetVehicleResponse.md)
 - [OAIFleetVehicleResponseVehicleInfo](docs/OAIFleetVehicleResponseVehicleInfo.md)
 - [OAIHosAuthenticationLogsResponse](docs/OAIHosAuthenticationLogsResponse.md)
 - [OAIHosAuthenticationLogsResponseAuthenticationLogs](docs/OAIHosAuthenticationLogsResponseAuthenticationLogs.md)
 - [OAIHosLogsResponse](docs/OAIHosLogsResponse.md)
 - [OAIHosLogsResponseLogs](docs/OAIHosLogsResponseLogs.md)
 - [OAIHosLogsSummaryResponse](docs/OAIHosLogsSummaryResponse.md)
 - [OAIHosLogsSummaryResponseDrivers](docs/OAIHosLogsSummaryResponseDrivers.md)
 - [OAIHumidityResponse](docs/OAIHumidityResponse.md)
 - [OAIHumidityResponseSensors](docs/OAIHumidityResponseSensors.md)
 - [OAIInlineObject](docs/OAIInlineObject.md)
 - [OAIInlineObject1](docs/OAIInlineObject1.md)
 - [OAIInlineObject10](docs/OAIInlineObject10.md)
 - [OAIInlineObject11](docs/OAIInlineObject11.md)
 - [OAIInlineObject12](docs/OAIInlineObject12.md)
 - [OAIInlineObject13](docs/OAIInlineObject13.md)
 - [OAIInlineObject14](docs/OAIInlineObject14.md)
 - [OAIInlineObject15](docs/OAIInlineObject15.md)
 - [OAIInlineObject16](docs/OAIInlineObject16.md)
 - [OAIInlineObject17](docs/OAIInlineObject17.md)
 - [OAIInlineObject18](docs/OAIInlineObject18.md)
 - [OAIInlineObject19](docs/OAIInlineObject19.md)
 - [OAIInlineObject2](docs/OAIInlineObject2.md)
 - [OAIInlineObject20](docs/OAIInlineObject20.md)
 - [OAIInlineObject21](docs/OAIInlineObject21.md)
 - [OAIInlineObject22](docs/OAIInlineObject22.md)
 - [OAIInlineObject23](docs/OAIInlineObject23.md)
 - [OAIInlineObject24](docs/OAIInlineObject24.md)
 - [OAIInlineObject3](docs/OAIInlineObject3.md)
 - [OAIInlineObject4](docs/OAIInlineObject4.md)
 - [OAIInlineObject5](docs/OAIInlineObject5.md)
 - [OAIInlineObject6](docs/OAIInlineObject6.md)
 - [OAIInlineObject7](docs/OAIInlineObject7.md)
 - [OAIInlineObject8](docs/OAIInlineObject8.md)
 - [OAIInlineObject9](docs/OAIInlineObject9.md)
 - [OAIInlineResponse200](docs/OAIInlineResponse200.md)
 - [OAIInlineResponse2001](docs/OAIInlineResponse2001.md)
 - [OAIInlineResponse2002](docs/OAIInlineResponse2002.md)
 - [OAIInlineResponse2003](docs/OAIInlineResponse2003.md)
 - [OAIInlineResponse2004](docs/OAIInlineResponse2004.md)
 - [OAIInlineResponse2005](docs/OAIInlineResponse2005.md)
 - [OAIInlineResponse2005VehicleStats](docs/OAIInlineResponse2005VehicleStats.md)
 - [OAIInlineResponse2006](docs/OAIInlineResponse2006.md)
 - [OAIInlineResponse2007](docs/OAIInlineResponse2007.md)
 - [OAIInlineResponse2008](docs/OAIInlineResponse2008.md)
 - [OAIInlineResponse2009](docs/OAIInlineResponse2009.md)
 - [OAIJobStatus](docs/OAIJobStatus.md)
 - [OAIJobUpdateObject](docs/OAIJobUpdateObject.md)
 - [OAIMachine](docs/OAIMachine.md)
 - [OAIMachineHistoryResponse](docs/OAIMachineHistoryResponse.md)
 - [OAIMachineHistoryResponseMachines](docs/OAIMachineHistoryResponseMachines.md)
 - [OAIMachineHistoryResponseVibrations](docs/OAIMachineHistoryResponseVibrations.md)
 - [OAIPagination](docs/OAIPagination.md)
 - [OAIPrevJobStatus](docs/OAIPrevJobStatus.md)
 - [OAISafetyReportHarshEvent](docs/OAISafetyReportHarshEvent.md)
 - [OAISensor](docs/OAISensor.md)
 - [OAISensorHistoryResponse](docs/OAISensorHistoryResponse.md)
 - [OAISensorHistoryResponseResults](docs/OAISensorHistoryResponseResults.md)
 - [OAISensorsHistorySeries](docs/OAISensorsHistorySeries.md)
 - [OAITag](docs/OAITag.md)
 - [OAITagCreate](docs/OAITagCreate.md)
 - [OAITagMetadata](docs/OAITagMetadata.md)
 - [OAITagModify](docs/OAITagModify.md)
 - [OAITagModifyAdd](docs/OAITagModifyAdd.md)
 - [OAITagModifyDelete](docs/OAITagModifyDelete.md)
 - [OAITagUpdate](docs/OAITagUpdate.md)
 - [OAITaggedAddress](docs/OAITaggedAddress.md)
 - [OAITaggedAddressBase](docs/OAITaggedAddressBase.md)
 - [OAITaggedAsset](docs/OAITaggedAsset.md)
 - [OAITaggedAssetBase](docs/OAITaggedAssetBase.md)
 - [OAITaggedDriver](docs/OAITaggedDriver.md)
 - [OAITaggedDriverBase](docs/OAITaggedDriverBase.md)
 - [OAITaggedMachine](docs/OAITaggedMachine.md)
 - [OAITaggedMachineBase](docs/OAITaggedMachineBase.md)
 - [OAITaggedSensor](docs/OAITaggedSensor.md)
 - [OAITaggedSensorBase](docs/OAITaggedSensorBase.md)
 - [OAITaggedVehicle](docs/OAITaggedVehicle.md)
 - [OAITaggedVehicleBase](docs/OAITaggedVehicleBase.md)
 - [OAITemperatureResponse](docs/OAITemperatureResponse.md)
 - [OAITemperatureResponseSensors](docs/OAITemperatureResponseSensors.md)
 - [OAITripResponse](docs/OAITripResponse.md)
 - [OAITripResponseEndCoordinates](docs/OAITripResponseEndCoordinates.md)
 - [OAITripResponseStartCoordinates](docs/OAITripResponseStartCoordinates.md)
 - [OAITripResponseTrips](docs/OAITripResponseTrips.md)
 - [OAIUser](docs/OAIUser.md)
 - [OAIUserBase](docs/OAIUserBase.md)
 - [OAIUserRole](docs/OAIUserRole.md)
 - [OAIUserTagRole](docs/OAIUserTagRole.md)
 - [OAIUserTagRoleTag](docs/OAIUserTagRoleTag.md)
 - [OAIVehicle](docs/OAIVehicle.md)
 - [OAIVehicleHarshEventResponse](docs/OAIVehicleHarshEventResponse.md)
 - [OAIVehicleHarshEventResponseLocation](docs/OAIVehicleHarshEventResponseLocation.md)
 - [OAIVehicleLocation](docs/OAIVehicleLocation.md)
 - [OAIVehicleMaintenance](docs/OAIVehicleMaintenance.md)
 - [OAIVehicleMaintenanceJ1939](docs/OAIVehicleMaintenanceJ1939.md)
 - [OAIVehicleMaintenanceJ1939CheckEngineLight](docs/OAIVehicleMaintenanceJ1939CheckEngineLight.md)
 - [OAIVehicleMaintenanceJ1939DiagnosticTroubleCodes](docs/OAIVehicleMaintenanceJ1939DiagnosticTroubleCodes.md)
 - [OAIVehicleMaintenancePassenger](docs/OAIVehicleMaintenancePassenger.md)
 - [OAIVehicleMaintenancePassengerCheckEngineLight](docs/OAIVehicleMaintenancePassengerCheckEngineLight.md)
 - [OAIVehicleMaintenancePassengerDiagnosticTroubleCodes](docs/OAIVehicleMaintenancePassengerDiagnosticTroubleCodes.md)
 - [OAIVehicleSafetyScoreResponse](docs/OAIVehicleSafetyScoreResponse.md)


## Documentation For Authorization

 All endpoints do not require authorization.


## Author





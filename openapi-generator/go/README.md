# Go API client for openapi

# Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).

## Overview
This API client was generated by the [OpenAPI Generator](https://openapi-generator.tech) project.  By using the [OpenAPI-spec](https://www.openapis.org/) from a remote server, you can easily generate an API client.

- API version: 1.0.0
- Package version: 1.0.0
- Build package: org.openapitools.codegen.languages.GoClientCodegen

## Installation

Install the following dependencies:
```
go get github.com/stretchr/testify/assert
go get golang.org/x/oauth2
go get golang.org/x/net/context
go get github.com/antihax/optional
```

Put the package under your project folder and add the following in import:
```golang
import "./openapi"
```

## Documentation for API Endpoints

All URIs are relative to *https://api.samsara.com/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AssetsApi* | [**GetAllAssetCurrentLocations**](docs/AssetsApi.md#getallassetcurrentlocations) | **Get** /fleet/assets/locations | /fleet/assets/locations
*AssetsApi* | [**GetAllAssets**](docs/AssetsApi.md#getallassets) | **Get** /fleet/assets | /fleet/assets
*AssetsApi* | [**GetAssetLocation**](docs/AssetsApi.md#getassetlocation) | **Get** /fleet/assets/{asset_id}/locations | /fleet/assets/{assetId:[0-9]+}/locations
*AssetsApi* | [**GetAssetReefer**](docs/AssetsApi.md#getassetreefer) | **Get** /fleet/assets/{asset_id}/reefer | /fleet/assets/{assetId:[0-9]+}/reefer
*DriversApi* | [**CreateDriver**](docs/DriversApi.md#createdriver) | **Post** /fleet/drivers/create | /fleet/drivers/create
*DriversApi* | [**DeactivateDriver**](docs/DriversApi.md#deactivatedriver) | **Delete** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*DriversApi* | [**GetAllDeactivatedDrivers**](docs/DriversApi.md#getalldeactivateddrivers) | **Get** /fleet/drivers/inactive | /fleet/drivers/inactive
*DriversApi* | [**GetDeactivatedDriverById**](docs/DriversApi.md#getdeactivateddriverbyid) | **Get** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*DriversApi* | [**GetDriverById**](docs/DriversApi.md#getdriverbyid) | **Get** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*DriversApi* | [**ReactivateDriverById**](docs/DriversApi.md#reactivatedriverbyid) | **Put** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*FleetApi* | [**AddFleetAddress**](docs/FleetApi.md#addfleetaddress) | **Post** /fleet/add_address | /fleet/add_address
*FleetApi* | [**AddOrganizationAddresses**](docs/FleetApi.md#addorganizationaddresses) | **Post** /addresses | /addresses
*FleetApi* | [**CreateDispatchRoute**](docs/FleetApi.md#createdispatchroute) | **Post** /fleet/dispatch/routes | /fleet/dispatch/routes
*FleetApi* | [**CreateDriver**](docs/FleetApi.md#createdriver) | **Post** /fleet/drivers/create | /fleet/drivers/create
*FleetApi* | [**CreateDriverDispatchRoute**](docs/FleetApi.md#createdriverdispatchroute) | **Post** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
*FleetApi* | [**CreateDriverDocument**](docs/FleetApi.md#createdriverdocument) | **Post** /fleet/drivers/{driver_id}/documents | /fleet/drivers/{driver_id:[0-9]+}/documents
*FleetApi* | [**CreateDvir**](docs/FleetApi.md#createdvir) | **Post** /fleet/maintenance/dvirs | /fleet/maintenance/dvirs
*FleetApi* | [**CreateVehicleDispatchRoute**](docs/FleetApi.md#createvehicledispatchroute) | **Post** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
*FleetApi* | [**DeactivateDriver**](docs/FleetApi.md#deactivatedriver) | **Delete** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*FleetApi* | [**DeleteDispatchRouteById**](docs/FleetApi.md#deletedispatchroutebyid) | **Delete** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
*FleetApi* | [**DeleteOrganizationAddress**](docs/FleetApi.md#deleteorganizationaddress) | **Delete** /addresses/{addressId} | /addresses/{addressId}
*FleetApi* | [**FetchAllDispatchRoutes**](docs/FleetApi.md#fetchalldispatchroutes) | **Get** /fleet/dispatch/routes | /fleet/dispatch/routes
*FleetApi* | [**FetchAllRouteJobUpdates**](docs/FleetApi.md#fetchallroutejobupdates) | **Get** /fleet/dispatch/routes/job_updates | /fleet/dispatch/routes/job_updates
*FleetApi* | [**GetAllAssetCurrentLocations**](docs/FleetApi.md#getallassetcurrentlocations) | **Get** /fleet/assets/locations | /fleet/assets/locations
*FleetApi* | [**GetAllAssets**](docs/FleetApi.md#getallassets) | **Get** /fleet/assets | /fleet/assets
*FleetApi* | [**GetAllDeactivatedDrivers**](docs/FleetApi.md#getalldeactivateddrivers) | **Get** /fleet/drivers/inactive | /fleet/drivers/inactive
*FleetApi* | [**GetAssetLocation**](docs/FleetApi.md#getassetlocation) | **Get** /fleet/assets/{asset_id}/locations | /fleet/assets/{assetId:[0-9]+}/locations
*FleetApi* | [**GetAssetReefer**](docs/FleetApi.md#getassetreefer) | **Get** /fleet/assets/{asset_id}/reefer | /fleet/assets/{assetId:[0-9]+}/reefer
*FleetApi* | [**GetDeactivatedDriverById**](docs/FleetApi.md#getdeactivateddriverbyid) | **Get** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*FleetApi* | [**GetDispatchRouteById**](docs/FleetApi.md#getdispatchroutebyid) | **Get** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}
*FleetApi* | [**GetDispatchRouteHistory**](docs/FleetApi.md#getdispatchroutehistory) | **Get** /fleet/dispatch/routes/{route_id}/history | /fleet/dispatch/routes/{route_id:[0-9]+}/history
*FleetApi* | [**GetDispatchRoutesByDriverId**](docs/FleetApi.md#getdispatchroutesbydriverid) | **Get** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
*FleetApi* | [**GetDispatchRoutesByVehicleId**](docs/FleetApi.md#getdispatchroutesbyvehicleid) | **Get** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
*FleetApi* | [**GetDriverById**](docs/FleetApi.md#getdriverbyid) | **Get** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*FleetApi* | [**GetDriverDocumentTypesByOrgId**](docs/FleetApi.md#getdriverdocumenttypesbyorgid) | **Get** /fleet/drivers/document_types | /fleet/drivers/document_types
*FleetApi* | [**GetDriverDocumentsByOrgId**](docs/FleetApi.md#getdriverdocumentsbyorgid) | **Get** /fleet/drivers/documents | /fleet/drivers/documents
*FleetApi* | [**GetDriverSafetyScore**](docs/FleetApi.md#getdriversafetyscore) | **Get** /fleet/drivers/{driverId}/safety/score | /fleet/drivers/{driverId:[0-9]+}/safety/score
*FleetApi* | [**GetDvirs**](docs/FleetApi.md#getdvirs) | **Get** /fleet/maintenance/dvirs | /fleet/maintenance/dvirs
*FleetApi* | [**GetFleetDrivers**](docs/FleetApi.md#getfleetdrivers) | **Post** /fleet/drivers | /fleet/drivers
*FleetApi* | [**GetFleetDriversHosDailyLogs**](docs/FleetApi.md#getfleetdrivershosdailylogs) | **Post** /fleet/drivers/{driver_id}/hos_daily_logs | /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
*FleetApi* | [**GetFleetDriversSummary**](docs/FleetApi.md#getfleetdriverssummary) | **Post** /fleet/drivers/summary | /fleet/drivers/summary
*FleetApi* | [**GetFleetHosAuthenticationLogs**](docs/FleetApi.md#getfleethosauthenticationlogs) | **Post** /fleet/hos_authentication_logs | /fleet/hos_authentication_logs
*FleetApi* | [**GetFleetHosLogs**](docs/FleetApi.md#getfleethoslogs) | **Post** /fleet/hos_logs | /fleet/hos_logs
*FleetApi* | [**GetFleetHosLogsSummary**](docs/FleetApi.md#getfleethoslogssummary) | **Post** /fleet/hos_logs_summary | /fleet/hos_logs_summary
*FleetApi* | [**GetFleetLocations**](docs/FleetApi.md#getfleetlocations) | **Post** /fleet/locations | /fleet/locations
*FleetApi* | [**GetFleetMaintenanceList**](docs/FleetApi.md#getfleetmaintenancelist) | **Post** /fleet/maintenance/list | /fleet/maintenance/list
*FleetApi* | [**GetFleetTrips**](docs/FleetApi.md#getfleettrips) | **Post** /fleet/trips | /fleet/trips
*FleetApi* | [**GetFleetVehicle**](docs/FleetApi.md#getfleetvehicle) | **Get** /fleet/vehicles/{vehicle_id_or_external_id} | /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*FleetApi* | [**GetOrganizationAddress**](docs/FleetApi.md#getorganizationaddress) | **Get** /addresses/{addressId} | /addresses/{addressId}
*FleetApi* | [**GetOrganizationAddresses**](docs/FleetApi.md#getorganizationaddresses) | **Get** /addresses | /addresses
*FleetApi* | [**GetOrganizationContact**](docs/FleetApi.md#getorganizationcontact) | **Get** /contacts/{contact_id} | /contacts/{contact_id}
*FleetApi* | [**GetVehicleHarshEvent**](docs/FleetApi.md#getvehicleharshevent) | **Get** /fleet/vehicles/{vehicleId}/safety/harsh_event | /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
*FleetApi* | [**GetVehicleLocations**](docs/FleetApi.md#getvehiclelocations) | **Get** /fleet/vehicles/{vehicle_id}/locations | /fleet/vehicles/{vehicle_id:[0-9]+}/locations
*FleetApi* | [**GetVehicleSafetyScore**](docs/FleetApi.md#getvehiclesafetyscore) | **Get** /fleet/vehicles/{vehicleId}/safety/score | /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
*FleetApi* | [**GetVehicleStats**](docs/FleetApi.md#getvehiclestats) | **Get** /fleet/vehicles/stats | /fleet/vehicles/stats
*FleetApi* | [**GetVehiclesLocations**](docs/FleetApi.md#getvehicleslocations) | **Get** /fleet/vehicles/locations | /fleet/vehicles/locations
*FleetApi* | [**ListContacts**](docs/FleetApi.md#listcontacts) | **Get** /contacts | /contacts
*FleetApi* | [**ListFleet**](docs/FleetApi.md#listfleet) | **Post** /fleet/list | /fleet/list
*FleetApi* | [**PatchFleetVehicle**](docs/FleetApi.md#patchfleetvehicle) | **Patch** /fleet/vehicles/{vehicle_id_or_external_id} | /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*FleetApi* | [**ReactivateDriverById**](docs/FleetApi.md#reactivatedriverbyid) | **Put** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*FleetApi* | [**UpdateDispatchRouteById**](docs/FleetApi.md#updatedispatchroutebyid) | **Put** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
*FleetApi* | [**UpdateOrganizationAddress**](docs/FleetApi.md#updateorganizationaddress) | **Patch** /addresses/{addressId} | /addresses/{addressId}
*FleetApi* | [**UpdateVehicles**](docs/FleetApi.md#updatevehicles) | **Post** /fleet/set_data | /fleet/set_data
*IndustrialApi* | [**GetAllDataInputs**](docs/IndustrialApi.md#getalldatainputs) | **Get** /industrial/data | /industrial/data
*IndustrialApi* | [**GetDataInput**](docs/IndustrialApi.md#getdatainput) | **Get** /industrial/data/{data_input_id} | /industrial/data/{data_input_id:[0-9]+}
*IndustrialApi* | [**GetMachines**](docs/IndustrialApi.md#getmachines) | **Post** /machines/list | /machines/list
*IndustrialApi* | [**GetMachinesHistory**](docs/IndustrialApi.md#getmachineshistory) | **Post** /machines/history | /machines/history
*RoutesApi* | [**CreateDispatchRoute**](docs/RoutesApi.md#createdispatchroute) | **Post** /fleet/dispatch/routes | /fleet/dispatch/routes
*RoutesApi* | [**CreateDriverDispatchRoute**](docs/RoutesApi.md#createdriverdispatchroute) | **Post** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
*RoutesApi* | [**CreateVehicleDispatchRoute**](docs/RoutesApi.md#createvehicledispatchroute) | **Post** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
*RoutesApi* | [**DeleteDispatchRouteById**](docs/RoutesApi.md#deletedispatchroutebyid) | **Delete** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
*RoutesApi* | [**FetchAllDispatchRoutes**](docs/RoutesApi.md#fetchalldispatchroutes) | **Get** /fleet/dispatch/routes | /fleet/dispatch/routes
*RoutesApi* | [**FetchAllRouteJobUpdates**](docs/RoutesApi.md#fetchallroutejobupdates) | **Get** /fleet/dispatch/routes/job_updates | /fleet/dispatch/routes/job_updates
*RoutesApi* | [**GetDispatchRouteById**](docs/RoutesApi.md#getdispatchroutebyid) | **Get** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}
*RoutesApi* | [**GetDispatchRouteHistory**](docs/RoutesApi.md#getdispatchroutehistory) | **Get** /fleet/dispatch/routes/{route_id}/history | /fleet/dispatch/routes/{route_id:[0-9]+}/history
*RoutesApi* | [**GetDispatchRoutesByDriverId**](docs/RoutesApi.md#getdispatchroutesbydriverid) | **Get** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
*RoutesApi* | [**GetDispatchRoutesByVehicleId**](docs/RoutesApi.md#getdispatchroutesbyvehicleid) | **Get** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
*RoutesApi* | [**UpdateDispatchRouteById**](docs/RoutesApi.md#updatedispatchroutebyid) | **Put** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
*SafetyApi* | [**GetDriverSafetyScore**](docs/SafetyApi.md#getdriversafetyscore) | **Get** /fleet/drivers/{driverId}/safety/score | /fleet/drivers/{driverId:[0-9]+}/safety/score
*SafetyApi* | [**GetVehicleHarshEvent**](docs/SafetyApi.md#getvehicleharshevent) | **Get** /fleet/vehicles/{vehicleId}/safety/harsh_event | /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
*SafetyApi* | [**GetVehicleSafetyScore**](docs/SafetyApi.md#getvehiclesafetyscore) | **Get** /fleet/vehicles/{vehicleId}/safety/score | /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
*SensorsApi* | [**GetSensors**](docs/SensorsApi.md#getsensors) | **Post** /sensors/list | /sensors/list
*SensorsApi* | [**GetSensorsCargo**](docs/SensorsApi.md#getsensorscargo) | **Post** /sensors/cargo | /sensors/cargo
*SensorsApi* | [**GetSensorsDoor**](docs/SensorsApi.md#getsensorsdoor) | **Post** /sensors/door | /sensors/door
*SensorsApi* | [**GetSensorsHistory**](docs/SensorsApi.md#getsensorshistory) | **Post** /sensors/history | /sensors/history
*SensorsApi* | [**GetSensorsHumidity**](docs/SensorsApi.md#getsensorshumidity) | **Post** /sensors/humidity | /sensors/humidity
*SensorsApi* | [**GetSensorsTemperature**](docs/SensorsApi.md#getsensorstemperature) | **Post** /sensors/temperature | /sensors/temperature
*TagsApi* | [**CreateTag**](docs/TagsApi.md#createtag) | **Post** /tags | /tags
*TagsApi* | [**DeleteTagById**](docs/TagsApi.md#deletetagbyid) | **Delete** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
*TagsApi* | [**GetAllTags**](docs/TagsApi.md#getalltags) | **Get** /tags | /tags
*TagsApi* | [**GetTagById**](docs/TagsApi.md#gettagbyid) | **Get** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
*TagsApi* | [**ModifyTagById**](docs/TagsApi.md#modifytagbyid) | **Patch** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
*TagsApi* | [**UpdateTagById**](docs/TagsApi.md#updatetagbyid) | **Put** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
*UsersApi* | [**DeleteUserById**](docs/UsersApi.md#deleteuserbyid) | **Delete** /users/{userId} | /users/{userId:[0-9]+}
*UsersApi* | [**GetUserById**](docs/UsersApi.md#getuserbyid) | **Get** /users/{userId} | /users/{userId:[0-9]+}
*UsersApi* | [**ListUserRoles**](docs/UsersApi.md#listuserroles) | **Get** /user_roles | /user_roles
*UsersApi* | [**ListUsers**](docs/UsersApi.md#listusers) | **Get** /users | /users


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
 Endpoints do not require authorization.


## Author




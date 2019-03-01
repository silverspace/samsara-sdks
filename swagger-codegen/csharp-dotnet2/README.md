# samsara - the C# library for the Samsara API

# Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |- -- -- -- -- -- --|- -- -- -- -- -- -- -- -|- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).

This C# SDK is automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen) project:

- API version: 1.0.0
- SDK version: 1.0.0
- Build package: io.swagger.codegen.languages.CsharpDotNet2ClientCodegen

<a name="frameworks-supported"></a>
## Frameworks supported
- .NET 2.0

<a name="dependencies"></a>
## Dependencies
- Mono compiler
- Newtonsoft.Json.7.0.1
- RestSharp.Net2.1.1.11

Note: NuGet is downloaded by the mono compilation script and packages are installed with it. No dependency DLLs are bundled with this generator

<a name="installation"></a>
## Installation
Run the following command to generate the DLL
- [Mac/Linux] `/bin/sh compile-mono.sh`
- [Windows] TODO

Then include the DLL (under the `bin` folder) in the C# project, and use the namespaces:
```csharp
using samsara.Api;
using IO.Swagger.Client;
using samsara.Model;
```
<a name="getting-started"></a>
## Getting Started

```csharp
using System;
using System.Diagnostics;
using samsara.Api;
using IO.Swagger.Client;
using samsara.Model;

namespace Example
{
    public class Example
    {
        public void main()
        {
            
            var apiInstance = new AssetsApi();
            var accessToken = accessToken_example;  // string | Samsara API access token.
            var groupId = 789;  // long? | Optional group ID if the organization has multiple groups (uncommon). (optional) 

            try
            {
                // /fleet/assets/locations
                InlineResponse2001 result = apiInstance.GetAllAssetCurrentLocations(accessToken, groupId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AssetsApi.GetAllAssetCurrentLocations: " + e.Message );
            }
        }
    }
}
```

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://api.samsara.com/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AssetsApi* | [**GetAllAssetCurrentLocations**](docs/AssetsApi.md#getallassetcurrentlocations) | **GET** /fleet/assets/locations | /fleet/assets/locations
*AssetsApi* | [**GetAllAssets**](docs/AssetsApi.md#getallassets) | **GET** /fleet/assets | /fleet/assets
*AssetsApi* | [**GetAssetLocation**](docs/AssetsApi.md#getassetlocation) | **GET** /fleet/assets/{asset_id}/locations | /fleet/assets/{assetId:[0-9]+}/locations
*AssetsApi* | [**GetAssetReefer**](docs/AssetsApi.md#getassetreefer) | **GET** /fleet/assets/{asset_id}/reefer | /fleet/assets/{assetId:[0-9]+}/reefer
*DriversApi* | [**CreateDriver**](docs/DriversApi.md#createdriver) | **POST** /fleet/drivers/create | /fleet/drivers/create
*DriversApi* | [**DeactivateDriver**](docs/DriversApi.md#deactivatedriver) | **DELETE** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*DriversApi* | [**GetAllDeactivatedDrivers**](docs/DriversApi.md#getalldeactivateddrivers) | **GET** /fleet/drivers/inactive | /fleet/drivers/inactive
*DriversApi* | [**GetDeactivatedDriverById**](docs/DriversApi.md#getdeactivateddriverbyid) | **GET** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*DriversApi* | [**GetDriverById**](docs/DriversApi.md#getdriverbyid) | **GET** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*DriversApi* | [**ReactivateDriverById**](docs/DriversApi.md#reactivatedriverbyid) | **PUT** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*FleetApi* | [**AddFleetAddress**](docs/FleetApi.md#addfleetaddress) | **POST** /fleet/add_address | /fleet/add_address
*FleetApi* | [**AddOrganizationAddresses**](docs/FleetApi.md#addorganizationaddresses) | **POST** /addresses | /addresses
*FleetApi* | [**CreateDispatchRoute**](docs/FleetApi.md#createdispatchroute) | **POST** /fleet/dispatch/routes | /fleet/dispatch/routes
*FleetApi* | [**CreateDriver**](docs/FleetApi.md#createdriver) | **POST** /fleet/drivers/create | /fleet/drivers/create
*FleetApi* | [**CreateDriverDispatchRoute**](docs/FleetApi.md#createdriverdispatchroute) | **POST** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
*FleetApi* | [**CreateDriverDocument**](docs/FleetApi.md#createdriverdocument) | **POST** /fleet/drivers/{driver_id}/documents | /fleet/drivers/{driver_id:[0-9]+}/documents
*FleetApi* | [**CreateDvir**](docs/FleetApi.md#createdvir) | **POST** /fleet/maintenance/dvirs | /fleet/maintenance/dvirs
*FleetApi* | [**CreateVehicleDispatchRoute**](docs/FleetApi.md#createvehicledispatchroute) | **POST** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
*FleetApi* | [**DeactivateDriver**](docs/FleetApi.md#deactivatedriver) | **DELETE** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*FleetApi* | [**DeleteDispatchRouteById**](docs/FleetApi.md#deletedispatchroutebyid) | **DELETE** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
*FleetApi* | [**DeleteOrganizationAddress**](docs/FleetApi.md#deleteorganizationaddress) | **DELETE** /addresses/{addressId} | /addresses/{addressId}
*FleetApi* | [**FetchAllDispatchRoutes**](docs/FleetApi.md#fetchalldispatchroutes) | **GET** /fleet/dispatch/routes | /fleet/dispatch/routes
*FleetApi* | [**FetchAllRouteJobUpdates**](docs/FleetApi.md#fetchallroutejobupdates) | **GET** /fleet/dispatch/routes/job_updates | /fleet/dispatch/routes/job_updates
*FleetApi* | [**GetAllAssetCurrentLocations**](docs/FleetApi.md#getallassetcurrentlocations) | **GET** /fleet/assets/locations | /fleet/assets/locations
*FleetApi* | [**GetAllAssets**](docs/FleetApi.md#getallassets) | **GET** /fleet/assets | /fleet/assets
*FleetApi* | [**GetAllDeactivatedDrivers**](docs/FleetApi.md#getalldeactivateddrivers) | **GET** /fleet/drivers/inactive | /fleet/drivers/inactive
*FleetApi* | [**GetAssetLocation**](docs/FleetApi.md#getassetlocation) | **GET** /fleet/assets/{asset_id}/locations | /fleet/assets/{assetId:[0-9]+}/locations
*FleetApi* | [**GetAssetReefer**](docs/FleetApi.md#getassetreefer) | **GET** /fleet/assets/{asset_id}/reefer | /fleet/assets/{assetId:[0-9]+}/reefer
*FleetApi* | [**GetDeactivatedDriverById**](docs/FleetApi.md#getdeactivateddriverbyid) | **GET** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*FleetApi* | [**GetDispatchRouteById**](docs/FleetApi.md#getdispatchroutebyid) | **GET** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}
*FleetApi* | [**GetDispatchRouteHistory**](docs/FleetApi.md#getdispatchroutehistory) | **GET** /fleet/dispatch/routes/{route_id}/history | /fleet/dispatch/routes/{route_id:[0-9]+}/history
*FleetApi* | [**GetDispatchRoutesByDriverId**](docs/FleetApi.md#getdispatchroutesbydriverid) | **GET** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
*FleetApi* | [**GetDispatchRoutesByVehicleId**](docs/FleetApi.md#getdispatchroutesbyvehicleid) | **GET** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
*FleetApi* | [**GetDriverById**](docs/FleetApi.md#getdriverbyid) | **GET** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*FleetApi* | [**GetDriverDocumentTypesByOrgId**](docs/FleetApi.md#getdriverdocumenttypesbyorgid) | **GET** /fleet/drivers/document_types | /fleet/drivers/document_types
*FleetApi* | [**GetDriverDocumentsByOrgId**](docs/FleetApi.md#getdriverdocumentsbyorgid) | **GET** /fleet/drivers/documents | /fleet/drivers/documents
*FleetApi* | [**GetDriverSafetyScore**](docs/FleetApi.md#getdriversafetyscore) | **GET** /fleet/drivers/{driverId}/safety/score | /fleet/drivers/{driverId:[0-9]+}/safety/score
*FleetApi* | [**GetDvirs**](docs/FleetApi.md#getdvirs) | **GET** /fleet/maintenance/dvirs | /fleet/maintenance/dvirs
*FleetApi* | [**GetFleetDrivers**](docs/FleetApi.md#getfleetdrivers) | **POST** /fleet/drivers | /fleet/drivers
*FleetApi* | [**GetFleetDriversHosDailyLogs**](docs/FleetApi.md#getfleetdrivershosdailylogs) | **POST** /fleet/drivers/{driver_id}/hos_daily_logs | /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
*FleetApi* | [**GetFleetDriversSummary**](docs/FleetApi.md#getfleetdriverssummary) | **POST** /fleet/drivers/summary | /fleet/drivers/summary
*FleetApi* | [**GetFleetHosAuthenticationLogs**](docs/FleetApi.md#getfleethosauthenticationlogs) | **POST** /fleet/hos_authentication_logs | /fleet/hos_authentication_logs
*FleetApi* | [**GetFleetHosLogs**](docs/FleetApi.md#getfleethoslogs) | **POST** /fleet/hos_logs | /fleet/hos_logs
*FleetApi* | [**GetFleetHosLogsSummary**](docs/FleetApi.md#getfleethoslogssummary) | **POST** /fleet/hos_logs_summary | /fleet/hos_logs_summary
*FleetApi* | [**GetFleetLocations**](docs/FleetApi.md#getfleetlocations) | **POST** /fleet/locations | /fleet/locations
*FleetApi* | [**GetFleetMaintenanceList**](docs/FleetApi.md#getfleetmaintenancelist) | **POST** /fleet/maintenance/list | /fleet/maintenance/list
*FleetApi* | [**GetFleetTrips**](docs/FleetApi.md#getfleettrips) | **POST** /fleet/trips | /fleet/trips
*FleetApi* | [**GetFleetVehicle**](docs/FleetApi.md#getfleetvehicle) | **GET** /fleet/vehicles/{vehicle_id_or_external_id} | /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*FleetApi* | [**GetOrganizationAddress**](docs/FleetApi.md#getorganizationaddress) | **GET** /addresses/{addressId} | /addresses/{addressId}
*FleetApi* | [**GetOrganizationAddresses**](docs/FleetApi.md#getorganizationaddresses) | **GET** /addresses | /addresses
*FleetApi* | [**GetOrganizationContact**](docs/FleetApi.md#getorganizationcontact) | **GET** /contacts/{contact_id} | /contacts/{contact_id}
*FleetApi* | [**GetVehicleHarshEvent**](docs/FleetApi.md#getvehicleharshevent) | **GET** /fleet/vehicles/{vehicleId}/safety/harsh_event | /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
*FleetApi* | [**GetVehicleLocations**](docs/FleetApi.md#getvehiclelocations) | **GET** /fleet/vehicles/{vehicle_id}/locations | /fleet/vehicles/{vehicle_id:[0-9]+}/locations
*FleetApi* | [**GetVehicleSafetyScore**](docs/FleetApi.md#getvehiclesafetyscore) | **GET** /fleet/vehicles/{vehicleId}/safety/score | /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
*FleetApi* | [**GetVehicleStats**](docs/FleetApi.md#getvehiclestats) | **GET** /fleet/vehicles/stats | /fleet/vehicles/stats
*FleetApi* | [**GetVehiclesLocations**](docs/FleetApi.md#getvehicleslocations) | **GET** /fleet/vehicles/locations | /fleet/vehicles/locations
*FleetApi* | [**ListContacts**](docs/FleetApi.md#listcontacts) | **GET** /contacts | /contacts
*FleetApi* | [**ListFleet**](docs/FleetApi.md#listfleet) | **POST** /fleet/list | /fleet/list
*FleetApi* | [**PatchFleetVehicle**](docs/FleetApi.md#patchfleetvehicle) | **PATCH** /fleet/vehicles/{vehicle_id_or_external_id} | /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*FleetApi* | [**ReactivateDriverById**](docs/FleetApi.md#reactivatedriverbyid) | **PUT** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*FleetApi* | [**UpdateDispatchRouteById**](docs/FleetApi.md#updatedispatchroutebyid) | **PUT** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
*FleetApi* | [**UpdateOrganizationAddress**](docs/FleetApi.md#updateorganizationaddress) | **PATCH** /addresses/{addressId} | /addresses/{addressId}
*FleetApi* | [**UpdateVehicles**](docs/FleetApi.md#updatevehicles) | **POST** /fleet/set_data | /fleet/set_data
*IndustrialApi* | [**GetAllDataInputs**](docs/IndustrialApi.md#getalldatainputs) | **GET** /industrial/data | /industrial/data
*IndustrialApi* | [**GetDataInput**](docs/IndustrialApi.md#getdatainput) | **GET** /industrial/data/{data_input_id} | /industrial/data/{data_input_id:[0-9]+}
*IndustrialApi* | [**GetMachines**](docs/IndustrialApi.md#getmachines) | **POST** /machines/list | /machines/list
*IndustrialApi* | [**GetMachinesHistory**](docs/IndustrialApi.md#getmachineshistory) | **POST** /machines/history | /machines/history
*RoutesApi* | [**CreateDispatchRoute**](docs/RoutesApi.md#createdispatchroute) | **POST** /fleet/dispatch/routes | /fleet/dispatch/routes
*RoutesApi* | [**CreateDriverDispatchRoute**](docs/RoutesApi.md#createdriverdispatchroute) | **POST** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
*RoutesApi* | [**CreateVehicleDispatchRoute**](docs/RoutesApi.md#createvehicledispatchroute) | **POST** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
*RoutesApi* | [**DeleteDispatchRouteById**](docs/RoutesApi.md#deletedispatchroutebyid) | **DELETE** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
*RoutesApi* | [**FetchAllDispatchRoutes**](docs/RoutesApi.md#fetchalldispatchroutes) | **GET** /fleet/dispatch/routes | /fleet/dispatch/routes
*RoutesApi* | [**FetchAllRouteJobUpdates**](docs/RoutesApi.md#fetchallroutejobupdates) | **GET** /fleet/dispatch/routes/job_updates | /fleet/dispatch/routes/job_updates
*RoutesApi* | [**GetDispatchRouteById**](docs/RoutesApi.md#getdispatchroutebyid) | **GET** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}
*RoutesApi* | [**GetDispatchRouteHistory**](docs/RoutesApi.md#getdispatchroutehistory) | **GET** /fleet/dispatch/routes/{route_id}/history | /fleet/dispatch/routes/{route_id:[0-9]+}/history
*RoutesApi* | [**GetDispatchRoutesByDriverId**](docs/RoutesApi.md#getdispatchroutesbydriverid) | **GET** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
*RoutesApi* | [**GetDispatchRoutesByVehicleId**](docs/RoutesApi.md#getdispatchroutesbyvehicleid) | **GET** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
*RoutesApi* | [**UpdateDispatchRouteById**](docs/RoutesApi.md#updatedispatchroutebyid) | **PUT** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
*SafetyApi* | [**GetDriverSafetyScore**](docs/SafetyApi.md#getdriversafetyscore) | **GET** /fleet/drivers/{driverId}/safety/score | /fleet/drivers/{driverId:[0-9]+}/safety/score
*SafetyApi* | [**GetVehicleHarshEvent**](docs/SafetyApi.md#getvehicleharshevent) | **GET** /fleet/vehicles/{vehicleId}/safety/harsh_event | /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
*SafetyApi* | [**GetVehicleSafetyScore**](docs/SafetyApi.md#getvehiclesafetyscore) | **GET** /fleet/vehicles/{vehicleId}/safety/score | /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
*SensorsApi* | [**GetSensors**](docs/SensorsApi.md#getsensors) | **POST** /sensors/list | /sensors/list
*SensorsApi* | [**GetSensorsCargo**](docs/SensorsApi.md#getsensorscargo) | **POST** /sensors/cargo | /sensors/cargo
*SensorsApi* | [**GetSensorsDoor**](docs/SensorsApi.md#getsensorsdoor) | **POST** /sensors/door | /sensors/door
*SensorsApi* | [**GetSensorsHistory**](docs/SensorsApi.md#getsensorshistory) | **POST** /sensors/history | /sensors/history
*SensorsApi* | [**GetSensorsHumidity**](docs/SensorsApi.md#getsensorshumidity) | **POST** /sensors/humidity | /sensors/humidity
*SensorsApi* | [**GetSensorsTemperature**](docs/SensorsApi.md#getsensorstemperature) | **POST** /sensors/temperature | /sensors/temperature
*TagsApi* | [**CreateTag**](docs/TagsApi.md#createtag) | **POST** /tags | /tags
*TagsApi* | [**DeleteTagById**](docs/TagsApi.md#deletetagbyid) | **DELETE** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
*TagsApi* | [**GetAllTags**](docs/TagsApi.md#getalltags) | **GET** /tags | /tags
*TagsApi* | [**GetTagById**](docs/TagsApi.md#gettagbyid) | **GET** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
*TagsApi* | [**ModifyTagById**](docs/TagsApi.md#modifytagbyid) | **PATCH** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
*TagsApi* | [**UpdateTagById**](docs/TagsApi.md#updatetagbyid) | **PUT** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
*UsersApi* | [**DeleteUserById**](docs/UsersApi.md#deleteuserbyid) | **DELETE** /users/{userId} | /users/{userId:[0-9]+}
*UsersApi* | [**GetUserById**](docs/UsersApi.md#getuserbyid) | **GET** /users/{userId} | /users/{userId:[0-9]+}
*UsersApi* | [**ListUserRoles**](docs/UsersApi.md#listuserroles) | **GET** /user_roles | /user_roles
*UsersApi* | [**ListUsers**](docs/UsersApi.md#listusers) | **GET** /users | /users


<a name="documentation-for-models"></a>
## Documentation for Models

 - [samsara.Model.Address](docs/Address.md)
 - [samsara.Model.AddressGeofence](docs/AddressGeofence.md)
 - [samsara.Model.AddressGeofenceCircle](docs/AddressGeofenceCircle.md)
 - [samsara.Model.AddressGeofencePolygon](docs/AddressGeofencePolygon.md)
 - [samsara.Model.AddressGeofencePolygonVertices](docs/AddressGeofencePolygonVertices.md)
 - [samsara.Model.AddressNotes](docs/AddressNotes.md)
 - [samsara.Model.AddressParam](docs/AddressParam.md)
 - [samsara.Model.Addresses](docs/Addresses.md)
 - [samsara.Model.AddressesAddresses](docs/AddressesAddresses.md)
 - [samsara.Model.AllRouteJobUpdates](docs/AllRouteJobUpdates.md)
 - [samsara.Model.Asset](docs/Asset.md)
 - [samsara.Model.AssetCable](docs/AssetCable.md)
 - [samsara.Model.AssetCurrentLocation](docs/AssetCurrentLocation.md)
 - [samsara.Model.AssetCurrentLocationsResponse](docs/AssetCurrentLocationsResponse.md)
 - [samsara.Model.AssetLocationResponse](docs/AssetLocationResponse.md)
 - [samsara.Model.AssetLocationResponseInner](docs/AssetLocationResponseInner.md)
 - [samsara.Model.AssetReeferResponse](docs/AssetReeferResponse.md)
 - [samsara.Model.AssetReeferResponseReeferStats](docs/AssetReeferResponseReeferStats.md)
 - [samsara.Model.AssetReeferResponseReeferStatsAlarms](docs/AssetReeferResponseReeferStatsAlarms.md)
 - [samsara.Model.AssetReeferResponseReeferStatsAlarms1](docs/AssetReeferResponseReeferStatsAlarms1.md)
 - [samsara.Model.AssetReeferResponseReeferStatsEngineHours](docs/AssetReeferResponseReeferStatsEngineHours.md)
 - [samsara.Model.AssetReeferResponseReeferStatsFuelPercentage](docs/AssetReeferResponseReeferStatsFuelPercentage.md)
 - [samsara.Model.AssetReeferResponseReeferStatsPowerStatus](docs/AssetReeferResponseReeferStatsPowerStatus.md)
 - [samsara.Model.AssetReeferResponseReeferStatsReturnAirTemp](docs/AssetReeferResponseReeferStatsReturnAirTemp.md)
 - [samsara.Model.AssetReeferResponseReeferStatsSetPoint](docs/AssetReeferResponseReeferStatsSetPoint.md)
 - [samsara.Model.AuxInput](docs/AuxInput.md)
 - [samsara.Model.AuxInputSeries](docs/AuxInputSeries.md)
 - [samsara.Model.CargoResponse](docs/CargoResponse.md)
 - [samsara.Model.CargoResponseSensors](docs/CargoResponseSensors.md)
 - [samsara.Model.Contact](docs/Contact.md)
 - [samsara.Model.ContactIds](docs/ContactIds.md)
 - [samsara.Model.CreateDvirParam](docs/CreateDvirParam.md)
 - [samsara.Model.CurrentDriver](docs/CurrentDriver.md)
 - [samsara.Model.Data](docs/Data.md)
 - [samsara.Model.DataInputHistoryResponse](docs/DataInputHistoryResponse.md)
 - [samsara.Model.DataInputHistoryResponsePoints](docs/DataInputHistoryResponsePoints.md)
 - [samsara.Model.DispatchJobCreate](docs/DispatchJobCreate.md)
 - [samsara.Model.DispatchRouteBase](docs/DispatchRouteBase.md)
 - [samsara.Model.DispatchRouteHistoricalEntry](docs/DispatchRouteHistoricalEntry.md)
 - [samsara.Model.DispatchRouteHistory](docs/DispatchRouteHistory.md)
 - [samsara.Model.DispatchRoutes](docs/DispatchRoutes.md)
 - [samsara.Model.DocumentBase](docs/DocumentBase.md)
 - [samsara.Model.DocumentFieldCreate](docs/DocumentFieldCreate.md)
 - [samsara.Model.DocumentFieldCreatePhotoValue](docs/DocumentFieldCreatePhotoValue.md)
 - [samsara.Model.DocumentFieldType](docs/DocumentFieldType.md)
 - [samsara.Model.DocumentFieldTypeNumberValueTypeMetadata](docs/DocumentFieldTypeNumberValueTypeMetadata.md)
 - [samsara.Model.DocumentFieldTypes](docs/DocumentFieldTypes.md)
 - [samsara.Model.DocumentType](docs/DocumentType.md)
 - [samsara.Model.DocumentTypes](docs/DocumentTypes.md)
 - [samsara.Model.Documents](docs/Documents.md)
 - [samsara.Model.DoorResponse](docs/DoorResponse.md)
 - [samsara.Model.DoorResponseSensors](docs/DoorResponseSensors.md)
 - [samsara.Model.DriverBase](docs/DriverBase.md)
 - [samsara.Model.DriverDailyLogResponse](docs/DriverDailyLogResponse.md)
 - [samsara.Model.DriverDailyLogResponseDays](docs/DriverDailyLogResponseDays.md)
 - [samsara.Model.DriverSafetyScoreResponse](docs/DriverSafetyScoreResponse.md)
 - [samsara.Model.DriversResponse](docs/DriversResponse.md)
 - [samsara.Model.DriversSummaryParam](docs/DriversSummaryParam.md)
 - [samsara.Model.DriversSummaryResponse](docs/DriversSummaryResponse.md)
 - [samsara.Model.DriversSummaryResponseSummaries](docs/DriversSummaryResponseSummaries.md)
 - [samsara.Model.DvirBase](docs/DvirBase.md)
 - [samsara.Model.DvirBaseAuthorSignature](docs/DvirBaseAuthorSignature.md)
 - [samsara.Model.DvirBaseMechanicOrAgentSignature](docs/DvirBaseMechanicOrAgentSignature.md)
 - [samsara.Model.DvirBaseNextDriverSignature](docs/DvirBaseNextDriverSignature.md)
 - [samsara.Model.DvirBaseTrailerDefects](docs/DvirBaseTrailerDefects.md)
 - [samsara.Model.DvirBaseVehicle](docs/DvirBaseVehicle.md)
 - [samsara.Model.DvirListResponse](docs/DvirListResponse.md)
 - [samsara.Model.EngineState](docs/EngineState.md)
 - [samsara.Model.ErrorResponse](docs/ErrorResponse.md)
 - [samsara.Model.FleetVehicleLocation](docs/FleetVehicleLocation.md)
 - [samsara.Model.FleetVehicleLocations](docs/FleetVehicleLocations.md)
 - [samsara.Model.FleetVehicleResponse](docs/FleetVehicleResponse.md)
 - [samsara.Model.FleetVehicleResponseVehicleInfo](docs/FleetVehicleResponseVehicleInfo.md)
 - [samsara.Model.FleetVehiclesLocations](docs/FleetVehiclesLocations.md)
 - [samsara.Model.FleetVehiclesLocationsInner](docs/FleetVehiclesLocationsInner.md)
 - [samsara.Model.GroupDriversParam](docs/GroupDriversParam.md)
 - [samsara.Model.GroupParam](docs/GroupParam.md)
 - [samsara.Model.HistoryParam](docs/HistoryParam.md)
 - [samsara.Model.HistoryParam1](docs/HistoryParam1.md)
 - [samsara.Model.HosAuthenticationLogsParam](docs/HosAuthenticationLogsParam.md)
 - [samsara.Model.HosAuthenticationLogsResponse](docs/HosAuthenticationLogsResponse.md)
 - [samsara.Model.HosAuthenticationLogsResponseAuthenticationLogs](docs/HosAuthenticationLogsResponseAuthenticationLogs.md)
 - [samsara.Model.HosLogsParam](docs/HosLogsParam.md)
 - [samsara.Model.HosLogsParam1](docs/HosLogsParam1.md)
 - [samsara.Model.HosLogsParam2](docs/HosLogsParam2.md)
 - [samsara.Model.HosLogsResponse](docs/HosLogsResponse.md)
 - [samsara.Model.HosLogsResponseLogs](docs/HosLogsResponseLogs.md)
 - [samsara.Model.HosLogsSummaryResponse](docs/HosLogsSummaryResponse.md)
 - [samsara.Model.HosLogsSummaryResponseDrivers](docs/HosLogsSummaryResponseDrivers.md)
 - [samsara.Model.HumidityResponse](docs/HumidityResponse.md)
 - [samsara.Model.HumidityResponseSensors](docs/HumidityResponseSensors.md)
 - [samsara.Model.InlineResponse200](docs/InlineResponse200.md)
 - [samsara.Model.InlineResponse2001](docs/InlineResponse2001.md)
 - [samsara.Model.InlineResponse2002](docs/InlineResponse2002.md)
 - [samsara.Model.InlineResponse2003](docs/InlineResponse2003.md)
 - [samsara.Model.InlineResponse2004](docs/InlineResponse2004.md)
 - [samsara.Model.InlineResponse2005](docs/InlineResponse2005.md)
 - [samsara.Model.InlineResponse2005VehicleStats](docs/InlineResponse2005VehicleStats.md)
 - [samsara.Model.InlineResponse2006](docs/InlineResponse2006.md)
 - [samsara.Model.InlineResponse2007](docs/InlineResponse2007.md)
 - [samsara.Model.InlineResponse2008](docs/InlineResponse2008.md)
 - [samsara.Model.InlineResponse2009](docs/InlineResponse2009.md)
 - [samsara.Model.JobStatus](docs/JobStatus.md)
 - [samsara.Model.JobUpdateObject](docs/JobUpdateObject.md)
 - [samsara.Model.Machine](docs/Machine.md)
 - [samsara.Model.MachineHistoryResponse](docs/MachineHistoryResponse.md)
 - [samsara.Model.MachineHistoryResponseMachines](docs/MachineHistoryResponseMachines.md)
 - [samsara.Model.MachineHistoryResponseVibrations](docs/MachineHistoryResponseVibrations.md)
 - [samsara.Model.Pagination](docs/Pagination.md)
 - [samsara.Model.PrevJobStatus](docs/PrevJobStatus.md)
 - [samsara.Model.ReactivateDriverParam](docs/ReactivateDriverParam.md)
 - [samsara.Model.SafetyReportHarshEvent](docs/SafetyReportHarshEvent.md)
 - [samsara.Model.Sensor](docs/Sensor.md)
 - [samsara.Model.SensorHistoryResponse](docs/SensorHistoryResponse.md)
 - [samsara.Model.SensorHistoryResponseResults](docs/SensorHistoryResponseResults.md)
 - [samsara.Model.SensorParam](docs/SensorParam.md)
 - [samsara.Model.SensorshistorySeries](docs/SensorshistorySeries.md)
 - [samsara.Model.Tag](docs/Tag.md)
 - [samsara.Model.TagCreate](docs/TagCreate.md)
 - [samsara.Model.TagIds](docs/TagIds.md)
 - [samsara.Model.TagMetadata](docs/TagMetadata.md)
 - [samsara.Model.TagModify](docs/TagModify.md)
 - [samsara.Model.TagModifyAdd](docs/TagModifyAdd.md)
 - [samsara.Model.TagModifyDelete](docs/TagModifyDelete.md)
 - [samsara.Model.TagUpdate](docs/TagUpdate.md)
 - [samsara.Model.TaggedAddressBase](docs/TaggedAddressBase.md)
 - [samsara.Model.TaggedAssetBase](docs/TaggedAssetBase.md)
 - [samsara.Model.TaggedDriverBase](docs/TaggedDriverBase.md)
 - [samsara.Model.TaggedMachineBase](docs/TaggedMachineBase.md)
 - [samsara.Model.TaggedSensorBase](docs/TaggedSensorBase.md)
 - [samsara.Model.TaggedVehicleBase](docs/TaggedVehicleBase.md)
 - [samsara.Model.TemperatureResponse](docs/TemperatureResponse.md)
 - [samsara.Model.TemperatureResponseSensors](docs/TemperatureResponseSensors.md)
 - [samsara.Model.TripResponse](docs/TripResponse.md)
 - [samsara.Model.TripResponseEndCoordinates](docs/TripResponseEndCoordinates.md)
 - [samsara.Model.TripResponseStartCoordinates](docs/TripResponseStartCoordinates.md)
 - [samsara.Model.TripResponseTrips](docs/TripResponseTrips.md)
 - [samsara.Model.TripsParam](docs/TripsParam.md)
 - [samsara.Model.UserBase](docs/UserBase.md)
 - [samsara.Model.UserRole](docs/UserRole.md)
 - [samsara.Model.UserTagRole](docs/UserTagRole.md)
 - [samsara.Model.UserTagRoleTag](docs/UserTagRoleTag.md)
 - [samsara.Model.Vehicle](docs/Vehicle.md)
 - [samsara.Model.VehicleHarshEventResponse](docs/VehicleHarshEventResponse.md)
 - [samsara.Model.VehicleHarshEventResponseLocation](docs/VehicleHarshEventResponseLocation.md)
 - [samsara.Model.VehicleLocation](docs/VehicleLocation.md)
 - [samsara.Model.VehicleMaintenance](docs/VehicleMaintenance.md)
 - [samsara.Model.VehicleMaintenanceJ1939](docs/VehicleMaintenanceJ1939.md)
 - [samsara.Model.VehicleMaintenanceJ1939CheckEngineLight](docs/VehicleMaintenanceJ1939CheckEngineLight.md)
 - [samsara.Model.VehicleMaintenanceJ1939DiagnosticTroubleCodes](docs/VehicleMaintenanceJ1939DiagnosticTroubleCodes.md)
 - [samsara.Model.VehicleMaintenancePassenger](docs/VehicleMaintenancePassenger.md)
 - [samsara.Model.VehicleMaintenancePassengerCheckEngineLight](docs/VehicleMaintenancePassengerCheckEngineLight.md)
 - [samsara.Model.VehicleMaintenancePassengerDiagnosticTroubleCodes](docs/VehicleMaintenancePassengerDiagnosticTroubleCodes.md)
 - [samsara.Model.VehicleSafetyScoreResponse](docs/VehicleSafetyScoreResponse.md)
 - [samsara.Model.VehicleUpdateParam](docs/VehicleUpdateParam.md)
 - [samsara.Model.DispatchJob](docs/DispatchJob.md)
 - [samsara.Model.DispatchRoute](docs/DispatchRoute.md)
 - [samsara.Model.DispatchRouteCreate](docs/DispatchRouteCreate.md)
 - [samsara.Model.Document](docs/Document.md)
 - [samsara.Model.DocumentCreate](docs/DocumentCreate.md)
 - [samsara.Model.DocumentField](docs/DocumentField.md)
 - [samsara.Model.Driver](docs/Driver.md)
 - [samsara.Model.DriverForCreate](docs/DriverForCreate.md)
 - [samsara.Model.TaggedAddress](docs/TaggedAddress.md)
 - [samsara.Model.TaggedAsset](docs/TaggedAsset.md)
 - [samsara.Model.TaggedDriver](docs/TaggedDriver.md)
 - [samsara.Model.TaggedMachine](docs/TaggedMachine.md)
 - [samsara.Model.TaggedSensor](docs/TaggedSensor.md)
 - [samsara.Model.TaggedVehicle](docs/TaggedVehicle.md)
 - [samsara.Model.User](docs/User.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

All endpoints do not require authorization.

# # Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built_in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off_the_shelf HTTP clients. We allow you to interact securely with our API from a client_side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go_to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings_>Organization_>API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client_side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error_Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |_____________|________________|___________________________________________________________________| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en_us/sections/360000538054_APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com). - Swagger Ada Server

## Overview

This Ada server was generated by the [OpenAPI Generator](https://openapi-generator.tech) project.
By using the [OpenAPI-Spec](https://github.com/OAI/OpenAPI-Specification) from a remote server,
you can easily generate a server stub.

## Building

To build the server you will need the GNAT Ada compiler as well as
the [Swagger Ada library](https://github.com/stcarrez/swagger-ada).

When the GNAT Ada compiler and Swagger Ada libraries are installed,
run the following command:

```
  gprbuild -p -PdefaultPackage
```

After the build is successful, you will get the server binary
in bin/-server and you can start it as follows:
```
  ./bin/-server
```

## Structure of the server

The server consists of several Ada packages that are generated from
the OpenAPI specification.

Source file | Package | Description
------------ | ------------- | -------------
src/.ads||The server root package declaration
src/-servers.ads|.Servers|The server declaration and instantiation
src/-servers.adb|.Servers|The server implementation (empty stubs)
src/server/-skeletons.ads|.Skeletons|The server skeleton declaration
src/server/-skeletons.adb|.Skeletons|The server skeleton implementation
src/server/-models.ads|.Skeletons|The server model types declaration
src/server/-models.adb|.Skeletons|The server model types implementation
src/-server.adb|.Server|The server main procedure

Files generated in **src/server** should not be modified.  The server implementation
files (**src/-server.ads** and **src/-server.adb**) should
be modified to implement the server operations.  You can also customize the server
main procedure according to your needs.

## Server model

The server instance is represented by the **.Servers.Server_Type** Ada type.
The REST API will need an instance of it to make the operation call.  Two server model
exists:

* The instance per request model creates an instance of the server type for each request.
* The shared instance model shares the same instance across all concurrent REST requests.  This instance is protected using an Ada protected object which holds the server instance.

The choice of the server model is made at the compilation time by instantiating either
the **.Skeletons.Skeleton** package or the **.Skeletons.Shared_Instance**
package.  Such instantiation is done in **src/-server.ads** and the default
is to use the **Shared_Instance**.

## Implementing a server operation

All you have to do is implement the server operation in the **src/-servers.adb** file.
The package already contains the operation with its parameters and you only have to replace
the **null** instruction by real code.

# Documentation

## API Documentation

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Get_All_Asset_Current_Locations**](AssetsApi.md#Get_All_Asset_Current_Locations) | **GET** /fleet/assets/locations | /fleet/assets/locations
[**Get_All_Assets**](AssetsApi.md#Get_All_Assets) | **GET** /fleet/assets | /fleet/assets
[**Get_Asset_Location**](AssetsApi.md#Get_Asset_Location) | **GET** /fleet/assets/{asset_id}/locations | /fleet/assets/{assetId:[0_9]+}/locations
[**Get_Asset_Reefer**](AssetsApi.md#Get_Asset_Reefer) | **GET** /fleet/assets/{asset_id}/reefer | /fleet/assets/{assetId:[0_9]+}/reefer
[**Create_Driver**](DriversApi.md#Create_Driver) | **POST** /fleet/drivers/create | /fleet/drivers/create
[**Deactivate_Driver**](DriversApi.md#Deactivate_Driver) | **DELETE** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0_9]+ | external_id:[a_zA_Z0_9]+}
[**Get_All_Deactivated_Drivers**](DriversApi.md#Get_All_Deactivated_Drivers) | **GET** /fleet/drivers/inactive | /fleet/drivers/inactive
[**Get_Deactivated_Driver_By_Id**](DriversApi.md#Get_Deactivated_Driver_By_Id) | **GET** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0_9]+ | external_id:[a_zA_Z0_9]+}
[**Get_Driver_By_Id**](DriversApi.md#Get_Driver_By_Id) | **GET** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0_9]+ | external_id:[a_zA_Z0_9]+}
[**Reactivate_Driver_By_Id**](DriversApi.md#Reactivate_Driver_By_Id) | **PUT** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0_9]+ | external_id:[a_zA_Z0_9]+}
[**Add_Fleet_Address**](FleetApi.md#Add_Fleet_Address) | **POST** /fleet/add_address | /fleet/add_address
[**Add_Organization_Addresses**](FleetApi.md#Add_Organization_Addresses) | **POST** /addresses | /addresses
[**Create_Dispatch_Route**](FleetApi.md#Create_Dispatch_Route) | **POST** /fleet/dispatch/routes | /fleet/dispatch/routes
[**Create_Driver**](FleetApi.md#Create_Driver) | **POST** /fleet/drivers/create | /fleet/drivers/create
[**Create_Driver_Dispatch_Route**](FleetApi.md#Create_Driver_Dispatch_Route) | **POST** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0_9]+}/dispatch/routes
[**Create_Driver_Document**](FleetApi.md#Create_Driver_Document) | **POST** /fleet/drivers/{driver_id}/documents | /fleet/drivers/{driver_id:[0_9]+}/documents
[**Create_Dvir**](FleetApi.md#Create_Dvir) | **POST** /fleet/maintenance/dvirs | /fleet/maintenance/dvirs
[**Create_Vehicle_Dispatch_Route**](FleetApi.md#Create_Vehicle_Dispatch_Route) | **POST** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0_9]+}/dispatch/routes
[**Deactivate_Driver**](FleetApi.md#Deactivate_Driver) | **DELETE** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0_9]+ | external_id:[a_zA_Z0_9]+}
[**Delete_Dispatch_Route_By_Id**](FleetApi.md#Delete_Dispatch_Route_By_Id) | **DELETE** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0_9]+}/
[**Delete_Organization_Address**](FleetApi.md#Delete_Organization_Address) | **DELETE** /addresses/{addressId} | /addresses/{addressId}
[**Fetch_All_Dispatch_Routes**](FleetApi.md#Fetch_All_Dispatch_Routes) | **GET** /fleet/dispatch/routes | /fleet/dispatch/routes
[**Fetch_All_Route_Job_Updates**](FleetApi.md#Fetch_All_Route_Job_Updates) | **GET** /fleet/dispatch/routes/job_updates | /fleet/dispatch/routes/job_updates
[**Get_All_Asset_Current_Locations**](FleetApi.md#Get_All_Asset_Current_Locations) | **GET** /fleet/assets/locations | /fleet/assets/locations
[**Get_All_Assets**](FleetApi.md#Get_All_Assets) | **GET** /fleet/assets | /fleet/assets
[**Get_All_Deactivated_Drivers**](FleetApi.md#Get_All_Deactivated_Drivers) | **GET** /fleet/drivers/inactive | /fleet/drivers/inactive
[**Get_Asset_Location**](FleetApi.md#Get_Asset_Location) | **GET** /fleet/assets/{asset_id}/locations | /fleet/assets/{assetId:[0_9]+}/locations
[**Get_Asset_Reefer**](FleetApi.md#Get_Asset_Reefer) | **GET** /fleet/assets/{asset_id}/reefer | /fleet/assets/{assetId:[0_9]+}/reefer
[**Get_Deactivated_Driver_By_Id**](FleetApi.md#Get_Deactivated_Driver_By_Id) | **GET** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0_9]+ | external_id:[a_zA_Z0_9]+}
[**Get_Dispatch_Route_By_Id**](FleetApi.md#Get_Dispatch_Route_By_Id) | **GET** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0_9]+}
[**Get_Dispatch_Route_History**](FleetApi.md#Get_Dispatch_Route_History) | **GET** /fleet/dispatch/routes/{route_id}/history | /fleet/dispatch/routes/{route_id:[0_9]+}/history
[**Get_Dispatch_Routes_By_Driver_Id**](FleetApi.md#Get_Dispatch_Routes_By_Driver_Id) | **GET** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0_9]+}/dispatch/routes
[**Get_Dispatch_Routes_By_Vehicle_Id**](FleetApi.md#Get_Dispatch_Routes_By_Vehicle_Id) | **GET** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0_9]+}/dispatch/routes
[**Get_Driver_By_Id**](FleetApi.md#Get_Driver_By_Id) | **GET** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0_9]+ | external_id:[a_zA_Z0_9]+}
[**Get_Driver_Document_Types_By_Org_Id**](FleetApi.md#Get_Driver_Document_Types_By_Org_Id) | **GET** /fleet/drivers/document_types | /fleet/drivers/document_types
[**Get_Driver_Documents_By_Org_Id**](FleetApi.md#Get_Driver_Documents_By_Org_Id) | **GET** /fleet/drivers/documents | /fleet/drivers/documents
[**Get_Driver_Safety_Score**](FleetApi.md#Get_Driver_Safety_Score) | **GET** /fleet/drivers/{driverId}/safety/score | /fleet/drivers/{driverId:[0_9]+}/safety/score
[**Get_Dvirs**](FleetApi.md#Get_Dvirs) | **GET** /fleet/maintenance/dvirs | /fleet/maintenance/dvirs
[**Get_Fleet_Drivers**](FleetApi.md#Get_Fleet_Drivers) | **POST** /fleet/drivers | /fleet/drivers
[**Get_Fleet_Drivers_Hos_Daily_Logs**](FleetApi.md#Get_Fleet_Drivers_Hos_Daily_Logs) | **POST** /fleet/drivers/{driver_id}/hos_daily_logs | /fleet/drivers/{driver_id:[0_9]+}/hos_daily_logs
[**Get_Fleet_Drivers_Summary**](FleetApi.md#Get_Fleet_Drivers_Summary) | **POST** /fleet/drivers/summary | /fleet/drivers/summary
[**Get_Fleet_Hos_Authentication_Logs**](FleetApi.md#Get_Fleet_Hos_Authentication_Logs) | **POST** /fleet/hos_authentication_logs | /fleet/hos_authentication_logs
[**Get_Fleet_Hos_Logs**](FleetApi.md#Get_Fleet_Hos_Logs) | **POST** /fleet/hos_logs | /fleet/hos_logs
[**Get_Fleet_Hos_Logs_Summary**](FleetApi.md#Get_Fleet_Hos_Logs_Summary) | **POST** /fleet/hos_logs_summary | /fleet/hos_logs_summary
[**Get_Fleet_Locations**](FleetApi.md#Get_Fleet_Locations) | **POST** /fleet/locations | /fleet/locations
[**Get_Fleet_Maintenance_List**](FleetApi.md#Get_Fleet_Maintenance_List) | **POST** /fleet/maintenance/list | /fleet/maintenance/list
[**Get_Fleet_Trips**](FleetApi.md#Get_Fleet_Trips) | **POST** /fleet/trips | /fleet/trips
[**Get_Fleet_Vehicle**](FleetApi.md#Get_Fleet_Vehicle) | **GET** /fleet/vehicles/{vehicle_id_or_external_id} | /fleet/vehicles/{vehicle_id:[0_9]+ | external_id:[a_zA_Z0_9]+}
[**Get_Organization_Address**](FleetApi.md#Get_Organization_Address) | **GET** /addresses/{addressId} | /addresses/{addressId}
[**Get_Organization_Addresses**](FleetApi.md#Get_Organization_Addresses) | **GET** /addresses | /addresses
[**Get_Organization_Contact**](FleetApi.md#Get_Organization_Contact) | **GET** /contacts/{contact_id} | /contacts/{contact_id}
[**Get_Vehicle_Harsh_Event**](FleetApi.md#Get_Vehicle_Harsh_Event) | **GET** /fleet/vehicles/{vehicleId}/safety/harsh_event | /fleet/vehicles/{vehicleId:[0_9]+}/safety/harsh_event
[**Get_Vehicle_Locations**](FleetApi.md#Get_Vehicle_Locations) | **GET** /fleet/vehicles/{vehicle_id}/locations | /fleet/vehicles/{vehicle_id:[0_9]+}/locations
[**Get_Vehicle_Safety_Score**](FleetApi.md#Get_Vehicle_Safety_Score) | **GET** /fleet/vehicles/{vehicleId}/safety/score | /fleet/vehicles/{vehicleId:[0_9]+}/safety/score
[**Get_Vehicle_Stats**](FleetApi.md#Get_Vehicle_Stats) | **GET** /fleet/vehicles/stats | /fleet/vehicles/stats
[**Get_Vehicles_Locations**](FleetApi.md#Get_Vehicles_Locations) | **GET** /fleet/vehicles/locations | /fleet/vehicles/locations
[**List_Contacts**](FleetApi.md#List_Contacts) | **GET** /contacts | /contacts
[**List_Fleet**](FleetApi.md#List_Fleet) | **POST** /fleet/list | /fleet/list
[**Patch_Fleet_Vehicle**](FleetApi.md#Patch_Fleet_Vehicle) | **PATCH** /fleet/vehicles/{vehicle_id_or_external_id} | /fleet/vehicles/{vehicle_id:[0_9]+ | external_id:[a_zA_Z0_9]+}
[**Reactivate_Driver_By_Id**](FleetApi.md#Reactivate_Driver_By_Id) | **PUT** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0_9]+ | external_id:[a_zA_Z0_9]+}
[**Update_Dispatch_Route_By_Id**](FleetApi.md#Update_Dispatch_Route_By_Id) | **PUT** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0_9]+}/
[**Update_Organization_Address**](FleetApi.md#Update_Organization_Address) | **PATCH** /addresses/{addressId} | /addresses/{addressId}
[**Update_Vehicles**](FleetApi.md#Update_Vehicles) | **POST** /fleet/set_data | /fleet/set_data
[**Get_All_Data_Inputs**](IndustrialApi.md#Get_All_Data_Inputs) | **GET** /industrial/data | /industrial/data
[**Get_Data_Input**](IndustrialApi.md#Get_Data_Input) | **GET** /industrial/data/{data_input_id} | /industrial/data/{data_input_id:[0_9]+}
[**Get_Machines**](IndustrialApi.md#Get_Machines) | **POST** /machines/list | /machines/list
[**Get_Machines_History**](IndustrialApi.md#Get_Machines_History) | **POST** /machines/history | /machines/history
[**Create_Dispatch_Route**](RoutesApi.md#Create_Dispatch_Route) | **POST** /fleet/dispatch/routes | /fleet/dispatch/routes
[**Create_Driver_Dispatch_Route**](RoutesApi.md#Create_Driver_Dispatch_Route) | **POST** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0_9]+}/dispatch/routes
[**Create_Vehicle_Dispatch_Route**](RoutesApi.md#Create_Vehicle_Dispatch_Route) | **POST** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0_9]+}/dispatch/routes
[**Delete_Dispatch_Route_By_Id**](RoutesApi.md#Delete_Dispatch_Route_By_Id) | **DELETE** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0_9]+}/
[**Fetch_All_Dispatch_Routes**](RoutesApi.md#Fetch_All_Dispatch_Routes) | **GET** /fleet/dispatch/routes | /fleet/dispatch/routes
[**Fetch_All_Route_Job_Updates**](RoutesApi.md#Fetch_All_Route_Job_Updates) | **GET** /fleet/dispatch/routes/job_updates | /fleet/dispatch/routes/job_updates
[**Get_Dispatch_Route_By_Id**](RoutesApi.md#Get_Dispatch_Route_By_Id) | **GET** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0_9]+}
[**Get_Dispatch_Route_History**](RoutesApi.md#Get_Dispatch_Route_History) | **GET** /fleet/dispatch/routes/{route_id}/history | /fleet/dispatch/routes/{route_id:[0_9]+}/history
[**Get_Dispatch_Routes_By_Driver_Id**](RoutesApi.md#Get_Dispatch_Routes_By_Driver_Id) | **GET** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0_9]+}/dispatch/routes
[**Get_Dispatch_Routes_By_Vehicle_Id**](RoutesApi.md#Get_Dispatch_Routes_By_Vehicle_Id) | **GET** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0_9]+}/dispatch/routes
[**Update_Dispatch_Route_By_Id**](RoutesApi.md#Update_Dispatch_Route_By_Id) | **PUT** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0_9]+}/
[**Get_Driver_Safety_Score**](SafetyApi.md#Get_Driver_Safety_Score) | **GET** /fleet/drivers/{driverId}/safety/score | /fleet/drivers/{driverId:[0_9]+}/safety/score
[**Get_Vehicle_Harsh_Event**](SafetyApi.md#Get_Vehicle_Harsh_Event) | **GET** /fleet/vehicles/{vehicleId}/safety/harsh_event | /fleet/vehicles/{vehicleId:[0_9]+}/safety/harsh_event
[**Get_Vehicle_Safety_Score**](SafetyApi.md#Get_Vehicle_Safety_Score) | **GET** /fleet/vehicles/{vehicleId}/safety/score | /fleet/vehicles/{vehicleId:[0_9]+}/safety/score
[**Get_Sensors**](SensorsApi.md#Get_Sensors) | **POST** /sensors/list | /sensors/list
[**Get_Sensors_Cargo**](SensorsApi.md#Get_Sensors_Cargo) | **POST** /sensors/cargo | /sensors/cargo
[**Get_Sensors_Door**](SensorsApi.md#Get_Sensors_Door) | **POST** /sensors/door | /sensors/door
[**Get_Sensors_History**](SensorsApi.md#Get_Sensors_History) | **POST** /sensors/history | /sensors/history
[**Get_Sensors_Humidity**](SensorsApi.md#Get_Sensors_Humidity) | **POST** /sensors/humidity | /sensors/humidity
[**Get_Sensors_Temperature**](SensorsApi.md#Get_Sensors_Temperature) | **POST** /sensors/temperature | /sensors/temperature
[**Create_Tag**](TagsApi.md#Create_Tag) | **POST** /tags | /tags
[**Delete_Tag_By_Id**](TagsApi.md#Delete_Tag_By_Id) | **DELETE** /tags/{tag_id} | /tags/{tag_id:[0_9]+}
[**Get_All_Tags**](TagsApi.md#Get_All_Tags) | **GET** /tags | /tags
[**Get_Tag_By_Id**](TagsApi.md#Get_Tag_By_Id) | **GET** /tags/{tag_id} | /tags/{tag_id:[0_9]+}
[**Modify_Tag_By_Id**](TagsApi.md#Modify_Tag_By_Id) | **PATCH** /tags/{tag_id} | /tags/{tag_id:[0_9]+}
[**Update_Tag_By_Id**](TagsApi.md#Update_Tag_By_Id) | **PUT** /tags/{tag_id} | /tags/{tag_id:[0_9]+}
[**Delete_User_By_Id**](UsersApi.md#Delete_User_By_Id) | **DELETE** /users/{userId} | /users/{userId:[0_9]+}
[**Get_User_By_Id**](UsersApi.md#Get_User_By_Id) | **GET** /users/{userId} | /users/{userId:[0_9]+}
[**List_User_Roles**](UsersApi.md#List_User_Roles) | **GET** /user_roles | /user_roles
[**List_Users**](UsersApi.md#List_Users) | **GET** /users | /users


## Models
 - [.Models.AddressGeofenceCircleType](AddressGeofenceCircleType.md)
 - [.Models.AddressGeofencePolygonType](AddressGeofencePolygonType.md)
 - [.Models.AddressGeofencePolygonVerticesType](AddressGeofencePolygonVerticesType.md)
 - [.Models.AddressGeofenceType](AddressGeofenceType.md)
 - [.Models.AddressType](AddressType.md)
 - [.Models.AddressesAddressesType](AddressesAddressesType.md)
 - [.Models.AllRouteJobUpdatesType](AllRouteJobUpdatesType.md)
 - [.Models.AssetCableType](AssetCableType.md)
 - [.Models.AssetCurrentLocationType](AssetCurrentLocationType.md)
 - [.Models.AssetCurrentLocationsResponseType](AssetCurrentLocationsResponseType.md)
 - [.Models.AssetReeferResponseReeferStatsAlarms1Type](AssetReeferResponseReeferStatsAlarms1Type.md)
 - [.Models.AssetReeferResponseReeferStatsAlarmsType](AssetReeferResponseReeferStatsAlarmsType.md)
 - [.Models.AssetReeferResponseReeferStatsEngineHoursType](AssetReeferResponseReeferStatsEngineHoursType.md)
 - [.Models.AssetReeferResponseReeferStatsFuelPercentageType](AssetReeferResponseReeferStatsFuelPercentageType.md)
 - [.Models.AssetReeferResponseReeferStatsPowerStatusType](AssetReeferResponseReeferStatsPowerStatusType.md)
 - [.Models.AssetReeferResponseReeferStatsReturnAirTempType](AssetReeferResponseReeferStatsReturnAirTempType.md)
 - [.Models.AssetReeferResponseReeferStatsSetPointType](AssetReeferResponseReeferStatsSetPointType.md)
 - [.Models.AssetReeferResponseReeferStatsType](AssetReeferResponseReeferStatsType.md)
 - [.Models.AssetReeferResponseType](AssetReeferResponseType.md)
 - [.Models.AssetType](AssetType.md)
 - [.Models.AuxInputSeriesType](AuxInputSeriesType.md)
 - [.Models.AuxInputType](AuxInputType.md)
 - [.Models.CargoResponseSensorsType](CargoResponseSensorsType.md)
 - [.Models.CargoResponseType](CargoResponseType.md)
 - [.Models.ContactType](ContactType.md)
 - [.Models.CurrentDriverType](CurrentDriverType.md)
 - [.Models.DataInputHistoryResponsePointsType](DataInputHistoryResponsePointsType.md)
 - [.Models.DataInputHistoryResponseType](DataInputHistoryResponseType.md)
 - [.Models.DispatchJobCreateType](DispatchJobCreateType.md)
 - [.Models.DispatchJobType](DispatchJobType.md)
 - [.Models.DispatchRouteBaseType](DispatchRouteBaseType.md)
 - [.Models.DispatchRouteCreateType](DispatchRouteCreateType.md)
 - [.Models.DispatchRouteHistoricalEntryType](DispatchRouteHistoricalEntryType.md)
 - [.Models.DispatchRouteHistoryType](DispatchRouteHistoryType.md)
 - [.Models.DispatchRouteType](DispatchRouteType.md)
 - [.Models.DocumentBaseType](DocumentBaseType.md)
 - [.Models.DocumentCreateType](DocumentCreateType.md)
 - [.Models.DocumentFieldCreatePhotoValueType](DocumentFieldCreatePhotoValueType.md)
 - [.Models.DocumentFieldCreateType](DocumentFieldCreateType.md)
 - [.Models.DocumentFieldType](DocumentFieldType.md)
 - [.Models.DocumentFieldTypeNumberValueTypeMetadataType](DocumentFieldTypeNumberValueTypeMetadataType.md)
 - [.Models.DocumentFieldTypeType](DocumentFieldTypeType.md)
 - [.Models.DocumentType](DocumentType.md)
 - [.Models.DocumentTypeType](DocumentTypeType.md)
 - [.Models.DoorResponseSensorsType](DoorResponseSensorsType.md)
 - [.Models.DoorResponseType](DoorResponseType.md)
 - [.Models.DriverBaseType](DriverBaseType.md)
 - [.Models.DriverDailyLogResponseDaysType](DriverDailyLogResponseDaysType.md)
 - [.Models.DriverDailyLogResponseType](DriverDailyLogResponseType.md)
 - [.Models.DriverForCreateType](DriverForCreateType.md)
 - [.Models.DriverSafetyScoreResponseType](DriverSafetyScoreResponseType.md)
 - [.Models.DriverType](DriverType.md)
 - [.Models.DriversResponseType](DriversResponseType.md)
 - [.Models.DriversSummaryResponseSummariesType](DriversSummaryResponseSummariesType.md)
 - [.Models.DriversSummaryResponseType](DriversSummaryResponseType.md)
 - [.Models.DvirBaseAuthorSignatureType](DvirBaseAuthorSignatureType.md)
 - [.Models.DvirBaseMechanicOrAgentSignatureType](DvirBaseMechanicOrAgentSignatureType.md)
 - [.Models.DvirBaseNextDriverSignatureType](DvirBaseNextDriverSignatureType.md)
 - [.Models.DvirBaseTrailerDefectsType](DvirBaseTrailerDefectsType.md)
 - [.Models.DvirBaseType](DvirBaseType.md)
 - [.Models.DvirBaseVehicleType](DvirBaseVehicleType.md)
 - [.Models.DvirListResponseType](DvirListResponseType.md)
 - [.Models.EngineStateType](EngineStateType.md)
 - [.Models.FleetVehicleLocationType](FleetVehicleLocationType.md)
 - [.Models.FleetVehicleResponseType](FleetVehicleResponseType.md)
 - [.Models.FleetVehicleResponseVehicleInfoType](FleetVehicleResponseVehicleInfoType.md)
 - [.Models.HosAuthenticationLogsResponseAuthenticationLogsType](HosAuthenticationLogsResponseAuthenticationLogsType.md)
 - [.Models.HosAuthenticationLogsResponseType](HosAuthenticationLogsResponseType.md)
 - [.Models.HosLogsResponseLogsType](HosLogsResponseLogsType.md)
 - [.Models.HosLogsResponseType](HosLogsResponseType.md)
 - [.Models.HosLogsSummaryResponseDriversType](HosLogsSummaryResponseDriversType.md)
 - [.Models.HosLogsSummaryResponseType](HosLogsSummaryResponseType.md)
 - [.Models.HumidityResponseSensorsType](HumidityResponseSensorsType.md)
 - [.Models.HumidityResponseType](HumidityResponseType.md)
 - [.Models.InlineObject10Type](InlineObject10Type.md)
 - [.Models.InlineObject11Type](InlineObject11Type.md)
 - [.Models.InlineObject12Type](InlineObject12Type.md)
 - [.Models.InlineObject13Type](InlineObject13Type.md)
 - [.Models.InlineObject14Type](InlineObject14Type.md)
 - [.Models.InlineObject15Type](InlineObject15Type.md)
 - [.Models.InlineObject16Type](InlineObject16Type.md)
 - [.Models.InlineObject17Type](InlineObject17Type.md)
 - [.Models.InlineObject18Type](InlineObject18Type.md)
 - [.Models.InlineObject19Type](InlineObject19Type.md)
 - [.Models.InlineObject1Type](InlineObject1Type.md)
 - [.Models.InlineObject20Type](InlineObject20Type.md)
 - [.Models.InlineObject21Type](InlineObject21Type.md)
 - [.Models.InlineObject22Type](InlineObject22Type.md)
 - [.Models.InlineObject23Type](InlineObject23Type.md)
 - [.Models.InlineObject24Type](InlineObject24Type.md)
 - [.Models.InlineObject2Type](InlineObject2Type.md)
 - [.Models.InlineObject3Type](InlineObject3Type.md)
 - [.Models.InlineObject4Type](InlineObject4Type.md)
 - [.Models.InlineObject5Type](InlineObject5Type.md)
 - [.Models.InlineObject6Type](InlineObject6Type.md)
 - [.Models.InlineObject7Type](InlineObject7Type.md)
 - [.Models.InlineObject8Type](InlineObject8Type.md)
 - [.Models.InlineObject9Type](InlineObject9Type.md)
 - [.Models.InlineObjectType](InlineObjectType.md)
 - [.Models.InlineResponse2001Type](InlineResponse2001Type.md)
 - [.Models.InlineResponse2002Type](InlineResponse2002Type.md)
 - [.Models.InlineResponse2003Type](InlineResponse2003Type.md)
 - [.Models.InlineResponse2004Type](InlineResponse2004Type.md)
 - [.Models.InlineResponse2005Type](InlineResponse2005Type.md)
 - [.Models.InlineResponse2005VehicleStatsType](InlineResponse2005VehicleStatsType.md)
 - [.Models.InlineResponse2006Type](InlineResponse2006Type.md)
 - [.Models.InlineResponse2007Type](InlineResponse2007Type.md)
 - [.Models.InlineResponse2008Type](InlineResponse2008Type.md)
 - [.Models.InlineResponse2009Type](InlineResponse2009Type.md)
 - [.Models.InlineResponse200Type](InlineResponse200Type.md)
 - [.Models.JobStatusType](JobStatusType.md)
 - [.Models.JobUpdateObjectType](JobUpdateObjectType.md)
 - [.Models.MachineHistoryResponseMachinesType](MachineHistoryResponseMachinesType.md)
 - [.Models.MachineHistoryResponseType](MachineHistoryResponseType.md)
 - [.Models.MachineHistoryResponseVibrationsType](MachineHistoryResponseVibrationsType.md)
 - [.Models.MachineType](MachineType.md)
 - [.Models.PaginationType](PaginationType.md)
 - [.Models.PrevJobStatusType](PrevJobStatusType.md)
 - [.Models.SafetyReportHarshEventType](SafetyReportHarshEventType.md)
 - [.Models.SensorHistoryResponseResultsType](SensorHistoryResponseResultsType.md)
 - [.Models.SensorHistoryResponseType](SensorHistoryResponseType.md)
 - [.Models.SensorType](SensorType.md)
 - [.Models.SensorsHistorySeriesType](SensorsHistorySeriesType.md)
 - [.Models.TagCreateType](TagCreateType.md)
 - [.Models.TagMetadataType](TagMetadataType.md)
 - [.Models.TagModifyAddType](TagModifyAddType.md)
 - [.Models.TagModifyDeleteType](TagModifyDeleteType.md)
 - [.Models.TagModifyType](TagModifyType.md)
 - [.Models.TagType](TagType.md)
 - [.Models.TagUpdateType](TagUpdateType.md)
 - [.Models.TaggedAddressBaseType](TaggedAddressBaseType.md)
 - [.Models.TaggedAddressType](TaggedAddressType.md)
 - [.Models.TaggedAssetBaseType](TaggedAssetBaseType.md)
 - [.Models.TaggedAssetType](TaggedAssetType.md)
 - [.Models.TaggedDriverBaseType](TaggedDriverBaseType.md)
 - [.Models.TaggedDriverType](TaggedDriverType.md)
 - [.Models.TaggedMachineBaseType](TaggedMachineBaseType.md)
 - [.Models.TaggedMachineType](TaggedMachineType.md)
 - [.Models.TaggedSensorBaseType](TaggedSensorBaseType.md)
 - [.Models.TaggedSensorType](TaggedSensorType.md)
 - [.Models.TaggedVehicleBaseType](TaggedVehicleBaseType.md)
 - [.Models.TaggedVehicleType](TaggedVehicleType.md)
 - [.Models.TemperatureResponseSensorsType](TemperatureResponseSensorsType.md)
 - [.Models.TemperatureResponseType](TemperatureResponseType.md)
 - [.Models.TripResponseEndCoordinatesType](TripResponseEndCoordinatesType.md)
 - [.Models.TripResponseStartCoordinatesType](TripResponseStartCoordinatesType.md)
 - [.Models.TripResponseTripsType](TripResponseTripsType.md)
 - [.Models.TripResponseType](TripResponseType.md)
 - [.Models.UserBaseType](UserBaseType.md)
 - [.Models.UserRoleType](UserRoleType.md)
 - [.Models.UserTagRoleTagType](UserTagRoleTagType.md)
 - [.Models.UserTagRoleType](UserTagRoleType.md)
 - [.Models.UserType](UserType.md)
 - [.Models.VehicleHarshEventResponseLocationType](VehicleHarshEventResponseLocationType.md)
 - [.Models.VehicleHarshEventResponseType](VehicleHarshEventResponseType.md)
 - [.Models.VehicleLocationType](VehicleLocationType.md)
 - [.Models.VehicleMaintenanceJ1939CheckEngineLightType](VehicleMaintenanceJ1939CheckEngineLightType.md)
 - [.Models.VehicleMaintenanceJ1939DiagnosticTroubleCodesType](VehicleMaintenanceJ1939DiagnosticTroubleCodesType.md)
 - [.Models.VehicleMaintenanceJ1939Type](VehicleMaintenanceJ1939Type.md)
 - [.Models.VehicleMaintenancePassengerCheckEngineLightType](VehicleMaintenancePassengerCheckEngineLightType.md)
 - [.Models.VehicleMaintenancePassengerDiagnosticTroubleCodesType](VehicleMaintenancePassengerDiagnosticTroubleCodesType.md)
 - [.Models.VehicleMaintenancePassengerType](VehicleMaintenancePassengerType.md)
 - [.Models.VehicleMaintenanceType](VehicleMaintenanceType.md)
 - [.Models.VehicleSafetyScoreResponseType](VehicleSafetyScoreResponseType.md)
 - [.Models.VehicleType](VehicleType.md)


## Authorization
 All endpoints do not require authorization.


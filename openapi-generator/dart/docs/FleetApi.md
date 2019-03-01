# openapi.api.FleetApi

## Load the API package
```dart
import 'package:openapi/api.dart';
```

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addFleetAddress**](FleetApi.md#addFleetAddress) | **POST** /fleet/add_address | /fleet/add_address
[**addOrganizationAddresses**](FleetApi.md#addOrganizationAddresses) | **POST** /addresses | /addresses
[**createDispatchRoute**](FleetApi.md#createDispatchRoute) | **POST** /fleet/dispatch/routes | /fleet/dispatch/routes
[**createDriver**](FleetApi.md#createDriver) | **POST** /fleet/drivers/create | /fleet/drivers/create
[**createDriverDispatchRoute**](FleetApi.md#createDriverDispatchRoute) | **POST** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
[**createDriverDocument**](FleetApi.md#createDriverDocument) | **POST** /fleet/drivers/{driver_id}/documents | /fleet/drivers/{driver_id:[0-9]+}/documents
[**createDvir**](FleetApi.md#createDvir) | **POST** /fleet/maintenance/dvirs | /fleet/maintenance/dvirs
[**createVehicleDispatchRoute**](FleetApi.md#createVehicleDispatchRoute) | **POST** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
[**deactivateDriver**](FleetApi.md#deactivateDriver) | **DELETE** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
[**deleteDispatchRouteById**](FleetApi.md#deleteDispatchRouteById) | **DELETE** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
[**deleteOrganizationAddress**](FleetApi.md#deleteOrganizationAddress) | **DELETE** /addresses/{addressId} | /addresses/{addressId}
[**fetchAllDispatchRoutes**](FleetApi.md#fetchAllDispatchRoutes) | **GET** /fleet/dispatch/routes | /fleet/dispatch/routes
[**fetchAllRouteJobUpdates**](FleetApi.md#fetchAllRouteJobUpdates) | **GET** /fleet/dispatch/routes/job_updates | /fleet/dispatch/routes/job_updates
[**getAllAssetCurrentLocations**](FleetApi.md#getAllAssetCurrentLocations) | **GET** /fleet/assets/locations | /fleet/assets/locations
[**getAllAssets**](FleetApi.md#getAllAssets) | **GET** /fleet/assets | /fleet/assets
[**getAllDeactivatedDrivers**](FleetApi.md#getAllDeactivatedDrivers) | **GET** /fleet/drivers/inactive | /fleet/drivers/inactive
[**getAssetLocation**](FleetApi.md#getAssetLocation) | **GET** /fleet/assets/{asset_id}/locations | /fleet/assets/{assetId:[0-9]+}/locations
[**getAssetReefer**](FleetApi.md#getAssetReefer) | **GET** /fleet/assets/{asset_id}/reefer | /fleet/assets/{assetId:[0-9]+}/reefer
[**getDeactivatedDriverById**](FleetApi.md#getDeactivatedDriverById) | **GET** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
[**getDispatchRouteById**](FleetApi.md#getDispatchRouteById) | **GET** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}
[**getDispatchRouteHistory**](FleetApi.md#getDispatchRouteHistory) | **GET** /fleet/dispatch/routes/{route_id}/history | /fleet/dispatch/routes/{route_id:[0-9]+}/history
[**getDispatchRoutesByDriverId**](FleetApi.md#getDispatchRoutesByDriverId) | **GET** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
[**getDispatchRoutesByVehicleId**](FleetApi.md#getDispatchRoutesByVehicleId) | **GET** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
[**getDriverById**](FleetApi.md#getDriverById) | **GET** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
[**getDriverDocumentTypesByOrgId**](FleetApi.md#getDriverDocumentTypesByOrgId) | **GET** /fleet/drivers/document_types | /fleet/drivers/document_types
[**getDriverDocumentsByOrgId**](FleetApi.md#getDriverDocumentsByOrgId) | **GET** /fleet/drivers/documents | /fleet/drivers/documents
[**getDriverSafetyScore**](FleetApi.md#getDriverSafetyScore) | **GET** /fleet/drivers/{driverId}/safety/score | /fleet/drivers/{driverId:[0-9]+}/safety/score
[**getDvirs**](FleetApi.md#getDvirs) | **GET** /fleet/maintenance/dvirs | /fleet/maintenance/dvirs
[**getFleetDrivers**](FleetApi.md#getFleetDrivers) | **POST** /fleet/drivers | /fleet/drivers
[**getFleetDriversHosDailyLogs**](FleetApi.md#getFleetDriversHosDailyLogs) | **POST** /fleet/drivers/{driver_id}/hos_daily_logs | /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
[**getFleetDriversSummary**](FleetApi.md#getFleetDriversSummary) | **POST** /fleet/drivers/summary | /fleet/drivers/summary
[**getFleetHosAuthenticationLogs**](FleetApi.md#getFleetHosAuthenticationLogs) | **POST** /fleet/hos_authentication_logs | /fleet/hos_authentication_logs
[**getFleetHosLogs**](FleetApi.md#getFleetHosLogs) | **POST** /fleet/hos_logs | /fleet/hos_logs
[**getFleetHosLogsSummary**](FleetApi.md#getFleetHosLogsSummary) | **POST** /fleet/hos_logs_summary | /fleet/hos_logs_summary
[**getFleetLocations**](FleetApi.md#getFleetLocations) | **POST** /fleet/locations | /fleet/locations
[**getFleetMaintenanceList**](FleetApi.md#getFleetMaintenanceList) | **POST** /fleet/maintenance/list | /fleet/maintenance/list
[**getFleetTrips**](FleetApi.md#getFleetTrips) | **POST** /fleet/trips | /fleet/trips
[**getFleetVehicle**](FleetApi.md#getFleetVehicle) | **GET** /fleet/vehicles/{vehicle_id_or_external_id} | /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
[**getOrganizationAddress**](FleetApi.md#getOrganizationAddress) | **GET** /addresses/{addressId} | /addresses/{addressId}
[**getOrganizationAddresses**](FleetApi.md#getOrganizationAddresses) | **GET** /addresses | /addresses
[**getOrganizationContact**](FleetApi.md#getOrganizationContact) | **GET** /contacts/{contact_id} | /contacts/{contact_id}
[**getVehicleHarshEvent**](FleetApi.md#getVehicleHarshEvent) | **GET** /fleet/vehicles/{vehicleId}/safety/harsh_event | /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
[**getVehicleLocations**](FleetApi.md#getVehicleLocations) | **GET** /fleet/vehicles/{vehicle_id}/locations | /fleet/vehicles/{vehicle_id:[0-9]+}/locations
[**getVehicleSafetyScore**](FleetApi.md#getVehicleSafetyScore) | **GET** /fleet/vehicles/{vehicleId}/safety/score | /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
[**getVehicleStats**](FleetApi.md#getVehicleStats) | **GET** /fleet/vehicles/stats | /fleet/vehicles/stats
[**getVehiclesLocations**](FleetApi.md#getVehiclesLocations) | **GET** /fleet/vehicles/locations | /fleet/vehicles/locations
[**listContacts**](FleetApi.md#listContacts) | **GET** /contacts | /contacts
[**listFleet**](FleetApi.md#listFleet) | **POST** /fleet/list | /fleet/list
[**patchFleetVehicle**](FleetApi.md#patchFleetVehicle) | **PATCH** /fleet/vehicles/{vehicle_id_or_external_id} | /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
[**reactivateDriverById**](FleetApi.md#reactivateDriverById) | **PUT** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
[**updateDispatchRouteById**](FleetApi.md#updateDispatchRouteById) | **PUT** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
[**updateOrganizationAddress**](FleetApi.md#updateOrganizationAddress) | **PATCH** /addresses/{addressId} | /addresses/{addressId}
[**updateVehicles**](FleetApi.md#updateVehicles) | **POST** /fleet/set_data | /fleet/set_data


# **addFleetAddress**
> addFleetAddress(accessToken, addressParam)

/fleet/add_address

This method adds an address book entry to the specified group.

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new FleetApi();
var accessToken = accessToken_example; // String | Samsara API access token.
var addressParam = new InlineObject2(); // InlineObject2 | 

try { 
    api_instance.addFleetAddress(accessToken, addressParam);
} catch (e) {
    print("Exception when calling FleetApi->addFleetAddress: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | [default to null]
 **addressParam** | [**InlineObject2**](InlineObject2.md)|  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **addOrganizationAddresses**
> List<Address> addOrganizationAddresses(accessToken, addresses)

/addresses

Add one or more addresses to the organization

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new FleetApi();
var accessToken = accessToken_example; // String | Samsara API access token.
var addresses = new InlineObject(); // InlineObject | 

try { 
    var result = api_instance.addOrganizationAddresses(accessToken, addresses);
    print(result);
} catch (e) {
    print("Exception when calling FleetApi->addOrganizationAddresses: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | [default to null]
 **addresses** | [**InlineObject**](InlineObject.md)|  | 

### Return type

[**List<Address>**](Address.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createDispatchRoute**
> DispatchRoute createDispatchRoute(accessToken, createDispatchRouteParams)

/fleet/dispatch/routes

Create a new dispatch route.

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new FleetApi();
var accessToken = accessToken_example; // String | Samsara API access token.
var createDispatchRouteParams = new DispatchRouteCreate(); // DispatchRouteCreate | 

try { 
    var result = api_instance.createDispatchRoute(accessToken, createDispatchRouteParams);
    print(result);
} catch (e) {
    print("Exception when calling FleetApi->createDispatchRoute: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | [default to null]
 **createDispatchRouteParams** | [**DispatchRouteCreate**](DispatchRouteCreate.md)|  | 

### Return type

[**DispatchRoute**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createDriver**
> Driver createDriver(accessToken, createDriverParam)

/fleet/drivers/create

Create a new driver.

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new FleetApi();
var accessToken = accessToken_example; // String | Samsara API access token.
var createDriverParam = new DriverForCreate(); // DriverForCreate | Driver creation body

try { 
    var result = api_instance.createDriver(accessToken, createDriverParam);
    print(result);
} catch (e) {
    print("Exception when calling FleetApi->createDriver: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | [default to null]
 **createDriverParam** | [**DriverForCreate**](DriverForCreate.md)| Driver creation body | 

### Return type

[**Driver**](Driver.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createDriverDispatchRoute**
> DispatchRoute createDriverDispatchRoute(accessToken, driverId, createDispatchRouteParams)

/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes

Create a new dispatch route for the driver with driver_id.

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new FleetApi();
var accessToken = accessToken_example; // String | Samsara API access token.
var driverId = 789; // int | ID of the driver with the associated routes.
var createDispatchRouteParams = new DispatchRouteCreate(); // DispatchRouteCreate | 

try { 
    var result = api_instance.createDriverDispatchRoute(accessToken, driverId, createDispatchRouteParams);
    print(result);
} catch (e) {
    print("Exception when calling FleetApi->createDriverDispatchRoute: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | [default to null]
 **driverId** | **int**| ID of the driver with the associated routes. | [default to null]
 **createDispatchRouteParams** | [**DispatchRouteCreate**](DispatchRouteCreate.md)|  | 

### Return type

[**DispatchRoute**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createDriverDocument**
> Document createDriverDocument(accessToken, driverId, createDocumentParams)

/fleet/drivers/{driver_id:[0-9]+}/documents

Create a driver document for the given driver.

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new FleetApi();
var accessToken = accessToken_example; // String | Samsara API access token.
var driverId = 789; // int | ID of the driver for whom the document is created.
var createDocumentParams = new DocumentCreate(); // DocumentCreate | To create a document for a given document type, the document type's uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field's valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_.

try { 
    var result = api_instance.createDriverDocument(accessToken, driverId, createDocumentParams);
    print(result);
} catch (e) {
    print("Exception when calling FleetApi->createDriverDocument: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | [default to null]
 **driverId** | **int**| ID of the driver for whom the document is created. | [default to null]
 **createDocumentParams** | [**DocumentCreate**](DocumentCreate.md)| To create a document for a given document type, the document type&#39;s uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field&#39;s valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_. | 

### Return type

[**Document**](Document.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createDvir**
> DvirBase createDvir(accessToken, createDvirParam)

/fleet/maintenance/dvirs

Create a new dvir, marking a vehicle or trailer safe or unsafe.

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new FleetApi();
var accessToken = accessToken_example; // String | Samsara API access token.
var createDvirParam = new InlineObject12(); // InlineObject12 | 

try { 
    var result = api_instance.createDvir(accessToken, createDvirParam);
    print(result);
} catch (e) {
    print("Exception when calling FleetApi->createDvir: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | [default to null]
 **createDvirParam** | [**InlineObject12**](InlineObject12.md)|  | 

### Return type

[**DvirBase**](DvirBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createVehicleDispatchRoute**
> DispatchRoute createVehicleDispatchRoute(accessToken, vehicleId, createDispatchRouteParams)

/fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes

Create a new dispatch route for the vehicle with vehicle_id.

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new FleetApi();
var accessToken = accessToken_example; // String | Samsara API access token.
var vehicleId = 789; // int | ID of the vehicle with the associated routes.
var createDispatchRouteParams = new DispatchRouteCreate(); // DispatchRouteCreate | 

try { 
    var result = api_instance.createVehicleDispatchRoute(accessToken, vehicleId, createDispatchRouteParams);
    print(result);
} catch (e) {
    print("Exception when calling FleetApi->createVehicleDispatchRoute: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | [default to null]
 **vehicleId** | **int**| ID of the vehicle with the associated routes. | [default to null]
 **createDispatchRouteParams** | [**DispatchRouteCreate**](DispatchRouteCreate.md)|  | 

### Return type

[**DispatchRoute**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deactivateDriver**
> deactivateDriver(accessToken, driverIdOrExternalId)

/fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

Deactivate a driver with the given id.

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new FleetApi();
var accessToken = accessToken_example; // String | Samsara API access token.
var driverIdOrExternalId = driverIdOrExternalId_example; // String | ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.

try { 
    api_instance.deactivateDriver(accessToken, driverIdOrExternalId);
} catch (e) {
    print("Exception when calling FleetApi->deactivateDriver: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | [default to null]
 **driverIdOrExternalId** | **String**| ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. | [default to null]

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deleteDispatchRouteById**
> deleteDispatchRouteById(accessToken, routeId)

/fleet/dispatch/routes/{route_id:[0-9]+}/

Delete a dispatch route and its associated jobs.

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new FleetApi();
var accessToken = accessToken_example; // String | Samsara API access token.
var routeId = 789; // int | ID of the dispatch route.

try { 
    api_instance.deleteDispatchRouteById(accessToken, routeId);
} catch (e) {
    print("Exception when calling FleetApi->deleteDispatchRouteById: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | [default to null]
 **routeId** | **int**| ID of the dispatch route. | [default to null]

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deleteOrganizationAddress**
> deleteOrganizationAddress(accessToken, addressId)

/addresses/{addressId}

Delete an address.

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new FleetApi();
var accessToken = accessToken_example; // String | Samsara API access token.
var addressId = 789; // int | ID of the address/geofence

try { 
    api_instance.deleteOrganizationAddress(accessToken, addressId);
} catch (e) {
    print("Exception when calling FleetApi->deleteOrganizationAddress: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | [default to null]
 **addressId** | **int**| ID of the address/geofence | [default to null]

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **fetchAllDispatchRoutes**
> List<DispatchRoute> fetchAllDispatchRoutes(accessToken, groupId, endTime, duration)

/fleet/dispatch/routes

Fetch all of the dispatch routes for the group.

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new FleetApi();
var accessToken = accessToken_example; // String | Samsara API access token.
var groupId = 789; // int | Optional group ID if the organization has multiple groups (uncommon).
var endTime = 789; // int | Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
var duration = 789; // int | Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.

try { 
    var result = api_instance.fetchAllDispatchRoutes(accessToken, groupId, endTime, duration);
    print(result);
} catch (e) {
    print("Exception when calling FleetApi->fetchAllDispatchRoutes: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | [default to null]
 **groupId** | **int**| Optional group ID if the organization has multiple groups (uncommon). | [optional] [default to null]
 **endTime** | **int**| Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. | [optional] [default to null]
 **duration** | **int**| Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. | [optional] [default to null]

### Return type

[**List<DispatchRoute>**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **fetchAllRouteJobUpdates**
> AllRouteJobUpdates fetchAllRouteJobUpdates(accessToken, groupId, sequenceId, include)

/fleet/dispatch/routes/job_updates

Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new FleetApi();
var accessToken = accessToken_example; // String | Samsara API access token.
var groupId = 789; // int | Optional group ID if the organization has multiple groups (uncommon).
var sequenceId = sequenceId_example; // String | Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours.
var include = include_example; // String | Optionally set include=route to include route object in response payload.

try { 
    var result = api_instance.fetchAllRouteJobUpdates(accessToken, groupId, sequenceId, include);
    print(result);
} catch (e) {
    print("Exception when calling FleetApi->fetchAllRouteJobUpdates: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | [default to null]
 **groupId** | **int**| Optional group ID if the organization has multiple groups (uncommon). | [optional] [default to null]
 **sequenceId** | **String**| Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours. | [optional] [default to null]
 **include** | **String**| Optionally set include&#x3D;route to include route object in response payload. | [optional] [default to null]

### Return type

[**AllRouteJobUpdates**](AllRouteJobUpdates.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getAllAssetCurrentLocations**
> InlineResponse2001 getAllAssetCurrentLocations(accessToken, groupId)

/fleet/assets/locations

Fetch current locations of all assets for the group.

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new FleetApi();
var accessToken = accessToken_example; // String | Samsara API access token.
var groupId = 789; // int | Optional group ID if the organization has multiple groups (uncommon).

try { 
    var result = api_instance.getAllAssetCurrentLocations(accessToken, groupId);
    print(result);
} catch (e) {
    print("Exception when calling FleetApi->getAllAssetCurrentLocations: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | [default to null]
 **groupId** | **int**| Optional group ID if the organization has multiple groups (uncommon). | [optional] [default to null]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getAllAssets**
> InlineResponse200 getAllAssets(accessToken, groupId)

/fleet/assets

Fetch all of the assets for the group.

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new FleetApi();
var accessToken = accessToken_example; // String | Samsara API access token.
var groupId = 789; // int | Optional group ID if the organization has multiple groups (uncommon).

try { 
    var result = api_instance.getAllAssets(accessToken, groupId);
    print(result);
} catch (e) {
    print("Exception when calling FleetApi->getAllAssets: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | [default to null]
 **groupId** | **int**| Optional group ID if the organization has multiple groups (uncommon). | [optional] [default to null]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getAllDeactivatedDrivers**
> List<Driver> getAllDeactivatedDrivers(accessToken, groupId)

/fleet/drivers/inactive

Fetch all deactivated drivers for the group.

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new FleetApi();
var accessToken = accessToken_example; // String | Samsara API access token.
var groupId = 789; // int | Optional group ID if the organization has multiple groups (uncommon).

try { 
    var result = api_instance.getAllDeactivatedDrivers(accessToken, groupId);
    print(result);
} catch (e) {
    print("Exception when calling FleetApi->getAllDeactivatedDrivers: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | [default to null]
 **groupId** | **int**| Optional group ID if the organization has multiple groups (uncommon). | [optional] [default to null]

### Return type

[**List<Driver>**](Driver.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getAssetLocation**
> List<Object> getAssetLocation(accessToken, assetId, startMs, endMs)

/fleet/assets/{assetId:[0-9]+}/locations

Fetch the historical locations for the asset.

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new FleetApi();
var accessToken = accessToken_example; // String | Samsara API access token.
var assetId = 789; // int | ID of the asset
var startMs = 789; // int | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
var endMs = 789; // int | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.

try { 
    var result = api_instance.getAssetLocation(accessToken, assetId, startMs, endMs);
    print(result);
} catch (e) {
    print("Exception when calling FleetApi->getAssetLocation: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | [default to null]
 **assetId** | **int**| ID of the asset | [default to null]
 **startMs** | **int**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. | [default to null]
 **endMs** | **int**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. | [default to null]

### Return type

[**List<Object>**](Object.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getAssetReefer**
> AssetReeferResponse getAssetReefer(accessToken, assetId, startMs, endMs)

/fleet/assets/{assetId:[0-9]+}/reefer

Fetch the reefer-specific stats of an asset.

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new FleetApi();
var accessToken = accessToken_example; // String | Samsara API access token.
var assetId = 789; // int | ID of the asset
var startMs = 789; // int | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
var endMs = 789; // int | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.

try { 
    var result = api_instance.getAssetReefer(accessToken, assetId, startMs, endMs);
    print(result);
} catch (e) {
    print("Exception when calling FleetApi->getAssetReefer: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | [default to null]
 **assetId** | **int**| ID of the asset | [default to null]
 **startMs** | **int**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. | [default to null]
 **endMs** | **int**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. | [default to null]

### Return type

[**AssetReeferResponse**](AssetReeferResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getDeactivatedDriverById**
> Driver getDeactivatedDriverById(accessToken, driverIdOrExternalId)

/fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

Fetch deactivated driver by id.

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new FleetApi();
var accessToken = accessToken_example; // String | Samsara API access token.
var driverIdOrExternalId = driverIdOrExternalId_example; // String | ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.

try { 
    var result = api_instance.getDeactivatedDriverById(accessToken, driverIdOrExternalId);
    print(result);
} catch (e) {
    print("Exception when calling FleetApi->getDeactivatedDriverById: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | [default to null]
 **driverIdOrExternalId** | **String**| ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. | [default to null]

### Return type

[**Driver**](Driver.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getDispatchRouteById**
> DispatchRoute getDispatchRouteById(accessToken, routeId)

/fleet/dispatch/routes/{route_id:[0-9]+}

Fetch a dispatch route by id.

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new FleetApi();
var accessToken = accessToken_example; // String | Samsara API access token.
var routeId = 789; // int | ID of the dispatch route.

try { 
    var result = api_instance.getDispatchRouteById(accessToken, routeId);
    print(result);
} catch (e) {
    print("Exception when calling FleetApi->getDispatchRouteById: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | [default to null]
 **routeId** | **int**| ID of the dispatch route. | [default to null]

### Return type

[**DispatchRoute**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getDispatchRouteHistory**
> DispatchRouteHistory getDispatchRouteHistory(accessToken, routeId, startTime, endTime)

/fleet/dispatch/routes/{route_id:[0-9]+}/history

Fetch the history of a dispatch route.

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new FleetApi();
var accessToken = accessToken_example; // String | Samsara API access token.
var routeId = 789; // int | ID of the route with history.
var startTime = 789; // int | Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0.
var endTime = 789; // int | Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs.

try { 
    var result = api_instance.getDispatchRouteHistory(accessToken, routeId, startTime, endTime);
    print(result);
} catch (e) {
    print("Exception when calling FleetApi->getDispatchRouteHistory: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | [default to null]
 **routeId** | **int**| ID of the route with history. | [default to null]
 **startTime** | **int**| Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0. | [optional] [default to null]
 **endTime** | **int**| Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs. | [optional] [default to null]

### Return type

[**DispatchRouteHistory**](DispatchRouteHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getDispatchRoutesByDriverId**
> List<DispatchRoute> getDispatchRoutesByDriverId(accessToken, driverId, endTime, duration)

/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes

Fetch all of the dispatch routes for a given driver.

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new FleetApi();
var accessToken = accessToken_example; // String | Samsara API access token.
var driverId = 789; // int | ID of the driver with the associated routes.
var endTime = 789; // int | Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
var duration = 789; // int | Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.

try { 
    var result = api_instance.getDispatchRoutesByDriverId(accessToken, driverId, endTime, duration);
    print(result);
} catch (e) {
    print("Exception when calling FleetApi->getDispatchRoutesByDriverId: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | [default to null]
 **driverId** | **int**| ID of the driver with the associated routes. | [default to null]
 **endTime** | **int**| Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. | [optional] [default to null]
 **duration** | **int**| Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. | [optional] [default to null]

### Return type

[**List<DispatchRoute>**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getDispatchRoutesByVehicleId**
> List<DispatchRoute> getDispatchRoutesByVehicleId(accessToken, vehicleId, endTime, duration)

/fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes

Fetch all of the dispatch routes for a given vehicle.

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new FleetApi();
var accessToken = accessToken_example; // String | Samsara API access token.
var vehicleId = 789; // int | ID of the vehicle with the associated routes.
var endTime = 789; // int | Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
var duration = 789; // int | Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.

try { 
    var result = api_instance.getDispatchRoutesByVehicleId(accessToken, vehicleId, endTime, duration);
    print(result);
} catch (e) {
    print("Exception when calling FleetApi->getDispatchRoutesByVehicleId: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | [default to null]
 **vehicleId** | **int**| ID of the vehicle with the associated routes. | [default to null]
 **endTime** | **int**| Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. | [optional] [default to null]
 **duration** | **int**| Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. | [optional] [default to null]

### Return type

[**List<DispatchRoute>**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getDriverById**
> Driver getDriverById(accessToken, driverIdOrExternalId)

/fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

Fetch driver by id.

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new FleetApi();
var accessToken = accessToken_example; // String | Samsara API access token.
var driverIdOrExternalId = driverIdOrExternalId_example; // String | ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.

try { 
    var result = api_instance.getDriverById(accessToken, driverIdOrExternalId);
    print(result);
} catch (e) {
    print("Exception when calling FleetApi->getDriverById: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | [default to null]
 **driverIdOrExternalId** | **String**| ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. | [default to null]

### Return type

[**Driver**](Driver.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getDriverDocumentTypesByOrgId**
> List<DocumentType> getDriverDocumentTypesByOrgId()

/fleet/drivers/document_types

Fetch all of the document types.

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new FleetApi();

try { 
    var result = api_instance.getDriverDocumentTypesByOrgId();
    print(result);
} catch (e) {
    print("Exception when calling FleetApi->getDriverDocumentTypesByOrgId: $e\n");
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List<DocumentType>**](DocumentType.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getDriverDocumentsByOrgId**
> List<Document> getDriverDocumentsByOrgId(accessToken, endMs, durationMs)

/fleet/drivers/documents

Fetch all of the documents.

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new FleetApi();
var accessToken = accessToken_example; // String | Samsara API access token.
var endMs = 789; // int | Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now.
var durationMs = 789; // int | Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours.

try { 
    var result = api_instance.getDriverDocumentsByOrgId(accessToken, endMs, durationMs);
    print(result);
} catch (e) {
    print("Exception when calling FleetApi->getDriverDocumentsByOrgId: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | [default to null]
 **endMs** | **int**| Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now. | [optional] [default to null]
 **durationMs** | **int**| Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours. | [optional] [default to null]

### Return type

[**List<Document>**](Document.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getDriverSafetyScore**
> DriverSafetyScoreResponse getDriverSafetyScore(driverId, accessToken, startMs, endMs)

/fleet/drivers/{driverId:[0-9]+}/safety/score

Fetch the safety score for the driver.

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new FleetApi();
var driverId = 789; // int | ID of the driver
var accessToken = accessToken_example; // String | Samsara API access token.
var startMs = 789; // int | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
var endMs = 789; // int | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.

try { 
    var result = api_instance.getDriverSafetyScore(driverId, accessToken, startMs, endMs);
    print(result);
} catch (e) {
    print("Exception when calling FleetApi->getDriverSafetyScore: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **driverId** | **int**| ID of the driver | [default to null]
 **accessToken** | **String**| Samsara API access token. | [default to null]
 **startMs** | **int**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. | [default to null]
 **endMs** | **int**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. | [default to null]

### Return type

[**DriverSafetyScoreResponse**](DriverSafetyScoreResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getDvirs**
> DvirListResponse getDvirs(accessToken, endMs, durationMs, groupId)

/fleet/maintenance/dvirs

Get DVIRs for the org within provided time constraints

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new FleetApi();
var accessToken = accessToken_example; // String | Samsara API access token.
var endMs = 56; // int | time in millis until the last dvir log.
var durationMs = 56; // int | time in millis which corresponds to the duration before the end_ms.
var groupId = 56; // int | Group ID to query.

try { 
    var result = api_instance.getDvirs(accessToken, endMs, durationMs, groupId);
    print(result);
} catch (e) {
    print("Exception when calling FleetApi->getDvirs: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | [default to null]
 **endMs** | **int**| time in millis until the last dvir log. | [default to null]
 **durationMs** | **int**| time in millis which corresponds to the duration before the end_ms. | [default to null]
 **groupId** | **int**| Group ID to query. | [optional] [default to null]

### Return type

[**DvirListResponse**](DvirListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getFleetDrivers**
> DriversResponse getFleetDrivers(accessToken, groupDriversParam)

/fleet/drivers

Get all the drivers for the specified group.

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new FleetApi();
var accessToken = accessToken_example; // String | Samsara API access token.
var groupDriversParam = new InlineObject3(); // InlineObject3 | 

try { 
    var result = api_instance.getFleetDrivers(accessToken, groupDriversParam);
    print(result);
} catch (e) {
    print("Exception when calling FleetApi->getFleetDrivers: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | [default to null]
 **groupDriversParam** | [**InlineObject3**](InlineObject3.md)|  | 

### Return type

[**DriversResponse**](DriversResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getFleetDriversHosDailyLogs**
> DriverDailyLogResponse getFleetDriversHosDailyLogs(accessToken, driverId, hosLogsParam)

/fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs

Get summarized daily HOS charts for a specified driver.

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new FleetApi();
var accessToken = accessToken_example; // String | Samsara API access token.
var driverId = 789; // int | ID of the driver with HOS logs.
var hosLogsParam = new InlineObject6(); // InlineObject6 | 

try { 
    var result = api_instance.getFleetDriversHosDailyLogs(accessToken, driverId, hosLogsParam);
    print(result);
} catch (e) {
    print("Exception when calling FleetApi->getFleetDriversHosDailyLogs: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | [default to null]
 **driverId** | **int**| ID of the driver with HOS logs. | [default to null]
 **hosLogsParam** | [**InlineObject6**](InlineObject6.md)|  | 

### Return type

[**DriverDailyLogResponse**](DriverDailyLogResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getFleetDriversSummary**
> DriversSummaryResponse getFleetDriversSummary(accessToken, driversSummaryParam, snapToDayBounds)

/fleet/drivers/summary

Get the distance and time each driver in an organization has driven in a given time period.

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new FleetApi();
var accessToken = accessToken_example; // String | Samsara API access token.
var driversSummaryParam = new InlineObject5(); // InlineObject5 | 
var snapToDayBounds = true; // bool | Snap query result to HOS day boundaries.

try { 
    var result = api_instance.getFleetDriversSummary(accessToken, driversSummaryParam, snapToDayBounds);
    print(result);
} catch (e) {
    print("Exception when calling FleetApi->getFleetDriversSummary: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | [default to null]
 **driversSummaryParam** | [**InlineObject5**](InlineObject5.md)|  | 
 **snapToDayBounds** | **bool**| Snap query result to HOS day boundaries. | [optional] [default to null]

### Return type

[**DriversSummaryResponse**](DriversSummaryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getFleetHosAuthenticationLogs**
> HosAuthenticationLogsResponse getFleetHosAuthenticationLogs(accessToken, hosAuthenticationLogsParam)

/fleet/hos_authentication_logs

Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new FleetApi();
var accessToken = accessToken_example; // String | Samsara API access token.
var hosAuthenticationLogsParam = new InlineObject7(); // InlineObject7 | 

try { 
    var result = api_instance.getFleetHosAuthenticationLogs(accessToken, hosAuthenticationLogsParam);
    print(result);
} catch (e) {
    print("Exception when calling FleetApi->getFleetHosAuthenticationLogs: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | [default to null]
 **hosAuthenticationLogsParam** | [**InlineObject7**](InlineObject7.md)|  | 

### Return type

[**HosAuthenticationLogsResponse**](HosAuthenticationLogsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getFleetHosLogs**
> HosLogsResponse getFleetHosLogs(accessToken, hosLogsParam)

/fleet/hos_logs

Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new FleetApi();
var accessToken = accessToken_example; // String | Samsara API access token.
var hosLogsParam = new InlineObject8(); // InlineObject8 | 

try { 
    var result = api_instance.getFleetHosLogs(accessToken, hosLogsParam);
    print(result);
} catch (e) {
    print("Exception when calling FleetApi->getFleetHosLogs: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | [default to null]
 **hosLogsParam** | [**InlineObject8**](InlineObject8.md)|  | 

### Return type

[**HosLogsResponse**](HosLogsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getFleetHosLogsSummary**
> HosLogsSummaryResponse getFleetHosLogsSummary(accessToken, hosLogsParam)

/fleet/hos_logs_summary

Get the current HOS status for all drivers in the group.

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new FleetApi();
var accessToken = accessToken_example; // String | Samsara API access token.
var hosLogsParam = new InlineObject9(); // InlineObject9 | 

try { 
    var result = api_instance.getFleetHosLogsSummary(accessToken, hosLogsParam);
    print(result);
} catch (e) {
    print("Exception when calling FleetApi->getFleetHosLogsSummary: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | [default to null]
 **hosLogsParam** | [**InlineObject9**](InlineObject9.md)|  | 

### Return type

[**HosLogsSummaryResponse**](HosLogsSummaryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getFleetLocations**
> InlineResponse2003 getFleetLocations(accessToken, groupParam)

/fleet/locations

Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new FleetApi();
var accessToken = accessToken_example; // String | Samsara API access token.
var groupParam = new InlineObject11(); // InlineObject11 | 

try { 
    var result = api_instance.getFleetLocations(accessToken, groupParam);
    print(result);
} catch (e) {
    print("Exception when calling FleetApi->getFleetLocations: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | [default to null]
 **groupParam** | [**InlineObject11**](InlineObject11.md)|  | 

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getFleetMaintenanceList**
> InlineResponse2004 getFleetMaintenanceList(accessToken, groupParam)

/fleet/maintenance/list

Get list of the vehicles with any engine faults or check light data.

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new FleetApi();
var accessToken = accessToken_example; // String | Samsara API access token.
var groupParam = new InlineObject13(); // InlineObject13 | 

try { 
    var result = api_instance.getFleetMaintenanceList(accessToken, groupParam);
    print(result);
} catch (e) {
    print("Exception when calling FleetApi->getFleetMaintenanceList: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | [default to null]
 **groupParam** | [**InlineObject13**](InlineObject13.md)|  | 

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getFleetTrips**
> TripResponse getFleetTrips(accessToken, tripsParam)

/fleet/trips

Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new FleetApi();
var accessToken = accessToken_example; // String | Samsara API access token.
var tripsParam = new InlineObject15(); // InlineObject15 | 

try { 
    var result = api_instance.getFleetTrips(accessToken, tripsParam);
    print(result);
} catch (e) {
    print("Exception when calling FleetApi->getFleetTrips: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | [default to null]
 **tripsParam** | [**InlineObject15**](InlineObject15.md)|  | 

### Return type

[**TripResponse**](TripResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getFleetVehicle**
> FleetVehicleResponse getFleetVehicle(accessToken, vehicleIdOrExternalId)

/fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

Gets a specific vehicle.

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new FleetApi();
var accessToken = accessToken_example; // String | Samsara API access token.
var vehicleIdOrExternalId = vehicleIdOrExternalId_example; // String | ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.

try { 
    var result = api_instance.getFleetVehicle(accessToken, vehicleIdOrExternalId);
    print(result);
} catch (e) {
    print("Exception when calling FleetApi->getFleetVehicle: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | [default to null]
 **vehicleIdOrExternalId** | **String**| ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. | [default to null]

### Return type

[**FleetVehicleResponse**](FleetVehicleResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getOrganizationAddress**
> Address getOrganizationAddress(accessToken, addressId)

/addresses/{addressId}

Fetch an address by its id.

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new FleetApi();
var accessToken = accessToken_example; // String | Samsara API access token.
var addressId = 789; // int | ID of the address/geofence

try { 
    var result = api_instance.getOrganizationAddress(accessToken, addressId);
    print(result);
} catch (e) {
    print("Exception when calling FleetApi->getOrganizationAddress: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | [default to null]
 **addressId** | **int**| ID of the address/geofence | [default to null]

### Return type

[**Address**](Address.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getOrganizationAddresses**
> List<Address> getOrganizationAddresses(accessToken)

/addresses

Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new FleetApi();
var accessToken = accessToken_example; // String | Samsara API access token.

try { 
    var result = api_instance.getOrganizationAddresses(accessToken);
    print(result);
} catch (e) {
    print("Exception when calling FleetApi->getOrganizationAddresses: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | [default to null]

### Return type

[**List<Address>**](Address.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getOrganizationContact**
> Contact getOrganizationContact(accessToken, contactId)

/contacts/{contact_id}

Fetch a contact by its id.

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new FleetApi();
var accessToken = accessToken_example; // String | Samsara API access token.
var contactId = 789; // int | ID of the contact

try { 
    var result = api_instance.getOrganizationContact(accessToken, contactId);
    print(result);
} catch (e) {
    print("Exception when calling FleetApi->getOrganizationContact: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | [default to null]
 **contactId** | **int**| ID of the contact | [default to null]

### Return type

[**Contact**](Contact.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getVehicleHarshEvent**
> VehicleHarshEventResponse getVehicleHarshEvent(vehicleId, accessToken, timestamp)

/fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event

Fetch harsh event details for a vehicle.

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new FleetApi();
var vehicleId = 789; // int | ID of the vehicle
var accessToken = accessToken_example; // String | Samsara API access token.
var timestamp = 789; // int | Timestamp in milliseconds representing the timestamp of a harsh event.

try { 
    var result = api_instance.getVehicleHarshEvent(vehicleId, accessToken, timestamp);
    print(result);
} catch (e) {
    print("Exception when calling FleetApi->getVehicleHarshEvent: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **int**| ID of the vehicle | [default to null]
 **accessToken** | **String**| Samsara API access token. | [default to null]
 **timestamp** | **int**| Timestamp in milliseconds representing the timestamp of a harsh event. | [default to null]

### Return type

[**VehicleHarshEventResponse**](VehicleHarshEventResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getVehicleLocations**
> List<FleetVehicleLocation> getVehicleLocations(accessToken, vehicleId, startMs, endMs)

/fleet/vehicles/{vehicle_id:[0-9]+}/locations

Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new FleetApi();
var accessToken = accessToken_example; // String | Samsara API access token.
var vehicleId = 789; // int | ID of the vehicle with the associated routes.
var startMs = 789; // int | Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour)
var endMs = 789; // int | Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour)

try { 
    var result = api_instance.getVehicleLocations(accessToken, vehicleId, startMs, endMs);
    print(result);
} catch (e) {
    print("Exception when calling FleetApi->getVehicleLocations: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | [default to null]
 **vehicleId** | **int**| ID of the vehicle with the associated routes. | [default to null]
 **startMs** | **int**| Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour) | [default to null]
 **endMs** | **int**| Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour) | [default to null]

### Return type

[**List<FleetVehicleLocation>**](FleetVehicleLocation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getVehicleSafetyScore**
> VehicleSafetyScoreResponse getVehicleSafetyScore(vehicleId, accessToken, startMs, endMs)

/fleet/vehicles/{vehicleId:[0-9]+}/safety/score

Fetch the safety score for the vehicle.

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new FleetApi();
var vehicleId = 789; // int | ID of the vehicle
var accessToken = accessToken_example; // String | Samsara API access token.
var startMs = 789; // int | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
var endMs = 789; // int | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.

try { 
    var result = api_instance.getVehicleSafetyScore(vehicleId, accessToken, startMs, endMs);
    print(result);
} catch (e) {
    print("Exception when calling FleetApi->getVehicleSafetyScore: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **int**| ID of the vehicle | [default to null]
 **accessToken** | **String**| Samsara API access token. | [default to null]
 **startMs** | **int**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. | [default to null]
 **endMs** | **int**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. | [default to null]

### Return type

[**VehicleSafetyScoreResponse**](VehicleSafetyScoreResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getVehicleStats**
> InlineResponse2005 getVehicleStats(accessToken, startMs, endMs, series, tagIds, startingAfter, endingBefore, limit)

/fleet/vehicles/stats

Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time.

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new FleetApi();
var accessToken = accessToken_example; // String | Samsara API access token.
var startMs = 56; // int | Time in Unix epoch milliseconds for the start of the query.
var endMs = 56; // int | Time in Unix epoch milliseconds for the end of the query.
var series = series_example; // String | Comma-separated list of stat types. Options are engineState, auxInput1, and auxInput2. If this parameter is excluded, all 3 stat types will be returned. Example: series=engineState,auxInput2
var tagIds = tagIds_example; // String | Comma-separated list of tag ids. Example: tagIds=1,2,3
var startingAfter = startingAfter_example; // String | Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'endingBefore' parameter.
var endingBefore = endingBefore_example; // String | Pagination parameter indicating the cursor position to return results before. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'startingAfter' parameter.
var limit = 789; // int | Pagination parameter indicating the number of results to return in this request. Used in conjunction with either 'startingAfter' or 'endingBefore'.

try { 
    var result = api_instance.getVehicleStats(accessToken, startMs, endMs, series, tagIds, startingAfter, endingBefore, limit);
    print(result);
} catch (e) {
    print("Exception when calling FleetApi->getVehicleStats: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | [default to null]
 **startMs** | **int**| Time in Unix epoch milliseconds for the start of the query. | [default to null]
 **endMs** | **int**| Time in Unix epoch milliseconds for the end of the query. | [default to null]
 **series** | **String**| Comma-separated list of stat types. Options are engineState, auxInput1, and auxInput2. If this parameter is excluded, all 3 stat types will be returned. Example: series&#x3D;engineState,auxInput2 | [optional] [default to null]
 **tagIds** | **String**| Comma-separated list of tag ids. Example: tagIds&#x3D;1,2,3 | [optional] [default to null]
 **startingAfter** | **String**| Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter. | [optional] [default to null]
 **endingBefore** | **String**| Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter. | [optional] [default to null]
 **limit** | **int**| Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;. | [optional] [default to null]

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getVehiclesLocations**
> List<Object> getVehiclesLocations(accessToken, startMs, endMs)

/fleet/vehicles/locations

Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new FleetApi();
var accessToken = accessToken_example; // String | Samsara API access token.
var startMs = 56; // int | Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes)
var endMs = 56; // int | Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes)

try { 
    var result = api_instance.getVehiclesLocations(accessToken, startMs, endMs);
    print(result);
} catch (e) {
    print("Exception when calling FleetApi->getVehiclesLocations: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | [default to null]
 **startMs** | **int**| Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes) | [default to null]
 **endMs** | **int**| Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes) | [default to null]

### Return type

[**List<Object>**](Object.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **listContacts**
> List<Contact> listContacts(accessToken)

/contacts

Fetch all contacts for the organization.

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new FleetApi();
var accessToken = accessToken_example; // String | Samsara API access token.

try { 
    var result = api_instance.listContacts(accessToken);
    print(result);
} catch (e) {
    print("Exception when calling FleetApi->listContacts: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | [default to null]

### Return type

[**List<Contact>**](Contact.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **listFleet**
> InlineResponse2002 listFleet(accessToken, groupParam, startingAfter, endingBefore, limit)

/fleet/list

Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new FleetApi();
var accessToken = accessToken_example; // String | Samsara API access token.
var groupParam = new InlineObject10(); // InlineObject10 | 
var startingAfter = startingAfter_example; // String | Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'endingBefore' parameter.
var endingBefore = endingBefore_example; // String | Pagination parameter indicating the cursor position to return results before. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'startingAfter' parameter.
var limit = 789; // int | Pagination parameter indicating the number of results to return in this request. Used in conjunction with either 'startingAfter' or 'endingBefore'.

try { 
    var result = api_instance.listFleet(accessToken, groupParam, startingAfter, endingBefore, limit);
    print(result);
} catch (e) {
    print("Exception when calling FleetApi->listFleet: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | [default to null]
 **groupParam** | [**InlineObject10**](InlineObject10.md)|  | 
 **startingAfter** | **String**| Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter. | [optional] [default to null]
 **endingBefore** | **String**| Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter. | [optional] [default to null]
 **limit** | **int**| Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;. | [optional] [default to null]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **patchFleetVehicle**
> FleetVehicleResponse patchFleetVehicle(accessToken, vehicleIdOrExternalId, data)

/fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new FleetApi();
var accessToken = accessToken_example; // String | Samsara API access token.
var vehicleIdOrExternalId = vehicleIdOrExternalId_example; // String | ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.
var data = new InlineObject16(); // InlineObject16 | 

try { 
    var result = api_instance.patchFleetVehicle(accessToken, vehicleIdOrExternalId, data);
    print(result);
} catch (e) {
    print("Exception when calling FleetApi->patchFleetVehicle: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | [default to null]
 **vehicleIdOrExternalId** | **String**| ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. | [default to null]
 **data** | [**InlineObject16**](InlineObject16.md)|  | 

### Return type

[**FleetVehicleResponse**](FleetVehicleResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/merge-patch+json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **reactivateDriverById**
> Driver reactivateDriverById(accessToken, driverIdOrExternalId, reactivateDriverParam)

/fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

Reactivate the inactive driver having id.

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new FleetApi();
var accessToken = accessToken_example; // String | Samsara API access token.
var driverIdOrExternalId = driverIdOrExternalId_example; // String | ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
var reactivateDriverParam = new InlineObject4(); // InlineObject4 | 

try { 
    var result = api_instance.reactivateDriverById(accessToken, driverIdOrExternalId, reactivateDriverParam);
    print(result);
} catch (e) {
    print("Exception when calling FleetApi->reactivateDriverById: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | [default to null]
 **driverIdOrExternalId** | **String**| ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. | [default to null]
 **reactivateDriverParam** | [**InlineObject4**](InlineObject4.md)|  | 

### Return type

[**Driver**](Driver.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateDispatchRouteById**
> DispatchRoute updateDispatchRouteById(accessToken, routeId, updateDispatchRouteParams)

/fleet/dispatch/routes/{route_id:[0-9]+}/

Update a dispatch route and its associated jobs.

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new FleetApi();
var accessToken = accessToken_example; // String | Samsara API access token.
var routeId = 789; // int | ID of the dispatch route.
var updateDispatchRouteParams = new DispatchRoute(); // DispatchRoute | 

try { 
    var result = api_instance.updateDispatchRouteById(accessToken, routeId, updateDispatchRouteParams);
    print(result);
} catch (e) {
    print("Exception when calling FleetApi->updateDispatchRouteById: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | [default to null]
 **routeId** | **int**| ID of the dispatch route. | [default to null]
 **updateDispatchRouteParams** | [**DispatchRoute**](DispatchRoute.md)|  | 

### Return type

[**DispatchRoute**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateOrganizationAddress**
> updateOrganizationAddress(accessToken, addressId, address)

/addresses/{addressId}

Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new FleetApi();
var accessToken = accessToken_example; // String | Samsara API access token.
var addressId = 789; // int | ID of the address/geofence
var address = new InlineObject1(); // InlineObject1 | 

try { 
    api_instance.updateOrganizationAddress(accessToken, addressId, address);
} catch (e) {
    print("Exception when calling FleetApi->updateOrganizationAddress: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | [default to null]
 **addressId** | **int**| ID of the address/geofence | [default to null]
 **address** | [**InlineObject1**](InlineObject1.md)|  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateVehicles**
> updateVehicles(accessToken, vehicleUpdateParam)

/fleet/set_data

This method enables the mutation of metadata for vehicles in the Samsara Cloud.

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new FleetApi();
var accessToken = accessToken_example; // String | Samsara API access token.
var vehicleUpdateParam = new InlineObject14(); // InlineObject14 | 

try { 
    api_instance.updateVehicles(accessToken, vehicleUpdateParam);
} catch (e) {
    print("Exception when calling FleetApi->updateVehicles: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | [default to null]
 **vehicleUpdateParam** | [**InlineObject14**](InlineObject14.md)|  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


# SamsaraApi.FleetApi

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


<a name="addFleetAddress"></a>
# **addFleetAddress**
> addFleetAddress(accessToken, addressParam)

/fleet/add_address

This method adds an address book entry to the specified group.

### Example
```javascript
import SamsaraApi from 'samsara_api';

let apiInstance = new SamsaraApi.FleetApi();
let accessToken = "accessToken_example"; // String | Samsara API access token.
let addressParam = new SamsaraApi.InlineObject2(); // InlineObject2 | 
apiInstance.addFleetAddress(accessToken, addressParam, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | 
 **addressParam** | [**InlineObject2**](InlineObject2.md)|  | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addOrganizationAddresses"></a>
# **addOrganizationAddresses**
> [Address] addOrganizationAddresses(accessToken, addresses)

/addresses

Add one or more addresses to the organization

### Example
```javascript
import SamsaraApi from 'samsara_api';

let apiInstance = new SamsaraApi.FleetApi();
let accessToken = "accessToken_example"; // String | Samsara API access token.
let addresses = new SamsaraApi.InlineObject(); // InlineObject | 
apiInstance.addOrganizationAddresses(accessToken, addresses, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | 
 **addresses** | [**InlineObject**](InlineObject.md)|  | 

### Return type

[**[Address]**](Address.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createDispatchRoute"></a>
# **createDispatchRoute**
> DispatchRoute createDispatchRoute(accessToken, createDispatchRouteParams)

/fleet/dispatch/routes

Create a new dispatch route.

### Example
```javascript
import SamsaraApi from 'samsara_api';

let apiInstance = new SamsaraApi.FleetApi();
let accessToken = "accessToken_example"; // String | Samsara API access token.
let createDispatchRouteParams = new SamsaraApi.DispatchRouteCreate(); // DispatchRouteCreate | 
apiInstance.createDispatchRoute(accessToken, createDispatchRouteParams, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | 
 **createDispatchRouteParams** | [**DispatchRouteCreate**](DispatchRouteCreate.md)|  | 

### Return type

[**DispatchRoute**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createDriver"></a>
# **createDriver**
> Driver createDriver(accessToken, createDriverParam)

/fleet/drivers/create

Create a new driver.

### Example
```javascript
import SamsaraApi from 'samsara_api';

let apiInstance = new SamsaraApi.FleetApi();
let accessToken = "accessToken_example"; // String | Samsara API access token.
let createDriverParam = new SamsaraApi.DriverForCreate(); // DriverForCreate | Driver creation body
apiInstance.createDriver(accessToken, createDriverParam, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | 
 **createDriverParam** | [**DriverForCreate**](DriverForCreate.md)| Driver creation body | 

### Return type

[**Driver**](Driver.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createDriverDispatchRoute"></a>
# **createDriverDispatchRoute**
> DispatchRoute createDriverDispatchRoute(accessToken, driverId, createDispatchRouteParams)

/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes

Create a new dispatch route for the driver with driver_id.

### Example
```javascript
import SamsaraApi from 'samsara_api';

let apiInstance = new SamsaraApi.FleetApi();
let accessToken = "accessToken_example"; // String | Samsara API access token.
let driverId = 789; // Number | ID of the driver with the associated routes.
let createDispatchRouteParams = new SamsaraApi.DispatchRouteCreate(); // DispatchRouteCreate | 
apiInstance.createDriverDispatchRoute(accessToken, driverId, createDispatchRouteParams, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | 
 **driverId** | **Number**| ID of the driver with the associated routes. | 
 **createDispatchRouteParams** | [**DispatchRouteCreate**](DispatchRouteCreate.md)|  | 

### Return type

[**DispatchRoute**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createDriverDocument"></a>
# **createDriverDocument**
> Document createDriverDocument(accessToken, driverId, createDocumentParams)

/fleet/drivers/{driver_id:[0-9]+}/documents

Create a driver document for the given driver.

### Example
```javascript
import SamsaraApi from 'samsara_api';

let apiInstance = new SamsaraApi.FleetApi();
let accessToken = "accessToken_example"; // String | Samsara API access token.
let driverId = 789; // Number | ID of the driver for whom the document is created.
let createDocumentParams = new SamsaraApi.DocumentCreate(); // DocumentCreate | To create a document for a given document type, the document type's uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field's valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_.
apiInstance.createDriverDocument(accessToken, driverId, createDocumentParams, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | 
 **driverId** | **Number**| ID of the driver for whom the document is created. | 
 **createDocumentParams** | [**DocumentCreate**](DocumentCreate.md)| To create a document for a given document type, the document type&#39;s uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field&#39;s valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_. | 

### Return type

[**Document**](Document.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createDvir"></a>
# **createDvir**
> DvirBase createDvir(accessToken, createDvirParam)

/fleet/maintenance/dvirs

Create a new dvir, marking a vehicle or trailer safe or unsafe.

### Example
```javascript
import SamsaraApi from 'samsara_api';

let apiInstance = new SamsaraApi.FleetApi();
let accessToken = "accessToken_example"; // String | Samsara API access token.
let createDvirParam = new SamsaraApi.InlineObject12(); // InlineObject12 | 
apiInstance.createDvir(accessToken, createDvirParam, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | 
 **createDvirParam** | [**InlineObject12**](InlineObject12.md)|  | 

### Return type

[**DvirBase**](DvirBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createVehicleDispatchRoute"></a>
# **createVehicleDispatchRoute**
> DispatchRoute createVehicleDispatchRoute(accessToken, vehicleId, createDispatchRouteParams)

/fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes

Create a new dispatch route for the vehicle with vehicle_id.

### Example
```javascript
import SamsaraApi from 'samsara_api';

let apiInstance = new SamsaraApi.FleetApi();
let accessToken = "accessToken_example"; // String | Samsara API access token.
let vehicleId = 789; // Number | ID of the vehicle with the associated routes.
let createDispatchRouteParams = new SamsaraApi.DispatchRouteCreate(); // DispatchRouteCreate | 
apiInstance.createVehicleDispatchRoute(accessToken, vehicleId, createDispatchRouteParams, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | 
 **vehicleId** | **Number**| ID of the vehicle with the associated routes. | 
 **createDispatchRouteParams** | [**DispatchRouteCreate**](DispatchRouteCreate.md)|  | 

### Return type

[**DispatchRoute**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deactivateDriver"></a>
# **deactivateDriver**
> deactivateDriver(accessToken, driverIdOrExternalId)

/fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

Deactivate a driver with the given id.

### Example
```javascript
import SamsaraApi from 'samsara_api';

let apiInstance = new SamsaraApi.FleetApi();
let accessToken = "accessToken_example"; // String | Samsara API access token.
let driverIdOrExternalId = "driverIdOrExternalId_example"; // String | ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
apiInstance.deactivateDriver(accessToken, driverIdOrExternalId, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | 
 **driverIdOrExternalId** | **String**| ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteDispatchRouteById"></a>
# **deleteDispatchRouteById**
> deleteDispatchRouteById(accessToken, routeId)

/fleet/dispatch/routes/{route_id:[0-9]+}/

Delete a dispatch route and its associated jobs.

### Example
```javascript
import SamsaraApi from 'samsara_api';

let apiInstance = new SamsaraApi.FleetApi();
let accessToken = "accessToken_example"; // String | Samsara API access token.
let routeId = 789; // Number | ID of the dispatch route.
apiInstance.deleteDispatchRouteById(accessToken, routeId, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | 
 **routeId** | **Number**| ID of the dispatch route. | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteOrganizationAddress"></a>
# **deleteOrganizationAddress**
> deleteOrganizationAddress(accessToken, addressId)

/addresses/{addressId}

Delete an address.

### Example
```javascript
import SamsaraApi from 'samsara_api';

let apiInstance = new SamsaraApi.FleetApi();
let accessToken = "accessToken_example"; // String | Samsara API access token.
let addressId = 789; // Number | ID of the address/geofence
apiInstance.deleteOrganizationAddress(accessToken, addressId, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | 
 **addressId** | **Number**| ID of the address/geofence | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="fetchAllDispatchRoutes"></a>
# **fetchAllDispatchRoutes**
> [DispatchRoute] fetchAllDispatchRoutes(accessToken, opts)

/fleet/dispatch/routes

Fetch all of the dispatch routes for the group.

### Example
```javascript
import SamsaraApi from 'samsara_api';

let apiInstance = new SamsaraApi.FleetApi();
let accessToken = "accessToken_example"; // String | Samsara API access token.
let opts = {
  'groupId': 789, // Number | Optional group ID if the organization has multiple groups (uncommon).
  'endTime': 789, // Number | Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
  'duration': 789 // Number | Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
};
apiInstance.fetchAllDispatchRoutes(accessToken, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | 
 **groupId** | **Number**| Optional group ID if the organization has multiple groups (uncommon). | [optional] 
 **endTime** | **Number**| Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. | [optional] 
 **duration** | **Number**| Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. | [optional] 

### Return type

[**[DispatchRoute]**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="fetchAllRouteJobUpdates"></a>
# **fetchAllRouteJobUpdates**
> AllRouteJobUpdates fetchAllRouteJobUpdates(accessToken, opts)

/fleet/dispatch/routes/job_updates

Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID

### Example
```javascript
import SamsaraApi from 'samsara_api';

let apiInstance = new SamsaraApi.FleetApi();
let accessToken = "accessToken_example"; // String | Samsara API access token.
let opts = {
  'groupId': 789, // Number | Optional group ID if the organization has multiple groups (uncommon).
  'sequenceId': "sequenceId_example", // String | Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours.
  'include': "include_example" // String | Optionally set include=route to include route object in response payload.
};
apiInstance.fetchAllRouteJobUpdates(accessToken, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | 
 **groupId** | **Number**| Optional group ID if the organization has multiple groups (uncommon). | [optional] 
 **sequenceId** | **String**| Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours. | [optional] 
 **include** | **String**| Optionally set include&#x3D;route to include route object in response payload. | [optional] 

### Return type

[**AllRouteJobUpdates**](AllRouteJobUpdates.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAllAssetCurrentLocations"></a>
# **getAllAssetCurrentLocations**
> InlineResponse2001 getAllAssetCurrentLocations(accessToken, opts)

/fleet/assets/locations

Fetch current locations of all assets for the group.

### Example
```javascript
import SamsaraApi from 'samsara_api';

let apiInstance = new SamsaraApi.FleetApi();
let accessToken = "accessToken_example"; // String | Samsara API access token.
let opts = {
  'groupId': 789 // Number | Optional group ID if the organization has multiple groups (uncommon).
};
apiInstance.getAllAssetCurrentLocations(accessToken, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | 
 **groupId** | **Number**| Optional group ID if the organization has multiple groups (uncommon). | [optional] 

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAllAssets"></a>
# **getAllAssets**
> InlineResponse200 getAllAssets(accessToken, opts)

/fleet/assets

Fetch all of the assets for the group.

### Example
```javascript
import SamsaraApi from 'samsara_api';

let apiInstance = new SamsaraApi.FleetApi();
let accessToken = "accessToken_example"; // String | Samsara API access token.
let opts = {
  'groupId': 789 // Number | Optional group ID if the organization has multiple groups (uncommon).
};
apiInstance.getAllAssets(accessToken, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | 
 **groupId** | **Number**| Optional group ID if the organization has multiple groups (uncommon). | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAllDeactivatedDrivers"></a>
# **getAllDeactivatedDrivers**
> [Driver] getAllDeactivatedDrivers(accessToken, opts)

/fleet/drivers/inactive

Fetch all deactivated drivers for the group.

### Example
```javascript
import SamsaraApi from 'samsara_api';

let apiInstance = new SamsaraApi.FleetApi();
let accessToken = "accessToken_example"; // String | Samsara API access token.
let opts = {
  'groupId': 789 // Number | Optional group ID if the organization has multiple groups (uncommon).
};
apiInstance.getAllDeactivatedDrivers(accessToken, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | 
 **groupId** | **Number**| Optional group ID if the organization has multiple groups (uncommon). | [optional] 

### Return type

[**[Driver]**](Driver.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAssetLocation"></a>
# **getAssetLocation**
> [Object] getAssetLocation(accessToken, assetId, startMs, endMs)

/fleet/assets/{assetId:[0-9]+}/locations

Fetch the historical locations for the asset.

### Example
```javascript
import SamsaraApi from 'samsara_api';

let apiInstance = new SamsaraApi.FleetApi();
let accessToken = "accessToken_example"; // String | Samsara API access token.
let assetId = 789; // Number | ID of the asset
let startMs = 789; // Number | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
let endMs = 789; // Number | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
apiInstance.getAssetLocation(accessToken, assetId, startMs, endMs, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | 
 **assetId** | **Number**| ID of the asset | 
 **startMs** | **Number**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. | 
 **endMs** | **Number**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. | 

### Return type

**[Object]**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAssetReefer"></a>
# **getAssetReefer**
> AssetReeferResponse getAssetReefer(accessToken, assetId, startMs, endMs)

/fleet/assets/{assetId:[0-9]+}/reefer

Fetch the reefer-specific stats of an asset.

### Example
```javascript
import SamsaraApi from 'samsara_api';

let apiInstance = new SamsaraApi.FleetApi();
let accessToken = "accessToken_example"; // String | Samsara API access token.
let assetId = 789; // Number | ID of the asset
let startMs = 789; // Number | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
let endMs = 789; // Number | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
apiInstance.getAssetReefer(accessToken, assetId, startMs, endMs, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | 
 **assetId** | **Number**| ID of the asset | 
 **startMs** | **Number**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. | 
 **endMs** | **Number**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. | 

### Return type

[**AssetReeferResponse**](AssetReeferResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDeactivatedDriverById"></a>
# **getDeactivatedDriverById**
> Driver getDeactivatedDriverById(accessToken, driverIdOrExternalId)

/fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

Fetch deactivated driver by id.

### Example
```javascript
import SamsaraApi from 'samsara_api';

let apiInstance = new SamsaraApi.FleetApi();
let accessToken = "accessToken_example"; // String | Samsara API access token.
let driverIdOrExternalId = "driverIdOrExternalId_example"; // String | ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
apiInstance.getDeactivatedDriverById(accessToken, driverIdOrExternalId, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | 
 **driverIdOrExternalId** | **String**| ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. | 

### Return type

[**Driver**](Driver.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDispatchRouteById"></a>
# **getDispatchRouteById**
> DispatchRoute getDispatchRouteById(accessToken, routeId)

/fleet/dispatch/routes/{route_id:[0-9]+}

Fetch a dispatch route by id.

### Example
```javascript
import SamsaraApi from 'samsara_api';

let apiInstance = new SamsaraApi.FleetApi();
let accessToken = "accessToken_example"; // String | Samsara API access token.
let routeId = 789; // Number | ID of the dispatch route.
apiInstance.getDispatchRouteById(accessToken, routeId, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | 
 **routeId** | **Number**| ID of the dispatch route. | 

### Return type

[**DispatchRoute**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDispatchRouteHistory"></a>
# **getDispatchRouteHistory**
> DispatchRouteHistory getDispatchRouteHistory(accessToken, routeId, opts)

/fleet/dispatch/routes/{route_id:[0-9]+}/history

Fetch the history of a dispatch route.

### Example
```javascript
import SamsaraApi from 'samsara_api';

let apiInstance = new SamsaraApi.FleetApi();
let accessToken = "accessToken_example"; // String | Samsara API access token.
let routeId = 789; // Number | ID of the route with history.
let opts = {
  'startTime': 789, // Number | Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0.
  'endTime': 789 // Number | Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs.
};
apiInstance.getDispatchRouteHistory(accessToken, routeId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | 
 **routeId** | **Number**| ID of the route with history. | 
 **startTime** | **Number**| Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0. | [optional] 
 **endTime** | **Number**| Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs. | [optional] 

### Return type

[**DispatchRouteHistory**](DispatchRouteHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDispatchRoutesByDriverId"></a>
# **getDispatchRoutesByDriverId**
> [DispatchRoute] getDispatchRoutesByDriverId(accessToken, driverId, opts)

/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes

Fetch all of the dispatch routes for a given driver.

### Example
```javascript
import SamsaraApi from 'samsara_api';

let apiInstance = new SamsaraApi.FleetApi();
let accessToken = "accessToken_example"; // String | Samsara API access token.
let driverId = 789; // Number | ID of the driver with the associated routes.
let opts = {
  'endTime': 789, // Number | Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
  'duration': 789 // Number | Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
};
apiInstance.getDispatchRoutesByDriverId(accessToken, driverId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | 
 **driverId** | **Number**| ID of the driver with the associated routes. | 
 **endTime** | **Number**| Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. | [optional] 
 **duration** | **Number**| Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. | [optional] 

### Return type

[**[DispatchRoute]**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDispatchRoutesByVehicleId"></a>
# **getDispatchRoutesByVehicleId**
> [DispatchRoute] getDispatchRoutesByVehicleId(accessToken, vehicleId, opts)

/fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes

Fetch all of the dispatch routes for a given vehicle.

### Example
```javascript
import SamsaraApi from 'samsara_api';

let apiInstance = new SamsaraApi.FleetApi();
let accessToken = "accessToken_example"; // String | Samsara API access token.
let vehicleId = 789; // Number | ID of the vehicle with the associated routes.
let opts = {
  'endTime': 789, // Number | Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
  'duration': 789 // Number | Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
};
apiInstance.getDispatchRoutesByVehicleId(accessToken, vehicleId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | 
 **vehicleId** | **Number**| ID of the vehicle with the associated routes. | 
 **endTime** | **Number**| Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. | [optional] 
 **duration** | **Number**| Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. | [optional] 

### Return type

[**[DispatchRoute]**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDriverById"></a>
# **getDriverById**
> Driver getDriverById(accessToken, driverIdOrExternalId)

/fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

Fetch driver by id.

### Example
```javascript
import SamsaraApi from 'samsara_api';

let apiInstance = new SamsaraApi.FleetApi();
let accessToken = "accessToken_example"; // String | Samsara API access token.
let driverIdOrExternalId = "driverIdOrExternalId_example"; // String | ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
apiInstance.getDriverById(accessToken, driverIdOrExternalId, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | 
 **driverIdOrExternalId** | **String**| ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. | 

### Return type

[**Driver**](Driver.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDriverDocumentTypesByOrgId"></a>
# **getDriverDocumentTypesByOrgId**
> [DocumentType] getDriverDocumentTypesByOrgId()

/fleet/drivers/document_types

Fetch all of the document types.

### Example
```javascript
import SamsaraApi from 'samsara_api';

let apiInstance = new SamsaraApi.FleetApi();
apiInstance.getDriverDocumentTypesByOrgId((error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**[DocumentType]**](DocumentType.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDriverDocumentsByOrgId"></a>
# **getDriverDocumentsByOrgId**
> [Document] getDriverDocumentsByOrgId(accessToken, opts)

/fleet/drivers/documents

Fetch all of the documents.

### Example
```javascript
import SamsaraApi from 'samsara_api';

let apiInstance = new SamsaraApi.FleetApi();
let accessToken = "accessToken_example"; // String | Samsara API access token.
let opts = {
  'endMs': 789, // Number | Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now.
  'durationMs': 789 // Number | Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours.
};
apiInstance.getDriverDocumentsByOrgId(accessToken, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | 
 **endMs** | **Number**| Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now. | [optional] 
 **durationMs** | **Number**| Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours. | [optional] 

### Return type

[**[Document]**](Document.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDriverSafetyScore"></a>
# **getDriverSafetyScore**
> DriverSafetyScoreResponse getDriverSafetyScore(driverId, accessToken, startMs, endMs)

/fleet/drivers/{driverId:[0-9]+}/safety/score

Fetch the safety score for the driver.

### Example
```javascript
import SamsaraApi from 'samsara_api';

let apiInstance = new SamsaraApi.FleetApi();
let driverId = 789; // Number | ID of the driver
let accessToken = "accessToken_example"; // String | Samsara API access token.
let startMs = 789; // Number | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
let endMs = 789; // Number | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
apiInstance.getDriverSafetyScore(driverId, accessToken, startMs, endMs, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **driverId** | **Number**| ID of the driver | 
 **accessToken** | **String**| Samsara API access token. | 
 **startMs** | **Number**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. | 
 **endMs** | **Number**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. | 

### Return type

[**DriverSafetyScoreResponse**](DriverSafetyScoreResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDvirs"></a>
# **getDvirs**
> DvirListResponse getDvirs(accessToken, endMs, durationMs, opts)

/fleet/maintenance/dvirs

Get DVIRs for the org within provided time constraints

### Example
```javascript
import SamsaraApi from 'samsara_api';

let apiInstance = new SamsaraApi.FleetApi();
let accessToken = "accessToken_example"; // String | Samsara API access token.
let endMs = 56; // Number | time in millis until the last dvir log.
let durationMs = 56; // Number | time in millis which corresponds to the duration before the end_ms.
let opts = {
  'groupId': 56 // Number | Group ID to query.
};
apiInstance.getDvirs(accessToken, endMs, durationMs, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | 
 **endMs** | **Number**| time in millis until the last dvir log. | 
 **durationMs** | **Number**| time in millis which corresponds to the duration before the end_ms. | 
 **groupId** | **Number**| Group ID to query. | [optional] 

### Return type

[**DvirListResponse**](DvirListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFleetDrivers"></a>
# **getFleetDrivers**
> DriversResponse getFleetDrivers(accessToken, groupDriversParam)

/fleet/drivers

Get all the drivers for the specified group.

### Example
```javascript
import SamsaraApi from 'samsara_api';

let apiInstance = new SamsaraApi.FleetApi();
let accessToken = "accessToken_example"; // String | Samsara API access token.
let groupDriversParam = new SamsaraApi.InlineObject3(); // InlineObject3 | 
apiInstance.getFleetDrivers(accessToken, groupDriversParam, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | 
 **groupDriversParam** | [**InlineObject3**](InlineObject3.md)|  | 

### Return type

[**DriversResponse**](DriversResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getFleetDriversHosDailyLogs"></a>
# **getFleetDriversHosDailyLogs**
> DriverDailyLogResponse getFleetDriversHosDailyLogs(accessToken, driverId, hosLogsParam)

/fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs

Get summarized daily HOS charts for a specified driver.

### Example
```javascript
import SamsaraApi from 'samsara_api';

let apiInstance = new SamsaraApi.FleetApi();
let accessToken = "accessToken_example"; // String | Samsara API access token.
let driverId = 789; // Number | ID of the driver with HOS logs.
let hosLogsParam = new SamsaraApi.InlineObject6(); // InlineObject6 | 
apiInstance.getFleetDriversHosDailyLogs(accessToken, driverId, hosLogsParam, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | 
 **driverId** | **Number**| ID of the driver with HOS logs. | 
 **hosLogsParam** | [**InlineObject6**](InlineObject6.md)|  | 

### Return type

[**DriverDailyLogResponse**](DriverDailyLogResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getFleetDriversSummary"></a>
# **getFleetDriversSummary**
> DriversSummaryResponse getFleetDriversSummary(accessToken, driversSummaryParam, opts)

/fleet/drivers/summary

Get the distance and time each driver in an organization has driven in a given time period.

### Example
```javascript
import SamsaraApi from 'samsara_api';

let apiInstance = new SamsaraApi.FleetApi();
let accessToken = "accessToken_example"; // String | Samsara API access token.
let driversSummaryParam = new SamsaraApi.InlineObject5(); // InlineObject5 | 
let opts = {
  'snapToDayBounds': true // Boolean | Snap query result to HOS day boundaries.
};
apiInstance.getFleetDriversSummary(accessToken, driversSummaryParam, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | 
 **driversSummaryParam** | [**InlineObject5**](InlineObject5.md)|  | 
 **snapToDayBounds** | **Boolean**| Snap query result to HOS day boundaries. | [optional] 

### Return type

[**DriversSummaryResponse**](DriversSummaryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getFleetHosAuthenticationLogs"></a>
# **getFleetHosAuthenticationLogs**
> HosAuthenticationLogsResponse getFleetHosAuthenticationLogs(accessToken, hosAuthenticationLogsParam)

/fleet/hos_authentication_logs

Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.

### Example
```javascript
import SamsaraApi from 'samsara_api';

let apiInstance = new SamsaraApi.FleetApi();
let accessToken = "accessToken_example"; // String | Samsara API access token.
let hosAuthenticationLogsParam = new SamsaraApi.InlineObject7(); // InlineObject7 | 
apiInstance.getFleetHosAuthenticationLogs(accessToken, hosAuthenticationLogsParam, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | 
 **hosAuthenticationLogsParam** | [**InlineObject7**](InlineObject7.md)|  | 

### Return type

[**HosAuthenticationLogsResponse**](HosAuthenticationLogsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getFleetHosLogs"></a>
# **getFleetHosLogs**
> HosLogsResponse getFleetHosLogs(accessToken, hosLogsParam)

/fleet/hos_logs

Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.

### Example
```javascript
import SamsaraApi from 'samsara_api';

let apiInstance = new SamsaraApi.FleetApi();
let accessToken = "accessToken_example"; // String | Samsara API access token.
let hosLogsParam = new SamsaraApi.InlineObject8(); // InlineObject8 | 
apiInstance.getFleetHosLogs(accessToken, hosLogsParam, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | 
 **hosLogsParam** | [**InlineObject8**](InlineObject8.md)|  | 

### Return type

[**HosLogsResponse**](HosLogsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getFleetHosLogsSummary"></a>
# **getFleetHosLogsSummary**
> HosLogsSummaryResponse getFleetHosLogsSummary(accessToken, hosLogsParam)

/fleet/hos_logs_summary

Get the current HOS status for all drivers in the group.

### Example
```javascript
import SamsaraApi from 'samsara_api';

let apiInstance = new SamsaraApi.FleetApi();
let accessToken = "accessToken_example"; // String | Samsara API access token.
let hosLogsParam = new SamsaraApi.InlineObject9(); // InlineObject9 | 
apiInstance.getFleetHosLogsSummary(accessToken, hosLogsParam, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | 
 **hosLogsParam** | [**InlineObject9**](InlineObject9.md)|  | 

### Return type

[**HosLogsSummaryResponse**](HosLogsSummaryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getFleetLocations"></a>
# **getFleetLocations**
> InlineResponse2003 getFleetLocations(accessToken, groupParam)

/fleet/locations

Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.

### Example
```javascript
import SamsaraApi from 'samsara_api';

let apiInstance = new SamsaraApi.FleetApi();
let accessToken = "accessToken_example"; // String | Samsara API access token.
let groupParam = new SamsaraApi.InlineObject11(); // InlineObject11 | 
apiInstance.getFleetLocations(accessToken, groupParam, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | 
 **groupParam** | [**InlineObject11**](InlineObject11.md)|  | 

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getFleetMaintenanceList"></a>
# **getFleetMaintenanceList**
> InlineResponse2004 getFleetMaintenanceList(accessToken, groupParam)

/fleet/maintenance/list

Get list of the vehicles with any engine faults or check light data.

### Example
```javascript
import SamsaraApi from 'samsara_api';

let apiInstance = new SamsaraApi.FleetApi();
let accessToken = "accessToken_example"; // String | Samsara API access token.
let groupParam = new SamsaraApi.InlineObject13(); // InlineObject13 | 
apiInstance.getFleetMaintenanceList(accessToken, groupParam, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | 
 **groupParam** | [**InlineObject13**](InlineObject13.md)|  | 

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getFleetTrips"></a>
# **getFleetTrips**
> TripResponse getFleetTrips(accessToken, tripsParam)

/fleet/trips

Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.

### Example
```javascript
import SamsaraApi from 'samsara_api';

let apiInstance = new SamsaraApi.FleetApi();
let accessToken = "accessToken_example"; // String | Samsara API access token.
let tripsParam = new SamsaraApi.InlineObject15(); // InlineObject15 | 
apiInstance.getFleetTrips(accessToken, tripsParam, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | 
 **tripsParam** | [**InlineObject15**](InlineObject15.md)|  | 

### Return type

[**TripResponse**](TripResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getFleetVehicle"></a>
# **getFleetVehicle**
> FleetVehicleResponse getFleetVehicle(accessToken, vehicleIdOrExternalId)

/fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

Gets a specific vehicle.

### Example
```javascript
import SamsaraApi from 'samsara_api';

let apiInstance = new SamsaraApi.FleetApi();
let accessToken = "accessToken_example"; // String | Samsara API access token.
let vehicleIdOrExternalId = "vehicleIdOrExternalId_example"; // String | ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.
apiInstance.getFleetVehicle(accessToken, vehicleIdOrExternalId, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | 
 **vehicleIdOrExternalId** | **String**| ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. | 

### Return type

[**FleetVehicleResponse**](FleetVehicleResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOrganizationAddress"></a>
# **getOrganizationAddress**
> Address getOrganizationAddress(accessToken, addressId)

/addresses/{addressId}

Fetch an address by its id.

### Example
```javascript
import SamsaraApi from 'samsara_api';

let apiInstance = new SamsaraApi.FleetApi();
let accessToken = "accessToken_example"; // String | Samsara API access token.
let addressId = 789; // Number | ID of the address/geofence
apiInstance.getOrganizationAddress(accessToken, addressId, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | 
 **addressId** | **Number**| ID of the address/geofence | 

### Return type

[**Address**](Address.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOrganizationAddresses"></a>
# **getOrganizationAddresses**
> [Address] getOrganizationAddresses(accessToken)

/addresses

Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.

### Example
```javascript
import SamsaraApi from 'samsara_api';

let apiInstance = new SamsaraApi.FleetApi();
let accessToken = "accessToken_example"; // String | Samsara API access token.
apiInstance.getOrganizationAddresses(accessToken, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | 

### Return type

[**[Address]**](Address.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOrganizationContact"></a>
# **getOrganizationContact**
> Contact getOrganizationContact(accessToken, contactId)

/contacts/{contact_id}

Fetch a contact by its id.

### Example
```javascript
import SamsaraApi from 'samsara_api';

let apiInstance = new SamsaraApi.FleetApi();
let accessToken = "accessToken_example"; // String | Samsara API access token.
let contactId = 789; // Number | ID of the contact
apiInstance.getOrganizationContact(accessToken, contactId, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | 
 **contactId** | **Number**| ID of the contact | 

### Return type

[**Contact**](Contact.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVehicleHarshEvent"></a>
# **getVehicleHarshEvent**
> VehicleHarshEventResponse getVehicleHarshEvent(vehicleId, accessToken, timestamp)

/fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event

Fetch harsh event details for a vehicle.

### Example
```javascript
import SamsaraApi from 'samsara_api';

let apiInstance = new SamsaraApi.FleetApi();
let vehicleId = 789; // Number | ID of the vehicle
let accessToken = "accessToken_example"; // String | Samsara API access token.
let timestamp = 789; // Number | Timestamp in milliseconds representing the timestamp of a harsh event.
apiInstance.getVehicleHarshEvent(vehicleId, accessToken, timestamp, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **Number**| ID of the vehicle | 
 **accessToken** | **String**| Samsara API access token. | 
 **timestamp** | **Number**| Timestamp in milliseconds representing the timestamp of a harsh event. | 

### Return type

[**VehicleHarshEventResponse**](VehicleHarshEventResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVehicleLocations"></a>
# **getVehicleLocations**
> [FleetVehicleLocation] getVehicleLocations(accessToken, vehicleId, startMs, endMs)

/fleet/vehicles/{vehicle_id:[0-9]+}/locations

Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.

### Example
```javascript
import SamsaraApi from 'samsara_api';

let apiInstance = new SamsaraApi.FleetApi();
let accessToken = "accessToken_example"; // String | Samsara API access token.
let vehicleId = 789; // Number | ID of the vehicle with the associated routes.
let startMs = 789; // Number | Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour)
let endMs = 789; // Number | Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour)
apiInstance.getVehicleLocations(accessToken, vehicleId, startMs, endMs, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | 
 **vehicleId** | **Number**| ID of the vehicle with the associated routes. | 
 **startMs** | **Number**| Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour) | 
 **endMs** | **Number**| Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour) | 

### Return type

[**[FleetVehicleLocation]**](FleetVehicleLocation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVehicleSafetyScore"></a>
# **getVehicleSafetyScore**
> VehicleSafetyScoreResponse getVehicleSafetyScore(vehicleId, accessToken, startMs, endMs)

/fleet/vehicles/{vehicleId:[0-9]+}/safety/score

Fetch the safety score for the vehicle.

### Example
```javascript
import SamsaraApi from 'samsara_api';

let apiInstance = new SamsaraApi.FleetApi();
let vehicleId = 789; // Number | ID of the vehicle
let accessToken = "accessToken_example"; // String | Samsara API access token.
let startMs = 789; // Number | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
let endMs = 789; // Number | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
apiInstance.getVehicleSafetyScore(vehicleId, accessToken, startMs, endMs, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **Number**| ID of the vehicle | 
 **accessToken** | **String**| Samsara API access token. | 
 **startMs** | **Number**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. | 
 **endMs** | **Number**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. | 

### Return type

[**VehicleSafetyScoreResponse**](VehicleSafetyScoreResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVehicleStats"></a>
# **getVehicleStats**
> InlineResponse2005 getVehicleStats(accessToken, startMs, endMs, opts)

/fleet/vehicles/stats

Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time.

### Example
```javascript
import SamsaraApi from 'samsara_api';

let apiInstance = new SamsaraApi.FleetApi();
let accessToken = "accessToken_example"; // String | Samsara API access token.
let startMs = 56; // Number | Time in Unix epoch milliseconds for the start of the query.
let endMs = 56; // Number | Time in Unix epoch milliseconds for the end of the query.
let opts = {
  'series': "series_example", // String | Comma-separated list of stat types. Options are engineState, auxInput1, and auxInput2. If this parameter is excluded, all 3 stat types will be returned. Example: series=engineState,auxInput2
  'tagIds': "tagIds_example", // String | Comma-separated list of tag ids. Example: tagIds=1,2,3
  'startingAfter': "startingAfter_example", // String | Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'endingBefore' parameter.
  'endingBefore': "endingBefore_example", // String | Pagination parameter indicating the cursor position to return results before. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'startingAfter' parameter.
  'limit': 789 // Number | Pagination parameter indicating the number of results to return in this request. Used in conjunction with either 'startingAfter' or 'endingBefore'.
};
apiInstance.getVehicleStats(accessToken, startMs, endMs, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | 
 **startMs** | **Number**| Time in Unix epoch milliseconds for the start of the query. | 
 **endMs** | **Number**| Time in Unix epoch milliseconds for the end of the query. | 
 **series** | **String**| Comma-separated list of stat types. Options are engineState, auxInput1, and auxInput2. If this parameter is excluded, all 3 stat types will be returned. Example: series&#x3D;engineState,auxInput2 | [optional] 
 **tagIds** | **String**| Comma-separated list of tag ids. Example: tagIds&#x3D;1,2,3 | [optional] 
 **startingAfter** | **String**| Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter. | [optional] 
 **endingBefore** | **String**| Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter. | [optional] 
 **limit** | **Number**| Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;. | [optional] 

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVehiclesLocations"></a>
# **getVehiclesLocations**
> [Object] getVehiclesLocations(accessToken, startMs, endMs)

/fleet/vehicles/locations

Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.

### Example
```javascript
import SamsaraApi from 'samsara_api';

let apiInstance = new SamsaraApi.FleetApi();
let accessToken = "accessToken_example"; // String | Samsara API access token.
let startMs = 56; // Number | Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes)
let endMs = 56; // Number | Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes)
apiInstance.getVehiclesLocations(accessToken, startMs, endMs, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | 
 **startMs** | **Number**| Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes) | 
 **endMs** | **Number**| Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes) | 

### Return type

**[Object]**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listContacts"></a>
# **listContacts**
> [Contact] listContacts(accessToken)

/contacts

Fetch all contacts for the organization.

### Example
```javascript
import SamsaraApi from 'samsara_api';

let apiInstance = new SamsaraApi.FleetApi();
let accessToken = "accessToken_example"; // String | Samsara API access token.
apiInstance.listContacts(accessToken, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | 

### Return type

[**[Contact]**](Contact.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listFleet"></a>
# **listFleet**
> InlineResponse2002 listFleet(accessToken, groupParam, opts)

/fleet/list

Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.

### Example
```javascript
import SamsaraApi from 'samsara_api';

let apiInstance = new SamsaraApi.FleetApi();
let accessToken = "accessToken_example"; // String | Samsara API access token.
let groupParam = new SamsaraApi.InlineObject10(); // InlineObject10 | 
let opts = {
  'startingAfter': "startingAfter_example", // String | Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'endingBefore' parameter.
  'endingBefore': "endingBefore_example", // String | Pagination parameter indicating the cursor position to return results before. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'startingAfter' parameter.
  'limit': 789 // Number | Pagination parameter indicating the number of results to return in this request. Used in conjunction with either 'startingAfter' or 'endingBefore'.
};
apiInstance.listFleet(accessToken, groupParam, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | 
 **groupParam** | [**InlineObject10**](InlineObject10.md)|  | 
 **startingAfter** | **String**| Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter. | [optional] 
 **endingBefore** | **String**| Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter. | [optional] 
 **limit** | **Number**| Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;. | [optional] 

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="patchFleetVehicle"></a>
# **patchFleetVehicle**
> FleetVehicleResponse patchFleetVehicle(accessToken, vehicleIdOrExternalId, data)

/fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.

### Example
```javascript
import SamsaraApi from 'samsara_api';

let apiInstance = new SamsaraApi.FleetApi();
let accessToken = "accessToken_example"; // String | Samsara API access token.
let vehicleIdOrExternalId = "vehicleIdOrExternalId_example"; // String | ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.
let data = new SamsaraApi.InlineObject16(); // InlineObject16 | 
apiInstance.patchFleetVehicle(accessToken, vehicleIdOrExternalId, data, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | 
 **vehicleIdOrExternalId** | **String**| ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. | 
 **data** | [**InlineObject16**](InlineObject16.md)|  | 

### Return type

[**FleetVehicleResponse**](FleetVehicleResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/merge-patch+json
 - **Accept**: application/json

<a name="reactivateDriverById"></a>
# **reactivateDriverById**
> Driver reactivateDriverById(accessToken, driverIdOrExternalId, reactivateDriverParam)

/fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

Reactivate the inactive driver having id.

### Example
```javascript
import SamsaraApi from 'samsara_api';

let apiInstance = new SamsaraApi.FleetApi();
let accessToken = "accessToken_example"; // String | Samsara API access token.
let driverIdOrExternalId = "driverIdOrExternalId_example"; // String | ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
let reactivateDriverParam = new SamsaraApi.InlineObject4(); // InlineObject4 | 
apiInstance.reactivateDriverById(accessToken, driverIdOrExternalId, reactivateDriverParam, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | 
 **driverIdOrExternalId** | **String**| ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. | 
 **reactivateDriverParam** | [**InlineObject4**](InlineObject4.md)|  | 

### Return type

[**Driver**](Driver.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateDispatchRouteById"></a>
# **updateDispatchRouteById**
> DispatchRoute updateDispatchRouteById(accessToken, routeId, updateDispatchRouteParams)

/fleet/dispatch/routes/{route_id:[0-9]+}/

Update a dispatch route and its associated jobs.

### Example
```javascript
import SamsaraApi from 'samsara_api';

let apiInstance = new SamsaraApi.FleetApi();
let accessToken = "accessToken_example"; // String | Samsara API access token.
let routeId = 789; // Number | ID of the dispatch route.
let updateDispatchRouteParams = new SamsaraApi.DispatchRoute(); // DispatchRoute | 
apiInstance.updateDispatchRouteById(accessToken, routeId, updateDispatchRouteParams, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | 
 **routeId** | **Number**| ID of the dispatch route. | 
 **updateDispatchRouteParams** | [**DispatchRoute**](DispatchRoute.md)|  | 

### Return type

[**DispatchRoute**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateOrganizationAddress"></a>
# **updateOrganizationAddress**
> updateOrganizationAddress(accessToken, addressId, address)

/addresses/{addressId}

Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.

### Example
```javascript
import SamsaraApi from 'samsara_api';

let apiInstance = new SamsaraApi.FleetApi();
let accessToken = "accessToken_example"; // String | Samsara API access token.
let addressId = 789; // Number | ID of the address/geofence
let address = new SamsaraApi.InlineObject1(); // InlineObject1 | 
apiInstance.updateOrganizationAddress(accessToken, addressId, address, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | 
 **addressId** | **Number**| ID of the address/geofence | 
 **address** | [**InlineObject1**](InlineObject1.md)|  | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateVehicles"></a>
# **updateVehicles**
> updateVehicles(accessToken, vehicleUpdateParam)

/fleet/set_data

This method enables the mutation of metadata for vehicles in the Samsara Cloud.

### Example
```javascript
import SamsaraApi from 'samsara_api';

let apiInstance = new SamsaraApi.FleetApi();
let accessToken = "accessToken_example"; // String | Samsara API access token.
let vehicleUpdateParam = new SamsaraApi.InlineObject14(); // InlineObject14 | 
apiInstance.updateVehicles(accessToken, vehicleUpdateParam, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | 
 **vehicleUpdateParam** | [**InlineObject14**](InlineObject14.md)|  | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


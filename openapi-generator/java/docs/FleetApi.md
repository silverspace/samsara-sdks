# FleetApi

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
```java
// Import classes:
//import org.openapitools.client.ApiException;
//import org.openapitools.client.api.FleetApi;


FleetApi apiInstance = new FleetApi();
String accessToken = "accessToken_example"; // String | Samsara API access token.
InlineObject2 addressParam = new InlineObject2(); // InlineObject2 | 
try {
    apiInstance.addFleetAddress(accessToken, addressParam);
} catch (ApiException e) {
    System.err.println("Exception when calling FleetApi#addFleetAddress");
    e.printStackTrace();
}
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
> List&lt;Address&gt; addOrganizationAddresses(accessToken, addresses)

/addresses

Add one or more addresses to the organization

### Example
```java
// Import classes:
//import org.openapitools.client.ApiException;
//import org.openapitools.client.api.FleetApi;


FleetApi apiInstance = new FleetApi();
String accessToken = "accessToken_example"; // String | Samsara API access token.
InlineObject addresses = new InlineObject(); // InlineObject | 
try {
    List<Address> result = apiInstance.addOrganizationAddresses(accessToken, addresses);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FleetApi#addOrganizationAddresses");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. |
 **addresses** | [**InlineObject**](InlineObject.md)|  |

### Return type

[**List&lt;Address&gt;**](Address.md)

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
```java
// Import classes:
//import org.openapitools.client.ApiException;
//import org.openapitools.client.api.FleetApi;


FleetApi apiInstance = new FleetApi();
String accessToken = "accessToken_example"; // String | Samsara API access token.
DispatchRouteCreate createDispatchRouteParams = new DispatchRouteCreate(); // DispatchRouteCreate | 
try {
    DispatchRoute result = apiInstance.createDispatchRoute(accessToken, createDispatchRouteParams);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FleetApi#createDispatchRoute");
    e.printStackTrace();
}
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
```java
// Import classes:
//import org.openapitools.client.ApiException;
//import org.openapitools.client.api.FleetApi;


FleetApi apiInstance = new FleetApi();
String accessToken = "accessToken_example"; // String | Samsara API access token.
DriverForCreate createDriverParam = new DriverForCreate(); // DriverForCreate | Driver creation body
try {
    Driver result = apiInstance.createDriver(accessToken, createDriverParam);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FleetApi#createDriver");
    e.printStackTrace();
}
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
```java
// Import classes:
//import org.openapitools.client.ApiException;
//import org.openapitools.client.api.FleetApi;


FleetApi apiInstance = new FleetApi();
String accessToken = "accessToken_example"; // String | Samsara API access token.
Long driverId = 56L; // Long | ID of the driver with the associated routes.
DispatchRouteCreate createDispatchRouteParams = new DispatchRouteCreate(); // DispatchRouteCreate | 
try {
    DispatchRoute result = apiInstance.createDriverDispatchRoute(accessToken, driverId, createDispatchRouteParams);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FleetApi#createDriverDispatchRoute");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. |
 **driverId** | **Long**| ID of the driver with the associated routes. |
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
```java
// Import classes:
//import org.openapitools.client.ApiException;
//import org.openapitools.client.api.FleetApi;


FleetApi apiInstance = new FleetApi();
String accessToken = "accessToken_example"; // String | Samsara API access token.
Long driverId = 56L; // Long | ID of the driver for whom the document is created.
DocumentCreate createDocumentParams = new DocumentCreate(); // DocumentCreate | To create a document for a given document type, the document type's uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field's valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_.
try {
    Document result = apiInstance.createDriverDocument(accessToken, driverId, createDocumentParams);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FleetApi#createDriverDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. |
 **driverId** | **Long**| ID of the driver for whom the document is created. |
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
```java
// Import classes:
//import org.openapitools.client.ApiException;
//import org.openapitools.client.api.FleetApi;


FleetApi apiInstance = new FleetApi();
String accessToken = "accessToken_example"; // String | Samsara API access token.
InlineObject12 createDvirParam = new InlineObject12(); // InlineObject12 | 
try {
    DvirBase result = apiInstance.createDvir(accessToken, createDvirParam);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FleetApi#createDvir");
    e.printStackTrace();
}
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
```java
// Import classes:
//import org.openapitools.client.ApiException;
//import org.openapitools.client.api.FleetApi;


FleetApi apiInstance = new FleetApi();
String accessToken = "accessToken_example"; // String | Samsara API access token.
Long vehicleId = 56L; // Long | ID of the vehicle with the associated routes.
DispatchRouteCreate createDispatchRouteParams = new DispatchRouteCreate(); // DispatchRouteCreate | 
try {
    DispatchRoute result = apiInstance.createVehicleDispatchRoute(accessToken, vehicleId, createDispatchRouteParams);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FleetApi#createVehicleDispatchRoute");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. |
 **vehicleId** | **Long**| ID of the vehicle with the associated routes. |
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
```java
// Import classes:
//import org.openapitools.client.ApiException;
//import org.openapitools.client.api.FleetApi;


FleetApi apiInstance = new FleetApi();
String accessToken = "accessToken_example"; // String | Samsara API access token.
String driverIdOrExternalId = "driverIdOrExternalId_example"; // String | ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
try {
    apiInstance.deactivateDriver(accessToken, driverIdOrExternalId);
} catch (ApiException e) {
    System.err.println("Exception when calling FleetApi#deactivateDriver");
    e.printStackTrace();
}
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
```java
// Import classes:
//import org.openapitools.client.ApiException;
//import org.openapitools.client.api.FleetApi;


FleetApi apiInstance = new FleetApi();
String accessToken = "accessToken_example"; // String | Samsara API access token.
Long routeId = 56L; // Long | ID of the dispatch route.
try {
    apiInstance.deleteDispatchRouteById(accessToken, routeId);
} catch (ApiException e) {
    System.err.println("Exception when calling FleetApi#deleteDispatchRouteById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. |
 **routeId** | **Long**| ID of the dispatch route. |

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
```java
// Import classes:
//import org.openapitools.client.ApiException;
//import org.openapitools.client.api.FleetApi;


FleetApi apiInstance = new FleetApi();
String accessToken = "accessToken_example"; // String | Samsara API access token.
Long addressId = 56L; // Long | ID of the address/geofence
try {
    apiInstance.deleteOrganizationAddress(accessToken, addressId);
} catch (ApiException e) {
    System.err.println("Exception when calling FleetApi#deleteOrganizationAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. |
 **addressId** | **Long**| ID of the address/geofence |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="fetchAllDispatchRoutes"></a>
# **fetchAllDispatchRoutes**
> List&lt;DispatchRoute&gt; fetchAllDispatchRoutes(accessToken, groupId, endTime, duration)

/fleet/dispatch/routes

Fetch all of the dispatch routes for the group.

### Example
```java
// Import classes:
//import org.openapitools.client.ApiException;
//import org.openapitools.client.api.FleetApi;


FleetApi apiInstance = new FleetApi();
String accessToken = "accessToken_example"; // String | Samsara API access token.
Long groupId = 56L; // Long | Optional group ID if the organization has multiple groups (uncommon).
Long endTime = 56L; // Long | Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
Long duration = 56L; // Long | Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
try {
    List<DispatchRoute> result = apiInstance.fetchAllDispatchRoutes(accessToken, groupId, endTime, duration);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FleetApi#fetchAllDispatchRoutes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. |
 **groupId** | **Long**| Optional group ID if the organization has multiple groups (uncommon). | [optional]
 **endTime** | **Long**| Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. | [optional]
 **duration** | **Long**| Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. | [optional]

### Return type

[**List&lt;DispatchRoute&gt;**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="fetchAllRouteJobUpdates"></a>
# **fetchAllRouteJobUpdates**
> AllRouteJobUpdates fetchAllRouteJobUpdates(accessToken, groupId, sequenceId, include)

/fleet/dispatch/routes/job_updates

Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID

### Example
```java
// Import classes:
//import org.openapitools.client.ApiException;
//import org.openapitools.client.api.FleetApi;


FleetApi apiInstance = new FleetApi();
String accessToken = "accessToken_example"; // String | Samsara API access token.
Long groupId = 56L; // Long | Optional group ID if the organization has multiple groups (uncommon).
String sequenceId = "sequenceId_example"; // String | Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours.
String include = "include_example"; // String | Optionally set include=route to include route object in response payload.
try {
    AllRouteJobUpdates result = apiInstance.fetchAllRouteJobUpdates(accessToken, groupId, sequenceId, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FleetApi#fetchAllRouteJobUpdates");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. |
 **groupId** | **Long**| Optional group ID if the organization has multiple groups (uncommon). | [optional]
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
> InlineResponse2001 getAllAssetCurrentLocations(accessToken, groupId)

/fleet/assets/locations

Fetch current locations of all assets for the group.

### Example
```java
// Import classes:
//import org.openapitools.client.ApiException;
//import org.openapitools.client.api.FleetApi;


FleetApi apiInstance = new FleetApi();
String accessToken = "accessToken_example"; // String | Samsara API access token.
Long groupId = 56L; // Long | Optional group ID if the organization has multiple groups (uncommon).
try {
    InlineResponse2001 result = apiInstance.getAllAssetCurrentLocations(accessToken, groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FleetApi#getAllAssetCurrentLocations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. |
 **groupId** | **Long**| Optional group ID if the organization has multiple groups (uncommon). | [optional]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAllAssets"></a>
# **getAllAssets**
> InlineResponse200 getAllAssets(accessToken, groupId)

/fleet/assets

Fetch all of the assets for the group.

### Example
```java
// Import classes:
//import org.openapitools.client.ApiException;
//import org.openapitools.client.api.FleetApi;


FleetApi apiInstance = new FleetApi();
String accessToken = "accessToken_example"; // String | Samsara API access token.
Long groupId = 56L; // Long | Optional group ID if the organization has multiple groups (uncommon).
try {
    InlineResponse200 result = apiInstance.getAllAssets(accessToken, groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FleetApi#getAllAssets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. |
 **groupId** | **Long**| Optional group ID if the organization has multiple groups (uncommon). | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAllDeactivatedDrivers"></a>
# **getAllDeactivatedDrivers**
> List&lt;Driver&gt; getAllDeactivatedDrivers(accessToken, groupId)

/fleet/drivers/inactive

Fetch all deactivated drivers for the group.

### Example
```java
// Import classes:
//import org.openapitools.client.ApiException;
//import org.openapitools.client.api.FleetApi;


FleetApi apiInstance = new FleetApi();
String accessToken = "accessToken_example"; // String | Samsara API access token.
Long groupId = 56L; // Long | Optional group ID if the organization has multiple groups (uncommon).
try {
    List<Driver> result = apiInstance.getAllDeactivatedDrivers(accessToken, groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FleetApi#getAllDeactivatedDrivers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. |
 **groupId** | **Long**| Optional group ID if the organization has multiple groups (uncommon). | [optional]

### Return type

[**List&lt;Driver&gt;**](Driver.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAssetLocation"></a>
# **getAssetLocation**
> List&lt;Object&gt; getAssetLocation(accessToken, assetId, startMs, endMs)

/fleet/assets/{assetId:[0-9]+}/locations

Fetch the historical locations for the asset.

### Example
```java
// Import classes:
//import org.openapitools.client.ApiException;
//import org.openapitools.client.api.FleetApi;


FleetApi apiInstance = new FleetApi();
String accessToken = "accessToken_example"; // String | Samsara API access token.
Long assetId = 56L; // Long | ID of the asset
Long startMs = 56L; // Long | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
Long endMs = 56L; // Long | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
try {
    List<Object> result = apiInstance.getAssetLocation(accessToken, assetId, startMs, endMs);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FleetApi#getAssetLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. |
 **assetId** | **Long**| ID of the asset |
 **startMs** | **Long**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. |
 **endMs** | **Long**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. |

### Return type

**List&lt;Object&gt;**

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
```java
// Import classes:
//import org.openapitools.client.ApiException;
//import org.openapitools.client.api.FleetApi;


FleetApi apiInstance = new FleetApi();
String accessToken = "accessToken_example"; // String | Samsara API access token.
Long assetId = 56L; // Long | ID of the asset
Long startMs = 56L; // Long | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
Long endMs = 56L; // Long | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
try {
    AssetReeferResponse result = apiInstance.getAssetReefer(accessToken, assetId, startMs, endMs);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FleetApi#getAssetReefer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. |
 **assetId** | **Long**| ID of the asset |
 **startMs** | **Long**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. |
 **endMs** | **Long**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. |

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
```java
// Import classes:
//import org.openapitools.client.ApiException;
//import org.openapitools.client.api.FleetApi;


FleetApi apiInstance = new FleetApi();
String accessToken = "accessToken_example"; // String | Samsara API access token.
String driverIdOrExternalId = "driverIdOrExternalId_example"; // String | ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
try {
    Driver result = apiInstance.getDeactivatedDriverById(accessToken, driverIdOrExternalId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FleetApi#getDeactivatedDriverById");
    e.printStackTrace();
}
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
```java
// Import classes:
//import org.openapitools.client.ApiException;
//import org.openapitools.client.api.FleetApi;


FleetApi apiInstance = new FleetApi();
String accessToken = "accessToken_example"; // String | Samsara API access token.
Long routeId = 56L; // Long | ID of the dispatch route.
try {
    DispatchRoute result = apiInstance.getDispatchRouteById(accessToken, routeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FleetApi#getDispatchRouteById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. |
 **routeId** | **Long**| ID of the dispatch route. |

### Return type

[**DispatchRoute**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDispatchRouteHistory"></a>
# **getDispatchRouteHistory**
> DispatchRouteHistory getDispatchRouteHistory(accessToken, routeId, startTime, endTime)

/fleet/dispatch/routes/{route_id:[0-9]+}/history

Fetch the history of a dispatch route.

### Example
```java
// Import classes:
//import org.openapitools.client.ApiException;
//import org.openapitools.client.api.FleetApi;


FleetApi apiInstance = new FleetApi();
String accessToken = "accessToken_example"; // String | Samsara API access token.
Long routeId = 56L; // Long | ID of the route with history.
Long startTime = 56L; // Long | Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0.
Long endTime = 56L; // Long | Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs.
try {
    DispatchRouteHistory result = apiInstance.getDispatchRouteHistory(accessToken, routeId, startTime, endTime);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FleetApi#getDispatchRouteHistory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. |
 **routeId** | **Long**| ID of the route with history. |
 **startTime** | **Long**| Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0. | [optional]
 **endTime** | **Long**| Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs. | [optional]

### Return type

[**DispatchRouteHistory**](DispatchRouteHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDispatchRoutesByDriverId"></a>
# **getDispatchRoutesByDriverId**
> List&lt;DispatchRoute&gt; getDispatchRoutesByDriverId(accessToken, driverId, endTime, duration)

/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes

Fetch all of the dispatch routes for a given driver.

### Example
```java
// Import classes:
//import org.openapitools.client.ApiException;
//import org.openapitools.client.api.FleetApi;


FleetApi apiInstance = new FleetApi();
String accessToken = "accessToken_example"; // String | Samsara API access token.
Long driverId = 56L; // Long | ID of the driver with the associated routes.
Long endTime = 56L; // Long | Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
Long duration = 56L; // Long | Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
try {
    List<DispatchRoute> result = apiInstance.getDispatchRoutesByDriverId(accessToken, driverId, endTime, duration);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FleetApi#getDispatchRoutesByDriverId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. |
 **driverId** | **Long**| ID of the driver with the associated routes. |
 **endTime** | **Long**| Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. | [optional]
 **duration** | **Long**| Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. | [optional]

### Return type

[**List&lt;DispatchRoute&gt;**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDispatchRoutesByVehicleId"></a>
# **getDispatchRoutesByVehicleId**
> List&lt;DispatchRoute&gt; getDispatchRoutesByVehicleId(accessToken, vehicleId, endTime, duration)

/fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes

Fetch all of the dispatch routes for a given vehicle.

### Example
```java
// Import classes:
//import org.openapitools.client.ApiException;
//import org.openapitools.client.api.FleetApi;


FleetApi apiInstance = new FleetApi();
String accessToken = "accessToken_example"; // String | Samsara API access token.
Long vehicleId = 56L; // Long | ID of the vehicle with the associated routes.
Long endTime = 56L; // Long | Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
Long duration = 56L; // Long | Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
try {
    List<DispatchRoute> result = apiInstance.getDispatchRoutesByVehicleId(accessToken, vehicleId, endTime, duration);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FleetApi#getDispatchRoutesByVehicleId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. |
 **vehicleId** | **Long**| ID of the vehicle with the associated routes. |
 **endTime** | **Long**| Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. | [optional]
 **duration** | **Long**| Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. | [optional]

### Return type

[**List&lt;DispatchRoute&gt;**](DispatchRoute.md)

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
```java
// Import classes:
//import org.openapitools.client.ApiException;
//import org.openapitools.client.api.FleetApi;


FleetApi apiInstance = new FleetApi();
String accessToken = "accessToken_example"; // String | Samsara API access token.
String driverIdOrExternalId = "driverIdOrExternalId_example"; // String | ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
try {
    Driver result = apiInstance.getDriverById(accessToken, driverIdOrExternalId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FleetApi#getDriverById");
    e.printStackTrace();
}
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
> List&lt;DocumentType&gt; getDriverDocumentTypesByOrgId()

/fleet/drivers/document_types

Fetch all of the document types.

### Example
```java
// Import classes:
//import org.openapitools.client.ApiException;
//import org.openapitools.client.api.FleetApi;


FleetApi apiInstance = new FleetApi();
try {
    List<DocumentType> result = apiInstance.getDriverDocumentTypesByOrgId();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FleetApi#getDriverDocumentTypesByOrgId");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;DocumentType&gt;**](DocumentType.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDriverDocumentsByOrgId"></a>
# **getDriverDocumentsByOrgId**
> List&lt;Document&gt; getDriverDocumentsByOrgId(accessToken, endMs, durationMs)

/fleet/drivers/documents

Fetch all of the documents.

### Example
```java
// Import classes:
//import org.openapitools.client.ApiException;
//import org.openapitools.client.api.FleetApi;


FleetApi apiInstance = new FleetApi();
String accessToken = "accessToken_example"; // String | Samsara API access token.
Long endMs = 56L; // Long | Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now.
Long durationMs = 56L; // Long | Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours.
try {
    List<Document> result = apiInstance.getDriverDocumentsByOrgId(accessToken, endMs, durationMs);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FleetApi#getDriverDocumentsByOrgId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. |
 **endMs** | **Long**| Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now. | [optional]
 **durationMs** | **Long**| Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours. | [optional]

### Return type

[**List&lt;Document&gt;**](Document.md)

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
```java
// Import classes:
//import org.openapitools.client.ApiException;
//import org.openapitools.client.api.FleetApi;


FleetApi apiInstance = new FleetApi();
Long driverId = 56L; // Long | ID of the driver
String accessToken = "accessToken_example"; // String | Samsara API access token.
Long startMs = 56L; // Long | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
Long endMs = 56L; // Long | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
try {
    DriverSafetyScoreResponse result = apiInstance.getDriverSafetyScore(driverId, accessToken, startMs, endMs);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FleetApi#getDriverSafetyScore");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **driverId** | **Long**| ID of the driver |
 **accessToken** | **String**| Samsara API access token. |
 **startMs** | **Long**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. |
 **endMs** | **Long**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. |

### Return type

[**DriverSafetyScoreResponse**](DriverSafetyScoreResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDvirs"></a>
# **getDvirs**
> DvirListResponse getDvirs(accessToken, endMs, durationMs, groupId)

/fleet/maintenance/dvirs

Get DVIRs for the org within provided time constraints

### Example
```java
// Import classes:
//import org.openapitools.client.ApiException;
//import org.openapitools.client.api.FleetApi;


FleetApi apiInstance = new FleetApi();
String accessToken = "accessToken_example"; // String | Samsara API access token.
Integer endMs = 56; // Integer | time in millis until the last dvir log.
Integer durationMs = 56; // Integer | time in millis which corresponds to the duration before the end_ms.
Integer groupId = 56; // Integer | Group ID to query.
try {
    DvirListResponse result = apiInstance.getDvirs(accessToken, endMs, durationMs, groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FleetApi#getDvirs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. |
 **endMs** | **Integer**| time in millis until the last dvir log. |
 **durationMs** | **Integer**| time in millis which corresponds to the duration before the end_ms. |
 **groupId** | **Integer**| Group ID to query. | [optional]

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
```java
// Import classes:
//import org.openapitools.client.ApiException;
//import org.openapitools.client.api.FleetApi;


FleetApi apiInstance = new FleetApi();
String accessToken = "accessToken_example"; // String | Samsara API access token.
InlineObject3 groupDriversParam = new InlineObject3(); // InlineObject3 | 
try {
    DriversResponse result = apiInstance.getFleetDrivers(accessToken, groupDriversParam);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FleetApi#getFleetDrivers");
    e.printStackTrace();
}
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
```java
// Import classes:
//import org.openapitools.client.ApiException;
//import org.openapitools.client.api.FleetApi;


FleetApi apiInstance = new FleetApi();
String accessToken = "accessToken_example"; // String | Samsara API access token.
Long driverId = 56L; // Long | ID of the driver with HOS logs.
InlineObject6 hosLogsParam = new InlineObject6(); // InlineObject6 | 
try {
    DriverDailyLogResponse result = apiInstance.getFleetDriversHosDailyLogs(accessToken, driverId, hosLogsParam);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FleetApi#getFleetDriversHosDailyLogs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. |
 **driverId** | **Long**| ID of the driver with HOS logs. |
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
> DriversSummaryResponse getFleetDriversSummary(accessToken, driversSummaryParam, snapToDayBounds)

/fleet/drivers/summary

Get the distance and time each driver in an organization has driven in a given time period.

### Example
```java
// Import classes:
//import org.openapitools.client.ApiException;
//import org.openapitools.client.api.FleetApi;


FleetApi apiInstance = new FleetApi();
String accessToken = "accessToken_example"; // String | Samsara API access token.
InlineObject5 driversSummaryParam = new InlineObject5(); // InlineObject5 | 
Boolean snapToDayBounds = true; // Boolean | Snap query result to HOS day boundaries.
try {
    DriversSummaryResponse result = apiInstance.getFleetDriversSummary(accessToken, driversSummaryParam, snapToDayBounds);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FleetApi#getFleetDriversSummary");
    e.printStackTrace();
}
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
```java
// Import classes:
//import org.openapitools.client.ApiException;
//import org.openapitools.client.api.FleetApi;


FleetApi apiInstance = new FleetApi();
String accessToken = "accessToken_example"; // String | Samsara API access token.
InlineObject7 hosAuthenticationLogsParam = new InlineObject7(); // InlineObject7 | 
try {
    HosAuthenticationLogsResponse result = apiInstance.getFleetHosAuthenticationLogs(accessToken, hosAuthenticationLogsParam);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FleetApi#getFleetHosAuthenticationLogs");
    e.printStackTrace();
}
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
```java
// Import classes:
//import org.openapitools.client.ApiException;
//import org.openapitools.client.api.FleetApi;


FleetApi apiInstance = new FleetApi();
String accessToken = "accessToken_example"; // String | Samsara API access token.
InlineObject8 hosLogsParam = new InlineObject8(); // InlineObject8 | 
try {
    HosLogsResponse result = apiInstance.getFleetHosLogs(accessToken, hosLogsParam);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FleetApi#getFleetHosLogs");
    e.printStackTrace();
}
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
```java
// Import classes:
//import org.openapitools.client.ApiException;
//import org.openapitools.client.api.FleetApi;


FleetApi apiInstance = new FleetApi();
String accessToken = "accessToken_example"; // String | Samsara API access token.
InlineObject9 hosLogsParam = new InlineObject9(); // InlineObject9 | 
try {
    HosLogsSummaryResponse result = apiInstance.getFleetHosLogsSummary(accessToken, hosLogsParam);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FleetApi#getFleetHosLogsSummary");
    e.printStackTrace();
}
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
```java
// Import classes:
//import org.openapitools.client.ApiException;
//import org.openapitools.client.api.FleetApi;


FleetApi apiInstance = new FleetApi();
String accessToken = "accessToken_example"; // String | Samsara API access token.
InlineObject11 groupParam = new InlineObject11(); // InlineObject11 | 
try {
    InlineResponse2003 result = apiInstance.getFleetLocations(accessToken, groupParam);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FleetApi#getFleetLocations");
    e.printStackTrace();
}
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
```java
// Import classes:
//import org.openapitools.client.ApiException;
//import org.openapitools.client.api.FleetApi;


FleetApi apiInstance = new FleetApi();
String accessToken = "accessToken_example"; // String | Samsara API access token.
InlineObject13 groupParam = new InlineObject13(); // InlineObject13 | 
try {
    InlineResponse2004 result = apiInstance.getFleetMaintenanceList(accessToken, groupParam);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FleetApi#getFleetMaintenanceList");
    e.printStackTrace();
}
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
```java
// Import classes:
//import org.openapitools.client.ApiException;
//import org.openapitools.client.api.FleetApi;


FleetApi apiInstance = new FleetApi();
String accessToken = "accessToken_example"; // String | Samsara API access token.
InlineObject15 tripsParam = new InlineObject15(); // InlineObject15 | 
try {
    TripResponse result = apiInstance.getFleetTrips(accessToken, tripsParam);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FleetApi#getFleetTrips");
    e.printStackTrace();
}
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
```java
// Import classes:
//import org.openapitools.client.ApiException;
//import org.openapitools.client.api.FleetApi;


FleetApi apiInstance = new FleetApi();
String accessToken = "accessToken_example"; // String | Samsara API access token.
String vehicleIdOrExternalId = "vehicleIdOrExternalId_example"; // String | ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.
try {
    FleetVehicleResponse result = apiInstance.getFleetVehicle(accessToken, vehicleIdOrExternalId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FleetApi#getFleetVehicle");
    e.printStackTrace();
}
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
```java
// Import classes:
//import org.openapitools.client.ApiException;
//import org.openapitools.client.api.FleetApi;


FleetApi apiInstance = new FleetApi();
String accessToken = "accessToken_example"; // String | Samsara API access token.
Long addressId = 56L; // Long | ID of the address/geofence
try {
    Address result = apiInstance.getOrganizationAddress(accessToken, addressId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FleetApi#getOrganizationAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. |
 **addressId** | **Long**| ID of the address/geofence |

### Return type

[**Address**](Address.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOrganizationAddresses"></a>
# **getOrganizationAddresses**
> List&lt;Address&gt; getOrganizationAddresses(accessToken)

/addresses

Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.

### Example
```java
// Import classes:
//import org.openapitools.client.ApiException;
//import org.openapitools.client.api.FleetApi;


FleetApi apiInstance = new FleetApi();
String accessToken = "accessToken_example"; // String | Samsara API access token.
try {
    List<Address> result = apiInstance.getOrganizationAddresses(accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FleetApi#getOrganizationAddresses");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. |

### Return type

[**List&lt;Address&gt;**](Address.md)

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
```java
// Import classes:
//import org.openapitools.client.ApiException;
//import org.openapitools.client.api.FleetApi;


FleetApi apiInstance = new FleetApi();
String accessToken = "accessToken_example"; // String | Samsara API access token.
Long contactId = 56L; // Long | ID of the contact
try {
    Contact result = apiInstance.getOrganizationContact(accessToken, contactId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FleetApi#getOrganizationContact");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. |
 **contactId** | **Long**| ID of the contact |

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
```java
// Import classes:
//import org.openapitools.client.ApiException;
//import org.openapitools.client.api.FleetApi;


FleetApi apiInstance = new FleetApi();
Long vehicleId = 56L; // Long | ID of the vehicle
String accessToken = "accessToken_example"; // String | Samsara API access token.
Long timestamp = 56L; // Long | Timestamp in milliseconds representing the timestamp of a harsh event.
try {
    VehicleHarshEventResponse result = apiInstance.getVehicleHarshEvent(vehicleId, accessToken, timestamp);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FleetApi#getVehicleHarshEvent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **Long**| ID of the vehicle |
 **accessToken** | **String**| Samsara API access token. |
 **timestamp** | **Long**| Timestamp in milliseconds representing the timestamp of a harsh event. |

### Return type

[**VehicleHarshEventResponse**](VehicleHarshEventResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVehicleLocations"></a>
# **getVehicleLocations**
> List&lt;FleetVehicleLocation&gt; getVehicleLocations(accessToken, vehicleId, startMs, endMs)

/fleet/vehicles/{vehicle_id:[0-9]+}/locations

Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.

### Example
```java
// Import classes:
//import org.openapitools.client.ApiException;
//import org.openapitools.client.api.FleetApi;


FleetApi apiInstance = new FleetApi();
String accessToken = "accessToken_example"; // String | Samsara API access token.
Long vehicleId = 56L; // Long | ID of the vehicle with the associated routes.
Long startMs = 56L; // Long | Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour)
Long endMs = 56L; // Long | Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour)
try {
    List<FleetVehicleLocation> result = apiInstance.getVehicleLocations(accessToken, vehicleId, startMs, endMs);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FleetApi#getVehicleLocations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. |
 **vehicleId** | **Long**| ID of the vehicle with the associated routes. |
 **startMs** | **Long**| Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour) |
 **endMs** | **Long**| Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour) |

### Return type

[**List&lt;FleetVehicleLocation&gt;**](FleetVehicleLocation.md)

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
```java
// Import classes:
//import org.openapitools.client.ApiException;
//import org.openapitools.client.api.FleetApi;


FleetApi apiInstance = new FleetApi();
Long vehicleId = 56L; // Long | ID of the vehicle
String accessToken = "accessToken_example"; // String | Samsara API access token.
Long startMs = 56L; // Long | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
Long endMs = 56L; // Long | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
try {
    VehicleSafetyScoreResponse result = apiInstance.getVehicleSafetyScore(vehicleId, accessToken, startMs, endMs);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FleetApi#getVehicleSafetyScore");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **Long**| ID of the vehicle |
 **accessToken** | **String**| Samsara API access token. |
 **startMs** | **Long**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. |
 **endMs** | **Long**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. |

### Return type

[**VehicleSafetyScoreResponse**](VehicleSafetyScoreResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVehicleStats"></a>
# **getVehicleStats**
> InlineResponse2005 getVehicleStats(accessToken, startMs, endMs, series, tagIds, startingAfter, endingBefore, limit)

/fleet/vehicles/stats

Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time.

### Example
```java
// Import classes:
//import org.openapitools.client.ApiException;
//import org.openapitools.client.api.FleetApi;


FleetApi apiInstance = new FleetApi();
String accessToken = "accessToken_example"; // String | Samsara API access token.
Integer startMs = 56; // Integer | Time in Unix epoch milliseconds for the start of the query.
Integer endMs = 56; // Integer | Time in Unix epoch milliseconds for the end of the query.
String series = "series_example"; // String | Comma-separated list of stat types. Options are engineState, auxInput1, and auxInput2. If this parameter is excluded, all 3 stat types will be returned. Example: series=engineState,auxInput2
String tagIds = "tagIds_example"; // String | Comma-separated list of tag ids. Example: tagIds=1,2,3
String startingAfter = "startingAfter_example"; // String | Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'endingBefore' parameter.
String endingBefore = "endingBefore_example"; // String | Pagination parameter indicating the cursor position to return results before. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'startingAfter' parameter.
Long limit = 56L; // Long | Pagination parameter indicating the number of results to return in this request. Used in conjunction with either 'startingAfter' or 'endingBefore'.
try {
    InlineResponse2005 result = apiInstance.getVehicleStats(accessToken, startMs, endMs, series, tagIds, startingAfter, endingBefore, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FleetApi#getVehicleStats");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. |
 **startMs** | **Integer**| Time in Unix epoch milliseconds for the start of the query. |
 **endMs** | **Integer**| Time in Unix epoch milliseconds for the end of the query. |
 **series** | **String**| Comma-separated list of stat types. Options are engineState, auxInput1, and auxInput2. If this parameter is excluded, all 3 stat types will be returned. Example: series&#x3D;engineState,auxInput2 | [optional] [enum: engineState, auxInput1, auxInput2]
 **tagIds** | **String**| Comma-separated list of tag ids. Example: tagIds&#x3D;1,2,3 | [optional]
 **startingAfter** | **String**| Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter. | [optional]
 **endingBefore** | **String**| Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter. | [optional]
 **limit** | **Long**| Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;. | [optional]

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVehiclesLocations"></a>
# **getVehiclesLocations**
> List&lt;Object&gt; getVehiclesLocations(accessToken, startMs, endMs)

/fleet/vehicles/locations

Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.

### Example
```java
// Import classes:
//import org.openapitools.client.ApiException;
//import org.openapitools.client.api.FleetApi;


FleetApi apiInstance = new FleetApi();
String accessToken = "accessToken_example"; // String | Samsara API access token.
Integer startMs = 56; // Integer | Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes)
Integer endMs = 56; // Integer | Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes)
try {
    List<Object> result = apiInstance.getVehiclesLocations(accessToken, startMs, endMs);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FleetApi#getVehiclesLocations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. |
 **startMs** | **Integer**| Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes) |
 **endMs** | **Integer**| Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes) |

### Return type

**List&lt;Object&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listContacts"></a>
# **listContacts**
> List&lt;Contact&gt; listContacts(accessToken)

/contacts

Fetch all contacts for the organization.

### Example
```java
// Import classes:
//import org.openapitools.client.ApiException;
//import org.openapitools.client.api.FleetApi;


FleetApi apiInstance = new FleetApi();
String accessToken = "accessToken_example"; // String | Samsara API access token.
try {
    List<Contact> result = apiInstance.listContacts(accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FleetApi#listContacts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. |

### Return type

[**List&lt;Contact&gt;**](Contact.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listFleet"></a>
# **listFleet**
> InlineResponse2002 listFleet(accessToken, groupParam, startingAfter, endingBefore, limit)

/fleet/list

Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.

### Example
```java
// Import classes:
//import org.openapitools.client.ApiException;
//import org.openapitools.client.api.FleetApi;


FleetApi apiInstance = new FleetApi();
String accessToken = "accessToken_example"; // String | Samsara API access token.
InlineObject10 groupParam = new InlineObject10(); // InlineObject10 | 
String startingAfter = "startingAfter_example"; // String | Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'endingBefore' parameter.
String endingBefore = "endingBefore_example"; // String | Pagination parameter indicating the cursor position to return results before. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'startingAfter' parameter.
Long limit = 56L; // Long | Pagination parameter indicating the number of results to return in this request. Used in conjunction with either 'startingAfter' or 'endingBefore'.
try {
    InlineResponse2002 result = apiInstance.listFleet(accessToken, groupParam, startingAfter, endingBefore, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FleetApi#listFleet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. |
 **groupParam** | [**InlineObject10**](InlineObject10.md)|  |
 **startingAfter** | **String**| Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter. | [optional]
 **endingBefore** | **String**| Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter. | [optional]
 **limit** | **Long**| Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;. | [optional]

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
```java
// Import classes:
//import org.openapitools.client.ApiException;
//import org.openapitools.client.api.FleetApi;


FleetApi apiInstance = new FleetApi();
String accessToken = "accessToken_example"; // String | Samsara API access token.
String vehicleIdOrExternalId = "vehicleIdOrExternalId_example"; // String | ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.
InlineObject16 data = new InlineObject16(); // InlineObject16 | 
try {
    FleetVehicleResponse result = apiInstance.patchFleetVehicle(accessToken, vehicleIdOrExternalId, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FleetApi#patchFleetVehicle");
    e.printStackTrace();
}
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
```java
// Import classes:
//import org.openapitools.client.ApiException;
//import org.openapitools.client.api.FleetApi;


FleetApi apiInstance = new FleetApi();
String accessToken = "accessToken_example"; // String | Samsara API access token.
String driverIdOrExternalId = "driverIdOrExternalId_example"; // String | ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
InlineObject4 reactivateDriverParam = new InlineObject4(); // InlineObject4 | 
try {
    Driver result = apiInstance.reactivateDriverById(accessToken, driverIdOrExternalId, reactivateDriverParam);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FleetApi#reactivateDriverById");
    e.printStackTrace();
}
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
```java
// Import classes:
//import org.openapitools.client.ApiException;
//import org.openapitools.client.api.FleetApi;


FleetApi apiInstance = new FleetApi();
String accessToken = "accessToken_example"; // String | Samsara API access token.
Long routeId = 56L; // Long | ID of the dispatch route.
DispatchRoute updateDispatchRouteParams = new DispatchRoute(); // DispatchRoute | 
try {
    DispatchRoute result = apiInstance.updateDispatchRouteById(accessToken, routeId, updateDispatchRouteParams);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FleetApi#updateDispatchRouteById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. |
 **routeId** | **Long**| ID of the dispatch route. |
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
```java
// Import classes:
//import org.openapitools.client.ApiException;
//import org.openapitools.client.api.FleetApi;


FleetApi apiInstance = new FleetApi();
String accessToken = "accessToken_example"; // String | Samsara API access token.
Long addressId = 56L; // Long | ID of the address/geofence
InlineObject1 address = new InlineObject1(); // InlineObject1 | 
try {
    apiInstance.updateOrganizationAddress(accessToken, addressId, address);
} catch (ApiException e) {
    System.err.println("Exception when calling FleetApi#updateOrganizationAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. |
 **addressId** | **Long**| ID of the address/geofence |
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
```java
// Import classes:
//import org.openapitools.client.ApiException;
//import org.openapitools.client.api.FleetApi;


FleetApi apiInstance = new FleetApi();
String accessToken = "accessToken_example"; // String | Samsara API access token.
InlineObject14 vehicleUpdateParam = new InlineObject14(); // InlineObject14 | 
try {
    apiInstance.updateVehicles(accessToken, vehicleUpdateParam);
} catch (ApiException e) {
    System.err.println("Exception when calling FleetApi#updateVehicles");
    e.printStackTrace();
}
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


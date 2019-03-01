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
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FleetApi()
val accessToken : kotlin.String = accessToken_example // kotlin.String | Samsara API access token.
val addressParam : InlineObject2 =  // InlineObject2 | 
try {
    apiInstance.addFleetAddress(accessToken, addressParam)
} catch (e: ClientException) {
    println("4xx response calling FleetApi#addFleetAddress")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FleetApi#addFleetAddress")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **kotlin.String**| Samsara API access token. | [default to null]
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
> kotlin.Array&lt;Address&gt; addOrganizationAddresses(accessToken, addresses)

/addresses

Add one or more addresses to the organization

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FleetApi()
val accessToken : kotlin.String = accessToken_example // kotlin.String | Samsara API access token.
val addresses : InlineObject =  // InlineObject | 
try {
    val result : kotlin.Array<Address> = apiInstance.addOrganizationAddresses(accessToken, addresses)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FleetApi#addOrganizationAddresses")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FleetApi#addOrganizationAddresses")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **kotlin.String**| Samsara API access token. | [default to null]
 **addresses** | [**InlineObject**](InlineObject.md)|  |

### Return type

[**kotlin.Array&lt;Address&gt;**](Address.md)

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
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FleetApi()
val accessToken : kotlin.String = accessToken_example // kotlin.String | Samsara API access token.
val createDispatchRouteParams : DispatchRouteCreate =  // DispatchRouteCreate | 
try {
    val result : DispatchRoute = apiInstance.createDispatchRoute(accessToken, createDispatchRouteParams)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FleetApi#createDispatchRoute")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FleetApi#createDispatchRoute")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **kotlin.String**| Samsara API access token. | [default to null]
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
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FleetApi()
val accessToken : kotlin.String = accessToken_example // kotlin.String | Samsara API access token.
val createDriverParam : DriverForCreate =  // DriverForCreate | Driver creation body
try {
    val result : Driver = apiInstance.createDriver(accessToken, createDriverParam)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FleetApi#createDriver")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FleetApi#createDriver")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **kotlin.String**| Samsara API access token. | [default to null]
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
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FleetApi()
val accessToken : kotlin.String = accessToken_example // kotlin.String | Samsara API access token.
val driverId : kotlin.Long = 789 // kotlin.Long | ID of the driver with the associated routes.
val createDispatchRouteParams : DispatchRouteCreate =  // DispatchRouteCreate | 
try {
    val result : DispatchRoute = apiInstance.createDriverDispatchRoute(accessToken, driverId, createDispatchRouteParams)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FleetApi#createDriverDispatchRoute")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FleetApi#createDriverDispatchRoute")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **kotlin.String**| Samsara API access token. | [default to null]
 **driverId** | **kotlin.Long**| ID of the driver with the associated routes. | [default to null]
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
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FleetApi()
val accessToken : kotlin.String = accessToken_example // kotlin.String | Samsara API access token.
val driverId : kotlin.Long = 789 // kotlin.Long | ID of the driver for whom the document is created.
val createDocumentParams : DocumentCreate =  // DocumentCreate | To create a document for a given document type, the document type's uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field's valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_.
try {
    val result : Document = apiInstance.createDriverDocument(accessToken, driverId, createDocumentParams)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FleetApi#createDriverDocument")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FleetApi#createDriverDocument")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **kotlin.String**| Samsara API access token. | [default to null]
 **driverId** | **kotlin.Long**| ID of the driver for whom the document is created. | [default to null]
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
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FleetApi()
val accessToken : kotlin.String = accessToken_example // kotlin.String | Samsara API access token.
val createDvirParam : InlineObject12 =  // InlineObject12 | 
try {
    val result : DvirBase = apiInstance.createDvir(accessToken, createDvirParam)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FleetApi#createDvir")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FleetApi#createDvir")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **kotlin.String**| Samsara API access token. | [default to null]
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
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FleetApi()
val accessToken : kotlin.String = accessToken_example // kotlin.String | Samsara API access token.
val vehicleId : kotlin.Long = 789 // kotlin.Long | ID of the vehicle with the associated routes.
val createDispatchRouteParams : DispatchRouteCreate =  // DispatchRouteCreate | 
try {
    val result : DispatchRoute = apiInstance.createVehicleDispatchRoute(accessToken, vehicleId, createDispatchRouteParams)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FleetApi#createVehicleDispatchRoute")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FleetApi#createVehicleDispatchRoute")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **kotlin.String**| Samsara API access token. | [default to null]
 **vehicleId** | **kotlin.Long**| ID of the vehicle with the associated routes. | [default to null]
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
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FleetApi()
val accessToken : kotlin.String = accessToken_example // kotlin.String | Samsara API access token.
val driverIdOrExternalId : kotlin.String = driverIdOrExternalId_example // kotlin.String | ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
try {
    apiInstance.deactivateDriver(accessToken, driverIdOrExternalId)
} catch (e: ClientException) {
    println("4xx response calling FleetApi#deactivateDriver")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FleetApi#deactivateDriver")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **kotlin.String**| Samsara API access token. | [default to null]
 **driverIdOrExternalId** | **kotlin.String**| ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. | [default to null]

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
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FleetApi()
val accessToken : kotlin.String = accessToken_example // kotlin.String | Samsara API access token.
val routeId : kotlin.Long = 789 // kotlin.Long | ID of the dispatch route.
try {
    apiInstance.deleteDispatchRouteById(accessToken, routeId)
} catch (e: ClientException) {
    println("4xx response calling FleetApi#deleteDispatchRouteById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FleetApi#deleteDispatchRouteById")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **kotlin.String**| Samsara API access token. | [default to null]
 **routeId** | **kotlin.Long**| ID of the dispatch route. | [default to null]

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
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FleetApi()
val accessToken : kotlin.String = accessToken_example // kotlin.String | Samsara API access token.
val addressId : kotlin.Long = 789 // kotlin.Long | ID of the address/geofence
try {
    apiInstance.deleteOrganizationAddress(accessToken, addressId)
} catch (e: ClientException) {
    println("4xx response calling FleetApi#deleteOrganizationAddress")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FleetApi#deleteOrganizationAddress")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **kotlin.String**| Samsara API access token. | [default to null]
 **addressId** | **kotlin.Long**| ID of the address/geofence | [default to null]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="fetchAllDispatchRoutes"></a>
# **fetchAllDispatchRoutes**
> kotlin.Array&lt;DispatchRoute&gt; fetchAllDispatchRoutes(accessToken, groupId, endTime, duration)

/fleet/dispatch/routes

Fetch all of the dispatch routes for the group.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FleetApi()
val accessToken : kotlin.String = accessToken_example // kotlin.String | Samsara API access token.
val groupId : kotlin.Long = 789 // kotlin.Long | Optional group ID if the organization has multiple groups (uncommon).
val endTime : kotlin.Long = 789 // kotlin.Long | Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
val duration : kotlin.Long = 789 // kotlin.Long | Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
try {
    val result : kotlin.Array<DispatchRoute> = apiInstance.fetchAllDispatchRoutes(accessToken, groupId, endTime, duration)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FleetApi#fetchAllDispatchRoutes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FleetApi#fetchAllDispatchRoutes")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **kotlin.String**| Samsara API access token. | [default to null]
 **groupId** | **kotlin.Long**| Optional group ID if the organization has multiple groups (uncommon). | [optional] [default to null]
 **endTime** | **kotlin.Long**| Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. | [optional] [default to null]
 **duration** | **kotlin.Long**| Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. | [optional] [default to null]

### Return type

[**kotlin.Array&lt;DispatchRoute&gt;**](DispatchRoute.md)

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
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FleetApi()
val accessToken : kotlin.String = accessToken_example // kotlin.String | Samsara API access token.
val groupId : kotlin.Long = 789 // kotlin.Long | Optional group ID if the organization has multiple groups (uncommon).
val sequenceId : kotlin.String = sequenceId_example // kotlin.String | Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours.
val include : kotlin.String = include_example // kotlin.String | Optionally set include=route to include route object in response payload.
try {
    val result : AllRouteJobUpdates = apiInstance.fetchAllRouteJobUpdates(accessToken, groupId, sequenceId, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FleetApi#fetchAllRouteJobUpdates")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FleetApi#fetchAllRouteJobUpdates")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **kotlin.String**| Samsara API access token. | [default to null]
 **groupId** | **kotlin.Long**| Optional group ID if the organization has multiple groups (uncommon). | [optional] [default to null]
 **sequenceId** | **kotlin.String**| Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours. | [optional] [default to null]
 **include** | **kotlin.String**| Optionally set include&#x3D;route to include route object in response payload. | [optional] [default to null]

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
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FleetApi()
val accessToken : kotlin.String = accessToken_example // kotlin.String | Samsara API access token.
val groupId : kotlin.Long = 789 // kotlin.Long | Optional group ID if the organization has multiple groups (uncommon).
try {
    val result : InlineResponse2001 = apiInstance.getAllAssetCurrentLocations(accessToken, groupId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FleetApi#getAllAssetCurrentLocations")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FleetApi#getAllAssetCurrentLocations")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **kotlin.String**| Samsara API access token. | [default to null]
 **groupId** | **kotlin.Long**| Optional group ID if the organization has multiple groups (uncommon). | [optional] [default to null]

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
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FleetApi()
val accessToken : kotlin.String = accessToken_example // kotlin.String | Samsara API access token.
val groupId : kotlin.Long = 789 // kotlin.Long | Optional group ID if the organization has multiple groups (uncommon).
try {
    val result : InlineResponse200 = apiInstance.getAllAssets(accessToken, groupId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FleetApi#getAllAssets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FleetApi#getAllAssets")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **kotlin.String**| Samsara API access token. | [default to null]
 **groupId** | **kotlin.Long**| Optional group ID if the organization has multiple groups (uncommon). | [optional] [default to null]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAllDeactivatedDrivers"></a>
# **getAllDeactivatedDrivers**
> kotlin.Array&lt;Driver&gt; getAllDeactivatedDrivers(accessToken, groupId)

/fleet/drivers/inactive

Fetch all deactivated drivers for the group.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FleetApi()
val accessToken : kotlin.String = accessToken_example // kotlin.String | Samsara API access token.
val groupId : kotlin.Long = 789 // kotlin.Long | Optional group ID if the organization has multiple groups (uncommon).
try {
    val result : kotlin.Array<Driver> = apiInstance.getAllDeactivatedDrivers(accessToken, groupId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FleetApi#getAllDeactivatedDrivers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FleetApi#getAllDeactivatedDrivers")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **kotlin.String**| Samsara API access token. | [default to null]
 **groupId** | **kotlin.Long**| Optional group ID if the organization has multiple groups (uncommon). | [optional] [default to null]

### Return type

[**kotlin.Array&lt;Driver&gt;**](Driver.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAssetLocation"></a>
# **getAssetLocation**
> kotlin.Array&lt;kotlin.Any&gt; getAssetLocation(accessToken, assetId, startMs, endMs)

/fleet/assets/{assetId:[0-9]+}/locations

Fetch the historical locations for the asset.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FleetApi()
val accessToken : kotlin.String = accessToken_example // kotlin.String | Samsara API access token.
val assetId : kotlin.Long = 789 // kotlin.Long | ID of the asset
val startMs : kotlin.Long = 789 // kotlin.Long | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
val endMs : kotlin.Long = 789 // kotlin.Long | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
try {
    val result : kotlin.Array<kotlin.Any> = apiInstance.getAssetLocation(accessToken, assetId, startMs, endMs)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FleetApi#getAssetLocation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FleetApi#getAssetLocation")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **kotlin.String**| Samsara API access token. | [default to null]
 **assetId** | **kotlin.Long**| ID of the asset | [default to null]
 **startMs** | **kotlin.Long**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. | [default to null]
 **endMs** | **kotlin.Long**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. | [default to null]

### Return type

[**kotlin.Array&lt;kotlin.Any&gt;**](kotlin.Any.md)

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
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FleetApi()
val accessToken : kotlin.String = accessToken_example // kotlin.String | Samsara API access token.
val assetId : kotlin.Long = 789 // kotlin.Long | ID of the asset
val startMs : kotlin.Long = 789 // kotlin.Long | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
val endMs : kotlin.Long = 789 // kotlin.Long | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
try {
    val result : AssetReeferResponse = apiInstance.getAssetReefer(accessToken, assetId, startMs, endMs)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FleetApi#getAssetReefer")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FleetApi#getAssetReefer")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **kotlin.String**| Samsara API access token. | [default to null]
 **assetId** | **kotlin.Long**| ID of the asset | [default to null]
 **startMs** | **kotlin.Long**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. | [default to null]
 **endMs** | **kotlin.Long**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. | [default to null]

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
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FleetApi()
val accessToken : kotlin.String = accessToken_example // kotlin.String | Samsara API access token.
val driverIdOrExternalId : kotlin.String = driverIdOrExternalId_example // kotlin.String | ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
try {
    val result : Driver = apiInstance.getDeactivatedDriverById(accessToken, driverIdOrExternalId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FleetApi#getDeactivatedDriverById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FleetApi#getDeactivatedDriverById")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **kotlin.String**| Samsara API access token. | [default to null]
 **driverIdOrExternalId** | **kotlin.String**| ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. | [default to null]

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
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FleetApi()
val accessToken : kotlin.String = accessToken_example // kotlin.String | Samsara API access token.
val routeId : kotlin.Long = 789 // kotlin.Long | ID of the dispatch route.
try {
    val result : DispatchRoute = apiInstance.getDispatchRouteById(accessToken, routeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FleetApi#getDispatchRouteById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FleetApi#getDispatchRouteById")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **kotlin.String**| Samsara API access token. | [default to null]
 **routeId** | **kotlin.Long**| ID of the dispatch route. | [default to null]

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
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FleetApi()
val accessToken : kotlin.String = accessToken_example // kotlin.String | Samsara API access token.
val routeId : kotlin.Long = 789 // kotlin.Long | ID of the route with history.
val startTime : kotlin.Long = 789 // kotlin.Long | Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0.
val endTime : kotlin.Long = 789 // kotlin.Long | Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs.
try {
    val result : DispatchRouteHistory = apiInstance.getDispatchRouteHistory(accessToken, routeId, startTime, endTime)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FleetApi#getDispatchRouteHistory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FleetApi#getDispatchRouteHistory")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **kotlin.String**| Samsara API access token. | [default to null]
 **routeId** | **kotlin.Long**| ID of the route with history. | [default to null]
 **startTime** | **kotlin.Long**| Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0. | [optional] [default to null]
 **endTime** | **kotlin.Long**| Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs. | [optional] [default to null]

### Return type

[**DispatchRouteHistory**](DispatchRouteHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDispatchRoutesByDriverId"></a>
# **getDispatchRoutesByDriverId**
> kotlin.Array&lt;DispatchRoute&gt; getDispatchRoutesByDriverId(accessToken, driverId, endTime, duration)

/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes

Fetch all of the dispatch routes for a given driver.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FleetApi()
val accessToken : kotlin.String = accessToken_example // kotlin.String | Samsara API access token.
val driverId : kotlin.Long = 789 // kotlin.Long | ID of the driver with the associated routes.
val endTime : kotlin.Long = 789 // kotlin.Long | Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
val duration : kotlin.Long = 789 // kotlin.Long | Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
try {
    val result : kotlin.Array<DispatchRoute> = apiInstance.getDispatchRoutesByDriverId(accessToken, driverId, endTime, duration)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FleetApi#getDispatchRoutesByDriverId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FleetApi#getDispatchRoutesByDriverId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **kotlin.String**| Samsara API access token. | [default to null]
 **driverId** | **kotlin.Long**| ID of the driver with the associated routes. | [default to null]
 **endTime** | **kotlin.Long**| Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. | [optional] [default to null]
 **duration** | **kotlin.Long**| Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. | [optional] [default to null]

### Return type

[**kotlin.Array&lt;DispatchRoute&gt;**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDispatchRoutesByVehicleId"></a>
# **getDispatchRoutesByVehicleId**
> kotlin.Array&lt;DispatchRoute&gt; getDispatchRoutesByVehicleId(accessToken, vehicleId, endTime, duration)

/fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes

Fetch all of the dispatch routes for a given vehicle.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FleetApi()
val accessToken : kotlin.String = accessToken_example // kotlin.String | Samsara API access token.
val vehicleId : kotlin.Long = 789 // kotlin.Long | ID of the vehicle with the associated routes.
val endTime : kotlin.Long = 789 // kotlin.Long | Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
val duration : kotlin.Long = 789 // kotlin.Long | Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
try {
    val result : kotlin.Array<DispatchRoute> = apiInstance.getDispatchRoutesByVehicleId(accessToken, vehicleId, endTime, duration)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FleetApi#getDispatchRoutesByVehicleId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FleetApi#getDispatchRoutesByVehicleId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **kotlin.String**| Samsara API access token. | [default to null]
 **vehicleId** | **kotlin.Long**| ID of the vehicle with the associated routes. | [default to null]
 **endTime** | **kotlin.Long**| Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. | [optional] [default to null]
 **duration** | **kotlin.Long**| Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. | [optional] [default to null]

### Return type

[**kotlin.Array&lt;DispatchRoute&gt;**](DispatchRoute.md)

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
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FleetApi()
val accessToken : kotlin.String = accessToken_example // kotlin.String | Samsara API access token.
val driverIdOrExternalId : kotlin.String = driverIdOrExternalId_example // kotlin.String | ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
try {
    val result : Driver = apiInstance.getDriverById(accessToken, driverIdOrExternalId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FleetApi#getDriverById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FleetApi#getDriverById")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **kotlin.String**| Samsara API access token. | [default to null]
 **driverIdOrExternalId** | **kotlin.String**| ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. | [default to null]

### Return type

[**Driver**](Driver.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDriverDocumentTypesByOrgId"></a>
# **getDriverDocumentTypesByOrgId**
> kotlin.Array&lt;DocumentType&gt; getDriverDocumentTypesByOrgId()

/fleet/drivers/document_types

Fetch all of the document types.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FleetApi()
try {
    val result : kotlin.Array<DocumentType> = apiInstance.getDriverDocumentTypesByOrgId()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FleetApi#getDriverDocumentTypesByOrgId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FleetApi#getDriverDocumentTypesByOrgId")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;DocumentType&gt;**](DocumentType.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDriverDocumentsByOrgId"></a>
# **getDriverDocumentsByOrgId**
> kotlin.Array&lt;Document&gt; getDriverDocumentsByOrgId(accessToken, endMs, durationMs)

/fleet/drivers/documents

Fetch all of the documents.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FleetApi()
val accessToken : kotlin.String = accessToken_example // kotlin.String | Samsara API access token.
val endMs : kotlin.Long = 789 // kotlin.Long | Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now.
val durationMs : kotlin.Long = 789 // kotlin.Long | Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours.
try {
    val result : kotlin.Array<Document> = apiInstance.getDriverDocumentsByOrgId(accessToken, endMs, durationMs)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FleetApi#getDriverDocumentsByOrgId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FleetApi#getDriverDocumentsByOrgId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **kotlin.String**| Samsara API access token. | [default to null]
 **endMs** | **kotlin.Long**| Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now. | [optional] [default to null]
 **durationMs** | **kotlin.Long**| Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours. | [optional] [default to null]

### Return type

[**kotlin.Array&lt;Document&gt;**](Document.md)

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
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FleetApi()
val driverId : kotlin.Long = 789 // kotlin.Long | ID of the driver
val accessToken : kotlin.String = accessToken_example // kotlin.String | Samsara API access token.
val startMs : kotlin.Long = 789 // kotlin.Long | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
val endMs : kotlin.Long = 789 // kotlin.Long | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
try {
    val result : DriverSafetyScoreResponse = apiInstance.getDriverSafetyScore(driverId, accessToken, startMs, endMs)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FleetApi#getDriverSafetyScore")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FleetApi#getDriverSafetyScore")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **driverId** | **kotlin.Long**| ID of the driver | [default to null]
 **accessToken** | **kotlin.String**| Samsara API access token. | [default to null]
 **startMs** | **kotlin.Long**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. | [default to null]
 **endMs** | **kotlin.Long**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. | [default to null]

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
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FleetApi()
val accessToken : kotlin.String = accessToken_example // kotlin.String | Samsara API access token.
val endMs : kotlin.Int = 56 // kotlin.Int | time in millis until the last dvir log.
val durationMs : kotlin.Int = 56 // kotlin.Int | time in millis which corresponds to the duration before the end_ms.
val groupId : kotlin.Int = 56 // kotlin.Int | Group ID to query.
try {
    val result : DvirListResponse = apiInstance.getDvirs(accessToken, endMs, durationMs, groupId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FleetApi#getDvirs")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FleetApi#getDvirs")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **kotlin.String**| Samsara API access token. | [default to null]
 **endMs** | **kotlin.Int**| time in millis until the last dvir log. | [default to null]
 **durationMs** | **kotlin.Int**| time in millis which corresponds to the duration before the end_ms. | [default to null]
 **groupId** | **kotlin.Int**| Group ID to query. | [optional] [default to null]

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
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FleetApi()
val accessToken : kotlin.String = accessToken_example // kotlin.String | Samsara API access token.
val groupDriversParam : InlineObject3 =  // InlineObject3 | 
try {
    val result : DriversResponse = apiInstance.getFleetDrivers(accessToken, groupDriversParam)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FleetApi#getFleetDrivers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FleetApi#getFleetDrivers")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **kotlin.String**| Samsara API access token. | [default to null]
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
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FleetApi()
val accessToken : kotlin.String = accessToken_example // kotlin.String | Samsara API access token.
val driverId : kotlin.Long = 789 // kotlin.Long | ID of the driver with HOS logs.
val hosLogsParam : InlineObject6 =  // InlineObject6 | 
try {
    val result : DriverDailyLogResponse = apiInstance.getFleetDriversHosDailyLogs(accessToken, driverId, hosLogsParam)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FleetApi#getFleetDriversHosDailyLogs")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FleetApi#getFleetDriversHosDailyLogs")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **kotlin.String**| Samsara API access token. | [default to null]
 **driverId** | **kotlin.Long**| ID of the driver with HOS logs. | [default to null]
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
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FleetApi()
val accessToken : kotlin.String = accessToken_example // kotlin.String | Samsara API access token.
val driversSummaryParam : InlineObject5 =  // InlineObject5 | 
val snapToDayBounds : kotlin.Boolean = true // kotlin.Boolean | Snap query result to HOS day boundaries.
try {
    val result : DriversSummaryResponse = apiInstance.getFleetDriversSummary(accessToken, driversSummaryParam, snapToDayBounds)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FleetApi#getFleetDriversSummary")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FleetApi#getFleetDriversSummary")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **kotlin.String**| Samsara API access token. | [default to null]
 **driversSummaryParam** | [**InlineObject5**](InlineObject5.md)|  |
 **snapToDayBounds** | **kotlin.Boolean**| Snap query result to HOS day boundaries. | [optional] [default to null]

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
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FleetApi()
val accessToken : kotlin.String = accessToken_example // kotlin.String | Samsara API access token.
val hosAuthenticationLogsParam : InlineObject7 =  // InlineObject7 | 
try {
    val result : HosAuthenticationLogsResponse = apiInstance.getFleetHosAuthenticationLogs(accessToken, hosAuthenticationLogsParam)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FleetApi#getFleetHosAuthenticationLogs")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FleetApi#getFleetHosAuthenticationLogs")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **kotlin.String**| Samsara API access token. | [default to null]
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
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FleetApi()
val accessToken : kotlin.String = accessToken_example // kotlin.String | Samsara API access token.
val hosLogsParam : InlineObject8 =  // InlineObject8 | 
try {
    val result : HosLogsResponse = apiInstance.getFleetHosLogs(accessToken, hosLogsParam)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FleetApi#getFleetHosLogs")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FleetApi#getFleetHosLogs")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **kotlin.String**| Samsara API access token. | [default to null]
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
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FleetApi()
val accessToken : kotlin.String = accessToken_example // kotlin.String | Samsara API access token.
val hosLogsParam : InlineObject9 =  // InlineObject9 | 
try {
    val result : HosLogsSummaryResponse = apiInstance.getFleetHosLogsSummary(accessToken, hosLogsParam)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FleetApi#getFleetHosLogsSummary")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FleetApi#getFleetHosLogsSummary")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **kotlin.String**| Samsara API access token. | [default to null]
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
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FleetApi()
val accessToken : kotlin.String = accessToken_example // kotlin.String | Samsara API access token.
val groupParam : InlineObject11 =  // InlineObject11 | 
try {
    val result : InlineResponse2003 = apiInstance.getFleetLocations(accessToken, groupParam)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FleetApi#getFleetLocations")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FleetApi#getFleetLocations")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **kotlin.String**| Samsara API access token. | [default to null]
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
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FleetApi()
val accessToken : kotlin.String = accessToken_example // kotlin.String | Samsara API access token.
val groupParam : InlineObject13 =  // InlineObject13 | 
try {
    val result : InlineResponse2004 = apiInstance.getFleetMaintenanceList(accessToken, groupParam)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FleetApi#getFleetMaintenanceList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FleetApi#getFleetMaintenanceList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **kotlin.String**| Samsara API access token. | [default to null]
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
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FleetApi()
val accessToken : kotlin.String = accessToken_example // kotlin.String | Samsara API access token.
val tripsParam : InlineObject15 =  // InlineObject15 | 
try {
    val result : TripResponse = apiInstance.getFleetTrips(accessToken, tripsParam)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FleetApi#getFleetTrips")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FleetApi#getFleetTrips")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **kotlin.String**| Samsara API access token. | [default to null]
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
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FleetApi()
val accessToken : kotlin.String = accessToken_example // kotlin.String | Samsara API access token.
val vehicleIdOrExternalId : kotlin.String = vehicleIdOrExternalId_example // kotlin.String | ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.
try {
    val result : FleetVehicleResponse = apiInstance.getFleetVehicle(accessToken, vehicleIdOrExternalId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FleetApi#getFleetVehicle")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FleetApi#getFleetVehicle")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **kotlin.String**| Samsara API access token. | [default to null]
 **vehicleIdOrExternalId** | **kotlin.String**| ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. | [default to null]

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
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FleetApi()
val accessToken : kotlin.String = accessToken_example // kotlin.String | Samsara API access token.
val addressId : kotlin.Long = 789 // kotlin.Long | ID of the address/geofence
try {
    val result : Address = apiInstance.getOrganizationAddress(accessToken, addressId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FleetApi#getOrganizationAddress")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FleetApi#getOrganizationAddress")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **kotlin.String**| Samsara API access token. | [default to null]
 **addressId** | **kotlin.Long**| ID of the address/geofence | [default to null]

### Return type

[**Address**](Address.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOrganizationAddresses"></a>
# **getOrganizationAddresses**
> kotlin.Array&lt;Address&gt; getOrganizationAddresses(accessToken)

/addresses

Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FleetApi()
val accessToken : kotlin.String = accessToken_example // kotlin.String | Samsara API access token.
try {
    val result : kotlin.Array<Address> = apiInstance.getOrganizationAddresses(accessToken)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FleetApi#getOrganizationAddresses")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FleetApi#getOrganizationAddresses")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **kotlin.String**| Samsara API access token. | [default to null]

### Return type

[**kotlin.Array&lt;Address&gt;**](Address.md)

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
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FleetApi()
val accessToken : kotlin.String = accessToken_example // kotlin.String | Samsara API access token.
val contactId : kotlin.Long = 789 // kotlin.Long | ID of the contact
try {
    val result : Contact = apiInstance.getOrganizationContact(accessToken, contactId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FleetApi#getOrganizationContact")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FleetApi#getOrganizationContact")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **kotlin.String**| Samsara API access token. | [default to null]
 **contactId** | **kotlin.Long**| ID of the contact | [default to null]

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
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FleetApi()
val vehicleId : kotlin.Long = 789 // kotlin.Long | ID of the vehicle
val accessToken : kotlin.String = accessToken_example // kotlin.String | Samsara API access token.
val timestamp : kotlin.Long = 789 // kotlin.Long | Timestamp in milliseconds representing the timestamp of a harsh event.
try {
    val result : VehicleHarshEventResponse = apiInstance.getVehicleHarshEvent(vehicleId, accessToken, timestamp)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FleetApi#getVehicleHarshEvent")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FleetApi#getVehicleHarshEvent")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **kotlin.Long**| ID of the vehicle | [default to null]
 **accessToken** | **kotlin.String**| Samsara API access token. | [default to null]
 **timestamp** | **kotlin.Long**| Timestamp in milliseconds representing the timestamp of a harsh event. | [default to null]

### Return type

[**VehicleHarshEventResponse**](VehicleHarshEventResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVehicleLocations"></a>
# **getVehicleLocations**
> kotlin.Array&lt;FleetVehicleLocation&gt; getVehicleLocations(accessToken, vehicleId, startMs, endMs)

/fleet/vehicles/{vehicle_id:[0-9]+}/locations

Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FleetApi()
val accessToken : kotlin.String = accessToken_example // kotlin.String | Samsara API access token.
val vehicleId : kotlin.Long = 789 // kotlin.Long | ID of the vehicle with the associated routes.
val startMs : kotlin.Long = 789 // kotlin.Long | Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour)
val endMs : kotlin.Long = 789 // kotlin.Long | Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour)
try {
    val result : kotlin.Array<FleetVehicleLocation> = apiInstance.getVehicleLocations(accessToken, vehicleId, startMs, endMs)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FleetApi#getVehicleLocations")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FleetApi#getVehicleLocations")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **kotlin.String**| Samsara API access token. | [default to null]
 **vehicleId** | **kotlin.Long**| ID of the vehicle with the associated routes. | [default to null]
 **startMs** | **kotlin.Long**| Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour) | [default to null]
 **endMs** | **kotlin.Long**| Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour) | [default to null]

### Return type

[**kotlin.Array&lt;FleetVehicleLocation&gt;**](FleetVehicleLocation.md)

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
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FleetApi()
val vehicleId : kotlin.Long = 789 // kotlin.Long | ID of the vehicle
val accessToken : kotlin.String = accessToken_example // kotlin.String | Samsara API access token.
val startMs : kotlin.Long = 789 // kotlin.Long | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
val endMs : kotlin.Long = 789 // kotlin.Long | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
try {
    val result : VehicleSafetyScoreResponse = apiInstance.getVehicleSafetyScore(vehicleId, accessToken, startMs, endMs)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FleetApi#getVehicleSafetyScore")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FleetApi#getVehicleSafetyScore")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **kotlin.Long**| ID of the vehicle | [default to null]
 **accessToken** | **kotlin.String**| Samsara API access token. | [default to null]
 **startMs** | **kotlin.Long**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. | [default to null]
 **endMs** | **kotlin.Long**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. | [default to null]

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
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FleetApi()
val accessToken : kotlin.String = accessToken_example // kotlin.String | Samsara API access token.
val startMs : kotlin.Int = 56 // kotlin.Int | Time in Unix epoch milliseconds for the start of the query.
val endMs : kotlin.Int = 56 // kotlin.Int | Time in Unix epoch milliseconds for the end of the query.
val series : kotlin.String = series_example // kotlin.String | Comma-separated list of stat types. Options are engineState, auxInput1, and auxInput2. If this parameter is excluded, all 3 stat types will be returned. Example: series=engineState,auxInput2
val tagIds : kotlin.String = tagIds_example // kotlin.String | Comma-separated list of tag ids. Example: tagIds=1,2,3
val startingAfter : kotlin.String = startingAfter_example // kotlin.String | Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'endingBefore' parameter.
val endingBefore : kotlin.String = endingBefore_example // kotlin.String | Pagination parameter indicating the cursor position to return results before. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'startingAfter' parameter.
val limit : kotlin.Long = 789 // kotlin.Long | Pagination parameter indicating the number of results to return in this request. Used in conjunction with either 'startingAfter' or 'endingBefore'.
try {
    val result : InlineResponse2005 = apiInstance.getVehicleStats(accessToken, startMs, endMs, series, tagIds, startingAfter, endingBefore, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FleetApi#getVehicleStats")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FleetApi#getVehicleStats")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **kotlin.String**| Samsara API access token. | [default to null]
 **startMs** | **kotlin.Int**| Time in Unix epoch milliseconds for the start of the query. | [default to null]
 **endMs** | **kotlin.Int**| Time in Unix epoch milliseconds for the end of the query. | [default to null]
 **series** | **kotlin.String**| Comma-separated list of stat types. Options are engineState, auxInput1, and auxInput2. If this parameter is excluded, all 3 stat types will be returned. Example: series&#x3D;engineState,auxInput2 | [optional] [default to null] [enum: engineState, auxInput1, auxInput2]
 **tagIds** | **kotlin.String**| Comma-separated list of tag ids. Example: tagIds&#x3D;1,2,3 | [optional] [default to null]
 **startingAfter** | **kotlin.String**| Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter. | [optional] [default to null]
 **endingBefore** | **kotlin.String**| Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter. | [optional] [default to null]
 **limit** | **kotlin.Long**| Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;. | [optional] [default to null]

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVehiclesLocations"></a>
# **getVehiclesLocations**
> kotlin.Array&lt;kotlin.Any&gt; getVehiclesLocations(accessToken, startMs, endMs)

/fleet/vehicles/locations

Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FleetApi()
val accessToken : kotlin.String = accessToken_example // kotlin.String | Samsara API access token.
val startMs : kotlin.Int = 56 // kotlin.Int | Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes)
val endMs : kotlin.Int = 56 // kotlin.Int | Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes)
try {
    val result : kotlin.Array<kotlin.Any> = apiInstance.getVehiclesLocations(accessToken, startMs, endMs)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FleetApi#getVehiclesLocations")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FleetApi#getVehiclesLocations")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **kotlin.String**| Samsara API access token. | [default to null]
 **startMs** | **kotlin.Int**| Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes) | [default to null]
 **endMs** | **kotlin.Int**| Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes) | [default to null]

### Return type

[**kotlin.Array&lt;kotlin.Any&gt;**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listContacts"></a>
# **listContacts**
> kotlin.Array&lt;Contact&gt; listContacts(accessToken)

/contacts

Fetch all contacts for the organization.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FleetApi()
val accessToken : kotlin.String = accessToken_example // kotlin.String | Samsara API access token.
try {
    val result : kotlin.Array<Contact> = apiInstance.listContacts(accessToken)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FleetApi#listContacts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FleetApi#listContacts")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **kotlin.String**| Samsara API access token. | [default to null]

### Return type

[**kotlin.Array&lt;Contact&gt;**](Contact.md)

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
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FleetApi()
val accessToken : kotlin.String = accessToken_example // kotlin.String | Samsara API access token.
val groupParam : InlineObject10 =  // InlineObject10 | 
val startingAfter : kotlin.String = startingAfter_example // kotlin.String | Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'endingBefore' parameter.
val endingBefore : kotlin.String = endingBefore_example // kotlin.String | Pagination parameter indicating the cursor position to return results before. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'startingAfter' parameter.
val limit : kotlin.Long = 789 // kotlin.Long | Pagination parameter indicating the number of results to return in this request. Used in conjunction with either 'startingAfter' or 'endingBefore'.
try {
    val result : InlineResponse2002 = apiInstance.listFleet(accessToken, groupParam, startingAfter, endingBefore, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FleetApi#listFleet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FleetApi#listFleet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **kotlin.String**| Samsara API access token. | [default to null]
 **groupParam** | [**InlineObject10**](InlineObject10.md)|  |
 **startingAfter** | **kotlin.String**| Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter. | [optional] [default to null]
 **endingBefore** | **kotlin.String**| Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter. | [optional] [default to null]
 **limit** | **kotlin.Long**| Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;. | [optional] [default to null]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="patchFleetVehicle"></a>
# **patchFleetVehicle**
> FleetVehicleResponse patchFleetVehicle(accessToken, vehicleIdOrExternalId, `data`)

/fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FleetApi()
val accessToken : kotlin.String = accessToken_example // kotlin.String | Samsara API access token.
val vehicleIdOrExternalId : kotlin.String = vehicleIdOrExternalId_example // kotlin.String | ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.
val `data` : InlineObject16 =  // InlineObject16 | 
try {
    val result : FleetVehicleResponse = apiInstance.patchFleetVehicle(accessToken, vehicleIdOrExternalId, `data`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FleetApi#patchFleetVehicle")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FleetApi#patchFleetVehicle")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **kotlin.String**| Samsara API access token. | [default to null]
 **vehicleIdOrExternalId** | **kotlin.String**| ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. | [default to null]
 **&#x60;data&#x60;** | [**InlineObject16**](InlineObject16.md)|  |

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
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FleetApi()
val accessToken : kotlin.String = accessToken_example // kotlin.String | Samsara API access token.
val driverIdOrExternalId : kotlin.String = driverIdOrExternalId_example // kotlin.String | ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
val reactivateDriverParam : InlineObject4 =  // InlineObject4 | 
try {
    val result : Driver = apiInstance.reactivateDriverById(accessToken, driverIdOrExternalId, reactivateDriverParam)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FleetApi#reactivateDriverById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FleetApi#reactivateDriverById")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **kotlin.String**| Samsara API access token. | [default to null]
 **driverIdOrExternalId** | **kotlin.String**| ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. | [default to null]
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
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FleetApi()
val accessToken : kotlin.String = accessToken_example // kotlin.String | Samsara API access token.
val routeId : kotlin.Long = 789 // kotlin.Long | ID of the dispatch route.
val updateDispatchRouteParams : DispatchRoute =  // DispatchRoute | 
try {
    val result : DispatchRoute = apiInstance.updateDispatchRouteById(accessToken, routeId, updateDispatchRouteParams)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FleetApi#updateDispatchRouteById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FleetApi#updateDispatchRouteById")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **kotlin.String**| Samsara API access token. | [default to null]
 **routeId** | **kotlin.Long**| ID of the dispatch route. | [default to null]
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
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FleetApi()
val accessToken : kotlin.String = accessToken_example // kotlin.String | Samsara API access token.
val addressId : kotlin.Long = 789 // kotlin.Long | ID of the address/geofence
val address : InlineObject1 =  // InlineObject1 | 
try {
    apiInstance.updateOrganizationAddress(accessToken, addressId, address)
} catch (e: ClientException) {
    println("4xx response calling FleetApi#updateOrganizationAddress")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FleetApi#updateOrganizationAddress")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **kotlin.String**| Samsara API access token. | [default to null]
 **addressId** | **kotlin.Long**| ID of the address/geofence | [default to null]
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
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FleetApi()
val accessToken : kotlin.String = accessToken_example // kotlin.String | Samsara API access token.
val vehicleUpdateParam : InlineObject14 =  // InlineObject14 | 
try {
    apiInstance.updateVehicles(accessToken, vehicleUpdateParam)
} catch (e: ClientException) {
    println("4xx response calling FleetApi#updateVehicles")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FleetApi#updateVehicles")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **kotlin.String**| Samsara API access token. | [default to null]
 **vehicleUpdateParam** | [**InlineObject14**](InlineObject14.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


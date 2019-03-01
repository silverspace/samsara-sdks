# RoutesApi

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDispatchRoute**](RoutesApi.md#createDispatchRoute) | **POST** /fleet/dispatch/routes | /fleet/dispatch/routes
[**createDriverDispatchRoute**](RoutesApi.md#createDriverDispatchRoute) | **POST** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
[**createVehicleDispatchRoute**](RoutesApi.md#createVehicleDispatchRoute) | **POST** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
[**deleteDispatchRouteById**](RoutesApi.md#deleteDispatchRouteById) | **DELETE** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
[**fetchAllDispatchRoutes**](RoutesApi.md#fetchAllDispatchRoutes) | **GET** /fleet/dispatch/routes | /fleet/dispatch/routes
[**fetchAllRouteJobUpdates**](RoutesApi.md#fetchAllRouteJobUpdates) | **GET** /fleet/dispatch/routes/job_updates | /fleet/dispatch/routes/job_updates
[**getDispatchRouteById**](RoutesApi.md#getDispatchRouteById) | **GET** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}
[**getDispatchRouteHistory**](RoutesApi.md#getDispatchRouteHistory) | **GET** /fleet/dispatch/routes/{route_id}/history | /fleet/dispatch/routes/{route_id:[0-9]+}/history
[**getDispatchRoutesByDriverId**](RoutesApi.md#getDispatchRoutesByDriverId) | **GET** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
[**getDispatchRoutesByVehicleId**](RoutesApi.md#getDispatchRoutesByVehicleId) | **GET** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
[**updateDispatchRouteById**](RoutesApi.md#updateDispatchRouteById) | **PUT** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/


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

val apiInstance = RoutesApi()
val accessToken : kotlin.String = accessToken_example // kotlin.String | Samsara API access token.
val createDispatchRouteParams : DispatchRouteCreate =  // DispatchRouteCreate | 
try {
    val result : DispatchRoute = apiInstance.createDispatchRoute(accessToken, createDispatchRouteParams)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RoutesApi#createDispatchRoute")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RoutesApi#createDispatchRoute")
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

val apiInstance = RoutesApi()
val accessToken : kotlin.String = accessToken_example // kotlin.String | Samsara API access token.
val driverId : kotlin.Long = 789 // kotlin.Long | ID of the driver with the associated routes.
val createDispatchRouteParams : DispatchRouteCreate =  // DispatchRouteCreate | 
try {
    val result : DispatchRoute = apiInstance.createDriverDispatchRoute(accessToken, driverId, createDispatchRouteParams)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RoutesApi#createDriverDispatchRoute")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RoutesApi#createDriverDispatchRoute")
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

val apiInstance = RoutesApi()
val accessToken : kotlin.String = accessToken_example // kotlin.String | Samsara API access token.
val vehicleId : kotlin.Long = 789 // kotlin.Long | ID of the vehicle with the associated routes.
val createDispatchRouteParams : DispatchRouteCreate =  // DispatchRouteCreate | 
try {
    val result : DispatchRoute = apiInstance.createVehicleDispatchRoute(accessToken, vehicleId, createDispatchRouteParams)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RoutesApi#createVehicleDispatchRoute")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RoutesApi#createVehicleDispatchRoute")
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

val apiInstance = RoutesApi()
val accessToken : kotlin.String = accessToken_example // kotlin.String | Samsara API access token.
val routeId : kotlin.Long = 789 // kotlin.Long | ID of the dispatch route.
try {
    apiInstance.deleteDispatchRouteById(accessToken, routeId)
} catch (e: ClientException) {
    println("4xx response calling RoutesApi#deleteDispatchRouteById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RoutesApi#deleteDispatchRouteById")
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

val apiInstance = RoutesApi()
val accessToken : kotlin.String = accessToken_example // kotlin.String | Samsara API access token.
val groupId : kotlin.Long = 789 // kotlin.Long | Optional group ID if the organization has multiple groups (uncommon).
val endTime : kotlin.Long = 789 // kotlin.Long | Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
val duration : kotlin.Long = 789 // kotlin.Long | Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
try {
    val result : kotlin.Array<DispatchRoute> = apiInstance.fetchAllDispatchRoutes(accessToken, groupId, endTime, duration)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RoutesApi#fetchAllDispatchRoutes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RoutesApi#fetchAllDispatchRoutes")
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

val apiInstance = RoutesApi()
val accessToken : kotlin.String = accessToken_example // kotlin.String | Samsara API access token.
val groupId : kotlin.Long = 789 // kotlin.Long | Optional group ID if the organization has multiple groups (uncommon).
val sequenceId : kotlin.String = sequenceId_example // kotlin.String | Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours.
val include : kotlin.String = include_example // kotlin.String | Optionally set include=route to include route object in response payload.
try {
    val result : AllRouteJobUpdates = apiInstance.fetchAllRouteJobUpdates(accessToken, groupId, sequenceId, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RoutesApi#fetchAllRouteJobUpdates")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RoutesApi#fetchAllRouteJobUpdates")
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

val apiInstance = RoutesApi()
val accessToken : kotlin.String = accessToken_example // kotlin.String | Samsara API access token.
val routeId : kotlin.Long = 789 // kotlin.Long | ID of the dispatch route.
try {
    val result : DispatchRoute = apiInstance.getDispatchRouteById(accessToken, routeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RoutesApi#getDispatchRouteById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RoutesApi#getDispatchRouteById")
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

val apiInstance = RoutesApi()
val accessToken : kotlin.String = accessToken_example // kotlin.String | Samsara API access token.
val routeId : kotlin.Long = 789 // kotlin.Long | ID of the route with history.
val startTime : kotlin.Long = 789 // kotlin.Long | Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0.
val endTime : kotlin.Long = 789 // kotlin.Long | Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs.
try {
    val result : DispatchRouteHistory = apiInstance.getDispatchRouteHistory(accessToken, routeId, startTime, endTime)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RoutesApi#getDispatchRouteHistory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RoutesApi#getDispatchRouteHistory")
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

val apiInstance = RoutesApi()
val accessToken : kotlin.String = accessToken_example // kotlin.String | Samsara API access token.
val driverId : kotlin.Long = 789 // kotlin.Long | ID of the driver with the associated routes.
val endTime : kotlin.Long = 789 // kotlin.Long | Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
val duration : kotlin.Long = 789 // kotlin.Long | Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
try {
    val result : kotlin.Array<DispatchRoute> = apiInstance.getDispatchRoutesByDriverId(accessToken, driverId, endTime, duration)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RoutesApi#getDispatchRoutesByDriverId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RoutesApi#getDispatchRoutesByDriverId")
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

val apiInstance = RoutesApi()
val accessToken : kotlin.String = accessToken_example // kotlin.String | Samsara API access token.
val vehicleId : kotlin.Long = 789 // kotlin.Long | ID of the vehicle with the associated routes.
val endTime : kotlin.Long = 789 // kotlin.Long | Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
val duration : kotlin.Long = 789 // kotlin.Long | Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
try {
    val result : kotlin.Array<DispatchRoute> = apiInstance.getDispatchRoutesByVehicleId(accessToken, vehicleId, endTime, duration)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RoutesApi#getDispatchRoutesByVehicleId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RoutesApi#getDispatchRoutesByVehicleId")
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

val apiInstance = RoutesApi()
val accessToken : kotlin.String = accessToken_example // kotlin.String | Samsara API access token.
val routeId : kotlin.Long = 789 // kotlin.Long | ID of the dispatch route.
val updateDispatchRouteParams : DispatchRoute =  // DispatchRoute | 
try {
    val result : DispatchRoute = apiInstance.updateDispatchRouteById(accessToken, routeId, updateDispatchRouteParams)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RoutesApi#updateDispatchRouteById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RoutesApi#updateDispatchRouteById")
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


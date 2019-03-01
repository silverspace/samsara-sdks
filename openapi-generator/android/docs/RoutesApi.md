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
```java
// Import classes:
//import org.openapitools.client.api.RoutesApi;

RoutesApi apiInstance = new RoutesApi();
String accessToken = null; // String | Samsara API access token.
DispatchRouteCreate createDispatchRouteParams = new DispatchRouteCreate(); // DispatchRouteCreate | 
try {
    DispatchRoute result = apiInstance.createDispatchRoute(accessToken, createDispatchRouteParams);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutesApi#createDispatchRoute");
    e.printStackTrace();
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

<a name="createDriverDispatchRoute"></a>
# **createDriverDispatchRoute**
> DispatchRoute createDriverDispatchRoute(accessToken, driverId, createDispatchRouteParams)

/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes

Create a new dispatch route for the driver with driver_id.

### Example
```java
// Import classes:
//import org.openapitools.client.api.RoutesApi;

RoutesApi apiInstance = new RoutesApi();
String accessToken = null; // String | Samsara API access token.
Long driverId = null; // Long | ID of the driver with the associated routes.
DispatchRouteCreate createDispatchRouteParams = new DispatchRouteCreate(); // DispatchRouteCreate | 
try {
    DispatchRoute result = apiInstance.createDriverDispatchRoute(accessToken, driverId, createDispatchRouteParams);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutesApi#createDriverDispatchRoute");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | [default to null]
 **driverId** | **Long**| ID of the driver with the associated routes. | [default to null]
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
```java
// Import classes:
//import org.openapitools.client.api.RoutesApi;

RoutesApi apiInstance = new RoutesApi();
String accessToken = null; // String | Samsara API access token.
Long vehicleId = null; // Long | ID of the vehicle with the associated routes.
DispatchRouteCreate createDispatchRouteParams = new DispatchRouteCreate(); // DispatchRouteCreate | 
try {
    DispatchRoute result = apiInstance.createVehicleDispatchRoute(accessToken, vehicleId, createDispatchRouteParams);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutesApi#createVehicleDispatchRoute");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | [default to null]
 **vehicleId** | **Long**| ID of the vehicle with the associated routes. | [default to null]
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
```java
// Import classes:
//import org.openapitools.client.api.RoutesApi;

RoutesApi apiInstance = new RoutesApi();
String accessToken = null; // String | Samsara API access token.
Long routeId = null; // Long | ID of the dispatch route.
try {
    apiInstance.deleteDispatchRouteById(accessToken, routeId);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutesApi#deleteDispatchRouteById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | [default to null]
 **routeId** | **Long**| ID of the dispatch route. | [default to null]

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
//import org.openapitools.client.api.RoutesApi;

RoutesApi apiInstance = new RoutesApi();
String accessToken = null; // String | Samsara API access token.
Long groupId = null; // Long | Optional group ID if the organization has multiple groups (uncommon).
Long endTime = null; // Long | Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
Long duration = null; // Long | Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
try {
    List<DispatchRoute> result = apiInstance.fetchAllDispatchRoutes(accessToken, groupId, endTime, duration);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutesApi#fetchAllDispatchRoutes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | [default to null]
 **groupId** | **Long**| Optional group ID if the organization has multiple groups (uncommon). | [optional] [default to null]
 **endTime** | **Long**| Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. | [optional] [default to null]
 **duration** | **Long**| Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. | [optional] [default to null]

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
//import org.openapitools.client.api.RoutesApi;

RoutesApi apiInstance = new RoutesApi();
String accessToken = null; // String | Samsara API access token.
Long groupId = null; // Long | Optional group ID if the organization has multiple groups (uncommon).
String sequenceId = null; // String | Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours.
String include = null; // String | Optionally set include=route to include route object in response payload.
try {
    AllRouteJobUpdates result = apiInstance.fetchAllRouteJobUpdates(accessToken, groupId, sequenceId, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutesApi#fetchAllRouteJobUpdates");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | [default to null]
 **groupId** | **Long**| Optional group ID if the organization has multiple groups (uncommon). | [optional] [default to null]
 **sequenceId** | **String**| Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours. | [optional] [default to null]
 **include** | **String**| Optionally set include&#x3D;route to include route object in response payload. | [optional] [default to null]

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
```java
// Import classes:
//import org.openapitools.client.api.RoutesApi;

RoutesApi apiInstance = new RoutesApi();
String accessToken = null; // String | Samsara API access token.
Long routeId = null; // Long | ID of the dispatch route.
try {
    DispatchRoute result = apiInstance.getDispatchRouteById(accessToken, routeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutesApi#getDispatchRouteById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | [default to null]
 **routeId** | **Long**| ID of the dispatch route. | [default to null]

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
//import org.openapitools.client.api.RoutesApi;

RoutesApi apiInstance = new RoutesApi();
String accessToken = null; // String | Samsara API access token.
Long routeId = null; // Long | ID of the route with history.
Long startTime = null; // Long | Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0.
Long endTime = null; // Long | Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs.
try {
    DispatchRouteHistory result = apiInstance.getDispatchRouteHistory(accessToken, routeId, startTime, endTime);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutesApi#getDispatchRouteHistory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | [default to null]
 **routeId** | **Long**| ID of the route with history. | [default to null]
 **startTime** | **Long**| Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0. | [optional] [default to null]
 **endTime** | **Long**| Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs. | [optional] [default to null]

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
//import org.openapitools.client.api.RoutesApi;

RoutesApi apiInstance = new RoutesApi();
String accessToken = null; // String | Samsara API access token.
Long driverId = null; // Long | ID of the driver with the associated routes.
Long endTime = null; // Long | Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
Long duration = null; // Long | Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
try {
    List<DispatchRoute> result = apiInstance.getDispatchRoutesByDriverId(accessToken, driverId, endTime, duration);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutesApi#getDispatchRoutesByDriverId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | [default to null]
 **driverId** | **Long**| ID of the driver with the associated routes. | [default to null]
 **endTime** | **Long**| Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. | [optional] [default to null]
 **duration** | **Long**| Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. | [optional] [default to null]

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
//import org.openapitools.client.api.RoutesApi;

RoutesApi apiInstance = new RoutesApi();
String accessToken = null; // String | Samsara API access token.
Long vehicleId = null; // Long | ID of the vehicle with the associated routes.
Long endTime = null; // Long | Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
Long duration = null; // Long | Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
try {
    List<DispatchRoute> result = apiInstance.getDispatchRoutesByVehicleId(accessToken, vehicleId, endTime, duration);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutesApi#getDispatchRoutesByVehicleId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | [default to null]
 **vehicleId** | **Long**| ID of the vehicle with the associated routes. | [default to null]
 **endTime** | **Long**| Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. | [optional] [default to null]
 **duration** | **Long**| Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. | [optional] [default to null]

### Return type

[**List&lt;DispatchRoute&gt;**](DispatchRoute.md)

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
```java
// Import classes:
//import org.openapitools.client.api.RoutesApi;

RoutesApi apiInstance = new RoutesApi();
String accessToken = null; // String | Samsara API access token.
Long routeId = null; // Long | ID of the dispatch route.
DispatchRoute updateDispatchRouteParams = new DispatchRoute(); // DispatchRoute | 
try {
    DispatchRoute result = apiInstance.updateDispatchRouteById(accessToken, routeId, updateDispatchRouteParams);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutesApi#updateDispatchRouteById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | [default to null]
 **routeId** | **Long**| ID of the dispatch route. | [default to null]
 **updateDispatchRouteParams** | [**DispatchRoute**](DispatchRoute.md)|  |

### Return type

[**DispatchRoute**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


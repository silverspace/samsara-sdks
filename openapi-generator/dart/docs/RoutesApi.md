# openapi.api.RoutesApi

## Load the API package
```dart
import 'package:openapi/api.dart';
```

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


# **createDispatchRoute**
> DispatchRoute createDispatchRoute(accessToken, createDispatchRouteParams)

/fleet/dispatch/routes

Create a new dispatch route.

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new RoutesApi();
var accessToken = accessToken_example; // String | Samsara API access token.
var createDispatchRouteParams = new DispatchRouteCreate(); // DispatchRouteCreate | 

try { 
    var result = api_instance.createDispatchRoute(accessToken, createDispatchRouteParams);
    print(result);
} catch (e) {
    print("Exception when calling RoutesApi->createDispatchRoute: $e\n");
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

# **createDriverDispatchRoute**
> DispatchRoute createDriverDispatchRoute(accessToken, driverId, createDispatchRouteParams)

/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes

Create a new dispatch route for the driver with driver_id.

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new RoutesApi();
var accessToken = accessToken_example; // String | Samsara API access token.
var driverId = 789; // int | ID of the driver with the associated routes.
var createDispatchRouteParams = new DispatchRouteCreate(); // DispatchRouteCreate | 

try { 
    var result = api_instance.createDriverDispatchRoute(accessToken, driverId, createDispatchRouteParams);
    print(result);
} catch (e) {
    print("Exception when calling RoutesApi->createDriverDispatchRoute: $e\n");
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

# **createVehicleDispatchRoute**
> DispatchRoute createVehicleDispatchRoute(accessToken, vehicleId, createDispatchRouteParams)

/fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes

Create a new dispatch route for the vehicle with vehicle_id.

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new RoutesApi();
var accessToken = accessToken_example; // String | Samsara API access token.
var vehicleId = 789; // int | ID of the vehicle with the associated routes.
var createDispatchRouteParams = new DispatchRouteCreate(); // DispatchRouteCreate | 

try { 
    var result = api_instance.createVehicleDispatchRoute(accessToken, vehicleId, createDispatchRouteParams);
    print(result);
} catch (e) {
    print("Exception when calling RoutesApi->createVehicleDispatchRoute: $e\n");
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

# **deleteDispatchRouteById**
> deleteDispatchRouteById(accessToken, routeId)

/fleet/dispatch/routes/{route_id:[0-9]+}/

Delete a dispatch route and its associated jobs.

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new RoutesApi();
var accessToken = accessToken_example; // String | Samsara API access token.
var routeId = 789; // int | ID of the dispatch route.

try { 
    api_instance.deleteDispatchRouteById(accessToken, routeId);
} catch (e) {
    print("Exception when calling RoutesApi->deleteDispatchRouteById: $e\n");
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

# **fetchAllDispatchRoutes**
> List<DispatchRoute> fetchAllDispatchRoutes(accessToken, groupId, endTime, duration)

/fleet/dispatch/routes

Fetch all of the dispatch routes for the group.

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new RoutesApi();
var accessToken = accessToken_example; // String | Samsara API access token.
var groupId = 789; // int | Optional group ID if the organization has multiple groups (uncommon).
var endTime = 789; // int | Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
var duration = 789; // int | Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.

try { 
    var result = api_instance.fetchAllDispatchRoutes(accessToken, groupId, endTime, duration);
    print(result);
} catch (e) {
    print("Exception when calling RoutesApi->fetchAllDispatchRoutes: $e\n");
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

var api_instance = new RoutesApi();
var accessToken = accessToken_example; // String | Samsara API access token.
var groupId = 789; // int | Optional group ID if the organization has multiple groups (uncommon).
var sequenceId = sequenceId_example; // String | Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours.
var include = include_example; // String | Optionally set include=route to include route object in response payload.

try { 
    var result = api_instance.fetchAllRouteJobUpdates(accessToken, groupId, sequenceId, include);
    print(result);
} catch (e) {
    print("Exception when calling RoutesApi->fetchAllRouteJobUpdates: $e\n");
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

# **getDispatchRouteById**
> DispatchRoute getDispatchRouteById(accessToken, routeId)

/fleet/dispatch/routes/{route_id:[0-9]+}

Fetch a dispatch route by id.

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new RoutesApi();
var accessToken = accessToken_example; // String | Samsara API access token.
var routeId = 789; // int | ID of the dispatch route.

try { 
    var result = api_instance.getDispatchRouteById(accessToken, routeId);
    print(result);
} catch (e) {
    print("Exception when calling RoutesApi->getDispatchRouteById: $e\n");
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

var api_instance = new RoutesApi();
var accessToken = accessToken_example; // String | Samsara API access token.
var routeId = 789; // int | ID of the route with history.
var startTime = 789; // int | Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0.
var endTime = 789; // int | Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs.

try { 
    var result = api_instance.getDispatchRouteHistory(accessToken, routeId, startTime, endTime);
    print(result);
} catch (e) {
    print("Exception when calling RoutesApi->getDispatchRouteHistory: $e\n");
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

var api_instance = new RoutesApi();
var accessToken = accessToken_example; // String | Samsara API access token.
var driverId = 789; // int | ID of the driver with the associated routes.
var endTime = 789; // int | Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
var duration = 789; // int | Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.

try { 
    var result = api_instance.getDispatchRoutesByDriverId(accessToken, driverId, endTime, duration);
    print(result);
} catch (e) {
    print("Exception when calling RoutesApi->getDispatchRoutesByDriverId: $e\n");
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

var api_instance = new RoutesApi();
var accessToken = accessToken_example; // String | Samsara API access token.
var vehicleId = 789; // int | ID of the vehicle with the associated routes.
var endTime = 789; // int | Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
var duration = 789; // int | Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.

try { 
    var result = api_instance.getDispatchRoutesByVehicleId(accessToken, vehicleId, endTime, duration);
    print(result);
} catch (e) {
    print("Exception when calling RoutesApi->getDispatchRoutesByVehicleId: $e\n");
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

# **updateDispatchRouteById**
> DispatchRoute updateDispatchRouteById(accessToken, routeId, updateDispatchRouteParams)

/fleet/dispatch/routes/{route_id:[0-9]+}/

Update a dispatch route and its associated jobs.

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new RoutesApi();
var accessToken = accessToken_example; // String | Samsara API access token.
var routeId = 789; // int | ID of the dispatch route.
var updateDispatchRouteParams = new DispatchRoute(); // DispatchRoute | 

try { 
    var result = api_instance.updateDispatchRouteById(accessToken, routeId, updateDispatchRouteParams);
    print(result);
} catch (e) {
    print("Exception when calling RoutesApi->updateDispatchRouteById: $e\n");
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


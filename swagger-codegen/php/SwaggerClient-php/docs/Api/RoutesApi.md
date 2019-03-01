# Swagger\Client\RoutesApi

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
> \Swagger\Client\Model\DispatchRoute createDispatchRoute($access_token, $create_dispatch_route_params)

/fleet/dispatch/routes

Create a new dispatch route.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\RoutesApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$access_token = "access_token_example"; // string | Samsara API access token.
$create_dispatch_route_params = new \Swagger\Client\Model\DispatchRouteCreate(); // \Swagger\Client\Model\DispatchRouteCreate | 

try {
    $result = $apiInstance->createDispatchRoute($access_token, $create_dispatch_route_params);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling RoutesApi->createDispatchRoute: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. |
 **create_dispatch_route_params** | [**\Swagger\Client\Model\DispatchRouteCreate**](../Model/DispatchRouteCreate.md)|  |

### Return type

[**\Swagger\Client\Model\DispatchRoute**](../Model/DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createDriverDispatchRoute**
> \Swagger\Client\Model\DispatchRoute createDriverDispatchRoute($access_token, $driver_id, $create_dispatch_route_params)

/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes

Create a new dispatch route for the driver with driver_id.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\RoutesApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$access_token = "access_token_example"; // string | Samsara API access token.
$driver_id = 789; // int | ID of the driver with the associated routes.
$create_dispatch_route_params = new \Swagger\Client\Model\DispatchRouteCreate(); // \Swagger\Client\Model\DispatchRouteCreate | 

try {
    $result = $apiInstance->createDriverDispatchRoute($access_token, $driver_id, $create_dispatch_route_params);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling RoutesApi->createDriverDispatchRoute: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. |
 **driver_id** | **int**| ID of the driver with the associated routes. |
 **create_dispatch_route_params** | [**\Swagger\Client\Model\DispatchRouteCreate**](../Model/DispatchRouteCreate.md)|  |

### Return type

[**\Swagger\Client\Model\DispatchRoute**](../Model/DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createVehicleDispatchRoute**
> \Swagger\Client\Model\DispatchRoute createVehicleDispatchRoute($access_token, $vehicle_id, $create_dispatch_route_params)

/fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes

Create a new dispatch route for the vehicle with vehicle_id.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\RoutesApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$access_token = "access_token_example"; // string | Samsara API access token.
$vehicle_id = 789; // int | ID of the vehicle with the associated routes.
$create_dispatch_route_params = new \Swagger\Client\Model\DispatchRouteCreate(); // \Swagger\Client\Model\DispatchRouteCreate | 

try {
    $result = $apiInstance->createVehicleDispatchRoute($access_token, $vehicle_id, $create_dispatch_route_params);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling RoutesApi->createVehicleDispatchRoute: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. |
 **vehicle_id** | **int**| ID of the vehicle with the associated routes. |
 **create_dispatch_route_params** | [**\Swagger\Client\Model\DispatchRouteCreate**](../Model/DispatchRouteCreate.md)|  |

### Return type

[**\Swagger\Client\Model\DispatchRoute**](../Model/DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteDispatchRouteById**
> deleteDispatchRouteById($access_token, $route_id)

/fleet/dispatch/routes/{route_id:[0-9]+}/

Delete a dispatch route and its associated jobs.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\RoutesApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$access_token = "access_token_example"; // string | Samsara API access token.
$route_id = 789; // int | ID of the dispatch route.

try {
    $apiInstance->deleteDispatchRouteById($access_token, $route_id);
} catch (Exception $e) {
    echo 'Exception when calling RoutesApi->deleteDispatchRouteById: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. |
 **route_id** | **int**| ID of the dispatch route. |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **fetchAllDispatchRoutes**
> \Swagger\Client\Model\DispatchRoutes fetchAllDispatchRoutes($access_token, $group_id, $end_time, $duration)

/fleet/dispatch/routes

Fetch all of the dispatch routes for the group.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\RoutesApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$access_token = "access_token_example"; // string | Samsara API access token.
$group_id = 789; // int | Optional group ID if the organization has multiple groups (uncommon).
$end_time = 789; // int | Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
$duration = 789; // int | Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.

try {
    $result = $apiInstance->fetchAllDispatchRoutes($access_token, $group_id, $end_time, $duration);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling RoutesApi->fetchAllDispatchRoutes: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. |
 **group_id** | **int**| Optional group ID if the organization has multiple groups (uncommon). | [optional]
 **end_time** | **int**| Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. | [optional]
 **duration** | **int**| Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. | [optional]

### Return type

[**\Swagger\Client\Model\DispatchRoutes**](../Model/DispatchRoutes.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **fetchAllRouteJobUpdates**
> \Swagger\Client\Model\AllRouteJobUpdates fetchAllRouteJobUpdates($access_token, $group_id, $sequence_id, $include)

/fleet/dispatch/routes/job_updates

Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\RoutesApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$access_token = "access_token_example"; // string | Samsara API access token.
$group_id = 789; // int | Optional group ID if the organization has multiple groups (uncommon).
$sequence_id = "sequence_id_example"; // string | Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours.
$include = "include_example"; // string | Optionally set include=route to include route object in response payload.

try {
    $result = $apiInstance->fetchAllRouteJobUpdates($access_token, $group_id, $sequence_id, $include);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling RoutesApi->fetchAllRouteJobUpdates: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. |
 **group_id** | **int**| Optional group ID if the organization has multiple groups (uncommon). | [optional]
 **sequence_id** | **string**| Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours. | [optional]
 **include** | **string**| Optionally set include&#x3D;route to include route object in response payload. | [optional]

### Return type

[**\Swagger\Client\Model\AllRouteJobUpdates**](../Model/AllRouteJobUpdates.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getDispatchRouteById**
> \Swagger\Client\Model\DispatchRoute getDispatchRouteById($access_token, $route_id)

/fleet/dispatch/routes/{route_id:[0-9]+}

Fetch a dispatch route by id.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\RoutesApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$access_token = "access_token_example"; // string | Samsara API access token.
$route_id = 789; // int | ID of the dispatch route.

try {
    $result = $apiInstance->getDispatchRouteById($access_token, $route_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling RoutesApi->getDispatchRouteById: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. |
 **route_id** | **int**| ID of the dispatch route. |

### Return type

[**\Swagger\Client\Model\DispatchRoute**](../Model/DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getDispatchRouteHistory**
> \Swagger\Client\Model\DispatchRouteHistory getDispatchRouteHistory($access_token, $route_id, $start_time, $end_time)

/fleet/dispatch/routes/{route_id:[0-9]+}/history

Fetch the history of a dispatch route.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\RoutesApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$access_token = "access_token_example"; // string | Samsara API access token.
$route_id = 789; // int | ID of the route with history.
$start_time = 789; // int | Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0.
$end_time = 789; // int | Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs.

try {
    $result = $apiInstance->getDispatchRouteHistory($access_token, $route_id, $start_time, $end_time);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling RoutesApi->getDispatchRouteHistory: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. |
 **route_id** | **int**| ID of the route with history. |
 **start_time** | **int**| Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0. | [optional]
 **end_time** | **int**| Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs. | [optional]

### Return type

[**\Swagger\Client\Model\DispatchRouteHistory**](../Model/DispatchRouteHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getDispatchRoutesByDriverId**
> \Swagger\Client\Model\DispatchRoutes getDispatchRoutesByDriverId($access_token, $driver_id, $end_time, $duration)

/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes

Fetch all of the dispatch routes for a given driver.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\RoutesApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$access_token = "access_token_example"; // string | Samsara API access token.
$driver_id = 789; // int | ID of the driver with the associated routes.
$end_time = 789; // int | Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
$duration = 789; // int | Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.

try {
    $result = $apiInstance->getDispatchRoutesByDriverId($access_token, $driver_id, $end_time, $duration);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling RoutesApi->getDispatchRoutesByDriverId: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. |
 **driver_id** | **int**| ID of the driver with the associated routes. |
 **end_time** | **int**| Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. | [optional]
 **duration** | **int**| Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. | [optional]

### Return type

[**\Swagger\Client\Model\DispatchRoutes**](../Model/DispatchRoutes.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getDispatchRoutesByVehicleId**
> \Swagger\Client\Model\DispatchRoutes getDispatchRoutesByVehicleId($access_token, $vehicle_id, $end_time, $duration)

/fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes

Fetch all of the dispatch routes for a given vehicle.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\RoutesApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$access_token = "access_token_example"; // string | Samsara API access token.
$vehicle_id = 789; // int | ID of the vehicle with the associated routes.
$end_time = 789; // int | Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
$duration = 789; // int | Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.

try {
    $result = $apiInstance->getDispatchRoutesByVehicleId($access_token, $vehicle_id, $end_time, $duration);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling RoutesApi->getDispatchRoutesByVehicleId: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. |
 **vehicle_id** | **int**| ID of the vehicle with the associated routes. |
 **end_time** | **int**| Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. | [optional]
 **duration** | **int**| Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. | [optional]

### Return type

[**\Swagger\Client\Model\DispatchRoutes**](../Model/DispatchRoutes.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateDispatchRouteById**
> \Swagger\Client\Model\DispatchRoute updateDispatchRouteById($access_token, $route_id, $update_dispatch_route_params)

/fleet/dispatch/routes/{route_id:[0-9]+}/

Update a dispatch route and its associated jobs.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\RoutesApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$access_token = "access_token_example"; // string | Samsara API access token.
$route_id = 789; // int | ID of the dispatch route.
$update_dispatch_route_params = new \Swagger\Client\Model\DispatchRoute(); // \Swagger\Client\Model\DispatchRoute | 

try {
    $result = $apiInstance->updateDispatchRouteById($access_token, $route_id, $update_dispatch_route_params);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling RoutesApi->updateDispatchRouteById: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. |
 **route_id** | **int**| ID of the dispatch route. |
 **update_dispatch_route_params** | [**\Swagger\Client\Model\DispatchRoute**](../Model/DispatchRoute.md)|  |

### Return type

[**\Swagger\Client\Model\DispatchRoute**](../Model/DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)


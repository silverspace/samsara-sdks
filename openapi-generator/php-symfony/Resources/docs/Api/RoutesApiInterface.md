# OpenAPI\Server\Api\RoutesApiInterface

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDispatchRoute**](RoutesApiInterface.md#createDispatchRoute) | **POST** /fleet/dispatch/routes | /fleet/dispatch/routes
[**createDriverDispatchRoute**](RoutesApiInterface.md#createDriverDispatchRoute) | **POST** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
[**createVehicleDispatchRoute**](RoutesApiInterface.md#createVehicleDispatchRoute) | **POST** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
[**deleteDispatchRouteById**](RoutesApiInterface.md#deleteDispatchRouteById) | **DELETE** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
[**fetchAllDispatchRoutes**](RoutesApiInterface.md#fetchAllDispatchRoutes) | **GET** /fleet/dispatch/routes | /fleet/dispatch/routes
[**fetchAllRouteJobUpdates**](RoutesApiInterface.md#fetchAllRouteJobUpdates) | **GET** /fleet/dispatch/routes/job_updates | /fleet/dispatch/routes/job_updates
[**getDispatchRouteById**](RoutesApiInterface.md#getDispatchRouteById) | **GET** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}
[**getDispatchRouteHistory**](RoutesApiInterface.md#getDispatchRouteHistory) | **GET** /fleet/dispatch/routes/{route_id}/history | /fleet/dispatch/routes/{route_id:[0-9]+}/history
[**getDispatchRoutesByDriverId**](RoutesApiInterface.md#getDispatchRoutesByDriverId) | **GET** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
[**getDispatchRoutesByVehicleId**](RoutesApiInterface.md#getDispatchRoutesByVehicleId) | **GET** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
[**updateDispatchRouteById**](RoutesApiInterface.md#updateDispatchRouteById) | **PUT** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/


## Service Declaration
```yaml
# src/Acme/MyBundle/Resources/services.yml
services:
    # ...
    acme.my_bundle.api.routes:
        class: Acme\MyBundle\Api\RoutesApi
        tags:
            - { name: "open_apiserver.api", api: "routes" }
    # ...
```

## **createDispatchRoute**
> OpenAPI\Server\Model\DispatchRoute createDispatchRoute($accessToken, $createDispatchRouteParams)

/fleet/dispatch/routes

Create a new dispatch route.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/RoutesApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\RoutesApiInterface;

class RoutesApi implements RoutesApiInterface
{

    // ...

    /**
     * Implementation of RoutesApiInterface#createDispatchRoute
     */
    public function createDispatchRoute($accessToken, DispatchRouteCreate $createDispatchRouteParams)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. |
 **createDispatchRouteParams** | [**OpenAPI\Server\Model\DispatchRouteCreate**](../Model/DispatchRouteCreate.md)|  |

### Return type

[**OpenAPI\Server\Model\DispatchRoute**](../Model/DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **createDriverDispatchRoute**
> OpenAPI\Server\Model\DispatchRoute createDriverDispatchRoute($accessToken, $driverId, $createDispatchRouteParams)

/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes

Create a new dispatch route for the driver with driver_id.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/RoutesApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\RoutesApiInterface;

class RoutesApi implements RoutesApiInterface
{

    // ...

    /**
     * Implementation of RoutesApiInterface#createDriverDispatchRoute
     */
    public function createDriverDispatchRoute($accessToken, $driverId, DispatchRouteCreate $createDispatchRouteParams)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. |
 **driverId** | **int**| ID of the driver with the associated routes. |
 **createDispatchRouteParams** | [**OpenAPI\Server\Model\DispatchRouteCreate**](../Model/DispatchRouteCreate.md)|  |

### Return type

[**OpenAPI\Server\Model\DispatchRoute**](../Model/DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **createVehicleDispatchRoute**
> OpenAPI\Server\Model\DispatchRoute createVehicleDispatchRoute($accessToken, $vehicleId, $createDispatchRouteParams)

/fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes

Create a new dispatch route for the vehicle with vehicle_id.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/RoutesApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\RoutesApiInterface;

class RoutesApi implements RoutesApiInterface
{

    // ...

    /**
     * Implementation of RoutesApiInterface#createVehicleDispatchRoute
     */
    public function createVehicleDispatchRoute($accessToken, $vehicleId, DispatchRouteCreate $createDispatchRouteParams)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. |
 **vehicleId** | **int**| ID of the vehicle with the associated routes. |
 **createDispatchRouteParams** | [**OpenAPI\Server\Model\DispatchRouteCreate**](../Model/DispatchRouteCreate.md)|  |

### Return type

[**OpenAPI\Server\Model\DispatchRoute**](../Model/DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **deleteDispatchRouteById**
> deleteDispatchRouteById($accessToken, $routeId)

/fleet/dispatch/routes/{route_id:[0-9]+}/

Delete a dispatch route and its associated jobs.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/RoutesApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\RoutesApiInterface;

class RoutesApi implements RoutesApiInterface
{

    // ...

    /**
     * Implementation of RoutesApiInterface#deleteDispatchRouteById
     */
    public function deleteDispatchRouteById($accessToken, $routeId)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. |
 **routeId** | **int**| ID of the dispatch route. |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **fetchAllDispatchRoutes**
> OpenAPI\Server\Model\DispatchRoute fetchAllDispatchRoutes($accessToken, $groupId, $endTime, $duration)

/fleet/dispatch/routes

Fetch all of the dispatch routes for the group.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/RoutesApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\RoutesApiInterface;

class RoutesApi implements RoutesApiInterface
{

    // ...

    /**
     * Implementation of RoutesApiInterface#fetchAllDispatchRoutes
     */
    public function fetchAllDispatchRoutes($accessToken, $groupId = null, $endTime = null, $duration = null)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. |
 **groupId** | **int**| Optional group ID if the organization has multiple groups (uncommon). | [optional]
 **endTime** | **int**| Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. | [optional]
 **duration** | **int**| Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. | [optional]

### Return type

[**OpenAPI\Server\Model\DispatchRoute**](../Model/DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **fetchAllRouteJobUpdates**
> OpenAPI\Server\Model\AllRouteJobUpdates fetchAllRouteJobUpdates($accessToken, $groupId, $sequenceId, $include)

/fleet/dispatch/routes/job_updates

Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/RoutesApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\RoutesApiInterface;

class RoutesApi implements RoutesApiInterface
{

    // ...

    /**
     * Implementation of RoutesApiInterface#fetchAllRouteJobUpdates
     */
    public function fetchAllRouteJobUpdates($accessToken, $groupId = null, $sequenceId = null, $include = null)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. |
 **groupId** | **int**| Optional group ID if the organization has multiple groups (uncommon). | [optional]
 **sequenceId** | **string**| Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours. | [optional]
 **include** | **string**| Optionally set include&#x3D;route to include route object in response payload. | [optional]

### Return type

[**OpenAPI\Server\Model\AllRouteJobUpdates**](../Model/AllRouteJobUpdates.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getDispatchRouteById**
> OpenAPI\Server\Model\DispatchRoute getDispatchRouteById($accessToken, $routeId)

/fleet/dispatch/routes/{route_id:[0-9]+}

Fetch a dispatch route by id.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/RoutesApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\RoutesApiInterface;

class RoutesApi implements RoutesApiInterface
{

    // ...

    /**
     * Implementation of RoutesApiInterface#getDispatchRouteById
     */
    public function getDispatchRouteById($accessToken, $routeId)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. |
 **routeId** | **int**| ID of the dispatch route. |

### Return type

[**OpenAPI\Server\Model\DispatchRoute**](../Model/DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getDispatchRouteHistory**
> OpenAPI\Server\Model\DispatchRouteHistory getDispatchRouteHistory($accessToken, $routeId, $startTime, $endTime)

/fleet/dispatch/routes/{route_id:[0-9]+}/history

Fetch the history of a dispatch route.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/RoutesApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\RoutesApiInterface;

class RoutesApi implements RoutesApiInterface
{

    // ...

    /**
     * Implementation of RoutesApiInterface#getDispatchRouteHistory
     */
    public function getDispatchRouteHistory($accessToken, $routeId, $startTime = null, $endTime = null)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. |
 **routeId** | **int**| ID of the route with history. |
 **startTime** | **int**| Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0. | [optional]
 **endTime** | **int**| Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs. | [optional]

### Return type

[**OpenAPI\Server\Model\DispatchRouteHistory**](../Model/DispatchRouteHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getDispatchRoutesByDriverId**
> OpenAPI\Server\Model\DispatchRoute getDispatchRoutesByDriverId($accessToken, $driverId, $endTime, $duration)

/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes

Fetch all of the dispatch routes for a given driver.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/RoutesApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\RoutesApiInterface;

class RoutesApi implements RoutesApiInterface
{

    // ...

    /**
     * Implementation of RoutesApiInterface#getDispatchRoutesByDriverId
     */
    public function getDispatchRoutesByDriverId($accessToken, $driverId, $endTime = null, $duration = null)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. |
 **driverId** | **int**| ID of the driver with the associated routes. |
 **endTime** | **int**| Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. | [optional]
 **duration** | **int**| Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. | [optional]

### Return type

[**OpenAPI\Server\Model\DispatchRoute**](../Model/DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getDispatchRoutesByVehicleId**
> OpenAPI\Server\Model\DispatchRoute getDispatchRoutesByVehicleId($accessToken, $vehicleId, $endTime, $duration)

/fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes

Fetch all of the dispatch routes for a given vehicle.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/RoutesApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\RoutesApiInterface;

class RoutesApi implements RoutesApiInterface
{

    // ...

    /**
     * Implementation of RoutesApiInterface#getDispatchRoutesByVehicleId
     */
    public function getDispatchRoutesByVehicleId($accessToken, $vehicleId, $endTime = null, $duration = null)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. |
 **vehicleId** | **int**| ID of the vehicle with the associated routes. |
 **endTime** | **int**| Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. | [optional]
 **duration** | **int**| Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. | [optional]

### Return type

[**OpenAPI\Server\Model\DispatchRoute**](../Model/DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **updateDispatchRouteById**
> OpenAPI\Server\Model\DispatchRoute updateDispatchRouteById($accessToken, $routeId, $updateDispatchRouteParams)

/fleet/dispatch/routes/{route_id:[0-9]+}/

Update a dispatch route and its associated jobs.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/RoutesApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\RoutesApiInterface;

class RoutesApi implements RoutesApiInterface
{

    // ...

    /**
     * Implementation of RoutesApiInterface#updateDispatchRouteById
     */
    public function updateDispatchRouteById($accessToken, $routeId, DispatchRoute $updateDispatchRouteParams)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. |
 **routeId** | **int**| ID of the dispatch route. |
 **updateDispatchRouteParams** | [**OpenAPI\Server\Model\DispatchRoute**](../Model/DispatchRoute.md)|  |

### Return type

[**OpenAPI\Server\Model\DispatchRoute**](../Model/DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)


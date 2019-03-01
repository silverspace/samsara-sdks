# OpenAPI\Server\Api\SafetyApiInterface

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDriverSafetyScore**](SafetyApiInterface.md#getDriverSafetyScore) | **GET** /fleet/drivers/{driverId}/safety/score | /fleet/drivers/{driverId:[0-9]+}/safety/score
[**getVehicleHarshEvent**](SafetyApiInterface.md#getVehicleHarshEvent) | **GET** /fleet/vehicles/{vehicleId}/safety/harsh_event | /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
[**getVehicleSafetyScore**](SafetyApiInterface.md#getVehicleSafetyScore) | **GET** /fleet/vehicles/{vehicleId}/safety/score | /fleet/vehicles/{vehicleId:[0-9]+}/safety/score


## Service Declaration
```yaml
# src/Acme/MyBundle/Resources/services.yml
services:
    # ...
    acme.my_bundle.api.safety:
        class: Acme\MyBundle\Api\SafetyApi
        tags:
            - { name: "open_apiserver.api", api: "safety" }
    # ...
```

## **getDriverSafetyScore**
> OpenAPI\Server\Model\DriverSafetyScoreResponse getDriverSafetyScore($driverId, $accessToken, $startMs, $endMs)

/fleet/drivers/{driverId:[0-9]+}/safety/score

Fetch the safety score for the driver.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/SafetyApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\SafetyApiInterface;

class SafetyApi implements SafetyApiInterface
{

    // ...

    /**
     * Implementation of SafetyApiInterface#getDriverSafetyScore
     */
    public function getDriverSafetyScore($driverId, $accessToken, $startMs, $endMs)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **driverId** | **int**| ID of the driver |
 **accessToken** | **string**| Samsara API access token. |
 **startMs** | **int**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. |
 **endMs** | **int**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. |

### Return type

[**OpenAPI\Server\Model\DriverSafetyScoreResponse**](../Model/DriverSafetyScoreResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getVehicleHarshEvent**
> OpenAPI\Server\Model\VehicleHarshEventResponse getVehicleHarshEvent($vehicleId, $accessToken, $timestamp)

/fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event

Fetch harsh event details for a vehicle.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/SafetyApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\SafetyApiInterface;

class SafetyApi implements SafetyApiInterface
{

    // ...

    /**
     * Implementation of SafetyApiInterface#getVehicleHarshEvent
     */
    public function getVehicleHarshEvent($vehicleId, $accessToken, $timestamp)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **int**| ID of the vehicle |
 **accessToken** | **string**| Samsara API access token. |
 **timestamp** | **int**| Timestamp in milliseconds representing the timestamp of a harsh event. |

### Return type

[**OpenAPI\Server\Model\VehicleHarshEventResponse**](../Model/VehicleHarshEventResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getVehicleSafetyScore**
> OpenAPI\Server\Model\VehicleSafetyScoreResponse getVehicleSafetyScore($vehicleId, $accessToken, $startMs, $endMs)

/fleet/vehicles/{vehicleId:[0-9]+}/safety/score

Fetch the safety score for the vehicle.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/SafetyApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\SafetyApiInterface;

class SafetyApi implements SafetyApiInterface
{

    // ...

    /**
     * Implementation of SafetyApiInterface#getVehicleSafetyScore
     */
    public function getVehicleSafetyScore($vehicleId, $accessToken, $startMs, $endMs)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **int**| ID of the vehicle |
 **accessToken** | **string**| Samsara API access token. |
 **startMs** | **int**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. |
 **endMs** | **int**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. |

### Return type

[**OpenAPI\Server\Model\VehicleSafetyScoreResponse**](../Model/VehicleSafetyScoreResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)


# OpenAPI\Server\Api\SensorsApiInterface

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSensors**](SensorsApiInterface.md#getSensors) | **POST** /sensors/list | /sensors/list
[**getSensorsCargo**](SensorsApiInterface.md#getSensorsCargo) | **POST** /sensors/cargo | /sensors/cargo
[**getSensorsDoor**](SensorsApiInterface.md#getSensorsDoor) | **POST** /sensors/door | /sensors/door
[**getSensorsHistory**](SensorsApiInterface.md#getSensorsHistory) | **POST** /sensors/history | /sensors/history
[**getSensorsHumidity**](SensorsApiInterface.md#getSensorsHumidity) | **POST** /sensors/humidity | /sensors/humidity
[**getSensorsTemperature**](SensorsApiInterface.md#getSensorsTemperature) | **POST** /sensors/temperature | /sensors/temperature


## Service Declaration
```yaml
# src/Acme/MyBundle/Resources/services.yml
services:
    # ...
    acme.my_bundle.api.sensors:
        class: Acme\MyBundle\Api\SensorsApi
        tags:
            - { name: "open_apiserver.api", api: "sensors" }
    # ...
```

## **getSensors**
> OpenAPI\Server\Model\InlineResponse2008 getSensors($accessToken, $groupParam)

/sensors/list

Get sensor objects. This method returns a list of the sensor objects in the Samsara Cloud and information about them.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/SensorsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\SensorsApiInterface;

class SensorsApi implements SensorsApiInterface
{

    // ...

    /**
     * Implementation of SensorsApiInterface#getSensors
     */
    public function getSensors($accessToken, InlineObject23 $groupParam)
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
 **groupParam** | [**OpenAPI\Server\Model\InlineObject23**](../Model/InlineObject23.md)|  |

### Return type

[**OpenAPI\Server\Model\InlineResponse2008**](../Model/InlineResponse2008.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getSensorsCargo**
> OpenAPI\Server\Model\CargoResponse getSensorsCargo($accessToken, $sensorParam)

/sensors/cargo

Get cargo monitor status (empty / full) for requested sensors.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/SensorsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\SensorsApiInterface;

class SensorsApi implements SensorsApiInterface
{

    // ...

    /**
     * Implementation of SensorsApiInterface#getSensorsCargo
     */
    public function getSensorsCargo($accessToken, InlineObject19 $sensorParam)
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
 **sensorParam** | [**OpenAPI\Server\Model\InlineObject19**](../Model/InlineObject19.md)|  |

### Return type

[**OpenAPI\Server\Model\CargoResponse**](../Model/CargoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getSensorsDoor**
> OpenAPI\Server\Model\DoorResponse getSensorsDoor($accessToken, $sensorParam)

/sensors/door

Get door monitor status (closed / open) for requested sensors.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/SensorsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\SensorsApiInterface;

class SensorsApi implements SensorsApiInterface
{

    // ...

    /**
     * Implementation of SensorsApiInterface#getSensorsDoor
     */
    public function getSensorsDoor($accessToken, InlineObject20 $sensorParam)
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
 **sensorParam** | [**OpenAPI\Server\Model\InlineObject20**](../Model/InlineObject20.md)|  |

### Return type

[**OpenAPI\Server\Model\DoorResponse**](../Model/DoorResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getSensorsHistory**
> OpenAPI\Server\Model\SensorHistoryResponse getSensorsHistory($accessToken, $historyParam)

/sensors/history

Get historical data for specified sensors. This method returns a set of historical data for the specified sensors in the specified time range and at the specified time resolution.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/SensorsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\SensorsApiInterface;

class SensorsApi implements SensorsApiInterface
{

    // ...

    /**
     * Implementation of SensorsApiInterface#getSensorsHistory
     */
    public function getSensorsHistory($accessToken, InlineObject21 $historyParam)
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
 **historyParam** | [**OpenAPI\Server\Model\InlineObject21**](../Model/InlineObject21.md)|  |

### Return type

[**OpenAPI\Server\Model\SensorHistoryResponse**](../Model/SensorHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getSensorsHumidity**
> OpenAPI\Server\Model\HumidityResponse getSensorsHumidity($accessToken, $sensorParam)

/sensors/humidity

Get humidity for requested sensors. This method returns the current relative humidity for the requested sensors.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/SensorsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\SensorsApiInterface;

class SensorsApi implements SensorsApiInterface
{

    // ...

    /**
     * Implementation of SensorsApiInterface#getSensorsHumidity
     */
    public function getSensorsHumidity($accessToken, InlineObject22 $sensorParam)
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
 **sensorParam** | [**OpenAPI\Server\Model\InlineObject22**](../Model/InlineObject22.md)|  |

### Return type

[**OpenAPI\Server\Model\HumidityResponse**](../Model/HumidityResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getSensorsTemperature**
> OpenAPI\Server\Model\TemperatureResponse getSensorsTemperature($accessToken, $sensorParam)

/sensors/temperature

Get temperature for requested sensors. This method returns the current ambient temperature (and probe temperature if applicable) for the requested sensors.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/SensorsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\SensorsApiInterface;

class SensorsApi implements SensorsApiInterface
{

    // ...

    /**
     * Implementation of SensorsApiInterface#getSensorsTemperature
     */
    public function getSensorsTemperature($accessToken, InlineObject24 $sensorParam)
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
 **sensorParam** | [**OpenAPI\Server\Model\InlineObject24**](../Model/InlineObject24.md)|  |

### Return type

[**OpenAPI\Server\Model\TemperatureResponse**](../Model/TemperatureResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)


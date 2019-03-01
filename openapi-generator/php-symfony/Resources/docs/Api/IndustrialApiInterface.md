# OpenAPI\Server\Api\IndustrialApiInterface

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllDataInputs**](IndustrialApiInterface.md#getAllDataInputs) | **GET** /industrial/data | /industrial/data
[**getDataInput**](IndustrialApiInterface.md#getDataInput) | **GET** /industrial/data/{data_input_id} | /industrial/data/{data_input_id:[0-9]+}
[**getMachines**](IndustrialApiInterface.md#getMachines) | **POST** /machines/list | /machines/list
[**getMachinesHistory**](IndustrialApiInterface.md#getMachinesHistory) | **POST** /machines/history | /machines/history


## Service Declaration
```yaml
# src/Acme/MyBundle/Resources/services.yml
services:
    # ...
    acme.my_bundle.api.industrial:
        class: Acme\MyBundle\Api\IndustrialApi
        tags:
            - { name: "open_apiserver.api", api: "industrial" }
    # ...
```

## **getAllDataInputs**
> OpenAPI\Server\Model\InlineResponse2006 getAllDataInputs($accessToken, $groupId, $startMs, $endMs)

/industrial/data

Fetch all of the data inputs for a group.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/IndustrialApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\IndustrialApiInterface;

class IndustrialApi implements IndustrialApiInterface
{

    // ...

    /**
     * Implementation of IndustrialApiInterface#getAllDataInputs
     */
    public function getAllDataInputs($accessToken, $groupId = null, $startMs = null, $endMs = null)
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
 **startMs** | **int**| Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. | [optional]
 **endMs** | **int**| Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. | [optional]

### Return type

[**OpenAPI\Server\Model\InlineResponse2006**](../Model/InlineResponse2006.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getDataInput**
> OpenAPI\Server\Model\DataInputHistoryResponse getDataInput($accessToken, $dataInputId, $startMs, $endMs)

/industrial/data/{data_input_id:[0-9]+}

Fetch datapoints from a given data input.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/IndustrialApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\IndustrialApiInterface;

class IndustrialApi implements IndustrialApiInterface
{

    // ...

    /**
     * Implementation of IndustrialApiInterface#getDataInput
     */
    public function getDataInput($accessToken, $dataInputId, $startMs = null, $endMs = null)
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
 **dataInputId** | **int**| ID of the data input |
 **startMs** | **int**| Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. | [optional]
 **endMs** | **int**| Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. | [optional]

### Return type

[**OpenAPI\Server\Model\DataInputHistoryResponse**](../Model/DataInputHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getMachines**
> OpenAPI\Server\Model\InlineResponse2007 getMachines($accessToken, $groupParam)

/machines/list

Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and information about them.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/IndustrialApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\IndustrialApiInterface;

class IndustrialApi implements IndustrialApiInterface
{

    // ...

    /**
     * Implementation of IndustrialApiInterface#getMachines
     */
    public function getMachines($accessToken, InlineObject18 $groupParam)
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
 **groupParam** | [**OpenAPI\Server\Model\InlineObject18**](../Model/InlineObject18.md)|  |

### Return type

[**OpenAPI\Server\Model\InlineResponse2007**](../Model/InlineResponse2007.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getMachinesHistory**
> OpenAPI\Server\Model\MachineHistoryResponse getMachinesHistory($accessToken, $historyParam)

/machines/history

Get historical data for machine objects. This method returns a set of historical data for all machines in a group

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/IndustrialApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\IndustrialApiInterface;

class IndustrialApi implements IndustrialApiInterface
{

    // ...

    /**
     * Implementation of IndustrialApiInterface#getMachinesHistory
     */
    public function getMachinesHistory($accessToken, InlineObject17 $historyParam)
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
 **historyParam** | [**OpenAPI\Server\Model\InlineObject17**](../Model/InlineObject17.md)|  |

### Return type

[**OpenAPI\Server\Model\MachineHistoryResponse**](../Model/MachineHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)


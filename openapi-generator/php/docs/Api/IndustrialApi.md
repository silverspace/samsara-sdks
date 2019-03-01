# OpenAPI\Client\IndustrialApi

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllDataInputs**](IndustrialApi.md#getAllDataInputs) | **GET** /industrial/data | /industrial/data
[**getDataInput**](IndustrialApi.md#getDataInput) | **GET** /industrial/data/{data_input_id} | /industrial/data/{data_input_id:[0-9]+}
[**getMachines**](IndustrialApi.md#getMachines) | **POST** /machines/list | /machines/list
[**getMachinesHistory**](IndustrialApi.md#getMachinesHistory) | **POST** /machines/history | /machines/history


# **getAllDataInputs**
> \OpenAPI\Client\Model\InlineResponse2006 getAllDataInputs($access_token, $group_id, $start_ms, $end_ms)

/industrial/data

Fetch all of the data inputs for a group.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\IndustrialApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$access_token = 'access_token_example'; // string | Samsara API access token.
$group_id = 56; // int | Optional group ID if the organization has multiple groups (uncommon).
$start_ms = 56; // int | Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs.
$end_ms = 56; // int | Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs.

try {
    $result = $apiInstance->getAllDataInputs($access_token, $group_id, $start_ms, $end_ms);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling IndustrialApi->getAllDataInputs: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. |
 **group_id** | **int**| Optional group ID if the organization has multiple groups (uncommon). | [optional]
 **start_ms** | **int**| Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. | [optional]
 **end_ms** | **int**| Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. | [optional]

### Return type

[**\OpenAPI\Client\Model\InlineResponse2006**](../Model/InlineResponse2006.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getDataInput**
> \OpenAPI\Client\Model\DataInputHistoryResponse getDataInput($access_token, $data_input_id, $start_ms, $end_ms)

/industrial/data/{data_input_id:[0-9]+}

Fetch datapoints from a given data input.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\IndustrialApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$access_token = 'access_token_example'; // string | Samsara API access token.
$data_input_id = 56; // int | ID of the data input
$start_ms = 56; // int | Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs.
$end_ms = 56; // int | Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs.

try {
    $result = $apiInstance->getDataInput($access_token, $data_input_id, $start_ms, $end_ms);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling IndustrialApi->getDataInput: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. |
 **data_input_id** | **int**| ID of the data input |
 **start_ms** | **int**| Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. | [optional]
 **end_ms** | **int**| Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. | [optional]

### Return type

[**\OpenAPI\Client\Model\DataInputHistoryResponse**](../Model/DataInputHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getMachines**
> \OpenAPI\Client\Model\InlineResponse2007 getMachines($access_token, $group_param)

/machines/list

Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and information about them.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\IndustrialApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$access_token = 'access_token_example'; // string | Samsara API access token.
$group_param = new \OpenAPI\Client\Model\InlineObject18(); // \OpenAPI\Client\Model\InlineObject18 | 

try {
    $result = $apiInstance->getMachines($access_token, $group_param);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling IndustrialApi->getMachines: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. |
 **group_param** | [**\OpenAPI\Client\Model\InlineObject18**](../Model/InlineObject18.md)|  |

### Return type

[**\OpenAPI\Client\Model\InlineResponse2007**](../Model/InlineResponse2007.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getMachinesHistory**
> \OpenAPI\Client\Model\MachineHistoryResponse getMachinesHistory($access_token, $history_param)

/machines/history

Get historical data for machine objects. This method returns a set of historical data for all machines in a group

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\IndustrialApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$access_token = 'access_token_example'; // string | Samsara API access token.
$history_param = new \OpenAPI\Client\Model\InlineObject17(); // \OpenAPI\Client\Model\InlineObject17 | 

try {
    $result = $apiInstance->getMachinesHistory($access_token, $history_param);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling IndustrialApi->getMachinesHistory: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. |
 **history_param** | [**\OpenAPI\Client\Model\InlineObject17**](../Model/InlineObject17.md)|  |

### Return type

[**\OpenAPI\Client\Model\MachineHistoryResponse**](../Model/MachineHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)


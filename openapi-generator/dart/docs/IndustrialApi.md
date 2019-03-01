# openapi.api.IndustrialApi

## Load the API package
```dart
import 'package:openapi/api.dart';
```

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllDataInputs**](IndustrialApi.md#getAllDataInputs) | **GET** /industrial/data | /industrial/data
[**getDataInput**](IndustrialApi.md#getDataInput) | **GET** /industrial/data/{data_input_id} | /industrial/data/{data_input_id:[0-9]+}
[**getMachines**](IndustrialApi.md#getMachines) | **POST** /machines/list | /machines/list
[**getMachinesHistory**](IndustrialApi.md#getMachinesHistory) | **POST** /machines/history | /machines/history


# **getAllDataInputs**
> InlineResponse2006 getAllDataInputs(accessToken, groupId, startMs, endMs)

/industrial/data

Fetch all of the data inputs for a group.

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new IndustrialApi();
var accessToken = accessToken_example; // String | Samsara API access token.
var groupId = 789; // int | Optional group ID if the organization has multiple groups (uncommon).
var startMs = 789; // int | Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs.
var endMs = 789; // int | Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs.

try { 
    var result = api_instance.getAllDataInputs(accessToken, groupId, startMs, endMs);
    print(result);
} catch (e) {
    print("Exception when calling IndustrialApi->getAllDataInputs: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | [default to null]
 **groupId** | **int**| Optional group ID if the organization has multiple groups (uncommon). | [optional] [default to null]
 **startMs** | **int**| Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. | [optional] [default to null]
 **endMs** | **int**| Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. | [optional] [default to null]

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getDataInput**
> DataInputHistoryResponse getDataInput(accessToken, dataInputId, startMs, endMs)

/industrial/data/{data_input_id:[0-9]+}

Fetch datapoints from a given data input.

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new IndustrialApi();
var accessToken = accessToken_example; // String | Samsara API access token.
var dataInputId = 789; // int | ID of the data input
var startMs = 789; // int | Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs.
var endMs = 789; // int | Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs.

try { 
    var result = api_instance.getDataInput(accessToken, dataInputId, startMs, endMs);
    print(result);
} catch (e) {
    print("Exception when calling IndustrialApi->getDataInput: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | [default to null]
 **dataInputId** | **int**| ID of the data input | [default to null]
 **startMs** | **int**| Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. | [optional] [default to null]
 **endMs** | **int**| Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. | [optional] [default to null]

### Return type

[**DataInputHistoryResponse**](DataInputHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getMachines**
> InlineResponse2007 getMachines(accessToken, groupParam)

/machines/list

Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and information about them.

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new IndustrialApi();
var accessToken = accessToken_example; // String | Samsara API access token.
var groupParam = new InlineObject18(); // InlineObject18 | 

try { 
    var result = api_instance.getMachines(accessToken, groupParam);
    print(result);
} catch (e) {
    print("Exception when calling IndustrialApi->getMachines: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | [default to null]
 **groupParam** | [**InlineObject18**](InlineObject18.md)|  | 

### Return type

[**InlineResponse2007**](InlineResponse2007.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getMachinesHistory**
> MachineHistoryResponse getMachinesHistory(accessToken, historyParam)

/machines/history

Get historical data for machine objects. This method returns a set of historical data for all machines in a group

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new IndustrialApi();
var accessToken = accessToken_example; // String | Samsara API access token.
var historyParam = new InlineObject17(); // InlineObject17 | 

try { 
    var result = api_instance.getMachinesHistory(accessToken, historyParam);
    print(result);
} catch (e) {
    print("Exception when calling IndustrialApi->getMachinesHistory: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | [default to null]
 **historyParam** | [**InlineObject17**](InlineObject17.md)|  | 

### Return type

[**MachineHistoryResponse**](MachineHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


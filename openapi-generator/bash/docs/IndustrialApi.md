# IndustrialApi

All URIs are relative to */v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllDataInputs**](IndustrialApi.md#getAllDataInputs) | **GET** /industrial/data | /industrial/data
[**getDataInput**](IndustrialApi.md#getDataInput) | **GET** /industrial/data/{data_input_id} | /industrial/data/{data_input_id:[0-9]+}
[**getMachines**](IndustrialApi.md#getMachines) | **POST** /machines/list | /machines/list
[**getMachinesHistory**](IndustrialApi.md#getMachinesHistory) | **POST** /machines/history | /machines/history


## **getAllDataInputs**

/industrial/data

Fetch all of the data inputs for a group.

### Example
```bash
 getAllDataInputs  access_token=value  group_id=value  startMs=value  endMs=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string** | Samsara API access token. | [default to null]
 **groupId** | **integer** | Optional group ID if the organization has multiple groups (uncommon). | [optional] [default to null]
 **startMs** | **integer** | Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. | [optional] [default to null]
 **endMs** | **integer** | Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. | [optional] [default to null]

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **getDataInput**

/industrial/data/{data_input_id:[0-9]+}

Fetch datapoints from a given data input.

### Example
```bash
 getDataInput  access_token=value data_input_id=value  startMs=value  endMs=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string** | Samsara API access token. | [default to null]
 **dataInputId** | **integer** | ID of the data input | [default to null]
 **startMs** | **integer** | Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. | [optional] [default to null]
 **endMs** | **integer** | Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. | [optional] [default to null]

### Return type

[**DataInputHistoryResponse**](DataInputHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **getMachines**

/machines/list

Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and information about them.

### Example
```bash
 getMachines  access_token=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string** | Samsara API access token. | [default to null]
 **groupParam** | [**InlineObject18**](InlineObject18.md) |  |

### Return type

[**InlineResponse2007**](InlineResponse2007.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **getMachinesHistory**

/machines/history

Get historical data for machine objects. This method returns a set of historical data for all machines in a group

### Example
```bash
 getMachinesHistory  access_token=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string** | Samsara API access token. | [default to null]
 **historyParam** | [**InlineObject17**](InlineObject17.md) |  |

### Return type

[**MachineHistoryResponse**](MachineHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


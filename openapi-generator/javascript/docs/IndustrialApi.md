# SamsaraApi.IndustrialApi

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllDataInputs**](IndustrialApi.md#getAllDataInputs) | **GET** /industrial/data | /industrial/data
[**getDataInput**](IndustrialApi.md#getDataInput) | **GET** /industrial/data/{data_input_id} | /industrial/data/{data_input_id:[0-9]+}
[**getMachines**](IndustrialApi.md#getMachines) | **POST** /machines/list | /machines/list
[**getMachinesHistory**](IndustrialApi.md#getMachinesHistory) | **POST** /machines/history | /machines/history


<a name="getAllDataInputs"></a>
# **getAllDataInputs**
> InlineResponse2006 getAllDataInputs(accessToken, opts)

/industrial/data

Fetch all of the data inputs for a group.

### Example
```javascript
import SamsaraApi from 'samsara_api';

let apiInstance = new SamsaraApi.IndustrialApi();
let accessToken = "accessToken_example"; // String | Samsara API access token.
let opts = {
  'groupId': 789, // Number | Optional group ID if the organization has multiple groups (uncommon).
  'startMs': 789, // Number | Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs.
  'endMs': 789 // Number | Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs.
};
apiInstance.getAllDataInputs(accessToken, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | 
 **groupId** | **Number**| Optional group ID if the organization has multiple groups (uncommon). | [optional] 
 **startMs** | **Number**| Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. | [optional] 
 **endMs** | **Number**| Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. | [optional] 

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDataInput"></a>
# **getDataInput**
> DataInputHistoryResponse getDataInput(accessToken, dataInputId, opts)

/industrial/data/{data_input_id:[0-9]+}

Fetch datapoints from a given data input.

### Example
```javascript
import SamsaraApi from 'samsara_api';

let apiInstance = new SamsaraApi.IndustrialApi();
let accessToken = "accessToken_example"; // String | Samsara API access token.
let dataInputId = 789; // Number | ID of the data input
let opts = {
  'startMs': 789, // Number | Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs.
  'endMs': 789 // Number | Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs.
};
apiInstance.getDataInput(accessToken, dataInputId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | 
 **dataInputId** | **Number**| ID of the data input | 
 **startMs** | **Number**| Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. | [optional] 
 **endMs** | **Number**| Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. | [optional] 

### Return type

[**DataInputHistoryResponse**](DataInputHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMachines"></a>
# **getMachines**
> InlineResponse2007 getMachines(accessToken, groupParam)

/machines/list

Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and information about them.

### Example
```javascript
import SamsaraApi from 'samsara_api';

let apiInstance = new SamsaraApi.IndustrialApi();
let accessToken = "accessToken_example"; // String | Samsara API access token.
let groupParam = new SamsaraApi.InlineObject18(); // InlineObject18 | 
apiInstance.getMachines(accessToken, groupParam, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | 
 **groupParam** | [**InlineObject18**](InlineObject18.md)|  | 

### Return type

[**InlineResponse2007**](InlineResponse2007.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMachinesHistory"></a>
# **getMachinesHistory**
> MachineHistoryResponse getMachinesHistory(accessToken, historyParam)

/machines/history

Get historical data for machine objects. This method returns a set of historical data for all machines in a group

### Example
```javascript
import SamsaraApi from 'samsara_api';

let apiInstance = new SamsaraApi.IndustrialApi();
let accessToken = "accessToken_example"; // String | Samsara API access token.
let historyParam = new SamsaraApi.InlineObject17(); // InlineObject17 | 
apiInstance.getMachinesHistory(accessToken, historyParam, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | 
 **historyParam** | [**InlineObject17**](InlineObject17.md)|  | 

### Return type

[**MachineHistoryResponse**](MachineHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


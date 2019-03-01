# IndustrialApi

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllDataInputs**](IndustrialApi.md#getAllDataInputs) | **GET** /industrial/data | /industrial/data
[**getDataInput**](IndustrialApi.md#getDataInput) | **GET** /industrial/data/{data_input_id} | /industrial/data/{data_input_id:[0-9]+}
[**getMachines**](IndustrialApi.md#getMachines) | **POST** /machines/list | /machines/list
[**getMachinesHistory**](IndustrialApi.md#getMachinesHistory) | **POST** /machines/history | /machines/history


<a name="getAllDataInputs"></a>
# **getAllDataInputs**
> InlineResponse2006 getAllDataInputs(accessToken, groupId, startMs, endMs)

/industrial/data

Fetch all of the data inputs for a group.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.IndustrialApi;


IndustrialApi apiInstance = new IndustrialApi();
String accessToken = "accessToken_example"; // String | Samsara API access token.
Long groupId = 789L; // Long | Optional group ID if the organization has multiple groups (uncommon).
Long startMs = 789L; // Long | Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs.
Long endMs = 789L; // Long | Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs.
try {
    InlineResponse2006 result = apiInstance.getAllDataInputs(accessToken, groupId, startMs, endMs);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IndustrialApi#getAllDataInputs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. |
 **groupId** | **Long**| Optional group ID if the organization has multiple groups (uncommon). | [optional]
 **startMs** | **Long**| Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. | [optional]
 **endMs** | **Long**| Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. | [optional]

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDataInput"></a>
# **getDataInput**
> DataInputHistoryResponse getDataInput(accessToken, dataInputId, startMs, endMs)

/industrial/data/{data_input_id:[0-9]+}

Fetch datapoints from a given data input.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.IndustrialApi;


IndustrialApi apiInstance = new IndustrialApi();
String accessToken = "accessToken_example"; // String | Samsara API access token.
Long dataInputId = 789L; // Long | ID of the data input
Long startMs = 789L; // Long | Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs.
Long endMs = 789L; // Long | Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs.
try {
    DataInputHistoryResponse result = apiInstance.getDataInput(accessToken, dataInputId, startMs, endMs);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IndustrialApi#getDataInput");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. |
 **dataInputId** | **Long**| ID of the data input |
 **startMs** | **Long**| Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. | [optional]
 **endMs** | **Long**| Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. | [optional]

### Return type

[**DataInputHistoryResponse**](DataInputHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMachines"></a>
# **getMachines**
> InlineResponse2007 getMachines(accessToken, groupParam)

/machines/list

Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and information about them.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.IndustrialApi;


IndustrialApi apiInstance = new IndustrialApi();
String accessToken = "accessToken_example"; // String | Samsara API access token.
GroupParam groupParam = new GroupParam(); // GroupParam | Group ID to query.
try {
    InlineResponse2007 result = apiInstance.getMachines(accessToken, groupParam);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IndustrialApi#getMachines");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. |
 **groupParam** | [**GroupParam**](GroupParam.md)| Group ID to query. |

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
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.IndustrialApi;


IndustrialApi apiInstance = new IndustrialApi();
String accessToken = "accessToken_example"; // String | Samsara API access token.
HistoryParam historyParam = new HistoryParam(); // HistoryParam | Group ID and time range to query for events
try {
    MachineHistoryResponse result = apiInstance.getMachinesHistory(accessToken, historyParam);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IndustrialApi#getMachinesHistory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. |
 **historyParam** | [**HistoryParam**](HistoryParam.md)| Group ID and time range to query for events |

### Return type

[**MachineHistoryResponse**](MachineHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


# Org.OpenAPITools.Api.IndustrialApi

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetAllDataInputs**](IndustrialApi.md#getalldatainputs) | **GET** /industrial/data | /industrial/data
[**GetDataInput**](IndustrialApi.md#getdatainput) | **GET** /industrial/data/{data_input_id} | /industrial/data/{data_input_id:[0-9]+}
[**GetMachines**](IndustrialApi.md#getmachines) | **POST** /machines/list | /machines/list
[**GetMachinesHistory**](IndustrialApi.md#getmachineshistory) | **POST** /machines/history | /machines/history


<a name="getalldatainputs"></a>
# **GetAllDataInputs**
> InlineResponse2006 GetAllDataInputs (string accessToken, long? groupId, long? startMs, long? endMs)

/industrial/data

Fetch all of the data inputs for a group.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetAllDataInputsExample
    {
        public void main()
        {
            
            var apiInstance = new IndustrialApi();
            var accessToken = accessToken_example;  // string | Samsara API access token.
            var groupId = 789;  // long? | Optional group ID if the organization has multiple groups (uncommon). (optional) 
            var startMs = 789;  // long? | Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. (optional) 
            var endMs = 789;  // long? | Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. (optional) 

            try
            {
                // /industrial/data
                InlineResponse2006 result = apiInstance.GetAllDataInputs(accessToken, groupId, startMs, endMs);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling IndustrialApi.GetAllDataInputs: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. | 
 **groupId** | **long?**| Optional group ID if the organization has multiple groups (uncommon). | [optional] 
 **startMs** | **long?**| Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. | [optional] 
 **endMs** | **long?**| Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. | [optional] 

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getdatainput"></a>
# **GetDataInput**
> DataInputHistoryResponse GetDataInput (string accessToken, long? dataInputId, long? startMs, long? endMs)

/industrial/data/{data_input_id:[0-9]+}

Fetch datapoints from a given data input.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetDataInputExample
    {
        public void main()
        {
            
            var apiInstance = new IndustrialApi();
            var accessToken = accessToken_example;  // string | Samsara API access token.
            var dataInputId = 789;  // long? | ID of the data input
            var startMs = 789;  // long? | Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. (optional) 
            var endMs = 789;  // long? | Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. (optional) 

            try
            {
                // /industrial/data/{data_input_id:[0-9]+}
                DataInputHistoryResponse result = apiInstance.GetDataInput(accessToken, dataInputId, startMs, endMs);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling IndustrialApi.GetDataInput: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. | 
 **dataInputId** | **long?**| ID of the data input | 
 **startMs** | **long?**| Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. | [optional] 
 **endMs** | **long?**| Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. | [optional] 

### Return type

[**DataInputHistoryResponse**](DataInputHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getmachines"></a>
# **GetMachines**
> InlineResponse2007 GetMachines (string accessToken, InlineObject18 groupParam)

/machines/list

Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and information about them.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetMachinesExample
    {
        public void main()
        {
            
            var apiInstance = new IndustrialApi();
            var accessToken = accessToken_example;  // string | Samsara API access token.
            var groupParam = new InlineObject18(); // InlineObject18 | 

            try
            {
                // /machines/list
                InlineResponse2007 result = apiInstance.GetMachines(accessToken, groupParam);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling IndustrialApi.GetMachines: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. | 
 **groupParam** | [**InlineObject18**](InlineObject18.md)|  | 

### Return type

[**InlineResponse2007**](InlineResponse2007.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getmachineshistory"></a>
# **GetMachinesHistory**
> MachineHistoryResponse GetMachinesHistory (string accessToken, InlineObject17 historyParam)

/machines/history

Get historical data for machine objects. This method returns a set of historical data for all machines in a group

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetMachinesHistoryExample
    {
        public void main()
        {
            
            var apiInstance = new IndustrialApi();
            var accessToken = accessToken_example;  // string | Samsara API access token.
            var historyParam = new InlineObject17(); // InlineObject17 | 

            try
            {
                // /machines/history
                MachineHistoryResponse result = apiInstance.GetMachinesHistory(accessToken, historyParam);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling IndustrialApi.GetMachinesHistory: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. | 
 **historyParam** | [**InlineObject17**](InlineObject17.md)|  | 

### Return type

[**MachineHistoryResponse**](MachineHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


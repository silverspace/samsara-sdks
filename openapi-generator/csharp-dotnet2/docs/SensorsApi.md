# Org.OpenAPITools.Api.SensorsApi

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetSensors**](SensorsApi.md#getsensors) | **POST** /sensors/list | /sensors/list
[**GetSensorsCargo**](SensorsApi.md#getsensorscargo) | **POST** /sensors/cargo | /sensors/cargo
[**GetSensorsDoor**](SensorsApi.md#getsensorsdoor) | **POST** /sensors/door | /sensors/door
[**GetSensorsHistory**](SensorsApi.md#getsensorshistory) | **POST** /sensors/history | /sensors/history
[**GetSensorsHumidity**](SensorsApi.md#getsensorshumidity) | **POST** /sensors/humidity | /sensors/humidity
[**GetSensorsTemperature**](SensorsApi.md#getsensorstemperature) | **POST** /sensors/temperature | /sensors/temperature


<a name="getsensors"></a>
# **GetSensors**
> InlineResponse2008 GetSensors (string accessToken, InlineObject23 groupParam)

/sensors/list

Get sensor objects. This method returns a list of the sensor objects in the Samsara Cloud and information about them.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetSensorsExample
    {
        public void main()
        {
            
            var apiInstance = new SensorsApi();
            var accessToken = accessToken_example;  // string | Samsara API access token.
            var groupParam = new InlineObject23(); // InlineObject23 | 

            try
            {
                // /sensors/list
                InlineResponse2008 result = apiInstance.GetSensors(accessToken, groupParam);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SensorsApi.GetSensors: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. | 
 **groupParam** | [**InlineObject23**](InlineObject23.md)|  | 

### Return type

[**InlineResponse2008**](InlineResponse2008.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getsensorscargo"></a>
# **GetSensorsCargo**
> CargoResponse GetSensorsCargo (string accessToken, InlineObject19 sensorParam)

/sensors/cargo

Get cargo monitor status (empty / full) for requested sensors.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetSensorsCargoExample
    {
        public void main()
        {
            
            var apiInstance = new SensorsApi();
            var accessToken = accessToken_example;  // string | Samsara API access token.
            var sensorParam = new InlineObject19(); // InlineObject19 | 

            try
            {
                // /sensors/cargo
                CargoResponse result = apiInstance.GetSensorsCargo(accessToken, sensorParam);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SensorsApi.GetSensorsCargo: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. | 
 **sensorParam** | [**InlineObject19**](InlineObject19.md)|  | 

### Return type

[**CargoResponse**](CargoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getsensorsdoor"></a>
# **GetSensorsDoor**
> DoorResponse GetSensorsDoor (string accessToken, InlineObject20 sensorParam)

/sensors/door

Get door monitor status (closed / open) for requested sensors.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetSensorsDoorExample
    {
        public void main()
        {
            
            var apiInstance = new SensorsApi();
            var accessToken = accessToken_example;  // string | Samsara API access token.
            var sensorParam = new InlineObject20(); // InlineObject20 | 

            try
            {
                // /sensors/door
                DoorResponse result = apiInstance.GetSensorsDoor(accessToken, sensorParam);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SensorsApi.GetSensorsDoor: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. | 
 **sensorParam** | [**InlineObject20**](InlineObject20.md)|  | 

### Return type

[**DoorResponse**](DoorResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getsensorshistory"></a>
# **GetSensorsHistory**
> SensorHistoryResponse GetSensorsHistory (string accessToken, InlineObject21 historyParam)

/sensors/history

Get historical data for specified sensors. This method returns a set of historical data for the specified sensors in the specified time range and at the specified time resolution.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetSensorsHistoryExample
    {
        public void main()
        {
            
            var apiInstance = new SensorsApi();
            var accessToken = accessToken_example;  // string | Samsara API access token.
            var historyParam = new InlineObject21(); // InlineObject21 | 

            try
            {
                // /sensors/history
                SensorHistoryResponse result = apiInstance.GetSensorsHistory(accessToken, historyParam);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SensorsApi.GetSensorsHistory: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. | 
 **historyParam** | [**InlineObject21**](InlineObject21.md)|  | 

### Return type

[**SensorHistoryResponse**](SensorHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getsensorshumidity"></a>
# **GetSensorsHumidity**
> HumidityResponse GetSensorsHumidity (string accessToken, InlineObject22 sensorParam)

/sensors/humidity

Get humidity for requested sensors. This method returns the current relative humidity for the requested sensors.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetSensorsHumidityExample
    {
        public void main()
        {
            
            var apiInstance = new SensorsApi();
            var accessToken = accessToken_example;  // string | Samsara API access token.
            var sensorParam = new InlineObject22(); // InlineObject22 | 

            try
            {
                // /sensors/humidity
                HumidityResponse result = apiInstance.GetSensorsHumidity(accessToken, sensorParam);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SensorsApi.GetSensorsHumidity: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. | 
 **sensorParam** | [**InlineObject22**](InlineObject22.md)|  | 

### Return type

[**HumidityResponse**](HumidityResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getsensorstemperature"></a>
# **GetSensorsTemperature**
> TemperatureResponse GetSensorsTemperature (string accessToken, InlineObject24 sensorParam)

/sensors/temperature

Get temperature for requested sensors. This method returns the current ambient temperature (and probe temperature if applicable) for the requested sensors.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetSensorsTemperatureExample
    {
        public void main()
        {
            
            var apiInstance = new SensorsApi();
            var accessToken = accessToken_example;  // string | Samsara API access token.
            var sensorParam = new InlineObject24(); // InlineObject24 | 

            try
            {
                // /sensors/temperature
                TemperatureResponse result = apiInstance.GetSensorsTemperature(accessToken, sensorParam);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SensorsApi.GetSensorsTemperature: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. | 
 **sensorParam** | [**InlineObject24**](InlineObject24.md)|  | 

### Return type

[**TemperatureResponse**](TemperatureResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


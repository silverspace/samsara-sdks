# samsara.Api.SensorsApi

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
> InlineResponse2008 GetSensors (string accessToken, GroupParam groupParam)

/sensors/list

Get sensor objects. This method returns a list of the sensor objects in the Samsara Cloud and information about them.

### Example
```csharp
using System;
using System.Diagnostics;
using samsara.Api;
using IO.Swagger.Client;
using samsara.Model;

namespace Example
{
    public class GetSensorsExample
    {
        public void main()
        {
            
            var apiInstance = new SensorsApi();
            var accessToken = accessToken_example;  // string | Samsara API access token.
            var groupParam = new GroupParam(); // GroupParam | Group ID to query.

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
 **groupParam** | [**GroupParam**](GroupParam.md)| Group ID to query. | 

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
> CargoResponse GetSensorsCargo (string accessToken, SensorParam sensorParam)

/sensors/cargo

Get cargo monitor status (empty / full) for requested sensors.

### Example
```csharp
using System;
using System.Diagnostics;
using samsara.Api;
using IO.Swagger.Client;
using samsara.Model;

namespace Example
{
    public class GetSensorsCargoExample
    {
        public void main()
        {
            
            var apiInstance = new SensorsApi();
            var accessToken = accessToken_example;  // string | Samsara API access token.
            var sensorParam = new SensorParam(); // SensorParam | Group ID and list of sensor IDs to query.

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
 **sensorParam** | [**SensorParam**](SensorParam.md)| Group ID and list of sensor IDs to query. | 

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
> DoorResponse GetSensorsDoor (string accessToken, SensorParam sensorParam)

/sensors/door

Get door monitor status (closed / open) for requested sensors.

### Example
```csharp
using System;
using System.Diagnostics;
using samsara.Api;
using IO.Swagger.Client;
using samsara.Model;

namespace Example
{
    public class GetSensorsDoorExample
    {
        public void main()
        {
            
            var apiInstance = new SensorsApi();
            var accessToken = accessToken_example;  // string | Samsara API access token.
            var sensorParam = new SensorParam(); // SensorParam | Group ID and list of sensor IDs to query.

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
 **sensorParam** | [**SensorParam**](SensorParam.md)| Group ID and list of sensor IDs to query. | 

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
> SensorHistoryResponse GetSensorsHistory (string accessToken, HistoryParam1 historyParam)

/sensors/history

Get historical data for specified sensors. This method returns a set of historical data for the specified sensors in the specified time range and at the specified time resolution.

### Example
```csharp
using System;
using System.Diagnostics;
using samsara.Api;
using IO.Swagger.Client;
using samsara.Model;

namespace Example
{
    public class GetSensorsHistoryExample
    {
        public void main()
        {
            
            var apiInstance = new SensorsApi();
            var accessToken = accessToken_example;  // string | Samsara API access token.
            var historyParam = new HistoryParam1(); // HistoryParam1 | Group ID, time range and resolution, and list of sensor ID, field pairs to query.

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
 **historyParam** | [**HistoryParam1**](HistoryParam1.md)| Group ID, time range and resolution, and list of sensor ID, field pairs to query. | 

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
> HumidityResponse GetSensorsHumidity (string accessToken, SensorParam sensorParam)

/sensors/humidity

Get humidity for requested sensors. This method returns the current relative humidity for the requested sensors.

### Example
```csharp
using System;
using System.Diagnostics;
using samsara.Api;
using IO.Swagger.Client;
using samsara.Model;

namespace Example
{
    public class GetSensorsHumidityExample
    {
        public void main()
        {
            
            var apiInstance = new SensorsApi();
            var accessToken = accessToken_example;  // string | Samsara API access token.
            var sensorParam = new SensorParam(); // SensorParam | Group ID and list of sensor IDs to query.

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
 **sensorParam** | [**SensorParam**](SensorParam.md)| Group ID and list of sensor IDs to query. | 

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
> TemperatureResponse GetSensorsTemperature (string accessToken, SensorParam sensorParam)

/sensors/temperature

Get temperature for requested sensors. This method returns the current ambient temperature (and probe temperature if applicable) for the requested sensors.

### Example
```csharp
using System;
using System.Diagnostics;
using samsara.Api;
using IO.Swagger.Client;
using samsara.Model;

namespace Example
{
    public class GetSensorsTemperatureExample
    {
        public void main()
        {
            
            var apiInstance = new SensorsApi();
            var accessToken = accessToken_example;  // string | Samsara API access token.
            var sensorParam = new SensorParam(); // SensorParam | Group ID and list of sensor IDs to query.

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
 **sensorParam** | [**SensorParam**](SensorParam.md)| Group ID and list of sensor IDs to query. | 

### Return type

[**TemperatureResponse**](TemperatureResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


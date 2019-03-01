# SamsaraApi.SensorsApi

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSensors**](SensorsApi.md#getSensors) | **POST** /sensors/list | /sensors/list
[**getSensorsCargo**](SensorsApi.md#getSensorsCargo) | **POST** /sensors/cargo | /sensors/cargo
[**getSensorsDoor**](SensorsApi.md#getSensorsDoor) | **POST** /sensors/door | /sensors/door
[**getSensorsHistory**](SensorsApi.md#getSensorsHistory) | **POST** /sensors/history | /sensors/history
[**getSensorsHumidity**](SensorsApi.md#getSensorsHumidity) | **POST** /sensors/humidity | /sensors/humidity
[**getSensorsTemperature**](SensorsApi.md#getSensorsTemperature) | **POST** /sensors/temperature | /sensors/temperature


<a name="getSensors"></a>
# **getSensors**
> InlineResponse2008 getSensors(accessToken, groupParam)

/sensors/list

Get sensor objects. This method returns a list of the sensor objects in the Samsara Cloud and information about them.

### Example
```javascript
import SamsaraApi from 'samsara_api';

let apiInstance = new SamsaraApi.SensorsApi();
let accessToken = "accessToken_example"; // String | Samsara API access token.
let groupParam = new SamsaraApi.InlineObject23(); // InlineObject23 | 
apiInstance.getSensors(accessToken, groupParam, (error, data, response) => {
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
 **groupParam** | [**InlineObject23**](InlineObject23.md)|  | 

### Return type

[**InlineResponse2008**](InlineResponse2008.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSensorsCargo"></a>
# **getSensorsCargo**
> CargoResponse getSensorsCargo(accessToken, sensorParam)

/sensors/cargo

Get cargo monitor status (empty / full) for requested sensors.

### Example
```javascript
import SamsaraApi from 'samsara_api';

let apiInstance = new SamsaraApi.SensorsApi();
let accessToken = "accessToken_example"; // String | Samsara API access token.
let sensorParam = new SamsaraApi.InlineObject19(); // InlineObject19 | 
apiInstance.getSensorsCargo(accessToken, sensorParam, (error, data, response) => {
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
 **sensorParam** | [**InlineObject19**](InlineObject19.md)|  | 

### Return type

[**CargoResponse**](CargoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSensorsDoor"></a>
# **getSensorsDoor**
> DoorResponse getSensorsDoor(accessToken, sensorParam)

/sensors/door

Get door monitor status (closed / open) for requested sensors.

### Example
```javascript
import SamsaraApi from 'samsara_api';

let apiInstance = new SamsaraApi.SensorsApi();
let accessToken = "accessToken_example"; // String | Samsara API access token.
let sensorParam = new SamsaraApi.InlineObject20(); // InlineObject20 | 
apiInstance.getSensorsDoor(accessToken, sensorParam, (error, data, response) => {
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
 **sensorParam** | [**InlineObject20**](InlineObject20.md)|  | 

### Return type

[**DoorResponse**](DoorResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSensorsHistory"></a>
# **getSensorsHistory**
> SensorHistoryResponse getSensorsHistory(accessToken, historyParam)

/sensors/history

Get historical data for specified sensors. This method returns a set of historical data for the specified sensors in the specified time range and at the specified time resolution.

### Example
```javascript
import SamsaraApi from 'samsara_api';

let apiInstance = new SamsaraApi.SensorsApi();
let accessToken = "accessToken_example"; // String | Samsara API access token.
let historyParam = new SamsaraApi.InlineObject21(); // InlineObject21 | 
apiInstance.getSensorsHistory(accessToken, historyParam, (error, data, response) => {
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
 **historyParam** | [**InlineObject21**](InlineObject21.md)|  | 

### Return type

[**SensorHistoryResponse**](SensorHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSensorsHumidity"></a>
# **getSensorsHumidity**
> HumidityResponse getSensorsHumidity(accessToken, sensorParam)

/sensors/humidity

Get humidity for requested sensors. This method returns the current relative humidity for the requested sensors.

### Example
```javascript
import SamsaraApi from 'samsara_api';

let apiInstance = new SamsaraApi.SensorsApi();
let accessToken = "accessToken_example"; // String | Samsara API access token.
let sensorParam = new SamsaraApi.InlineObject22(); // InlineObject22 | 
apiInstance.getSensorsHumidity(accessToken, sensorParam, (error, data, response) => {
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
 **sensorParam** | [**InlineObject22**](InlineObject22.md)|  | 

### Return type

[**HumidityResponse**](HumidityResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSensorsTemperature"></a>
# **getSensorsTemperature**
> TemperatureResponse getSensorsTemperature(accessToken, sensorParam)

/sensors/temperature

Get temperature for requested sensors. This method returns the current ambient temperature (and probe temperature if applicable) for the requested sensors.

### Example
```javascript
import SamsaraApi from 'samsara_api';

let apiInstance = new SamsaraApi.SensorsApi();
let accessToken = "accessToken_example"; // String | Samsara API access token.
let sensorParam = new SamsaraApi.InlineObject24(); // InlineObject24 | 
apiInstance.getSensorsTemperature(accessToken, sensorParam, (error, data, response) => {
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
 **sensorParam** | [**InlineObject24**](InlineObject24.md)|  | 

### Return type

[**TemperatureResponse**](TemperatureResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


# sensors_api

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetSensors**](sensors_api.md#GetSensors) | **POST** /sensors/list | /sensors/list
[**GetSensorsCargo**](sensors_api.md#GetSensorsCargo) | **POST** /sensors/cargo | /sensors/cargo
[**GetSensorsDoor**](sensors_api.md#GetSensorsDoor) | **POST** /sensors/door | /sensors/door
[**GetSensorsHistory**](sensors_api.md#GetSensorsHistory) | **POST** /sensors/history | /sensors/history
[**GetSensorsHumidity**](sensors_api.md#GetSensorsHumidity) | **POST** /sensors/humidity | /sensors/humidity
[**GetSensorsTemperature**](sensors_api.md#GetSensorsTemperature) | **POST** /sensors/temperature | /sensors/temperature


<a name="GetSensors"></a>
# **GetSensors**
> InlineResponse2008 GetSensors(accessToken, groupParam)

/sensors/list

Get sensor objects. This method returns a list of the sensor objects in the Samsara Cloud and information about them.
<a name="GetSensorsCargo"></a>
# **GetSensorsCargo**
> CargoResponse GetSensorsCargo(accessToken, sensorParam)

/sensors/cargo

Get cargo monitor status (empty / full) for requested sensors.
<a name="GetSensorsDoor"></a>
# **GetSensorsDoor**
> DoorResponse GetSensorsDoor(accessToken, sensorParam)

/sensors/door

Get door monitor status (closed / open) for requested sensors.
<a name="GetSensorsHistory"></a>
# **GetSensorsHistory**
> SensorHistoryResponse GetSensorsHistory(accessToken, historyParam)

/sensors/history

Get historical data for specified sensors. This method returns a set of historical data for the specified sensors in the specified time range and at the specified time resolution.
<a name="GetSensorsHumidity"></a>
# **GetSensorsHumidity**
> HumidityResponse GetSensorsHumidity(accessToken, sensorParam)

/sensors/humidity

Get humidity for requested sensors. This method returns the current relative humidity for the requested sensors.
<a name="GetSensorsTemperature"></a>
# **GetSensorsTemperature**
> TemperatureResponse GetSensorsTemperature(accessToken, sensorParam)

/sensors/temperature

Get temperature for requested sensors. This method returns the current ambient temperature (and probe temperature if applicable) for the requested sensors.

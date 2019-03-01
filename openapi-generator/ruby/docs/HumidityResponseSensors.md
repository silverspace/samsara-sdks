# OpenapiClient::HumidityResponseSensors

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of the sensor. | [optional] 
**humidity** | **Integer** | Currently reported relative humidity in percent, from 0-100. | [optional] 
**id** | **Integer** | ID of the sensor. | [optional] 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::HumidityResponseSensors.new(name: Freezer Humidity Sensor,
                                 humidity: 53,
                                 id: 122)
```



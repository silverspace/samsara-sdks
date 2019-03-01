# OpenapiClient::TemperatureResponseSensors

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**probe_temperature** | **Integer** | Currently reported probe temperature in millidegrees celsius. If no probe is connected, this parameter will not be reported. | [optional] 
**name** | **String** | Name of the sensor. | [optional] 
**id** | **Integer** | ID of the sensor. | [optional] 
**ambient_temperature** | **Integer** | Currently reported ambient temperature in millidegrees celsius. | [optional] 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::TemperatureResponseSensors.new(probe_temperature: -20145,
                                 name: Freezer Temp Sensor,
                                 id: 122,
                                 ambient_temperature: 11057)
```



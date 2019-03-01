# OpenapiClient::DoorResponseSensors

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**door_closed** | **BOOLEAN** | Flag indicating whether the current door is closed or open. | [optional] 
**name** | **String** | Name of the sensor. | [optional] 
**id** | **Integer** | ID of the sensor. | [optional] 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::DoorResponseSensors.new(door_closed: true,
                                 name: Trailer Door Sensor,
                                 id: 122)
```



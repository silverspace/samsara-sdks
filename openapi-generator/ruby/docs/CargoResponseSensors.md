# OpenapiClient::CargoResponseSensors

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cargo_empty** | **BOOLEAN** | Flag indicating whether the current cargo is empty or loaded. | [optional] 
**name** | **String** | Name of the sensor. | [optional] 
**id** | **Integer** | ID of the sensor. | [optional] 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::CargoResponseSensors.new(cargo_empty: true,
                                 name: Trailer Cargo Sensor,
                                 id: 122)
```



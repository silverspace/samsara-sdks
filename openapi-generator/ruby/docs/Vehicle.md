# OpenapiClient::Vehicle

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**engine_hours** | **Integer** | Total engine hours for the vehicle. | [optional] 
**fuel_level_percent** | **Float** | The fuel level of the vehicle as a percentage. (0.0 to 1.0) | [optional] 
**id** | **Integer** | ID of the vehicle. | 
**name** | **String** | Name of the vehicle. | [optional] 
**note** | **String** |  | [optional] 
**odometer_meters** | **Integer** | The number of meters reported by the odometer. | [optional] 
**vin** | **String** | Vehicle Identification Number. | [optional] 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::Vehicle.new(engine_hours: 1500,
                                 fuel_level_percent: 0.3,
                                 id: 112,
                                 name: Truck A7,
                                 note: Red truck 2015 M16,
                                 odometer_meters: 60130000,
                                 vin: 1FUJA6BD31LJ09646)
```



# OpenapiClient::FleetVehicleResponseVehicleInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**year** | **Integer** | Year of the vehicle. | [optional] 
**model** | **String** | Model of the Vehicle. | [optional] 
**vin** | **String** | Vehicle Identification Number. | [optional] 
**make** | **String** | Make of the vehicle. | [optional] 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::FleetVehicleResponseVehicleInfo.new(year: 1997,
                                 model: Odyssey,
                                 vin: 1FUJA6BD31LJ09646,
                                 make: Honda)
```



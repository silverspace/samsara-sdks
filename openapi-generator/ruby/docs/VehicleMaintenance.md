# OpenapiClient::VehicleMaintenance

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | ID of the vehicle. | 
**j1939** | [**VehicleMaintenanceJ1939**](VehicleMaintenanceJ1939.md) |  | [optional] 
**passenger** | [**VehicleMaintenancePassenger**](VehicleMaintenancePassenger.md) |  | [optional] 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::VehicleMaintenance.new(id: 112,
                                 j1939: null,
                                 passenger: null)
```



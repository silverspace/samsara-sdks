# OpenapiClient::FleetVehicleResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**external_ids** | **Hash&lt;String, String&gt;** |  | [optional] 
**harsh_accel_setting** | **String** | Harsh event detection setting. | [optional] 
**id** | **Integer** | ID of the vehicle. | 
**name** | **String** | Name of the vehicle. | 
**vehicle_info** | [**FleetVehicleResponseVehicleInfo**](FleetVehicleResponseVehicleInfo.md) |  | [optional] 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::FleetVehicleResponse.new(external_ids: {&quot;maintenanceId&quot;:&quot;ABFS18600&quot;},
                                 harsh_accel_setting: Heavy,
                                 id: 112,
                                 name: Truck A7,
                                 vehicle_info: null)
```



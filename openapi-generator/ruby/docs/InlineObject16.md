# OpenapiClient::InlineObject16

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**external_ids** | **Hash&lt;String, String&gt;** |  | [optional] 
**harsh_accel_setting** | **Integer** | Harsh Event Detection Setting * 0: Passenger * 1: Light Truck * 2: Heavy * 3: Off * 4: Automatic | [optional] 
**name** | **String** | Name | [optional] 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::InlineObject16.new(external_ids: {&quot;maintenanceId&quot;:&quot;ABFS18600&quot;},
                                 harsh_accel_setting: null,
                                 name: null)
```



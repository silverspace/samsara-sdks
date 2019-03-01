# OpenapiClient::DvirBaseNextDriverSignature

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**driver_id** | **Integer** | ID of the driver who signed the DVIR | [optional] 
**name** | **String** | The name of the driver who signed the next DVIR on this vehicle. | [optional] 
**signed_at** | **Integer** | The time in millis when the next driver signed the DVIR on this vehicle. | [optional] 
**type** | **String** | Type corresponds to driver. | [optional] 
**email** | **String** | Email of the  driver who signed the next DVIR on this vehicle. | [optional] 
**username** | **String** | Username of the  driver who signed the next DVIR on this vehicle. | [optional] 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::DvirBaseNextDriverSignature.new(driver_id: 2581,
                                 name: John Smith,
                                 signed_at: 12535500000,
                                 type: driver,
                                 email: j.smith@yahoo.com,
                                 username: jsmith)
```



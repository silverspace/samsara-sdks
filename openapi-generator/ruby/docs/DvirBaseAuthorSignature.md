# OpenapiClient::DvirBaseAuthorSignature

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mechanic_user_id** | **Integer** | ID of the mechanic who signed the DVIR. Will not be returned if driverId is returned. | [optional] 
**driver_id** | **Integer** | ID of the driver who signed the DVIR. Will not be returned if mechanicUserId is returned. | [optional] 
**name** | **String** | The name of the driver or mechanic who signed the DVIR. | [optional] 
**signed_at** | **Integer** | The time in millis when the DVIR was signed | [optional] 
**type** | **String** | Type corresponds to whether the signature corresponds to driver|mechanic. | [optional] 
**email** | **String** | Email of the  driver|mechanic who signed the DVIR. | [optional] 
**username** | **String** | Username of the  driver|mechanic who signed the DVIR. | [optional] 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::DvirBaseAuthorSignature.new(mechanic_user_id: 14849,
                                 driver_id: 2581,
                                 name: John Smith,
                                 signed_at: 12535500000,
                                 type: driver,
                                 email: j.smith@yahoo.com,
                                 username: jsmith)
```



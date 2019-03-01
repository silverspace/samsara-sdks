# OpenapiClient::HosAuthenticationLogsResponseAuthenticationLogs

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action_type** | **String** | The log type - one of &#39;signin&#39; or &#39;signout&#39; | [optional] 
**address** | **String** | Address at which the log was recorded, if applicable. | [optional] 
**city** | **String** | City in which the log was recorded, if applicable. | [optional] 
**happened_at_ms** | **Integer** | The time at which the event was recorded in UNIX milliseconds. | [optional] 
**address_name** | **String** | Address name from the group address book at which the log was recorded, if applicable. | [optional] 
**state** | **String** | State in which the log was recorded, if applicable. | [optional] 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::HosAuthenticationLogsResponseAuthenticationLogs.new(action_type: signin,
                                 address: 123 Main St., Ahwatukee, Arizona 85044,
                                 city: Ahwatukee,
                                 happened_at_ms: 1462881998034,
                                 address_name: Garage Number 3,
                                 state: Arizona)
```



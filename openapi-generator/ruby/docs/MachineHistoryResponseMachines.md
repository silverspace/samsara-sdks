# OpenapiClient::MachineHistoryResponseMachines

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Machine name | [optional] 
**id** | **Integer** | Machine ID | [optional] 
**vibrations** | [**Array&lt;MachineHistoryResponseVibrations&gt;**](MachineHistoryResponseVibrations.md) | List of vibration datapoints, with timestamp and vibration measurement for x/y/z axis in mm/s | [optional] 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::MachineHistoryResponseMachines.new(name: 1/3 HP Motor,
                                 id: 1,
                                 vibrations: null)
```



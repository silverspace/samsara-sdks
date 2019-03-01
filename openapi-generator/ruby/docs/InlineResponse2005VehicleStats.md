# OpenapiClient::InlineResponse2005VehicleStats

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**engine_state** | [**Array&lt;EngineState&gt;**](EngineState.md) |  | [optional] 
**aux_input2** | [**AuxInputSeries**](AuxInputSeries.md) |  | [optional] 
**vehicle_id** | **Integer** | ID of the vehicle. | 
**aux_input1** | [**AuxInputSeries**](AuxInputSeries.md) |  | [optional] 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::InlineResponse2005VehicleStats.new(engine_state: null,
                                 aux_input2: null,
                                 vehicle_id: 112,
                                 aux_input1: null)
```



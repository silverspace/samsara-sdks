# OpenapiClient::VehicleMaintenancePassenger

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**check_engine_light** | [**VehicleMaintenancePassengerCheckEngineLight**](VehicleMaintenancePassengerCheckEngineLight.md) |  | [optional] 
**diagnostic_trouble_codes** | [**Array&lt;VehicleMaintenancePassengerDiagnosticTroubleCodes&gt;**](VehicleMaintenancePassengerDiagnosticTroubleCodes.md) | Passenger vehicle DTCs. | [optional] 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::VehicleMaintenancePassenger.new(check_engine_light: null,
                                 diagnostic_trouble_codes: null)
```



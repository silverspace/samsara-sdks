# OpenapiClient::VehicleMaintenanceJ1939

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**check_engine_light** | [**VehicleMaintenanceJ1939CheckEngineLight**](VehicleMaintenanceJ1939CheckEngineLight.md) |  | [optional] 
**diagnostic_trouble_codes** | [**Array&lt;VehicleMaintenanceJ1939DiagnosticTroubleCodes&gt;**](VehicleMaintenanceJ1939DiagnosticTroubleCodes.md) | J1939 DTCs. | [optional] 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::VehicleMaintenanceJ1939.new(check_engine_light: null,
                                 diagnostic_trouble_codes: null)
```



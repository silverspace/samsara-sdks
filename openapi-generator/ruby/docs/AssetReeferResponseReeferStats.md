# OpenapiClient::AssetReeferResponseReeferStats

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fuel_percentage** | [**Array&lt;AssetReeferResponseReeferStatsFuelPercentage&gt;**](AssetReeferResponseReeferStatsFuelPercentage.md) | Fuel percentage of the reefer | [optional] 
**power_status** | [**Array&lt;AssetReeferResponseReeferStatsPowerStatus&gt;**](AssetReeferResponseReeferStatsPowerStatus.md) | Power status of the reefer | [optional] 
**engine_hours** | [**Array&lt;AssetReeferResponseReeferStatsEngineHours&gt;**](AssetReeferResponseReeferStatsEngineHours.md) | Engine hours of the reefer | [optional] 
**set_point** | [**Array&lt;AssetReeferResponseReeferStatsSetPoint&gt;**](AssetReeferResponseReeferStatsSetPoint.md) | Set point temperature of the reefer | [optional] 
**return_air_temp** | [**Array&lt;AssetReeferResponseReeferStatsReturnAirTemp&gt;**](AssetReeferResponseReeferStatsReturnAirTemp.md) | Return air temperature of the reefer | [optional] 
**alarms** | [**Array&lt;AssetReeferResponseReeferStatsAlarms1&gt;**](AssetReeferResponseReeferStatsAlarms1.md) | Reefer alarms | [optional] 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::AssetReeferResponseReeferStats.new(fuel_percentage: null,
                                 power_status: null,
                                 engine_hours: null,
                                 set_point: null,
                                 return_air_temp: null,
                                 alarms: null)
```



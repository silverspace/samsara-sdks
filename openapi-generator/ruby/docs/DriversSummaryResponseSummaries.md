# OpenapiClient::DriversSummaryResponseSummaries

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**driver_id** | **Integer** | ID of the driver. | [optional] 
**distance_miles** | **Float** | Distance driven in miles, rounded to two decimal places. | [optional] 
**drive_ms** | **Integer** | Duration in milliseconds that driver was driving during the requested time range | [optional] 
**active_ms** | **Integer** | Duration in milliseconds that driver was on duty or driving during the requested time range | [optional] 
**driver_username** | **String** | Username of the driver. | [optional] 
**group_id** | **Integer** | Group of the driver. | [optional] 
**driver_name** | **String** | Name of the driver. | [optional] 
**on_duty_ms** | **Integer** | Duration in milliseconds that driver was on duty during the requested time range | [optional] 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::DriversSummaryResponseSummaries.new(driver_id: 444,
                                 distance_miles: 123.24,
                                 drive_ms: 21600000,
                                 active_ms: 43200000,
                                 driver_username: fjacobs,
                                 group_id: 111,
                                 driver_name: Fred Jacobs,
                                 on_duty_ms: 21600000)
```



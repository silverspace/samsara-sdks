# OpenapiClient::DriverDailyLogResponseDays

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**certified_at_ms** | **Integer** | Unix epoch time (in ms) of time when this chart was certified. If this chart is uncertified, 0. | [optional] 
**end_ms** | **Integer** | End of the HOS day, specified in milliseconds UNIX time. | [optional] 
**start_ms** | **Integer** | End of the HOS day, specified in milliseconds UNIX time. | [optional] 
**trailer_ids** | [**Object**](.md) | List of trailer ID&#39;s associated with the driver for the day. | [optional] 
**active_hours** | **Float** | Hours spent on duty or driving, rounded to two decimal places. | [optional] 
**distance_miles** | **Float** | Distance driven in miles, rounded to two decimal places. | [optional] 
**active_ms** | **Integer** | Milliseconds spent on duty or driving. | [optional] 
**certified** | **BOOLEAN** | Whether this HOS day chart was certified by the driver. | [optional] 
**vehicle_ids** | [**Object**](.md) | List of vehicle ID&#39;s associated with the driver for the day. | [optional] 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::DriverDailyLogResponseDays.new(certified_at_ms: null,
                                 end_ms: 1473836400000,
                                 start_ms: 1473750000000,
                                 trailer_ids: [10293,192933],
                                 active_hours: 5.4,
                                 distance_miles: 123.24,
                                 active_ms: 691200,
                                 certified: null,
                                 vehicle_ids: [192319,12958])
```



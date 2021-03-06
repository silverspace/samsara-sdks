# OpenapiClient::AssetCurrentLocation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**latitude** | **Float** | The latitude of the location in degrees. | [optional] 
**location** | **String** | The best effort (street,city,state) for the latitude and longitude. | [optional] 
**longitude** | **Float** | The longitude of the location in degrees. | [optional] 
**speed_miles_per_hour** | **Float** | The speed calculated from GPS that the asset was traveling at in miles per hour. | [optional] 
**time_ms** | **Integer** | Time in Unix milliseconds since epoch when the asset was at the location. | [optional] 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::AssetCurrentLocation.new(latitude: 37.0,
                                 location: 525 York, San Francisco, CA,
                                 longitude: -122.7,
                                 speed_miles_per_hour: 35.0,
                                 time_ms: 12314151)
```



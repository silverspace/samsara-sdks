# OpenapiClient::AddressGeofenceCircle

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**latitude** | **Float** | The latitude of the center of the circular geofence | [optional] 
**radius_meters** | **Integer** | The radius of the circular geofence | [optional] 
**longitude** | **Float** | The longitude of the center of the circular geofence | [optional] 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::AddressGeofenceCircle.new(latitude: 37.765363,
                                 radius_meters: 250,
                                 longitude: -122.403098)
```



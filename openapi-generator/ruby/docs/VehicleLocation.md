# OpenapiClient::VehicleLocation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**heading** | **Float** | Heading in degrees. | [optional] 
**id** | **Integer** | ID of the vehicle. | 
**latitude** | **Float** | Latitude in decimal degrees. | [optional] 
**location** | **String** | Text representation of nearest identifiable location to (latitude, longitude) coordinates. | [optional] 
**longitude** | **Float** | Longitude in decimal degrees. | [optional] 
**name** | **String** | Name of the vehicle. | [optional] 
**odometer_meters** | **Integer** | The number of meters reported by the odometer. | [optional] 
**on_trip** | **BOOLEAN** | Whether or not a trip is currently in progress for this vehicle. More information available via /fleet/trips endpoint. | [optional] 
**speed** | **Float** | Speed in miles per hour. | [optional] 
**time** | **Integer** | The time the reported location was logged, reported as a UNIX timestamp in milliseconds. | [optional] 
**vin** | **String** | Vehicle Identification Number (VIN) of the vehicle. | [optional] 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::VehicleLocation.new(heading: 246.42,
                                 id: 112,
                                 latitude: 123.456,
                                 location: 1 Main St, Dallas, TX,
                                 longitude: 32.897,
                                 name: Truck A7,
                                 odometer_meters: 71774705,
                                 on_trip: true,
                                 speed: 64.37,
                                 time: 1462881998034,
                                 vin: JTNBB46KX73011966)
```



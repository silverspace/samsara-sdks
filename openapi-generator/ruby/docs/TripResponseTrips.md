# OpenapiClient::TripResponseTrips

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**end_odometer** | **Integer** | Odometer reading at the end of the trip. | [optional] 
**distance_meters** | **Integer** | Length of the trip in meters. | [optional] 
**end_ms** | **Integer** | End of the trip in UNIX milliseconds. | [optional] 
**start_ms** | **Integer** | Beginning of the trip in UNIX milliseconds. | [optional] 
**fuel_consumed_ml** | **Integer** | Amount in milliliters of fuel consumed on this trip. | [optional] 
**start_address** | **String** | Text representation of nearest identifiable location to the start (latitude, longitude) coordinates. | [optional] 
**start_coordinates** | [**TripResponseStartCoordinates**](TripResponseStartCoordinates.md) |  | [optional] 
**end_coordinates** | [**TripResponseEndCoordinates**](TripResponseEndCoordinates.md) |  | [optional] 
**start_odometer** | **Integer** | Odometer reading at the beginning of the trip. | [optional] 
**driver_id** | **Integer** | ID of the driver. | [optional] 
**start_location** | **String** | Geocoded street address of start (latitude, longitude) coordinates. | [optional] 
**toll_meters** | **Integer** | Length in meters trip spent on toll roads. | [optional] 
**end_address** | **String** | Text representation of nearest identifiable location to the end (latitude, longitude) coordinates. | [optional] 
**end_location** | **String** | Geocoded street address of start (latitude, longitude) coordinates. | [optional] 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::TripResponseTrips.new(end_odometer: 210430500,
                                 distance_meters: 2500,
                                 end_ms: 1462881998034,
                                 start_ms: 1462878398034,
                                 fuel_consumed_ml: 75700,
                                 start_address: Ramen Tatsunoya,
                                 start_coordinates: null,
                                 end_coordinates: null,
                                 start_odometer: 210430450,
                                 driver_id: 719,
                                 start_location: 16 N Fair Oaks Ave, Pasadena, CA 91103,
                                 toll_meters: 32000,
                                 end_address: Winchell&#39;s Donuts House,
                                 end_location: 571 S Lake Ave, Pasadena, CA 91101)
```



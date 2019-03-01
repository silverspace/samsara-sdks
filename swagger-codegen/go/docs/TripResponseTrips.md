# TripResponseTrips

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DistanceMeters** | **int32** | Length of the trip in meters. | [optional] [default to null]
**DriverId** | **int32** | ID of the driver. | [optional] [default to null]
**EndAddress** | **string** | Text representation of nearest identifiable location to the end (latitude, longitude) coordinates. | [optional] [default to null]
**EndCoordinates** | [***TripResponseEndCoordinates**](TripResponse_endCoordinates.md) |  | [optional] [default to null]
**EndLocation** | **string** | Geocoded street address of start (latitude, longitude) coordinates. | [optional] [default to null]
**EndMs** | **int32** | End of the trip in UNIX milliseconds. | [optional] [default to null]
**EndOdometer** | **int32** | Odometer reading at the end of the trip. | [optional] [default to null]
**FuelConsumedMl** | **int32** | Amount in milliliters of fuel consumed on this trip. | [optional] [default to null]
**StartAddress** | **string** | Text representation of nearest identifiable location to the start (latitude, longitude) coordinates. | [optional] [default to null]
**StartCoordinates** | [***TripResponseStartCoordinates**](TripResponse_startCoordinates.md) |  | [optional] [default to null]
**StartLocation** | **string** | Geocoded street address of start (latitude, longitude) coordinates. | [optional] [default to null]
**StartMs** | **int32** | Beginning of the trip in UNIX milliseconds. | [optional] [default to null]
**StartOdometer** | **int32** | Odometer reading at the beginning of the trip. | [optional] [default to null]
**TollMeters** | **int32** | Length in meters trip spent on toll roads. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



# TripResponseTrips

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**distance_meters** | **i32** | Length of the trip in meters. | [optional] [default to null]
**driver_id** | **i32** | ID of the driver. | [optional] [default to null]
**end_address** | **String** | Text representation of nearest identifiable location to the end (latitude, longitude) coordinates. | [optional] [default to null]
**end_coordinates** | [***::models::TripResponseEndCoordinates**](TripResponse_endCoordinates.md) |  | [optional] [default to null]
**end_location** | **String** | Geocoded street address of start (latitude, longitude) coordinates. | [optional] [default to null]
**end_ms** | **i32** | End of the trip in UNIX milliseconds. | [optional] [default to null]
**end_odometer** | **i32** | Odometer reading at the end of the trip. | [optional] [default to null]
**fuel_consumed_ml** | **i32** | Amount in milliliters of fuel consumed on this trip. | [optional] [default to null]
**start_address** | **String** | Text representation of nearest identifiable location to the start (latitude, longitude) coordinates. | [optional] [default to null]
**start_coordinates** | [***::models::TripResponseStartCoordinates**](TripResponse_startCoordinates.md) |  | [optional] [default to null]
**start_location** | **String** | Geocoded street address of start (latitude, longitude) coordinates. | [optional] [default to null]
**start_ms** | **i32** | Beginning of the trip in UNIX milliseconds. | [optional] [default to null]
**start_odometer** | **i32** | Odometer reading at the beginning of the trip. | [optional] [default to null]
**toll_meters** | **i32** | Length in meters trip spent on toll roads. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



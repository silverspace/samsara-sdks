# TRIP_RESPONSE_TRIPS

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**end_odometer** | **INTEGER_32** | Odometer reading at the end of the trip. | [optional] [default to null]
**distance_meters** | **INTEGER_32** | Length of the trip in meters. | [optional] [default to null]
**end_ms** | **INTEGER_32** | End of the trip in UNIX milliseconds. | [optional] [default to null]
**start_ms** | **INTEGER_32** | Beginning of the trip in UNIX milliseconds. | [optional] [default to null]
**fuel_consumed_ml** | **INTEGER_32** | Amount in milliliters of fuel consumed on this trip. | [optional] [default to null]
**start_address** | [**STRING_32**](STRING_32.md) | Text representation of nearest identifiable location to the start (latitude, longitude) coordinates. | [optional] [default to null]
**start_coordinates** | [**TRIP_RESPONSE_START_COORDINATES**](TripResponse_startCoordinates.md) |  | [optional] [default to null]
**end_coordinates** | [**TRIP_RESPONSE_END_COORDINATES**](TripResponse_endCoordinates.md) |  | [optional] [default to null]
**start_odometer** | **INTEGER_32** | Odometer reading at the beginning of the trip. | [optional] [default to null]
**driver_id** | **INTEGER_32** | ID of the driver. | [optional] [default to null]
**start_location** | [**STRING_32**](STRING_32.md) | Geocoded street address of start (latitude, longitude) coordinates. | [optional] [default to null]
**toll_meters** | **INTEGER_32** | Length in meters trip spent on toll roads. | [optional] [default to null]
**end_address** | [**STRING_32**](STRING_32.md) | Text representation of nearest identifiable location to the end (latitude, longitude) coordinates. | [optional] [default to null]
**end_location** | [**STRING_32**](STRING_32.md) | Geocoded street address of start (latitude, longitude) coordinates. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



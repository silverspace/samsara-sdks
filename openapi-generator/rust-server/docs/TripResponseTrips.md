# TripResponseTrips

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**end_odometer** | **isize** | Odometer reading at the end of the trip. | [optional] [default to None]
**distance_meters** | **isize** | Length of the trip in meters. | [optional] [default to None]
**end_ms** | **isize** | End of the trip in UNIX milliseconds. | [optional] [default to None]
**start_ms** | **isize** | Beginning of the trip in UNIX milliseconds. | [optional] [default to None]
**fuel_consumed_ml** | **isize** | Amount in milliliters of fuel consumed on this trip. | [optional] [default to None]
**start_address** | **String** | Text representation of nearest identifiable location to the start (latitude, longitude) coordinates. | [optional] [default to None]
**start_coordinates** | [***models::TripResponseStartCoordinates**](TripResponse_startCoordinates.md) |  | [optional] [default to None]
**end_coordinates** | [***models::TripResponseEndCoordinates**](TripResponse_endCoordinates.md) |  | [optional] [default to None]
**start_odometer** | **isize** | Odometer reading at the beginning of the trip. | [optional] [default to None]
**driver_id** | **isize** | ID of the driver. | [optional] [default to None]
**start_location** | **String** | Geocoded street address of start (latitude, longitude) coordinates. | [optional] [default to None]
**toll_meters** | **isize** | Length in meters trip spent on toll roads. | [optional] [default to None]
**end_address** | **String** | Text representation of nearest identifiable location to the end (latitude, longitude) coordinates. | [optional] [default to None]
**end_location** | **String** | Geocoded street address of start (latitude, longitude) coordinates. | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



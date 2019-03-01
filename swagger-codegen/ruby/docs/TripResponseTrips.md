# SwaggerClient::TripResponseTrips

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**distance_meters** | **Integer** | Length of the trip in meters. | [optional] 
**driver_id** | **Integer** | ID of the driver. | [optional] 
**end_address** | **String** | Text representation of nearest identifiable location to the end (latitude, longitude) coordinates. | [optional] 
**end_coordinates** | [**TripResponseEndCoordinates**](TripResponseEndCoordinates.md) |  | [optional] 
**end_location** | **String** | Geocoded street address of start (latitude, longitude) coordinates. | [optional] 
**end_ms** | **Integer** | End of the trip in UNIX milliseconds. | [optional] 
**end_odometer** | **Integer** | Odometer reading at the end of the trip. | [optional] 
**fuel_consumed_ml** | **Integer** | Amount in milliliters of fuel consumed on this trip. | [optional] 
**start_address** | **String** | Text representation of nearest identifiable location to the start (latitude, longitude) coordinates. | [optional] 
**start_coordinates** | [**TripResponseStartCoordinates**](TripResponseStartCoordinates.md) |  | [optional] 
**start_location** | **String** | Geocoded street address of start (latitude, longitude) coordinates. | [optional] 
**start_ms** | **Integer** | Beginning of the trip in UNIX milliseconds. | [optional] 
**start_odometer** | **Integer** | Odometer reading at the beginning of the trip. | [optional] 
**toll_meters** | **Integer** | Length in meters trip spent on toll roads. | [optional] 



# TripResponseTrips

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**end_odometer** | **int** | Odometer reading at the end of the trip. | [optional] 
**distance_meters** | **int** | Length of the trip in meters. | [optional] 
**end_ms** | **int** | End of the trip in UNIX milliseconds. | [optional] 
**start_ms** | **int** | Beginning of the trip in UNIX milliseconds. | [optional] 
**fuel_consumed_ml** | **int** | Amount in milliliters of fuel consumed on this trip. | [optional] 
**start_address** | **string** | Text representation of nearest identifiable location to the start (latitude, longitude) coordinates. | [optional] 
**start_coordinates** | [**\OpenAPI\Client\Model\TripResponseStartCoordinates**](TripResponseStartCoordinates.md) |  | [optional] 
**end_coordinates** | [**\OpenAPI\Client\Model\TripResponseEndCoordinates**](TripResponseEndCoordinates.md) |  | [optional] 
**start_odometer** | **int** | Odometer reading at the beginning of the trip. | [optional] 
**driver_id** | **int** | ID of the driver. | [optional] 
**start_location** | **string** | Geocoded street address of start (latitude, longitude) coordinates. | [optional] 
**toll_meters** | **int** | Length in meters trip spent on toll roads. | [optional] 
**end_address** | **string** | Text representation of nearest identifiable location to the end (latitude, longitude) coordinates. | [optional] 
**end_location** | **string** | Geocoded street address of start (latitude, longitude) coordinates. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



# Org.OpenAPITools.Model.TripResponseTrips
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EndOdometer** | **int** | Odometer reading at the end of the trip. | [optional] 
**DistanceMeters** | **int** | Length of the trip in meters. | [optional] 
**EndMs** | **int** | End of the trip in UNIX milliseconds. | [optional] 
**StartMs** | **int** | Beginning of the trip in UNIX milliseconds. | [optional] 
**FuelConsumedMl** | **int** | Amount in milliliters of fuel consumed on this trip. | [optional] 
**StartAddress** | **string** | Text representation of nearest identifiable location to the start (latitude, longitude) coordinates. | [optional] 
**StartCoordinates** | [**TripResponseStartCoordinates**](TripResponseStartCoordinates.md) |  | [optional] 
**EndCoordinates** | [**TripResponseEndCoordinates**](TripResponseEndCoordinates.md) |  | [optional] 
**StartOdometer** | **int** | Odometer reading at the beginning of the trip. | [optional] 
**DriverId** | **int** | ID of the driver. | [optional] 
**StartLocation** | **string** | Geocoded street address of start (latitude, longitude) coordinates. | [optional] 
**TollMeters** | **int** | Length in meters trip spent on toll roads. | [optional] 
**EndAddress** | **string** | Text representation of nearest identifiable location to the end (latitude, longitude) coordinates. | [optional] 
**EndLocation** | **string** | Geocoded street address of start (latitude, longitude) coordinates. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


# TripResponseTrips

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**endOdometer** | **int** | Odometer reading at the end of the trip. | [optional] 
**distanceMeters** | **int** | Length of the trip in meters. | [optional] 
**endMs** | **int** | End of the trip in UNIX milliseconds. | [optional] 
**startMs** | **int** | Beginning of the trip in UNIX milliseconds. | [optional] 
**fuelConsumedMl** | **int** | Amount in milliliters of fuel consumed on this trip. | [optional] 
**startAddress** | **string** | Text representation of nearest identifiable location to the start (latitude, longitude) coordinates. | [optional] 
**startCoordinates** | [**OpenAPI\Server\Model\TripResponseStartCoordinates**](TripResponseStartCoordinates.md) |  | [optional] 
**endCoordinates** | [**OpenAPI\Server\Model\TripResponseEndCoordinates**](TripResponseEndCoordinates.md) |  | [optional] 
**startOdometer** | **int** | Odometer reading at the beginning of the trip. | [optional] 
**driverId** | **int** | ID of the driver. | [optional] 
**startLocation** | **string** | Geocoded street address of start (latitude, longitude) coordinates. | [optional] 
**tollMeters** | **int** | Length in meters trip spent on toll roads. | [optional] 
**endAddress** | **string** | Text representation of nearest identifiable location to the end (latitude, longitude) coordinates. | [optional] 
**endLocation** | **string** | Geocoded street address of start (latitude, longitude) coordinates. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



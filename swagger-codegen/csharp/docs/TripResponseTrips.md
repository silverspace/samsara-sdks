# samsara.Model.TripResponseTrips
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DistanceMeters** | **int?** | Length of the trip in meters. | [optional] 
**DriverId** | **int?** | ID of the driver. | [optional] 
**EndAddress** | **string** | Text representation of nearest identifiable location to the end (latitude, longitude) coordinates. | [optional] 
**EndCoordinates** | [**TripResponseEndCoordinates**](TripResponseEndCoordinates.md) |  | [optional] 
**EndLocation** | **string** | Geocoded street address of start (latitude, longitude) coordinates. | [optional] 
**EndMs** | **int?** | End of the trip in UNIX milliseconds. | [optional] 
**EndOdometer** | **int?** | Odometer reading at the end of the trip. | [optional] 
**FuelConsumedMl** | **int?** | Amount in milliliters of fuel consumed on this trip. | [optional] 
**StartAddress** | **string** | Text representation of nearest identifiable location to the start (latitude, longitude) coordinates. | [optional] 
**StartCoordinates** | [**TripResponseStartCoordinates**](TripResponseStartCoordinates.md) |  | [optional] 
**StartLocation** | **string** | Geocoded street address of start (latitude, longitude) coordinates. | [optional] 
**StartMs** | **int?** | Beginning of the trip in UNIX milliseconds. | [optional] 
**StartOdometer** | **int?** | Odometer reading at the beginning of the trip. | [optional] 
**TollMeters** | **int?** | Length in meters trip spent on toll roads. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


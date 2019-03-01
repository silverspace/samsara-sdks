# SamsaraApi.TripResponseTrips

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**endOdometer** | **Number** | Odometer reading at the end of the trip. | [optional] 
**distanceMeters** | **Number** | Length of the trip in meters. | [optional] 
**endMs** | **Number** | End of the trip in UNIX milliseconds. | [optional] 
**startMs** | **Number** | Beginning of the trip in UNIX milliseconds. | [optional] 
**fuelConsumedMl** | **Number** | Amount in milliliters of fuel consumed on this trip. | [optional] 
**startAddress** | **String** | Text representation of nearest identifiable location to the start (latitude, longitude) coordinates. | [optional] 
**startCoordinates** | [**TripResponseStartCoordinates**](TripResponseStartCoordinates.md) |  | [optional] 
**endCoordinates** | [**TripResponseEndCoordinates**](TripResponseEndCoordinates.md) |  | [optional] 
**startOdometer** | **Number** | Odometer reading at the beginning of the trip. | [optional] 
**driverId** | **Number** | ID of the driver. | [optional] 
**startLocation** | **String** | Geocoded street address of start (latitude, longitude) coordinates. | [optional] 
**tollMeters** | **Number** | Length in meters trip spent on toll roads. | [optional] 
**endAddress** | **String** | Text representation of nearest identifiable location to the end (latitude, longitude) coordinates. | [optional] 
**endLocation** | **String** | Geocoded street address of start (latitude, longitude) coordinates. | [optional] 



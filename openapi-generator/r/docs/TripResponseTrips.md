# openapi::TripResponseTrips

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**endOdometer** | **integer** | Odometer reading at the end of the trip. | [optional] 
**distanceMeters** | **integer** | Length of the trip in meters. | [optional] 
**endMs** | **integer** | End of the trip in UNIX milliseconds. | [optional] 
**startMs** | **integer** | Beginning of the trip in UNIX milliseconds. | [optional] 
**fuelConsumedMl** | **integer** | Amount in milliliters of fuel consumed on this trip. | [optional] 
**startAddress** | **character** | Text representation of nearest identifiable location to the start (latitude, longitude) coordinates. | [optional] 
**startCoordinates** | [**TripResponseStartCoordinates**](TripResponse_startCoordinates.md) |  | [optional] 
**endCoordinates** | [**TripResponseEndCoordinates**](TripResponse_endCoordinates.md) |  | [optional] 
**startOdometer** | **integer** | Odometer reading at the beginning of the trip. | [optional] 
**driverId** | **integer** | ID of the driver. | [optional] 
**startLocation** | **character** | Geocoded street address of start (latitude, longitude) coordinates. | [optional] 
**tollMeters** | **integer** | Length in meters trip spent on toll roads. | [optional] 
**endAddress** | **character** | Text representation of nearest identifiable location to the end (latitude, longitude) coordinates. | [optional] 
**endLocation** | **character** | Geocoded street address of start (latitude, longitude) coordinates. | [optional] 



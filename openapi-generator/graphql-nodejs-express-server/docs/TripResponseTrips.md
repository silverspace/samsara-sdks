# TripResponseTrips

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**endOdometer** | **Int!** | Odometer reading at the end of the trip. | [optional] [default to null]
**distanceMeters** | **Int!** | Length of the trip in meters. | [optional] [default to null]
**endMs** | **Int!** | End of the trip in UNIX milliseconds. | [optional] [default to null]
**startMs** | **Int!** | Beginning of the trip in UNIX milliseconds. | [optional] [default to null]
**fuelConsumedMl** | **Int!** | Amount in milliliters of fuel consumed on this trip. | [optional] [default to null]
**startAddress** | **String!** | Text representation of nearest identifiable location to the start (latitude, longitude) coordinates. | [optional] [default to null]
**startCoordinates** | [***TripResponseStartCoordinates**](TripResponse_startCoordinates.md) |  | [optional] [default to null]
**endCoordinates** | [***TripResponseEndCoordinates**](TripResponse_endCoordinates.md) |  | [optional] [default to null]
**startOdometer** | **Int!** | Odometer reading at the beginning of the trip. | [optional] [default to null]
**driverId** | **Int!** | ID of the driver. | [optional] [default to null]
**startLocation** | **String!** | Geocoded street address of start (latitude, longitude) coordinates. | [optional] [default to null]
**tollMeters** | **Int!** | Length in meters trip spent on toll roads. | [optional] [default to null]
**endAddress** | **String!** | Text representation of nearest identifiable location to the end (latitude, longitude) coordinates. | [optional] [default to null]
**endLocation** | **String!** | Geocoded street address of start (latitude, longitude) coordinates. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



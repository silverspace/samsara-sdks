
# VehicleLocation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**heading** | **kotlin.Double** | Heading in degrees. |  [optional]
**id** | **kotlin.Long** | ID of the vehicle. | 
**latitude** | **kotlin.Double** | Latitude in decimal degrees. |  [optional]
**location** | **kotlin.String** | Text representation of nearest identifiable location to (latitude, longitude) coordinates. |  [optional]
**longitude** | **kotlin.Double** | Longitude in decimal degrees. |  [optional]
**name** | **kotlin.String** | Name of the vehicle. |  [optional]
**odometerMeters** | **kotlin.Long** | The number of meters reported by the odometer. |  [optional]
**onTrip** | **kotlin.Boolean** | Whether or not a trip is currently in progress for this vehicle. More information available via /fleet/trips endpoint. |  [optional]
**speed** | **kotlin.Double** | Speed in miles per hour. |  [optional]
**time** | **kotlin.Int** | The time the reported location was logged, reported as a UNIX timestamp in milliseconds. |  [optional]
**vin** | **kotlin.String** | Vehicle Identification Number (VIN) of the vehicle. |  [optional]




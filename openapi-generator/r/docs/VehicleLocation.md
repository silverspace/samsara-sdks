# openapi::VehicleLocation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**heading** | **numeric** | Heading in degrees. | [optional] 
**id** | **integer** | ID of the vehicle. | 
**latitude** | **numeric** | Latitude in decimal degrees. | [optional] 
**location** | **character** | Text representation of nearest identifiable location to (latitude, longitude) coordinates. | [optional] 
**longitude** | **numeric** | Longitude in decimal degrees. | [optional] 
**name** | **character** | Name of the vehicle. | [optional] 
**odometerMeters** | **integer** | The number of meters reported by the odometer. | [optional] 
**onTrip** | **character** | Whether or not a trip is currently in progress for this vehicle. More information available via /fleet/trips endpoint. | [optional] 
**speed** | **numeric** | Speed in miles per hour. | [optional] 
**time** | **integer** | The time the reported location was logged, reported as a UNIX timestamp in milliseconds. | [optional] 
**vin** | **character** | Vehicle Identification Number (VIN) of the vehicle. | [optional] 



# SamsaraApi.VehicleLocation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**heading** | **Number** | Heading in degrees. | [optional] 
**id** | **Number** | ID of the vehicle. | 
**latitude** | **Number** | Latitude in decimal degrees. | [optional] 
**location** | **String** | Text representation of nearest identifiable location to (latitude, longitude) coordinates. | [optional] 
**longitude** | **Number** | Longitude in decimal degrees. | [optional] 
**name** | **String** | Name of the vehicle. | [optional] 
**odometerMeters** | **Number** | The number of meters reported by the odometer. | [optional] 
**onTrip** | **Boolean** | Whether or not a trip is currently in progress for this vehicle. More information available via /fleet/trips endpoint. | [optional] 
**speed** | **Number** | Speed in miles per hour. | [optional] 
**time** | **Number** | The time the reported location was logged, reported as a UNIX timestamp in milliseconds. | [optional] 
**vin** | **String** | Vehicle Identification Number (VIN) of the vehicle. | [optional] 



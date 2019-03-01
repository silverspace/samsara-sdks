# VehicleLocation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**heading** | **f64** | Heading in degrees. | [optional] 
**id** | **i64** | ID of the vehicle. | 
**latitude** | **f64** | Latitude in decimal degrees. | [optional] 
**location** | **String** | Text representation of nearest identifiable location to (latitude, longitude) coordinates. | [optional] 
**longitude** | **f64** | Longitude in decimal degrees. | [optional] 
**name** | **String** | Name of the vehicle. | [optional] 
**odometer_meters** | **i64** | The number of meters reported by the odometer. | [optional] 
**on_trip** | **bool** | Whether or not a trip is currently in progress for this vehicle. More information available via /fleet/trips endpoint. | [optional] 
**speed** | **f64** | Speed in miles per hour. | [optional] 
**time** | **i32** | The time the reported location was logged, reported as a UNIX timestamp in milliseconds. | [optional] 
**vin** | **String** | Vehicle Identification Number (VIN) of the vehicle. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



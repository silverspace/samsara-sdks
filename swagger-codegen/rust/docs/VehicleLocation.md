# VehicleLocation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**heading** | **f64** | Heading in degrees. | [optional] [default to null]
**id** | **i64** | ID of the vehicle. | [default to null]
**latitude** | **f64** | Latitude in decimal degrees. | [optional] [default to null]
**location** | **String** | Text representation of nearest identifiable location to (latitude, longitude) coordinates. | [optional] [default to null]
**longitude** | **f64** | Longitude in decimal degrees. | [optional] [default to null]
**name** | **String** | Name of the vehicle. | [optional] [default to null]
**odometer_meters** | **i64** | The number of meters reported by the odometer. | [optional] [default to null]
**on_trip** | **bool** | Whether or not a trip is currently in progress for this vehicle. More information available via /fleet/trips endpoint. | [optional] [default to null]
**speed** | **f64** | Speed in miles per hour. | [optional] [default to null]
**time** | **i32** | The time the reported location was logged, reported as a UNIX timestamp in milliseconds. | [optional] [default to null]
**vin** | **String** | Vehicle Identification Number (VIN) of the vehicle. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



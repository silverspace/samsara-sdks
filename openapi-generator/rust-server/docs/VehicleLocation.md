# VehicleLocation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**heading** | **f64** | Heading in degrees. | [optional] [default to None]
**id** | **i64** | ID of the vehicle. | 
**latitude** | **f64** | Latitude in decimal degrees. | [optional] [default to None]
**location** | **String** | Text representation of nearest identifiable location to (latitude, longitude) coordinates. | [optional] [default to None]
**longitude** | **f64** | Longitude in decimal degrees. | [optional] [default to None]
**name** | **String** | Name of the vehicle. | [optional] [default to None]
**odometer_meters** | **i64** | The number of meters reported by the odometer. | [optional] [default to None]
**on_trip** | **bool** | Whether or not a trip is currently in progress for this vehicle. More information available via /fleet/trips endpoint. | [optional] [default to None]
**speed** | **f64** | Speed in miles per hour. | [optional] [default to None]
**time** | **isize** | The time the reported location was logged, reported as a UNIX timestamp in milliseconds. | [optional] [default to None]
**vin** | **String** | Vehicle Identification Number (VIN) of the vehicle. | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



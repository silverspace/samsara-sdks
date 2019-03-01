# VEHICLE_LOCATION

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**heading** | **REAL_64** | Heading in degrees. | [optional] [default to null]
**id** | **INTEGER_64** | ID of the vehicle. | [default to null]
**latitude** | **REAL_64** | Latitude in decimal degrees. | [optional] [default to null]
**location** | [**STRING_32**](STRING_32.md) | Text representation of nearest identifiable location to (latitude, longitude) coordinates. | [optional] [default to null]
**longitude** | **REAL_64** | Longitude in decimal degrees. | [optional] [default to null]
**name** | [**STRING_32**](STRING_32.md) | Name of the vehicle. | [optional] [default to null]
**odometer_meters** | **INTEGER_64** | The number of meters reported by the odometer. | [optional] [default to null]
**on_trip** | **BOOLEAN** | Whether or not a trip is currently in progress for this vehicle. More information available via /fleet/trips endpoint. | [optional] [default to null]
**speed** | **REAL_64** | Speed in miles per hour. | [optional] [default to null]
**time** | **INTEGER_32** | The time the reported location was logged, reported as a UNIX timestamp in milliseconds. | [optional] [default to null]
**vin** | [**STRING_32**](STRING_32.md) | Vehicle Identification Number (VIN) of the vehicle. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



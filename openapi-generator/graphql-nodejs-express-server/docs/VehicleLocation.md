# VehicleLocation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**heading** | **Float!** | Heading in degrees. | [optional] [default to null]
**Id_** | **Int!** | ID of the vehicle. | [default to null]
**latitude** | **Float!** | Latitude in decimal degrees. | [optional] [default to null]
**location** | **String!** | Text representation of nearest identifiable location to (latitude, longitude) coordinates. | [optional] [default to null]
**longitude** | **Float!** | Longitude in decimal degrees. | [optional] [default to null]
**name** | **String!** | Name of the vehicle. | [optional] [default to null]
**odometerMeters** | **Int!** | The number of meters reported by the odometer. | [optional] [default to null]
**onTrip** | **Boolean!** | Whether or not a trip is currently in progress for this vehicle. More information available via /fleet/trips endpoint. | [optional] [default to null]
**speed** | **Float!** | Speed in miles per hour. | [optional] [default to null]
**time** | **Int!** | The time the reported location was logged, reported as a UNIX timestamp in milliseconds. | [optional] [default to null]
**vin** | **String!** | Vehicle Identification Number (VIN) of the vehicle. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



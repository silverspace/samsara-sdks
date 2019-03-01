# WWW::OpenAPIClient::Object::VehicleLocation

## Load the model package
```perl
use WWW::OpenAPIClient::Object::VehicleLocation;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**heading** | **double** | Heading in degrees. | [optional] 
**id** | **int** | ID of the vehicle. | 
**latitude** | **double** | Latitude in decimal degrees. | [optional] 
**location** | **string** | Text representation of nearest identifiable location to (latitude, longitude) coordinates. | [optional] 
**longitude** | **double** | Longitude in decimal degrees. | [optional] 
**name** | **string** | Name of the vehicle. | [optional] 
**odometer_meters** | **int** | The number of meters reported by the odometer. | [optional] 
**on_trip** | **boolean** | Whether or not a trip is currently in progress for this vehicle. More information available via /fleet/trips endpoint. | [optional] 
**speed** | **double** | Speed in miles per hour. | [optional] 
**time** | **int** | The time the reported location was logged, reported as a UNIX timestamp in milliseconds. | [optional] 
**vin** | **string** | Vehicle Identification Number (VIN) of the vehicle. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



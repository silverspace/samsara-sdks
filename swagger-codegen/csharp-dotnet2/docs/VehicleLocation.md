# samsara.Model.VehicleLocation
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Heading** | **double?** | Heading in degrees. | [optional] 
**Id** | **long?** | ID of the vehicle. | 
**Latitude** | **double?** | Latitude in decimal degrees. | [optional] 
**Location** | **string** | Text representation of nearest identifiable location to (latitude, longitude) coordinates. | [optional] 
**Longitude** | **double?** | Longitude in decimal degrees. | [optional] 
**Name** | **string** | Name of the vehicle. | [optional] 
**OdometerMeters** | **long?** | The number of meters reported by the odometer. | [optional] 
**OnTrip** | **bool?** | Whether or not a trip is currently in progress for this vehicle. More information available via /fleet/trips endpoint. | [optional] 
**Speed** | **double?** | Speed in miles per hour. | [optional] 
**Time** | **int?** | The time the reported location was logged, reported as a UNIX timestamp in milliseconds. | [optional] 
**Vin** | **string** | Vehicle Identification Number (VIN) of the vehicle. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


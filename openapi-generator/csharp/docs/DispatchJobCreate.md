# Org.OpenAPITools.Model.DispatchJobCreate
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DestinationAddress** | **string** | The address of the job destination, as it would be recognized if provided to maps.google.com. Optional if a valid destination address ID is provided. | [optional] 
**DestinationAddressId** | **long?** | ID of the job destination associated with an address book entry. Optional if valid values are provided for destination address or latitude/longitude. If a valid destination address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the destination name is not provided. | [optional] 
**DestinationLat** | **double?** | Latitude of the destination in decimal degrees. Optional if a valid destination address ID is provided. | [optional] 
**DestinationLng** | **double?** | Longitude of the destination in decimal degrees. Optional if a valid destination address ID is provided. | [optional] 
**DestinationName** | **string** | The name of the job destination. If provided, it will take precedence over the name of the address book entry. | [optional] 
**Notes** | **string** | Notes regarding the details of this job. | [optional] 
**ScheduledArrivalTimeMs** | **long?** | The time at which the assigned driver is scheduled to arrive at the job destination. | 
**ScheduledDepartureTimeMs** | **long?** | The time at which the assigned driver is scheduled to depart from the job destination. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


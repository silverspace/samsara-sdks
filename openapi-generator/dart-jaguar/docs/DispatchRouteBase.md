# openapi.model.DispatchRouteBase

## Load the model package
```dart
import 'package:openapi/api.dart';
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**actualEndMs** | **int** | The time in Unix epoch milliseconds that the route actually ended. | [optional] [default to null]
**actualStartMs** | **int** | The time in Unix epoch milliseconds that the route actually started. | [optional] [default to null]
**driverId** | **int** | ID of the driver assigned to the dispatch route. Note that driver_id and vehicle_id are mutually exclusive. If neither is specified, then the route is unassigned. | [optional] [default to null]
**groupId** | **int** | ID of the group if the organization has multiple groups (optional). | [optional] [default to null]
**name** | **String** | Descriptive name of this route. | [default to null]
**scheduledEndMs** | **int** | The time in Unix epoch milliseconds that the last job in the route is scheduled to end. | [default to null]
**scheduledMeters** | **int** | The distance expected to be traveled for this route in meters. | [optional] [default to null]
**scheduledStartMs** | **int** | The time in Unix epoch milliseconds that the route is scheduled to start. | [default to null]
**startLocationAddress** | **String** | The address of the route&#39;s starting location, as it would be recognized if provided to maps.google.com. Optional if a valid start location address ID is provided. | [optional] [default to null]
**startLocationAddressId** | **int** | ID of the start location associated with an address book entry. Optional if valid values are provided for start location address or latitude/longitude. If a valid start location address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the start location name is not provided. | [optional] [default to null]
**startLocationLat** | **double** | Latitude of the start location in decimal degrees. Optional if a valid start location address ID is provided. | [optional] [default to null]
**startLocationLng** | **double** | Longitude of the start location in decimal degrees. Optional if a valid start location address ID is provided. | [optional] [default to null]
**startLocationName** | **String** | The name of the route&#39;s starting location. If provided, it will take precedence over the name of the address book entry. | [optional] [default to null]
**trailerId** | **int** | ID of the trailer assigned to the dispatch route. Note that trailers can only be assigned to routes that have a Vehicle or Driver assigned to them. | [optional] [default to null]
**vehicleId** | **int** | ID of the vehicle assigned to the dispatch route. Note that vehicle_id and driver_id are mutually exclusive. If neither is specified, then the route is unassigned. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



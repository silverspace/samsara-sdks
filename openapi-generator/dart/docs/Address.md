# openapi.model.Address

## Load the model package
```dart
import 'package:openapi/api.dart';
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contacts** | [**List&lt;Contact&gt;**](Contact.md) |  | [optional] [default to []]
**formattedAddress** | **String** | The full address associated with this address/geofence, as it might be recognized by maps.google.com | [optional] [default to null]
**geofence** | [**AddressGeofence**](AddressGeofence.md) |  | [optional] [default to null]
**id** | **int** | ID of the address | [optional] [default to null]
**name** | **String** | Name of the address or geofence | [optional] [default to null]
**notes** | **String** | Notes associated with an address. | [optional] [default to null]
**tags** | [**List&lt;TagMetadata&gt;**](TagMetadata.md) |  | [optional] [default to []]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



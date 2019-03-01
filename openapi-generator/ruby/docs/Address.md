# OpenapiClient::Address

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contacts** | [**Array&lt;Contact&gt;**](Contact.md) |  | [optional] 
**formatted_address** | **String** | The full address associated with this address/geofence, as it might be recognized by maps.google.com | [optional] 
**geofence** | [**AddressGeofence**](AddressGeofence.md) |  | [optional] 
**id** | **Integer** | ID of the address | [optional] 
**name** | **String** | Name of the address or geofence | [optional] 
**notes** | **String** | Notes associated with an address. | [optional] 
**tags** | [**Array&lt;TagMetadata&gt;**](TagMetadata.md) |  | [optional] 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::Address.new(contacts: null,
                                 formatted_address: 350 Rhode Island St, San Francisco, CA,
                                 geofence: null,
                                 id: 123,
                                 name: Samsara HQ,
                                 notes: Delivery site 1,
                                 tags: null)
```



# OpenapiClient::AddressesAddresses

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**notes** | **String** | Notes associated with an address. | [optional] 
**formatted_address** | **String** | The full address associated with this address/geofence, as it might be recognized by maps.google.com | 
**geofence** | [**AddressGeofence**](AddressGeofence.md) |  | 
**tag_ids** | **Array&lt;Integer&gt;** | A list of tag IDs. | [optional] 
**name** | **String** | The name of this address/geofence | 
**contact_ids** | **Array&lt;Integer&gt;** | A list of IDs for contact book entries. | [optional] 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::AddressesAddresses.new(notes: Delivery site 1,
                                 formatted_address: 350 Rhode Island St, San Francisco, CA,
                                 geofence: null,
                                 tag_ids: null,
                                 name: Samsara HQ,
                                 contact_ids: null)
```



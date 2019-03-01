# OpenapiClient::InlineObject1

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contact_ids** | **Array&lt;Integer&gt;** | A list of IDs for contact book entries. | [optional] 
**formatted_address** | **String** | The full address associated with this address/geofence, as it might be recognized by maps.google.com | [optional] 
**geofence** | [**AddressGeofence**](AddressGeofence.md) |  | [optional] 
**name** | **String** | The name of this address/geofence | [optional] 
**notes** | **String** | Notes associated with an address. | [optional] 
**tag_ids** | **Array&lt;Integer&gt;** | A list of tag IDs. | [optional] 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::InlineObject1.new(contact_ids: null,
                                 formatted_address: 350 Rhode Island St, San Francisco, CA,
                                 geofence: null,
                                 name: Samsara HQ,
                                 notes: Delivery site 1,
                                 tag_ids: null)
```



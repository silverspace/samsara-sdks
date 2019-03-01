# OpenapiClient::DispatchRouteHistoricalEntry

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**changed_at_ms** | **Integer** | Timestamp that the route was updated, represented as Unix milliseconds since epoch. | [optional] 
**route** | [**DispatchRoute**](DispatchRoute.md) |  | [optional] 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::DispatchRouteHistoricalEntry.new(changed_at_ms: 1499411220000,
                                 route: null)
```



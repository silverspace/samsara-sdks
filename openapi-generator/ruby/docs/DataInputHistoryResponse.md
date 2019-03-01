# OpenapiClient::DataInputHistoryResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | The ID of this data input | [optional] 
**name** | **String** | Name of this data input | 
**points** | [**Array&lt;DataInputHistoryResponsePoints&gt;**](DataInputHistoryResponsePoints.md) | Data points from this data input | [optional] 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::DataInputHistoryResponse.new(id: 12345,
                                 name: Pump Flow,
                                 points: null)
```



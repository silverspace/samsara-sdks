# OpenapiClient::Pagination

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**end_cursor** | **String** | Cursor identifier representing the last element in the response. This value should be used in conjunction with a subsequent request&#39;s &#39;starting_after&#39; query parameter. | 
**has_next_page** | **BOOLEAN** | True if there are more pages of results after this response. | 
**has_prev_page** | **BOOLEAN** | True if there are more pages of results before this response. | 
**start_cursor** | **String** | Cursor identifier representing the first element in the response. This value should be used in conjunction with a subsequent request&#39;s &#39;ending_before&#39; query parameter. | 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::Pagination.new(end_cursor: MTU5MTEzNjA2OTU0MzQ3,
                                 has_next_page: null,
                                 has_prev_page: null,
                                 start_cursor: MTU5MTEzNjA2OTU0MzQ3)
```



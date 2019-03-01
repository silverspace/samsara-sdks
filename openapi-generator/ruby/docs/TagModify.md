# OpenapiClient::TagModify

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**add** | [**TagModifyAdd**](TagModifyAdd.md) |  | [optional] 
**delete** | [**TagModifyDelete**](TagModifyDelete.md) |  | [optional] 
**name** | **String** | Updated name of this tag. | [optional] 
**parent_tag_id** | **Integer** | If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag&#39;s parent tag. | [optional] 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::TagModify.new(add: null,
                                 delete: null,
                                 name: Broken Vehicles,
                                 parent_tag_id: 8389)
```



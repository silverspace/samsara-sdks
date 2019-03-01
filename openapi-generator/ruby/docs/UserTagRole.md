# OpenapiClient::UserTagRole

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**role** | **String** | The name of the role the user has been granted on this tag. | [optional] 
**role_id** | **String** | The id of the role the user has been granted on this tag. | 
**tag** | [**UserTagRoleTag**](UserTagRoleTag.md) |  | 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::UserTagRole.new(role: Full Admin,
                                 role_id: 8a9371af-82d1-4158-bf91-4ecc8d3a114c,
                                 tag: null)
```



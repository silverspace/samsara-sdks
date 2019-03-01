# OpenapiClient::UserBase

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**auth_type** | **String** | The authentication type the user uses to authenticate. To use SAML this organization must have a configured SAML integration. | 
**email** | **String** | The email address of this user. | 
**name** | **String** | The first and last name of the user. | [optional] 
**organization_role_id** | **String** | The id of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags. | [optional] 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::UserBase.new(auth_type: null,
                                 email: user@company.com,
                                 name: Jane Doe,
                                 organization_role_id: 23d4d8d3-dc10-4e7a-a183-69968751f23e)
```



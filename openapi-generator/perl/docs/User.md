# WWW::OpenAPIClient::Object::User

## Load the model package
```perl
use WWW::OpenAPIClient::Object::User;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**auth_type** | **string** | The authentication type the user uses to authenticate. To use SAML this organization must have a configured SAML integration. | 
**email** | **string** | The email address of this user. | 
**name** | **string** | The first and last name of the user. | [optional] 
**organization_role_id** | **string** | The id of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags. | [optional] 
**id** | **int** | The ID of the User record. | [optional] 
**organization_role** | **string** | The name of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags. | [optional] 
**tag_roles** | [**ARRAY[UserTagRole]**](UserTagRole.md) | The specific tags this user has access to. This will be blank for users that have full access to the organization. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



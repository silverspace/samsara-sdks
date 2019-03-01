# User

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**auth_type** | **String** | The authentication type the user uses to authenticate. To use SAML this organization must have a configured SAML integration. | 
**email** | **String** | The email address of this user. | 
**name** | **String** | The first and last name of the user. | [optional] 
**organization_role_id** | **String** | The id of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags. | [optional] 
**id** | **i64** | The ID of the User record. | [optional] 
**organization_role** | **String** | The name of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags. | [optional] 
**tag_roles** | [**Vec<::models::UserTagRole>**](UserTagRole.md) | The specific tags this user has access to. This will be blank for users that have full access to the organization. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



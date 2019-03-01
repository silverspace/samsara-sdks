# USER

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**auth_type** | [**STRING_32**](STRING_32.md) | The authentication type the user uses to authenticate. To use SAML this organization must have a configured SAML integration. | [default to null]
**email** | [**STRING_32**](STRING_32.md) | The email address of this user. | [default to null]
**name** | [**STRING_32**](STRING_32.md) | The first and last name of the user. | [optional] [default to null]
**organization_role_id** | [**STRING_32**](STRING_32.md) | The id of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags. | [optional] [default to null]
**id** | **INTEGER_64** | The ID of the User record. | [optional] [default to null]
**organization_role** | [**STRING_32**](STRING_32.md) | The name of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags. | [optional] [default to null]
**tag_roles** | [**LIST [USER_TAG_ROLE]**](UserTagRole.md) | The specific tags this user has access to. This will be blank for users that have full access to the organization. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



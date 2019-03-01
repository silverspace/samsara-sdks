# User

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**authType** | **String!** | The authentication type the user uses to authenticate. To use SAML this organization must have a configured SAML integration. | [default to null]
**email** | **String!** | The email address of this user. | [default to null]
**name** | **String!** | The first and last name of the user. | [optional] [default to null]
**organizationRoleId** | **String!** | The id of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags. | [optional] [default to null]
**Id_** | **Int!** | The ID of the User record. | [optional] [default to null]
**organizationRole** | **String!** | The name of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags. | [optional] [default to null]
**tagRoles** | [**UserTagRole**](UserTagRole.md) | The specific tags this user has access to. This will be blank for users that have full access to the organization. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



# Org.OpenAPITools.Model.User
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AuthType** | **string** | The authentication type the user uses to authenticate. To use SAML this organization must have a configured SAML integration. | 
**Email** | **string** | The email address of this user. | 
**Name** | **string** | The first and last name of the user. | [optional] 
**OrganizationRoleId** | **string** | The id of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags. | [optional] 
**Id** | **long** | The ID of the User record. | [optional] 
**OrganizationRole** | **string** | The name of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags. | [optional] 
**TagRoles** | [**List&lt;UserTagRole&gt;**](UserTagRole.md) | The specific tags this user has access to. This will be blank for users that have full access to the organization. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


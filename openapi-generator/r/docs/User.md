# openapi::User

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**authType** | **character** | The authentication type the user uses to authenticate. To use SAML this organization must have a configured SAML integration. | 
**email** | **character** | The email address of this user. | 
**name** | **character** | The first and last name of the user. | [optional] 
**organizationRoleId** | **character** | The id of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags. | [optional] 
**id** | **integer** | The ID of the User record. | [optional] 
**organizationRole** | **character** | The name of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags. | [optional] 
**tagRoles** | [**UserTagRole**](UserTagRole.md) | The specific tags this user has access to. This will be blank for users that have full access to the organization. | [optional] 



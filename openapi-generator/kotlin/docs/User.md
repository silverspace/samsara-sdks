
# User

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**authType** | [**inline**](#AuthTypeEnum) | The authentication type the user uses to authenticate. To use SAML this organization must have a configured SAML integration. | 
**email** | **kotlin.String** | The email address of this user. | 
**name** | **kotlin.String** | The first and last name of the user. |  [optional]
**organizationRoleId** | **kotlin.String** | The id of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags. |  [optional]
**id** | **kotlin.Long** | The ID of the User record. |  [optional]
**organizationRole** | **kotlin.String** | The name of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags. |  [optional]
**tagRoles** | [**kotlin.Array&lt;UserTagRole&gt;**](UserTagRole.md) | The specific tags this user has access to. This will be blank for users that have full access to the organization. |  [optional]


<a name="AuthTypeEnum"></a>
## Enum: authType
Name | Value
---- | -----
authType | default, saml




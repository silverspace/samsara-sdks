
# UserBase

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**authType** | [**AuthTypeEnum**](#AuthTypeEnum) | The authentication type the user uses to authenticate. To use SAML this organization must have a configured SAML integration. | 
**email** | **String** | The email address of this user. | 
**name** | **String** | The first and last name of the user. |  [optional]
**organizationRoleId** | **String** | The id of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags. |  [optional]


<a name="AuthTypeEnum"></a>
## Enum: AuthTypeEnum
Name | Value
---- | -----
DEFAULT | &quot;default&quot;
SAML | &quot;saml&quot;





package org.openapitools.client.model


case class UserBase (
    /* The authentication type the user uses to authenticate. To use SAML this organization must have a configured SAML integration. */
    _authType: String,
    /* The email address of this user. */
    _email: String,
    /* The first and last name of the user. */
    _name: Option[String],
    /* The id of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags. */
    _organizationRoleId: Option[String]
)
object UserBase {
    def toStringBody(var_authType: Object, var_email: Object, var_name: Object, var_organizationRoleId: Object) =
        s"""
        | {
        | "authType":$var_authType,"email":$var_email,"name":$var_name,"organizationRoleId":$var_organizationRoleId
        | }
        """.stripMargin
}

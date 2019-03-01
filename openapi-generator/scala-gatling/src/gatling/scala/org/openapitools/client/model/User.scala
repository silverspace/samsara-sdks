
package org.openapitools.client.model


case class User (
    /* The authentication type the user uses to authenticate. To use SAML this organization must have a configured SAML integration. */
    _authType: String,
    /* The email address of this user. */
    _email: String,
    /* The first and last name of the user. */
    _name: Option[String],
    /* The id of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags. */
    _organizationRoleId: Option[String],
    /* The ID of the User record. */
    _id: Option[Long],
    /* The name of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags. */
    _organizationRole: Option[String],
    /* The specific tags this user has access to. This will be blank for users that have full access to the organization. */
    _tagRoles: Option[List[UserTagRole]]
)
object User {
    def toStringBody(var_authType: Object, var_email: Object, var_name: Object, var_organizationRoleId: Object, var_id: Object, var_organizationRole: Object, var_tagRoles: Object) =
        s"""
        | {
        | "authType":$var_authType,"email":$var_email,"name":$var_name,"organizationRoleId":$var_organizationRoleId,"id":$var_id,"organizationRole":$var_organizationRole,"tagRoles":$var_tagRoles
        | }
        """.stripMargin
}

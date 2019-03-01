
package org.openapitools.client.model


case class UserTagRole (
    /* The name of the role the user has been granted on this tag. */
    _role: Option[String],
    /* The id of the role the user has been granted on this tag. */
    _roleId: String,
    _tag: UserTagRoleTag
)
object UserTagRole {
    def toStringBody(var_role: Object, var_roleId: Object, var_tag: Object) =
        s"""
        | {
        | "role":$var_role,"roleId":$var_roleId,"tag":$var_tag
        | }
        """.stripMargin
}

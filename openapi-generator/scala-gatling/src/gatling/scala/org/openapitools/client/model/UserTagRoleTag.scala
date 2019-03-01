
package org.openapitools.client.model


case class UserTagRoleTag (
    /* The ID of this tag. */
    _parentTagId: Option[Long],
    /* Name of this tag. */
    _name: String,
    /* The ID of this tag. */
    _id: Long
)
object UserTagRoleTag {
    def toStringBody(var_parentTagId: Object, var_name: Object, var_id: Object) =
        s"""
        | {
        | "parentTagId":$var_parentTagId,"name":$var_name,"id":$var_id
        | }
        """.stripMargin
}

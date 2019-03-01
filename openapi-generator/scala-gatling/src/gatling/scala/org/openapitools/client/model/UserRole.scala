
package org.openapitools.client.model


case class UserRole (
    _id: Option[String],
    _name: Option[String]
)
object UserRole {
    def toStringBody(var_id: Object, var_name: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name
        | }
        """.stripMargin
}

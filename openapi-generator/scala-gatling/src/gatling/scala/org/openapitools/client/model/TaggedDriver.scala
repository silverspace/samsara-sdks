
package org.openapitools.client.model


case class TaggedDriver (
    /* The ID of the Driver being tagged. */
    _id: Long,
    /* Name of the Driver being tagged. */
    _name: Option[String]
)
object TaggedDriver {
    def toStringBody(var_id: Object, var_name: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name
        | }
        """.stripMargin
}

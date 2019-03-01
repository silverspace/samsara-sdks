
package org.openapitools.client.model


case class TaggedAddress (
    /* The ID of the address being tagged. */
    _id: Long,
    /* Name of the address being tagged. */
    _name: Option[String]
)
object TaggedAddress {
    def toStringBody(var_id: Object, var_name: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name
        | }
        """.stripMargin
}

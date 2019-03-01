
package org.openapitools.client.model


case class TaggedAddressBase (
    /* The ID of the address being tagged. */
    _id: Long
)
object TaggedAddressBase {
    def toStringBody(var_id: Object) =
        s"""
        | {
        | "id":$var_id
        | }
        """.stripMargin
}

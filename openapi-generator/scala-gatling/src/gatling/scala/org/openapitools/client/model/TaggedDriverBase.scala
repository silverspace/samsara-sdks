
package org.openapitools.client.model


case class TaggedDriverBase (
    /* The ID of the Driver being tagged. */
    _id: Long
)
object TaggedDriverBase {
    def toStringBody(var_id: Object) =
        s"""
        | {
        | "id":$var_id
        | }
        """.stripMargin
}

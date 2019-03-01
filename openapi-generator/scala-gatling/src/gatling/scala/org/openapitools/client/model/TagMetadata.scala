
package org.openapitools.client.model


case class TagMetadata (
    /* The ID of this tag. */
    _id: Long,
    /* Name of this tag. */
    _name: String
)
object TagMetadata {
    def toStringBody(var_id: Object, var_name: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name
        | }
        """.stripMargin
}


package org.openapitools.client.model


case class TaggedAssetBase (
    /* The ID of the Asset being tagged. */
    _id: Long
)
object TaggedAssetBase {
    def toStringBody(var_id: Object) =
        s"""
        | {
        | "id":$var_id
        | }
        """.stripMargin
}


package org.openapitools.client.model


case class TaggedAsset (
    /* The ID of the Asset being tagged. */
    _id: Long,
    /* Name of the Asset being tagged. */
    _name: Option[String]
)
object TaggedAsset {
    def toStringBody(var_id: Object, var_name: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name
        | }
        """.stripMargin
}

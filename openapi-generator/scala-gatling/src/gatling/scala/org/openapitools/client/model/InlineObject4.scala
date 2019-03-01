
package org.openapitools.client.model


case class InlineObject4 (
    /* True indicates that this driver should be reactivated. */
    _reactivate: Boolean
)
object InlineObject4 {
    def toStringBody(var_reactivate: Object) =
        s"""
        | {
        | "reactivate":$var_reactivate
        | }
        """.stripMargin
}

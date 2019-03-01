
package org.openapitools.client.model


case class InlineObject11 (
    /* Group ID to query. */
    _groupId: Long
)
object InlineObject11 {
    def toStringBody(var_groupId: Object) =
        s"""
        | {
        | "groupId":$var_groupId
        | }
        """.stripMargin
}


package org.openapitools.client.model


case class InlineObject13 (
    /* Group ID to query. */
    _groupId: Long
)
object InlineObject13 {
    def toStringBody(var_groupId: Object) =
        s"""
        | {
        | "groupId":$var_groupId
        | }
        """.stripMargin
}

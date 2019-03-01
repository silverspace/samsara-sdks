
package org.openapitools.client.model


case class InlineObject9 (
    /* Group ID to query. */
    _groupId: Long
)
object InlineObject9 {
    def toStringBody(var_groupId: Object) =
        s"""
        | {
        | "groupId":$var_groupId
        | }
        """.stripMargin
}

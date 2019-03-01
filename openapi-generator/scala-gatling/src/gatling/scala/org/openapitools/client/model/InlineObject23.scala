
package org.openapitools.client.model


case class InlineObject23 (
    /* Group ID to query. */
    _groupId: Long
)
object InlineObject23 {
    def toStringBody(var_groupId: Object) =
        s"""
        | {
        | "groupId":$var_groupId
        | }
        """.stripMargin
}

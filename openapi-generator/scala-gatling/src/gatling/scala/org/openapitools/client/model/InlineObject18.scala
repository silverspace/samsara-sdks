
package org.openapitools.client.model


case class InlineObject18 (
    /* Group ID to query. */
    _groupId: Long
)
object InlineObject18 {
    def toStringBody(var_groupId: Object) =
        s"""
        | {
        | "groupId":$var_groupId
        | }
        """.stripMargin
}

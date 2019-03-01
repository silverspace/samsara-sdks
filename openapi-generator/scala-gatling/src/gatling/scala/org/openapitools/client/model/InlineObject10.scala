
package org.openapitools.client.model


case class InlineObject10 (
    /* Group ID to query. */
    _groupId: Long
)
object InlineObject10 {
    def toStringBody(var_groupId: Object) =
        s"""
        | {
        | "groupId":$var_groupId
        | }
        """.stripMargin
}

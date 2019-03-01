
package org.openapitools.client.model


case class InlineObject3 (
    /* Group ID to query. */
    _groupId: Long
)
object InlineObject3 {
    def toStringBody(var_groupId: Object) =
        s"""
        | {
        | "groupId":$var_groupId
        | }
        """.stripMargin
}

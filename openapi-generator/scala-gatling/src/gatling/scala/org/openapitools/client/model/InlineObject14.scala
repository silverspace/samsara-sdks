
package org.openapitools.client.model


case class InlineObject14 (
    /* Group ID to query. */
    _groupId: Long,
    _vehicles: List[Vehicle]
)
object InlineObject14 {
    def toStringBody(var_groupId: Object, var_vehicles: Object) =
        s"""
        | {
        | "groupId":$var_groupId,"vehicles":$var_vehicles
        | }
        """.stripMargin
}

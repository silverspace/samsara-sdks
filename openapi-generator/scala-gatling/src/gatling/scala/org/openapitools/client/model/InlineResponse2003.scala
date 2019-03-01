
package org.openapitools.client.model


case class InlineResponse2003 (
    /* Group ID to query. */
    _groupId: Option[Long],
    _vehicles: Option[List[VehicleLocation]]
)
object InlineResponse2003 {
    def toStringBody(var_groupId: Object, var_vehicles: Object) =
        s"""
        | {
        | "groupId":$var_groupId,"vehicles":$var_vehicles
        | }
        """.stripMargin
}


package org.openapitools.client.model


case class InlineResponse2004 (
    _vehicles: Option[List[VehicleMaintenance]]
)
object InlineResponse2004 {
    def toStringBody(var_vehicles: Object) =
        s"""
        | {
        | "vehicles":$var_vehicles
        | }
        """.stripMargin
}

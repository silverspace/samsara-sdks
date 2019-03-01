
package org.openapitools.client.model


case class InlineResponse2005 (
    _pagination: Option[Pagination],
    _vehicleStats: List[InlineResponse2005VehicleStats]
)
object InlineResponse2005 {
    def toStringBody(var_pagination: Object, var_vehicleStats: Object) =
        s"""
        | {
        | "pagination":$var_pagination,"vehicleStats":$var_vehicleStats
        | }
        """.stripMargin
}

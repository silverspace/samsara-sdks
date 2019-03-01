
package org.openapitools.client.model


case class VehicleMaintenancePassengerCheckEngineLight (
    _isOn: Option[Boolean]
)
object VehicleMaintenancePassengerCheckEngineLight {
    def toStringBody(var_isOn: Object) =
        s"""
        | {
        | "isOn":$var_isOn
        | }
        """.stripMargin
}

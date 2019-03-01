
package org.openapitools.client.model


case class VehicleMaintenancePassenger (
    _checkEngineLight: Option[VehicleMaintenancePassengerCheckEngineLight],
    /* Passenger vehicle DTCs. */
    _diagnosticTroubleCodes: Option[List[VehicleMaintenancePassengerDiagnosticTroubleCodes]]
)
object VehicleMaintenancePassenger {
    def toStringBody(var_checkEngineLight: Object, var_diagnosticTroubleCodes: Object) =
        s"""
        | {
        | "checkEngineLight":$var_checkEngineLight,"diagnosticTroubleCodes":$var_diagnosticTroubleCodes
        | }
        """.stripMargin
}


package org.openapitools.client.model


case class VehicleMaintenanceJ1939 (
    _checkEngineLight: Option[VehicleMaintenanceJ1939CheckEngineLight],
    /* J1939 DTCs. */
    _diagnosticTroubleCodes: Option[List[VehicleMaintenanceJ1939DiagnosticTroubleCodes]]
)
object VehicleMaintenanceJ1939 {
    def toStringBody(var_checkEngineLight: Object, var_diagnosticTroubleCodes: Object) =
        s"""
        | {
        | "checkEngineLight":$var_checkEngineLight,"diagnosticTroubleCodes":$var_diagnosticTroubleCodes
        | }
        """.stripMargin
}

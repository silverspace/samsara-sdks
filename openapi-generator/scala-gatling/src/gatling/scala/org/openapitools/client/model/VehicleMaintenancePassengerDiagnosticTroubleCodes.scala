
package org.openapitools.client.model


case class VehicleMaintenancePassengerDiagnosticTroubleCodes (
    _dtcShortCode: Option[String],
    _dtcId: Option[Integer],
    _dtcDescription: Option[String]
)
object VehicleMaintenancePassengerDiagnosticTroubleCodes {
    def toStringBody(var_dtcShortCode: Object, var_dtcId: Object, var_dtcDescription: Object) =
        s"""
        | {
        | "dtcShortCode":$var_dtcShortCode,"dtcId":$var_dtcId,"dtcDescription":$var_dtcDescription
        | }
        """.stripMargin
}

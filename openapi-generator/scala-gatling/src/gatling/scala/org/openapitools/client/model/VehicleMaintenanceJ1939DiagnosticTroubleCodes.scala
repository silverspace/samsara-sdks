
package org.openapitools.client.model


case class VehicleMaintenanceJ1939DiagnosticTroubleCodes (
    _spnDescription: Option[String],
    _fmiText: Option[String],
    _spnId: Option[Integer],
    _occurrenceCount: Option[Integer],
    _txId: Option[Integer],
    _fmiId: Option[Integer]
)
object VehicleMaintenanceJ1939DiagnosticTroubleCodes {
    def toStringBody(var_spnDescription: Object, var_fmiText: Object, var_spnId: Object, var_occurrenceCount: Object, var_txId: Object, var_fmiId: Object) =
        s"""
        | {
        | "spnDescription":$var_spnDescription,"fmiText":$var_fmiText,"spnId":$var_spnId,"occurrenceCount":$var_occurrenceCount,"txId":$var_txId,"fmiId":$var_fmiId
        | }
        """.stripMargin
}

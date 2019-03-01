
package org.openapitools.client.model


case class VehicleMaintenanceJ1939CheckEngineLight (
    _protectIsOn: Option[Boolean],
    _stopIsOn: Option[Boolean],
    _warningIsOn: Option[Boolean],
    _emissionsIsOn: Option[Boolean]
)
object VehicleMaintenanceJ1939CheckEngineLight {
    def toStringBody(var_protectIsOn: Object, var_stopIsOn: Object, var_warningIsOn: Object, var_emissionsIsOn: Object) =
        s"""
        | {
        | "protectIsOn":$var_protectIsOn,"stopIsOn":$var_stopIsOn,"warningIsOn":$var_warningIsOn,"emissionsIsOn":$var_emissionsIsOn
        | }
        """.stripMargin
}

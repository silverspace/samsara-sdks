
package org.openapitools.client.model


case class AssetReeferResponseReeferStatsAlarms (
    /* Severity of the alarm: 1: OK to run, 2: Check as specified, 3: Take immediate action */
    _severity: Option[Long],
    /* Recommended operator action */
    _operatorAction: Option[String],
    /* Description of the alarm */
    _description: Option[String],
    /* ID of the alarm */
    _alarmCode: Option[Long]
)
object AssetReeferResponseReeferStatsAlarms {
    def toStringBody(var_severity: Object, var_operatorAction: Object, var_description: Object, var_alarmCode: Object) =
        s"""
        | {
        | "severity":$var_severity,"operatorAction":$var_operatorAction,"description":$var_description,"alarmCode":$var_alarmCode
        | }
        """.stripMargin
}

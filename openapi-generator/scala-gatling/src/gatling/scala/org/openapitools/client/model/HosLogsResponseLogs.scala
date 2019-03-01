
package org.openapitools.client.model


case class HosLogsResponseLogs (
    /* Longitude at which the log was recorded. */
    _locLng: Option[Double],
    /* The time at which the log/HOS status started in UNIX milliseconds. */
    _logStartMs: Option[Long],
    /* ID of the driver. */
    _driverId: Option[Long],
    /* The Hours of Service status type. One of `OFF_DUTY`, `SLEEPER_BED`, `DRIVING`, `ON_DUTY`, `YARD_MOVE`, `PERSONAL_CONVEYANCE`. */
    _statusType: Option[String],
    /* City in which the log was recorded. */
    _locCity: Option[String],
    /* ID of the group. */
    _groupId: Option[Long],
    /* Name of location at which the log was recorded. */
    _locName: Option[String],
    /* Latitude at which the log was recorded. */
    _locLat: Option[Double],
    /* Remark associated with the log entry. */
    _remark: Option[String],
    /* State in which the log was recorded. */
    _locState: Option[String],
    /* ID of the vehicle. */
    _vehicleId: Option[Long],
    _codriverIds: Option[List[Long]]
)
object HosLogsResponseLogs {
    def toStringBody(var_locLng: Object, var_logStartMs: Object, var_driverId: Object, var_statusType: Object, var_locCity: Object, var_groupId: Object, var_locName: Object, var_locLat: Object, var_remark: Object, var_locState: Object, var_vehicleId: Object, var_codriverIds: Object) =
        s"""
        | {
        | "locLng":$var_locLng,"logStartMs":$var_logStartMs,"driverId":$var_driverId,"statusType":$var_statusType,"locCity":$var_locCity,"groupId":$var_groupId,"locName":$var_locName,"locLat":$var_locLat,"remark":$var_remark,"locState":$var_locState,"vehicleId":$var_vehicleId,"codriverIds":$var_codriverIds
        | }
        """.stripMargin
}

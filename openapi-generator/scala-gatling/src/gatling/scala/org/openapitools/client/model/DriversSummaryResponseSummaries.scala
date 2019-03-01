
package org.openapitools.client.model


case class DriversSummaryResponseSummaries (
    /* ID of the driver. */
    _driverId: Option[Long],
    /* Distance driven in miles, rounded to two decimal places. */
    _distanceMiles: Option[Double],
    /* Duration in milliseconds that driver was driving during the requested time range */
    _driveMs: Option[Long],
    /* Duration in milliseconds that driver was on duty or driving during the requested time range */
    _activeMs: Option[Long],
    /* Username of the driver. */
    _driverUsername: Option[String],
    /* Group of the driver. */
    _groupId: Option[Long],
    /* Name of the driver. */
    _driverName: Option[String],
    /* Duration in milliseconds that driver was on duty during the requested time range */
    _onDutyMs: Option[Long]
)
object DriversSummaryResponseSummaries {
    def toStringBody(var_driverId: Object, var_distanceMiles: Object, var_driveMs: Object, var_activeMs: Object, var_driverUsername: Object, var_groupId: Object, var_driverName: Object, var_onDutyMs: Object) =
        s"""
        | {
        | "driverId":$var_driverId,"distanceMiles":$var_distanceMiles,"driveMs":$var_driveMs,"activeMs":$var_activeMs,"driverUsername":$var_driverUsername,"groupId":$var_groupId,"driverName":$var_driverName,"onDutyMs":$var_onDutyMs
        | }
        """.stripMargin
}

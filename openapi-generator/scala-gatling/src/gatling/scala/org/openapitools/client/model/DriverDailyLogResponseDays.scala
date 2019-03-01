
package org.openapitools.client.model


case class DriverDailyLogResponseDays (
    /* Unix epoch time (in ms) of time when this chart was certified. If this chart is uncertified, 0. */
    _certifiedAtMs: Option[Long],
    /* End of the HOS day, specified in milliseconds UNIX time. */
    _endMs: Option[Integer],
    /* End of the HOS day, specified in milliseconds UNIX time. */
    _startMs: Option[Integer],
    /* List of trailer ID's associated with the driver for the day. */
    _trailerIds: Option[Any],
    /* Hours spent on duty or driving, rounded to two decimal places. */
    _activeHours: Option[Double],
    /* Distance driven in miles, rounded to two decimal places. */
    _distanceMiles: Option[Double],
    /* Milliseconds spent on duty or driving. */
    _activeMs: Option[Long],
    /* Whether this HOS day chart was certified by the driver. */
    _certified: Option[Boolean],
    /* List of vehicle ID's associated with the driver for the day. */
    _vehicleIds: Option[Any]
)
object DriverDailyLogResponseDays {
    def toStringBody(var_certifiedAtMs: Object, var_endMs: Object, var_startMs: Object, var_trailerIds: Object, var_activeHours: Object, var_distanceMiles: Object, var_activeMs: Object, var_certified: Object, var_vehicleIds: Object) =
        s"""
        | {
        | "certifiedAtMs":$var_certifiedAtMs,"endMs":$var_endMs,"startMs":$var_startMs,"trailerIds":$var_trailerIds,"activeHours":$var_activeHours,"distanceMiles":$var_distanceMiles,"activeMs":$var_activeMs,"certified":$var_certified,"vehicleIds":$var_vehicleIds
        | }
        """.stripMargin
}

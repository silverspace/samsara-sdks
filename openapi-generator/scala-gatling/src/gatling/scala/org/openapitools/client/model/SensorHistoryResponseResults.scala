
package org.openapitools.client.model


case class SensorHistoryResponseResults (
    /* List of datapoints, one for each requested (sensor, field) pair. */
    _series: Option[List[Long]],
    /* Timestamp in UNIX milliseconds. */
    _timeMs: Option[Integer]
)
object SensorHistoryResponseResults {
    def toStringBody(var_series: Object, var_timeMs: Object) =
        s"""
        | {
        | "series":$var_series,"timeMs":$var_timeMs
        | }
        """.stripMargin
}

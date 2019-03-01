
package org.openapitools.client.model


case class SafetyReportHarshEvent (
    /* Type of the harsh event */
    _harshEventType: Option[String],
    /* Timestamp that the harsh event occurred in Unix milliseconds since epoch */
    _timestampMs: Option[Integer],
    /* Vehicle associated with the harsh event */
    _vehicleId: Option[Integer]
)
object SafetyReportHarshEvent {
    def toStringBody(var_harshEventType: Object, var_timestampMs: Object, var_vehicleId: Object) =
        s"""
        | {
        | "harshEventType":$var_harshEventType,"timestampMs":$var_timestampMs,"vehicleId":$var_vehicleId
        | }
        """.stripMargin
}

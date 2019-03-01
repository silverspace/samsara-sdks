
package org.openapitools.client.model


case class InlineObject15 (
    /* End of the time range, specified in milliseconds UNIX time. */
    _endMs: Integer,
    /* Group ID to query. */
    _groupId: Long,
    /* Beginning of the time range, specified in milliseconds UNIX time. Limited to a 90 day window with respect to startMs and endMs */
    _startMs: Integer,
    /* Vehicle ID to query. */
    _vehicleId: Long
)
object InlineObject15 {
    def toStringBody(var_endMs: Object, var_groupId: Object, var_startMs: Object, var_vehicleId: Object) =
        s"""
        | {
        | "endMs":$var_endMs,"groupId":$var_groupId,"startMs":$var_startMs,"vehicleId":$var_vehicleId
        | }
        """.stripMargin
}

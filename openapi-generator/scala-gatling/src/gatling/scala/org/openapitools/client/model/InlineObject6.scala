
package org.openapitools.client.model


case class InlineObject6 (
    /* Driver ID to query. */
    _driverId: Long,
    /* End of the time range, specified in milliseconds UNIX time. */
    _endMs: Integer,
    /* Group ID to query. */
    _groupId: Long,
    /* Beginning of the time range, specified in milliseconds UNIX time. */
    _startMs: Integer
)
object InlineObject6 {
    def toStringBody(var_driverId: Object, var_endMs: Object, var_groupId: Object, var_startMs: Object) =
        s"""
        | {
        | "driverId":$var_driverId,"endMs":$var_endMs,"groupId":$var_groupId,"startMs":$var_startMs
        | }
        """.stripMargin
}

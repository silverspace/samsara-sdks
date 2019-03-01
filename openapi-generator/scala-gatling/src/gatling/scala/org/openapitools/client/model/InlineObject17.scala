
package org.openapitools.client.model


case class InlineObject17 (
    /* End of the time range, specified in milliseconds UNIX time. */
    _endMs: Integer,
    /* Group ID to query. */
    _groupId: Long,
    /* Beginning of the time range, specified in milliseconds UNIX time. */
    _startMs: Integer
)
object InlineObject17 {
    def toStringBody(var_endMs: Object, var_groupId: Object, var_startMs: Object) =
        s"""
        | {
        | "endMs":$var_endMs,"groupId":$var_groupId,"startMs":$var_startMs
        | }
        """.stripMargin
}

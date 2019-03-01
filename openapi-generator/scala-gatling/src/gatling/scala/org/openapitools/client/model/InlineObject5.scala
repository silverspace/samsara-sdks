
package org.openapitools.client.model


case class InlineObject5 (
    /* End time (ms) of queried time period. */
    _endMs: Long,
    /* Org ID to query. */
    _orgId: Long,
    /* Start time (ms) of queried time period. */
    _startMs: Long
)
object InlineObject5 {
    def toStringBody(var_endMs: Object, var_orgId: Object, var_startMs: Object) =
        s"""
        | {
        | "endMs":$var_endMs,"orgId":$var_orgId,"startMs":$var_startMs
        | }
        """.stripMargin
}


package org.openapitools.client.model


case class InlineObject21 (
    /* End of the time range, specified in milliseconds UNIX time. */
    _endMs: Integer,
    _fillMissing: Option[String],
    /* Group ID to query. */
    _groupId: Long,
    _series: List[SensorsHistorySeries],
    /* Beginning of the time range, specified in milliseconds UNIX time. */
    _startMs: Integer,
    /* Time resolution for which data should be returned, in milliseconds. Specifying 3600000 will return data at hour intervals. */
    _stepMs: Integer
)
object InlineObject21 {
    def toStringBody(var_endMs: Object, var_fillMissing: Object, var_groupId: Object, var_series: Object, var_startMs: Object, var_stepMs: Object) =
        s"""
        | {
        | "endMs":$var_endMs,"fillMissing":$var_fillMissing,"groupId":$var_groupId,"series":$var_series,"startMs":$var_startMs,"stepMs":$var_stepMs
        | }
        """.stripMargin
}


package org.openapitools.client.model


case class EngineState (
    /* Timestamp in Unix epoch milliseconds. */
    _timeMs: Any,
    _value: String
)
object EngineState {
    def toStringBody(var_timeMs: Object, var_value: Object) =
        s"""
        | {
        | "timeMs":$var_timeMs,"value":$var_value
        | }
        """.stripMargin
}

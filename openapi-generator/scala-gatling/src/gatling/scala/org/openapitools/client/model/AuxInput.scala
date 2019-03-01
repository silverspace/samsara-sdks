
package org.openapitools.client.model


case class AuxInput (
    /* Timestamp in Unix epoch milliseconds. */
    _timeMs: Any,
    /* Boolean representing the digital value of the aux input. */
    _value: Boolean
)
object AuxInput {
    def toStringBody(var_timeMs: Object, var_value: Object) =
        s"""
        | {
        | "timeMs":$var_timeMs,"value":$var_value
        | }
        """.stripMargin
}

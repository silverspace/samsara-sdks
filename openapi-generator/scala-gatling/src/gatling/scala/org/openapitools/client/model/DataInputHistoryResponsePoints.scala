
package org.openapitools.client.model


case class DataInputHistoryResponsePoints (
    _value: Option[Double],
    _timeMs: Option[Long]
)
object DataInputHistoryResponsePoints {
    def toStringBody(var_value: Object, var_timeMs: Object) =
        s"""
        | {
        | "value":$var_value,"timeMs":$var_timeMs
        | }
        """.stripMargin
}


package org.openapitools.client.model


case class MachineHistoryResponseVibrations (
    _X: Option[Double],
    _Y: Option[Double],
    _Z: Option[Double],
    _time: Option[Long]
)
object MachineHistoryResponseVibrations {
    def toStringBody(var_X: Object, var_Y: Object, var_Z: Object, var_time: Object) =
        s"""
        | {
        | "X":$var_X,"Y":$var_Y,"Z":$var_Z,"time":$var_time
        | }
        """.stripMargin
}

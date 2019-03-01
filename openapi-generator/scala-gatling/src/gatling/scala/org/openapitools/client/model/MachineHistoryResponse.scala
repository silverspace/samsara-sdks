
package org.openapitools.client.model


case class MachineHistoryResponse (
    _machines: Option[List[MachineHistoryResponseMachines]]
)
object MachineHistoryResponse {
    def toStringBody(var_machines: Object) =
        s"""
        | {
        | "machines":$var_machines
        | }
        """.stripMargin
}

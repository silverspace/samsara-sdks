
package org.openapitools.client.model


case class CargoResponse (
    _groupId: Option[Long],
    _sensors: Option[List[CargoResponseSensors]]
)
object CargoResponse {
    def toStringBody(var_groupId: Object, var_sensors: Object) =
        s"""
        | {
        | "groupId":$var_groupId,"sensors":$var_sensors
        | }
        """.stripMargin
}

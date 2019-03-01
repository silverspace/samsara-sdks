
package org.openapitools.client.model


case class DoorResponse (
    _groupId: Option[Long],
    _sensors: Option[List[DoorResponseSensors]]
)
object DoorResponse {
    def toStringBody(var_groupId: Object, var_sensors: Object) =
        s"""
        | {
        | "groupId":$var_groupId,"sensors":$var_sensors
        | }
        """.stripMargin
}

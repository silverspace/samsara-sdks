
package org.openapitools.client.model


case class HumidityResponse (
    _groupId: Option[Long],
    _sensors: Option[List[HumidityResponseSensors]]
)
object HumidityResponse {
    def toStringBody(var_groupId: Object, var_sensors: Object) =
        s"""
        | {
        | "groupId":$var_groupId,"sensors":$var_sensors
        | }
        """.stripMargin
}

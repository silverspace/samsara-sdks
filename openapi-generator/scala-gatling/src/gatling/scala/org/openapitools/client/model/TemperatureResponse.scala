
package org.openapitools.client.model


case class TemperatureResponse (
    _groupId: Option[Long],
    _sensors: Option[List[TemperatureResponseSensors]]
)
object TemperatureResponse {
    def toStringBody(var_groupId: Object, var_sensors: Object) =
        s"""
        | {
        | "groupId":$var_groupId,"sensors":$var_sensors
        | }
        """.stripMargin
}

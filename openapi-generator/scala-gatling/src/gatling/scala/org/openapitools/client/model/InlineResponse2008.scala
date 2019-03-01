
package org.openapitools.client.model


case class InlineResponse2008 (
    _sensors: Option[List[Sensor]]
)
object InlineResponse2008 {
    def toStringBody(var_sensors: Object) =
        s"""
        | {
        | "sensors":$var_sensors
        | }
        """.stripMargin
}

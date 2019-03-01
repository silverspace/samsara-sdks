
package org.openapitools.client.model


case class Sensor (
    /* ID of the sensor. */
    _id: Long,
    /* MAC address of the sensor. */
    _macAddress: Option[String],
    /* Name of the sensor. */
    _name: Option[String]
)
object Sensor {
    def toStringBody(var_id: Object, var_macAddress: Object, var_name: Object) =
        s"""
        | {
        | "id":$var_id,"macAddress":$var_macAddress,"name":$var_name
        | }
        """.stripMargin
}

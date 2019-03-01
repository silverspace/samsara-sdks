
package org.openapitools.client.model


case class HumidityResponseSensors (
    /* Name of the sensor. */
    _name: Option[String],
    /* Currently reported relative humidity in percent, from 0-100. */
    _humidity: Option[Integer],
    /* ID of the sensor. */
    _id: Option[Long]
)
object HumidityResponseSensors {
    def toStringBody(var_name: Object, var_humidity: Object, var_id: Object) =
        s"""
        | {
        | "name":$var_name,"humidity":$var_humidity,"id":$var_id
        | }
        """.stripMargin
}

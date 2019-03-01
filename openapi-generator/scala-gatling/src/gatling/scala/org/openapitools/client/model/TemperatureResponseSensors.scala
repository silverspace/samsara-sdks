
package org.openapitools.client.model


case class TemperatureResponseSensors (
    /* Currently reported probe temperature in millidegrees celsius. If no probe is connected, this parameter will not be reported. */
    _probeTemperature: Option[Integer],
    /* Name of the sensor. */
    _name: Option[String],
    /* ID of the sensor. */
    _id: Option[Long],
    /* Currently reported ambient temperature in millidegrees celsius. */
    _ambientTemperature: Option[Integer]
)
object TemperatureResponseSensors {
    def toStringBody(var_probeTemperature: Object, var_name: Object, var_id: Object, var_ambientTemperature: Object) =
        s"""
        | {
        | "probeTemperature":$var_probeTemperature,"name":$var_name,"id":$var_id,"ambientTemperature":$var_ambientTemperature
        | }
        """.stripMargin
}

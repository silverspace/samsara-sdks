
package org.openapitools.client.model


case class VehicleHarshEventResponseLocation (
    /* Address of location where the harsh event occurred */
    _address: Option[String],
    /* Latitude of location where the harsh event occurred */
    _latitude: Option[String],
    /* Longitude of location where the harsh event occurred */
    _longitude: Option[String]
)
object VehicleHarshEventResponseLocation {
    def toStringBody(var_address: Object, var_latitude: Object, var_longitude: Object) =
        s"""
        | {
        | "address":$var_address,"latitude":$var_latitude,"longitude":$var_longitude
        | }
        """.stripMargin
}

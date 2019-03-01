
package org.openapitools.client.model


case class FleetVehicleLocation (
    /* The latitude of the location in degrees. */
    _latitude: Option[Double],
    /* The best effort (street,city,state) for the latitude and longitude. */
    _location: Option[String],
    /* The longitude of the location in degrees. */
    _longitude: Option[Double],
    /* The speed calculated from GPS that the asset was traveling at in miles per hour. */
    _speedMilesPerHour: Option[Double],
    /* Time in Unix milliseconds since epoch when the asset was at the location. */
    _timeMs: Option[Long]
)
object FleetVehicleLocation {
    def toStringBody(var_latitude: Object, var_location: Object, var_longitude: Object, var_speedMilesPerHour: Object, var_timeMs: Object) =
        s"""
        | {
        | "latitude":$var_latitude,"location":$var_location,"longitude":$var_longitude,"speedMilesPerHour":$var_speedMilesPerHour,"timeMs":$var_timeMs
        | }
        """.stripMargin
}

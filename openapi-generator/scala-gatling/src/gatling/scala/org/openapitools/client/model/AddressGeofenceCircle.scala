
package org.openapitools.client.model


case class AddressGeofenceCircle (
    /* The latitude of the center of the circular geofence */
    _latitude: Option[Double],
    /* The radius of the circular geofence */
    _radiusMeters: Option[Long],
    /* The longitude of the center of the circular geofence */
    _longitude: Option[Double]
)
object AddressGeofenceCircle {
    def toStringBody(var_latitude: Object, var_radiusMeters: Object, var_longitude: Object) =
        s"""
        | {
        | "latitude":$var_latitude,"radiusMeters":$var_radiusMeters,"longitude":$var_longitude
        | }
        """.stripMargin
}

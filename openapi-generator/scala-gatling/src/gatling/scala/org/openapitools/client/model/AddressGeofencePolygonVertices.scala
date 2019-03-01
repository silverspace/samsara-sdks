
package org.openapitools.client.model


case class AddressGeofencePolygonVertices (
    /* The longitude of a geofence vertex */
    _latitude: Option[Double],
    /* The longitude of a geofence vertex */
    _longitude: Option[Double]
)
object AddressGeofencePolygonVertices {
    def toStringBody(var_latitude: Object, var_longitude: Object) =
        s"""
        | {
        | "latitude":$var_latitude,"longitude":$var_longitude
        | }
        """.stripMargin
}

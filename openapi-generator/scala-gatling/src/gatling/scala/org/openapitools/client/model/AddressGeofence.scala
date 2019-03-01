
package org.openapitools.client.model


case class AddressGeofence (
    _circle: Option[AddressGeofenceCircle],
    _polygon: Option[AddressGeofencePolygon]
)
object AddressGeofence {
    def toStringBody(var_circle: Object, var_polygon: Object) =
        s"""
        | {
        | "circle":$var_circle,"polygon":$var_polygon
        | }
        """.stripMargin
}

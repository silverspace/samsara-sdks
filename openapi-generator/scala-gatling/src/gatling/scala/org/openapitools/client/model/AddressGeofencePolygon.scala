
package org.openapitools.client.model


case class AddressGeofencePolygon (
    /* The vertices of the polygon geofence. These geofence vertices describe the perimeter of the polygon, and must consist of at least 3 vertices and less than 40. */
    _vertices: Option[List[AddressGeofencePolygonVertices]]
)
object AddressGeofencePolygon {
    def toStringBody(var_vertices: Object) =
        s"""
        | {
        | "vertices":$var_vertices
        | }
        """.stripMargin
}

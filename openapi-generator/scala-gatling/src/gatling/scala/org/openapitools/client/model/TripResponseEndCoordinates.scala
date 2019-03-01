
package org.openapitools.client.model


case class TripResponseEndCoordinates (
    _latitude: Option[Double],
    _longitude: Option[Double]
)
object TripResponseEndCoordinates {
    def toStringBody(var_latitude: Object, var_longitude: Object) =
        s"""
        | {
        | "latitude":$var_latitude,"longitude":$var_longitude
        | }
        """.stripMargin
}

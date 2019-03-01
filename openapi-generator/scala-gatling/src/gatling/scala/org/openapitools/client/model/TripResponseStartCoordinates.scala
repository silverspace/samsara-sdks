
package org.openapitools.client.model


case class TripResponseStartCoordinates (
    _latitude: Option[Double],
    _longitude: Option[Double]
)
object TripResponseStartCoordinates {
    def toStringBody(var_latitude: Object, var_longitude: Object) =
        s"""
        | {
        | "latitude":$var_latitude,"longitude":$var_longitude
        | }
        """.stripMargin
}

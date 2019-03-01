
package org.openapitools.client.model


case class TripResponse (
    _trips: Option[List[TripResponseTrips]]
)
object TripResponse {
    def toStringBody(var_trips: Object) =
        s"""
        | {
        | "trips":$var_trips
        | }
        """.stripMargin
}

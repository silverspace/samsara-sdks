package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import DispatchRoute._

case class DispatchRoute (
  /* The time in Unix epoch milliseconds that the route actually ended. */
  actualEndMs: Option[Long],
/* The time in Unix epoch milliseconds that the route actually started. */
  actualStartMs: Option[Long],
/* ID of the driver assigned to the dispatch route. Note that driver_id and vehicle_id are mutually exclusive. If neither is specified, then the route is unassigned. */
  driverId: Option[Long],
/* ID of the group if the organization has multiple groups (optional). */
  groupId: Option[Long],
/* Descriptive name of this route. */
  name: String,
/* The time in Unix epoch milliseconds that the last job in the route is scheduled to end. */
  scheduledEndMs: Long,
/* The distance expected to be traveled for this route in meters. */
  scheduledMeters: Option[Long],
/* The time in Unix epoch milliseconds that the route is scheduled to start. */
  scheduledStartMs: Long,
/* The address of the route's starting location, as it would be recognized if provided to maps.google.com. Optional if a valid start location address ID is provided. */
  startLocationAddress: Option[String],
/* ID of the start location associated with an address book entry. Optional if valid values are provided for start location address or latitude/longitude. If a valid start location address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the start location name is not provided. */
  startLocationAddressId: Option[Long],
/* Latitude of the start location in decimal degrees. Optional if a valid start location address ID is provided. */
  startLocationLat: Option[Double],
/* Longitude of the start location in decimal degrees. Optional if a valid start location address ID is provided. */
  startLocationLng: Option[Double],
/* The name of the route's starting location. If provided, it will take precedence over the name of the address book entry. */
  startLocationName: Option[String],
/* ID of the trailer assigned to the dispatch route. Note that trailers can only be assigned to routes that have a Vehicle or Driver assigned to them. */
  trailerId: Option[Long],
/* ID of the vehicle assigned to the dispatch route. Note that vehicle_id and driver_id are mutually exclusive. If neither is specified, then the route is unassigned. */
  vehicleId: Option[Long],
/* The dispatch jobs associated with this route. */
  dispatchJobs: List[DispatchJob],
/* ID of the Samsara dispatch route. */
  id: Long)

object DispatchRoute {
  import DateTimeCodecs._

  implicit val DispatchRouteCodecJson: CodecJson[DispatchRoute] = CodecJson.derive[DispatchRoute]
  implicit val DispatchRouteDecoder: EntityDecoder[DispatchRoute] = jsonOf[DispatchRoute]
  implicit val DispatchRouteEncoder: EntityEncoder[DispatchRoute] = jsonEncoderOf[DispatchRoute]
}

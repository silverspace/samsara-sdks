package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import TripResponseTrips._

case class TripResponseTrips (
  /* Odometer reading at the end of the trip. */
  endOdometer: Option[Integer],
/* Length of the trip in meters. */
  distanceMeters: Option[Integer],
/* End of the trip in UNIX milliseconds. */
  endMs: Option[Integer],
/* Beginning of the trip in UNIX milliseconds. */
  startMs: Option[Integer],
/* Amount in milliliters of fuel consumed on this trip. */
  fuelConsumedMl: Option[Integer],
/* Text representation of nearest identifiable location to the start (latitude, longitude) coordinates. */
  startAddress: Option[String],
startCoordinates: Option[TripResponseStartCoordinates],
endCoordinates: Option[TripResponseEndCoordinates],
/* Odometer reading at the beginning of the trip. */
  startOdometer: Option[Integer],
/* ID of the driver. */
  driverId: Option[Integer],
/* Geocoded street address of start (latitude, longitude) coordinates. */
  startLocation: Option[String],
/* Length in meters trip spent on toll roads. */
  tollMeters: Option[Integer],
/* Text representation of nearest identifiable location to the end (latitude, longitude) coordinates. */
  endAddress: Option[String],
/* Geocoded street address of start (latitude, longitude) coordinates. */
  endLocation: Option[String])

object TripResponseTrips {
  import DateTimeCodecs._

  implicit val TripResponseTripsCodecJson: CodecJson[TripResponseTrips] = CodecJson.derive[TripResponseTrips]
  implicit val TripResponseTripsDecoder: EntityDecoder[TripResponseTrips] = jsonOf[TripResponseTrips]
  implicit val TripResponseTripsEncoder: EntityEncoder[TripResponseTrips] = jsonEncoderOf[TripResponseTrips]
}

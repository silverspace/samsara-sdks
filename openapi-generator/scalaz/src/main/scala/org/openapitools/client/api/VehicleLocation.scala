package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import VehicleLocation._

case class VehicleLocation (
  /* Heading in degrees. */
  heading: Option[Double],
/* ID of the vehicle. */
  id: Long,
/* Latitude in decimal degrees. */
  latitude: Option[Double],
/* Text representation of nearest identifiable location to (latitude, longitude) coordinates. */
  location: Option[String],
/* Longitude in decimal degrees. */
  longitude: Option[Double],
/* Name of the vehicle. */
  name: Option[String],
/* The number of meters reported by the odometer. */
  odometerMeters: Option[Long],
/* Whether or not a trip is currently in progress for this vehicle. More information available via /fleet/trips endpoint. */
  onTrip: Option[Boolean],
/* Speed in miles per hour. */
  speed: Option[Double],
/* The time the reported location was logged, reported as a UNIX timestamp in milliseconds. */
  time: Option[Integer],
/* Vehicle Identification Number (VIN) of the vehicle. */
  vin: Option[String])

object VehicleLocation {
  import DateTimeCodecs._

  implicit val VehicleLocationCodecJson: CodecJson[VehicleLocation] = CodecJson.derive[VehicleLocation]
  implicit val VehicleLocationDecoder: EntityDecoder[VehicleLocation] = jsonOf[VehicleLocation]
  implicit val VehicleLocationEncoder: EntityEncoder[VehicleLocation] = jsonEncoderOf[VehicleLocation]
}

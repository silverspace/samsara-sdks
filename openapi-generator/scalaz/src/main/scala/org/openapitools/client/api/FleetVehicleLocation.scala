package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import FleetVehicleLocation._

case class FleetVehicleLocation (
  /* The latitude of the location in degrees. */
  latitude: Option[Double],
/* The best effort (street,city,state) for the latitude and longitude. */
  location: Option[String],
/* The longitude of the location in degrees. */
  longitude: Option[Double],
/* The speed calculated from GPS that the asset was traveling at in miles per hour. */
  speedMilesPerHour: Option[Double],
/* Time in Unix milliseconds since epoch when the asset was at the location. */
  timeMs: Option[Long])

object FleetVehicleLocation {
  import DateTimeCodecs._

  implicit val FleetVehicleLocationCodecJson: CodecJson[FleetVehicleLocation] = CodecJson.derive[FleetVehicleLocation]
  implicit val FleetVehicleLocationDecoder: EntityDecoder[FleetVehicleLocation] = jsonOf[FleetVehicleLocation]
  implicit val FleetVehicleLocationEncoder: EntityEncoder[FleetVehicleLocation] = jsonEncoderOf[FleetVehicleLocation]
}

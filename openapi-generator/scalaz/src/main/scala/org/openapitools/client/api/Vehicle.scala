package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import Vehicle._

case class Vehicle (
  /* Total engine hours for the vehicle. */
  engineHours: Option[Long],
/* The fuel level of the vehicle as a percentage. (0.0 to 1.0) */
  fuelLevelPercent: Option[Double],
/* ID of the vehicle. */
  id: Long,
/* Name of the vehicle. */
  name: Option[String],
note: Option[String],
/* The number of meters reported by the odometer. */
  odometerMeters: Option[Long],
/* Vehicle Identification Number. */
  vin: Option[String])

object Vehicle {
  import DateTimeCodecs._

  implicit val VehicleCodecJson: CodecJson[Vehicle] = CodecJson.derive[Vehicle]
  implicit val VehicleDecoder: EntityDecoder[Vehicle] = jsonOf[Vehicle]
  implicit val VehicleEncoder: EntityEncoder[Vehicle] = jsonEncoderOf[Vehicle]
}

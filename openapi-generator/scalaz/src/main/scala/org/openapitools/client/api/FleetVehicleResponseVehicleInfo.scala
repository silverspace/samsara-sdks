package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import FleetVehicleResponseVehicleInfo._

case class FleetVehicleResponseVehicleInfo (
  /* Year of the vehicle. */
  year: Option[Long],
/* Model of the Vehicle. */
  model: Option[String],
/* Vehicle Identification Number. */
  vin: Option[String],
/* Make of the vehicle. */
  make: Option[String])

object FleetVehicleResponseVehicleInfo {
  import DateTimeCodecs._

  implicit val FleetVehicleResponseVehicleInfoCodecJson: CodecJson[FleetVehicleResponseVehicleInfo] = CodecJson.derive[FleetVehicleResponseVehicleInfo]
  implicit val FleetVehicleResponseVehicleInfoDecoder: EntityDecoder[FleetVehicleResponseVehicleInfo] = jsonOf[FleetVehicleResponseVehicleInfo]
  implicit val FleetVehicleResponseVehicleInfoEncoder: EntityEncoder[FleetVehicleResponseVehicleInfo] = jsonEncoderOf[FleetVehicleResponseVehicleInfo]
}

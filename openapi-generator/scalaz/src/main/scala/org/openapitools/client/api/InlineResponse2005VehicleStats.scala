package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import InlineResponse2005VehicleStats._

case class InlineResponse2005VehicleStats (
  engineState: Option[List[EngineState]],
auxInput2: Option[AuxInputSeries],
/* ID of the vehicle. */
  vehicleId: Long,
auxInput1: Option[AuxInputSeries])

object InlineResponse2005VehicleStats {
  import DateTimeCodecs._

  implicit val InlineResponse2005VehicleStatsCodecJson: CodecJson[InlineResponse2005VehicleStats] = CodecJson.derive[InlineResponse2005VehicleStats]
  implicit val InlineResponse2005VehicleStatsDecoder: EntityDecoder[InlineResponse2005VehicleStats] = jsonOf[InlineResponse2005VehicleStats]
  implicit val InlineResponse2005VehicleStatsEncoder: EntityEncoder[InlineResponse2005VehicleStats] = jsonEncoderOf[InlineResponse2005VehicleStats]
}

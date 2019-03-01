package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import SensorHistoryResponseResults._

case class SensorHistoryResponseResults (
  /* List of datapoints, one for each requested (sensor, field) pair. */
  series: Option[List[Long]],
/* Timestamp in UNIX milliseconds. */
  timeMs: Option[Integer])

object SensorHistoryResponseResults {
  import DateTimeCodecs._

  implicit val SensorHistoryResponseResultsCodecJson: CodecJson[SensorHistoryResponseResults] = CodecJson.derive[SensorHistoryResponseResults]
  implicit val SensorHistoryResponseResultsDecoder: EntityDecoder[SensorHistoryResponseResults] = jsonOf[SensorHistoryResponseResults]
  implicit val SensorHistoryResponseResultsEncoder: EntityEncoder[SensorHistoryResponseResults] = jsonEncoderOf[SensorHistoryResponseResults]
}

package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import DataInputHistoryResponsePoints._

case class DataInputHistoryResponsePoints (
  value: Option[Double],
timeMs: Option[Long])

object DataInputHistoryResponsePoints {
  import DateTimeCodecs._

  implicit val DataInputHistoryResponsePointsCodecJson: CodecJson[DataInputHistoryResponsePoints] = CodecJson.derive[DataInputHistoryResponsePoints]
  implicit val DataInputHistoryResponsePointsDecoder: EntityDecoder[DataInputHistoryResponsePoints] = jsonOf[DataInputHistoryResponsePoints]
  implicit val DataInputHistoryResponsePointsEncoder: EntityEncoder[DataInputHistoryResponsePoints] = jsonEncoderOf[DataInputHistoryResponsePoints]
}

package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import DataInputHistoryResponse._

case class DataInputHistoryResponse (
  /* The ID of this data input */
  id: Option[Long],
/* Name of this data input */
  name: String,
/* Data points from this data input */
  points: Option[List[DataInputHistoryResponsePoints]])

object DataInputHistoryResponse {
  import DateTimeCodecs._

  implicit val DataInputHistoryResponseCodecJson: CodecJson[DataInputHistoryResponse] = CodecJson.derive[DataInputHistoryResponse]
  implicit val DataInputHistoryResponseDecoder: EntityDecoder[DataInputHistoryResponse] = jsonOf[DataInputHistoryResponse]
  implicit val DataInputHistoryResponseEncoder: EntityEncoder[DataInputHistoryResponse] = jsonEncoderOf[DataInputHistoryResponse]
}

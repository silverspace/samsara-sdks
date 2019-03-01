package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import HosLogsResponse._

case class HosLogsResponse (
  logs: Option[List[HosLogsResponseLogs]])

object HosLogsResponse {
  import DateTimeCodecs._

  implicit val HosLogsResponseCodecJson: CodecJson[HosLogsResponse] = CodecJson.derive[HosLogsResponse]
  implicit val HosLogsResponseDecoder: EntityDecoder[HosLogsResponse] = jsonOf[HosLogsResponse]
  implicit val HosLogsResponseEncoder: EntityEncoder[HosLogsResponse] = jsonEncoderOf[HosLogsResponse]
}

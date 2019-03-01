package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import HosAuthenticationLogsResponse._

case class HosAuthenticationLogsResponse (
  authenticationLogs: Option[List[HosAuthenticationLogsResponseAuthenticationLogs]])

object HosAuthenticationLogsResponse {
  import DateTimeCodecs._

  implicit val HosAuthenticationLogsResponseCodecJson: CodecJson[HosAuthenticationLogsResponse] = CodecJson.derive[HosAuthenticationLogsResponse]
  implicit val HosAuthenticationLogsResponseDecoder: EntityDecoder[HosAuthenticationLogsResponse] = jsonOf[HosAuthenticationLogsResponse]
  implicit val HosAuthenticationLogsResponseEncoder: EntityEncoder[HosAuthenticationLogsResponse] = jsonEncoderOf[HosAuthenticationLogsResponse]
}

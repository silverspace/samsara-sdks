package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import DriversSummaryResponse._

case class DriversSummaryResponse (
  summaries: Option[List[DriversSummaryResponseSummaries]])

object DriversSummaryResponse {
  import DateTimeCodecs._

  implicit val DriversSummaryResponseCodecJson: CodecJson[DriversSummaryResponse] = CodecJson.derive[DriversSummaryResponse]
  implicit val DriversSummaryResponseDecoder: EntityDecoder[DriversSummaryResponse] = jsonOf[DriversSummaryResponse]
  implicit val DriversSummaryResponseEncoder: EntityEncoder[DriversSummaryResponse] = jsonEncoderOf[DriversSummaryResponse]
}

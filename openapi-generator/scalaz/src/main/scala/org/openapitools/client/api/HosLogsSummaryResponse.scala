package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import HosLogsSummaryResponse._

case class HosLogsSummaryResponse (
  drivers: Option[List[HosLogsSummaryResponseDrivers]])

object HosLogsSummaryResponse {
  import DateTimeCodecs._

  implicit val HosLogsSummaryResponseCodecJson: CodecJson[HosLogsSummaryResponse] = CodecJson.derive[HosLogsSummaryResponse]
  implicit val HosLogsSummaryResponseDecoder: EntityDecoder[HosLogsSummaryResponse] = jsonOf[HosLogsSummaryResponse]
  implicit val HosLogsSummaryResponseEncoder: EntityEncoder[HosLogsSummaryResponse] = jsonEncoderOf[HosLogsSummaryResponse]
}

package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import DriverDailyLogResponse._

case class DriverDailyLogResponse (
  days: Option[List[DriverDailyLogResponseDays]])

object DriverDailyLogResponse {
  import DateTimeCodecs._

  implicit val DriverDailyLogResponseCodecJson: CodecJson[DriverDailyLogResponse] = CodecJson.derive[DriverDailyLogResponse]
  implicit val DriverDailyLogResponseDecoder: EntityDecoder[DriverDailyLogResponse] = jsonOf[DriverDailyLogResponse]
  implicit val DriverDailyLogResponseEncoder: EntityEncoder[DriverDailyLogResponse] = jsonEncoderOf[DriverDailyLogResponse]
}

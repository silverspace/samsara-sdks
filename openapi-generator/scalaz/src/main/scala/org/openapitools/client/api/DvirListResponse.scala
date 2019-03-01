package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import DvirListResponse._

case class DvirListResponse (
  dvirs: Option[List[DvirBase]])

object DvirListResponse {
  import DateTimeCodecs._

  implicit val DvirListResponseCodecJson: CodecJson[DvirListResponse] = CodecJson.derive[DvirListResponse]
  implicit val DvirListResponseDecoder: EntityDecoder[DvirListResponse] = jsonOf[DvirListResponse]
  implicit val DvirListResponseEncoder: EntityEncoder[DvirListResponse] = jsonEncoderOf[DvirListResponse]
}

package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import DvirBaseTrailerDefects._

case class DvirBaseTrailerDefects (
  /* The comment describing the type of DVIR defect */
  comment: Option[String],
/* The type of DVIR defect */
  defectType: Option[String])

object DvirBaseTrailerDefects {
  import DateTimeCodecs._

  implicit val DvirBaseTrailerDefectsCodecJson: CodecJson[DvirBaseTrailerDefects] = CodecJson.derive[DvirBaseTrailerDefects]
  implicit val DvirBaseTrailerDefectsDecoder: EntityDecoder[DvirBaseTrailerDefects] = jsonOf[DvirBaseTrailerDefects]
  implicit val DvirBaseTrailerDefectsEncoder: EntityEncoder[DvirBaseTrailerDefects] = jsonEncoderOf[DvirBaseTrailerDefects]
}

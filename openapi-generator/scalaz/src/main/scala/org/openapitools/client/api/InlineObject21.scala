package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import InlineObject21._

case class InlineObject21 (
  /* End of the time range, specified in milliseconds UNIX time. */
  endMs: Integer,
fillMissing: Option[FillMissing],
/* Group ID to query. */
  groupId: Long,
series: List[SensorsHistorySeries],
/* Beginning of the time range, specified in milliseconds UNIX time. */
  startMs: Integer,
/* Time resolution for which data should be returned, in milliseconds. Specifying 3600000 will return data at hour intervals. */
  stepMs: Integer)

object InlineObject21 {
  import DateTimeCodecs._
  sealed trait FillMissing
  case object WithNull extends FillMissing
  case object WithPrevious extends FillMissing

  object FillMissing {
    def toFillMissing(s: String): Option[FillMissing] = s match {
      case "WithNull" => Some(WithNull)
      case "WithPrevious" => Some(WithPrevious)
      case _ => None
    }

    def fromFillMissing(x: FillMissing): String = x match {
      case WithNull => "WithNull"
      case WithPrevious => "WithPrevious"
    }
  }

  implicit val FillMissingEnumEncoder: EncodeJson[FillMissing] =
    EncodeJson[FillMissing](is => StringEncodeJson(FillMissing.fromFillMissing(is)))

  implicit val FillMissingEnumDecoder: DecodeJson[FillMissing] =
    DecodeJson.optionDecoder[FillMissing](n => n.string.flatMap(jStr => FillMissing.toFillMissing(jStr)), "FillMissing failed to de-serialize")

  implicit val InlineObject21CodecJson: CodecJson[InlineObject21] = CodecJson.derive[InlineObject21]
  implicit val InlineObject21Decoder: EntityDecoder[InlineObject21] = jsonOf[InlineObject21]
  implicit val InlineObject21Encoder: EntityEncoder[InlineObject21] = jsonEncoderOf[InlineObject21]
}

package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import InlineObject2._

case class InlineObject2 (
  /* The address of the entry to add, as it would be recognized if provided to maps.google.com. */
  address: String,
/* Group ID to query. */
  groupId: Long,
/* Name of the location to add to the address book. */
  name: String,
/* Radius in meters of the address (used for matching vehicle trip stops to this location). */
  radius: Integer)

object InlineObject2 {
  import DateTimeCodecs._

  implicit val InlineObject2CodecJson: CodecJson[InlineObject2] = CodecJson.derive[InlineObject2]
  implicit val InlineObject2Decoder: EntityDecoder[InlineObject2] = jsonOf[InlineObject2]
  implicit val InlineObject2Encoder: EntityEncoder[InlineObject2] = jsonEncoderOf[InlineObject2]
}

package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import TagMetadata._

case class TagMetadata (
  /* The ID of this tag. */
  id: Long,
/* Name of this tag. */
  name: String)

object TagMetadata {
  import DateTimeCodecs._

  implicit val TagMetadataCodecJson: CodecJson[TagMetadata] = CodecJson.derive[TagMetadata]
  implicit val TagMetadataDecoder: EntityDecoder[TagMetadata] = jsonOf[TagMetadata]
  implicit val TagMetadataEncoder: EntityEncoder[TagMetadata] = jsonEncoderOf[TagMetadata]
}

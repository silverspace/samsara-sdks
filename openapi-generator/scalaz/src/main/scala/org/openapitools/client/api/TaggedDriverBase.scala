package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import TaggedDriverBase._

case class TaggedDriverBase (
  /* The ID of the Driver being tagged. */
  id: Long)

object TaggedDriverBase {
  import DateTimeCodecs._

  implicit val TaggedDriverBaseCodecJson: CodecJson[TaggedDriverBase] = CodecJson.derive[TaggedDriverBase]
  implicit val TaggedDriverBaseDecoder: EntityDecoder[TaggedDriverBase] = jsonOf[TaggedDriverBase]
  implicit val TaggedDriverBaseEncoder: EntityEncoder[TaggedDriverBase] = jsonEncoderOf[TaggedDriverBase]
}

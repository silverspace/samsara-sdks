package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import TagModify._

case class TagModify (
  add: Option[TagModifyAdd],
delete: Option[TagModifyDelete],
/* Updated name of this tag. */
  name: Option[String],
/* If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag's parent tag. */
  parentTagId: Option[Long])

object TagModify {
  import DateTimeCodecs._

  implicit val TagModifyCodecJson: CodecJson[TagModify] = CodecJson.derive[TagModify]
  implicit val TagModifyDecoder: EntityDecoder[TagModify] = jsonOf[TagModify]
  implicit val TagModifyEncoder: EntityEncoder[TagModify] = jsonEncoderOf[TagModify]
}

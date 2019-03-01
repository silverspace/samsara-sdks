package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import DocumentFieldCreatePhotoValue._

case class DocumentFieldCreatePhotoValue (
  /* Photo URL for a JPG image */
  url: Option[String])

object DocumentFieldCreatePhotoValue {
  import DateTimeCodecs._

  implicit val DocumentFieldCreatePhotoValueCodecJson: CodecJson[DocumentFieldCreatePhotoValue] = CodecJson.derive[DocumentFieldCreatePhotoValue]
  implicit val DocumentFieldCreatePhotoValueDecoder: EntityDecoder[DocumentFieldCreatePhotoValue] = jsonOf[DocumentFieldCreatePhotoValue]
  implicit val DocumentFieldCreatePhotoValueEncoder: EntityEncoder[DocumentFieldCreatePhotoValue] = jsonEncoderOf[DocumentFieldCreatePhotoValue]
}

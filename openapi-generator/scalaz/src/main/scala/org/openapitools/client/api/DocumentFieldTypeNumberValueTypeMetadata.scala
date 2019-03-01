package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import DocumentFieldTypeNumberValueTypeMetadata._

case class DocumentFieldTypeNumberValueTypeMetadata (
  /* Number of decimal places that values for this field type can have. */
  numDecimalPlaces: Option[Long])

object DocumentFieldTypeNumberValueTypeMetadata {
  import DateTimeCodecs._

  implicit val DocumentFieldTypeNumberValueTypeMetadataCodecJson: CodecJson[DocumentFieldTypeNumberValueTypeMetadata] = CodecJson.derive[DocumentFieldTypeNumberValueTypeMetadata]
  implicit val DocumentFieldTypeNumberValueTypeMetadataDecoder: EntityDecoder[DocumentFieldTypeNumberValueTypeMetadata] = jsonOf[DocumentFieldTypeNumberValueTypeMetadata]
  implicit val DocumentFieldTypeNumberValueTypeMetadataEncoder: EntityEncoder[DocumentFieldTypeNumberValueTypeMetadata] = jsonEncoderOf[DocumentFieldTypeNumberValueTypeMetadata]
}

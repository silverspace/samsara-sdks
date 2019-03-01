package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import DocumentFieldType._

case class DocumentFieldType (
  /* Descriptive name of this field type. */
  label: String,
numberValueTypeMetadata: Option[DocumentFieldTypeNumberValueTypeMetadata],
/* The kind of value that can be submitted for this fieldType. It should be either ValueType_Number, ValueType_String, or ValueType_Photo. */
  valueType: String)

object DocumentFieldType {
  import DateTimeCodecs._

  implicit val DocumentFieldTypeCodecJson: CodecJson[DocumentFieldType] = CodecJson.derive[DocumentFieldType]
  implicit val DocumentFieldTypeDecoder: EntityDecoder[DocumentFieldType] = jsonOf[DocumentFieldType]
  implicit val DocumentFieldTypeEncoder: EntityEncoder[DocumentFieldType] = jsonEncoderOf[DocumentFieldType]
}

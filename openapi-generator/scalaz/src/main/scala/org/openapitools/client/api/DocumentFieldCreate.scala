package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import DocumentFieldCreate._

case class DocumentFieldCreate (
  /* Value of this field if this document field has valueType: ValueType_Number. */
  numberValue: Option[Double],
/* Value of this field if this document field has valueType: ValueType_Photo. Array of photo objects where each object contains a URL for a photo. */
  photoValue: Option[List[DocumentFieldCreatePhotoValue]],
/* Value of this field if this document field has valueType: ValueType_String. */
  stringValue: Option[String],
/* Determines the type of this field and what type of value this field has. It should be either ValueType_Number, ValueType_String, or ValueType_Photo. */
  valueType: String)

object DocumentFieldCreate {
  import DateTimeCodecs._

  implicit val DocumentFieldCreateCodecJson: CodecJson[DocumentFieldCreate] = CodecJson.derive[DocumentFieldCreate]
  implicit val DocumentFieldCreateDecoder: EntityDecoder[DocumentFieldCreate] = jsonOf[DocumentFieldCreate]
  implicit val DocumentFieldCreateEncoder: EntityEncoder[DocumentFieldCreate] = jsonEncoderOf[DocumentFieldCreate]
}

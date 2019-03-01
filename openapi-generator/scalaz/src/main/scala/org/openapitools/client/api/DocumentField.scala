package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import DocumentField._

case class DocumentField (
  /* Value of this field if this document field has valueType: ValueType_Number. */
  numberValue: Option[Double],
/* Value of this field if this document field has valueType: ValueType_Photo. Array of photo objects where each object contains a URL for a photo. */
  photoValue: Option[List[DocumentFieldCreatePhotoValue]],
/* Value of this field if this document field has valueType: ValueType_String. */
  stringValue: Option[String],
/* Determines the type of this field and what type of value this field has. It should be either ValueType_Number, ValueType_String, or ValueType_Photo. */
  valueType: String,
/* Descriptive name of this field. */
  label: String,
/* DEPRECATED: Please use stringValue, numberValue, or photoValue instead. Value of this field. Depending on what kind of field it is, this may be one of the following: an array of image urls, a float, an integer, or a string. */
  value: Option[Any])

object DocumentField {
  import DateTimeCodecs._

  implicit val DocumentFieldCodecJson: CodecJson[DocumentField] = CodecJson.derive[DocumentField]
  implicit val DocumentFieldDecoder: EntityDecoder[DocumentField] = jsonOf[DocumentField]
  implicit val DocumentFieldEncoder: EntityEncoder[DocumentField] = jsonEncoderOf[DocumentField]
}

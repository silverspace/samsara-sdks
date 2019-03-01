package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import DocumentCreate._

case class DocumentCreate (
  /* ID of the Samsara dispatch job for which the document is submitted */
  dispatchJobId: Option[Long],
/* Notes submitted with this document. */
  notes: Option[String],
/* Universally unique identifier for the document type this document is being created for. */
  documentTypeUuid: String,
/* List of fields should match the document type’s list of field types in the correct order. In other words, a field's valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_. */
  fields: List[DocumentField])

object DocumentCreate {
  import DateTimeCodecs._

  implicit val DocumentCreateCodecJson: CodecJson[DocumentCreate] = CodecJson.derive[DocumentCreate]
  implicit val DocumentCreateDecoder: EntityDecoder[DocumentCreate] = jsonOf[DocumentCreate]
  implicit val DocumentCreateEncoder: EntityEncoder[DocumentCreate] = jsonEncoderOf[DocumentCreate]
}

package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import DocumentType._

case class DocumentType (
  /* The field types determine the names of fields for this document type. They also determine the types of values a document submitted for this document type can have. */
  fieldTypes: Option[List[List]],
/* Name of the document type. */
  name: String,
/* ID for the organization this document belongs to. */
  orgId: Long,
/* Universally unique identifier for the document type. Can be passed in as a documentTypeUuid when creating a document for this document type. */
  uuid: String)

object DocumentType {
  import DateTimeCodecs._

  implicit val DocumentTypeCodecJson: CodecJson[DocumentType] = CodecJson.derive[DocumentType]
  implicit val DocumentTypeDecoder: EntityDecoder[DocumentType] = jsonOf[DocumentType]
  implicit val DocumentTypeEncoder: EntityEncoder[DocumentType] = jsonEncoderOf[DocumentType]
}

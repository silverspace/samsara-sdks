package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import Document._

case class Document (
  /* ID of the Samsara dispatch job for which the document is submitted */
  dispatchJobId: Option[Long],
/* Notes submitted with this document. */
  notes: Option[String],
/* Descriptive name of this type of document. */
  documentType: String,
/* The time in Unix epoch milliseconds that the document is created. */
  driverCreatedAtMs: Long,
/* ID of the driver for whom the document is submitted */
  driverId: Long,
/* The fields associated with this document. */
  fields: List[DocumentField],
/* VehicleID of the driver at document creation. */
  vehicleId: Option[Long])

object Document {
  import DateTimeCodecs._

  implicit val DocumentCodecJson: CodecJson[Document] = CodecJson.derive[Document]
  implicit val DocumentDecoder: EntityDecoder[Document] = jsonOf[Document]
  implicit val DocumentEncoder: EntityEncoder[Document] = jsonEncoderOf[Document]
}

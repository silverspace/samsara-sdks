package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.DocumentBase
import org.openapitools.models.DocumentField
import scala.collection.immutable.Seq

/**
 * 
 * @param dispatchJobId ID of the Samsara dispatch job for which the document is submitted
 * @param notes Notes submitted with this document.
 * @param documentType Descriptive name of this type of document.
 * @param driverCreatedAtMs The time in Unix epoch milliseconds that the document is created.
 * @param driverId ID of the driver for whom the document is submitted
 * @param fields The fields associated with this document.
 * @param vehicleId VehicleID of the driver at document creation.
 */
case class Document(dispatchJobId: Option[Long],
                notes: Option[String],
                documentType: String,
                driverCreatedAtMs: Long,
                driverId: Long,
                fields: Seq[DocumentField],
                vehicleId: Option[Long]
                )

object Document {
    /**
     * Creates the codec for converting Document from and to JSON.
     */
    implicit val decoder: Decoder[Document] = deriveDecoder
    implicit val encoder: ObjectEncoder[Document] = deriveEncoder
}

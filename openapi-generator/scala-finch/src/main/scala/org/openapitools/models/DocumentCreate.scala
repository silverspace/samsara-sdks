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
 * @param documentTypeUuid Universally unique identifier for the document type this document is being created for.
 * @param fields List of fields should match the document type’s list of field types in the correct order. In other words, a field's valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_.
 */
case class DocumentCreate(dispatchJobId: Option[Long],
                notes: Option[String],
                documentTypeUuid: String,
                fields: Seq[DocumentField]
                )

object DocumentCreate {
    /**
     * Creates the codec for converting DocumentCreate from and to JSON.
     */
    implicit val decoder: Decoder[DocumentCreate] = deriveDecoder
    implicit val encoder: ObjectEncoder[DocumentCreate] = deriveEncoder
}

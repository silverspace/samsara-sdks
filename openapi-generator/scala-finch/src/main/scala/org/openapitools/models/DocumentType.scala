package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.DocumentFieldType
import scala.collection.immutable.Seq

/**
 * 
 * @param fieldTypes The field types determine the names of fields for this document type. They also determine the types of values a document submitted for this document type can have.
 * @param name Name of the document type.
 * @param orgId ID for the organization this document belongs to.
 * @param uuid Universally unique identifier for the document type. Can be passed in as a documentTypeUuid when creating a document for this document type.
 */
case class DocumentType(fieldTypes: Option[Seq[Seq]],
                name: String,
                orgId: Long,
                uuid: String
                )

object DocumentType {
    /**
     * Creates the codec for converting DocumentType from and to JSON.
     */
    implicit val decoder: Decoder[DocumentType] = deriveDecoder
    implicit val encoder: ObjectEncoder[DocumentType] = deriveEncoder
}

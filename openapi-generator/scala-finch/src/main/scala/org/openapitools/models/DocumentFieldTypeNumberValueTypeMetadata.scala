package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Additional metadata information for a number field type. Only defined when a field type has valueType: ValueType_Number.
 * @param numDecimalPlaces Number of decimal places that values for this field type can have.
 */
case class DocumentFieldTypeNumberValueTypeMetadata(numDecimalPlaces: Option[Long]
                )

object DocumentFieldTypeNumberValueTypeMetadata {
    /**
     * Creates the codec for converting DocumentFieldTypeNumberValueTypeMetadata from and to JSON.
     */
    implicit val decoder: Decoder[DocumentFieldTypeNumberValueTypeMetadata] = deriveDecoder
    implicit val encoder: ObjectEncoder[DocumentFieldTypeNumberValueTypeMetadata] = deriveEncoder
}

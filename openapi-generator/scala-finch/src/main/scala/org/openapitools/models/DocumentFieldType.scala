package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.DocumentFieldTypeNumberValueTypeMetadata

/**
 * 
 * @param label Descriptive name of this field type.
 * @param numberValueTypeMetadata 
 * @param valueType The kind of value that can be submitted for this fieldType. It should be either ValueType_Number, ValueType_String, or ValueType_Photo.
 */
case class DocumentFieldType(label: String,
                numberValueTypeMetadata: Option[DocumentFieldTypeNumberValueTypeMetadata],
                valueType: String
                )

object DocumentFieldType {
    /**
     * Creates the codec for converting DocumentFieldType from and to JSON.
     */
    implicit val decoder: Decoder[DocumentFieldType] = deriveDecoder
    implicit val encoder: ObjectEncoder[DocumentFieldType] = deriveEncoder
}

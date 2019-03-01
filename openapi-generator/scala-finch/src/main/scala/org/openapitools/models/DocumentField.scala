package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.DocumentFieldCreate
import org.openapitools.models.DocumentFieldCreatePhotoValue
import scala.collection.immutable.Seq

/**
 * 
 * @param numberValue Value of this field if this document field has valueType: ValueType_Number.
 * @param photoValue Value of this field if this document field has valueType: ValueType_Photo. Array of photo objects where each object contains a URL for a photo.
 * @param stringValue Value of this field if this document field has valueType: ValueType_String.
 * @param valueType Determines the type of this field and what type of value this field has. It should be either ValueType_Number, ValueType_String, or ValueType_Photo.
 * @param label Descriptive name of this field.
 * @param value DEPRECATED: Please use stringValue, numberValue, or photoValue instead. Value of this field. Depending on what kind of field it is, this may be one of the following: an array of image urls, a float, an integer, or a string.
 */
case class DocumentField(numberValue: Option[Double],
                photoValue: Option[Seq[DocumentFieldCreatePhotoValue]],
                stringValue: Option[String],
                valueType: String,
                label: String,
                value: Option[Object]
                )

object DocumentField {
    /**
     * Creates the codec for converting DocumentField from and to JSON.
     */
    implicit val decoder: Decoder[DocumentField] = deriveDecoder
    implicit val encoder: ObjectEncoder[DocumentField] = deriveEncoder
}

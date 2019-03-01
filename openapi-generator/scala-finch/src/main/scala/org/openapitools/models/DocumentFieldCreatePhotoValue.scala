package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param url Photo URL for a JPG image
 */
case class DocumentFieldCreatePhotoValue(url: Option[String]
                )

object DocumentFieldCreatePhotoValue {
    /**
     * Creates the codec for converting DocumentFieldCreatePhotoValue from and to JSON.
     */
    implicit val decoder: Decoder[DocumentFieldCreatePhotoValue] = deriveDecoder
    implicit val encoder: ObjectEncoder[DocumentFieldCreatePhotoValue] = deriveEncoder
}

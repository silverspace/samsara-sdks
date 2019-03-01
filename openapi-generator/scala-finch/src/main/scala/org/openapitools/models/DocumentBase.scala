package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param dispatchJobId ID of the Samsara dispatch job for which the document is submitted
 * @param notes Notes submitted with this document.
 */
case class DocumentBase(dispatchJobId: Option[Long],
                notes: Option[String]
                )

object DocumentBase {
    /**
     * Creates the codec for converting DocumentBase from and to JSON.
     */
    implicit val decoder: Decoder[DocumentBase] = deriveDecoder
    implicit val encoder: ObjectEncoder[DocumentBase] = deriveEncoder
}

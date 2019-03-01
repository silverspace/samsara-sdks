package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.DvirBase
import scala.collection.immutable.Seq

/**
 * 
 * @param dvirs 
 */
case class DvirListResponse(dvirs: Option[Seq[DvirBase]]
                )

object DvirListResponse {
    /**
     * Creates the codec for converting DvirListResponse from and to JSON.
     */
    implicit val decoder: Decoder[DvirListResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[DvirListResponse] = deriveEncoder
}

package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.DataInputHistoryResponse
import scala.collection.immutable.Seq

/**
 * 
 * @param dataInputs 
 */
case class InlineResponse2006(dataInputs: Option[Seq[DataInputHistoryResponse]]
                )

object InlineResponse2006 {
    /**
     * Creates the codec for converting InlineResponse2006 from and to JSON.
     */
    implicit val decoder: Decoder[InlineResponse2006] = deriveDecoder
    implicit val encoder: ObjectEncoder[InlineResponse2006] = deriveEncoder
}

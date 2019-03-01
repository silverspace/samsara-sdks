package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param comment The comment describing the type of DVIR defect
 * @param defectType The type of DVIR defect
 */
case class DvirBaseTrailerDefects(comment: Option[String],
                defectType: Option[String]
                )

object DvirBaseTrailerDefects {
    /**
     * Creates the codec for converting DvirBaseTrailerDefects from and to JSON.
     */
    implicit val decoder: Decoder[DvirBaseTrailerDefects] = deriveDecoder
    implicit val encoder: ObjectEncoder[DvirBaseTrailerDefects] = deriveEncoder
}

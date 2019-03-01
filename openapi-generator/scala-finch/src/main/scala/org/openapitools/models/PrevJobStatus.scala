package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * The previous state of the dispatch job.
 */
case class PrevJobStatus()

object PrevJobStatus {
    /**
     * Creates the codec for converting PrevJobStatus from and to JSON.
     */
    implicit val decoder: Decoder[PrevJobStatus] = deriveDecoder
    implicit val encoder: ObjectEncoder[PrevJobStatus] = deriveEncoder
}

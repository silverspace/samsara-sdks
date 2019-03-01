package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * The current state of the dispatch job.
 */
case class JobStatus()

object JobStatus {
    /**
     * Creates the codec for converting JobStatus from and to JSON.
     */
    implicit val decoder: Decoder[JobStatus] = deriveDecoder
    implicit val encoder: ObjectEncoder[JobStatus] = deriveEncoder
}

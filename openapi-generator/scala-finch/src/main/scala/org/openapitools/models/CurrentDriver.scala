package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 */
case class CurrentDriver()

object CurrentDriver {
    /**
     * Creates the codec for converting CurrentDriver from and to JSON.
     */
    implicit val decoder: Decoder[CurrentDriver] = deriveDecoder
    implicit val encoder: ObjectEncoder[CurrentDriver] = deriveEncoder
}

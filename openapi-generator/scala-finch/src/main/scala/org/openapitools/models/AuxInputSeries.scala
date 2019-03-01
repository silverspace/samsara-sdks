package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AuxInput
import scala.collection.immutable.Seq

/**
 * A list of aux input values over a timerange.
 * @param name The name of the aux input.
 * @param values 
 */
case class AuxInputSeries(name: String,
                values: Seq[AuxInput]
                )

object AuxInputSeries {
    /**
     * Creates the codec for converting AuxInputSeries from and to JSON.
     */
    implicit val decoder: Decoder[AuxInputSeries] = deriveDecoder
    implicit val encoder: ObjectEncoder[AuxInputSeries] = deriveEncoder
}

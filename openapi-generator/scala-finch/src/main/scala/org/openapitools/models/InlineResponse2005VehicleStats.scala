package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AuxInputSeries
import org.openapitools.models.EngineState
import scala.collection.immutable.Seq

/**
 * 
 * @param engineState 
 * @param auxInput2 
 * @param vehicleId ID of the vehicle.
 * @param auxInput1 
 */
case class InlineResponse2005VehicleStats(engineState: Option[Seq[EngineState]],
                auxInput2: Option[AuxInputSeries],
                vehicleId: Long,
                auxInput1: Option[AuxInputSeries]
                )

object InlineResponse2005VehicleStats {
    /**
     * Creates the codec for converting InlineResponse2005VehicleStats from and to JSON.
     */
    implicit val decoder: Decoder[InlineResponse2005VehicleStats] = deriveDecoder
    implicit val encoder: ObjectEncoder[InlineResponse2005VehicleStats] = deriveEncoder
}

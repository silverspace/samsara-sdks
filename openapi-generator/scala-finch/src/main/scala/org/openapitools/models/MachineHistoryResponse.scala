package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.MachineHistoryResponseMachines
import scala.collection.immutable.Seq

/**
 * Contains the results for a machine history request
 * @param machines 
 */
case class MachineHistoryResponse(machines: Option[Seq[MachineHistoryResponseMachines]]
                )

object MachineHistoryResponse {
    /**
     * Creates the codec for converting MachineHistoryResponse from and to JSON.
     */
    implicit val decoder: Decoder[MachineHistoryResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[MachineHistoryResponse] = deriveEncoder
}

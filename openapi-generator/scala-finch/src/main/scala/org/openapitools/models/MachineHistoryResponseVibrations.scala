package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param X 
 * @param Y 
 * @param Z 
 * @param time 
 */
case class MachineHistoryResponseVibrations(X: Option[Double],
                Y: Option[Double],
                Z: Option[Double],
                time: Option[Long]
                )

object MachineHistoryResponseVibrations {
    /**
     * Creates the codec for converting MachineHistoryResponseVibrations from and to JSON.
     */
    implicit val decoder: Decoder[MachineHistoryResponseVibrations] = deriveDecoder
    implicit val encoder: ObjectEncoder[MachineHistoryResponseVibrations] = deriveEncoder
}

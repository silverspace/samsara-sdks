package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.MachineHistoryResponseVibrations
import scala.collection.immutable.Seq

/**
 * 
 * @param name Machine name
 * @param id Machine ID
 * @param vibrations List of vibration datapoints, with timestamp and vibration measurement for x/y/z axis in mm/s
 */
case class MachineHistoryResponseMachines(name: Option[String],
                id: Option[Int],
                vibrations: Option[Seq[MachineHistoryResponseVibrations]]
                )

object MachineHistoryResponseMachines {
    /**
     * Creates the codec for converting MachineHistoryResponseMachines from and to JSON.
     */
    implicit val decoder: Decoder[MachineHistoryResponseMachines] = deriveDecoder
    implicit val encoder: ObjectEncoder[MachineHistoryResponseMachines] = deriveEncoder
}

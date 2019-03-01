package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.TaggedAssetBase
import org.openapitools.models.TaggedDriverBase
import org.openapitools.models.TaggedMachineBase
import org.openapitools.models.TaggedSensorBase
import org.openapitools.models.TaggedVehicleBase
import scala.collection.immutable.Seq

/**
 * Specify devices, etc. that should be added to the tag.
 * @param assets The assets to be added to this tag.
 * @param sensors The sensors to be added to this tag.
 * @param vehicles The vehicles to be added to this tag.
 * @param machines The machines to be added to this tag.
 * @param drivers The drivers to be added to this tag.
 */
case class TagModifyAdd(assets: Option[Seq[TaggedAssetBase]],
                sensors: Option[Seq[TaggedSensorBase]],
                vehicles: Option[Seq[TaggedVehicleBase]],
                machines: Option[Seq[TaggedMachineBase]],
                drivers: Option[Seq[TaggedDriverBase]]
                )

object TagModifyAdd {
    /**
     * Creates the codec for converting TagModifyAdd from and to JSON.
     */
    implicit val decoder: Decoder[TagModifyAdd] = deriveDecoder
    implicit val encoder: ObjectEncoder[TagModifyAdd] = deriveEncoder
}

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
 * 
 * @param assets The assets that belong to this tag.
 * @param drivers The drivers that belong to this tag.
 * @param machines The machines that belong to this tag.
 * @param name Updated name of this tag.
 * @param parentTagId If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag's parent tag.
 * @param sensors The sensors that belong to this tag.
 * @param vehicles The vehicles that belong to this tag.
 */
case class TagUpdate(assets: Option[Seq[TaggedAssetBase]],
                drivers: Option[Seq[TaggedDriverBase]],
                machines: Option[Seq[TaggedMachineBase]],
                name: Option[String],
                parentTagId: Option[Long],
                sensors: Option[Seq[TaggedSensorBase]],
                vehicles: Option[Seq[TaggedVehicleBase]]
                )

object TagUpdate {
    /**
     * Creates the codec for converting TagUpdate from and to JSON.
     */
    implicit val decoder: Decoder[TagUpdate] = deriveDecoder
    implicit val encoder: ObjectEncoder[TagUpdate] = deriveEncoder
}

package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.TaggedAddress
import org.openapitools.models.TaggedAsset
import org.openapitools.models.TaggedDriver
import org.openapitools.models.TaggedMachine
import org.openapitools.models.TaggedSensor
import org.openapitools.models.TaggedVehicle
import scala.collection.immutable.Seq

/**
 * 
 * @param addresses The addresses that belong to this tag.
 * @param assets The assets that belong to this tag.
 * @param drivers The drivers that belong to this tag.
 * @param groupId The GroupID that this tag belongs to.
 * @param id The ID of this tag.
 * @param machines The machines that belong to this tag.
 * @param name Name of this tag.
 * @param parentTagId If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag's parent tag.
 * @param sensors The sensors that belong to this tag.
 * @param vehicles The vehicles that belong to this tag.
 */
case class Tag(addresses: Option[Seq[TaggedAddress]],
                assets: Option[Seq[TaggedAsset]],
                drivers: Option[Seq[TaggedDriver]],
                groupId: Option[Long],
                id: Long,
                machines: Option[Seq[TaggedMachine]],
                name: String,
                parentTagId: Option[Long],
                sensors: Option[Seq[TaggedSensor]],
                vehicles: Option[Seq[TaggedVehicle]]
                )

object Tag {
    /**
     * Creates the codec for converting Tag from and to JSON.
     */
    implicit val decoder: Decoder[Tag] = deriveDecoder
    implicit val encoder: ObjectEncoder[Tag] = deriveEncoder
}

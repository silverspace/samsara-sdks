package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AssetCable
import scala.collection.immutable.Seq

/**
 * Basic information of an asset
 * @param assetSerialNumber Serial number of the host asset
 * @param cable The cable connected to the asset
 * @param engineHours Engine hours
 * @param id Asset ID
 * @param name Asset name
 */
case class Asset(assetSerialNumber: Option[String],
                cable: Option[Seq[AssetCable]],
                engineHours: Option[Int],
                id: Long,
                name: Option[String]
                )

object Asset {
    /**
     * Creates the codec for converting Asset from and to JSON.
     */
    implicit val decoder: Decoder[Asset] = deriveDecoder
    implicit val encoder: ObjectEncoder[Asset] = deriveEncoder
}

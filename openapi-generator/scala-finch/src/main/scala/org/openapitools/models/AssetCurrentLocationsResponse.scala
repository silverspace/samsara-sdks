package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AssetCable
import org.openapitools.models.AssetCurrentLocation
import scala.collection.immutable.Seq

/**
 * Basic information of an asset
 * @param cable The cable connected to the asset
 * @param engineHours Engine hours
 * @param id Asset ID
 * @param location Current location of an asset
 * @param name Asset name
 */
case class AssetCurrentLocationsResponse(cable: Option[Seq[AssetCable]],
                engineHours: Option[Int],
                id: Long,
                location: Option[Seq[AssetCurrentLocation]],
                name: Option[String]
                )

object AssetCurrentLocationsResponse {
    /**
     * Creates the codec for converting AssetCurrentLocationsResponse from and to JSON.
     */
    implicit val decoder: Decoder[AssetCurrentLocationsResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[AssetCurrentLocationsResponse] = deriveEncoder
}

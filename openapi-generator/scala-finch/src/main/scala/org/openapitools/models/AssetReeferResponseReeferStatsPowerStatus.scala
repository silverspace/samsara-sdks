package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param changedAtMs Timestamp in Unix milliseconds since epoch.
 * @param status Power status of the reefer.
 */
case class AssetReeferResponseReeferStatsPowerStatus(changedAtMs: Option[Long],
                status: Option[String]
                )

object AssetReeferResponseReeferStatsPowerStatus {
    /**
     * Creates the codec for converting AssetReeferResponseReeferStatsPowerStatus from and to JSON.
     */
    implicit val decoder: Decoder[AssetReeferResponseReeferStatsPowerStatus] = deriveDecoder
    implicit val encoder: ObjectEncoder[AssetReeferResponseReeferStatsPowerStatus] = deriveEncoder
}

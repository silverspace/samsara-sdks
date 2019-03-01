package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Sensor ID and field to query.
 * @param field Field to query.
 * @param widgetId Sensor ID to query.
 */
case class SensorsHistorySeries(field: String,
                widgetId: Long
                )

object SensorsHistorySeries {
    /**
     * Creates the codec for converting SensorsHistorySeries from and to JSON.
     */
    implicit val decoder: Decoder[SensorsHistorySeries] = deriveDecoder
    implicit val encoder: ObjectEncoder[SensorsHistorySeries] = deriveEncoder
}

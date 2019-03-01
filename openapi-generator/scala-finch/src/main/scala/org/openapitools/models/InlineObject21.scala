package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.SensorsHistorySeries
import scala.collection.immutable.Seq

/**
 * 
 * @param endMs End of the time range, specified in milliseconds UNIX time.
 * @param fillMissing 
 * @param groupId Group ID to query.
 * @param series 
 * @param startMs Beginning of the time range, specified in milliseconds UNIX time.
 * @param stepMs Time resolution for which data should be returned, in milliseconds. Specifying 3600000 will return data at hour intervals.
 */
case class InlineObject21(endMs: Int,
                fillMissing: Option[String],
                groupId: Long,
                series: Seq[SensorsHistorySeries],
                startMs: Int,
                stepMs: Int
                )

object InlineObject21 {
    /**
     * Creates the codec for converting InlineObject21 from and to JSON.
     */
    implicit val decoder: Decoder[InlineObject21] = deriveDecoder
    implicit val encoder: ObjectEncoder[InlineObject21] = deriveEncoder
}

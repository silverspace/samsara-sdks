package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param endCursor Cursor identifier representing the last element in the response. This value should be used in conjunction with a subsequent request's 'starting_after' query parameter.
 * @param hasNextPage True if there are more pages of results after this response.
 * @param hasPrevPage True if there are more pages of results before this response.
 * @param startCursor Cursor identifier representing the first element in the response. This value should be used in conjunction with a subsequent request's 'ending_before' query parameter.
 */
case class Pagination(endCursor: String,
                hasNextPage: Boolean,
                hasPrevPage: Boolean,
                startCursor: String
                )

object Pagination {
    /**
     * Creates the codec for converting Pagination from and to JSON.
     */
    implicit val decoder: Decoder[Pagination] = deriveDecoder
    implicit val encoder: ObjectEncoder[Pagination] = deriveEncoder
}

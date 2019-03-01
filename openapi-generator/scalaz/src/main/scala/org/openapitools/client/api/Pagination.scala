package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import Pagination._

case class Pagination (
  /* Cursor identifier representing the last element in the response. This value should be used in conjunction with a subsequent request's 'starting_after' query parameter. */
  endCursor: String,
/* True if there are more pages of results after this response. */
  hasNextPage: Boolean,
/* True if there are more pages of results before this response. */
  hasPrevPage: Boolean,
/* Cursor identifier representing the first element in the response. This value should be used in conjunction with a subsequent request's 'ending_before' query parameter. */
  startCursor: String)

object Pagination {
  import DateTimeCodecs._

  implicit val PaginationCodecJson: CodecJson[Pagination] = CodecJson.derive[Pagination]
  implicit val PaginationDecoder: EntityDecoder[Pagination] = jsonOf[Pagination]
  implicit val PaginationEncoder: EntityEncoder[Pagination] = jsonEncoderOf[Pagination]
}

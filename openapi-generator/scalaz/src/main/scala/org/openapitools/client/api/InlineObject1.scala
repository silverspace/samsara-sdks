package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import InlineObject1._

case class InlineObject1 (
  /* A list of IDs for contact book entries. */
  contactIds: Option[List[Long]],
/* The full address associated with this address/geofence, as it might be recognized by maps.google.com */
  formattedAddress: Option[String],
geofence: Option[AddressGeofence],
/* The name of this address/geofence */
  name: Option[String],
/* Notes associated with an address. */
  notes: Option[String],
/* A list of tag IDs. */
  tagIds: Option[List[Long]])

object InlineObject1 {
  import DateTimeCodecs._

  implicit val InlineObject1CodecJson: CodecJson[InlineObject1] = CodecJson.derive[InlineObject1]
  implicit val InlineObject1Decoder: EntityDecoder[InlineObject1] = jsonOf[InlineObject1]
  implicit val InlineObject1Encoder: EntityEncoder[InlineObject1] = jsonEncoderOf[InlineObject1]
}

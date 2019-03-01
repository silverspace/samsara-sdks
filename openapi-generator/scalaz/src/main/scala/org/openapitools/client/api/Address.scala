package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import Address._

case class Address (
  contacts: Option[List[Contact]],
/* The full address associated with this address/geofence, as it might be recognized by maps.google.com */
  formattedAddress: Option[String],
geofence: Option[AddressGeofence],
/* ID of the address */
  id: Option[Long],
/* Name of the address or geofence */
  name: Option[String],
/* Notes associated with an address. */
  notes: Option[String],
tags: Option[List[TagMetadata]])

object Address {
  import DateTimeCodecs._

  implicit val AddressCodecJson: CodecJson[Address] = CodecJson.derive[Address]
  implicit val AddressDecoder: EntityDecoder[Address] = jsonOf[Address]
  implicit val AddressEncoder: EntityEncoder[Address] = jsonEncoderOf[Address]
}

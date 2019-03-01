package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import AddressesAddresses._

case class AddressesAddresses (
  /* Notes associated with an address. */
  notes: Option[String],
/* The full address associated with this address/geofence, as it might be recognized by maps.google.com */
  formattedAddress: String,
geofence: AddressGeofence,
/* A list of tag IDs. */
  tagIds: Option[List[Long]],
/* The name of this address/geofence */
  name: String,
/* A list of IDs for contact book entries. */
  contactIds: Option[List[Long]])

object AddressesAddresses {
  import DateTimeCodecs._

  implicit val AddressesAddressesCodecJson: CodecJson[AddressesAddresses] = CodecJson.derive[AddressesAddresses]
  implicit val AddressesAddressesDecoder: EntityDecoder[AddressesAddresses] = jsonOf[AddressesAddresses]
  implicit val AddressesAddressesEncoder: EntityEncoder[AddressesAddresses] = jsonEncoderOf[AddressesAddresses]
}

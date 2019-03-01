package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AddressGeofence
import scala.collection.immutable.Seq

/**
 * 
 * @param notes Notes associated with an address.
 * @param formattedAddress The full address associated with this address/geofence, as it might be recognized by maps.google.com
 * @param geofence 
 * @param tagIds A list of tag IDs.
 * @param name The name of this address/geofence
 * @param contactIds A list of IDs for contact book entries.
 */
case class AddressesAddresses(notes: Option[String],
                formattedAddress: String,
                geofence: AddressGeofence,
                tagIds: Option[Seq[Long]],
                name: String,
                contactIds: Option[Seq[Long]]
                )

object AddressesAddresses {
    /**
     * Creates the codec for converting AddressesAddresses from and to JSON.
     */
    implicit val decoder: Decoder[AddressesAddresses] = deriveDecoder
    implicit val encoder: ObjectEncoder[AddressesAddresses] = deriveEncoder
}

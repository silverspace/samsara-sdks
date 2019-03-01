package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AddressGeofence
import org.openapitools.models.Contact
import org.openapitools.models.TagMetadata
import scala.collection.immutable.Seq

/**
 * Information about an address/geofence. Geofences are either a circle or a polygon.
 * @param contacts 
 * @param formattedAddress The full address associated with this address/geofence, as it might be recognized by maps.google.com
 * @param geofence 
 * @param id ID of the address
 * @param name Name of the address or geofence
 * @param notes Notes associated with an address.
 * @param tags 
 */
case class Address(contacts: Option[Seq[Contact]],
                formattedAddress: Option[String],
                geofence: Option[AddressGeofence],
                id: Option[Long],
                name: Option[String],
                notes: Option[String],
                tags: Option[Seq[TagMetadata]]
                )

object Address {
    /**
     * Creates the codec for converting Address from and to JSON.
     */
    implicit val decoder: Decoder[Address] = deriveDecoder
    implicit val encoder: ObjectEncoder[Address] = deriveEncoder
}

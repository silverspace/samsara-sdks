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
 * @param contactIds A list of IDs for contact book entries.
 * @param formattedAddress The full address associated with this address/geofence, as it might be recognized by maps.google.com
 * @param geofence 
 * @param name The name of this address/geofence
 * @param notes Notes associated with an address.
 * @param tagIds A list of tag IDs.
 */
case class InlineObject1(contactIds: Option[Seq[Long]],
                formattedAddress: Option[String],
                geofence: Option[AddressGeofence],
                name: Option[String],
                notes: Option[String],
                tagIds: Option[Seq[Long]]
                )

object InlineObject1 {
    /**
     * Creates the codec for converting InlineObject1 from and to JSON.
     */
    implicit val decoder: Decoder[InlineObject1] = deriveDecoder
    implicit val encoder: ObjectEncoder[InlineObject1] = deriveEncoder
}

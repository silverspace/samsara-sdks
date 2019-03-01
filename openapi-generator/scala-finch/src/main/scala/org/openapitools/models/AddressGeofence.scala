package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AddressGeofenceCircle
import org.openapitools.models.AddressGeofencePolygon

/**
 * The geofence that defines this address and its bounds. This can either be a circle, or a polygon - only one key should be provided, depending on the geofence type.
 * @param circle 
 * @param polygon 
 */
case class AddressGeofence(circle: Option[AddressGeofenceCircle],
                polygon: Option[AddressGeofencePolygon]
                )

object AddressGeofence {
    /**
     * Creates the codec for converting AddressGeofence from and to JSON.
     */
    implicit val decoder: Decoder[AddressGeofence] = deriveDecoder
    implicit val encoder: ObjectEncoder[AddressGeofence] = deriveEncoder
}

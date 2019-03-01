package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Information about a circular geofence. This field is only populated if the geofence is a circle.
 * @param latitude The latitude of the center of the circular geofence
 * @param radiusMeters The radius of the circular geofence
 * @param longitude The longitude of the center of the circular geofence
 */
case class AddressGeofenceCircle(latitude: Option[Double],
                radiusMeters: Option[Long],
                longitude: Option[Double]
                )

object AddressGeofenceCircle {
    /**
     * Creates the codec for converting AddressGeofenceCircle from and to JSON.
     */
    implicit val decoder: Decoder[AddressGeofenceCircle] = deriveDecoder
    implicit val encoder: ObjectEncoder[AddressGeofenceCircle] = deriveEncoder
}

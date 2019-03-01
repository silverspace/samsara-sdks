package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param actualUnderscoreendUnderscorems The time in Unix epoch milliseconds that the route actually ended.
 * @param actualUnderscorestartUnderscorems The time in Unix epoch milliseconds that the route actually started.
 * @param driverUnderscoreid ID of the driver assigned to the dispatch route. Note that driver_id and vehicle_id are mutually exclusive. If neither is specified, then the route is unassigned.
 * @param groupUnderscoreid ID of the group if the organization has multiple groups (optional).
 * @param name Descriptive name of this route.
 * @param scheduledUnderscoreendUnderscorems The time in Unix epoch milliseconds that the last job in the route is scheduled to end.
 * @param scheduledUnderscoremeters The distance expected to be traveled for this route in meters.
 * @param scheduledUnderscorestartUnderscorems The time in Unix epoch milliseconds that the route is scheduled to start.
 * @param startUnderscorelocationUnderscoreaddress The address of the route's starting location, as it would be recognized if provided to maps.google.com. Optional if a valid start location address ID is provided.
 * @param startUnderscorelocationUnderscoreaddressUnderscoreid ID of the start location associated with an address book entry. Optional if valid values are provided for start location address or latitude/longitude. If a valid start location address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the start location name is not provided.
 * @param startUnderscorelocationUnderscorelat Latitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.
 * @param startUnderscorelocationUnderscorelng Longitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.
 * @param startUnderscorelocationUnderscorename The name of the route's starting location. If provided, it will take precedence over the name of the address book entry.
 * @param trailerUnderscoreid ID of the trailer assigned to the dispatch route. Note that trailers can only be assigned to routes that have a Vehicle or Driver assigned to them.
 * @param vehicleUnderscoreid ID of the vehicle assigned to the dispatch route. Note that vehicle_id and driver_id are mutually exclusive. If neither is specified, then the route is unassigned.
 */
case class DispatchRouteBase(actualUnderscoreendUnderscorems: Option[Long],
                actualUnderscorestartUnderscorems: Option[Long],
                driverUnderscoreid: Option[Long],
                groupUnderscoreid: Option[Long],
                name: String,
                scheduledUnderscoreendUnderscorems: Long,
                scheduledUnderscoremeters: Option[Long],
                scheduledUnderscorestartUnderscorems: Long,
                startUnderscorelocationUnderscoreaddress: Option[String],
                startUnderscorelocationUnderscoreaddressUnderscoreid: Option[Long],
                startUnderscorelocationUnderscorelat: Option[Double],
                startUnderscorelocationUnderscorelng: Option[Double],
                startUnderscorelocationUnderscorename: Option[String],
                trailerUnderscoreid: Option[Long],
                vehicleUnderscoreid: Option[Long]
                )

object DispatchRouteBase {
    /**
     * Creates the codec for converting DispatchRouteBase from and to JSON.
     */
    implicit val decoder: Decoder[DispatchRouteBase] = deriveDecoder
    implicit val encoder: ObjectEncoder[DispatchRouteBase] = deriveEncoder
}

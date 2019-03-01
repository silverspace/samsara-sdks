package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * A vehicle object.
 * @param engineHours Total engine hours for the vehicle.
 * @param fuelLevelPercent The fuel level of the vehicle as a percentage. (0.0 to 1.0)
 * @param id ID of the vehicle.
 * @param name Name of the vehicle.
 * @param note 
 * @param odometerMeters The number of meters reported by the odometer.
 * @param vin Vehicle Identification Number.
 */
case class Vehicle(engineHours: Option[Long],
                fuelLevelPercent: Option[Double],
                id: Long,
                name: Option[String],
                note: Option[String],
                odometerMeters: Option[Long],
                vin: Option[String]
                )

object Vehicle {
    /**
     * Creates the codec for converting Vehicle from and to JSON.
     */
    implicit val decoder: Decoder[Vehicle] = deriveDecoder
    implicit val encoder: ObjectEncoder[Vehicle] = deriveEncoder
}

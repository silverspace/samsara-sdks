package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param inspectionType Only type 'mechanic' is currently accepted.
 * @param mechanicNotes Any notes from the mechanic.
 * @param odometerMiles The current odometer of the vehicle.
 * @param previousDefectsCorrected Whether any previous defects were corrected. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true.
 * @param previousDefectsIgnored Whether any previous defects were ignored. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true.
 * @param safe Whether or not this vehicle or trailer is safe to drive.
 * @param trailerId Id of trailer being inspected. Either vehicleId or trailerId must be provided.
 * @param userEmail The Samsara login email for the person creating the DVIR. The email must correspond to a Samsara user's email.
 * @param vehicleId Id of vehicle being inspected. Either vehicleId or trailerId must be provided.
 */
case class InlineObject12(inspectionType: String,
                mechanicNotes: Option[String],
                odometerMiles: Option[Int],
                previousDefectsCorrected: Option[Boolean],
                previousDefectsIgnored: Option[Boolean],
                safe: String,
                trailerId: Option[Int],
                userEmail: String,
                vehicleId: Option[Int]
                )

object InlineObject12 {
    /**
     * Creates the codec for converting InlineObject12 from and to JSON.
     */
    implicit val decoder: Decoder[InlineObject12] = deriveDecoder
    implicit val encoder: ObjectEncoder[InlineObject12] = deriveEncoder
}

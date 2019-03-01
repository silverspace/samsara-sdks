package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.DvirBaseAuthorSignature
import org.openapitools.models.DvirBaseMechanicOrAgentSignature
import org.openapitools.models.DvirBaseNextDriverSignature
import org.openapitools.models.DvirBaseTrailerDefects
import org.openapitools.models.DvirBaseVehicle
import scala.collection.immutable.Seq

/**
 * 
 * @param authorSignature 
 * @param defectsCorrected Signifies if the defects on the vehicle corrected after the DVIR is done.
 * @param defectsNeedNotBeCorrected Signifies if the defects on this vehicle can be ignored.
 * @param id The id of this DVIR record.
 * @param inspectionType Inspection type of the DVIR.
 * @param mechanicNotes The mechanics notes on the DVIR.
 * @param mechanicOrAgentSignature 
 * @param nextDriverSignature 
 * @param odometerMiles The odometer reading in miles for the vehicle when the DVIR was done.
 * @param timeMs Timestamp of this DVIR in UNIX milliseconds.
 * @param trailerDefects Defects registered for the trailer which was part of the DVIR.
 * @param trailerId The id of the trailer which was part of the DVIR.
 * @param trailerName The name of the trailer which was part of the DVIR.
 * @param vehicle 
 * @param vehicleCondition The condition of vechile on which DVIR was done.
 * @param vehicleDefects Defects registered for the vehicle which was part of the DVIR.
 */
case class DvirBase(authorSignature: Option[DvirBaseAuthorSignature],
                defectsCorrected: Option[Boolean],
                defectsNeedNotBeCorrected: Option[Boolean],
                id: Option[Long],
                inspectionType: Option[String],
                mechanicNotes: Option[String],
                mechanicOrAgentSignature: Option[DvirBaseMechanicOrAgentSignature],
                nextDriverSignature: Option[DvirBaseNextDriverSignature],
                odometerMiles: Option[Long],
                timeMs: Option[Long],
                trailerDefects: Option[Seq[DvirBaseTrailerDefects]],
                trailerId: Option[Int],
                trailerName: Option[String],
                vehicle: Option[DvirBaseVehicle],
                vehicleCondition: Option[String],
                vehicleDefects: Option[Seq[DvirBaseTrailerDefects]]
                )

object DvirBase {
    /**
     * Creates the codec for converting DvirBase from and to JSON.
     */
    implicit val decoder: Decoder[DvirBase] = deriveDecoder
    implicit val encoder: ObjectEncoder[DvirBase] = deriveEncoder
}

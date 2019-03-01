package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.DvirBaseAuthorSignature
import org.openapitools.model.DvirBaseMechanicOrAgentSignature
import org.openapitools.model.DvirBaseNextDriverSignature
import org.openapitools.model.DvirBaseTrailerDefects
import org.openapitools.model.DvirBaseVehicle
import javax.validation.Valid
import javax.validation.constraints.*

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
data class DvirBase (

        @JsonProperty("authorSignature") val authorSignature: DvirBaseAuthorSignature? = null,

        @JsonProperty("defectsCorrected") val defectsCorrected: Boolean? = null,

        @JsonProperty("defectsNeedNotBeCorrected") val defectsNeedNotBeCorrected: Boolean? = null,

        @JsonProperty("id") val id: Long? = null,

        @JsonProperty("inspectionType") val inspectionType: String? = null,

        @JsonProperty("mechanicNotes") val mechanicNotes: String? = null,

        @JsonProperty("mechanicOrAgentSignature") val mechanicOrAgentSignature: DvirBaseMechanicOrAgentSignature? = null,

        @JsonProperty("nextDriverSignature") val nextDriverSignature: DvirBaseNextDriverSignature? = null,

        @JsonProperty("odometerMiles") val odometerMiles: Long? = null,

        @JsonProperty("timeMs") val timeMs: Long? = null,

        @JsonProperty("trailerDefects") val trailerDefects: List<DvirBaseTrailerDefects>? = null,

        @JsonProperty("trailerId") val trailerId: Int? = null,

        @JsonProperty("trailerName") val trailerName: String? = null,

        @JsonProperty("vehicle") val vehicle: DvirBaseVehicle? = null,

        @JsonProperty("vehicleCondition") val vehicleCondition: String? = null,

        @JsonProperty("vehicleDefects") val vehicleDefects: List<DvirBaseTrailerDefects>? = null
) {

}


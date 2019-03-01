package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import javax.validation.Valid
import javax.validation.constraints.*

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
data class InlineObject12 (

        @get:NotNull 
        @JsonProperty("inspectionType") val inspectionType: InlineObject12.InspectionType,

        @get:NotNull 
        @JsonProperty("safe") val safe: InlineObject12.Safe,

        @get:NotNull 
        @JsonProperty("userEmail") val userEmail: String,

        @JsonProperty("mechanicNotes") val mechanicNotes: String? = null,

        @JsonProperty("odometerMiles") val odometerMiles: Int? = null,

        @JsonProperty("previousDefectsCorrected") val previousDefectsCorrected: Boolean? = null,

        @JsonProperty("previousDefectsIgnored") val previousDefectsIgnored: Boolean? = null,

        @JsonProperty("trailerId") val trailerId: Int? = null,

        @JsonProperty("vehicleId") val vehicleId: Int? = null
) {

    /**
    * Only type 'mechanic' is currently accepted.
    * Values: mechanic
    */
    enum class InspectionType(val value: String) {
    
        @JsonProperty("mechanic") mechanic("mechanic");
    
    }

    /**
    * Whether or not this vehicle or trailer is safe to drive.
    * Values: safe,unsafe
    */
    enum class Safe(val value: String) {
    
        @JsonProperty("safe") safe("safe"),
    
        @JsonProperty("unsafe") unsafe("unsafe");
    
    }

}


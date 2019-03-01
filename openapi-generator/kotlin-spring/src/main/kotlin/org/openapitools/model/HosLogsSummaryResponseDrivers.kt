package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param timeUntilBreak The amount of time (in ms) remaining until the driver cannot drive without a rest break.
 * @param vehicleName Name of the vehicle.
 * @param drivingInViolationToday The amount of driving time in violation today (in ms).
 * @param driverId ID of the driver.
 * @param cycleRemaining The amount of remaining cycle time (in ms).
 * @param driverName Name of the driver.
 * @param dutyStatus The Hours of Service status type. One of `OFF_DUTY`, `SLEEPER_BED`, `DRIVING`, `ON_DUTY`, `YARD_MOVE`, `PERSONAL_CONVEYANCE`.
 * @param cycleTomorrow The amount of cycle time (in ms) available tomorrow.
 * @param shiftDriveRemaining The amount of remaining shift drive time (in ms).
 * @param timeInCurrentStatus The amount of time (in ms) that the driver has been in the current `dutyStatus`.
 * @param drivingInViolationCycle The amount of driving time in violation in this cycle (in ms).
 * @param shiftRemaining The amount of remaining shift time (in ms).
 */
data class HosLogsSummaryResponseDrivers (

        @JsonProperty("timeUntilBreak") val timeUntilBreak: Long? = null,

        @JsonProperty("vehicleName") val vehicleName: String? = null,

        @JsonProperty("drivingInViolationToday") val drivingInViolationToday: Long? = null,

        @JsonProperty("driverId") val driverId: Long? = null,

        @JsonProperty("cycleRemaining") val cycleRemaining: Long? = null,

        @JsonProperty("driverName") val driverName: String? = null,

        @JsonProperty("dutyStatus") val dutyStatus: String? = null,

        @JsonProperty("cycleTomorrow") val cycleTomorrow: Long? = null,

        @JsonProperty("shiftDriveRemaining") val shiftDriveRemaining: Long? = null,

        @JsonProperty("timeInCurrentStatus") val timeInCurrentStatus: Long? = null,

        @JsonProperty("drivingInViolationCycle") val drivingInViolationCycle: Long? = null,

        @JsonProperty("shiftRemaining") val shiftRemaining: Long? = null
) {

}


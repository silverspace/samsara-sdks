package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param locLng Longitude at which the log was recorded.
 * @param logStartMs The time at which the log/HOS status started in UNIX milliseconds.
 * @param driverId ID of the driver.
 * @param statusType The Hours of Service status type. One of `OFF_DUTY`, `SLEEPER_BED`, `DRIVING`, `ON_DUTY`, `YARD_MOVE`, `PERSONAL_CONVEYANCE`.
 * @param locCity City in which the log was recorded.
 * @param groupId ID of the group.
 * @param locName Name of location at which the log was recorded.
 * @param locLat Latitude at which the log was recorded.
 * @param remark Remark associated with the log entry.
 * @param locState State in which the log was recorded.
 * @param vehicleId ID of the vehicle.
 * @param codriverIds 
 */
data class HosLogsResponseLogs (

        @JsonProperty("locLng") val locLng: Double? = null,

        @JsonProperty("logStartMs") val logStartMs: Long? = null,

        @JsonProperty("driverId") val driverId: Long? = null,

        @JsonProperty("statusType") val statusType: String? = null,

        @JsonProperty("locCity") val locCity: String? = null,

        @JsonProperty("groupId") val groupId: Long? = null,

        @JsonProperty("locName") val locName: String? = null,

        @JsonProperty("locLat") val locLat: Double? = null,

        @JsonProperty("remark") val remark: String? = null,

        @JsonProperty("locState") val locState: String? = null,

        @JsonProperty("vehicleId") val vehicleId: Long? = null,

        @JsonProperty("codriverIds") val codriverIds: List<Long>? = null
) {

}


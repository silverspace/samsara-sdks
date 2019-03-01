package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param driverId ID of the driver.
 * @param distanceMiles Distance driven in miles, rounded to two decimal places.
 * @param driveMs Duration in milliseconds that driver was driving during the requested time range
 * @param activeMs Duration in milliseconds that driver was on duty or driving during the requested time range
 * @param driverUsername Username of the driver.
 * @param groupId Group of the driver.
 * @param driverName Name of the driver.
 * @param onDutyMs Duration in milliseconds that driver was on duty during the requested time range
 */
data class DriversSummaryResponseSummaries (

        @JsonProperty("driverId") val driverId: Long? = null,

        @JsonProperty("distanceMiles") val distanceMiles: Double? = null,

        @JsonProperty("driveMs") val driveMs: Long? = null,

        @JsonProperty("activeMs") val activeMs: Long? = null,

        @JsonProperty("driverUsername") val driverUsername: String? = null,

        @JsonProperty("groupId") val groupId: Long? = null,

        @JsonProperty("driverName") val driverName: String? = null,

        @JsonProperty("onDutyMs") val onDutyMs: Long? = null
) {

}


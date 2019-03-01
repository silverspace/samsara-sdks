package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param certifiedAtMs Unix epoch time (in ms) of time when this chart was certified. If this chart is uncertified, 0.
 * @param endMs End of the HOS day, specified in milliseconds UNIX time.
 * @param startMs End of the HOS day, specified in milliseconds UNIX time.
 * @param trailerIds List of trailer ID's associated with the driver for the day.
 * @param activeHours Hours spent on duty or driving, rounded to two decimal places.
 * @param distanceMiles Distance driven in miles, rounded to two decimal places.
 * @param activeMs Milliseconds spent on duty or driving.
 * @param certified Whether this HOS day chart was certified by the driver.
 * @param vehicleIds List of vehicle ID's associated with the driver for the day.
 */
data class DriverDailyLogResponseDays (

        @JsonProperty("certifiedAtMs") val certifiedAtMs: Long? = null,

        @JsonProperty("endMs") val endMs: Int? = null,

        @JsonProperty("startMs") val startMs: Int? = null,

        @JsonProperty("trailerIds") val trailerIds: Any? = null,

        @JsonProperty("activeHours") val activeHours: Double? = null,

        @JsonProperty("distanceMiles") val distanceMiles: Double? = null,

        @JsonProperty("activeMs") val activeMs: Long? = null,

        @JsonProperty("certified") val certified: Boolean? = null,

        @JsonProperty("vehicleIds") val vehicleIds: Any? = null
) {

}


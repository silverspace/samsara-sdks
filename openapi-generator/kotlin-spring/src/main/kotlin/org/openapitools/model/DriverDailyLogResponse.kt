package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.DriverDailyLogResponseDays
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param days 
 */
data class DriverDailyLogResponse (

        @JsonProperty("days") val days: List<DriverDailyLogResponseDays>? = null
) {

}


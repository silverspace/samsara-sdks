package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.DataInputHistoryResponsePoints
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param id The ID of this data input
 * @param name Name of this data input
 * @param points Data points from this data input
 */
data class DataInputHistoryResponse (

        @get:NotNull 
        @JsonProperty("name") val name: String,

        @JsonProperty("id") val id: Long? = null,

        @JsonProperty("points") val points: List<DataInputHistoryResponsePoints>? = null
) {

}


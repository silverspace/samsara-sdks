package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.DataInputHistoryResponse
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param dataInputs 
 */
data class InlineResponse2006 (

        @JsonProperty("dataInputs") val dataInputs: List<DataInputHistoryResponse>? = null
) {

}


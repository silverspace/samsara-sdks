package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.DvirBase
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param dvirs 
 */
data class DvirListResponse (

        @JsonProperty("dvirs") val dvirs: List<DvirBase>? = null
) {

}


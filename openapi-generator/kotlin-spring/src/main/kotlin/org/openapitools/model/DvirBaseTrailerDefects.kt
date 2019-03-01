package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param comment The comment describing the type of DVIR defect
 * @param defectType The type of DVIR defect
 */
data class DvirBaseTrailerDefects (

        @JsonProperty("comment") val comment: String? = null,

        @JsonProperty("defectType") val defectType: String? = null
) {

}


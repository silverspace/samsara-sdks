package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.TaggedAssetBase
import org.openapitools.model.TaggedDriverBase
import org.openapitools.model.TaggedMachineBase
import org.openapitools.model.TaggedSensorBase
import org.openapitools.model.TaggedVehicleBase
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param assets The assets that belong to this tag.
 * @param drivers The drivers that belong to this tag.
 * @param machines The machines that belong to this tag.
 * @param name Name of this tag.
 * @param parentTagId If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag's parent tag.
 * @param sensors The sensors that belong to this tag.
 * @param vehicles The vehicles that belong to this tag.
 */
data class TagCreate (

        @get:NotNull 
        @JsonProperty("name") val name: String,

        @JsonProperty("assets") val assets: List<TaggedAssetBase>? = null,

        @JsonProperty("drivers") val drivers: List<TaggedDriverBase>? = null,

        @JsonProperty("machines") val machines: List<TaggedMachineBase>? = null,

        @JsonProperty("parentTagId") val parentTagId: Long? = null,

        @JsonProperty("sensors") val sensors: List<TaggedSensorBase>? = null,

        @JsonProperty("vehicles") val vehicles: List<TaggedVehicleBase>? = null
) {

}


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
 * Specify devices, etc. that should be added to the tag.
 * @param assets The assets to be added to this tag.
 * @param sensors The sensors to be added to this tag.
 * @param vehicles The vehicles to be added to this tag.
 * @param machines The machines to be added to this tag.
 * @param drivers The drivers to be added to this tag.
 */
data class TagModifyAdd (

        @JsonProperty("assets") val assets: List<TaggedAssetBase>? = null,

        @JsonProperty("sensors") val sensors: List<TaggedSensorBase>? = null,

        @JsonProperty("vehicles") val vehicles: List<TaggedVehicleBase>? = null,

        @JsonProperty("machines") val machines: List<TaggedMachineBase>? = null,

        @JsonProperty("drivers") val drivers: List<TaggedDriverBase>? = null
) {

}


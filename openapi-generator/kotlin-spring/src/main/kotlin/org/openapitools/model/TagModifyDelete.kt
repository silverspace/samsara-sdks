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
 * Specify devices, etc. that should be removed from the tag.
 * @param assets The assets to be removed from this tag.
 * @param sensors The sensors to be removed from this tag.
 * @param vehicles The vehicles to be removed from this tag.
 * @param machines The machines to be removed from this tag.
 * @param drivers The drivers to be removed from this tag.
 */
data class TagModifyDelete (

        @JsonProperty("assets") val assets: List<TaggedAssetBase>? = null,

        @JsonProperty("sensors") val sensors: List<TaggedSensorBase>? = null,

        @JsonProperty("vehicles") val vehicles: List<TaggedVehicleBase>? = null,

        @JsonProperty("machines") val machines: List<TaggedMachineBase>? = null,

        @JsonProperty("drivers") val drivers: List<TaggedDriverBase>? = null
) {

}


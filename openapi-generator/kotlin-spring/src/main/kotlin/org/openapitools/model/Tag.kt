package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.TaggedAddress
import org.openapitools.model.TaggedAsset
import org.openapitools.model.TaggedDriver
import org.openapitools.model.TaggedMachine
import org.openapitools.model.TaggedSensor
import org.openapitools.model.TaggedVehicle
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param addresses The addresses that belong to this tag.
 * @param assets The assets that belong to this tag.
 * @param drivers The drivers that belong to this tag.
 * @param groupId The GroupID that this tag belongs to.
 * @param id The ID of this tag.
 * @param machines The machines that belong to this tag.
 * @param name Name of this tag.
 * @param parentTagId If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag's parent tag.
 * @param sensors The sensors that belong to this tag.
 * @param vehicles The vehicles that belong to this tag.
 */
data class Tag (

        @get:NotNull 
        @JsonProperty("id") val id: Long,

        @get:NotNull 
        @JsonProperty("name") val name: String,

        @JsonProperty("addresses") val addresses: List<TaggedAddress>? = null,

        @JsonProperty("assets") val assets: List<TaggedAsset>? = null,

        @JsonProperty("drivers") val drivers: List<TaggedDriver>? = null,

        @JsonProperty("groupId") val groupId: Long? = null,

        @JsonProperty("machines") val machines: List<TaggedMachine>? = null,

        @JsonProperty("parentTagId") val parentTagId: Long? = null,

        @JsonProperty("sensors") val sensors: List<TaggedSensor>? = null,

        @JsonProperty("vehicles") val vehicles: List<TaggedVehicle>? = null
) {

}


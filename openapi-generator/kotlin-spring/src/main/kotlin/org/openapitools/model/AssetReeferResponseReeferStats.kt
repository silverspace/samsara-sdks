package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AssetReeferResponseReeferStatsAlarms1
import org.openapitools.model.AssetReeferResponseReeferStatsEngineHours
import org.openapitools.model.AssetReeferResponseReeferStatsFuelPercentage
import org.openapitools.model.AssetReeferResponseReeferStatsPowerStatus
import org.openapitools.model.AssetReeferResponseReeferStatsReturnAirTemp
import org.openapitools.model.AssetReeferResponseReeferStatsSetPoint
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param fuelPercentage Fuel percentage of the reefer
 * @param powerStatus Power status of the reefer
 * @param engineHours Engine hours of the reefer
 * @param setPoint Set point temperature of the reefer
 * @param returnAirTemp Return air temperature of the reefer
 * @param alarms Reefer alarms
 */
data class AssetReeferResponseReeferStats (

        @JsonProperty("fuelPercentage") val fuelPercentage: List<AssetReeferResponseReeferStatsFuelPercentage>? = null,

        @JsonProperty("powerStatus") val powerStatus: List<AssetReeferResponseReeferStatsPowerStatus>? = null,

        @JsonProperty("engineHours") val engineHours: List<AssetReeferResponseReeferStatsEngineHours>? = null,

        @JsonProperty("setPoint") val setPoint: List<AssetReeferResponseReeferStatsSetPoint>? = null,

        @JsonProperty("returnAirTemp") val returnAirTemp: List<AssetReeferResponseReeferStatsReturnAirTemp>? = null,

        @JsonProperty("alarms") val alarms: List<AssetReeferResponseReeferStatsAlarms1>? = null
) {

}


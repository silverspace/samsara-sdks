package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * Sensor ID and field to query.
 * @param field Field to query.
 * @param widgetId Sensor ID to query.
 */
data class SensorsHistorySeries (

        @get:NotNull 
        @JsonProperty("field") val field: SensorsHistorySeries.Field,

        @get:NotNull 
        @JsonProperty("widgetId") val widgetId: Long
) {

    /**
    * Field to query.
    * Values: ambientTemperature,probeTemperature,currentLoop1Raw,currentLoop1Mapped,currentLoop2Raw,currentLoop2Mapped,pmPowerTotal,pmPhase1Power,pmPhase2Power,pmPhase3Power,pmPhase1PowerFactor,pmPhase2PowerFactor,pmPhase3PowerFactor
    */
    enum class Field(val value: String) {
    
        @JsonProperty("ambientTemperature") ambientTemperature("ambientTemperature"),
    
        @JsonProperty("probeTemperature") probeTemperature("probeTemperature"),
    
        @JsonProperty("currentLoop1Raw") currentLoop1Raw("currentLoop1Raw"),
    
        @JsonProperty("currentLoop1Mapped") currentLoop1Mapped("currentLoop1Mapped"),
    
        @JsonProperty("currentLoop2Raw") currentLoop2Raw("currentLoop2Raw"),
    
        @JsonProperty("currentLoop2Mapped") currentLoop2Mapped("currentLoop2Mapped"),
    
        @JsonProperty("pmPowerTotal") pmPowerTotal("pmPowerTotal"),
    
        @JsonProperty("pmPhase1Power") pmPhase1Power("pmPhase1Power"),
    
        @JsonProperty("pmPhase2Power") pmPhase2Power("pmPhase2Power"),
    
        @JsonProperty("pmPhase3Power") pmPhase3Power("pmPhase3Power"),
    
        @JsonProperty("pmPhase1PowerFactor") pmPhase1PowerFactor("pmPhase1PowerFactor"),
    
        @JsonProperty("pmPhase2PowerFactor") pmPhase2PowerFactor("pmPhase2PowerFactor"),
    
        @JsonProperty("pmPhase3PowerFactor") pmPhase3PowerFactor("pmPhase3PowerFactor");
    
    }

}


package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.AuxInput
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * A list of aux input values over a timerange.
 * @param name The name of the aux input.
 * @param values 
 */
data class AuxInputSeries (

        @get:NotNull 
        @JsonProperty("name") val name: AuxInputSeries.Name,

        @get:NotNull 
        @JsonProperty("values") val values: List<AuxInput>
) {

    /**
    * The name of the aux input.
    * Values: emergencyLights,emergencyAlarm,stopPaddle,powerTakeMinusOff,plow,sweeper,salter,boom
    */
    enum class Name(val value: String) {
    
        @JsonProperty("Emergency Lights") emergencyLights("Emergency Lights"),
    
        @JsonProperty("Emergency Alarm") emergencyAlarm("Emergency Alarm"),
    
        @JsonProperty("Stop Paddle") stopPaddle("Stop Paddle"),
    
        @JsonProperty("Power Take-Off") powerTakeMinusOff("Power Take-Off"),
    
        @JsonProperty("Plow") plow("Plow"),
    
        @JsonProperty("Sweeper") sweeper("Sweeper"),
    
        @JsonProperty("Salter") salter("Salter"),
    
        @JsonProperty("Boom") boom("Boom");
    
    }

}


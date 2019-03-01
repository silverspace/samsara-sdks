package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * The state of the vehicle over time. State can be Running, Off, or Idle.
 * @param timeMs Timestamp in Unix epoch milliseconds.
 * @param value 
 */
data class EngineState (

        @get:NotNull 
        @JsonProperty("timeMs") val timeMs: Any,

        @get:NotNull 
        @JsonProperty("value") val value: EngineState.Value
) {

    /**
    * 
    * Values: running,off,idle
    */
    enum class Value(val value: String) {
    
        @JsonProperty("Running") running("Running"),
    
        @JsonProperty("Off") off("Off"),
    
        @JsonProperty("Idle") idle("Idle");
    
    }

}


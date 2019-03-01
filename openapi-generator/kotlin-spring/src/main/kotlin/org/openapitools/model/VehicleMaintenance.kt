package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.VehicleMaintenanceJ1939
import org.openapitools.model.VehicleMaintenancePassenger
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * Contains any J1939/Passenger engine light warnings and engine faults.
 * @param id ID of the vehicle.
 * @param j1939 
 * @param passenger 
 */
data class VehicleMaintenance (

        @get:NotNull 
        @JsonProperty("id") val id: Long,

        @JsonProperty("j1939") val j1939: VehicleMaintenanceJ1939? = null,

        @JsonProperty("passenger") val passenger: VehicleMaintenancePassenger? = null
) {

}


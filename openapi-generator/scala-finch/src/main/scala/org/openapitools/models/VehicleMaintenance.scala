package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.VehicleMaintenanceJ1939
import org.openapitools.models.VehicleMaintenancePassenger

/**
 * Contains any J1939/Passenger engine light warnings and engine faults.
 * @param id ID of the vehicle.
 * @param j1939 
 * @param passenger 
 */
case class VehicleMaintenance(id: Long,
                j1939: Option[VehicleMaintenanceJ1939],
                passenger: Option[VehicleMaintenancePassenger]
                )

object VehicleMaintenance {
    /**
     * Creates the codec for converting VehicleMaintenance from and to JSON.
     */
    implicit val decoder: Decoder[VehicleMaintenance] = deriveDecoder
    implicit val encoder: ObjectEncoder[VehicleMaintenance] = deriveEncoder
}

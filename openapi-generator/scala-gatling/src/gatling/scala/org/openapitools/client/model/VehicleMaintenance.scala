
package org.openapitools.client.model


case class VehicleMaintenance (
    /* ID of the vehicle. */
    _id: Long,
    _j1939: Option[VehicleMaintenanceJ1939],
    _passenger: Option[VehicleMaintenancePassenger]
)
object VehicleMaintenance {
    def toStringBody(var_id: Object, var_j1939: Object, var_passenger: Object) =
        s"""
        | {
        | "id":$var_id,"j1939":$var_j1939,"passenger":$var_passenger
        | }
        """.stripMargin
}

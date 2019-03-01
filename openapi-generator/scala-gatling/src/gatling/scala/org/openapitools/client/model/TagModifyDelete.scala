
package org.openapitools.client.model


case class TagModifyDelete (
    /* The assets to be removed from this tag. */
    _assets: Option[List[TaggedAssetBase]],
    /* The sensors to be removed from this tag. */
    _sensors: Option[List[TaggedSensorBase]],
    /* The vehicles to be removed from this tag. */
    _vehicles: Option[List[TaggedVehicleBase]],
    /* The machines to be removed from this tag. */
    _machines: Option[List[TaggedMachineBase]],
    /* The drivers to be removed from this tag. */
    _drivers: Option[List[TaggedDriverBase]]
)
object TagModifyDelete {
    def toStringBody(var_assets: Object, var_sensors: Object, var_vehicles: Object, var_machines: Object, var_drivers: Object) =
        s"""
        | {
        | "assets":$var_assets,"sensors":$var_sensors,"vehicles":$var_vehicles,"machines":$var_machines,"drivers":$var_drivers
        | }
        """.stripMargin
}

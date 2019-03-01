
package org.openapitools.client.model


case class TagModifyAdd (
    /* The assets to be added to this tag. */
    _assets: Option[List[TaggedAssetBase]],
    /* The sensors to be added to this tag. */
    _sensors: Option[List[TaggedSensorBase]],
    /* The vehicles to be added to this tag. */
    _vehicles: Option[List[TaggedVehicleBase]],
    /* The machines to be added to this tag. */
    _machines: Option[List[TaggedMachineBase]],
    /* The drivers to be added to this tag. */
    _drivers: Option[List[TaggedDriverBase]]
)
object TagModifyAdd {
    def toStringBody(var_assets: Object, var_sensors: Object, var_vehicles: Object, var_machines: Object, var_drivers: Object) =
        s"""
        | {
        | "assets":$var_assets,"sensors":$var_sensors,"vehicles":$var_vehicles,"machines":$var_machines,"drivers":$var_drivers
        | }
        """.stripMargin
}

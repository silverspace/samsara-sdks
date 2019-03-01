
package org.openapitools.client.model


case class TagCreate (
    /* The assets that belong to this tag. */
    _assets: Option[List[TaggedAssetBase]],
    /* The drivers that belong to this tag. */
    _drivers: Option[List[TaggedDriverBase]],
    /* The machines that belong to this tag. */
    _machines: Option[List[TaggedMachineBase]],
    /* Name of this tag. */
    _name: String,
    /* If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag's parent tag. */
    _parentTagId: Option[Long],
    /* The sensors that belong to this tag. */
    _sensors: Option[List[TaggedSensorBase]],
    /* The vehicles that belong to this tag. */
    _vehicles: Option[List[TaggedVehicleBase]]
)
object TagCreate {
    def toStringBody(var_assets: Object, var_drivers: Object, var_machines: Object, var_name: Object, var_parentTagId: Object, var_sensors: Object, var_vehicles: Object) =
        s"""
        | {
        | "assets":$var_assets,"drivers":$var_drivers,"machines":$var_machines,"name":$var_name,"parentTagId":$var_parentTagId,"sensors":$var_sensors,"vehicles":$var_vehicles
        | }
        """.stripMargin
}

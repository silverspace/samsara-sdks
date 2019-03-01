
package org.openapitools.client.model


case class Tag (
    /* The addresses that belong to this tag. */
    _addresses: Option[List[TaggedAddress]],
    /* The assets that belong to this tag. */
    _assets: Option[List[TaggedAsset]],
    /* The drivers that belong to this tag. */
    _drivers: Option[List[TaggedDriver]],
    /* The GroupID that this tag belongs to. */
    _groupId: Option[Long],
    /* The ID of this tag. */
    _id: Long,
    /* The machines that belong to this tag. */
    _machines: Option[List[TaggedMachine]],
    /* Name of this tag. */
    _name: String,
    /* If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag's parent tag. */
    _parentTagId: Option[Long],
    /* The sensors that belong to this tag. */
    _sensors: Option[List[TaggedSensor]],
    /* The vehicles that belong to this tag. */
    _vehicles: Option[List[TaggedVehicle]]
)
object Tag {
    def toStringBody(var_addresses: Object, var_assets: Object, var_drivers: Object, var_groupId: Object, var_id: Object, var_machines: Object, var_name: Object, var_parentTagId: Object, var_sensors: Object, var_vehicles: Object) =
        s"""
        | {
        | "addresses":$var_addresses,"assets":$var_assets,"drivers":$var_drivers,"groupId":$var_groupId,"id":$var_id,"machines":$var_machines,"name":$var_name,"parentTagId":$var_parentTagId,"sensors":$var_sensors,"vehicles":$var_vehicles
        | }
        """.stripMargin
}

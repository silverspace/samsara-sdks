
package org.openapitools.client.model


case class MachineHistoryResponseMachines (
    /* Machine name */
    _name: Option[String],
    /* Machine ID */
    _id: Option[Integer],
    /* List of vibration datapoints, with timestamp and vibration measurement for x/y/z axis in mm/s */
    _vibrations: Option[List[MachineHistoryResponseVibrations]]
)
object MachineHistoryResponseMachines {
    def toStringBody(var_name: Object, var_id: Object, var_vibrations: Object) =
        s"""
        | {
        | "name":$var_name,"id":$var_id,"vibrations":$var_vibrations
        | }
        """.stripMargin
}

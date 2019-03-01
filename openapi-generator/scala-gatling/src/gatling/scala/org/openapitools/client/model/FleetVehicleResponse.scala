
package org.openapitools.client.model


case class FleetVehicleResponse (
    _externalIds: Option[Map[String, String]],
    /* Harsh event detection setting. */
    _harshAccelSetting: Option[String],
    /* ID of the vehicle. */
    _id: Long,
    /* Name of the vehicle. */
    _name: String,
    _vehicleInfo: Option[FleetVehicleResponseVehicleInfo]
)
object FleetVehicleResponse {
    def toStringBody(var_externalIds: Object, var_harshAccelSetting: Object, var_id: Object, var_name: Object, var_vehicleInfo: Object) =
        s"""
        | {
        | "externalIds":$var_externalIds,"harshAccelSetting":$var_harshAccelSetting,"id":$var_id,"name":$var_name,"vehicleInfo":$var_vehicleInfo
        | }
        """.stripMargin
}

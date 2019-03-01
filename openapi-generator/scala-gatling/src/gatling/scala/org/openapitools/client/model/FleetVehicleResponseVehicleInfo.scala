
package org.openapitools.client.model


case class FleetVehicleResponseVehicleInfo (
    /* Year of the vehicle. */
    _year: Option[Long],
    /* Model of the Vehicle. */
    _model: Option[String],
    /* Vehicle Identification Number. */
    _vin: Option[String],
    /* Make of the vehicle. */
    _make: Option[String]
)
object FleetVehicleResponseVehicleInfo {
    def toStringBody(var_year: Object, var_model: Object, var_vin: Object, var_make: Object) =
        s"""
        | {
        | "year":$var_year,"model":$var_model,"vin":$var_vin,"make":$var_make
        | }
        """.stripMargin
}


package org.openapitools.client.model


case class Vehicle (
    /* Total engine hours for the vehicle. */
    _engineHours: Option[Long],
    /* The fuel level of the vehicle as a percentage. (0.0 to 1.0) */
    _fuelLevelPercent: Option[Double],
    /* ID of the vehicle. */
    _id: Long,
    /* Name of the vehicle. */
    _name: Option[String],
    _note: Option[String],
    /* The number of meters reported by the odometer. */
    _odometerMeters: Option[Long],
    /* Vehicle Identification Number. */
    _vin: Option[String]
)
object Vehicle {
    def toStringBody(var_engineHours: Object, var_fuelLevelPercent: Object, var_id: Object, var_name: Object, var_note: Object, var_odometerMeters: Object, var_vin: Object) =
        s"""
        | {
        | "engineHours":$var_engineHours,"fuelLevelPercent":$var_fuelLevelPercent,"id":$var_id,"name":$var_name,"note":$var_note,"odometerMeters":$var_odometerMeters,"vin":$var_vin
        | }
        """.stripMargin
}

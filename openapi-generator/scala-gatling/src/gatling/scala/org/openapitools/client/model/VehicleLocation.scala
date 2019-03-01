
package org.openapitools.client.model


case class VehicleLocation (
    /* Heading in degrees. */
    _heading: Option[Double],
    /* ID of the vehicle. */
    _id: Long,
    /* Latitude in decimal degrees. */
    _latitude: Option[Double],
    /* Text representation of nearest identifiable location to (latitude, longitude) coordinates. */
    _location: Option[String],
    /* Longitude in decimal degrees. */
    _longitude: Option[Double],
    /* Name of the vehicle. */
    _name: Option[String],
    /* The number of meters reported by the odometer. */
    _odometerMeters: Option[Long],
    /* Whether or not a trip is currently in progress for this vehicle. More information available via /fleet/trips endpoint. */
    _onTrip: Option[Boolean],
    /* Speed in miles per hour. */
    _speed: Option[Double],
    /* The time the reported location was logged, reported as a UNIX timestamp in milliseconds. */
    _time: Option[Integer],
    /* Vehicle Identification Number (VIN) of the vehicle. */
    _vin: Option[String]
)
object VehicleLocation {
    def toStringBody(var_heading: Object, var_id: Object, var_latitude: Object, var_location: Object, var_longitude: Object, var_name: Object, var_odometerMeters: Object, var_onTrip: Object, var_speed: Object, var_time: Object, var_vin: Object) =
        s"""
        | {
        | "heading":$var_heading,"id":$var_id,"latitude":$var_latitude,"location":$var_location,"longitude":$var_longitude,"name":$var_name,"odometerMeters":$var_odometerMeters,"onTrip":$var_onTrip,"speed":$var_speed,"time":$var_time,"vin":$var_vin
        | }
        """.stripMargin
}


package org.openapitools.client.model


case class TripResponseTrips (
    /* Odometer reading at the end of the trip. */
    _endOdometer: Option[Integer],
    /* Length of the trip in meters. */
    _distanceMeters: Option[Integer],
    /* End of the trip in UNIX milliseconds. */
    _endMs: Option[Integer],
    /* Beginning of the trip in UNIX milliseconds. */
    _startMs: Option[Integer],
    /* Amount in milliliters of fuel consumed on this trip. */
    _fuelConsumedMl: Option[Integer],
    /* Text representation of nearest identifiable location to the start (latitude, longitude) coordinates. */
    _startAddress: Option[String],
    _startCoordinates: Option[TripResponseStartCoordinates],
    _endCoordinates: Option[TripResponseEndCoordinates],
    /* Odometer reading at the beginning of the trip. */
    _startOdometer: Option[Integer],
    /* ID of the driver. */
    _driverId: Option[Integer],
    /* Geocoded street address of start (latitude, longitude) coordinates. */
    _startLocation: Option[String],
    /* Length in meters trip spent on toll roads. */
    _tollMeters: Option[Integer],
    /* Text representation of nearest identifiable location to the end (latitude, longitude) coordinates. */
    _endAddress: Option[String],
    /* Geocoded street address of start (latitude, longitude) coordinates. */
    _endLocation: Option[String]
)
object TripResponseTrips {
    def toStringBody(var_endOdometer: Object, var_distanceMeters: Object, var_endMs: Object, var_startMs: Object, var_fuelConsumedMl: Object, var_startAddress: Object, var_startCoordinates: Object, var_endCoordinates: Object, var_startOdometer: Object, var_driverId: Object, var_startLocation: Object, var_tollMeters: Object, var_endAddress: Object, var_endLocation: Object) =
        s"""
        | {
        | "endOdometer":$var_endOdometer,"distanceMeters":$var_distanceMeters,"endMs":$var_endMs,"startMs":$var_startMs,"fuelConsumedMl":$var_fuelConsumedMl,"startAddress":$var_startAddress,"startCoordinates":$var_startCoordinates,"endCoordinates":$var_endCoordinates,"startOdometer":$var_startOdometer,"driverId":$var_driverId,"startLocation":$var_startLocation,"tollMeters":$var_tollMeters,"endAddress":$var_endAddress,"endLocation":$var_endLocation
        | }
        """.stripMargin
}

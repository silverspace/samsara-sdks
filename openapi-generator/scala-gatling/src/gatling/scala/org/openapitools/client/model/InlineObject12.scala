
package org.openapitools.client.model


case class InlineObject12 (
    /* Only type 'mechanic' is currently accepted. */
    _inspectionType: String,
    /* Any notes from the mechanic. */
    _mechanicNotes: Option[String],
    /* The current odometer of the vehicle. */
    _odometerMiles: Option[Integer],
    /* Whether any previous defects were corrected. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true. */
    _previousDefectsCorrected: Option[Boolean],
    /* Whether any previous defects were ignored. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true. */
    _previousDefectsIgnored: Option[Boolean],
    /* Whether or not this vehicle or trailer is safe to drive. */
    _safe: String,
    /* Id of trailer being inspected. Either vehicleId or trailerId must be provided. */
    _trailerId: Option[Integer],
    /* The Samsara login email for the person creating the DVIR. The email must correspond to a Samsara user's email. */
    _userEmail: String,
    /* Id of vehicle being inspected. Either vehicleId or trailerId must be provided. */
    _vehicleId: Option[Integer]
)
object InlineObject12 {
    def toStringBody(var_inspectionType: Object, var_mechanicNotes: Object, var_odometerMiles: Object, var_previousDefectsCorrected: Object, var_previousDefectsIgnored: Object, var_safe: Object, var_trailerId: Object, var_userEmail: Object, var_vehicleId: Object) =
        s"""
        | {
        | "inspectionType":$var_inspectionType,"mechanicNotes":$var_mechanicNotes,"odometerMiles":$var_odometerMiles,"previousDefectsCorrected":$var_previousDefectsCorrected,"previousDefectsIgnored":$var_previousDefectsIgnored,"safe":$var_safe,"trailerId":$var_trailerId,"userEmail":$var_userEmail,"vehicleId":$var_vehicleId
        | }
        """.stripMargin
}

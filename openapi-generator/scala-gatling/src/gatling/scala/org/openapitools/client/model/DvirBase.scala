
package org.openapitools.client.model


case class DvirBase (
    _authorSignature: Option[DvirBaseAuthorSignature],
    /* Signifies if the defects on the vehicle corrected after the DVIR is done. */
    _defectsCorrected: Option[Boolean],
    /* Signifies if the defects on this vehicle can be ignored. */
    _defectsNeedNotBeCorrected: Option[Boolean],
    /* The id of this DVIR record. */
    _id: Option[Long],
    /* Inspection type of the DVIR. */
    _inspectionType: Option[String],
    /* The mechanics notes on the DVIR. */
    _mechanicNotes: Option[String],
    _mechanicOrAgentSignature: Option[DvirBaseMechanicOrAgentSignature],
    _nextDriverSignature: Option[DvirBaseNextDriverSignature],
    /* The odometer reading in miles for the vehicle when the DVIR was done. */
    _odometerMiles: Option[Long],
    /* Timestamp of this DVIR in UNIX milliseconds. */
    _timeMs: Option[Long],
    /* Defects registered for the trailer which was part of the DVIR. */
    _trailerDefects: Option[List[DvirBaseTrailerDefects]],
    /* The id of the trailer which was part of the DVIR. */
    _trailerId: Option[Integer],
    /* The name of the trailer which was part of the DVIR. */
    _trailerName: Option[String],
    _vehicle: Option[DvirBaseVehicle],
    /* The condition of vechile on which DVIR was done. */
    _vehicleCondition: Option[String],
    /* Defects registered for the vehicle which was part of the DVIR. */
    _vehicleDefects: Option[List[DvirBaseTrailerDefects]]
)
object DvirBase {
    def toStringBody(var_authorSignature: Object, var_defectsCorrected: Object, var_defectsNeedNotBeCorrected: Object, var_id: Object, var_inspectionType: Object, var_mechanicNotes: Object, var_mechanicOrAgentSignature: Object, var_nextDriverSignature: Object, var_odometerMiles: Object, var_timeMs: Object, var_trailerDefects: Object, var_trailerId: Object, var_trailerName: Object, var_vehicle: Object, var_vehicleCondition: Object, var_vehicleDefects: Object) =
        s"""
        | {
        | "authorSignature":$var_authorSignature,"defectsCorrected":$var_defectsCorrected,"defectsNeedNotBeCorrected":$var_defectsNeedNotBeCorrected,"id":$var_id,"inspectionType":$var_inspectionType,"mechanicNotes":$var_mechanicNotes,"mechanicOrAgentSignature":$var_mechanicOrAgentSignature,"nextDriverSignature":$var_nextDriverSignature,"odometerMiles":$var_odometerMiles,"timeMs":$var_timeMs,"trailerDefects":$var_trailerDefects,"trailerId":$var_trailerId,"trailerName":$var_trailerName,"vehicle":$var_vehicle,"vehicleCondition":$var_vehicleCondition,"vehicleDefects":$var_vehicleDefects
        | }
        """.stripMargin
}

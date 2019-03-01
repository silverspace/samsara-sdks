package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.DvirBaseAuthorSignature;
import org.openapitools.model.DvirBaseMechanicOrAgentSignature;
import org.openapitools.model.DvirBaseNextDriverSignature;
import org.openapitools.model.DvirBaseTrailerDefects;
import org.openapitools.model.DvirBaseVehicle;

@Canonical
class DvirBase {
    DvirBaseAuthorSignature authorSignature = null

    /* Signifies if the defects on the vehicle corrected after the DVIR is done. */
    Boolean defectsCorrected

    /* Signifies if the defects on this vehicle can be ignored. */
    Boolean defectsNeedNotBeCorrected

    /* The id of this DVIR record. */
    Long id

    /* Inspection type of the DVIR. */
    String inspectionType

    /* The mechanics notes on the DVIR. */
    String mechanicNotes

    DvirBaseMechanicOrAgentSignature mechanicOrAgentSignature = null

    DvirBaseNextDriverSignature nextDriverSignature = null

    /* The odometer reading in miles for the vehicle when the DVIR was done. */
    Long odometerMiles

    /* Timestamp of this DVIR in UNIX milliseconds. */
    Long timeMs

    /* Defects registered for the trailer which was part of the DVIR. */
    List<DvirBaseTrailerDefects> trailerDefects = new ArrayList<DvirBaseTrailerDefects>()

    /* The id of the trailer which was part of the DVIR. */
    Integer trailerId

    /* The name of the trailer which was part of the DVIR. */
    String trailerName

    DvirBaseVehicle vehicle = null

    /* The condition of vechile on which DVIR was done. */
    String vehicleCondition

    /* Defects registered for the vehicle which was part of the DVIR. */
    List<DvirBaseTrailerDefects> vehicleDefects = new ArrayList<DvirBaseTrailerDefects>()

}

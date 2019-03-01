package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.DvirBaseAuthorSignature;
import io.swagger.model.DvirBaseMechanicOrAgentSignature;
import io.swagger.model.DvirBaseNextDriverSignature;
import io.swagger.model.DvirBaseTrailerDefects;
import io.swagger.model.DvirBaseVehicle;
import java.util.List;
@Canonical
class DvirBase {

    DvirBaseAuthorSignature authorSignature = null

  /* Signifies if the defects on the vehicle corrected after the DVIR is done. */
  Boolean defectsCorrected = null

  /* Signifies if the defects on this vehicle can be ignored. */
  Boolean defectsNeedNotBeCorrected = null

  /* The id of this DVIR record. */
  Long id = null

  /* Inspection type of the DVIR. */
  String inspectionType = null

  /* The mechanics notes on the DVIR. */
  String mechanicNotes = null

    DvirBaseMechanicOrAgentSignature mechanicOrAgentSignature = null

    DvirBaseNextDriverSignature nextDriverSignature = null

  /* The odometer reading in miles for the vehicle when the DVIR was done. */
  Long odometerMiles = null

  /* Timestamp of this DVIR in UNIX milliseconds. */
  Long timeMs = null

  /* Defects registered for the trailer which was part of the DVIR. */
  List<DvirBaseTrailerDefects> trailerDefects = new ArrayList<DvirBaseTrailerDefects>()

  /* The id of the trailer which was part of the DVIR. */
  Integer trailerId = null

  /* The name of the trailer which was part of the DVIR. */
  String trailerName = null

    DvirBaseVehicle vehicle = null

  /* The condition of vechile on which DVIR was done. */
  String vehicleCondition = null

  /* Defects registered for the vehicle which was part of the DVIR. */
  List<DvirBaseTrailerDefects> vehicleDefects = new ArrayList<DvirBaseTrailerDefects>()
  

}


package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class CreateDvirParam {

  /* Only type 'mechanic' is currently accepted. */
  String inspectionType = null

  /* Any notes from the mechanic. */
  String mechanicNotes = null

  /* The current odometer of the vehicle. */
  Integer odometerMiles = null

  /* Whether any previous defects were corrected. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true. */
  Boolean previousDefectsCorrected = null

  /* Whether any previous defects were ignored. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true. */
  Boolean previousDefectsIgnored = null

  /* Whether or not this vehicle or trailer is safe to drive. */
  String safe = null

  /* Id of trailer being inspected. Either vehicleId or trailerId must be provided. */
  Integer trailerId = null

  /* The Samsara login email for the person creating the DVIR. The email must correspond to a Samsara user's email. */
  String userEmail = null

  /* Id of vehicle being inspected. Either vehicleId or trailerId must be provided. */
  Integer vehicleId = null
  

}


package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class InlineObject12 {
    /* Only type 'mechanic' is currently accepted. */
    String inspectionType

    /* Any notes from the mechanic. */
    String mechanicNotes

    /* The current odometer of the vehicle. */
    Integer odometerMiles

    /* Whether any previous defects were corrected. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true. */
    Boolean previousDefectsCorrected

    /* Whether any previous defects were ignored. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true. */
    Boolean previousDefectsIgnored

    /* Whether or not this vehicle or trailer is safe to drive. */
    String safe

    /* Id of trailer being inspected. Either vehicleId or trailerId must be provided. */
    Integer trailerId

    /* The Samsara login email for the person creating the DVIR. The email must correspond to a Samsara user's email. */
    String userEmail

    /* Id of vehicle being inspected. Either vehicleId or trailerId must be provided. */
    Integer vehicleId

}

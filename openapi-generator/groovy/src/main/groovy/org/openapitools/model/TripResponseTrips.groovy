package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.TripResponseEndCoordinates;
import org.openapitools.model.TripResponseStartCoordinates;

@Canonical
class TripResponseTrips {
    /* Odometer reading at the end of the trip. */
    Integer endOdometer

    /* Length of the trip in meters. */
    Integer distanceMeters

    /* End of the trip in UNIX milliseconds. */
    Integer endMs

    /* Beginning of the trip in UNIX milliseconds. */
    Integer startMs

    /* Amount in milliliters of fuel consumed on this trip. */
    Integer fuelConsumedMl

    /* Text representation of nearest identifiable location to the start (latitude, longitude) coordinates. */
    String startAddress

    TripResponseStartCoordinates startCoordinates = null

    TripResponseEndCoordinates endCoordinates = null

    /* Odometer reading at the beginning of the trip. */
    Integer startOdometer

    /* ID of the driver. */
    Integer driverId

    /* Geocoded street address of start (latitude, longitude) coordinates. */
    String startLocation

    /* Length in meters trip spent on toll roads. */
    Integer tollMeters

    /* Text representation of nearest identifiable location to the end (latitude, longitude) coordinates. */
    String endAddress

    /* Geocoded street address of start (latitude, longitude) coordinates. */
    String endLocation

}

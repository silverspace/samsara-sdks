package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TripResponseEndCoordinates;
import io.swagger.model.TripResponseStartCoordinates;
@Canonical
class TripResponseTrips {

  /* Length of the trip in meters. */
  Integer distanceMeters = null

  /* ID of the driver. */
  Integer driverId = null

  /* Text representation of nearest identifiable location to the end (latitude, longitude) coordinates. */
  String endAddress = null

    TripResponseEndCoordinates endCoordinates = null

  /* Geocoded street address of start (latitude, longitude) coordinates. */
  String endLocation = null

  /* End of the trip in UNIX milliseconds. */
  Integer endMs = null

  /* Odometer reading at the end of the trip. */
  Integer endOdometer = null

  /* Amount in milliliters of fuel consumed on this trip. */
  Integer fuelConsumedMl = null

  /* Text representation of nearest identifiable location to the start (latitude, longitude) coordinates. */
  String startAddress = null

    TripResponseStartCoordinates startCoordinates = null

  /* Geocoded street address of start (latitude, longitude) coordinates. */
  String startLocation = null

  /* Beginning of the trip in UNIX milliseconds. */
  Integer startMs = null

  /* Odometer reading at the beginning of the trip. */
  Integer startOdometer = null

  /* Length in meters trip spent on toll roads. */
  Integer tollMeters = null
  

}


package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class VehicleLocation {

  /* Heading in degrees. */
  Double heading = null

  /* ID of the vehicle. */
  Long id = null

  /* Latitude in decimal degrees. */
  Double latitude = null

  /* Text representation of nearest identifiable location to (latitude, longitude) coordinates. */
  String location = null

  /* Longitude in decimal degrees. */
  Double longitude = null

  /* Name of the vehicle. */
  String name = null

  /* The number of meters reported by the odometer. */
  Long odometerMeters = null

  /* Whether or not a trip is currently in progress for this vehicle. More information available via /fleet/trips endpoint. */
  Boolean onTrip = null

  /* Speed in miles per hour. */
  Double speed = null

  /* The time the reported location was logged, reported as a UNIX timestamp in milliseconds. */
  Integer time = null

  /* Vehicle Identification Number (VIN) of the vehicle. */
  String vin = null
  

}


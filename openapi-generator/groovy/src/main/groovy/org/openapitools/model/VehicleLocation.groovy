package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class VehicleLocation {
    /* Heading in degrees. */
    Double heading

    /* ID of the vehicle. */
    Long id

    /* Latitude in decimal degrees. */
    Double latitude

    /* Text representation of nearest identifiable location to (latitude, longitude) coordinates. */
    String location

    /* Longitude in decimal degrees. */
    Double longitude

    /* Name of the vehicle. */
    String name

    /* The number of meters reported by the odometer. */
    Long odometerMeters

    /* Whether or not a trip is currently in progress for this vehicle. More information available via /fleet/trips endpoint. */
    Boolean onTrip

    /* Speed in miles per hour. */
    Double speed

    /* The time the reported location was logged, reported as a UNIX timestamp in milliseconds. */
    Integer time

    /* Vehicle Identification Number (VIN) of the vehicle. */
    String vin

}

/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;

public class VehicleLocationBuilder {
    //the instance to build
    private VehicleLocation vehicleLocation;

    /**
     * Default constructor to initialize the instance
     */
    public VehicleLocationBuilder() {
        vehicleLocation = new VehicleLocation();
    }

    /**
     * Heading in degrees.
     */
    public VehicleLocationBuilder heading(Double heading) {
        vehicleLocation.setHeading(heading);
        return this;
    }

    /**
     * ID of the vehicle.
     */
    public VehicleLocationBuilder id(long id) {
        vehicleLocation.setId(id);
        return this;
    }

    /**
     * Latitude in decimal degrees.
     */
    public VehicleLocationBuilder latitude(Double latitude) {
        vehicleLocation.setLatitude(latitude);
        return this;
    }

    /**
     * Text representation of nearest identifiable location to (latitude, longitude) coordinates.
     */
    public VehicleLocationBuilder location(String location) {
        vehicleLocation.setLocation(location);
        return this;
    }

    /**
     * Longitude in decimal degrees.
     */
    public VehicleLocationBuilder longitude(Double longitude) {
        vehicleLocation.setLongitude(longitude);
        return this;
    }

    /**
     * Name of the vehicle.
     */
    public VehicleLocationBuilder name(String name) {
        vehicleLocation.setName(name);
        return this;
    }

    /**
     * The number of meters reported by the odometer.
     */
    public VehicleLocationBuilder odometerMeters(Long odometerMeters) {
        vehicleLocation.setOdometerMeters(odometerMeters);
        return this;
    }

    /**
     * Whether or not a trip is currently in progress for this vehicle. More information available via /fleet/trips endpoint.
     */
    public VehicleLocationBuilder onTrip(Boolean onTrip) {
        vehicleLocation.setOnTrip(onTrip);
        return this;
    }

    /**
     * Speed in miles per hour.
     */
    public VehicleLocationBuilder speed(Double speed) {
        vehicleLocation.setSpeed(speed);
        return this;
    }

    /**
     * The time the reported location was logged, reported as a UNIX timestamp in milliseconds.
     */
    public VehicleLocationBuilder time(Long time) {
        vehicleLocation.setTime(time);
        return this;
    }

    /**
     * Vehicle Identification Number (VIN) of the vehicle.
     */
    public VehicleLocationBuilder vin(String vin) {
        vehicleLocation.setVin(vin);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public VehicleLocation build() {
        return vehicleLocation;
    }
}
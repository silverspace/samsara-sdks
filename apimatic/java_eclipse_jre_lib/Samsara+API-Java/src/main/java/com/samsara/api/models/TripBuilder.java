/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;

public class TripBuilder {
    //the instance to build
    private Trip trip;

    /**
     * Default constructor to initialize the instance
     */
    public TripBuilder() {
        trip = new Trip();
    }

    /**
     * Length of the trip in meters.
     */
    public TripBuilder distanceMeters(Integer distanceMeters) {
        trip.setDistanceMeters(distanceMeters);
        return this;
    }

    /**
     * ID of the driver.
     */
    public TripBuilder driverId(Integer driverId) {
        trip.setDriverId(driverId);
        return this;
    }

    /**
     * Text representation of nearest identifiable location to the end (latitude, longitude) coordinates.
     */
    public TripBuilder endAddress(String endAddress) {
        trip.setEndAddress(endAddress);
        return this;
    }

    /**
     * End (latitude, longitude) in decimal degrees.
     */
    public TripBuilder endCoordinates(EndCoordinates endCoordinates) {
        trip.setEndCoordinates(endCoordinates);
        return this;
    }

    /**
     * Geocoded street address of start (latitude, longitude) coordinates.
     */
    public TripBuilder endLocation(String endLocation) {
        trip.setEndLocation(endLocation);
        return this;
    }

    /**
     * End of the trip in UNIX milliseconds.
     */
    public TripBuilder endMs(Long endMs) {
        trip.setEndMs(endMs);
        return this;
    }

    /**
     * Odometer reading at the end of the trip.
     */
    public TripBuilder endOdometer(Integer endOdometer) {
        trip.setEndOdometer(endOdometer);
        return this;
    }

    /**
     * Amount in milliliters of fuel consumed on this trip.
     */
    public TripBuilder fuelConsumedMl(Integer fuelConsumedMl) {
        trip.setFuelConsumedMl(fuelConsumedMl);
        return this;
    }

    /**
     * Text representation of nearest identifiable location to the start (latitude, longitude) coordinates.
     */
    public TripBuilder startAddress(String startAddress) {
        trip.setStartAddress(startAddress);
        return this;
    }

    /**
     * Start (latitude, longitude) in decimal degrees.
     */
    public TripBuilder startCoordinates(StartCoordinates startCoordinates) {
        trip.setStartCoordinates(startCoordinates);
        return this;
    }

    /**
     * Geocoded street address of start (latitude, longitude) coordinates.
     */
    public TripBuilder startLocation(String startLocation) {
        trip.setStartLocation(startLocation);
        return this;
    }

    /**
     * Beginning of the trip in UNIX milliseconds.
     */
    public TripBuilder startMs(Long startMs) {
        trip.setStartMs(startMs);
        return this;
    }

    /**
     * Odometer reading at the beginning of the trip.
     */
    public TripBuilder startOdometer(Integer startOdometer) {
        trip.setStartOdometer(startOdometer);
        return this;
    }

    /**
     * Length in meters trip spent on toll roads.
     */
    public TripBuilder tollMeters(Integer tollMeters) {
        trip.setTollMeters(tollMeters);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Trip build() {
        return trip;
    }
}
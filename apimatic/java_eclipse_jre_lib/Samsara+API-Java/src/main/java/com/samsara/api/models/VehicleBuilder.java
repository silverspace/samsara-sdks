/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;

public class VehicleBuilder {
    //the instance to build
    private Vehicle vehicle;

    /**
     * Default constructor to initialize the instance
     */
    public VehicleBuilder() {
        vehicle = new Vehicle();
    }

    /**
     * Total engine hours for the vehicle.
     */
    public VehicleBuilder engineHours(Long engineHours) {
        vehicle.setEngineHours(engineHours);
        return this;
    }

    /**
     * The fuel level of the vehicle as a percentage. (0.0 to 1.0)
     */
    public VehicleBuilder fuelLevelPercent(Double fuelLevelPercent) {
        vehicle.setFuelLevelPercent(fuelLevelPercent);
        return this;
    }

    /**
     * ID of the vehicle.
     */
    public VehicleBuilder id(long id) {
        vehicle.setId(id);
        return this;
    }

    /**
     * Name of the vehicle.
     */
    public VehicleBuilder name(String name) {
        vehicle.setName(name);
        return this;
    }

    public VehicleBuilder note(String note) {
        vehicle.setNote(note);
        return this;
    }

    /**
     * The number of meters reported by the odometer.
     */
    public VehicleBuilder odometerMeters(Long odometerMeters) {
        vehicle.setOdometerMeters(odometerMeters);
        return this;
    }

    /**
     * Vehicle Identification Number.
     */
    public VehicleBuilder vin(String vin) {
        vehicle.setVin(vin);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Vehicle build() {
        return vehicle;
    }
}
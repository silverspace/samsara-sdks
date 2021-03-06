/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;

public class FuelPercentageBuilder {
    //the instance to build
    private FuelPercentage fuelPercentageInstance;

    /**
     * Default constructor to initialize the instance
     */
    public FuelPercentageBuilder() {
        fuelPercentageInstance = new FuelPercentage();
    }

    /**
     * Timestamp in Unix milliseconds since epoch.
     */
    public FuelPercentageBuilder changedAtMs(Long changedAtMs) {
        fuelPercentageInstance.setChangedAtMs(changedAtMs);
        return this;
    }

    /**
     * Fuel percentage of the reefer.
     */
    public FuelPercentageBuilder fuelPercentage(Long fuelPercentage) {
        fuelPercentageInstance.setFuelPercentage(fuelPercentage);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public FuelPercentage build() {
        return fuelPercentageInstance;
    }
}
/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;

public class DayBuilder {
    //the instance to build
    private Day day;

    /**
     * Default constructor to initialize the instance
     */
    public DayBuilder() {
        day = new Day();
    }

    /**
     * Hours spent on duty or driving, rounded to two decimal places.
     */
    public DayBuilder activeHours(Double activeHours) {
        day.setActiveHours(activeHours);
        return this;
    }

    /**
     * Milliseconds spent on duty or driving.
     */
    public DayBuilder activeMs(Long activeMs) {
        day.setActiveMs(activeMs);
        return this;
    }

    /**
     * Whether this HOS day chart was certified by the driver.
     */
    public DayBuilder certified(Boolean certified) {
        day.setCertified(certified);
        return this;
    }

    /**
     * Unix epoch time (in ms) of time when this chart was certified. If this chart is uncertified, 0.
     */
    public DayBuilder certifiedAtMs(Long certifiedAtMs) {
        day.setCertifiedAtMs(certifiedAtMs);
        return this;
    }

    /**
     * Distance driven in miles, rounded to two decimal places.
     */
    public DayBuilder distanceMiles(Double distanceMiles) {
        day.setDistanceMiles(distanceMiles);
        return this;
    }

    /**
     * End of the HOS day, specified in milliseconds UNIX time.
     */
    public DayBuilder endMs(Long endMs) {
        day.setEndMs(endMs);
        return this;
    }

    /**
     * End of the HOS day, specified in milliseconds UNIX time.
     */
    public DayBuilder startMs(Long startMs) {
        day.setStartMs(startMs);
        return this;
    }

    /**
     * List of trailer ID's associated with the driver for the day.
     */
    public DayBuilder trailerIds(Object trailerIds) {
        day.setTrailerIds(trailerIds);
        return this;
    }

    /**
     * List of vehicle ID's associated with the driver for the day.
     */
    public DayBuilder vehicleIds(Object vehicleIds) {
        day.setVehicleIds(vehicleIds);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Day build() {
        return day;
    }
}
/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;

public class SummaryBuilder {
    //the instance to build
    private Summary summary;

    /**
     * Default constructor to initialize the instance
     */
    public SummaryBuilder() {
        summary = new Summary();
    }

    /**
     * Duration in milliseconds that driver was on duty or driving during the requested time range
     */
    public SummaryBuilder activeMs(Long activeMs) {
        summary.setActiveMs(activeMs);
        return this;
    }

    /**
     * Distance driven in miles, rounded to two decimal places.
     */
    public SummaryBuilder distanceMiles(Double distanceMiles) {
        summary.setDistanceMiles(distanceMiles);
        return this;
    }

    /**
     * Duration in milliseconds that driver was driving during the requested time range
     */
    public SummaryBuilder driveMs(Long driveMs) {
        summary.setDriveMs(driveMs);
        return this;
    }

    /**
     * ID of the driver.
     */
    public SummaryBuilder driverId(Long driverId) {
        summary.setDriverId(driverId);
        return this;
    }

    /**
     * Name of the driver.
     */
    public SummaryBuilder driverName(String driverName) {
        summary.setDriverName(driverName);
        return this;
    }

    /**
     * Username of the driver.
     */
    public SummaryBuilder driverUsername(String driverUsername) {
        summary.setDriverUsername(driverUsername);
        return this;
    }

    /**
     * Group of the driver.
     */
    public SummaryBuilder groupId(Long groupId) {
        summary.setGroupId(groupId);
        return this;
    }

    /**
     * Duration in milliseconds that driver was on duty during the requested time range
     */
    public SummaryBuilder onDutyMs(Long onDutyMs) {
        summary.setOnDutyMs(onDutyMs);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Summary build() {
        return summary;
    }
}
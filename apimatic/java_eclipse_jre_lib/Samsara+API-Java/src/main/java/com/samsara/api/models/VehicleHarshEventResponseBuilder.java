/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;

public class VehicleHarshEventResponseBuilder {
    //the instance to build
    private VehicleHarshEventResponse vehicleHarshEventResponse;

    /**
     * Default constructor to initialize the instance
     */
    public VehicleHarshEventResponseBuilder() {
        vehicleHarshEventResponse = new VehicleHarshEventResponse();
    }

    /**
     * URL for downloading the forward facing video
     */
    public VehicleHarshEventResponseBuilder downloadForwardVideoUrl(String downloadForwardVideoUrl) {
        vehicleHarshEventResponse.setDownloadForwardVideoUrl(downloadForwardVideoUrl);
        return this;
    }

    /**
     * URL for downloading the inward facing video
     */
    public VehicleHarshEventResponseBuilder downloadInwardVideoUrl(String downloadInwardVideoUrl) {
        vehicleHarshEventResponse.setDownloadInwardVideoUrl(downloadInwardVideoUrl);
        return this;
    }

    /**
     * URL for downloading the tracked inward facing video
     */
    public VehicleHarshEventResponseBuilder downloadTrackedInwardVideoUrl(String downloadTrackedInwardVideoUrl) {
        vehicleHarshEventResponse.setDownloadTrackedInwardVideoUrl(downloadTrackedInwardVideoUrl);
        return this;
    }

    /**
     * Type of the harsh event. One of: [Crash, Harsh Acceleration, Harsh Braking, Harsh Turn, ROP Engine, ROP Brake, YC Engine, YC Brake, Harsh Event]
     */
    public VehicleHarshEventResponseBuilder harshEventType(String harshEventType) {
        vehicleHarshEventResponse.setHarshEventType(harshEventType);
        return this;
    }

    /**
     * URL of the associated incident report page
     */
    public VehicleHarshEventResponseBuilder incidentReportUrl(String incidentReportUrl) {
        vehicleHarshEventResponse.setIncidentReportUrl(incidentReportUrl);
        return this;
    }

    /**
     * Whether the driver was deemed distracted during this harsh event
     */
    public VehicleHarshEventResponseBuilder isDistracted(Boolean isDistracted) {
        vehicleHarshEventResponse.setIsDistracted(isDistracted);
        return this;
    }

    public VehicleHarshEventResponseBuilder location(Location location) {
        vehicleHarshEventResponse.setLocation(location);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public VehicleHarshEventResponse build() {
        return vehicleHarshEventResponse;
    }
}
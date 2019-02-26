/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;

public class EngineHourBuilder {
    //the instance to build
    private EngineHour engineHour;

    /**
     * Default constructor to initialize the instance
     */
    public EngineHourBuilder() {
        engineHour = new EngineHour();
    }

    /**
     * Timestamp in Unix milliseconds since epoch.
     */
    public EngineHourBuilder changedAtMs(Long changedAtMs) {
        engineHour.setChangedAtMs(changedAtMs);
        return this;
    }

    /**
     * Engine hours of the reefer.
     */
    public EngineHourBuilder engineHours(Long engineHours) {
        engineHour.setEngineHours(engineHours);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public EngineHour build() {
        return engineHour;
    }
}
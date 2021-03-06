/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;

public class Sensor4Builder {
    //the instance to build
    private Sensor4 sensor4;

    /**
     * Default constructor to initialize the instance
     */
    public Sensor4Builder() {
        sensor4 = new Sensor4();
    }

    /**
     * Currently reported ambient temperature in millidegrees celsius.
     */
    public Sensor4Builder ambientTemperature(Integer ambientTemperature) {
        sensor4.setAmbientTemperature(ambientTemperature);
        return this;
    }

    /**
     * ID of the sensor.
     */
    public Sensor4Builder id(Long id) {
        sensor4.setId(id);
        return this;
    }

    /**
     * Name of the sensor.
     */
    public Sensor4Builder name(String name) {
        sensor4.setName(name);
        return this;
    }

    /**
     * Currently reported probe temperature in millidegrees celsius. If no probe is connected, this parameter will not be reported.
     */
    public Sensor4Builder probeTemperature(Integer probeTemperature) {
        sensor4.setProbeTemperature(probeTemperature);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Sensor4 build() {
        return sensor4;
    }
}
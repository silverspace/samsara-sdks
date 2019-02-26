/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;

public class Sensor5Builder {
    //the instance to build
    private Sensor5 sensor5;

    /**
     * Default constructor to initialize the instance
     */
    public Sensor5Builder() {
        sensor5 = new Sensor5();
    }

    /**
     * Flag indicating whether the current cargo is empty or loaded.
     */
    public Sensor5Builder cargoEmpty(Boolean cargoEmpty) {
        sensor5.setCargoEmpty(cargoEmpty);
        return this;
    }

    /**
     * ID of the sensor.
     */
    public Sensor5Builder id(Long id) {
        sensor5.setId(id);
        return this;
    }

    /**
     * Name of the sensor.
     */
    public Sensor5Builder name(String name) {
        sensor5.setName(name);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Sensor5 build() {
        return sensor5;
    }
}
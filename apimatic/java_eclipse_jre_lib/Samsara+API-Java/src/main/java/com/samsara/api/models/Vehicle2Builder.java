/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;

public class Vehicle2Builder {
    //the instance to build
    private Vehicle2 vehicle2;

    /**
     * Default constructor to initialize the instance
     */
    public Vehicle2Builder() {
        vehicle2 = new Vehicle2();
    }

    /**
     * The vehicle id on which DVIR was done.
     */
    public Vehicle2Builder id(Long id) {
        vehicle2.setId(id);
        return this;
    }

    /**
     * The vehicle on which DVIR was done.
     */
    public Vehicle2Builder name(String name) {
        vehicle2.setName(name);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Vehicle2 build() {
        return vehicle2;
    }
}
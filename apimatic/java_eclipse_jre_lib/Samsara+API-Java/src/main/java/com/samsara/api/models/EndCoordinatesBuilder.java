/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;

public class EndCoordinatesBuilder {
    //the instance to build
    private EndCoordinates endCoordinates;

    /**
     * Default constructor to initialize the instance
     */
    public EndCoordinatesBuilder() {
        endCoordinates = new EndCoordinates();
    }

    public EndCoordinatesBuilder latitude(Double latitude) {
        endCoordinates.setLatitude(latitude);
        return this;
    }

    public EndCoordinatesBuilder longitude(Double longitude) {
        endCoordinates.setLongitude(longitude);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public EndCoordinates build() {
        return endCoordinates;
    }
}
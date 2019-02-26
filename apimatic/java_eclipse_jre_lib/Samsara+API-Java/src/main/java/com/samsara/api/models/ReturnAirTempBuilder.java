/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;

public class ReturnAirTempBuilder {
    //the instance to build
    private ReturnAirTemp returnAirTemp;

    /**
     * Default constructor to initialize the instance
     */
    public ReturnAirTempBuilder() {
        returnAirTemp = new ReturnAirTemp();
    }

    /**
     * Timestamp in Unix milliseconds since epoch.
     */
    public ReturnAirTempBuilder changedAtMs(Long changedAtMs) {
        returnAirTemp.setChangedAtMs(changedAtMs);
        return this;
    }

    /**
     * Return air temperature in millidegree Celsius.
     */
    public ReturnAirTempBuilder tempInMilliC(Long tempInMilliC) {
        returnAirTemp.setTempInMilliC(tempInMilliC);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ReturnAirTemp build() {
        return returnAirTemp;
    }
}
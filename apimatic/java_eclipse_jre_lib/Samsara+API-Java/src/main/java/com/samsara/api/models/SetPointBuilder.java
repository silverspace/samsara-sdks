/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;

public class SetPointBuilder {
    //the instance to build
    private SetPoint setPoint;

    /**
     * Default constructor to initialize the instance
     */
    public SetPointBuilder() {
        setPoint = new SetPoint();
    }

    /**
     * Timestamp in Unix milliseconds since epoch.
     */
    public SetPointBuilder changedAtMs(Long changedAtMs) {
        setPoint.setChangedAtMs(changedAtMs);
        return this;
    }

    /**
     * Set point temperature in millidegree Celsius.
     */
    public SetPointBuilder tempInMilliC(Long tempInMilliC) {
        setPoint.setTempInMilliC(tempInMilliC);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public SetPoint build() {
        return setPoint;
    }
}
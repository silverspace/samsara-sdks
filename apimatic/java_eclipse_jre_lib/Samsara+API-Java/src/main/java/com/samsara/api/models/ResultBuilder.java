/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;

public class ResultBuilder {
    //the instance to build
    private Result result;

    /**
     * Default constructor to initialize the instance
     */
    public ResultBuilder() {
        result = new Result();
    }

    /**
     * List of datapoints, one for each requested (sensor, field) pair.
     */
    public ResultBuilder series(List<Long> series) {
        result.setSeries(series);
        return this;
    }

    /**
     * Timestamp in UNIX milliseconds.
     */
    public ResultBuilder timeMs(Long timeMs) {
        result.setTimeMs(timeMs);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Result build() {
        return result;
    }
}
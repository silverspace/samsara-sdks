/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;

public class SensorHistoryResponseBuilder {
    //the instance to build
    private SensorHistoryResponse sensorHistoryResponse;

    /**
     * Default constructor to initialize the instance
     */
    public SensorHistoryResponseBuilder() {
        sensorHistoryResponse = new SensorHistoryResponse();
    }

    public SensorHistoryResponseBuilder results(List<Result> results) {
        sensorHistoryResponse.setResults(results);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public SensorHistoryResponse build() {
        return sensorHistoryResponse;
    }
}
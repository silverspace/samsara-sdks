/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;

public class DataInputHistoryResponseBuilder {
    //the instance to build
    private DataInputHistoryResponse dataInputHistoryResponse;

    /**
     * Default constructor to initialize the instance
     */
    public DataInputHistoryResponseBuilder() {
        dataInputHistoryResponse = new DataInputHistoryResponse();
    }

    /**
     * The ID of this data input
     */
    public DataInputHistoryResponseBuilder id(Long id) {
        dataInputHistoryResponse.setId(id);
        return this;
    }

    /**
     * Name of this data input
     */
    public DataInputHistoryResponseBuilder name(String name) {
        dataInputHistoryResponse.setName(name);
        return this;
    }

    /**
     * Data points from this data input
     */
    public DataInputHistoryResponseBuilder points(List<Point> points) {
        dataInputHistoryResponse.setPoints(points);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public DataInputHistoryResponse build() {
        return dataInputHistoryResponse;
    }
}
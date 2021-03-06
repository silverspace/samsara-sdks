/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;

public class AllRouteJobUpdatesBuilder {
    //the instance to build
    private AllRouteJobUpdates allRouteJobUpdates;

    /**
     * Default constructor to initialize the instance
     */
    public AllRouteJobUpdatesBuilder() {
        allRouteJobUpdates = new AllRouteJobUpdates();
    }

    public AllRouteJobUpdatesBuilder jobUpdates(List<JobUpdateObject> jobUpdates) {
        allRouteJobUpdates.setJobUpdates(jobUpdates);
        return this;
    }

    /**
     * Sequence ID of the last update returned in the response
     */
    public AllRouteJobUpdatesBuilder sequenceId(String sequenceId) {
        allRouteJobUpdates.setSequenceId(sequenceId);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public AllRouteJobUpdates build() {
        return allRouteJobUpdates;
    }
}
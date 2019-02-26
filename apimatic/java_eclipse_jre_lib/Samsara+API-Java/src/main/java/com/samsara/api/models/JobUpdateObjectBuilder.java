/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;

public class JobUpdateObjectBuilder {
    //the instance to build
    private JobUpdateObject jobUpdateObject;

    /**
     * Default constructor to initialize the instance
     */
    public JobUpdateObjectBuilder() {
        jobUpdateObject = new JobUpdateObject();
    }

    /**
     * Timestamp that this event was updated, represented as Unix milliseconds since epoch.
     */
    public JobUpdateObjectBuilder changedAtMs(Long changedAtMs) {
        jobUpdateObject.setChangedAtMs(changedAtMs);
        return this;
    }

    /**
     * ID of the Samsara job.
     */
    public JobUpdateObjectBuilder jobId(Long jobId) {
        jobUpdateObject.setJobId(jobId);
        return this;
    }

    /**
     * The current state of the dispatch job.
     */
    public JobUpdateObjectBuilder jobState(JobStatusEnum jobState) {
        jobUpdateObject.setJobState(jobState);
        return this;
    }

    /**
     * The previous state of the dispatch job.
     */
    public JobUpdateObjectBuilder prevJobState(PrevJobStatusEnum prevJobState) {
        jobUpdateObject.setPrevJobState(prevJobState);
        return this;
    }

    public JobUpdateObjectBuilder route(DispatchRoute route) {
        jobUpdateObject.setRoute(route);
        return this;
    }

    /**
     * ID of the Samsara dispatch route.
     */
    public JobUpdateObjectBuilder routeId(Long routeId) {
        jobUpdateObject.setRouteId(routeId);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public JobUpdateObject build() {
        return jobUpdateObject;
    }
}
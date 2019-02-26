/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;

public class DriversSummaryParamBuilder {
    //the instance to build
    private DriversSummaryParam driversSummaryParam;

    /**
     * Default constructor to initialize the instance
     */
    public DriversSummaryParamBuilder() {
        driversSummaryParam = new DriversSummaryParam();
    }

    /**
     * End time (ms) of queried time period.
     */
    public DriversSummaryParamBuilder endMs(long endMs) {
        driversSummaryParam.setEndMs(endMs);
        return this;
    }

    /**
     * Org ID to query.
     */
    public DriversSummaryParamBuilder orgId(long orgId) {
        driversSummaryParam.setOrgId(orgId);
        return this;
    }

    /**
     * Start time (ms) of queried time period.
     */
    public DriversSummaryParamBuilder startMs(long startMs) {
        driversSummaryParam.setStartMs(startMs);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public DriversSummaryParam build() {
        return driversSummaryParam;
    }
}
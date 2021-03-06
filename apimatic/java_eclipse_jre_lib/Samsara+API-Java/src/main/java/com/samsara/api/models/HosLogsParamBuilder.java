/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;

public class HosLogsParamBuilder {
    //the instance to build
    private HosLogsParam hosLogsParam;

    /**
     * Default constructor to initialize the instance
     */
    public HosLogsParamBuilder() {
        hosLogsParam = new HosLogsParam();
    }

    /**
     * Driver ID to query.
     */
    public HosLogsParamBuilder driverId(long driverId) {
        hosLogsParam.setDriverId(driverId);
        return this;
    }

    /**
     * End of the time range, specified in milliseconds UNIX time.
     */
    public HosLogsParamBuilder endMs(long endMs) {
        hosLogsParam.setEndMs(endMs);
        return this;
    }

    /**
     * Group ID to query.
     */
    public HosLogsParamBuilder groupId(long groupId) {
        hosLogsParam.setGroupId(groupId);
        return this;
    }

    /**
     * Beginning of the time range, specified in milliseconds UNIX time.
     */
    public HosLogsParamBuilder startMs(long startMs) {
        hosLogsParam.setStartMs(startMs);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public HosLogsParam build() {
        return hosLogsParam;
    }
}
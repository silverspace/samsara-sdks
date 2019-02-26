/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;

public class GetVehicleStatsResponseBuilder {
    //the instance to build
    private GetVehicleStatsResponse getVehicleStatsResponse;

    /**
     * Default constructor to initialize the instance
     */
    public GetVehicleStatsResponseBuilder() {
        getVehicleStatsResponse = new GetVehicleStatsResponse();
    }

    public GetVehicleStatsResponseBuilder pagination(Pagination pagination) {
        getVehicleStatsResponse.setPagination(pagination);
        return this;
    }

    public GetVehicleStatsResponseBuilder vehicleStats(List<VehicleStat> vehicleStats) {
        getVehicleStatsResponse.setVehicleStats(vehicleStats);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetVehicleStatsResponse build() {
        return getVehicleStatsResponse;
    }
}
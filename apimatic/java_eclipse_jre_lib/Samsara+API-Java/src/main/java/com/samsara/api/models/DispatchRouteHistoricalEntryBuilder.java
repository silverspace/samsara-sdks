/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;

public class DispatchRouteHistoricalEntryBuilder {
    //the instance to build
    private DispatchRouteHistoricalEntry dispatchRouteHistoricalEntry;

    /**
     * Default constructor to initialize the instance
     */
    public DispatchRouteHistoricalEntryBuilder() {
        dispatchRouteHistoricalEntry = new DispatchRouteHistoricalEntry();
    }

    /**
     * Timestamp that the route was updated, represented as Unix milliseconds since epoch.
     */
    public DispatchRouteHistoricalEntryBuilder changedAtMs(Long changedAtMs) {
        dispatchRouteHistoricalEntry.setChangedAtMs(changedAtMs);
        return this;
    }

    public DispatchRouteHistoricalEntryBuilder route(DispatchRoute route) {
        dispatchRouteHistoricalEntry.setRoute(route);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public DispatchRouteHistoricalEntry build() {
        return dispatchRouteHistoricalEntry;
    }
}
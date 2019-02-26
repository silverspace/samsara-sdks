/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;

public class DispatchRouteHistoryBuilder {
    //the instance to build
    private DispatchRouteHistory dispatchRouteHistory;

    /**
     * Default constructor to initialize the instance
     */
    public DispatchRouteHistoryBuilder() {
        dispatchRouteHistory = new DispatchRouteHistory();
    }

    /**
     * History of the route's state changes.
     */
    public DispatchRouteHistoryBuilder history(List<DispatchRouteHistoricalEntry> history) {
        dispatchRouteHistory.setHistory(history);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public DispatchRouteHistory build() {
        return dispatchRouteHistory;
    }
}
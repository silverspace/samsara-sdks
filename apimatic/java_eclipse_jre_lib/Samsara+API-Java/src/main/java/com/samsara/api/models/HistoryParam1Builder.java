/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;

public class HistoryParam1Builder {
    //the instance to build
    private HistoryParam1 historyParam1;

    /**
     * Default constructor to initialize the instance
     */
    public HistoryParam1Builder() {
        historyParam1 = new HistoryParam1();
    }

    /**
     * End of the time range, specified in milliseconds UNIX time.
     */
    public HistoryParam1Builder endMs(long endMs) {
        historyParam1.setEndMs(endMs);
        return this;
    }

    public HistoryParam1Builder fillMissing(FillMissingEnum fillMissing) {
        historyParam1.setFillMissing(fillMissing);
        return this;
    }

    /**
     * Group ID to query.
     */
    public HistoryParam1Builder groupId(long groupId) {
        historyParam1.setGroupId(groupId);
        return this;
    }

    public HistoryParam1Builder series(List<Series1> series) {
        historyParam1.setSeries(series);
        return this;
    }

    /**
     * Beginning of the time range, specified in milliseconds UNIX time.
     */
    public HistoryParam1Builder startMs(long startMs) {
        historyParam1.setStartMs(startMs);
        return this;
    }

    /**
     * Time resolution for which data should be returned, in milliseconds. Specifying 3600000 will return data at hour intervals.
     */
    public HistoryParam1Builder stepMs(int stepMs) {
        historyParam1.setStepMs(stepMs);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public HistoryParam1 build() {
        return historyParam1;
    }
}
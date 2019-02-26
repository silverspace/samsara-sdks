/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;

public class Alarm1Builder {
    //the instance to build
    private Alarm1 alarm1;

    /**
     * Default constructor to initialize the instance
     */
    public Alarm1Builder() {
        alarm1 = new Alarm1();
    }

    /**
     * ID of the alarm
     */
    public Alarm1Builder alarmCode(Long alarmCode) {
        alarm1.setAlarmCode(alarmCode);
        return this;
    }

    /**
     * Description of the alarm
     */
    public Alarm1Builder description(String description) {
        alarm1.setDescription(description);
        return this;
    }

    /**
     * Recommended operator action
     */
    public Alarm1Builder operatorAction(String operatorAction) {
        alarm1.setOperatorAction(operatorAction);
        return this;
    }

    /**
     * Severity of the alarm: 1: OK to run, 2: Check as specified, 3: Take immediate action
     */
    public Alarm1Builder severity(Long severity) {
        alarm1.setSeverity(severity);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Alarm1 build() {
        return alarm1;
    }
}
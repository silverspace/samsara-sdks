/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class DriverDailyLogResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = -125289422084095140L;
    private List<Day> days;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("days")
    public List<Day> getDays ( ) { 
        return this.days;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("days")
    public void setDays (List<Day> value) { 
        this.days = value;
    }
 
}

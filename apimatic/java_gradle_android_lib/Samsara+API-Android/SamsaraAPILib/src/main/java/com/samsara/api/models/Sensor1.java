/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Sensor1 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = -2363219811440547413L;
    private Boolean doorClosed;
    private Long id;
    private String name;
    /** GETTER
     * Flag indicating whether the current door is closed or open.
     */
    @JsonGetter("doorClosed")
    public Boolean getDoorClosed ( ) { 
        return this.doorClosed;
    }
    
    /** SETTER
     * Flag indicating whether the current door is closed or open.
     */
    @JsonSetter("doorClosed")
    public void setDoorClosed (Boolean value) { 
        this.doorClosed = value;
        notifyObservers(this.doorClosed);
    }
 
    /** GETTER
     * ID of the sensor.
     */
    @JsonGetter("id")
    public Long getId ( ) { 
        return this.id;
    }
    
    /** SETTER
     * ID of the sensor.
     */
    @JsonSetter("id")
    public void setId (Long value) { 
        this.id = value;
        notifyObservers(this.id);
    }
 
    /** GETTER
     * Name of the sensor.
     */
    @JsonGetter("name")
    public String getName ( ) { 
        return this.name;
    }
    
    /** SETTER
     * Name of the sensor.
     */
    @JsonSetter("name")
    public void setName (String value) { 
        this.name = value;
        notifyObservers(this.name);
    }
 
}

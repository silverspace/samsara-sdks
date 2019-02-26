/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class SensorParam 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = -4675019275275652565L;
    private long groupId;
    private List<Long> sensors;
    /** GETTER
     * Group ID to query.
     */
    @JsonGetter("groupId")
    public long getGroupId ( ) { 
        return this.groupId;
    }
    
    /** SETTER
     * Group ID to query.
     */
    @JsonSetter("groupId")
    public void setGroupId (long value) { 
        this.groupId = value;
        notifyObservers(this.groupId);
    }
 
    /** GETTER
     * List of sensor IDs to query.
     */
    @JsonGetter("sensors")
    public List<Long> getSensors ( ) { 
        return this.sensors;
    }
    
    /** SETTER
     * List of sensor IDs to query.
     */
    @JsonSetter("sensors")
    public void setSensors (List<Long> value) { 
        this.sensors = value;
        notifyObservers(this.sensors);
    }
 
}
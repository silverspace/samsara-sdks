/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Alarm 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = -648297415238345523L;
    private List<Alarm1> alarms;
    private Long changedAtMs;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("alarms")
    public List<Alarm1> getAlarms ( ) { 
        return this.alarms;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("alarms")
    public void setAlarms (List<Alarm1> value) { 
        this.alarms = value;
        notifyObservers(this.alarms);
    }
 
    /** GETTER
     * Timestamp when the alarms were reported, in Unix milliseconds since epoch
     */
    @JsonGetter("changedAtMs")
    public Long getChangedAtMs ( ) { 
        return this.changedAtMs;
    }
    
    /** SETTER
     * Timestamp when the alarms were reported, in Unix milliseconds since epoch
     */
    @JsonSetter("changedAtMs")
    public void setChangedAtMs (Long value) { 
        this.changedAtMs = value;
        notifyObservers(this.changedAtMs);
    }
 
}

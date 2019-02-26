/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class EngineHour 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 2050995516805713190L;
    private Long changedAtMs;
    private Long engineHours;
    /** GETTER
     * Timestamp in Unix milliseconds since epoch.
     */
    @JsonGetter("changedAtMs")
    public Long getChangedAtMs ( ) { 
        return this.changedAtMs;
    }
    
    /** SETTER
     * Timestamp in Unix milliseconds since epoch.
     */
    @JsonSetter("changedAtMs")
    public void setChangedAtMs (Long value) { 
        this.changedAtMs = value;
        notifyObservers(this.changedAtMs);
    }
 
    /** GETTER
     * Engine hours of the reefer.
     */
    @JsonGetter("engineHours")
    public Long getEngineHours ( ) { 
        return this.engineHours;
    }
    
    /** SETTER
     * Engine hours of the reefer.
     */
    @JsonSetter("engineHours")
    public void setEngineHours (Long value) { 
        this.engineHours = value;
        notifyObservers(this.engineHours);
    }
 
}

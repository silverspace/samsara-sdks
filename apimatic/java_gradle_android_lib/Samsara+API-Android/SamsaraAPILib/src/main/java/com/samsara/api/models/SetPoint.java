/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class SetPoint 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = -3389401926946805373L;
    private Long changedAtMs;
    private Long tempInMilliC;
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
     * Set point temperature in millidegree Celsius.
     */
    @JsonGetter("tempInMilliC")
    public Long getTempInMilliC ( ) { 
        return this.tempInMilliC;
    }
    
    /** SETTER
     * Set point temperature in millidegree Celsius.
     */
    @JsonSetter("tempInMilliC")
    public void setTempInMilliC (Long value) { 
        this.tempInMilliC = value;
        notifyObservers(this.tempInMilliC);
    }
 
}

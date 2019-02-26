/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Sensor4 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = -8734035508920401377L;
    private Integer ambientTemperature;
    private Long id;
    private String name;
    private Integer probeTemperature;
    /** GETTER
     * Currently reported ambient temperature in millidegrees celsius.
     */
    @JsonGetter("ambientTemperature")
    public Integer getAmbientTemperature ( ) { 
        return this.ambientTemperature;
    }
    
    /** SETTER
     * Currently reported ambient temperature in millidegrees celsius.
     */
    @JsonSetter("ambientTemperature")
    public void setAmbientTemperature (Integer value) { 
        this.ambientTemperature = value;
        notifyObservers(this.ambientTemperature);
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
 
    /** GETTER
     * Currently reported probe temperature in millidegrees celsius. If no probe is connected, this parameter will not be reported.
     */
    @JsonGetter("probeTemperature")
    public Integer getProbeTemperature ( ) { 
        return this.probeTemperature;
    }
    
    /** SETTER
     * Currently reported probe temperature in millidegrees celsius. If no probe is connected, this parameter will not be reported.
     */
    @JsonSetter("probeTemperature")
    public void setProbeTemperature (Integer value) { 
        this.probeTemperature = value;
        notifyObservers(this.probeTemperature);
    }
 
}
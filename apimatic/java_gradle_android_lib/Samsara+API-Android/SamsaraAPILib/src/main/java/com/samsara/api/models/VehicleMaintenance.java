/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class VehicleMaintenance 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = -795320077648213607L;
    private long id;
    private J1939 j1939;
    private Passenger passenger;
    /** GETTER
     * ID of the vehicle.
     */
    @JsonGetter("id")
    public long getId ( ) { 
        return this.id;
    }
    
    /** SETTER
     * ID of the vehicle.
     */
    @JsonSetter("id")
    public void setId (long value) { 
        this.id = value;
        notifyObservers(this.id);
    }
 
    /** GETTER
     * J1939 based data. Null if no data is available.
     */
    @JsonGetter("j1939")
    public J1939 getJ1939 ( ) { 
        return this.j1939;
    }
    
    /** SETTER
     * J1939 based data. Null if no data is available.
     */
    @JsonSetter("j1939")
    public void setJ1939 (J1939 value) { 
        this.j1939 = value;
        notifyObservers(this.j1939);
    }
 
    /** GETTER
     * Passenger vehicle data. Null if no data is available.
     */
    @JsonGetter("passenger")
    public Passenger getPassenger ( ) { 
        return this.passenger;
    }
    
    /** SETTER
     * Passenger vehicle data. Null if no data is available.
     */
    @JsonSetter("passenger")
    public void setPassenger (Passenger value) { 
        this.passenger = value;
        notifyObservers(this.passenger);
    }
 
}
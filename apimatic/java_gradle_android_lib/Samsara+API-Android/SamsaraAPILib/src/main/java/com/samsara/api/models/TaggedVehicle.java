/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class TaggedVehicle 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = -8101843252257602696L;
    private long id;
    private String name;
    /** GETTER
     * The ID of the Vehicle being tagged.
     */
    @JsonGetter("id")
    public long getId ( ) { 
        return this.id;
    }
    
    /** SETTER
     * The ID of the Vehicle being tagged.
     */
    @JsonSetter("id")
    public void setId (long value) { 
        this.id = value;
        notifyObservers(this.id);
    }
 
    /** GETTER
     * Name of the Vehicle being tagged.
     */
    @JsonGetter("name")
    public String getName ( ) { 
        return this.name;
    }
    
    /** SETTER
     * Name of the Vehicle being tagged.
     */
    @JsonSetter("name")
    public void setName (String value) { 
        this.name = value;
        notifyObservers(this.name);
    }
 
}

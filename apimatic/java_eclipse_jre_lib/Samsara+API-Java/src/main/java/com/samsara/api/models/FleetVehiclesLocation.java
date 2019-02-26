/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class FleetVehiclesLocation 
        implements java.io.Serializable {
    private static final long serialVersionUID = -7709308699926029115L;
    private Long id;
    private List<FleetVehicleLocation> locations;
    private String name;
    /** GETTER
     * ID of the vehicle.
     */
    @JsonGetter("id")
    public Long getId ( ) { 
        return this.id;
    }
    
    /** SETTER
     * ID of the vehicle.
     */
    @JsonSetter("id")
    public void setId (Long value) { 
        this.id = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("locations")
    public List<FleetVehicleLocation> getLocations ( ) { 
        return this.locations;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("locations")
    public void setLocations (List<FleetVehicleLocation> value) { 
        this.locations = value;
    }
 
    /** GETTER
     * Name of the vehicle.
     */
    @JsonGetter("name")
    public String getName ( ) { 
        return this.name;
    }
    
    /** SETTER
     * Name of the vehicle.
     */
    @JsonSetter("name")
    public void setName (String value) { 
        this.name = value;
    }
 
}

/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class VehicleUpdateParam 
        implements java.io.Serializable {
    private static final long serialVersionUID = -1439070164305814169L;
    private long groupId;
    private List<Vehicle> vehicles;
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
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("vehicles")
    public List<Vehicle> getVehicles ( ) { 
        return this.vehicles;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("vehicles")
    public void setVehicles (List<Vehicle> value) { 
        this.vehicles = value;
    }
 
}
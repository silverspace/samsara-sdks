/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class GetVehicleStatsResponse 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 5337347807117742997L;
    private Pagination pagination;
    private List<VehicleStat> vehicleStats;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("pagination")
    public Pagination getPagination ( ) { 
        return this.pagination;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("pagination")
    public void setPagination (Pagination value) { 
        this.pagination = value;
        notifyObservers(this.pagination);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("vehicleStats")
    public List<VehicleStat> getVehicleStats ( ) { 
        return this.vehicleStats;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("vehicleStats")
    public void setVehicleStats (List<VehicleStat> value) { 
        this.vehicleStats = value;
        notifyObservers(this.vehicleStats);
    }
 
}

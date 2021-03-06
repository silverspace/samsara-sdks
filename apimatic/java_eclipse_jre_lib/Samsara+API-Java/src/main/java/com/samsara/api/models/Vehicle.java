/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Vehicle 
        implements java.io.Serializable {
    private static final long serialVersionUID = -2587888950816664759L;
    private Long engineHours;
    private Double fuelLevelPercent;
    private long id;
    private String name;
    private String note;
    private Long odometerMeters;
    private String vin;
    /** GETTER
     * Total engine hours for the vehicle.
     */
    @JsonGetter("engineHours")
    public Long getEngineHours ( ) { 
        return this.engineHours;
    }
    
    /** SETTER
     * Total engine hours for the vehicle.
     */
    @JsonSetter("engineHours")
    public void setEngineHours (Long value) { 
        this.engineHours = value;
    }
 
    /** GETTER
     * The fuel level of the vehicle as a percentage. (0.0 to 1.0)
     */
    @JsonGetter("fuelLevelPercent")
    public Double getFuelLevelPercent ( ) { 
        return this.fuelLevelPercent;
    }
    
    /** SETTER
     * The fuel level of the vehicle as a percentage. (0.0 to 1.0)
     */
    @JsonSetter("fuelLevelPercent")
    public void setFuelLevelPercent (Double value) { 
        this.fuelLevelPercent = value;
    }
 
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
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("note")
    public String getNote ( ) { 
        return this.note;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("note")
    public void setNote (String value) { 
        this.note = value;
    }
 
    /** GETTER
     * The number of meters reported by the odometer.
     */
    @JsonGetter("odometerMeters")
    public Long getOdometerMeters ( ) { 
        return this.odometerMeters;
    }
    
    /** SETTER
     * The number of meters reported by the odometer.
     */
    @JsonSetter("odometerMeters")
    public void setOdometerMeters (Long value) { 
        this.odometerMeters = value;
    }
 
    /** GETTER
     * Vehicle Identification Number.
     */
    @JsonGetter("vin")
    public String getVin ( ) { 
        return this.vin;
    }
    
    /** SETTER
     * Vehicle Identification Number.
     */
    @JsonSetter("vin")
    public void setVin (String value) { 
        this.vin = value;
    }
 
}

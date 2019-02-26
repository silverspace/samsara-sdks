/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class AssetLocationResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 679770341707027493L;
    private Double latitude;
    private String location;
    private Double longitude;
    private Double speedMilesPerHour;
    private Double time;
    /** GETTER
     * The latitude of the location in degrees.
     */
    @JsonGetter("latitude")
    public Double getLatitude ( ) { 
        return this.latitude;
    }
    
    /** SETTER
     * The latitude of the location in degrees.
     */
    @JsonSetter("latitude")
    public void setLatitude (Double value) { 
        this.latitude = value;
    }
 
    /** GETTER
     * The best effort (street,city,state) for the latitude and longitude.
     */
    @JsonGetter("location")
    public String getLocation ( ) { 
        return this.location;
    }
    
    /** SETTER
     * The best effort (street,city,state) for the latitude and longitude.
     */
    @JsonSetter("location")
    public void setLocation (String value) { 
        this.location = value;
    }
 
    /** GETTER
     * The longitude of the location in degrees.
     */
    @JsonGetter("longitude")
    public Double getLongitude ( ) { 
        return this.longitude;
    }
    
    /** SETTER
     * The longitude of the location in degrees.
     */
    @JsonSetter("longitude")
    public void setLongitude (Double value) { 
        this.longitude = value;
    }
 
    /** GETTER
     * The speed calculated from GPS that the asset was traveling at in miles per hour.
     */
    @JsonGetter("speedMilesPerHour")
    public Double getSpeedMilesPerHour ( ) { 
        return this.speedMilesPerHour;
    }
    
    /** SETTER
     * The speed calculated from GPS that the asset was traveling at in miles per hour.
     */
    @JsonSetter("speedMilesPerHour")
    public void setSpeedMilesPerHour (Double value) { 
        this.speedMilesPerHour = value;
    }
 
    /** GETTER
     * Time in Unix milliseconds since epoch when the asset was at the location.
     */
    @JsonGetter("time")
    public Double getTime ( ) { 
        return this.time;
    }
    
    /** SETTER
     * Time in Unix milliseconds since epoch when the asset was at the location.
     */
    @JsonSetter("time")
    public void setTime (Double value) { 
        this.time = value;
    }
 
}

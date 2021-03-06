/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Summary 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 3367068175308633324L;
    private Long activeMs;
    private Double distanceMiles;
    private Long driveMs;
    private Long driverId;
    private String driverName;
    private String driverUsername;
    private Long groupId;
    private Long onDutyMs;
    /** GETTER
     * Duration in milliseconds that driver was on duty or driving during the requested time range
     */
    @JsonGetter("activeMs")
    public Long getActiveMs ( ) { 
        return this.activeMs;
    }
    
    /** SETTER
     * Duration in milliseconds that driver was on duty or driving during the requested time range
     */
    @JsonSetter("activeMs")
    public void setActiveMs (Long value) { 
        this.activeMs = value;
        notifyObservers(this.activeMs);
    }
 
    /** GETTER
     * Distance driven in miles, rounded to two decimal places.
     */
    @JsonGetter("distanceMiles")
    public Double getDistanceMiles ( ) { 
        return this.distanceMiles;
    }
    
    /** SETTER
     * Distance driven in miles, rounded to two decimal places.
     */
    @JsonSetter("distanceMiles")
    public void setDistanceMiles (Double value) { 
        this.distanceMiles = value;
        notifyObservers(this.distanceMiles);
    }
 
    /** GETTER
     * Duration in milliseconds that driver was driving during the requested time range
     */
    @JsonGetter("driveMs")
    public Long getDriveMs ( ) { 
        return this.driveMs;
    }
    
    /** SETTER
     * Duration in milliseconds that driver was driving during the requested time range
     */
    @JsonSetter("driveMs")
    public void setDriveMs (Long value) { 
        this.driveMs = value;
        notifyObservers(this.driveMs);
    }
 
    /** GETTER
     * ID of the driver.
     */
    @JsonGetter("driverId")
    public Long getDriverId ( ) { 
        return this.driverId;
    }
    
    /** SETTER
     * ID of the driver.
     */
    @JsonSetter("driverId")
    public void setDriverId (Long value) { 
        this.driverId = value;
        notifyObservers(this.driverId);
    }
 
    /** GETTER
     * Name of the driver.
     */
    @JsonGetter("driverName")
    public String getDriverName ( ) { 
        return this.driverName;
    }
    
    /** SETTER
     * Name of the driver.
     */
    @JsonSetter("driverName")
    public void setDriverName (String value) { 
        this.driverName = value;
        notifyObservers(this.driverName);
    }
 
    /** GETTER
     * Username of the driver.
     */
    @JsonGetter("driverUsername")
    public String getDriverUsername ( ) { 
        return this.driverUsername;
    }
    
    /** SETTER
     * Username of the driver.
     */
    @JsonSetter("driverUsername")
    public void setDriverUsername (String value) { 
        this.driverUsername = value;
        notifyObservers(this.driverUsername);
    }
 
    /** GETTER
     * Group of the driver.
     */
    @JsonGetter("groupId")
    public Long getGroupId ( ) { 
        return this.groupId;
    }
    
    /** SETTER
     * Group of the driver.
     */
    @JsonSetter("groupId")
    public void setGroupId (Long value) { 
        this.groupId = value;
        notifyObservers(this.groupId);
    }
 
    /** GETTER
     * Duration in milliseconds that driver was on duty during the requested time range
     */
    @JsonGetter("onDutyMs")
    public Long getOnDutyMs ( ) { 
        return this.onDutyMs;
    }
    
    /** SETTER
     * Duration in milliseconds that driver was on duty during the requested time range
     */
    @JsonSetter("onDutyMs")
    public void setOnDutyMs (Long value) { 
        this.onDutyMs = value;
        notifyObservers(this.onDutyMs);
    }
 
}

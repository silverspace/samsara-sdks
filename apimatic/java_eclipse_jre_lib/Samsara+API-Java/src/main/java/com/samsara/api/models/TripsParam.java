/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class TripsParam 
        implements java.io.Serializable {
    private static final long serialVersionUID = -1914457934951377164L;
    private long endMs;
    private long groupId;
    private long startMs;
    private long vehicleId;
    /** GETTER
     * End of the time range, specified in milliseconds UNIX time.
     */
    @JsonGetter("endMs")
    public long getEndMs ( ) { 
        return this.endMs;
    }
    
    /** SETTER
     * End of the time range, specified in milliseconds UNIX time.
     */
    @JsonSetter("endMs")
    public void setEndMs (long value) { 
        this.endMs = value;
    }
 
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
     * Beginning of the time range, specified in milliseconds UNIX time. Limited to a 90 day window with respect to startMs and endMs
     */
    @JsonGetter("startMs")
    public long getStartMs ( ) { 
        return this.startMs;
    }
    
    /** SETTER
     * Beginning of the time range, specified in milliseconds UNIX time. Limited to a 90 day window with respect to startMs and endMs
     */
    @JsonSetter("startMs")
    public void setStartMs (long value) { 
        this.startMs = value;
    }
 
    /** GETTER
     * Vehicle ID to query.
     */
    @JsonGetter("vehicleId")
    public long getVehicleId ( ) { 
        return this.vehicleId;
    }
    
    /** SETTER
     * Vehicle ID to query.
     */
    @JsonSetter("vehicleId")
    public void setVehicleId (long value) { 
        this.vehicleId = value;
    }
 
}
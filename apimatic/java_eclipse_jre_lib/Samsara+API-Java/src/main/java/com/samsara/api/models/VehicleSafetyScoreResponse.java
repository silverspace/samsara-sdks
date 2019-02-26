/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class VehicleSafetyScoreResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = -4163120087990266873L;
    private Integer crashCount;
    private Integer harshAccelCount;
    private Integer harshBrakingCount;
    private List<SafetyReportHarshEvent> harshEvents;
    private Integer harshTurningCount;
    private Integer safetyScore;
    private String safetyScoreRank;
    private Integer timeOverSpeedLimitMs;
    private Integer totalDistanceDrivenMeters;
    private Integer totalHarshEventCount;
    private Integer totalTimeDrivenMs;
    private Integer vehicleId;
    /** GETTER
     * Crash event count
     */
    @JsonGetter("crashCount")
    public Integer getCrashCount ( ) { 
        return this.crashCount;
    }
    
    /** SETTER
     * Crash event count
     */
    @JsonSetter("crashCount")
    public void setCrashCount (Integer value) { 
        this.crashCount = value;
    }
 
    /** GETTER
     * Harsh acceleration event count
     */
    @JsonGetter("harshAccelCount")
    public Integer getHarshAccelCount ( ) { 
        return this.harshAccelCount;
    }
    
    /** SETTER
     * Harsh acceleration event count
     */
    @JsonSetter("harshAccelCount")
    public void setHarshAccelCount (Integer value) { 
        this.harshAccelCount = value;
    }
 
    /** GETTER
     * Harsh braking event count
     */
    @JsonGetter("harshBrakingCount")
    public Integer getHarshBrakingCount ( ) { 
        return this.harshBrakingCount;
    }
    
    /** SETTER
     * Harsh braking event count
     */
    @JsonSetter("harshBrakingCount")
    public void setHarshBrakingCount (Integer value) { 
        this.harshBrakingCount = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("harshEvents")
    public List<SafetyReportHarshEvent> getHarshEvents ( ) { 
        return this.harshEvents;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("harshEvents")
    public void setHarshEvents (List<SafetyReportHarshEvent> value) { 
        this.harshEvents = value;
    }
 
    /** GETTER
     * Harsh turning event count
     */
    @JsonGetter("harshTurningCount")
    public Integer getHarshTurningCount ( ) { 
        return this.harshTurningCount;
    }
    
    /** SETTER
     * Harsh turning event count
     */
    @JsonSetter("harshTurningCount")
    public void setHarshTurningCount (Integer value) { 
        this.harshTurningCount = value;
    }
 
    /** GETTER
     * Safety Score
     */
    @JsonGetter("safetyScore")
    public Integer getSafetyScore ( ) { 
        return this.safetyScore;
    }
    
    /** SETTER
     * Safety Score
     */
    @JsonSetter("safetyScore")
    public void setSafetyScore (Integer value) { 
        this.safetyScore = value;
    }
 
    /** GETTER
     * Safety Score Rank
     */
    @JsonGetter("safetyScoreRank")
    public String getSafetyScoreRank ( ) { 
        return this.safetyScoreRank;
    }
    
    /** SETTER
     * Safety Score Rank
     */
    @JsonSetter("safetyScoreRank")
    public void setSafetyScoreRank (String value) { 
        this.safetyScoreRank = value;
    }
 
    /** GETTER
     * Amount of time driven over the speed limit in milliseconds
     */
    @JsonGetter("timeOverSpeedLimitMs")
    public Integer getTimeOverSpeedLimitMs ( ) { 
        return this.timeOverSpeedLimitMs;
    }
    
    /** SETTER
     * Amount of time driven over the speed limit in milliseconds
     */
    @JsonSetter("timeOverSpeedLimitMs")
    public void setTimeOverSpeedLimitMs (Integer value) { 
        this.timeOverSpeedLimitMs = value;
    }
 
    /** GETTER
     * Total distance driven in meters
     */
    @JsonGetter("totalDistanceDrivenMeters")
    public Integer getTotalDistanceDrivenMeters ( ) { 
        return this.totalDistanceDrivenMeters;
    }
    
    /** SETTER
     * Total distance driven in meters
     */
    @JsonSetter("totalDistanceDrivenMeters")
    public void setTotalDistanceDrivenMeters (Integer value) { 
        this.totalDistanceDrivenMeters = value;
    }
 
    /** GETTER
     * Total harsh event count
     */
    @JsonGetter("totalHarshEventCount")
    public Integer getTotalHarshEventCount ( ) { 
        return this.totalHarshEventCount;
    }
    
    /** SETTER
     * Total harsh event count
     */
    @JsonSetter("totalHarshEventCount")
    public void setTotalHarshEventCount (Integer value) { 
        this.totalHarshEventCount = value;
    }
 
    /** GETTER
     * Amount of time driven in milliseconds
     */
    @JsonGetter("totalTimeDrivenMs")
    public Integer getTotalTimeDrivenMs ( ) { 
        return this.totalTimeDrivenMs;
    }
    
    /** SETTER
     * Amount of time driven in milliseconds
     */
    @JsonSetter("totalTimeDrivenMs")
    public void setTotalTimeDrivenMs (Integer value) { 
        this.totalTimeDrivenMs = value;
    }
 
    /** GETTER
     * Vehicle ID
     */
    @JsonGetter("vehicleId")
    public Integer getVehicleId ( ) { 
        return this.vehicleId;
    }
    
    /** SETTER
     * Vehicle ID
     */
    @JsonSetter("vehicleId")
    public void setVehicleId (Integer value) { 
        this.vehicleId = value;
    }
 
}

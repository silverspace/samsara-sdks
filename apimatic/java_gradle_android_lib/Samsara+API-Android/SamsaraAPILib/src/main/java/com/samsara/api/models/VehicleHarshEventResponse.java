/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class VehicleHarshEventResponse 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 3124716766295142615L;
    private String downloadForwardVideoUrl;
    private String downloadInwardVideoUrl;
    private String downloadTrackedInwardVideoUrl;
    private String harshEventType;
    private String incidentReportUrl;
    private Boolean isDistracted;
    private Location location;
    /** GETTER
     * URL for downloading the forward facing video
     */
    @JsonGetter("downloadForwardVideoUrl")
    public String getDownloadForwardVideoUrl ( ) { 
        return this.downloadForwardVideoUrl;
    }
    
    /** SETTER
     * URL for downloading the forward facing video
     */
    @JsonSetter("downloadForwardVideoUrl")
    public void setDownloadForwardVideoUrl (String value) { 
        this.downloadForwardVideoUrl = value;
        notifyObservers(this.downloadForwardVideoUrl);
    }
 
    /** GETTER
     * URL for downloading the inward facing video
     */
    @JsonGetter("downloadInwardVideoUrl")
    public String getDownloadInwardVideoUrl ( ) { 
        return this.downloadInwardVideoUrl;
    }
    
    /** SETTER
     * URL for downloading the inward facing video
     */
    @JsonSetter("downloadInwardVideoUrl")
    public void setDownloadInwardVideoUrl (String value) { 
        this.downloadInwardVideoUrl = value;
        notifyObservers(this.downloadInwardVideoUrl);
    }
 
    /** GETTER
     * URL for downloading the tracked inward facing video
     */
    @JsonGetter("downloadTrackedInwardVideoUrl")
    public String getDownloadTrackedInwardVideoUrl ( ) { 
        return this.downloadTrackedInwardVideoUrl;
    }
    
    /** SETTER
     * URL for downloading the tracked inward facing video
     */
    @JsonSetter("downloadTrackedInwardVideoUrl")
    public void setDownloadTrackedInwardVideoUrl (String value) { 
        this.downloadTrackedInwardVideoUrl = value;
        notifyObservers(this.downloadTrackedInwardVideoUrl);
    }
 
    /** GETTER
     * Type of the harsh event. One of: [Crash, Harsh Acceleration, Harsh Braking, Harsh Turn, ROP Engine, ROP Brake, YC Engine, YC Brake, Harsh Event]
     */
    @JsonGetter("harshEventType")
    public String getHarshEventType ( ) { 
        return this.harshEventType;
    }
    
    /** SETTER
     * Type of the harsh event. One of: [Crash, Harsh Acceleration, Harsh Braking, Harsh Turn, ROP Engine, ROP Brake, YC Engine, YC Brake, Harsh Event]
     */
    @JsonSetter("harshEventType")
    public void setHarshEventType (String value) { 
        this.harshEventType = value;
        notifyObservers(this.harshEventType);
    }
 
    /** GETTER
     * URL of the associated incident report page
     */
    @JsonGetter("incidentReportUrl")
    public String getIncidentReportUrl ( ) { 
        return this.incidentReportUrl;
    }
    
    /** SETTER
     * URL of the associated incident report page
     */
    @JsonSetter("incidentReportUrl")
    public void setIncidentReportUrl (String value) { 
        this.incidentReportUrl = value;
        notifyObservers(this.incidentReportUrl);
    }
 
    /** GETTER
     * Whether the driver was deemed distracted during this harsh event
     */
    @JsonGetter("isDistracted")
    public Boolean getIsDistracted ( ) { 
        return this.isDistracted;
    }
    
    /** SETTER
     * Whether the driver was deemed distracted during this harsh event
     */
    @JsonSetter("isDistracted")
    public void setIsDistracted (Boolean value) { 
        this.isDistracted = value;
        notifyObservers(this.isDistracted);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("location")
    public Location getLocation ( ) { 
        return this.location;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("location")
    public void setLocation (Location value) { 
        this.location = value;
        notifyObservers(this.location);
    }
 
}

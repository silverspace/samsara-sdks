/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class DvirBase 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = -2643159695369420280L;
    private AuthorSignature authorSignature;
    private Boolean defectsCorrected;
    private Boolean defectsNeedNotBeCorrected;
    private Long id;
    private String inspectionType;
    private String mechanicNotes;
    private MechanicOrAgentSignature mechanicOrAgentSignature;
    private NextDriverSignature nextDriverSignature;
    private Long odometerMiles;
    private Long timeMs;
    private List<TrailerDefect> trailerDefects;
    private Integer trailerId;
    private String trailerName;
    private Vehicle2 vehicle;
    private String vehicleCondition;
    private List<VehicleDefect> vehicleDefects;
    /** GETTER
     * The authors signature for the DVIR.
     */
    @JsonGetter("authorSignature")
    public AuthorSignature getAuthorSignature ( ) { 
        return this.authorSignature;
    }
    
    /** SETTER
     * The authors signature for the DVIR.
     */
    @JsonSetter("authorSignature")
    public void setAuthorSignature (AuthorSignature value) { 
        this.authorSignature = value;
        notifyObservers(this.authorSignature);
    }
 
    /** GETTER
     * Signifies if the defects on the vehicle corrected after the DVIR is done.
     */
    @JsonGetter("defectsCorrected")
    public Boolean getDefectsCorrected ( ) { 
        return this.defectsCorrected;
    }
    
    /** SETTER
     * Signifies if the defects on the vehicle corrected after the DVIR is done.
     */
    @JsonSetter("defectsCorrected")
    public void setDefectsCorrected (Boolean value) { 
        this.defectsCorrected = value;
        notifyObservers(this.defectsCorrected);
    }
 
    /** GETTER
     * Signifies if the defects on this vehicle can be ignored.
     */
    @JsonGetter("defectsNeedNotBeCorrected")
    public Boolean getDefectsNeedNotBeCorrected ( ) { 
        return this.defectsNeedNotBeCorrected;
    }
    
    /** SETTER
     * Signifies if the defects on this vehicle can be ignored.
     */
    @JsonSetter("defectsNeedNotBeCorrected")
    public void setDefectsNeedNotBeCorrected (Boolean value) { 
        this.defectsNeedNotBeCorrected = value;
        notifyObservers(this.defectsNeedNotBeCorrected);
    }
 
    /** GETTER
     * The id of this DVIR record.
     */
    @JsonGetter("id")
    public Long getId ( ) { 
        return this.id;
    }
    
    /** SETTER
     * The id of this DVIR record.
     */
    @JsonSetter("id")
    public void setId (Long value) { 
        this.id = value;
        notifyObservers(this.id);
    }
 
    /** GETTER
     * Inspection type of the DVIR.
     */
    @JsonGetter("inspectionType")
    public String getInspectionType ( ) { 
        return this.inspectionType;
    }
    
    /** SETTER
     * Inspection type of the DVIR.
     */
    @JsonSetter("inspectionType")
    public void setInspectionType (String value) { 
        this.inspectionType = value;
        notifyObservers(this.inspectionType);
    }
 
    /** GETTER
     * The mechanics notes on the DVIR.
     */
    @JsonGetter("mechanicNotes")
    public String getMechanicNotes ( ) { 
        return this.mechanicNotes;
    }
    
    /** SETTER
     * The mechanics notes on the DVIR.
     */
    @JsonSetter("mechanicNotes")
    public void setMechanicNotes (String value) { 
        this.mechanicNotes = value;
        notifyObservers(this.mechanicNotes);
    }
 
    /** GETTER
     * The mechanic's or agent's signature for the DVIR.
     */
    @JsonGetter("mechanicOrAgentSignature")
    public MechanicOrAgentSignature getMechanicOrAgentSignature ( ) { 
        return this.mechanicOrAgentSignature;
    }
    
    /** SETTER
     * The mechanic's or agent's signature for the DVIR.
     */
    @JsonSetter("mechanicOrAgentSignature")
    public void setMechanicOrAgentSignature (MechanicOrAgentSignature value) { 
        this.mechanicOrAgentSignature = value;
        notifyObservers(this.mechanicOrAgentSignature);
    }
 
    /** GETTER
     * The next driver signature for the DVIR.
     */
    @JsonGetter("nextDriverSignature")
    public NextDriverSignature getNextDriverSignature ( ) { 
        return this.nextDriverSignature;
    }
    
    /** SETTER
     * The next driver signature for the DVIR.
     */
    @JsonSetter("nextDriverSignature")
    public void setNextDriverSignature (NextDriverSignature value) { 
        this.nextDriverSignature = value;
        notifyObservers(this.nextDriverSignature);
    }
 
    /** GETTER
     * The odometer reading in miles for the vehicle when the DVIR was done.
     */
    @JsonGetter("odometerMiles")
    public Long getOdometerMiles ( ) { 
        return this.odometerMiles;
    }
    
    /** SETTER
     * The odometer reading in miles for the vehicle when the DVIR was done.
     */
    @JsonSetter("odometerMiles")
    public void setOdometerMiles (Long value) { 
        this.odometerMiles = value;
        notifyObservers(this.odometerMiles);
    }
 
    /** GETTER
     * Timestamp of this DVIR in UNIX milliseconds.
     */
    @JsonGetter("timeMs")
    public Long getTimeMs ( ) { 
        return this.timeMs;
    }
    
    /** SETTER
     * Timestamp of this DVIR in UNIX milliseconds.
     */
    @JsonSetter("timeMs")
    public void setTimeMs (Long value) { 
        this.timeMs = value;
        notifyObservers(this.timeMs);
    }
 
    /** GETTER
     * Defects registered for the trailer which was part of the DVIR.
     */
    @JsonGetter("trailerDefects")
    public List<TrailerDefect> getTrailerDefects ( ) { 
        return this.trailerDefects;
    }
    
    /** SETTER
     * Defects registered for the trailer which was part of the DVIR.
     */
    @JsonSetter("trailerDefects")
    public void setTrailerDefects (List<TrailerDefect> value) { 
        this.trailerDefects = value;
        notifyObservers(this.trailerDefects);
    }
 
    /** GETTER
     * The id of the trailer which was part of the DVIR.
     */
    @JsonGetter("trailerId")
    public Integer getTrailerId ( ) { 
        return this.trailerId;
    }
    
    /** SETTER
     * The id of the trailer which was part of the DVIR.
     */
    @JsonSetter("trailerId")
    public void setTrailerId (Integer value) { 
        this.trailerId = value;
        notifyObservers(this.trailerId);
    }
 
    /** GETTER
     * The name of the trailer which was part of the DVIR.
     */
    @JsonGetter("trailerName")
    public String getTrailerName ( ) { 
        return this.trailerName;
    }
    
    /** SETTER
     * The name of the trailer which was part of the DVIR.
     */
    @JsonSetter("trailerName")
    public void setTrailerName (String value) { 
        this.trailerName = value;
        notifyObservers(this.trailerName);
    }
 
    /** GETTER
     * The vehicle on which DVIR was done.
     */
    @JsonGetter("vehicle")
    public Vehicle2 getVehicle ( ) { 
        return this.vehicle;
    }
    
    /** SETTER
     * The vehicle on which DVIR was done.
     */
    @JsonSetter("vehicle")
    public void setVehicle (Vehicle2 value) { 
        this.vehicle = value;
        notifyObservers(this.vehicle);
    }
 
    /** GETTER
     * The condition of vechile on which DVIR was done.
     */
    @JsonGetter("vehicleCondition")
    public String getVehicleCondition ( ) { 
        return this.vehicleCondition;
    }
    
    /** SETTER
     * The condition of vechile on which DVIR was done.
     */
    @JsonSetter("vehicleCondition")
    public void setVehicleCondition (String value) { 
        this.vehicleCondition = value;
        notifyObservers(this.vehicleCondition);
    }
 
    /** GETTER
     * Defects registered for the vehicle which was part of the DVIR.
     */
    @JsonGetter("vehicleDefects")
    public List<VehicleDefect> getVehicleDefects ( ) { 
        return this.vehicleDefects;
    }
    
    /** SETTER
     * Defects registered for the vehicle which was part of the DVIR.
     */
    @JsonSetter("vehicleDefects")
    public void setVehicleDefects (List<VehicleDefect> value) { 
        this.vehicleDefects = value;
        notifyObservers(this.vehicleDefects);
    }
 
}

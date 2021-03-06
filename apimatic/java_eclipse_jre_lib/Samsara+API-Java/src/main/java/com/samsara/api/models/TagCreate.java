/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class TagCreate 
        implements java.io.Serializable {
    private static final long serialVersionUID = 2604345927754851797L;
    private List<TaggedAssetBase> assets;
    private List<TaggedDriverBase> drivers;
    private List<TaggedMachineBase> machines;
    private String name;
    private Long parentTagId;
    private List<TaggedSensorBase> sensors;
    private List<TaggedVehicleBase> vehicles;
    /** GETTER
     * The assets that belong to this tag.
     */
    @JsonGetter("assets")
    public List<TaggedAssetBase> getAssets ( ) { 
        return this.assets;
    }
    
    /** SETTER
     * The assets that belong to this tag.
     */
    @JsonSetter("assets")
    public void setAssets (List<TaggedAssetBase> value) { 
        this.assets = value;
    }
 
    /** GETTER
     * The drivers that belong to this tag.
     */
    @JsonGetter("drivers")
    public List<TaggedDriverBase> getDrivers ( ) { 
        return this.drivers;
    }
    
    /** SETTER
     * The drivers that belong to this tag.
     */
    @JsonSetter("drivers")
    public void setDrivers (List<TaggedDriverBase> value) { 
        this.drivers = value;
    }
 
    /** GETTER
     * The machines that belong to this tag.
     */
    @JsonGetter("machines")
    public List<TaggedMachineBase> getMachines ( ) { 
        return this.machines;
    }
    
    /** SETTER
     * The machines that belong to this tag.
     */
    @JsonSetter("machines")
    public void setMachines (List<TaggedMachineBase> value) { 
        this.machines = value;
    }
 
    /** GETTER
     * Name of this tag.
     */
    @JsonGetter("name")
    public String getName ( ) { 
        return this.name;
    }
    
    /** SETTER
     * Name of this tag.
     */
    @JsonSetter("name")
    public void setName (String value) { 
        this.name = value;
    }
 
    /** GETTER
     * If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag's parent tag.
     */
    @JsonGetter("parentTagId")
    public Long getParentTagId ( ) { 
        return this.parentTagId;
    }
    
    /** SETTER
     * If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag's parent tag.
     */
    @JsonSetter("parentTagId")
    public void setParentTagId (Long value) { 
        this.parentTagId = value;
    }
 
    /** GETTER
     * The sensors that belong to this tag.
     */
    @JsonGetter("sensors")
    public List<TaggedSensorBase> getSensors ( ) { 
        return this.sensors;
    }
    
    /** SETTER
     * The sensors that belong to this tag.
     */
    @JsonSetter("sensors")
    public void setSensors (List<TaggedSensorBase> value) { 
        this.sensors = value;
    }
 
    /** GETTER
     * The vehicles that belong to this tag.
     */
    @JsonGetter("vehicles")
    public List<TaggedVehicleBase> getVehicles ( ) { 
        return this.vehicles;
    }
    
    /** SETTER
     * The vehicles that belong to this tag.
     */
    @JsonSetter("vehicles")
    public void setVehicles (List<TaggedVehicleBase> value) { 
        this.vehicles = value;
    }
 
}

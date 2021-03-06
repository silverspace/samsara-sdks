/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Tag 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 6550961090407428452L;
    private List<TaggedAddress> addresses;
    private List<TaggedAsset> assets;
    private List<TaggedDriver> drivers;
    private Long groupId;
    private long id;
    private List<TaggedMachine> machines;
    private String name;
    private Long parentTagId;
    private List<TaggedSensor> sensors;
    private List<TaggedVehicle> vehicles;
    /** GETTER
     * The addresses that belong to this tag.
     */
    @JsonGetter("addresses")
    public List<TaggedAddress> getAddresses ( ) { 
        return this.addresses;
    }
    
    /** SETTER
     * The addresses that belong to this tag.
     */
    @JsonSetter("addresses")
    public void setAddresses (List<TaggedAddress> value) { 
        this.addresses = value;
        notifyObservers(this.addresses);
    }
 
    /** GETTER
     * The assets that belong to this tag.
     */
    @JsonGetter("assets")
    public List<TaggedAsset> getAssets ( ) { 
        return this.assets;
    }
    
    /** SETTER
     * The assets that belong to this tag.
     */
    @JsonSetter("assets")
    public void setAssets (List<TaggedAsset> value) { 
        this.assets = value;
        notifyObservers(this.assets);
    }
 
    /** GETTER
     * The drivers that belong to this tag.
     */
    @JsonGetter("drivers")
    public List<TaggedDriver> getDrivers ( ) { 
        return this.drivers;
    }
    
    /** SETTER
     * The drivers that belong to this tag.
     */
    @JsonSetter("drivers")
    public void setDrivers (List<TaggedDriver> value) { 
        this.drivers = value;
        notifyObservers(this.drivers);
    }
 
    /** GETTER
     * The GroupID that this tag belongs to.
     */
    @JsonGetter("groupId")
    public Long getGroupId ( ) { 
        return this.groupId;
    }
    
    /** SETTER
     * The GroupID that this tag belongs to.
     */
    @JsonSetter("groupId")
    public void setGroupId (Long value) { 
        this.groupId = value;
        notifyObservers(this.groupId);
    }
 
    /** GETTER
     * The ID of this tag.
     */
    @JsonGetter("id")
    public long getId ( ) { 
        return this.id;
    }
    
    /** SETTER
     * The ID of this tag.
     */
    @JsonSetter("id")
    public void setId (long value) { 
        this.id = value;
        notifyObservers(this.id);
    }
 
    /** GETTER
     * The machines that belong to this tag.
     */
    @JsonGetter("machines")
    public List<TaggedMachine> getMachines ( ) { 
        return this.machines;
    }
    
    /** SETTER
     * The machines that belong to this tag.
     */
    @JsonSetter("machines")
    public void setMachines (List<TaggedMachine> value) { 
        this.machines = value;
        notifyObservers(this.machines);
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
        notifyObservers(this.name);
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
        notifyObservers(this.parentTagId);
    }
 
    /** GETTER
     * The sensors that belong to this tag.
     */
    @JsonGetter("sensors")
    public List<TaggedSensor> getSensors ( ) { 
        return this.sensors;
    }
    
    /** SETTER
     * The sensors that belong to this tag.
     */
    @JsonSetter("sensors")
    public void setSensors (List<TaggedSensor> value) { 
        this.sensors = value;
        notifyObservers(this.sensors);
    }
 
    /** GETTER
     * The vehicles that belong to this tag.
     */
    @JsonGetter("vehicles")
    public List<TaggedVehicle> getVehicles ( ) { 
        return this.vehicles;
    }
    
    /** SETTER
     * The vehicles that belong to this tag.
     */
    @JsonSetter("vehicles")
    public void setVehicles (List<TaggedVehicle> value) { 
        this.vehicles = value;
        notifyObservers(this.vehicles);
    }
 
}

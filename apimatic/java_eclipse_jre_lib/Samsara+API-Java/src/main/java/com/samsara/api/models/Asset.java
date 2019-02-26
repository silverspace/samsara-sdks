/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Asset 
        implements java.io.Serializable {
    private static final long serialVersionUID = -4604192848097518857L;
    private String assetSerialNumber;
    private List<Cable> cable;
    private Integer engineHours;
    private long id;
    private String name;
    /** GETTER
     * Serial number of the host asset
     */
    @JsonGetter("assetSerialNumber")
    public String getAssetSerialNumber ( ) { 
        return this.assetSerialNumber;
    }
    
    /** SETTER
     * Serial number of the host asset
     */
    @JsonSetter("assetSerialNumber")
    public void setAssetSerialNumber (String value) { 
        this.assetSerialNumber = value;
    }
 
    /** GETTER
     * The cable connected to the asset
     */
    @JsonGetter("cable")
    public List<Cable> getCable ( ) { 
        return this.cable;
    }
    
    /** SETTER
     * The cable connected to the asset
     */
    @JsonSetter("cable")
    public void setCable (List<Cable> value) { 
        this.cable = value;
    }
 
    /** GETTER
     * Engine hours
     */
    @JsonGetter("engineHours")
    public Integer getEngineHours ( ) { 
        return this.engineHours;
    }
    
    /** SETTER
     * Engine hours
     */
    @JsonSetter("engineHours")
    public void setEngineHours (Integer value) { 
        this.engineHours = value;
    }
 
    /** GETTER
     * Asset ID
     */
    @JsonGetter("id")
    public long getId ( ) { 
        return this.id;
    }
    
    /** SETTER
     * Asset ID
     */
    @JsonSetter("id")
    public void setId (long value) { 
        this.id = value;
    }
 
    /** GETTER
     * Asset name
     */
    @JsonGetter("name")
    public String getName ( ) { 
        return this.name;
    }
    
    /** SETTER
     * Asset name
     */
    @JsonSetter("name")
    public void setName (String value) { 
        this.name = value;
    }
 
}

/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CargoResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = -5296081861160292323L;
    private Long groupId;
    private List<Sensor5> sensors;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("groupId")
    public Long getGroupId ( ) { 
        return this.groupId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("groupId")
    public void setGroupId (Long value) { 
        this.groupId = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("sensors")
    public List<Sensor5> getSensors ( ) { 
        return this.sensors;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("sensors")
    public void setSensors (List<Sensor5> value) { 
        this.sensors = value;
    }
 
}

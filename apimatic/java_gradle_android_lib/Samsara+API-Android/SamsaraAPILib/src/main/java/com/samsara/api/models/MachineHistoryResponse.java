/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class MachineHistoryResponse 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 99075899627772455L;
    private List<Machine1> machines;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("machines")
    public List<Machine1> getMachines ( ) { 
        return this.machines;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("machines")
    public void setMachines (List<Machine1> value) { 
        this.machines = value;
        notifyObservers(this.machines);
    }
 
}

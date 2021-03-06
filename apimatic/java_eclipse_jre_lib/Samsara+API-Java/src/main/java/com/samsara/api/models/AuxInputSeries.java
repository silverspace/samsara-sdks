/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class AuxInputSeries 
        implements java.io.Serializable {
    private static final long serialVersionUID = -8691976813635346813L;
    private NameEnum name;
    private List<AuxInput> values;
    /** GETTER
     * The name of the aux input.
     */
    @JsonGetter("name")
    public NameEnum getName ( ) { 
        return this.name;
    }
    
    /** SETTER
     * The name of the aux input.
     */
    @JsonSetter("name")
    public void setName (NameEnum value) { 
        this.name = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("values")
    public List<AuxInput> getValues ( ) { 
        return this.values;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("values")
    public void setValues (List<AuxInput> value) { 
        this.values = value;
    }
 
}

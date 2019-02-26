/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class TaggedAddress 
        implements java.io.Serializable {
    private static final long serialVersionUID = 8630876202225888035L;
    private long id;
    private String name;
    /** GETTER
     * The ID of the address being tagged.
     */
    @JsonGetter("id")
    public long getId ( ) { 
        return this.id;
    }
    
    /** SETTER
     * The ID of the address being tagged.
     */
    @JsonSetter("id")
    public void setId (long value) { 
        this.id = value;
    }
 
    /** GETTER
     * Name of the address being tagged.
     */
    @JsonGetter("name")
    public String getName ( ) { 
        return this.name;
    }
    
    /** SETTER
     * Name of the address being tagged.
     */
    @JsonSetter("name")
    public void setName (String value) { 
        this.name = value;
    }
 
}

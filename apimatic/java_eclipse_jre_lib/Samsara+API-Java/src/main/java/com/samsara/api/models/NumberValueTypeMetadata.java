/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class NumberValueTypeMetadata 
        implements java.io.Serializable {
    private static final long serialVersionUID = -130095841810319316L;
    private Long numDecimalPlaces;
    /** GETTER
     * Number of decimal places that values for this field type can have.
     */
    @JsonGetter("numDecimalPlaces")
    public Long getNumDecimalPlaces ( ) { 
        return this.numDecimalPlaces;
    }
    
    /** SETTER
     * Number of decimal places that values for this field type can have.
     */
    @JsonSetter("numDecimalPlaces")
    public void setNumDecimalPlaces (Long value) { 
        this.numDecimalPlaces = value;
    }
 
}

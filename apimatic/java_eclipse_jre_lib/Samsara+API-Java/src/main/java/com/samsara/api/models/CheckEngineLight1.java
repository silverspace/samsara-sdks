/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CheckEngineLight1 
        implements java.io.Serializable {
    private static final long serialVersionUID = -51198938027010312L;
    private Boolean isOn;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("isOn")
    public Boolean getIsOn ( ) { 
        return this.isOn;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("isOn")
    public void setIsOn (Boolean value) { 
        this.isOn = value;
    }
 
}

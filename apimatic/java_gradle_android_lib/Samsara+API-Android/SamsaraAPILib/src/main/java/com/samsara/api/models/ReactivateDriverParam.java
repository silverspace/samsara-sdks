/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ReactivateDriverParam 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 52873733497351497L;
    private boolean reactivate;
    /** GETTER
     * True indicates that this driver should be reactivated.
     */
    @JsonGetter("reactivate")
    public boolean getReactivate ( ) { 
        return this.reactivate;
    }
    
    /** SETTER
     * True indicates that this driver should be reactivated.
     */
    @JsonSetter("reactivate")
    public void setReactivate (boolean value) { 
        this.reactivate = value;
        notifyObservers(this.reactivate);
    }
 
}
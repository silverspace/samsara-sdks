/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class EngineState 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 229799449981262887L;
    private long timeMs;
    private ValueEnum value;
    /** GETTER
     * Timestamp in Unix epoch milliseconds.
     */
    @JsonGetter("timeMs")
    public long getTimeMs ( ) { 
        return this.timeMs;
    }
    
    /** SETTER
     * Timestamp in Unix epoch milliseconds.
     */
    @JsonSetter("timeMs")
    public void setTimeMs (long value) { 
        this.timeMs = value;
        notifyObservers(this.timeMs);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("value")
    public ValueEnum getValue ( ) { 
        return this.value;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("value")
    public void setValue (ValueEnum value) { 
        this.value = value;
        notifyObservers(this.value);
    }
 
}

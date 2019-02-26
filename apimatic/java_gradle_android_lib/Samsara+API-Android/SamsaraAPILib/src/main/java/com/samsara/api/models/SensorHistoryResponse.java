/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class SensorHistoryResponse 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 25754989906234600L;
    private List<Result> results;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("results")
    public List<Result> getResults ( ) { 
        return this.results;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("results")
    public void setResults (List<Result> value) { 
        this.results = value;
        notifyObservers(this.results);
    }
 
}

/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class DataInputHistoryResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 3141960236810400079L;
    private Long id;
    private String name;
    private List<Point> points;
    /** GETTER
     * The ID of this data input
     */
    @JsonGetter("id")
    public Long getId ( ) { 
        return this.id;
    }
    
    /** SETTER
     * The ID of this data input
     */
    @JsonSetter("id")
    public void setId (Long value) { 
        this.id = value;
    }
 
    /** GETTER
     * Name of this data input
     */
    @JsonGetter("name")
    public String getName ( ) { 
        return this.name;
    }
    
    /** SETTER
     * Name of this data input
     */
    @JsonSetter("name")
    public void setName (String value) { 
        this.name = value;
    }
 
    /** GETTER
     * Data points from this data input
     */
    @JsonGetter("points")
    public List<Point> getPoints ( ) { 
        return this.points;
    }
    
    /** SETTER
     * Data points from this data input
     */
    @JsonSetter("points")
    public void setPoints (List<Point> value) { 
        this.points = value;
    }
 
}

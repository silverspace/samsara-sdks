/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Polygon 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = -62077678612077246L;
    private List<Vertex> vertices;
    /** GETTER
     * The vertices of the polygon geofence. These geofence vertices describe the perimeter of the polygon, and must consist of at least 3 vertices and less than 40.
     */
    @JsonGetter("vertices")
    public List<Vertex> getVertices ( ) { 
        return this.vertices;
    }
    
    /** SETTER
     * The vertices of the polygon geofence. These geofence vertices describe the perimeter of the polygon, and must consist of at least 3 vertices and less than 40.
     */
    @JsonSetter("vertices")
    public void setVertices (List<Vertex> value) { 
        this.vertices = value;
        notifyObservers(this.vertices);
    }
 
}

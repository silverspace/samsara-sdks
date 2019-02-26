/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class AddressGeofence 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 4077927611043744453L;
    private Circle circle;
    private Polygon polygon;
    /** GETTER
     * Information about a circular geofence. This field is only populated if the geofence is a circle.
     */
    @JsonGetter("circle")
    public Circle getCircle ( ) { 
        return this.circle;
    }
    
    /** SETTER
     * Information about a circular geofence. This field is only populated if the geofence is a circle.
     */
    @JsonSetter("circle")
    public void setCircle (Circle value) { 
        this.circle = value;
        notifyObservers(this.circle);
    }
 
    /** GETTER
     * Information about a polygon geofence. This field is only populated if the geofence is a polygon.
     */
    @JsonGetter("polygon")
    public Polygon getPolygon ( ) { 
        return this.polygon;
    }
    
    /** SETTER
     * Information about a polygon geofence. This field is only populated if the geofence is a polygon.
     */
    @JsonSetter("polygon")
    public void setPolygon (Polygon value) { 
        this.polygon = value;
        notifyObservers(this.polygon);
    }
 
}

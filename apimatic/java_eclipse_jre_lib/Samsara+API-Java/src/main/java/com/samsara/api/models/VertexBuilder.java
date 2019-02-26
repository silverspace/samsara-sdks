/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;

public class VertexBuilder {
    //the instance to build
    private Vertex vertex;

    /**
     * Default constructor to initialize the instance
     */
    public VertexBuilder() {
        vertex = new Vertex();
    }

    /**
     * The longitude of a geofence vertex
     */
    public VertexBuilder latitude(Double latitude) {
        vertex.setLatitude(latitude);
        return this;
    }

    /**
     * The longitude of a geofence vertex
     */
    public VertexBuilder longitude(Double longitude) {
        vertex.setLongitude(longitude);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Vertex build() {
        return vertex;
    }
}
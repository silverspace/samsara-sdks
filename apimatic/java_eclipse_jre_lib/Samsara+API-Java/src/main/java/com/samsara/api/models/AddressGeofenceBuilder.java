/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;

public class AddressGeofenceBuilder {
    //the instance to build
    private AddressGeofence addressGeofence;

    /**
     * Default constructor to initialize the instance
     */
    public AddressGeofenceBuilder() {
        addressGeofence = new AddressGeofence();
    }

    /**
     * Information about a circular geofence. This field is only populated if the geofence is a circle.
     */
    public AddressGeofenceBuilder circle(Circle circle) {
        addressGeofence.setCircle(circle);
        return this;
    }

    /**
     * Information about a polygon geofence. This field is only populated if the geofence is a polygon.
     */
    public AddressGeofenceBuilder polygon(Polygon polygon) {
        addressGeofence.setPolygon(polygon);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public AddressGeofence build() {
        return addressGeofence;
    }
}
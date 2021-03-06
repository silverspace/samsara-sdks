/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;

public class Addresses1Builder {
    //the instance to build
    private Addresses1 addresses1;

    /**
     * Default constructor to initialize the instance
     */
    public Addresses1Builder() {
        addresses1 = new Addresses1();
    }

    /**
     * A list of IDs for contact book entries.
     */
    public Addresses1Builder contactIds(List<Long> contactIds) {
        addresses1.setContactIds(contactIds);
        return this;
    }

    /**
     * The full address associated with this address/geofence, as it might be recognized by maps.google.com
     */
    public Addresses1Builder formattedAddress(String formattedAddress) {
        addresses1.setFormattedAddress(formattedAddress);
        return this;
    }

    /**
     * The geofence that defines this address and its bounds. This can either be a circle, or a polygon - only one key should be provided, depending on the geofence type.
     */
    public Addresses1Builder geofence(AddressGeofence geofence) {
        addresses1.setGeofence(geofence);
        return this;
    }

    /**
     * The name of this address/geofence
     */
    public Addresses1Builder name(String name) {
        addresses1.setName(name);
        return this;
    }

    /**
     * Notes associated with an address.
     */
    public Addresses1Builder notes(String notes) {
        addresses1.setNotes(notes);
        return this;
    }

    /**
     * A list of tag IDs.
     */
    public Addresses1Builder tagIds(List<Long> tagIds) {
        addresses1.setTagIds(tagIds);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Addresses1 build() {
        return addresses1;
    }
}
/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Addresses1 
        implements java.io.Serializable {
    private static final long serialVersionUID = -687505240609138945L;
    private List<Long> contactIds;
    private String formattedAddress;
    private AddressGeofence geofence;
    private String name;
    private String notes;
    private List<Long> tagIds;
    /** GETTER
     * A list of IDs for contact book entries.
     */
    @JsonGetter("contactIds")
    public List<Long> getContactIds ( ) { 
        return this.contactIds;
    }
    
    /** SETTER
     * A list of IDs for contact book entries.
     */
    @JsonSetter("contactIds")
    public void setContactIds (List<Long> value) { 
        this.contactIds = value;
    }
 
    /** GETTER
     * The full address associated with this address/geofence, as it might be recognized by maps.google.com
     */
    @JsonGetter("formattedAddress")
    public String getFormattedAddress ( ) { 
        return this.formattedAddress;
    }
    
    /** SETTER
     * The full address associated with this address/geofence, as it might be recognized by maps.google.com
     */
    @JsonSetter("formattedAddress")
    public void setFormattedAddress (String value) { 
        this.formattedAddress = value;
    }
 
    /** GETTER
     * The geofence that defines this address and its bounds. This can either be a circle, or a polygon - only one key should be provided, depending on the geofence type.
     */
    @JsonGetter("geofence")
    public AddressGeofence getGeofence ( ) { 
        return this.geofence;
    }
    
    /** SETTER
     * The geofence that defines this address and its bounds. This can either be a circle, or a polygon - only one key should be provided, depending on the geofence type.
     */
    @JsonSetter("geofence")
    public void setGeofence (AddressGeofence value) { 
        this.geofence = value;
    }
 
    /** GETTER
     * The name of this address/geofence
     */
    @JsonGetter("name")
    public String getName ( ) { 
        return this.name;
    }
    
    /** SETTER
     * The name of this address/geofence
     */
    @JsonSetter("name")
    public void setName (String value) { 
        this.name = value;
    }
 
    /** GETTER
     * Notes associated with an address.
     */
    @JsonGetter("notes")
    public String getNotes ( ) { 
        return this.notes;
    }
    
    /** SETTER
     * Notes associated with an address.
     */
    @JsonSetter("notes")
    public void setNotes (String value) { 
        this.notes = value;
    }
 
    /** GETTER
     * A list of tag IDs.
     */
    @JsonGetter("tagIds")
    public List<Long> getTagIds ( ) { 
        return this.tagIds;
    }
    
    /** SETTER
     * A list of tag IDs.
     */
    @JsonSetter("tagIds")
    public void setTagIds (List<Long> value) { 
        this.tagIds = value;
    }
 
}

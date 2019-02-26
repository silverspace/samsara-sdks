/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class DispatchJobCreate 
        implements java.io.Serializable {
    private static final long serialVersionUID = 6666203191810238491L;
    private String destinationAddress;
    private Long destinationAddressId;
    private Double destinationLat;
    private Double destinationLng;
    private String destinationName;
    private String notes;
    private long scheduledArrivalTimeMs;
    private Long scheduledDepartureTimeMs;
    /** GETTER
     * The address of the job destination, as it would be recognized if provided to maps.google.com. Optional if a valid destination address ID is provided.
     */
    @JsonGetter("destination_address")
    public String getDestinationAddress ( ) { 
        return this.destinationAddress;
    }
    
    /** SETTER
     * The address of the job destination, as it would be recognized if provided to maps.google.com. Optional if a valid destination address ID is provided.
     */
    @JsonSetter("destination_address")
    public void setDestinationAddress (String value) { 
        this.destinationAddress = value;
    }
 
    /** GETTER
     * ID of the job destination associated with an address book entry. Optional if valid values are provided for destination address or latitude/longitude. If a valid destination address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the destination name is not provided.
     */
    @JsonGetter("destination_address_id")
    public Long getDestinationAddressId ( ) { 
        return this.destinationAddressId;
    }
    
    /** SETTER
     * ID of the job destination associated with an address book entry. Optional if valid values are provided for destination address or latitude/longitude. If a valid destination address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the destination name is not provided.
     */
    @JsonSetter("destination_address_id")
    public void setDestinationAddressId (Long value) { 
        this.destinationAddressId = value;
    }
 
    /** GETTER
     * Latitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.
     */
    @JsonGetter("destination_lat")
    public Double getDestinationLat ( ) { 
        return this.destinationLat;
    }
    
    /** SETTER
     * Latitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.
     */
    @JsonSetter("destination_lat")
    public void setDestinationLat (Double value) { 
        this.destinationLat = value;
    }
 
    /** GETTER
     * Longitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.
     */
    @JsonGetter("destination_lng")
    public Double getDestinationLng ( ) { 
        return this.destinationLng;
    }
    
    /** SETTER
     * Longitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.
     */
    @JsonSetter("destination_lng")
    public void setDestinationLng (Double value) { 
        this.destinationLng = value;
    }
 
    /** GETTER
     * The name of the job destination. If provided, it will take precedence over the name of the address book entry.
     */
    @JsonGetter("destination_name")
    public String getDestinationName ( ) { 
        return this.destinationName;
    }
    
    /** SETTER
     * The name of the job destination. If provided, it will take precedence over the name of the address book entry.
     */
    @JsonSetter("destination_name")
    public void setDestinationName (String value) { 
        this.destinationName = value;
    }
 
    /** GETTER
     * Notes regarding the details of this job.
     */
    @JsonGetter("notes")
    public String getNotes ( ) { 
        return this.notes;
    }
    
    /** SETTER
     * Notes regarding the details of this job.
     */
    @JsonSetter("notes")
    public void setNotes (String value) { 
        this.notes = value;
    }
 
    /** GETTER
     * The time at which the assigned driver is scheduled to arrive at the job destination.
     */
    @JsonGetter("scheduled_arrival_time_ms")
    public long getScheduledArrivalTimeMs ( ) { 
        return this.scheduledArrivalTimeMs;
    }
    
    /** SETTER
     * The time at which the assigned driver is scheduled to arrive at the job destination.
     */
    @JsonSetter("scheduled_arrival_time_ms")
    public void setScheduledArrivalTimeMs (long value) { 
        this.scheduledArrivalTimeMs = value;
    }
 
    /** GETTER
     * The time at which the assigned driver is scheduled to depart from the job destination.
     */
    @JsonGetter("scheduled_departure_time_ms")
    public Long getScheduledDepartureTimeMs ( ) { 
        return this.scheduledDepartureTimeMs;
    }
    
    /** SETTER
     * The time at which the assigned driver is scheduled to depart from the job destination.
     */
    @JsonSetter("scheduled_departure_time_ms")
    public void setScheduledDepartureTimeMs (Long value) { 
        this.scheduledDepartureTimeMs = value;
    }
 
}
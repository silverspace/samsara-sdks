/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class DispatchJob 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 3813145855368433248L;
    private Long arrivedAtMs;
    private Long completedAtMs;
    private long dispatchRouteId;
    private Long driverId;
    private Long enRouteAtMs;
    private Long estimatedArrivalMs;
    private String fleetViewerUrl;
    private long groupId;
    private long id;
    private JobStatusEnum jobState;
    private Long skippedAtMs;
    private Long vehicleId;
    private String destinationAddress;
    private Long destinationAddressId;
    private Double destinationLat;
    private Double destinationLng;
    private String destinationName;
    private String notes;
    private long scheduledArrivalTimeMs;
    private Long scheduledDepartureTimeMs;
    /** GETTER
     * The time at which the driver arrived at the job destination.
     */
    @JsonGetter("arrived_at_ms")
    public Long getArrivedAtMs ( ) { 
        return this.arrivedAtMs;
    }
    
    /** SETTER
     * The time at which the driver arrived at the job destination.
     */
    @JsonSetter("arrived_at_ms")
    public void setArrivedAtMs (Long value) { 
        this.arrivedAtMs = value;
        notifyObservers(this.arrivedAtMs);
    }
 
    /** GETTER
     * The time at which the job was marked complete (e.g. started driving to the next destination).
     */
    @JsonGetter("completed_at_ms")
    public Long getCompletedAtMs ( ) { 
        return this.completedAtMs;
    }
    
    /** SETTER
     * The time at which the job was marked complete (e.g. started driving to the next destination).
     */
    @JsonSetter("completed_at_ms")
    public void setCompletedAtMs (Long value) { 
        this.completedAtMs = value;
        notifyObservers(this.completedAtMs);
    }
 
    /** GETTER
     * ID of the route that this job belongs to.
     */
    @JsonGetter("dispatch_route_id")
    public long getDispatchRouteId ( ) { 
        return this.dispatchRouteId;
    }
    
    /** SETTER
     * ID of the route that this job belongs to.
     */
    @JsonSetter("dispatch_route_id")
    public void setDispatchRouteId (long value) { 
        this.dispatchRouteId = value;
        notifyObservers(this.dispatchRouteId);
    }
 
    /** GETTER
     * ID of the driver assigned to the dispatch job.
     */
    @JsonGetter("driver_id")
    public Long getDriverId ( ) { 
        return this.driverId;
    }
    
    /** SETTER
     * ID of the driver assigned to the dispatch job.
     */
    @JsonSetter("driver_id")
    public void setDriverId (Long value) { 
        this.driverId = value;
        notifyObservers(this.driverId);
    }
 
    /** GETTER
     * The time at which the assigned driver started fulfilling the job (e.g. started driving to the destination).
     */
    @JsonGetter("en_route_at_ms")
    public Long getEnRouteAtMs ( ) { 
        return this.enRouteAtMs;
    }
    
    /** SETTER
     * The time at which the assigned driver started fulfilling the job (e.g. started driving to the destination).
     */
    @JsonSetter("en_route_at_ms")
    public void setEnRouteAtMs (Long value) { 
        this.enRouteAtMs = value;
        notifyObservers(this.enRouteAtMs);
    }
 
    /** GETTER
     * The time at which the assigned driver is estimated to arrive at the job destination. Only valid for en-route jobs.
     */
    @JsonGetter("estimated_arrival_ms")
    public Long getEstimatedArrivalMs ( ) { 
        return this.estimatedArrivalMs;
    }
    
    /** SETTER
     * The time at which the assigned driver is estimated to arrive at the job destination. Only valid for en-route jobs.
     */
    @JsonSetter("estimated_arrival_ms")
    public void setEstimatedArrivalMs (Long value) { 
        this.estimatedArrivalMs = value;
        notifyObservers(this.estimatedArrivalMs);
    }
 
    /** GETTER
     * Fleet viewer url of the dispatch job.
     */
    @JsonGetter("fleet_viewer_url")
    public String getFleetViewerUrl ( ) { 
        return this.fleetViewerUrl;
    }
    
    /** SETTER
     * Fleet viewer url of the dispatch job.
     */
    @JsonSetter("fleet_viewer_url")
    public void setFleetViewerUrl (String value) { 
        this.fleetViewerUrl = value;
        notifyObservers(this.fleetViewerUrl);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("group_id")
    public long getGroupId ( ) { 
        return this.groupId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("group_id")
    public void setGroupId (long value) { 
        this.groupId = value;
        notifyObservers(this.groupId);
    }
 
    /** GETTER
     * ID of the Samsara dispatch job.
     */
    @JsonGetter("id")
    public long getId ( ) { 
        return this.id;
    }
    
    /** SETTER
     * ID of the Samsara dispatch job.
     */
    @JsonSetter("id")
    public void setId (long value) { 
        this.id = value;
        notifyObservers(this.id);
    }
 
    /** GETTER
     * The current state of the dispatch job.
     */
    @JsonGetter("job_state")
    public JobStatusEnum getJobState ( ) { 
        return this.jobState;
    }
    
    /** SETTER
     * The current state of the dispatch job.
     */
    @JsonSetter("job_state")
    public void setJobState (JobStatusEnum value) { 
        this.jobState = value;
        notifyObservers(this.jobState);
    }
 
    /** GETTER
     * The time at which the job was marked skipped.
     */
    @JsonGetter("skipped_at_ms")
    public Long getSkippedAtMs ( ) { 
        return this.skippedAtMs;
    }
    
    /** SETTER
     * The time at which the job was marked skipped.
     */
    @JsonSetter("skipped_at_ms")
    public void setSkippedAtMs (Long value) { 
        this.skippedAtMs = value;
        notifyObservers(this.skippedAtMs);
    }
 
    /** GETTER
     * ID of the vehicle used for the dispatch job.
     */
    @JsonGetter("vehicle_id")
    public Long getVehicleId ( ) { 
        return this.vehicleId;
    }
    
    /** SETTER
     * ID of the vehicle used for the dispatch job.
     */
    @JsonSetter("vehicle_id")
    public void setVehicleId (Long value) { 
        this.vehicleId = value;
        notifyObservers(this.vehicleId);
    }
 
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
        notifyObservers(this.destinationAddress);
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
        notifyObservers(this.destinationAddressId);
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
        notifyObservers(this.destinationLat);
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
        notifyObservers(this.destinationLng);
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
        notifyObservers(this.destinationName);
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
        notifyObservers(this.notes);
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
        notifyObservers(this.scheduledArrivalTimeMs);
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
        notifyObservers(this.scheduledDepartureTimeMs);
    }
 
}
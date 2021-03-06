/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class DispatchRouteBase 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 3305208118563621153L;
    private Long actualEndMs;
    private Long actualStartMs;
    private Long driverId;
    private Long groupId;
    private String name;
    private long scheduledEndMs;
    private Long scheduledMeters;
    private long scheduledStartMs;
    private String startLocationAddress;
    private Long startLocationAddressId;
    private Double startLocationLat;
    private Double startLocationLng;
    private String startLocationName;
    private Long trailerId;
    private Long vehicleId;
    /** GETTER
     * The time in Unix epoch milliseconds that the route actually ended.
     */
    @JsonGetter("actual_end_ms")
    public Long getActualEndMs ( ) { 
        return this.actualEndMs;
    }
    
    /** SETTER
     * The time in Unix epoch milliseconds that the route actually ended.
     */
    @JsonSetter("actual_end_ms")
    public void setActualEndMs (Long value) { 
        this.actualEndMs = value;
        notifyObservers(this.actualEndMs);
    }
 
    /** GETTER
     * The time in Unix epoch milliseconds that the route actually started.
     */
    @JsonGetter("actual_start_ms")
    public Long getActualStartMs ( ) { 
        return this.actualStartMs;
    }
    
    /** SETTER
     * The time in Unix epoch milliseconds that the route actually started.
     */
    @JsonSetter("actual_start_ms")
    public void setActualStartMs (Long value) { 
        this.actualStartMs = value;
        notifyObservers(this.actualStartMs);
    }
 
    /** GETTER
     * ID of the driver assigned to the dispatch route. Note that driver_id and vehicle_id are mutually exclusive. If neither is specified, then the route is unassigned.
     */
    @JsonGetter("driver_id")
    public Long getDriverId ( ) { 
        return this.driverId;
    }
    
    /** SETTER
     * ID of the driver assigned to the dispatch route. Note that driver_id and vehicle_id are mutually exclusive. If neither is specified, then the route is unassigned.
     */
    @JsonSetter("driver_id")
    public void setDriverId (Long value) { 
        this.driverId = value;
        notifyObservers(this.driverId);
    }
 
    /** GETTER
     * ID of the group if the organization has multiple groups (optional).
     */
    @JsonGetter("group_id")
    public Long getGroupId ( ) { 
        return this.groupId;
    }
    
    /** SETTER
     * ID of the group if the organization has multiple groups (optional).
     */
    @JsonSetter("group_id")
    public void setGroupId (Long value) { 
        this.groupId = value;
        notifyObservers(this.groupId);
    }
 
    /** GETTER
     * Descriptive name of this route.
     */
    @JsonGetter("name")
    public String getName ( ) { 
        return this.name;
    }
    
    /** SETTER
     * Descriptive name of this route.
     */
    @JsonSetter("name")
    public void setName (String value) { 
        this.name = value;
        notifyObservers(this.name);
    }
 
    /** GETTER
     * The time in Unix epoch milliseconds that the last job in the route is scheduled to end.
     */
    @JsonGetter("scheduled_end_ms")
    public long getScheduledEndMs ( ) { 
        return this.scheduledEndMs;
    }
    
    /** SETTER
     * The time in Unix epoch milliseconds that the last job in the route is scheduled to end.
     */
    @JsonSetter("scheduled_end_ms")
    public void setScheduledEndMs (long value) { 
        this.scheduledEndMs = value;
        notifyObservers(this.scheduledEndMs);
    }
 
    /** GETTER
     * The distance expected to be traveled for this route in meters.
     */
    @JsonGetter("scheduled_meters")
    public Long getScheduledMeters ( ) { 
        return this.scheduledMeters;
    }
    
    /** SETTER
     * The distance expected to be traveled for this route in meters.
     */
    @JsonSetter("scheduled_meters")
    public void setScheduledMeters (Long value) { 
        this.scheduledMeters = value;
        notifyObservers(this.scheduledMeters);
    }
 
    /** GETTER
     * The time in Unix epoch milliseconds that the route is scheduled to start.
     */
    @JsonGetter("scheduled_start_ms")
    public long getScheduledStartMs ( ) { 
        return this.scheduledStartMs;
    }
    
    /** SETTER
     * The time in Unix epoch milliseconds that the route is scheduled to start.
     */
    @JsonSetter("scheduled_start_ms")
    public void setScheduledStartMs (long value) { 
        this.scheduledStartMs = value;
        notifyObservers(this.scheduledStartMs);
    }
 
    /** GETTER
     * The address of the route's starting location, as it would be recognized if provided to maps.google.com. Optional if a valid start location address ID is provided.
     */
    @JsonGetter("start_location_address")
    public String getStartLocationAddress ( ) { 
        return this.startLocationAddress;
    }
    
    /** SETTER
     * The address of the route's starting location, as it would be recognized if provided to maps.google.com. Optional if a valid start location address ID is provided.
     */
    @JsonSetter("start_location_address")
    public void setStartLocationAddress (String value) { 
        this.startLocationAddress = value;
        notifyObservers(this.startLocationAddress);
    }
 
    /** GETTER
     * ID of the start location associated with an address book entry. Optional if valid values are provided for start location address or latitude/longitude. If a valid start location address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the start location name is not provided.
     */
    @JsonGetter("start_location_address_id")
    public Long getStartLocationAddressId ( ) { 
        return this.startLocationAddressId;
    }
    
    /** SETTER
     * ID of the start location associated with an address book entry. Optional if valid values are provided for start location address or latitude/longitude. If a valid start location address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the start location name is not provided.
     */
    @JsonSetter("start_location_address_id")
    public void setStartLocationAddressId (Long value) { 
        this.startLocationAddressId = value;
        notifyObservers(this.startLocationAddressId);
    }
 
    /** GETTER
     * Latitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.
     */
    @JsonGetter("start_location_lat")
    public Double getStartLocationLat ( ) { 
        return this.startLocationLat;
    }
    
    /** SETTER
     * Latitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.
     */
    @JsonSetter("start_location_lat")
    public void setStartLocationLat (Double value) { 
        this.startLocationLat = value;
        notifyObservers(this.startLocationLat);
    }
 
    /** GETTER
     * Longitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.
     */
    @JsonGetter("start_location_lng")
    public Double getStartLocationLng ( ) { 
        return this.startLocationLng;
    }
    
    /** SETTER
     * Longitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.
     */
    @JsonSetter("start_location_lng")
    public void setStartLocationLng (Double value) { 
        this.startLocationLng = value;
        notifyObservers(this.startLocationLng);
    }
 
    /** GETTER
     * The name of the route's starting location. If provided, it will take precedence over the name of the address book entry.
     */
    @JsonGetter("start_location_name")
    public String getStartLocationName ( ) { 
        return this.startLocationName;
    }
    
    /** SETTER
     * The name of the route's starting location. If provided, it will take precedence over the name of the address book entry.
     */
    @JsonSetter("start_location_name")
    public void setStartLocationName (String value) { 
        this.startLocationName = value;
        notifyObservers(this.startLocationName);
    }
 
    /** GETTER
     * ID of the trailer assigned to the dispatch route. Note that trailers can only be assigned to routes that have a Vehicle or Driver assigned to them.
     */
    @JsonGetter("trailer_id")
    public Long getTrailerId ( ) { 
        return this.trailerId;
    }
    
    /** SETTER
     * ID of the trailer assigned to the dispatch route. Note that trailers can only be assigned to routes that have a Vehicle or Driver assigned to them.
     */
    @JsonSetter("trailer_id")
    public void setTrailerId (Long value) { 
        this.trailerId = value;
        notifyObservers(this.trailerId);
    }
 
    /** GETTER
     * ID of the vehicle assigned to the dispatch route. Note that vehicle_id and driver_id are mutually exclusive. If neither is specified, then the route is unassigned.
     */
    @JsonGetter("vehicle_id")
    public Long getVehicleId ( ) { 
        return this.vehicleId;
    }
    
    /** SETTER
     * ID of the vehicle assigned to the dispatch route. Note that vehicle_id and driver_id are mutually exclusive. If neither is specified, then the route is unassigned.
     */
    @JsonSetter("vehicle_id")
    public void setVehicleId (Long value) { 
        this.vehicleId = value;
        notifyObservers(this.vehicleId);
    }
 
}

package org.openapitools.client.model {


    [XmlRootNode(name="DispatchRouteBase")]
    public class DispatchRouteBase {
        /* The time in Unix epoch milliseconds that the route actually ended. */
        [XmlElement(name="actual_end_ms")]
        public var actualEndMs: Number = 0;
        /* The time in Unix epoch milliseconds that the route actually started. */
        [XmlElement(name="actual_start_ms")]
        public var actualStartMs: Number = 0;
        /* ID of the driver assigned to the dispatch route. Note that driver_id and vehicle_id are mutually exclusive. If neither is specified, then the route is unassigned. */
        [XmlElement(name="driver_id")]
        public var driverId: Number = 0;
        /* ID of the group if the organization has multiple groups (optional). */
        [XmlElement(name="group_id")]
        public var groupId: Number = 0;
        /* Descriptive name of this route. */
        [XmlElement(name="name")]
        public var name: String = null;
        /* The time in Unix epoch milliseconds that the last job in the route is scheduled to end. */
        [XmlElement(name="scheduled_end_ms")]
        public var scheduledEndMs: Number = 0;
        /* The distance expected to be traveled for this route in meters. */
        [XmlElement(name="scheduled_meters")]
        public var scheduledMeters: Number = 0;
        /* The time in Unix epoch milliseconds that the route is scheduled to start. */
        [XmlElement(name="scheduled_start_ms")]
        public var scheduledStartMs: Number = 0;
        /* The address of the route&#39;s starting location, as it would be recognized if provided to maps.google.com. Optional if a valid start location address ID is provided. */
        [XmlElement(name="start_location_address")]
        public var startLocationAddress: String = null;
        /* ID of the start location associated with an address book entry. Optional if valid values are provided for start location address or latitude/longitude. If a valid start location address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the start location name is not provided. */
        [XmlElement(name="start_location_address_id")]
        public var startLocationAddressId: Number = 0;
        /* Latitude of the start location in decimal degrees. Optional if a valid start location address ID is provided. */
        [XmlElement(name="start_location_lat")]
        public var startLocationLat: Number = 0.0;
        /* Longitude of the start location in decimal degrees. Optional if a valid start location address ID is provided. */
        [XmlElement(name="start_location_lng")]
        public var startLocationLng: Number = 0.0;
        /* The name of the route&#39;s starting location. If provided, it will take precedence over the name of the address book entry. */
        [XmlElement(name="start_location_name")]
        public var startLocationName: String = null;
        /* ID of the trailer assigned to the dispatch route. Note that trailers can only be assigned to routes that have a Vehicle or Driver assigned to them. */
        [XmlElement(name="trailer_id")]
        public var trailerId: Number = 0;
        /* ID of the vehicle assigned to the dispatch route. Note that vehicle_id and driver_id are mutually exclusive. If neither is specified, then the route is unassigned. */
        [XmlElement(name="vehicle_id")]
        public var vehicleId: Number = 0;

    public function toString(): String {
        var str: String = "DispatchRouteBase: ";
        str += " (actualEndMs: " + actualEndMs + ")";
        str += " (actualStartMs: " + actualStartMs + ")";
        str += " (driverId: " + driverId + ")";
        str += " (groupId: " + groupId + ")";
        str += " (name: " + name + ")";
        str += " (scheduledEndMs: " + scheduledEndMs + ")";
        str += " (scheduledMeters: " + scheduledMeters + ")";
        str += " (scheduledStartMs: " + scheduledStartMs + ")";
        str += " (startLocationAddress: " + startLocationAddress + ")";
        str += " (startLocationAddressId: " + startLocationAddressId + ")";
        str += " (startLocationLat: " + startLocationLat + ")";
        str += " (startLocationLng: " + startLocationLng + ")";
        str += " (startLocationName: " + startLocationName + ")";
        str += " (trailerId: " + trailerId + ")";
        str += " (vehicleId: " + vehicleId + ")";
        return str;
    }

}

}

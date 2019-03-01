package samsara.client.model {

import samsara.client.model.DispatchJobCreate;
import samsara.client.model.JobStatus;

    [XmlRootNode(name="DispatchJob")]
    public class DispatchJob {
        /* The address of the job destination, as it would be recognized if provided to maps.google.com. Optional if a valid destination address ID is provided. */
        [XmlElement(name="destination_address")]
        public var destinationAddress: String = null;
        /* ID of the job destination associated with an address book entry. Optional if valid values are provided for destination address or latitude/longitude. If a valid destination address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the destination name is not provided. */
        [XmlElement(name="destination_address_id")]
        public var destinationAddressId: Number = 0;
        /* Latitude of the destination in decimal degrees. Optional if a valid destination address ID is provided. */
        [XmlElement(name="destination_lat")]
        public var destinationLat: Number = 0.0;
        /* Longitude of the destination in decimal degrees. Optional if a valid destination address ID is provided. */
        [XmlElement(name="destination_lng")]
        public var destinationLng: Number = 0.0;
        /* The name of the job destination. If provided, it will take precedence over the name of the address book entry. */
        [XmlElement(name="destination_name")]
        public var destinationName: String = null;
        /* Notes regarding the details of this job. */
        [XmlElement(name="notes")]
        public var notes: String = null;
        /* The time at which the assigned driver is scheduled to arrive at the job destination. */
        [XmlElement(name="scheduled_arrival_time_ms")]
        public var scheduledArrivalTimeMs: Number = 0;
        /* The time at which the assigned driver is scheduled to depart from the job destination. */
        [XmlElement(name="scheduled_departure_time_ms")]
        public var scheduledDepartureTimeMs: Number = 0;
        /* The time at which the driver arrived at the job destination. */
        [XmlElement(name="arrived_at_ms")]
        public var arrivedAtMs: Number = 0;
        /* The time at which the job was marked complete (e.g. started driving to the next destination). */
        [XmlElement(name="completed_at_ms")]
        public var completedAtMs: Number = 0;
        /* ID of the route that this job belongs to. */
        [XmlElement(name="dispatch_route_id")]
        public var dispatchRouteId: Number = 0;
        /* ID of the driver assigned to the dispatch job. */
        [XmlElement(name="driver_id")]
        public var driverId: Number = 0;
        /* The time at which the assigned driver started fulfilling the job (e.g. started driving to the destination). */
        [XmlElement(name="en_route_at_ms")]
        public var enRouteAtMs: Number = 0;
        /* The time at which the assigned driver is estimated to arrive at the job destination. Only valid for en-route jobs. */
        [XmlElement(name="estimated_arrival_ms")]
        public var estimatedArrivalMs: Number = 0;
        /* Fleet viewer url of the dispatch job. */
        [XmlElement(name="fleet_viewer_url")]
        public var fleetViewerUrl: String = null;
                [XmlElement(name="group_id")]
        public var groupId: Number = 0;
        /* ID of the Samsara dispatch job. */
        [XmlElement(name="id")]
        public var id: Number = 0;
                [XmlElement(name="job_state")]
        public var jobState: JobStatus = NaN;
        /* The time at which the job was marked skipped. */
        [XmlElement(name="skipped_at_ms")]
        public var skippedAtMs: Number = 0;
        /* ID of the vehicle used for the dispatch job. */
        [XmlElement(name="vehicle_id")]
        public var vehicleId: Number = 0;

    public function toString(): String {
        var str: String = "DispatchJob: ";
        str += " (destinationAddress: " + destinationAddress + ")";
        str += " (destinationAddressId: " + destinationAddressId + ")";
        str += " (destinationLat: " + destinationLat + ")";
        str += " (destinationLng: " + destinationLng + ")";
        str += " (destinationName: " + destinationName + ")";
        str += " (notes: " + notes + ")";
        str += " (scheduledArrivalTimeMs: " + scheduledArrivalTimeMs + ")";
        str += " (scheduledDepartureTimeMs: " + scheduledDepartureTimeMs + ")";
        str += " (arrivedAtMs: " + arrivedAtMs + ")";
        str += " (completedAtMs: " + completedAtMs + ")";
        str += " (dispatchRouteId: " + dispatchRouteId + ")";
        str += " (driverId: " + driverId + ")";
        str += " (enRouteAtMs: " + enRouteAtMs + ")";
        str += " (estimatedArrivalMs: " + estimatedArrivalMs + ")";
        str += " (fleetViewerUrl: " + fleetViewerUrl + ")";
        str += " (groupId: " + groupId + ")";
        str += " (id: " + id + ")";
        str += " (jobState: " + jobState + ")";
        str += " (skippedAtMs: " + skippedAtMs + ")";
        str += " (vehicleId: " + vehicleId + ")";
        return str;
    }

}

}

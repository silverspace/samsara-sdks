package org.openapitools.client.model {


    [XmlRootNode(name="DispatchJobCreate")]
    public class DispatchJobCreate {
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

    public function toString(): String {
        var str: String = "DispatchJobCreate: ";
        str += " (destinationAddress: " + destinationAddress + ")";
        str += " (destinationAddressId: " + destinationAddressId + ")";
        str += " (destinationLat: " + destinationLat + ")";
        str += " (destinationLng: " + destinationLng + ")";
        str += " (destinationName: " + destinationName + ")";
        str += " (notes: " + notes + ")";
        str += " (scheduledArrivalTimeMs: " + scheduledArrivalTimeMs + ")";
        str += " (scheduledDepartureTimeMs: " + scheduledDepartureTimeMs + ")";
        return str;
    }

}

}

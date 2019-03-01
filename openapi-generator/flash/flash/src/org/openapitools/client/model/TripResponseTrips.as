package org.openapitools.client.model {

import org.openapitools.client.model.TripResponseEndCoordinates;
import org.openapitools.client.model.TripResponseStartCoordinates;

    [XmlRootNode(name="TripResponseTrips")]
    public class TripResponseTrips {
        /* Odometer reading at the end of the trip. */
        [XmlElement(name="endOdometer")]
        public var endOdometer: Number = 0;
        /* Length of the trip in meters. */
        [XmlElement(name="distanceMeters")]
        public var distanceMeters: Number = 0;
        /* End of the trip in UNIX milliseconds. */
        [XmlElement(name="endMs")]
        public var endMs: Number = 0;
        /* Beginning of the trip in UNIX milliseconds. */
        [XmlElement(name="startMs")]
        public var startMs: Number = 0;
        /* Amount in milliliters of fuel consumed on this trip. */
        [XmlElement(name="fuelConsumedMl")]
        public var fuelConsumedMl: Number = 0;
        /* Text representation of nearest identifiable location to the start (latitude, longitude) coordinates. */
        [XmlElement(name="startAddress")]
        public var startAddress: String = null;
                [XmlElement(name="startCoordinates")]
        public var startCoordinates: TripResponseStartCoordinates = NaN;
                [XmlElement(name="endCoordinates")]
        public var endCoordinates: TripResponseEndCoordinates = NaN;
        /* Odometer reading at the beginning of the trip. */
        [XmlElement(name="startOdometer")]
        public var startOdometer: Number = 0;
        /* ID of the driver. */
        [XmlElement(name="driverId")]
        public var driverId: Number = 0;
        /* Geocoded street address of start (latitude, longitude) coordinates. */
        [XmlElement(name="startLocation")]
        public var startLocation: String = null;
        /* Length in meters trip spent on toll roads. */
        [XmlElement(name="tollMeters")]
        public var tollMeters: Number = 0;
        /* Text representation of nearest identifiable location to the end (latitude, longitude) coordinates. */
        [XmlElement(name="endAddress")]
        public var endAddress: String = null;
        /* Geocoded street address of start (latitude, longitude) coordinates. */
        [XmlElement(name="endLocation")]
        public var endLocation: String = null;

    public function toString(): String {
        var str: String = "TripResponseTrips: ";
        str += " (endOdometer: " + endOdometer + ")";
        str += " (distanceMeters: " + distanceMeters + ")";
        str += " (endMs: " + endMs + ")";
        str += " (startMs: " + startMs + ")";
        str += " (fuelConsumedMl: " + fuelConsumedMl + ")";
        str += " (startAddress: " + startAddress + ")";
        str += " (startCoordinates: " + startCoordinates + ")";
        str += " (endCoordinates: " + endCoordinates + ")";
        str += " (startOdometer: " + startOdometer + ")";
        str += " (driverId: " + driverId + ")";
        str += " (startLocation: " + startLocation + ")";
        str += " (tollMeters: " + tollMeters + ")";
        str += " (endAddress: " + endAddress + ")";
        str += " (endLocation: " + endLocation + ")";
        return str;
    }

}

}
